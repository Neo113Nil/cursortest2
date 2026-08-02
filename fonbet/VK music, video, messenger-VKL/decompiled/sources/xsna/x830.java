package xsna;

import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x830 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ x830(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((kw8) obj).c(new kd3(this.c, 2));
            default:
                TimelineViewState.c.a aVar = (TimelineViewState.c.a) obj;
                long j = aVar.a;
                long j2 = this.c;
                return Integer.valueOf(j > j2 ? 1 : aVar.b <= j2 ? -1 : 0);
        }
    }
}
