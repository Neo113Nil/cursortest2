package xsna;

import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.vpe0;

/* compiled from: StoryCreateQuestionPresenter.kt */
/* loaded from: classes16.dex */
public final class c1m0 extends xyl0<Object, w0m0> implements fux {
    public final vb7 d;
    public final x0m0 e;
    public StoryQuestionInfo.Style f;
    public StoryQuestionInfo.a g;

    public c1m0(b1m0 b1m0Var, vb7 vb7Var, x0m0 x0m0Var) {
        super(b1m0Var);
        this.d = vb7Var;
        this.e = x0m0Var;
        vpe0.d dVar = vpe0.d.a;
        dVar.getClass();
        this.f = vpe0.d.c;
        this.g = dVar.b();
    }

    @Override // xsna.uyl0
    public final void X1(nov novVar) {
        if (novVar instanceof sam0) {
            w0m0 w0m0Var = (w0m0) this.b;
            sam0 sam0Var = (sam0) novVar;
            w0m0Var.De(sam0Var.h.a);
            w0m0Var.Kl(sam0Var.h.a.length());
            w0m0Var.Rk(this.g, false);
            StoryQuestionInfo storyQuestionInfo = sam0Var.h;
            StoryQuestionInfo.Style style = storyQuestionInfo.e;
            this.f = style;
            this.g = storyQuestionInfo.d;
            w0m0Var.Ua(style);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uyl0
    public final void k() {
        w0m0 w0m0Var = (w0m0) this.b;
        String Lf = w0m0Var.Lf();
        if (Lf.length() == 0) {
            Lf = w0m0Var.Y5();
        }
        String str = Lf;
        StoryQuestionInfo storyQuestionInfo = new StoryQuestionInfo(str, "", w0m0Var.v3(), this.g, this.f);
        x0m0 x0m0Var = this.e;
        ?? r5 = x0m0Var.i;
        u76 u76Var = x0m0Var.g;
        nov novVar = x0m0Var.e;
        sam0 sam0Var = novVar instanceof sam0 ? (sam0) novVar : null;
        if (sam0Var == null) {
            x0m0Var.b.f(new sam0(storyQuestionInfo));
            x0m0Var.c.f();
            u76Var.o5().e();
        } else {
            if (!epx.f(str, sam0Var.h.a)) {
                ((npe0) r5.getValue()).a();
            }
            if (!epx.f("", sam0Var.h.b)) {
                ((npe0) r5.getValue()).b();
            }
            u76Var.o5().l(WebStickerType.QUESTION);
            sam0Var.setInEditMode(false);
            sam0Var.h = storyQuestionInfo;
            sam0Var.p(storyQuestionInfo);
        }
        w0m0Var.Y();
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        t0m0 t0m0Var = (t0m0) obj;
        this.f = t0m0Var.a;
        StoryQuestionInfo.a aVar = t0m0Var.d;
        this.g = aVar;
        w0m0 w0m0Var = (w0m0) this.b;
        w0m0Var.Rk(aVar, true);
        w0m0Var.ch();
    }

    @Override // xsna.uyl0
    public final void onStart() {
        w0m0 w0m0Var = (w0m0) this.b;
        w0m0Var.Rk(vpe0.d.a.b(), true);
        w0m0Var.O4();
        w0m0Var.L6((String) this.d.c);
    }
}
