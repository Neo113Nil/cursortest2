package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyStaggeredGridState.kt */
@b6l(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class wxy extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ uxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxy(uxy uxyVar, int i, int i2, spj<? super wxy> spjVar) {
        super(2, spjVar);
        this.this$0 = uxyVar;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wxy(this.this$0, this.$index, this.$scrollOffset, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((wxy) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[LOOP:1: B:33:0x00ca->B:34:0x00cc, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int b;
        twy twyVar;
        int length;
        stf0 stf0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        uxy uxyVar = this.this$0;
        int i = this.$index;
        int i2 = this.$scrollOffset;
        pxy pxyVar = uxyVar.c;
        rg50 rg50Var = pxyVar.c;
        rg50 rg50Var2 = pxyVar.e;
        int i3 = 1;
        int i4 = 0;
        boolean z = (((wak0) rg50Var).getIntValue() == i && ((wak0) rg50Var2).getIntValue() == i2) ? false : true;
        if (z) {
            bty<nxy> btyVar = uxyVar.t;
            btyVar.e();
            btyVar.b = null;
            btyVar.c = -1;
        }
        lxy lxyVar = (lxy) ((zak0) uxyVar.d).getValue();
        lxy lxyVar2 = mxy.a;
        List<nxy> list = lxyVar.m;
        List<nxy> list2 = lxyVar.m;
        if (!list.isEmpty()) {
            int index = ((twy) j5g.Y(list2)).getIndex();
            if (i <= ((twy) j5g.i0(list2)).getIndex() && index <= i) {
                b = e43.b(list2.size(), list2, new i9e(i, i3));
                twyVar = (twy) j5g.b0(b, list2);
                if (twyVar == null && z) {
                    Orientation orientation = lxyVar.u;
                    int[] iArr = lxyVar.b;
                    int e = ((int) (orientation == Orientation.Vertical ? twyVar.e() & 4294967295L : twyVar.e() >> 32)) + i2;
                    int length2 = iArr.length;
                    int[] iArr2 = new int[length2];
                    while (i4 < length2) {
                        iArr2[i4] = iArr[i4] + e;
                        i4++;
                    }
                    pxyVar.d = iArr2;
                    ((wak0) rg50Var2).C(pxy.b(pxyVar.b, iArr2));
                } else {
                    int[] iArr3 = (int[]) pxyVar.a.invoke(Integer.valueOf(i), Integer.valueOf(pxyVar.b.length));
                    length = iArr3.length;
                    int[] iArr4 = new int[length];
                    while (i4 < length) {
                        iArr4[i4] = i2;
                        i4++;
                    }
                    pxyVar.b = iArr3;
                    ((wak0) pxyVar.c).C(pxy.a(iArr3));
                    pxyVar.d = iArr4;
                    ((wak0) rg50Var2).C(pxy.b(iArr3, iArr4));
                    pxyVar.h.c(i);
                    pxyVar.g = null;
                }
                stf0Var = uxyVar.h;
                if (stf0Var != null) {
                    stf0Var.k();
                }
                return s3q0.a;
            }
        }
        twyVar = null;
        if (twyVar == null) {
        }
        int[] iArr32 = (int[]) pxyVar.a.invoke(Integer.valueOf(i), Integer.valueOf(pxyVar.b.length));
        length = iArr32.length;
        int[] iArr42 = new int[length];
        while (i4 < length) {
        }
        pxyVar.b = iArr32;
        ((wak0) pxyVar.c).C(pxy.a(iArr32));
        pxyVar.d = iArr42;
        ((wak0) rg50Var2).C(pxy.b(iArr32, iArr42));
        pxyVar.h.c(i);
        pxyVar.g = null;
        stf0Var = uxyVar.h;
        if (stf0Var != null) {
        }
        return s3q0.a;
    }
}
