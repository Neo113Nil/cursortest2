package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.view.View;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutNewBottomSheetSlab$performBind$2$6$1", f = "LogoutNewBottomSheetSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutNewBottomSheetSlab$performBind$2$6$1 extends SuspendLambda implements tls {
    final /* synthetic */ n0 $data;
    final /* synthetic */ q1 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutNewBottomSheetSlab$performBind$2$6$1(q1 q1Var, n0 n0Var, Continuation continuation) {
        super(1, continuation);
        this.$this_with = q1Var;
        this.$data = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LogoutNewBottomSheetSlab$performBind$2$6$1(this.$this_with, this.$data, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LogoutNewBottomSheetSlab$performBind$2$6$1 logoutNewBottomSheetSlab$performBind$2$6$1 = (LogoutNewBottomSheetSlab$performBind$2$6$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        logoutNewBottomSheetSlab$performBind$2$6$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2 = java.lang.Integer.valueOf(r2.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r0 = defpackage.uh6.v(r6, 0).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r2.intValue() != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r6 = com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutNewBottomSheetUi$LogoutOption.THIS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r6 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r6 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r6 != 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r5.$data.h.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r5.$data.g.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        return defpackage.zy11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r6 = com.yandex.passport.internal.ui.challenge.logout.bottomsheet.e1.a[r6.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        r6 = defpackage.uh6.v(r6, 1).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r2.intValue() != r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r6 = com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutNewBottomSheetUi$LogoutOption.ALL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
        r2 = null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        View view;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LinearLayoutBuilder linearLayoutBuilder = this.$this_with.G;
        int i = 0;
        while (true) {
            if (i >= linearLayoutBuilder.getChildCount()) {
                view = null;
                break;
            }
            int i2 = i + 1;
            view = linearLayoutBuilder.getChildAt(i);
            if (view == null) {
                ny61.s();
                return null;
            }
            if (q1.c(view)) {
                break;
            }
            i = i2;
        }
    }
}
