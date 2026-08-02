package xsna;

import android.text.Layout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.chromium.base.version_info.VersionConstants;
import xsna.jio0;
import xsna.lw5;
import xsna.u9p;
import xsna.y8g;

/* compiled from: TextEditVariants.kt */
/* loaded from: classes4.dex */
public final class xeo0 {
    public static final List<ew5> f;
    public static final List<et1> g = e43.l(new et1(Layout.Alignment.ALIGN_CENTER, R.drawable.ic_text_align_center, R.string.aligment_center_accessibility_description), new et1(Layout.Alignment.ALIGN_OPPOSITE, R.drawable.ic_text_align_end, R.string.aligment_end_accessibility_description), new et1(Layout.Alignment.ALIGN_NORMAL, R.drawable.ic_text_align_start, R.string.aligment_start_accessibility_description));
    public final List<jio0.a> a;
    public final List<Integer> b;
    public final List<ew5> c;
    public final List<et1> d;
    public final ArrayList e;

    static {
        float f2 = 12;
        float f3 = 8;
        float f4 = 16;
        f = e43.l(new ew5(lw5.i, R.drawable.ic_text_style_transparent_background, R.string.background_transparent_accessibility_description), new ew5(new lw5(X3.i.T, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new lw5.a(alk.p(f2), alk.p(f3), alk.p(f2), alk.p(f3)), new u9p.b(alk.p(f4)), 156), R.drawable.ic_text_style_fill_background, R.string.background_colored_accessibility_description), new ew5(new lw5("translucent", 0.7f, new lw5.a(alk.p(f2), alk.p(f3), alk.p(f2), alk.p(f3)), new u9p.b(alk.p(f4)), VersionConstants.PRODUCT_MAJOR_VERSION), R.drawable.ic_text_style_translucent_background, R.string.background_translucent_colored_accessibility_description));
    }

    public xeo0() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeo0)) {
            return false;
        }
        xeo0 xeo0Var = (xeo0) obj;
        return epx.f(this.a, xeo0Var.a) && epx.f(this.b, xeo0Var.b) && epx.f(this.c, xeo0Var.c) && epx.f(this.d, xeo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextEditVariants(fonts=");
        sb.append(this.a);
        sb.append(", colors=");
        sb.append(this.b);
        sb.append(", backgrounds=");
        return com.vk.movika.sdk.base.model.n.b(sb, this.c, ", alignments=", this.d, ")");
    }

    public xeo0(ArrayList arrayList, int i) {
        List list = (i & 1) != 0 ? EmptyList.b : arrayList;
        List<Integer> list2 = url.a;
        this.a = list;
        this.b = list2;
        this.c = f;
        this.d = g;
        List<Integer> list3 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new y8g.c(((Number) it.next()).intValue()));
        }
        this.e = arrayList2;
    }
}
