package xsna;

import com.vk.dto.common.VideoFileOld;

/* compiled from: AudioAutoPlay.kt */
/* loaded from: classes4.dex */
public final class pc4 extends com.vk.libvideo.autoplay.d {
    public static final VideoFileOld q = new VideoFileOld();
    public static final pc4 r = new pc4(null, 1);
    public final izs<Boolean, s3q0> o;
    public final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc4(w7u w7uVar, int i) {
        super(q);
        izs la2Var = (i & 1) != 0 ? new la2(1) : w7uVar;
        boolean z = (i & 2) == 0;
        this.o = la2Var;
        this.p = z;
    }

    @Override // com.vk.libvideo.autoplay.d, xsna.yg5
    public final boolean p0() {
        return this.p;
    }

    @Override // com.vk.libvideo.autoplay.d, xsna.yg5
    public final void pause() {
        this.o.invoke(Boolean.TRUE);
    }

    @Override // com.vk.libvideo.autoplay.d, xsna.yg5
    public final void play() {
        this.o.invoke(Boolean.FALSE);
    }
}
