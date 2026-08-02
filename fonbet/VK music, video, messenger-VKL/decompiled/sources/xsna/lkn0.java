package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.DropdownSide;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lkn0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ float c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ mtk0 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lkn0(DropdownSide dropdownSide, float f, mtk0 mtk0Var, mtk0 mtk0Var2, mtk0 mtk0Var3) {
        on20 on20Var = on20.a;
        this.d = dropdownSide;
        this.c = f;
        this.e = mtk0Var;
        this.f = mtk0Var2;
        this.g = mtk0Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nkn0.g((gq2) ((Ref$ObjectRef) this.d).element, ((Long) obj).longValue(), this.c, (rm2) this.e, (kq2) this.f, (izs) this.g);
                break;
            default:
                DropdownSide dropdownSide = (DropdownSide) this.d;
                float f = on20.b;
                mtk0 mtk0Var = (mtk0) this.e;
                mtk0 mtk0Var2 = (mtk0) this.g;
                oio oioVar = (oio) obj;
                long j = ((l5g) mtk0Var.getValue()).a;
                long j2 = ((l5g) this.f.getValue()).a;
                DropdownSide dropdownSide2 = DropdownSide.Above;
                float f2 = this.c;
                float f3 = dropdownSide == dropdownSide2 ? ((pco) mtk0Var2.getValue()).b : f2;
                if (dropdownSide == DropdownSide.Bottom) {
                    f2 = ((pco) mtk0Var2.getValue()).b;
                }
                float f4 = f2;
                float I0 = oioVar.I0(f);
                float f5 = I0 / 2;
                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
                float I02 = oioVar.I0(f3);
                float f6 = f3;
                float I03 = oioVar.I0(f6);
                long floatToRawIntBits = (Float.floatToRawIntBits(I03) << 32) | (Float.floatToRawIntBits(I03) & 4294967295L);
                float I04 = oioVar.I0(f4);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(I04) << 32) | (Float.floatToRawIntBits(I04) & 4294967295L);
                float I05 = oioVar.I0(f4);
                aog0 aog0Var = new aog0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, (Float.floatToRawIntBits(I02) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(I05) << 32) | (Float.floatToRawIntBits(I05) & 4294967295L));
                androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
                a.q(aog0Var, Path.Direction.CounterClockwise);
                oio.C0(oioVar, a, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qbr.a, 52);
                float I06 = oioVar.I0(f6) - f5;
                float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (I06 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    I06 = 0.0f;
                }
                float I07 = oioVar.I0(f4) - f5;
                if (I07 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f7 = I07;
                }
                aog0 aog0Var2 = new aog0(f5, f5, Float.intBitsToFloat((int) (oioVar.d() >> 32)) - f5, Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - f5, (Float.floatToRawIntBits(I06) << 32) | (Float.floatToRawIntBits(I06) & 4294967295L), (Float.floatToRawIntBits(I06) << 32) | (Float.floatToRawIntBits(I06) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
                androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                a2.q(aog0Var2, Path.Direction.CounterClockwise);
                oio.C0(oioVar, a2, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 52);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lkn0(Ref$ObjectRef ref$ObjectRef, float f, rm2 rm2Var, kq2 kq2Var, izs izsVar) {
        this.d = ref$ObjectRef;
        this.c = f;
        this.e = rm2Var;
        this.f = kq2Var;
        this.g = izsVar;
    }
}
