package com.yandex.go.platform.web_view_client;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.yandex.go.platform.di.c;
import com.yandex.go.platform.web_view_client.upload_image.b;
import defpackage.dst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.web_view_client.GoWebChromeClient$onShowFileChooser$1", f = "GoWebChromeClient.kt", l = {47, 49, 50}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class GoWebChromeClient$onShowFileChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebChromeClient.FileChooserParams $fileChooserParams;
    final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    int label;
    final /* synthetic */ GoWebChromeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoWebChromeClient$onShowFileChooser$1(GoWebChromeClient goWebChromeClient, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = goWebChromeClient;
        this.$fileChooserParams = fileChooserParams;
        this.$filePathCallback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoWebChromeClient$onShowFileChooser$1(this.this$0, this.$fileChooserParams, this.$filePathCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoWebChromeClient$onShowFileChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dst dstVar;
        b bVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            dstVar = this.this$0.uploadImagePermissionsListener;
            this.label = 1;
            obj = ((c) dstVar).a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bVar2 = this.this$0.fileChooserDelegate;
                ValueCallback<Uri[]> valueCallback = this.$filePathCallback;
                this.label = 3;
                return bVar2.a(valueCallback, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            bVar = this.this$0.fileChooserDelegate;
            WebChromeClient.FileChooserParams fileChooserParams = this.$fileChooserParams;
            this.label = 2;
            Object b = bVar.b(fileChooserParams, this);
            if (b != coroutineSingletons) {
                b = zy11Var;
            }
        }
    }
}
