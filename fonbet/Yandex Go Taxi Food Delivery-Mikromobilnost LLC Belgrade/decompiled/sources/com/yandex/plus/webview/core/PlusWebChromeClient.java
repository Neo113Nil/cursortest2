package com.yandex.plus.webview.core;

import android.content.Context;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.j63;
import defpackage.jl40;
import defpackage.qke;
import defpackage.th40;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\b\u0002\u0010\b\u001a\"\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012@\b\u0002\u0010\u000f\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J3\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R4\u0010\b\u001a\"\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"RL\u0010\u000f\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/plus/webview/core/PlusWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "Lzy11;", "getMultipleContents", "Lkotlin/Function2;", "", "", "", "", "Lcom/yandex/plus/webview/core/RequestPermissionsCallback;", "requestPermissions", "<init>", "(Landroid/content/Context;Ltls;Lwls;)V", "toNativePermissionOrNull", "(Ljava/lang/String;)Ljava/lang/String;", "toWebPermissionOrNull", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "Landroid/content/Context;", "Ltls;", "Lwls;", "homeless-core-webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusWebChromeClient extends WebChromeClient {
    private final Context context;
    private final tls getMultipleContents;
    private final wls requestPermissions;

    public /* synthetic */ PlusWebChromeClient(Context context, tls tlsVar, wls wlsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : tlsVar, (i & 4) != 0 ? null : wlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPermissionRequest$lambda$2(PermissionRequest permissionRequest, j63 j63Var, PlusWebChromeClient plusWebChromeClient, Map map) {
        String webPermissionOrNull;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue() && (webPermissionOrNull = plusWebChromeClient.toWebPermissionOrNull(str)) != null) {
                j63Var.add(webPermissionOrNull);
            }
        }
        permissionRequest.grant((String[]) j63Var.toArray(new String[0]));
        return zy11.a;
    }

    private final String toNativePermissionOrNull(String str) {
        if (jl40.l(str, "android.webkit.resource.VIDEO_CAPTURE")) {
            return "android.permission.CAMERA";
        }
        return null;
    }

    private final String toWebPermissionOrNull(String str) {
        if (jl40.l(str, "android.permission.CAMERA")) {
            return "android.webkit.resource.VIDEO_CAPTURE";
        }
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest request) {
        if (request == null) {
            return;
        }
        j63 j63Var = new j63(0);
        j63 j63Var2 = new j63(0);
        for (String str : request.getResources()) {
            String nativePermissionOrNull = toNativePermissionOrNull(str);
            if (nativePermissionOrNull != null) {
                if (qke.h(this.context, nativePermissionOrNull) == 0) {
                    j63Var.add(str);
                } else {
                    j63Var2.add(nativePermissionOrNull);
                }
            }
        }
        wls wlsVar = this.requestPermissions;
        if (wlsVar != null) {
            wlsVar.invoke(j63Var2, new th40(17, request, j63Var, this));
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        tls tlsVar = this.getMultipleContents;
        if (tlsVar == null) {
            return true;
        }
        tlsVar.invoke(new PlusWebChromeClient$onShowFileChooser$1(1, filePathCallback, ValueCallback.class, "onReceiveValue", "onReceiveValue(Ljava/lang/Object;)V", 0));
        return true;
    }

    public PlusWebChromeClient(Context context, tls tlsVar, wls wlsVar) {
        this.context = context;
        this.getMultipleContents = tlsVar;
        this.requestPermissions = wlsVar;
    }
}
