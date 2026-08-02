package xsna;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: Layout.kt */
/* loaded from: classes11.dex */
public final class vgl implements zo10 {
    public final zox b;
    public final IntrinsicMinMax c;
    public final IntrinsicWidthHeight d;

    public vgl(zox zoxVar, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.b = zoxVar;
        this.c = intrinsicMinMax;
        this.d = intrinsicWidthHeight;
    }

    @Override // xsna.zox
    public final int M(int i) {
        return this.b.M(i);
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.d;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
        int i = OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
        IntrinsicMinMax intrinsicMinMax = this.c;
        zox zoxVar = this.b;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            int l0 = intrinsicMinMax == IntrinsicMinMax.Max ? zoxVar.l0(o6j.h(j)) : zoxVar.M(o6j.h(j));
            if (o6j.d(j)) {
                i = o6j.h(j);
            }
            return new inr(l0, i);
        }
        int Z = intrinsicMinMax == IntrinsicMinMax.Max ? zoxVar.Z(o6j.i(j)) : zoxVar.j0(o6j.i(j));
        if (o6j.e(j)) {
            i = o6j.i(j);
        }
        return new inr(i, Z);
    }

    @Override // xsna.zox
    public final int Z(int i) {
        return this.b.Z(i);
    }

    @Override // xsna.zox
    public final Object c() {
        return this.b.c();
    }

    @Override // xsna.zox
    public final int j0(int i) {
        return this.b.j0(i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        return this.b.l0(i);
    }
}
