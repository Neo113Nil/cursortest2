package xsna;

import android.media.MediaFormat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: MediaFormatReader.kt */
/* loaded from: classes3.dex */
public final class gr10 {
    public final MediaFormat a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final bpn0 j;
    public final Integer k;
    public final Float l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Long q;
    public final Object r;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gr10(MediaFormat mediaFormat) {
        Integer c;
        Float valueOf;
        Integer c2;
        Integer num;
        Integer c3;
        Integer num2;
        MediaFormat mediaFormat2;
        this.a = mediaFormat;
        String string = mediaFormat.getString("mime");
        this.b = string;
        boolean z = false;
        this.c = string != null && brm0.B(string, "video/", true);
        if (string != null && brm0.B(string, "audio/", true)) {
            z = true;
        }
        this.d = z;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, new u210(this, 1));
        this.f = msy.a(lazyThreadSafetyMode, new s1x(this, 7));
        this.g = c("width");
        this.h = c("height");
        this.i = c("rotation-degrees");
        this.j = new bpn0(new tzv(this, 7));
        try {
            Float valueOf2 = mediaFormat.containsKey("frame-rate") ? Float.valueOf(mediaFormat.getFloat("frame-rate")) : null;
            c = valueOf2 != null ? Integer.valueOf((int) valueOf2.floatValue()) : null;
        } catch (ClassCastException unused) {
            c = c("frame-rate");
        }
        this.k = (c == null || c.intValue() <= 0) ? null : c;
        try {
            mediaFormat2 = this.a;
        } catch (ClassCastException unused2) {
            if (c("i-frame-interval") != null) {
                valueOf = Float.valueOf(r7.intValue());
            }
        }
        if (mediaFormat2.containsKey("i-frame-interval")) {
            valueOf = Float.valueOf(mediaFormat2.getFloat("i-frame-interval"));
            this.l = valueOf;
            this.m = c(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
            Integer c4 = c("aac-profile");
            this.n = c4;
            c2 = c("sample-rate");
            if (c2 != null) {
                c2 = c2.intValue() <= 0 ? null : c2;
                if (c2 != null) {
                    int intValue = c2.intValue();
                    if ((c4 != null && c4.intValue() == 29) || (c4 != null && c4.intValue() == 5)) {
                        intValue *= 2;
                    }
                    num = Integer.valueOf(intValue);
                    this.o = num;
                    c3 = c("channel-count");
                    if (c3 != null) {
                        c3 = c3.intValue() <= 0 ? null : c3;
                        if (c3 != null) {
                            int intValue2 = c3.intValue();
                            if (c4 != null && c4.intValue() == 29) {
                                intValue2 *= 2;
                            }
                            num2 = Integer.valueOf(intValue2);
                            this.p = num2;
                            MediaFormat mediaFormat3 = this.a;
                            this.q = mediaFormat3.containsKey("durationUs") ? Long.valueOf(mediaFormat3.getLong("durationUs")) : null;
                            c("max-input-size");
                            this.r = msy.a(LazyThreadSafetyMode.NONE, new k7y(this, 8));
                        }
                    }
                    num2 = null;
                    this.p = num2;
                    MediaFormat mediaFormat32 = this.a;
                    this.q = mediaFormat32.containsKey("durationUs") ? Long.valueOf(mediaFormat32.getLong("durationUs")) : null;
                    c("max-input-size");
                    this.r = msy.a(LazyThreadSafetyMode.NONE, new k7y(this, 8));
                }
            }
            num = null;
            this.o = num;
            c3 = c("channel-count");
            if (c3 != null) {
            }
            num2 = null;
            this.p = num2;
            MediaFormat mediaFormat322 = this.a;
            this.q = mediaFormat322.containsKey("durationUs") ? Long.valueOf(mediaFormat322.getLong("durationUs")) : null;
            c("max-input-size");
            this.r = msy.a(LazyThreadSafetyMode.NONE, new k7y(this, 8));
        }
        valueOf = null;
        this.l = valueOf;
        this.m = c(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
        Integer c42 = c("aac-profile");
        this.n = c42;
        c2 = c("sample-rate");
        if (c2 != null) {
        }
        num = null;
        this.o = num;
        c3 = c("channel-count");
        if (c3 != null) {
        }
        num2 = null;
        this.p = num2;
        MediaFormat mediaFormat3222 = this.a;
        this.q = mediaFormat3222.containsKey("durationUs") ? Long.valueOf(mediaFormat3222.getLong("durationUs")) : null;
        c("max-input-size");
        this.r = msy.a(LazyThreadSafetyMode.NONE, new k7y(this, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r1.intValue() != 23) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r1.intValue() != 39) goto L45;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long a() {
        Integer num = this.o;
        if (num == null) {
            return null;
        }
        if (!((Boolean) this.f.getValue()).booleanValue()) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        Integer num2 = this.n;
        if (num2 == null) {
            num2 = c(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        }
        int i = 1024;
        if ((num2 == null || num2.intValue() != 2) && (num2 == null || num2.intValue() != 42)) {
            int i2 = 2048;
            if ((num2 == null || num2.intValue() != 5) && (num2 == null || num2.intValue() != 29)) {
                i2 = 512;
                if (num2 != null) {
                }
                if (num2 != null) {
                }
            }
            i = i2;
        }
        return Long.valueOf((long) ((i * 1000000.0f) / intValue));
    }

    public final ByteBuffer b() {
        return this.a.getByteBuffer("csd-0");
    }

    public final Integer c(String str) {
        MediaFormat mediaFormat = this.a;
        if (mediaFormat.containsKey(str)) {
            return Integer.valueOf(mediaFormat.getInteger(str));
        }
        return null;
    }

    public final Long d() {
        Integer num;
        try {
            num = c("frame-count");
        } catch (ClassCastException unused) {
            num = null;
        }
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        Long l = this.q;
        if (l == null || l.longValue() <= 0) {
            l = null;
        }
        if (num == null || l == null) {
            return null;
        }
        return Long.valueOf((long) (l.longValue() / num.intValue()));
    }

    public final Integer e() {
        Integer c = c("color-range");
        if (c == null || c.intValue() == 0) {
            return null;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr10)) {
            return false;
        }
        boolean z = this.d;
        Integer num = this.m;
        String str = this.b;
        if (z) {
            gr10 gr10Var = (gr10) obj;
            if (gr10Var.d) {
                return Objects.equals(str, gr10Var.b) && Objects.equals(this.o, gr10Var.o) && Objects.equals(this.p, gr10Var.p) && Objects.equals(num, gr10Var.m) && Objects.equals(c("max-bitrate"), gr10Var.c("max-bitrate")) && Objects.equals(c(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE), gr10Var.c(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) && Objects.equals(c("level"), gr10Var.c("level")) && Objects.equals(b(), gr10Var.b());
            }
        }
        boolean z2 = this.c;
        MediaFormat mediaFormat = this.a;
        if (z2) {
            gr10 gr10Var2 = (gr10) obj;
            if (gr10Var2.c) {
                return Objects.equals(str, gr10Var2.b) && Objects.equals(this.g, gr10Var2.g) && Objects.equals(this.h, gr10Var2.h) && Objects.equals(c("color-format"), gr10Var2.c("color-format")) && Objects.equals(f(), gr10Var2.f()) && Objects.equals(e(), gr10Var2.e()) && Objects.equals(g(), gr10Var2.g()) && Objects.equals(this.i, gr10Var2.i) && Objects.equals(this.k, gr10Var2.k) && Objects.equals(this.l, gr10Var2.l) && Objects.equals(num, gr10Var2.m) && Objects.equals(b(), gr10Var2.b()) && Objects.equals(mediaFormat.getByteBuffer("csd-1"), gr10Var2.a.getByteBuffer("csd-1"));
            }
        }
        return epx.f(mediaFormat, ((gr10) obj).a);
    }

    public final Integer f() {
        Integer c = c("color-standard");
        if (c == null || c.intValue() == 0) {
            return null;
        }
        return c;
    }

    public final Integer g() {
        Integer c = c("color-transfer");
        if (c == null || c.intValue() == 0) {
            return null;
        }
        return c;
    }

    public final Long h() {
        if (this.k != null) {
            return Long.valueOf((long) (1000000.0f / r0.intValue()));
        }
        return null;
    }

    public final int hashCode() {
        boolean z = this.d;
        Integer num = this.m;
        String str = this.b;
        if (z) {
            return Objects.hashCode(b()) + ((Objects.hashCode(c("level")) + ((Objects.hashCode(c(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) + ((Objects.hashCode(c("max-bitrate")) + ((Objects.hashCode(num) + ((Objects.hashCode(this.p) + ((Objects.hashCode(this.o) + ((Objects.hashCode(str) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        boolean z2 = this.c;
        MediaFormat mediaFormat = this.a;
        if (!z2) {
            return mediaFormat.hashCode();
        }
        return Objects.hashCode(mediaFormat.getByteBuffer("csd-1")) + ((Objects.hashCode(b()) + ((Objects.hashCode(num) + ((Objects.hashCode(this.l) + ((Objects.hashCode(this.k) + ((Objects.hashCode(this.i) + ((Objects.hashCode(g()) + ((Objects.hashCode(e()) + ((Objects.hashCode(f()) + ((Objects.hashCode(c("color-format")) + ((Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(str) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return this.a.toString();
    }
}
