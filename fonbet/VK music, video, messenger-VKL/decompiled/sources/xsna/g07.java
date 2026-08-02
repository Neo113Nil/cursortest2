package xsna;

import androidx.compose.foundation.MutatePriority;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class g07 {
    public final azl a;
    public final izs<BigPlayerBottomSheetValue, Boolean> b;
    public final f12<BigPlayerBottomSheetValue> c;

    /* JADX WARN: Multi-variable type inference failed */
    public g07(BigPlayerBottomSheetValue bigPlayerBottomSheetValue, azl azlVar, iq2<Float> iq2Var, izs<? super BigPlayerBottomSheetValue, Boolean> izsVar) {
        this.a = azlVar;
        this.b = izsVar;
        m7l m7lVar = m07.c;
        fb fbVar = new fb(this, 6);
        il1 il1Var = new il1(this, 5);
        f12<BigPlayerBottomSheetValue> f12Var = new f12<>(bigPlayerBottomSheetValue, izsVar);
        f12Var.b = fbVar;
        f12Var.c = il1Var;
        f12Var.d = iq2Var;
        f12Var.e = m7lVar;
        this.c = f12Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        f12<BigPlayerBottomSheetValue> f12Var = this.c;
        vgo<BigPlayerBottomSheetValue> c = f12Var.c();
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Expanded;
        if (!c.f(bigPlayerBottomSheetValue)) {
            bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Collapsed;
        }
        Object f = lz1.f(f12Var, bigPlayerBottomSheetValue, suspendLambda);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }

    public final float b() {
        return ((Number) this.c.k.getValue()).floatValue();
    }

    public final boolean c() {
        return ((zak0) this.c.g).getValue() == BigPlayerBottomSheetValue.Expanded;
    }

    public final Object d(BigPlayerBottomSheetValue bigPlayerBottomSheetValue, SuspendLambda suspendLambda) {
        Object a = this.c.a(bigPlayerBottomSheetValue, MutatePriority.Default, new c02(4, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (a != coroutineSingletons) {
            a = s3q0.a;
        }
        return a == coroutineSingletons ? a : s3q0.a;
    }
}
