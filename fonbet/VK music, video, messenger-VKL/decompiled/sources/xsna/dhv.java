package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: Html5PrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class dhv extends de {
    @Override // xsna.de
    public final Html5Entry Z(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.a;
        if (newsEntry instanceof Html5Entry) {
            return (Html5Entry) newsEntry;
        }
        return null;
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 2;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        xah0 xah0Var;
        xah0 xah0Var2;
        NewsEntry newsEntry = u1c0Var.a;
        s1c0 s1c0Var = u1c0Var.n;
        boolean z = (s1c0Var == null || (xah0Var2 = s1c0Var.q) == null || !xah0Var2.c) ? false : true;
        int a = (s1c0Var == null || (xah0Var = s1c0Var.q) == null) ? iah0.f().widthPixels : iah0.a(xah0Var.b);
        if (i != 0) {
            ImageSize Cb = ((Html5Entry) newsEntry).t.Cb(iah0.a(48), true, false);
            if (Cb != null) {
                return Cb.d.d;
            }
            return null;
        }
        int i2 = qi6.B;
        ImageSize Cb2 = ((Html5Entry) newsEntry).w.g.Cb(Math.min(a - (z ? cn70.b(84) : 0), iah0.a(640.0f)), true, false);
        if (Cb2 != null) {
            return Cb2.d.d;
        }
        return null;
    }
}
