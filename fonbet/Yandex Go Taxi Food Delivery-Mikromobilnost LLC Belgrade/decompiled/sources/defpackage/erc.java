package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes10.dex */
public final class erc {
    public static final Set e = j73.f0(new String[]{"hy", "ka"});
    public final Context a;
    public final rqo b;
    public final x8h c;
    public final drc d = new drc(this);

    public erc(Context context, rqo rqoVar, x8h x8hVar) {
        this.a = context;
        this.b = rqoVar;
        this.c = x8hVar;
    }

    public static final boolean a(erc ercVar) {
        if (e.contains(Locale.getDefault().getLanguage())) {
            return false;
        }
        return ((mkv) ((jbh) ercVar.b).e(mkv.c).c()).b;
    }
}
