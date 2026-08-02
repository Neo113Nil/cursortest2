package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.impl.list.e;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.instantjobs.InstantJob;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.a4b0;
import xsna.u8m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zgb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zgb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool;
        s3q0 unpromoteParticipantImpl$lambda$0;
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                com.vk.channels.impl.list.f fVar = (com.vk.channels.impl.list.f) this.d;
                uta utaVar = (uta) this.e;
                u8m a = u8m.q.a(((Integer) obj).intValue());
                if (a != null) {
                    fVar.O(new e.b(utaVar.a, a));
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c).T(new e.s(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d.Z((vzh) this.d, ((c.v) this.e).b, false)));
                return s3q0.a;
            case 2:
                lam lamVar = (lam) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.e;
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof oam) {
                    oam oamVar = (oam) instantJob;
                    String str = oamVar.c;
                    if ((!epx.f(str, lamVar.a) || oamVar.d == lamVar.b) && epx.f(str, lamVar.a)) {
                        if (!ref$BooleanRef.element) {
                            ref$BooleanRef.element = epx.f(oamVar.e, lamVar.c);
                        }
                        if (!ref$BooleanRef2.element) {
                            ref$BooleanRef2.element = epx.f(oamVar.f, lamVar.d);
                        }
                    }
                }
                return Boolean.FALSE;
            case 3:
                gzs gzsVar = (gzs) this.c;
                ah50 ah50Var = (ah50) this.d;
                izs izsVar = (izs) this.e;
                tny tnyVar = (tny) obj;
                zhf0 j = jgz.j(tnyVar, true);
                tny y = tnyVar.y();
                if (y != null) {
                    zhf0 j2 = jgz.j(y, true);
                    bool = Boolean.valueOf(((Math.min(j.c, j2.c) - Math.max(j.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * (Math.min(j.d, j2.d) - Math.max(j.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) / ((float) (((int) (tnyVar.a() >> 32)) * ((int) (tnyVar.a() & 4294967295L)))) >= 0.8f);
                } else {
                    bool = null;
                }
                if (bool == null) {
                    return s3q0.a;
                }
                boolean booleanValue = bool.booleanValue();
                if (ah50Var.i() > 0 && !booleanValue) {
                    izsVar.invoke(new s2u0(ah50Var.i(), ((Number) gzsVar.invoke()).longValue()));
                    ah50Var.p(-1L);
                } else if (booleanValue && ah50Var.i() < 0) {
                    ah50Var.p(((Number) gzsVar.invoke()).longValue());
                }
                return s3q0.a;
            case 4:
                em60 em60Var = (em60) this.c;
                Boolean bool2 = (Boolean) this.d;
                return io.reactivex.rxjava3.core.q.I0(rte0.p(), (((Boolean) em60Var.e.getValue()).booleanValue() && bool2.booleanValue()) ? new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(1)) : new io.reactivex.rxjava3.internal.operators.observable.s0(new hh60(0)), new t34(new qte(6), 23)).K().l(new v34(new rte((mu60) this.e, (Integer) obj, bool2, em60Var), 19));
            case 5:
                i0k0 i0k0Var = (i0k0) this.c;
                gzs gzsVar2 = (gzs) this.d;
                gzs gzsVar3 = (gzs) this.e;
                oio oioVar = (oio) obj;
                boolean z = oioVar.getLayoutDirection() == LayoutDirection.Rtl;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.d() >> 32))) << 32);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L);
                long j3 = z ? floatToRawIntBits : floatToRawIntBits2;
                if (!z) {
                    floatToRawIntBits2 = floatToRawIntBits;
                }
                float I0 = oioVar.I0(a4b0.b.a);
                oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 1, 3, i0k0Var.d, j3, floatToRawIntBits2);
                int i = (int) (j3 >> 32);
                int i2 = (int) (floatToRawIntBits2 >> 32);
                oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 1, 3, i0k0Var.b, (Float.floatToRawIntBits((((Number) gzsVar3.invoke()).floatValue() * (Float.intBitsToFloat(i2) - Float.intBitsToFloat(i))) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits((((Number) gzsVar2.invoke()).floatValue() * (Float.intBitsToFloat(i2) - Float.intBitsToFloat(i))) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L));
                return s3q0.a;
            case 6:
                unpromoteParticipantImpl$lambda$0 = StereoRoomManagerImpl.unpromoteParticipantImpl$lambda$0((StereoRoomManagerImpl) this.c, (gzs) this.d, (izs) this.e, (CallParticipant.ParticipantId) obj);
                return unpromoteParticipantImpl$lambda$0;
            default:
                wh50 wh50Var = (wh50) this.c;
                izs izsVar2 = (izs) this.e;
                String str2 = (String) obj;
                wh50Var.setValue(str2);
                owi.a(this.d, 300L, new vq6(23, izsVar2, str2));
                return s3q0.a;
        }
    }
}
