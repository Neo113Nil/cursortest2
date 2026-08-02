package com.yandex.go.platform.web_view_client.upload_image;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import defpackage.b60;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.l50;
import defpackage.ny61;
import defpackage.omy0;
import defpackage.q40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final b60 a;
    public final l50 b;
    public final a c;
    public final omy0 d = new omy0();

    public b(Context context, b60 b60Var, l50 l50Var) {
        this.a = b60Var;
        this.b = l50Var;
        this.c = new a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(final ValueCallback valueCallback, ContinuationImpl continuationImpl) {
        FileChooserDelegate$handleResult$1 fileChooserDelegate$handleResult$1;
        int i;
        int i2;
        if (continuationImpl instanceof FileChooserDelegate$handleResult$1) {
            fileChooserDelegate$handleResult$1 = (FileChooserDelegate$handleResult$1) continuationImpl;
            int i3 = fileChooserDelegate$handleResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fileChooserDelegate$handleResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = fileChooserDelegate$handleResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileChooserDelegate$handleResult$1.label;
                Uri[] uriArr = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fileChooserDelegate$handleResult$1.L$0 = this;
                    fileChooserDelegate$handleResult$1.L$1 = valueCallback;
                    fileChooserDelegate$handleResult$1.label = 1;
                    obj = this.b.a(999, fileChooserDelegate$handleResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    valueCallback = (ValueCallback) fileChooserDelegate$handleResult$1.L$1;
                    this = (b) fileChooserDelegate$handleResult$1.L$0;
                    kotlin.b.b(obj);
                }
                q40 q40Var = (q40) obj;
                i2 = q40Var.b;
                zy11 zy11Var = zy11.a;
                if (i2 == -1) {
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(null);
                    }
                    return zy11Var;
                }
                Intent intent = q40Var.c;
                if (intent == null || (intent.getDataString() == null && intent.getClipData() == null)) {
                    a aVar = this.c;
                    tls tlsVar = new tls() { // from class: com.yandex.go.platform.web_view_client.upload_image.FileChooserDelegate$handleResult$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            Uri[] uriArr2 = (Uri[]) obj2;
                            ValueCallback<Uri[]> valueCallback2 = valueCallback;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(uriArr2);
                            }
                            return zy11.a;
                        }
                    };
                    Uri uri = aVar.b;
                    tlsVar.invoke(uri == null ? null : new Uri[]{uri});
                    aVar.b = null;
                    return zy11Var;
                }
                omy0 omy0Var = this.d;
                tls tlsVar2 = new tls() { // from class: com.yandex.go.platform.web_view_client.upload_image.FileChooserDelegate$handleResult$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        Uri[] uriArr2 = (Uri[]) obj2;
                        ValueCallback<Uri[]> valueCallback2 = valueCallback;
                        if (valueCallback2 != null) {
                            valueCallback2.onReceiveValue(uriArr2);
                        }
                        return zy11.a;
                    }
                };
                ClipData clipData = intent.getClipData();
                String dataString = intent.getDataString();
                if (clipData != null) {
                    d6w n = y6i0.n(0, clipData.getItemCount());
                    ArrayList arrayList = new ArrayList(tcc.n(n, 10));
                    c6w it = n.iterator();
                    while (it.c) {
                        arrayList.add(clipData.getItemAt(it.nextInt()).getUri());
                    }
                    if (!arrayList.isEmpty()) {
                        uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                    }
                } else if (dataString != null) {
                    List singletonList = Collections.singletonList(Uri.parse(dataString));
                    if (!singletonList.isEmpty()) {
                        uriArr = (Uri[]) singletonList.toArray(new Uri[0]);
                    }
                }
                tlsVar2.invoke(uriArr);
                return zy11Var;
            }
        }
        fileChooserDelegate$handleResult$1 = new FileChooserDelegate$handleResult$1(this, continuationImpl);
        Object obj2 = fileChooserDelegate$handleResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileChooserDelegate$handleResult$1.label;
        Uri[] uriArr2 = null;
        if (i != 0) {
        }
        q40 q40Var2 = (q40) obj2;
        i2 = q40Var2.b;
        zy11 zy11Var2 = zy11.a;
        if (i2 == -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(WebChromeClient.FileChooserParams fileChooserParams, ContinuationImpl continuationImpl) {
        FileChooserDelegate$openChooser$1 fileChooserDelegate$openChooser$1;
        int i;
        ArrayList arrayList;
        if (continuationImpl instanceof FileChooserDelegate$openChooser$1) {
            fileChooserDelegate$openChooser$1 = (FileChooserDelegate$openChooser$1) continuationImpl;
            int i2 = fileChooserDelegate$openChooser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileChooserDelegate$openChooser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fileChooserDelegate$openChooser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fileChooserDelegate$openChooser$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fileChooserDelegate$openChooser$1.L$0 = this;
                    fileChooserDelegate$openChooser$1.L$1 = fileChooserParams;
                    fileChooserDelegate$openChooser$1.label = 1;
                    obj = this.c.a(fileChooserParams, fileChooserDelegate$openChooser$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileChooserParams = (WebChromeClient.FileChooserParams) fileChooserDelegate$openChooser$1.L$1;
                    this = (b) fileChooserDelegate$openChooser$1.L$0;
                    kotlin.b.b(obj);
                }
                Intent intent = (Intent) obj;
                omy0 omy0Var = this.d;
                Intent createIntent = fileChooserParams.createIntent();
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                ArrayList arrayList2 = new ArrayList();
                for (String str : acceptTypes) {
                    if (!evu0.J(str)) {
                        arrayList2.add(str);
                    }
                }
                arrayList = arrayList2.isEmpty() ? null : arrayList2;
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Intent.normalizeMimeType((String) it.next()));
                    }
                    createIntent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList3.toArray(new String[0]));
                }
                createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams.getMode() == 1);
                Intent[] intentArr = (Intent[]) scc.h(intent).toArray(new Intent[0]);
                Intent intent2 = new Intent("android.intent.action.CHOOSER");
                intent2.putExtra("android.intent.extra.INTENT", createIntent);
                intent2.putExtra("android.intent.extra.TITLE", fileChooserParams.getTitle());
                intent2.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                this.a.startActivityForResult(intent2, 999);
                return zy11.a;
            }
        }
        fileChooserDelegate$openChooser$1 = new FileChooserDelegate$openChooser$1(this, continuationImpl);
        Object obj2 = fileChooserDelegate$openChooser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fileChooserDelegate$openChooser$1.label;
        if (i != 0) {
        }
        Intent intent3 = (Intent) obj2;
        omy0 omy0Var2 = this.d;
        Intent createIntent2 = fileChooserParams.createIntent();
        String[] acceptTypes2 = fileChooserParams.getAcceptTypes();
        ArrayList arrayList22 = new ArrayList();
        while (r7 < r5) {
        }
        if (arrayList22.isEmpty()) {
        }
        if (arrayList != null) {
        }
        createIntent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams.getMode() == 1);
        Intent[] intentArr2 = (Intent[]) scc.h(intent3).toArray(new Intent[0]);
        Intent intent22 = new Intent("android.intent.action.CHOOSER");
        intent22.putExtra("android.intent.extra.INTENT", createIntent2);
        intent22.putExtra("android.intent.extra.TITLE", fileChooserParams.getTitle());
        intent22.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr2);
        this.a.startActivityForResult(intent22, 999);
        return zy11.a;
    }
}
