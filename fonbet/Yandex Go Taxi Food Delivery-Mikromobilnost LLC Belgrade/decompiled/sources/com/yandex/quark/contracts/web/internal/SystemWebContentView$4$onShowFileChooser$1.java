package com.yandex.quark.contracts.web.internal;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.yandex.go.quark.dynamic.chat.c;
import defpackage.azq;
import defpackage.g8e;
import defpackage.jyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ple;
import defpackage.q5z;
import defpackage.syj0;
import defpackage.tse;
import defpackage.uyq;
import defpackage.vyq;
import defpackage.w511;
import defpackage.wls;
import defpackage.wyq;
import defpackage.xa20;
import defpackage.xyq;
import defpackage.y3x0;
import defpackage.yyq;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.contracts.web.internal.SystemWebContentView$4$onShowFileChooser$1", f = "SystemWebContentView.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SystemWebContentView$4$onShowFileChooser$1 extends SuspendLambda implements wls {
    final /* synthetic */ WebChromeClient.FileChooserParams $fileChooserParams;
    final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
    int label;
    final /* synthetic */ y3x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemWebContentView$4$onShowFileChooser$1(y3x0 y3x0Var, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback valueCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y3x0Var;
        this.$fileChooserParams = fileChooserParams;
        this.$filePathCallback = valueCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SystemWebContentView$4$onShowFileChooser$1(this.this$0, this.$fileChooserParams, this.$filePathCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SystemWebContentView$4$onShowFileChooser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002c, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        syj0 syj0Var;
        String[] strArr;
        ValueCallback<Uri[]> valueCallback;
        List list;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Uri[] uriArr = null;
        if (i == 0) {
            b.b(obj);
            azq azqVar = this.this$0.h;
            if (azqVar == null) {
                syj0Var = null;
                if (syj0Var instanceof jyj0) {
                    xa20 xa20Var = this.this$0.d;
                    yyq yyqVar = (yyq) ((jyj0) syj0Var).a;
                    if (yyqVar.equals(uyq.a)) {
                        str = "AcceptedTypesNotSpecified";
                    } else if (yyqVar.equals(vyq.a)) {
                        str = "Cancelled";
                    } else if (yyqVar.equals(wyq.a)) {
                        str = "DuplicateRequest";
                    } else {
                        if (!yyqVar.equals(xyq.a)) {
                            w511.b();
                            return null;
                        }
                        str = "LauncherNotInitialized";
                    }
                    xa20Var.b(new ple(4, "webchat_file_chooser_launch_failed", g8e.z("error", str), false));
                }
                valueCallback = this.$filePathCallback;
                if (valueCallback != null) {
                    if (syj0Var != null && (list = (List) q5z.C(syj0Var)) != null) {
                        uriArr = (Uri[]) list.toArray(new Uri[0]);
                    }
                    valueCallback.onReceiveValue(uriArr);
                }
                return zy11.a;
            }
            WebChromeClient.FileChooserParams fileChooserParams = this.$fileChooserParams;
            if (fileChooserParams != null && (strArr = fileChooserParams.getAcceptTypes()) != null) {
                if (strArr.length == 0) {
                    strArr = null;
                }
            }
            strArr = new String[]{"*/*"};
            WebChromeClient.FileChooserParams fileChooserParams2 = this.$fileChooserParams;
            boolean isCaptureEnabled = fileChooserParams2 != null ? fileChooserParams2.isCaptureEnabled() : false;
            WebChromeClient.FileChooserParams fileChooserParams3 = this.$fileChooserParams;
            boolean z = fileChooserParams3 != null && fileChooserParams3.getMode() == 1;
            this.label = 1;
            obj = ((c) azqVar).a(strArr, isCaptureEnabled, z, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        syj0Var = (syj0) obj;
        if (syj0Var instanceof jyj0) {
        }
        valueCallback = this.$filePathCallback;
        if (valueCallback != null) {
        }
        return zy11.a;
    }
}
