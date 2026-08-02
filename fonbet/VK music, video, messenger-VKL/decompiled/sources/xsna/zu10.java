package xsna;

import com.vk.media.pipeline.model.stat.TranscodeType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MediaPipelineErrorStat.kt */
/* loaded from: classes3.dex */
public final class zu10 {
    public final Throwable a;
    public final List<String> b;
    public final String c;
    public final String d;
    public final List<String> e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final Set<String> l;
    public final List<Long> m;
    public final String n;
    public final TranscodeType o;
    public final String p;
    public final String q;
    public final String r;

    public zu10(Throwable th, List list, String str, String str2, ArrayList arrayList, String str3, String str4, int i, String str5, int i2, int i3, HashSet hashSet, ArrayList arrayList2, String str6, TranscodeType transcodeType, String str7, String str8, String str9) {
        this.a = th;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = arrayList;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = str5;
        this.j = i2;
        this.k = i3;
        this.l = hashSet;
        this.m = arrayList2;
        this.n = str6;
        this.o = transcodeType;
        this.p = str7;
        this.q = str8;
        this.r = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu10)) {
            return false;
        }
        zu10 zu10Var = (zu10) obj;
        return epx.f(this.a, zu10Var.a) && epx.f(this.b, zu10Var.b) && epx.f(this.c, zu10Var.c) && epx.f(this.d, zu10Var.d) && epx.f(this.e, zu10Var.e) && epx.f(this.f, zu10Var.f) && epx.f(this.g, zu10Var.g) && this.h == zu10Var.h && epx.f(this.i, zu10Var.i) && this.j == zu10Var.j && this.k == zu10Var.k && epx.f(this.l, zu10Var.l) && epx.f(this.m, zu10Var.m) && epx.f(this.n, zu10Var.n) && this.o == zu10Var.o && epx.f(this.p, zu10Var.p) && epx.f(this.q, zu10Var.q) && epx.f(this.r, zu10Var.r);
    }

    public final int hashCode() {
        int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int a2 = fw3.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode2 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode3 = (this.o.hashCode() + urd0.a(fw3.a(fw3.b(shy.a(this.k, shy.a(this.j, urd0.a(shy.a(this.h, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n)) * 31;
        String str5 = this.p;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return xqm0.g("\n            exception = " + this.a + ",\n            deviceVideoEncoderCodecs = " + this.b + ",\n            videoEncoderCodec = " + this.c + ",\n            videoEncoderStat = " + this.d + ",\n            deviceVideoDecoderCodecs = " + this.e + ",\n            videoDecoderCodec = " + this.f + ",\n            videoDecoderStat = " + this.g + ",\n            maxInputSize = " + this.h + ",\n            maxImageInputSize = " + this.i + ",\n            maxBitrate = " + this.j + ",\n            maxFps = " + this.k + ",\n            mimeTypes = " + this.l + ",\n            videoSourceDurations = " + this.m + ",\n            emptySampleDataOrigins = " + this.n + ",\n            transcodeType = " + this.o + ",\n            glVendor = " + this.p + ",\n            glRenderer = " + this.q + ",\n            glVersion = " + this.r + "\n        ");
    }
}
