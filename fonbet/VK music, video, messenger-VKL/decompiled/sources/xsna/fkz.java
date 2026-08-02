package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: LivePlayBackInfo.kt */
/* loaded from: classes8.dex */
public final class fkz {
    public final VideoContentType a;
    public final Uri b;
    public final Uri c;
    public long d;
    public final long e;

    /* compiled from: LivePlayBackInfo.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ fkz(VideoContentType videoContentType, Uri uri, Uri uri2, long j) {
        this(videoContentType, uri, uri2, j, 0L);
    }

    public static fkz a(fkz fkzVar, Uri uri, Uri uri2, long j, int i) {
        VideoContentType videoContentType = fkzVar.a;
        if ((i & 2) != 0) {
            uri = fkzVar.b;
        }
        Uri uri3 = uri;
        if ((i & 4) != 0) {
            uri2 = fkzVar.c;
        }
        Uri uri4 = uri2;
        long j2 = fkzVar.d;
        if ((i & 16) != 0) {
            j = fkzVar.e;
        }
        fkzVar.getClass();
        return new fkz(videoContentType, uri3, uri4, j2, j);
    }

    public final mnz b(long j) {
        long i = swe0.i(j, 0L, this.d);
        fkz a2 = a(this, null, null, i, 15);
        VideoContentType videoContentType = this.a;
        if (i > 0) {
            Uri uri = this.c;
            Uri.Builder buildUpon = uri.buildUpon();
            String path = uri.getPath();
            if (path == null || !drm0.D(path, "offset_p", false)) {
                buildUpon.appendQueryParameter("offset_p", String.valueOf(i));
            } else {
                String path2 = uri.getPath();
                buildUpon.path(path2 != null ? brm0.y(path2, "offset_p", String.valueOf(i)) : null);
            }
            Uri build = buildUpon.build();
            int i2 = a.$EnumSwitchMapping$0[videoContentType.ordinal()];
            if (i2 == 1) {
                return new f9v(build, a2);
            }
            if (i2 == 2) {
                return new qsk(build, a2);
            }
        } else {
            int i3 = a.$EnumSwitchMapping$0[videoContentType.ordinal()];
            Uri uri2 = this.b;
            if (i3 == 1) {
                return new f9v(uri2, a2);
            }
            if (i3 == 2) {
                return new qsk(uri2, a2);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkz)) {
            return false;
        }
        fkz fkzVar = (fkz) obj;
        return this.a == fkzVar.a && epx.f(this.b, fkzVar.b) && epx.f(this.c, fkzVar.c) && this.d == fkzVar.d && this.e == fkzVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        long j = this.d;
        StringBuilder sb = new StringBuilder("LivePlayBackInfo(contentType=");
        sb.append(this.a);
        sb.append(", originalUri=");
        sb.append(this.b);
        sb.append(", uri=");
        sb.append(this.c);
        sb.append(", maxShift=");
        sb.append(j);
        return e630.c(sb, ", currentShift=", this.e, ")");
    }

    public fkz(VideoContentType videoContentType, Uri uri, Uri uri2, long j, long j2) {
        this.a = videoContentType;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        if (videoContentType != VideoContentType.HLS && videoContentType != VideoContentType.DASH) {
            throw new RuntimeException("LivePlayBackInfo supports only VideoContentType.HLS and VideoContentType.DASH");
        }
    }
}
