package xsna;

import com.vk.stickers.api.models.time.TimeStickerStyle;
import org.chromium.base.TimeUtils;

/* compiled from: TimeStickerInfo.kt */
/* loaded from: classes5.dex */
public final class nvo0 {
    public final boolean a;
    public final m0g0 b;
    public final TimeStickerStyle c;
    public final String d;

    public nvo0(boolean z, m0g0 m0g0Var, TimeStickerStyle timeStickerStyle, String str) {
        this.a = z;
        this.b = m0g0Var;
        this.c = timeStickerStyle;
        this.d = str;
    }

    public static nvo0 a(nvo0 nvo0Var, TimeStickerStyle timeStickerStyle) {
        boolean z = nvo0Var.a;
        m0g0 m0g0Var = nvo0Var.b;
        String str = nvo0Var.d;
        nvo0Var.getClass();
        return new nvo0(z, m0g0Var, timeStickerStyle, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvo0)) {
            return false;
        }
        nvo0 nvo0Var = (nvo0) obj;
        return this.a == nvo0Var.a && epx.f(this.b, nvo0Var.b) && this.c == nvo0Var.c && epx.f(this.d, nvo0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeStickerInfo(fromCamera=");
        sb.append(this.a);
        sb.append(", timeHolder=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", title=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nvo0(boolean z, m0g0 m0g0Var) {
        this(z, m0g0Var, r0, null);
        TimeStickerStyle timeStickerStyle;
        boolean z2 = System.currentTimeMillis() - m0g0Var.d() > TimeUtils.MILLISECONDS_PER_DAY;
        if (!z && z2) {
            timeStickerStyle = TimeStickerStyle.STYLE_TIME_STICKER_DATE;
        } else {
            timeStickerStyle = TimeStickerStyle.STYLE_TIME_STICKER_BLACK;
        }
    }
}
