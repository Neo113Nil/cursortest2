package xsna;

/* compiled from: AudioFormat.kt */
/* loaded from: classes8.dex */
public final class so4 implements er10 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    /* compiled from: AudioFormat.kt */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public String g;
        public String h;

        public final so4 a() {
            return new so4(this.a, this.b, this.c, this.g, this.d, this.e, this.h, this.f);
        }
    }

    public so4(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
    }

    @Override // xsna.er10
    public final String a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder a2 = xe9.a("AudioFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        nyh0.a(this.d, this.c, ", bitrate: ", ", sampleRate: ", a2);
        cgn.a(this.e, this.f, ", channelCount: ", ", label: ", a2);
        return h5s.d(a2, this.g, ", language: ", this.h, ")");
    }
}
