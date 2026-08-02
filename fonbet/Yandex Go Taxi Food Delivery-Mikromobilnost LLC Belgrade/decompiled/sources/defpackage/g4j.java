package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.detailed_price.ui.DetailedPriceContentView;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class g4j extends wys {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int R;
    public final FrameLayout S;
    public final d4j T;
    public final wls U;
    public final i3y V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4j(GoFrameLayout goFrameLayout, d4j d4jVar, wls wlsVar, int i) {
        super(goFrameLayout);
        this.R = i;
        switch (i) {
            case 1:
                super(goFrameLayout);
                this.S = goFrameLayout;
                this.T = d4jVar;
                this.U = wlsVar;
                this.V = a.a(new dii(22));
                break;
            default:
                this.S = goFrameLayout;
                this.T = d4jVar;
                this.U = wlsVar;
                this.V = a.a(new dii(21));
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        c4j c4jVar;
        int i = this.R;
        d4j d4jVar = this.T;
        i3y i3yVar = this.V;
        FrameLayout frameLayout = this.S;
        View view = this.a;
        switch (i) {
            case 0:
                o2j o2jVar = (o2j) obj;
                KeyEvent.Callback findViewById = frameLayout.findViewById(((Number) i3yVar.getValue()).intValue());
                c4jVar = findViewById instanceof c4j ? (c4j) findViewById : null;
                if (c4jVar == null) {
                    e4j e4jVar = (e4j) d4jVar;
                    e4jVar.getClass();
                    DetailedPriceContentView detailedPriceContentView = new DetailedPriceContentView(e4jVar.a, null, 0, this.U, 6, null);
                    View asView = detailedPriceContentView.asView();
                    asView.setId(((Number) i3yVar.getValue()).intValue());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    xw31.G(c.d(mrg0.go_design_m_space, view), asView);
                    asView.setLayoutParams(layoutParams);
                    frameLayout.addView(detailedPriceContentView.asView());
                    c4jVar = detailedPriceContentView;
                }
                kdc kdcVar = o2jVar.a.b;
                frameLayout.setBackground(d6z.W(kdcVar != null ? s8o.m(kdcVar, frameLayout.getContext()) : c.c(xng0.bgMinor, view), c.d(mrg0.go_design_m_space, view)));
                c4jVar.update(o2jVar.a);
                break;
            default:
                t2j t2jVar = (t2j) obj;
                KeyEvent.Callback findViewById2 = frameLayout.findViewById(((Number) i3yVar.getValue()).intValue());
                c4jVar = findViewById2 instanceof c4j ? (c4j) findViewById2 : null;
                if (c4jVar == null) {
                    e4j e4jVar2 = (e4j) d4jVar;
                    e4jVar2.getClass();
                    DetailedPriceContentView detailedPriceContentView2 = new DetailedPriceContentView(e4jVar2.a, null, 0, this.U, 6, null);
                    View asView2 = detailedPriceContentView2.asView();
                    asView2.setId(((Number) i3yVar.getValue()).intValue());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    xw31.G(c.d(mrg0.go_design_m_space, view), asView2);
                    asView2.setLayoutParams(layoutParams2);
                    frameLayout.addView(detailedPriceContentView2.asView());
                    c4jVar = detailedPriceContentView2;
                }
                kdc kdcVar2 = t2jVar.a.b;
                frameLayout.setBackground(d6z.W(kdcVar2 != null ? s8o.m(kdcVar2, frameLayout.getContext()) : c.c(xng0.bgMinor, view), c.d(mrg0.go_design_m_space, view)));
                c4jVar.update(t2jVar.a);
                break;
        }
    }
}
