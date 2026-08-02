package xsna;

import android.R;
import android.view.View;
import xsna.av20;
import xsna.i4a;

/* compiled from: CatalogDialogs.kt */
/* loaded from: classes16.dex */
public final class j4a implements av20.b<i4a.a> {
    public final /* synthetic */ jh3 a;

    public j4a(jh3 jh3Var) {
        this.a = jh3Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.invoke(Integer.valueOf(((i4a.a) obj).a));
        view.postDelayed(new cy4(1), view.getContext().getResources().getInteger(R.integer.config_shortAnimTime));
    }
}
