package xsna;

import android.net.Uri;

/* compiled from: ResumableUploadCall.kt */
/* loaded from: classes15.dex */
public final class eeg0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;

    /* compiled from: ResumableUploadCall.kt */
    public static final class a {
        public String a;
        public int b;
        public String c;
        public String d;
        public String e;
        public Uri f;
        public long g;
        public long h;
        public long i;
        public boolean j;
    }

    public eeg0(a aVar) {
        Uri uri = aVar.f;
        if (drm0.N(aVar.a)) {
            throw new IllegalArgumentException("Illegal url value: " + aVar.a);
        }
        if (drm0.N(aVar.c)) {
            throw new IllegalArgumentException("Illegal fileName value: ".concat(aVar.c));
        }
        if (drm0.N(aVar.d)) {
            throw new IllegalArgumentException("Illegal mimeType value: ".concat(aVar.d));
        }
        if (drm0.N(aVar.e)) {
            throw new IllegalArgumentException("Illegal sessionId value: " + aVar.e);
        }
        if (uri == null) {
            throw new IllegalArgumentException(i6n0.a(uri, "Illegal fileUri value: "));
        }
        long j = aVar.g;
        if (j < 0) {
            throw new IllegalArgumentException("Illegal fileSize value: " + aVar.g);
        }
        long j2 = aVar.h;
        if (j2 < 0) {
            throw new IllegalArgumentException("Illegal fileChunkStart value: " + aVar.h);
        }
        long j3 = aVar.i;
        if (j3 < 0) {
            throw new IllegalArgumentException("Illegal fileChunkEnd value: " + aVar.i);
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = uri;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = aVar.j;
    }
}
