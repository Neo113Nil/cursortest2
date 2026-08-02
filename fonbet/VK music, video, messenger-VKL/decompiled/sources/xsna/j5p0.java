package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: TooltipEditorDelegateImpl.kt */
/* loaded from: classes14.dex */
public final class j5p0 implements h5p0 {
    public final qhd a;

    public j5p0(qhd qhdVar) {
        this.a = qhdVar;
    }

    @Override // xsna.h5p0
    public final void a(Context context, m4 m4Var) {
        View view;
        this.a.getClass();
        if (g620.f().e().r() || (view = (View) m4Var.invoke()) == null) {
            return;
        }
        RectF rectF = new RectF(bwt0.C(view));
        rectF.left -= e3m.a(R.dimen.clips_tooltip_change_author_left_margin, context);
        io.reactivex.rxjava3.internal.operators.single.i0 t = io.reactivex.rxjava3.core.x.t(500L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        itg0.b(view, hg1.i(t.q((io.reactivex.rxjava3.core.w) asu0.i0.getValue()).m(asu0Var.d()), new by5(27, context, rectF)));
    }
}
