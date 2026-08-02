package xsna;

import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kyb0 implements izs {
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ long c;

    public /* synthetic */ kyb0(Ref$IntRef ref$IntRef, long j) {
        this.b = ref$IntRef;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue = ((Integer) obj).intValue() + 1;
        this.b.element = intValue;
        tfx tfxVar = new tfx("stickers.markPopupAnimationInterrupted", new com.vk.movika.sdk.android.defaultplayer.interactive.c(28), new ar(29));
        tfx.m(tfxVar, "peer_id", this.c, 0L, 12);
        tfx.l(tfxVar, "count", intValue, 1, 0, 8);
        return rsg0.w0(yfb.x(tfxVar)).m(asu0.a.c());
    }
}
