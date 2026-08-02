package xsna;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.eduauth.RequireSwitchAccountDialogContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.a7f0;
import xsna.clw0;
import xsna.flw0;
import xsna.vkw0;

/* compiled from: VoipCallsJoinToCallByPasswordFeature.kt */
/* loaded from: classes7.dex */
public final class wkw0 extends wk50<plw0, klw0, vkw0, flw0> {
    public static final Regex k = new Regex("\\d");
    public static final Regex l = new Regex("[ \\-–—0-9]+");
    public final String f;
    public final vg20 g;
    public final b25 h;
    public final f4z i;
    public final f4z<llw0> j;

    public wkw0(String str, vg20 vg20Var, b25 b25Var) {
        super(vkw0.a.b, new jlw0());
        this.f = str;
        this.g = vg20Var;
        this.h = b25Var;
        this.i = new f4z();
        this.j = new f4z<>();
    }

    public static boolean V(String str) {
        return str != null && k.a(str) && l.f(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
    
        if (r5 == null) goto L47;
     */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(klw0 klw0Var, vkw0 vkw0Var) {
        String str;
        String str2;
        klw0 klw0Var2 = klw0Var;
        vkw0 vkw0Var2 = vkw0Var;
        String str3 = null;
        int i = 1;
        if (vkw0Var2 instanceof vkw0.a) {
            String str4 = this.f;
            if (drm0.N(str4)) {
                T(flw0.a.b);
                return;
            }
            T(new flw0.c(str4));
            T(new flw0.b(true));
            try {
                str3 = Uri.parse(str4).getQueryParameter(TtmlNode.TAG_P);
            } catch (Exception unused) {
            }
            if (str3 == null || !(!drm0.N(str3))) {
                return;
            }
            C(vkw0.d.b);
            return;
        }
        if (vkw0Var2 instanceof vkw0.b) {
            T(new flw0.c(((vkw0.b) vkw0Var2).b));
            T(new flw0.b(!drm0.N(r9.b)));
            return;
        }
        if (vkw0Var2 instanceof vkw0.c) {
            T(new flw0.d(((vkw0.c) vkw0Var2).b));
            return;
        }
        if (vkw0Var2 instanceof vkw0.e) {
            this.i.b(new clw0.d(Uri.parse(klw0Var2.b.a), ((vkw0.e) vkw0Var2).b ? RequireSwitchAccountDialogContent.SFERUM_CALL : RequireSwitchAccountDialogContent.VK_CALL));
            return;
        }
        if (!(vkw0Var2 instanceof vkw0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        String obj = drm0.p0(klw0Var2.b.a).toString();
        Uri parse = Uri.parse(obj);
        if (U(parse)) {
            if (V(obj)) {
                str = obj;
            } else {
                try {
                    str = parse.getQueryParameter(NotificationCompat.CATEGORY_CALL);
                } catch (Exception unused2) {
                    str = null;
                }
                if (str != null) {
                    if (!V(str)) {
                        str = null;
                    }
                }
                str = parse.getLastPathSegment();
                if (!V(str)) {
                    str = null;
                }
            }
            boolean z = str != null;
            if (z) {
                str2 = drm0.p0(klw0Var2.c.a).toString();
                if (drm0.N(str2)) {
                    try {
                        str2 = parse.getQueryParameter(TtmlNode.TAG_P);
                    } catch (Exception unused3) {
                    }
                }
                if (!z && str2 == null) {
                    T(new flw0.e());
                    return;
                }
                dz2 x = yfb.x((z || str2 == null) ? sg20.q(this.g, obj, null, null, 62) : sg20.q(this.g, null, str, str2, 57));
                x.c = true;
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(x), new tk40(new w7w0(this, i), 27)), new h66(this, 2)), new u5p0(this, 19), new qzl0(this, 21), 1);
            }
            str2 = null;
            if (!z) {
            }
            dz2 x2 = yfb.x((z || str2 == null) ? sg20.q(this.g, obj, null, null, 62) : sg20.q(this.g, null, str, str2, 57));
            x2.c = true;
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(x2), new tk40(new w7w0(this, i), 27)), new h66(this, 2)), new u5p0(this, 19), new qzl0(this, 21), 1);
        }
    }

    public final boolean U(Uri uri) {
        boolean t = BuildInfo.t();
        b25 b25Var = this.h;
        if (t && naz.n(uri) && !o25.b(b25Var)) {
            C(new vkw0.e(true));
            return false;
        }
        if (!naz.s(uri) || !o25.b(b25Var)) {
            return true;
        }
        C(new vkw0.e(false));
        return false;
    }

    public final void W(Throwable th) {
        this.i.b(new clw0.e(d370.v(th), (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 954));
    }
}
