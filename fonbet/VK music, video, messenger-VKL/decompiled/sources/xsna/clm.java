package xsna;

import android.net.Uri;
import android.util.LruCache;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import xsna.oam;

/* compiled from: DialogThemePrefetchCmd.kt */
/* loaded from: classes2.dex */
public final class clm extends le6<s3q0> {
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final x9g0 f;

    public clm(String str, String str2, boolean z, boolean z2, x9g0 x9g0Var) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = x9g0Var;
    }

    public static Pair f(w2w w2wVar, String str) {
        String str2;
        String str3;
        lam e = w2wVar.I0().m().e(str);
        Uri uri = null;
        DialogBackground j = e != null ? hpo0.j(e) : null;
        Uri g = (j == null || (str3 = j.c) == null) ? null : jeq0.g(str3);
        if (j != null && (str2 = j.d) != null) {
            uri = jeq0.g(str2);
        }
        return new Pair(g, uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 == null) goto L17;
     */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 e(w2w w2wVar) {
        Pair f;
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        com.vk.im.engine.models.dialogs.c a = c.a.a(this.b);
        String str = this.c;
        com.vk.im.engine.models.dialogs.c a2 = str != null ? c.a.a(str) : null;
        if (!a.a() || !this.d) {
            c.C1124c c1124c = c.C1124c.c;
            if (a.equals(c1124c)) {
                if (a2 == null) {
                    a = c1124c;
                }
                a = a2;
            }
        }
        String str2 = a.a;
        DialogTheme b = w2wVar.I0().i().b(str2);
        if (b == null) {
            b = null;
        }
        if (b != null) {
            LruCache<com.vk.im.engine.models.dialogs.c, DialogTheme> lruCache = mkm.a;
            mkm.a.put(c.a.a(str2), b);
        }
        Pair f2 = f(w2wVar, str2);
        Uri uri = (Uri) f2.d();
        Uri uri2 = (Uri) f2.g();
        boolean z = this.e;
        if (z) {
            uri = uri2;
        }
        if (!hpo0.g(uri)) {
            uri = null;
        }
        if (uri == null) {
            lam e = w2wVar.I0().m().e(str2);
            if (e == null) {
                Uri uri3 = Uri.EMPTY;
                f = new Pair(uri3, uri3);
            } else {
                oam.a.a(w2wVar, new lam(e.a, e.b, !z ? e.c : null, z ? e.d : null, e.e, e.f), true);
                f = f(w2wVar, str2);
            }
            uri = z ? (Uri) f.g() : (Uri) f.d();
        }
        Object obj = fx5.a;
        if (hpo0.g(uri)) {
            skw e2 = wkw.f().e();
            if (!e2.c(uri)) {
                e2.g(fx5.b(uri, this.f).a());
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clm)) {
            return false;
        }
        clm clmVar = (clm) obj;
        return epx.f(this.b, clmVar.b) && epx.f(this.c, clmVar.c) && this.d == clmVar.d && this.e == clmVar.e && epx.f(this.f, clmVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int b = qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        x9g0 x9g0Var = this.f;
        return b + (x9g0Var != null ? x9g0Var.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogThemePrefetchCmd(themeId=" + this.b + ", defaultChatTheme=" + this.c + ", isOverrideChatTheme=" + this.d + ", isDarkTheme=" + this.e + ", backgroundResizeOptions=" + this.f + ')';
    }
}
