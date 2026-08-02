package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.h;
import com.yandex.div.core.view2.divs.j;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.x;
import com.yandex.div.internal.view.DivImageView;

/* loaded from: classes11.dex */
public final class ie10 extends vpl {
    public final j a;
    public final h b;
    public final x c;
    public final m6o d;
    public final cpk e;

    public ie10(j jVar, h hVar, x xVar, m6o m6oVar, cpk cpkVar) {
        this.a = jVar;
        this.b = hVar;
        this.c = xVar;
        this.d = m6oVar;
        this.e = cpkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpl
    public final void a(msk mskVar) {
        m3k div;
        aw5 bindingContext = mskVar.getBindingContext();
        if (bindingContext == null || (div = mskVar.getDiv()) == null) {
            return;
        }
        this.e.c(bindingContext.a, bindingContext.b, (View) mskVar, div.d());
    }

    @Override // defpackage.vpl
    public final void d(DivGifImageView divGifImageView) {
        aw5 bindingContext = divGifImageView.getBindingContext();
        if (bindingContext == null) {
            return;
        }
        Div2View div2View = bindingContext.a;
        l2k div = divGifImageView.getDiv();
        if (div != null) {
            xrk xrkVar = div.c;
            zmk dataTag = div2View.getDataTag();
            l6o a = this.d.a(div2View.get_divData(), dataTag);
            h hVar = this.b;
            hVar.getClass();
            hVar.Hg(divGifImageView, div2View, bindingContext.b, xrkVar, a);
            this.e.c(div2View, bindingContext.b, divGifImageView, xrkVar);
        }
    }

    @Override // defpackage.vpl
    public final void g(DivVideoView divVideoView) {
        y2k div;
        aw5 bindingContext = divVideoView.getBindingContext();
        if (bindingContext == null || (div = divVideoView.getDiv()) == null) {
            return;
        }
        ynl ynlVar = div.c;
        b path = divVideoView.getPath();
        if (path == null) {
            return;
        }
        this.c.Pg(divVideoView, bindingContext, ynlVar, path);
        this.e.c(bindingContext.a, bindingContext.b, divVideoView, ynlVar);
    }

    @Override // defpackage.vpl
    public final void h(DivImageView divImageView) {
        n2k div;
        aw5 bindingContext = divImageView.getBindingContext();
        if (bindingContext == null || (div = divImageView.getDiv()) == null) {
            return;
        }
        psk pskVar = div.c;
        Div2View div2View = bindingContext.a;
        this.a.Kg(divImageView, bindingContext, pskVar, this.d.a(div2View.get_divData(), div2View.getDataTag()));
        this.e.c(div2View, bindingContext.b, divImageView, pskVar);
    }

    public final void i(Div2View div2View) {
        int i = 0;
        while (true) {
            if (!(i < div2View.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = div2View.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                wwg.Y(this, childAt);
                i = i2;
            }
        }
    }
}
