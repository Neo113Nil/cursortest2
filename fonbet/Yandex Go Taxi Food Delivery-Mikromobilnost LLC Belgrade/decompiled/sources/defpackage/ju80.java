package defpackage;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$OpenType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ju80 implements pw80 {
    public static final gu80 Companion = new gu80();
    public static final i3y[] g;
    public final String a;
    public final Uri b;
    public final OutMessage$OpenUrl$UrlType c;
    public final OutMessage$OpenUrl$OpenType d;
    public final boolean e;
    public final exe0 f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, a.b(lazyThreadSafetyMode, new yi80(21)), a.b(lazyThreadSafetyMode, new yi80(22)), a.b(lazyThreadSafetyMode, new yi80(23)), null, null};
    }

    public /* synthetic */ ju80(int i, String str, Uri uri, OutMessage$OpenUrl$UrlType outMessage$OpenUrl$UrlType, OutMessage$OpenUrl$OpenType outMessage$OpenUrl$OpenType, boolean z, exe0 exe0Var) {
        if (30 != (i & 30)) {
            qje.Z(i, 30, fu80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = uri;
        this.c = outMessage$OpenUrl$UrlType;
        this.d = outMessage$OpenUrl$OpenType;
        this.e = z;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = exe0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju80)) {
            return false;
        }
        ju80 ju80Var = (ju80) obj;
        return jl40.l(this.a, ju80Var.a) && jl40.l(this.b, ju80Var.b) && this.c == ju80Var.c && this.d == ju80Var.d && this.e == ju80Var.e && jl40.l(this.f, ju80Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e);
        exe0 exe0Var = this.f;
        return e + (exe0Var != null ? exe0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OpenUrl(trackId=" + this.a + ", url=" + this.b + ", urlType=" + this.c + ", openType=" + this.d + ", needAuth=" + this.e + ", options=" + this.f + ')';
    }
}
