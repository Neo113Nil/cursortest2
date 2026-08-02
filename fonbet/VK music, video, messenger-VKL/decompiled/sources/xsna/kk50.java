package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import xsna.ao50;
import xsna.kj50;
import xsna.mut0;

/* compiled from: MviComposeView.kt */
/* loaded from: classes3.dex */
public abstract class kk50<VS extends ao50, A extends kj50> extends jj50<VS, A> {
    public final ComposeView d;

    public kk50(Context context, f5z f5zVar) {
        super(context, f5zVar);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d = composeView;
    }

    @Override // xsna.jj50
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ComposeView c() {
        return this.d;
    }

    public final void f(VS vs, izs<? super A, s3q0> izsVar) {
        aqw.l(c(), new jai(2004851925, new v17(this, vs, izsVar, 5), true));
    }
}
