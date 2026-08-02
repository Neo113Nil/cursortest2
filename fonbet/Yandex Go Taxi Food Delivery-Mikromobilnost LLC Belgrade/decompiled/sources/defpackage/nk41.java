package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class nk41 extends RecyclerView.Adapter {
    public final tls a;
    public final ArrayList b = new ArrayList();
    public v45 c;
    public boolean w;

    public nk41(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        mk41 mk41Var = (mk41) x0Var;
        wk41 wk41Var = (wk41) a.S(i, this.b);
        if (wk41Var != null) {
            WebStoriesView webStoriesView = (WebStoriesView) mk41Var.O.invoke(wk41Var);
            FrameLayout frameLayout = mk41Var.N;
            frameLayout.removeAllViews();
            frameLayout.addView(webStoriesView);
            webStoriesView.setTag(Integer.valueOf(wk41Var.hashCode()));
            if (mk41Var.P.w) {
                webStoriesView.onResume();
            } else {
                webStoriesView.onPause();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new mk41(this, frameLayout, this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        mk41 mk41Var = (mk41) x0Var;
        v45 v45Var = this.c;
        if (v45Var != null) {
            v45Var.invoke(Integer.valueOf(mk41Var.F()));
        }
        super.onViewAttachedToWindow(mk41Var);
    }
}
