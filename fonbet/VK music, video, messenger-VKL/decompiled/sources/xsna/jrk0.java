package xsna;

import com.vk.media.pipeline.model.stat.TranscodeType;
import java.util.List;

/* compiled from: Stat.kt */
/* loaded from: classes3.dex */
public final class jrk0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final TranscodeType m;
    public final List<ems0> n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final List<String> r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;

    public jrk0(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, long j5, long j6, TranscodeType transcodeType, List<ems0> list, boolean z, boolean z2, boolean z3, List<String> list2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = j5;
        this.l = j6;
        this.m = transcodeType;
        this.n = list;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = list2;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrk0)) {
            return false;
        }
        jrk0 jrk0Var = (jrk0) obj;
        return this.a == jrk0Var.a && this.b == jrk0Var.b && this.c == jrk0Var.c && this.d == jrk0Var.d && this.e == jrk0Var.e && this.f == jrk0Var.f && this.g == jrk0Var.g && this.h == jrk0Var.h && this.i == jrk0Var.i && this.j == jrk0Var.j && this.k == jrk0Var.k && this.l == jrk0Var.l && this.m == jrk0Var.m && epx.f(this.n, jrk0Var.n) && this.o == jrk0Var.o && this.p == jrk0Var.p && this.q == jrk0Var.q && epx.f(this.r, jrk0Var.r) && epx.f(this.s, jrk0Var.s) && epx.f(this.t, jrk0Var.t) && epx.f(this.u, jrk0Var.u) && epx.f(this.v, jrk0Var.v);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(fw3.a((this.m.hashCode() + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        List<String> list = this.r;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.v;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stat(singleInputFileWidth=");
        sb.append(this.a);
        sb.append(", transcodedOutputFileWidth=");
        sb.append(this.b);
        sb.append(", singleInputFileHeight=");
        sb.append(this.c);
        sb.append(", transcodedOutputFileHeight=");
        sb.append(this.d);
        sb.append(", singleInputFileBitrate=");
        sb.append(this.e);
        sb.append(", transcodedOutputFileBitrate=");
        sb.append(this.f);
        sb.append(", processedTotalBytes=");
        sb.append(this.g);
        sb.append(", processedVideoBytes=");
        sb.append(this.h);
        sb.append(", processedAudioBytes=");
        sb.append(this.i);
        sb.append(", videoProcessingDurationMs=");
        sb.append(this.j);
        sb.append(", audioProcessingDurationMs=");
        sb.append(this.k);
        sb.append(", sessionTotalDurationMs=");
        sb.append(this.l);
        sb.append(", transcodeType=");
        sb.append(this.m);
        sb.append(", transcodedVideoFormats=");
        sb.append(this.n);
        sb.append(", isInputVideoHDR=");
        sb.append(this.o);
        sb.append(", has264Or265EncoderHDRSupport=");
        sb.append(this.p);
        sb.append(", has264Or265EncoderHLGSupport=");
        sb.append(this.q);
        sb.append(", deviceVideoEncoderCodecs=");
        sb.append(this.r);
        sb.append(", videoEncoderCodec=");
        sb.append(this.s);
        sb.append(", glVendor=");
        sb.append(this.t);
        sb.append(", glRenderer=");
        sb.append(this.u);
        sb.append(", glVersion=");
        return ho8.a(sb, this.v, ')');
    }
}
