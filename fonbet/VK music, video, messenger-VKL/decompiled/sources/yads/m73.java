package yads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import xsna.arm0;
import xsna.brm0;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class m73 {
    public final Set a;
    public final ed2 b;
    public final ih2 c;
    public final n73 d;

    public /* synthetic */ m73(Set set) {
        this(set, new ed2(), new ih2(), new n73());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r0 <= 100.0f) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final be3 a(String str) {
        Long l;
        Integer num;
        int parseInt;
        Float f;
        if (this.a.contains(k73.d) && "start".equals(str)) {
            return new be3(ae3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.a.contains(k73.e) && TtmlNode.END.equals(str)) {
            return new be3(ae3.c, 100.0f);
        }
        if (this.a.contains(k73.c) && brm0.v(str, "%", false)) {
            this.b.getClass();
            try {
                f = arm0.l(str.substring(0, drm0.H(str)));
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= floatValue) {
                    }
                }
            } catch (Throwable unused) {
            }
            f = null;
            if (f != null) {
                return new be3(ae3.c, f.floatValue());
            }
            return null;
        }
        if (!this.a.contains(k73.f) || !brm0.B(str, "#", false)) {
            if (!this.a.contains(k73.b)) {
                return null;
            }
            this.d.getClass();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                l = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused2) {
                l = null;
            }
            if (l != null) {
                return new be3(ae3.b, l.longValue());
            }
            return null;
        }
        this.c.getClass();
        try {
            parseInt = Integer.parseInt(str.substring(1));
        } catch (Exception unused3) {
        }
        if (parseInt >= 1) {
            num = Integer.valueOf(parseInt);
            if (num == null) {
                return new be3(ae3.d, num.intValue());
            }
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public m73(Set set, ed2 ed2Var, ih2 ih2Var, n73 n73Var) {
        this.a = set;
        this.b = ed2Var;
        this.c = ih2Var;
        this.d = n73Var;
    }
}
