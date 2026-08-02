package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class bnt implements a1h {
    public static final List b = scc.g("yandextaxi", "yandexyango", "http", Constants.SCHEME);
    public final lg21 a;

    public bnt(lg21 lg21Var) {
        this.a = lg21Var;
    }

    @Override // defpackage.a1h
    public final boolean a(Uri uri) {
        return a.G(b, uri.getScheme());
    }

    @Override // defpackage.a1h
    public final syj0 b(Uri uri) {
        return ((mg21) this.a).c(uri.toString()) ? new lyj0(zy11.a) : new jyj0(d1h.a);
    }
}
