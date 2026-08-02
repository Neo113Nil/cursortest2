package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.vk.dto.common.Image;

/* compiled from: InterestsForUpdateLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class hfx implements gfx {
    public final Image a;
    public final qhe b;
    public final bi6 c;

    public hfx(Image image, qhe qheVar, bi6 bi6Var) {
        this.a = image;
        this.b = qheVar;
        this.c = bi6Var;
    }

    @Override // xsna.gfx
    public final void a(Context context) {
        vbs n;
        z5a z5aVar = new z5a(15, context, this);
        ComponentCallbacks2 h = e3m.h(context);
        xbs xbsVar = h instanceof xbs ? (xbs) h : null;
        if (xbsVar == null || (n = xbsVar.n()) == null || n.b("SuggestStartInterestsDialog") != null) {
            return;
        }
        z5aVar.invoke(n);
    }
}
