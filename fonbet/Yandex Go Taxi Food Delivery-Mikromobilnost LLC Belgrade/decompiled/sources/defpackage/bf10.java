package defpackage;

import android.view.View;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.internal.view.DivImageView;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class bf10 extends vpl {
    public final a a;
    public final cpk b;

    public bf10(a aVar, cpk cpkVar) {
        this.a = aVar;
        this.b = cpkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpl
    public final void a(msk mskVar) {
        m3k div;
        aw5 bindingContext = mskVar.getBindingContext();
        if (bindingContext == null || (div = mskVar.getDiv()) == null) {
            return;
        }
        Div2View div2View = bindingContext.a;
        rvo rvoVar = bindingContext.b;
        View view = (View) mskVar;
        egk d = div.d();
        cpk cpkVar = this.b;
        if (cpkVar.b(d)) {
            for (dpk dpkVar : cpkVar.a) {
                if (dpkVar.matches(d)) {
                    dpkVar.releaseMedia(div2View, rvoVar, view, d);
                }
            }
        }
    }

    @Override // defpackage.vpl
    public final void d(final DivGifImageView divGifImageView) {
        ngd0.G.p();
        if (fu11.a.a()) {
            divGifImageView.releaseMedia();
            a(divGifImageView);
        } else {
            this.a.c(new sls() { // from class: com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor$visit$$inlined$runMainThreadAction$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    DivGifImageView.this.releaseMedia();
                    this.a(DivGifImageView.this);
                    return zy11.a;
                }
            });
        }
    }

    @Override // defpackage.vpl
    public final void g(final DivVideoView divVideoView) {
        ngd0.G.p();
        if (fu11.a.a()) {
            divVideoView.releaseMedia();
            a(divVideoView);
        } else {
            this.a.c(new sls() { // from class: com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor$visit$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    DivVideoView.this.releaseMedia();
                    this.a(DivVideoView.this);
                    return zy11.a;
                }
            });
        }
    }

    @Override // defpackage.vpl
    public final void h(final DivImageView divImageView) {
        ngd0.G.p();
        if (fu11.a.a()) {
            divImageView.releaseMedia();
            a(divImageView);
        } else {
            this.a.c(new sls() { // from class: com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor$visit$$inlined$runMainThreadAction$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    DivImageView.this.releaseMedia();
                    this.a(DivImageView.this);
                    return zy11.a;
                }
            });
        }
    }
}
