package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;
import xsna.fi20;

/* compiled from: EventMessage.java */
/* loaded from: classes12.dex */
public final class g0q implements fi20.a {
    public static final androidx.media3.common.a g;
    public static final androidx.media3.common.a h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q(MimeTypes.APPLICATION_ID3);
        g = new androidx.media3.common.a(c0043a);
        a.C0043a c0043a2 = new a.C0043a();
        c0043a2.m = io20.q(MimeTypes.APPLICATION_SCTE35);
        h = new androidx.media3.common.a(c0043a2);
    }

    public g0q(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // xsna.fi20.a
    @Nullable
    public final byte[] a() {
        if (b() != null) {
            return this.e;
        }
        return null;
    }

    @Override // xsna.fi20.a
    @Nullable
    public final androidx.media3.common.a b() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0q.class == obj.getClass()) {
            g0q g0qVar = (g0q) obj;
            if (this.c == g0qVar.c && this.d == g0qVar.d && Objects.equals(this.a, g0qVar.a) && Objects.equals(this.b, g0qVar.b) && Arrays.equals(this.e, g0qVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
