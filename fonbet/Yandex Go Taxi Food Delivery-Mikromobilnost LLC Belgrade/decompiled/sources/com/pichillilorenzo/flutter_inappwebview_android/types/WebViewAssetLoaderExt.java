package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.yandex.div.state.db.StateEntry;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.sa90;
import defpackage.tl41;
import defpackage.ul41;
import defpackage.vl41;
import defpackage.wl41;
import defpackage.xl41;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class WebViewAssetLoaderExt implements Disposable {
    public List<PathHandlerExt> customPathHandlers;
    public xl41 loader;

    public static class PathHandlerExt implements vl41, Disposable {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;
        public String id;

        public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.id = str;
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new ea20(inAppWebViewFlutterPlugin.messenger, g8e.o(METHOD_CHANNEL_NAME_PREFIX, str)));
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                pathHandlerExtChannelDelegate.dispose();
                this.channelDelegate = null;
            }
        }

        @Override // defpackage.vl41
        public WebResourceResponse handle(String str) {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                try {
                    WebResourceResponseExt handle = pathHandlerExtChannelDelegate.handle(str);
                    if (handle != null) {
                        String contentType = handle.getContentType();
                        String contentEncoding = handle.getContentEncoding();
                        byte[] data = handle.getData();
                        Map<String, String> headers = handle.getHeaders();
                        Integer statusCode = handle.getStatusCode();
                        String reasonPhrase = handle.getReasonPhrase();
                        ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                        return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                    }
                } catch (InterruptedException e) {
                    Log.e(LOG_TAG, "", e);
                }
            }
            return null;
        }
    }

    public WebViewAssetLoaderExt(xl41 xl41Var, List<PathHandlerExt> list) {
        this.loader = xl41Var;
        this.customPathHandlers = list;
    }

    public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
        if (map == null) {
            return null;
        }
        ul41 ul41Var = new ul41();
        String str = (String) map.get("domain");
        Boolean bool = (Boolean) map.get("httpAllowed");
        List<Map> list = (List) map.get("pathHandlers");
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            ul41Var.b = str;
        }
        if (bool != null) {
            ul41Var.a = bool.booleanValue();
        }
        if (list != null) {
            for (Map map2 : list) {
                String str2 = (String) map2.get("type");
                String str3 = (String) map2.get(StateEntry.COLUMN_PATH);
                if (str2 != null && str3 != null) {
                    switch (str2) {
                        case "ResourcesPathHandler":
                            ul41Var.a(str3, new tl41(context, 1));
                            break;
                        case "AssetsPathHandler":
                            ul41Var.a(str3, new tl41(context, 0));
                            break;
                        case "InternalStoragePathHandler":
                            String str4 = (String) map2.get("directory");
                            if (str4 == null) {
                                break;
                            } else {
                                ul41Var.a(str3, new tl41(context, new File(str4)));
                                break;
                            }
                        default:
                            String str5 = (String) map2.get("id");
                            if (str5 == null) {
                                break;
                            } else {
                                PathHandlerExt pathHandlerExt = new PathHandlerExt(str5, inAppWebViewFlutterPlugin);
                                ul41Var.a(str3, pathHandlerExt);
                                arrayList.add(pathHandlerExt);
                                break;
                            }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ul41Var.c.iterator();
        while (it.hasNext()) {
            sa90 sa90Var = (sa90) it.next();
            arrayList2.add(new wl41(ul41Var.b, (String) sa90Var.a, ul41Var.a, (vl41) sa90Var.b));
        }
        return new WebViewAssetLoaderExt(new xl41(arrayList2), arrayList);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        Iterator<PathHandlerExt> it = this.customPathHandlers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.customPathHandlers.clear();
    }

    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
        private PathHandlerExt pathHandler;

        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return WebResourceResponseExt.fromMap((Map) obj);
            }
        }

        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public WebResourceResponseExt decodeResult(Object obj) {
                return new HandleCallback().decodeResult(obj);
            }
        }

        public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, ea20 ea20Var) {
            super(ea20Var);
            this.pathHandler = pathHandlerExt;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }

        public WebResourceResponseExt handle(String str) {
            ea20 channel = getChannel();
            if (channel == null) {
                return null;
            }
            SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            HashMap hashMap = new HashMap();
            hashMap.put(StateEntry.COLUMN_PATH, str);
            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", hashMap, syncHandleCallback);
        }

        public void handle(String str, HandleCallback handleCallback) {
            ea20 channel = getChannel();
            if (channel == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(StateEntry.COLUMN_PATH, str);
            channel.a("handle", hashMap, handleCallback);
        }
    }
}
