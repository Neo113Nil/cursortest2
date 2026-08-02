package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.core.view2.f;
import com.yandex.div.core.widget.DivViewWrapper;

/* loaded from: classes.dex */
public abstract class kjk extends x0 {
    public final DivViewWrapper N;
    public final aw5 O;
    public final hgk P;
    public final f Q;
    public m3k R;

    public kjk(DivViewWrapper divViewWrapper, aw5 aw5Var, hgk hgkVar, f fVar) {
        super(divViewWrapper);
        this.N = divViewWrapper;
        this.O = aw5Var;
        this.P = hgkVar;
        this.Q = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W(aw5 aw5Var, m3k m3kVar, int i, b bVar) {
        aw5 bindingContext;
        rvo rvoVar;
        View a;
        Div2View div2View = aw5Var.a;
        rvo rvoVar2 = aw5Var.b;
        n2k0 currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        DivViewWrapper divViewWrapper = this.N;
        if (currentRebindReusableList$div_release != null && (a = currentRebindReusableList$div_release.a(m3kVar)) != null) {
            divViewWrapper.addView(a);
            this.R = m3kVar;
            return;
        }
        View child = divViewWrapper.getChild();
        if (child != null) {
            if (this.R == null) {
                child = null;
            }
            if (child != null) {
                msk mskVar = child instanceof msk ? (msk) child : null;
                if (mskVar == null || (bindingContext = mskVar.getBindingContext()) == null || (rvoVar = bindingContext.b) == null || !qjk.b(this.R, m3kVar, rvoVar, rvoVar2)) {
                    child = null;
                }
            }
        }
        if (this.R != null) {
            X();
        }
        ngd0.G.p();
        if (fu11.a.a()) {
            int i2 = 0;
            while (true) {
                if (!(i2 < divViewWrapper.getChildCount())) {
                    divViewWrapper.removeAllViews();
                    break;
                }
                int i3 = i2 + 1;
                View childAt = divViewWrapper.getChildAt(i2);
                if (childAt == null) {
                    ny61.s();
                    return;
                } else {
                    wwg.Y(div2View.getReleaseViewVisitor$div_release(), childAt);
                    i2 = i3;
                }
            }
        } else {
            sjh sjhVar = uyj.a;
            tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, divViewWrapper, div2View));
        }
        child = this.Q.o(m3kVar, rvoVar2);
        divViewWrapper.addView(child);
        this.R = m3kVar;
        div2View.getRuntimeStore().a(bVar, m3kVar, rvoVar2, this.O.b);
        this.P.b(aw5Var, child, m3kVar, bVar);
        div2View.getRuntimeStore().g(m3kVar.d());
    }

    public abstract void X();
}
