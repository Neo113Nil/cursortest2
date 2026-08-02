package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SnippetErrorViewHolder.kt */
/* loaded from: classes3.dex */
public final class xbk0 extends vfz<qck0> {
    public static final /* synthetic */ int o = 0;
    public final View l;
    public final bgy m;
    public final TextView n;

    public xbk0(View view, bgy bgyVar) {
        super(view);
        this.l = view;
        this.m = bgyVar;
        this.n = (TextView) view.findViewById(R.id.error_retry);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(qck0 qck0Var) {
        jjc.g(this.n, new waf0(this, 10));
    }
}
