package com.yandex.go.design.compose.text;

import android.text.style.URLSpan;
import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.ssl.cl_88;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.text.LineCompatKt$clickAdapter$1$1", f = "LineCompat.kt", l = {251, cl_88.n}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LineCompatKt$clickAdapter$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ a $holder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineCompatKt$clickAdapter$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.$holder = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LineCompatKt$clickAdapter$1$1 lineCompatKt$clickAdapter$1$1 = new LineCompatKt$clickAdapter$1$1(this.$holder, continuation);
        lineCompatKt$clickAdapter$1$1.L$0 = obj;
        return lineCompatKt$clickAdapter$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LineCompatKt$clickAdapter$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        URLSpan a;
        URLSpan uRLSpan;
        tls tlsVar;
        zvd0 zvd0Var;
        f fVar = (f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 3);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uRLSpan = (URLSpan) this.L$3;
                tlsVar = (tls) this.L$2;
                kotlin.b.b(obj);
                zvd0Var = (zvd0) obj;
                if (zvd0Var != null) {
                    zvd0Var.a();
                    URLSpan a2 = this.$holder.a(zvd0Var.c);
                    if (a2 == uRLSpan) {
                        tlsVar.invoke(a2.getURL());
                    }
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        zvd0 zvd0Var2 = (zvd0) obj;
        a aVar = this.$holder;
        tls tlsVar2 = aVar.K;
        if (tlsVar2 != null && (a = aVar.a(zvd0Var2.c)) != null) {
            zvd0Var2.a();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = tlsVar2;
            this.L$3 = a;
            this.label = 2;
            zls zlsVar = z.a;
            obj = z.k(fVar, PointerEventPass.Main, this);
            if (obj != coroutineSingletons) {
                uRLSpan = a;
                tlsVar = tlsVar2;
                zvd0Var = (zvd0) obj;
                if (zvd0Var != null) {
                }
            }
            return coroutineSingletons;
        }
        return zy11Var;
    }
}
