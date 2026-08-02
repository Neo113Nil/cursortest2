package xsna;

import android.util.Size;
import one.video.player.model.FrameSize;

/* compiled from: VideoFormat.kt */
/* loaded from: classes8.dex */
public final class cms0 implements er10 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final FrameSize h;
    public final bpn0 i = new bpn0(new stg0(this, 21));
    public final bpn0 j = new bpn0(new yei0(this, 17));

    /* compiled from: VideoFormat.kt */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public FrameSize h;

        public final cms0 a() {
            return new cms0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public cms0(String str, String str2, String str3, int i, int i2, int i3, float f, FrameSize frameSize) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = f;
        this.h = frameSize;
    }

    @Override // xsna.er10
    public final String a() {
        return this.b;
    }

    public final FrameSize b() {
        return (FrameSize) this.i.getValue();
    }

    public final Size c() {
        return (Size) this.j.getValue();
    }

    public final String toString() {
        StringBuilder a2 = xe9.a("VideoFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        nyh0.a(this.d, this.c, ", bitrate: ", ", width: ", a2);
        cgn.a(this.e, this.f, ", height: ", ", frameRate: ", a2);
        a2.append(this.g);
        a2.append(", serverChooseFrameSize: ");
        a2.append(this.h);
        a2.append(")");
        return a2.toString();
    }
}
