package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.tabs.a;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1;

/* loaded from: classes11.dex */
public final class i05 {
    public final ViewGroup a;
    public final g9l b;
    public final int c;
    public ViewGroup d;
    public final /* synthetic */ a e;

    public i05(a aVar, ViewGroup viewGroup, g9l g9lVar, int i) {
        this.e = aVar;
        this.a = viewGroup;
        this.b = g9lVar;
        this.c = i;
    }

    public final void a() {
        if (this.d != null) {
            return;
        }
        a aVar = this.e;
        Div2View div2View = aVar.q.a;
        ngd0.G.p();
        boolean a = fu11.a.a();
        ViewGroup viewGroup = this.a;
        if (a) {
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                } else {
                    wwg.Y(div2View.getReleaseViewVisitor$div_release(), childAt);
                    i = i2;
                }
            }
            viewGroup.removeAllViews();
        } else {
            sjh sjhVar = uyj.a;
            tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, viewGroup, div2View));
        }
        g9l g9lVar = this.b;
        m3k m3kVar = g9lVar.a.a;
        View o = aVar.r.o(m3kVar, g9lVar.c);
        o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i3 = this.c;
        aVar.s.b(aVar.q, o, m3kVar, aVar.c(i3));
        aVar.x.put(viewGroup, new v4x0(i3, m3kVar, o));
        viewGroup.addView(o);
        this.d = viewGroup;
    }
}
