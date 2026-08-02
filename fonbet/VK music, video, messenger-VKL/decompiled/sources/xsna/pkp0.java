package xsna;

import com.vk.media.pipeline.model.stat.TranscodeType;
import java.util.List;

/* compiled from: TransformSessionStat.kt */
/* loaded from: classes3.dex */
public final class pkp0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final TranscodeType n;
    public final List<ems0> o;
    public final boolean p;
    public final List<String> q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public pkp0(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, TranscodeType transcodeType, List<ems0> list, boolean z3, List<String> list2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = transcodeType;
        this.o = list;
        this.p = z3;
        this.q = list2;
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkp0)) {
            return false;
        }
        pkp0 pkp0Var = (pkp0) obj;
        return this.a == pkp0Var.a && this.b == pkp0Var.b && this.c == pkp0Var.c && this.d == pkp0Var.d && this.e == pkp0Var.e && this.f == pkp0Var.f && this.g == pkp0Var.g && this.h == pkp0Var.h && this.i == pkp0Var.i && this.j == pkp0Var.j && this.k == pkp0Var.k && this.l == pkp0Var.l && this.m == pkp0Var.m && this.n == pkp0Var.n && epx.f(this.o, pkp0Var.o) && this.p == pkp0Var.p && epx.f(this.q, pkp0Var.q) && epx.f(this.r, pkp0Var.r) && epx.f(this.s, pkp0Var.s) && epx.f(this.t, pkp0Var.t) && epx.f(this.u, pkp0Var.u);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a((this.n.hashCode() + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(qoy.b(qoy.b(shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p);
        List<String> list = this.q;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.r;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.s;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.t;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.u;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformSessionStat(singleInputFileWidth=");
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
        sb.append(", isInputVideoHDR=");
        sb.append(this.g);
        sb.append(", has264Or265EncoderHDRSupport=");
        sb.append(this.h);
        sb.append(", processedVideoBytesCount=");
        sb.append(this.i);
        sb.append(", processedAudioBytesCount=");
        sb.append(this.j);
        sb.append(", videoProcessingDurationMs=");
        sb.append(this.k);
        sb.append(", audioProcessingDurationMs=");
        sb.append(this.l);
        sb.append(", sessionDurationMs=");
        sb.append(this.m);
        sb.append(", transcodeType=");
        sb.append(this.n);
        sb.append(", transcodedVideoFormats=");
        sb.append(this.o);
        sb.append(", has264Or265EncoderHLGSupport=");
        sb.append(this.p);
        sb.append(", deviceVideoEncoderCodecs=");
        sb.append(this.q);
        sb.append(", videoEncoderCodec=");
        sb.append(this.r);
        sb.append(", glVendor=");
        sb.append(this.s);
        sb.append(", glRenderer=");
        sb.append(this.t);
        sb.append(", glVersion=");
        return ho8.a(sb, this.u, ')');
    }
}
