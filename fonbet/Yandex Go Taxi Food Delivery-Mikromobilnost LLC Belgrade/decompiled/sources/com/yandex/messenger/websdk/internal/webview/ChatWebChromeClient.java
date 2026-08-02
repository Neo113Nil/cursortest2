package com.yandex.messenger.websdk.internal.webview;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.yandex.messenger.websdk.api.ShowFileChooserDelegate;
import defpackage.an8;
import defpackage.dj41;
import defpackage.ej41;
import defpackage.hc3;
import defpackage.heb;
import defpackage.ieb;
import defpackage.j73;
import defpackage.k791;
import defpackage.o3;
import defpackage.p1b;
import defpackage.qke;
import defpackage.rya0;
import defpackage.tcc;
import defpackage.tls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/messenger/websdk/internal/webview/ChatWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Lieb;", "controller", "<init>", "(Lieb;)V", "Lhc3;", "attached", "", "hasVoiceCaptureAndroidPermissions", "(Lhc3;)Z", "Landroid/webkit/PermissionRequest;", "request", "Lzy11;", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Lieb;", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatWebChromeClient extends WebChromeClient {
    private final ieb controller;

    public ChatWebChromeClient(ieb iebVar) {
        this.controller = iebVar;
    }

    private final boolean hasVoiceCaptureAndroidPermissions(hc3 attached) {
        for (int i = 0; i < 2; i++) {
            if (qke.h(attached.c, k791.a[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest request) {
        dj41 dj41Var;
        int i;
        hc3 hc3Var = ((heb) this.controller).v;
        if (hc3Var == null) {
            request.deny();
            return;
        }
        List list = dj41.b;
        String[] resources = request.getResources();
        List list2 = dj41.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            ((ej41) obj).getClass();
            if (j73.y(resources, "android.webkit.resource.AUDIO_CAPTURE")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            dj41Var = null;
        } else {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ej41) it.next()).getClass();
                arrayList2.add("android.permission.RECORD_AUDIO");
            }
            dj41Var = new dj41((String[]) kotlin.collections.a.I(kotlin.collections.a.n0(arrayList2, k791.a)).toArray(new String[0]));
        }
        if (dj41Var == null) {
            request.deny();
            return;
        }
        if (hasVoiceCaptureAndroidPermissions(hc3Var)) {
            request.grant(request.getResources());
            return;
        }
        o3 o3Var = hc3Var.d;
        String[] strArr = dj41Var.a;
        an8 an8Var = new an8(this, hc3Var, request, dj41Var, 16);
        Fragment fragment = (Fragment) o3Var.w;
        if (strArr.length != 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && fragment.requireActivity().checkSelfPermission(str) != 0) {
                    i = o3Var.b;
                    o3Var.b = i + 1;
                    fragment.requestPermissions(strArr, i);
                    break;
                }
            }
        }
        i = -1;
        if (i == -1) {
            an8Var.s(j73.d0(strArr));
        } else {
            ((SparseArray) o3Var.c).put(i, new rya0(an8Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        heb hebVar = (heb) this.controller;
        hc3 hc3Var = hebVar.v;
        if (hc3Var == null) {
            return false;
        }
        tls tlsVar = hebVar.i.a;
        ShowFileChooserDelegate showFileChooserDelegate = tlsVar != null ? (ShowFileChooserDelegate) tlsVar.invoke(hc3Var.c) : null;
        if (showFileChooserDelegate != null) {
            return ((ru.yandex.taxi.messenger.delegate.a) showFileChooserDelegate).a(webView, filePathCallback, fileChooserParams);
        }
        p1b p1bVar = hc3Var.f;
        if (filePathCallback == null) {
            p1bVar.getClass();
            return false;
        }
        p1bVar.b = filePathCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        ((Fragment) p1bVar.a).startActivityForResult(Intent.createChooser(intent, null), 9797);
        return true;
    }
}
