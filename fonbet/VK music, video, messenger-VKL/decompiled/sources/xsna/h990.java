package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PageInputHolder.kt */
/* loaded from: classes18.dex */
public final class h990 extends vif0<g990> implements View.OnAttachStateChangeListener {
    public final izs<String, s3q0> n;
    public final RoundedSearchView o;
    public io.reactivex.rxjava3.disposables.c p;

    public h990(ViewGroup viewGroup, FavesTabSearchFragment.c cVar) {
        super(viewGroup, R.layout.page_input_holder, 0);
        this.n = cVar;
        RoundedSearchView roundedSearchView = (RoundedSearchView) this.itemView.findViewById(R.id.search_view);
        this.o = roundedSearchView;
        this.itemView.addOnAttachStateChangeListener(this);
        roundedSearchView.setEditMode(roundedSearchView.j);
    }

    @Override // xsna.vif0
    public final void i6(g990 g990Var) {
        Integer num;
        g990 g990Var2 = g990Var;
        this.o.setHint((g990Var2 == null || (num = g990Var2.a) == null) ? R.string.search : num.intValue());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.p = new qno0(this.o.d).U(new hl30(new pyz(15), 8)).y(200L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tts(new x2y(this, 23), 19), new l8w(new leq(24), 14));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
