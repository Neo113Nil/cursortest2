package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.mxq0;
import defpackage.pxq0;
import defpackage.qp41;
import defpackage.x920;
import java.util.Map;

/* loaded from: classes11.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, ea20 ea20Var) {
        super(ea20Var);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        pxq0 a;
        ServiceWorkerManager.init();
        mxq0 mxq0Var = ServiceWorkerManager.serviceWorkerController;
        a = mxq0Var != null ? mxq0Var.a() : null;
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "getAllowContentAccess":
                if (a != null && hm91.d("SERVICE_WORKER_CONTENT_ACCESS")) {
                    qp41.j.getClass();
                    da20Var.success(Boolean.valueOf(a.a().getAllowContentAccess()));
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) x920Var.a("isNull"));
                    da20Var.success(Boolean.TRUE);
                    break;
                }
            case "getCacheMode":
                if (a != null && hm91.d("SERVICE_WORKER_CACHE_MODE")) {
                    qp41.i.getClass();
                    da20Var.success(Integer.valueOf(a.a().getCacheMode()));
                    break;
                } else {
                    da20Var.success(null);
                    break;
                }
            case "getAllowFileAccess":
                if (a != null && hm91.d("SERVICE_WORKER_FILE_ACCESS")) {
                    qp41.k.getClass();
                    da20Var.success(Boolean.valueOf(a.a().getAllowFileAccess()));
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "setCacheMode":
                if (a != null && hm91.d("SERVICE_WORKER_CACHE_MODE")) {
                    int intValue = ((Integer) x920Var.a("mode")).intValue();
                    qp41.i.getClass();
                    a.a().setCacheMode(intValue);
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "setBlockNetworkLoads":
                if (a != null && hm91.d("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    boolean booleanValue = ((Boolean) x920Var.a("flag")).booleanValue();
                    qp41.l.getClass();
                    a.a().setBlockNetworkLoads(booleanValue);
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "setAllowContentAccess":
                if (a != null && hm91.d("SERVICE_WORKER_CONTENT_ACCESS")) {
                    boolean booleanValue2 = ((Boolean) x920Var.a("allow")).booleanValue();
                    qp41.j.getClass();
                    a.a().setAllowContentAccess(booleanValue2);
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "setAllowFileAccess":
                if (a != null && hm91.d("SERVICE_WORKER_FILE_ACCESS")) {
                    boolean booleanValue3 = ((Boolean) x920Var.a("allow")).booleanValue();
                    qp41.k.getClass();
                    a.a().setAllowFileAccess(booleanValue3);
                }
                da20Var.success(Boolean.TRUE);
                break;
            case "getBlockNetworkLoads":
                if (a != null && hm91.d("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    qp41.l.getClass();
                    da20Var.success(Boolean.valueOf(a.a().getBlockNetworkLoads()));
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }
}
