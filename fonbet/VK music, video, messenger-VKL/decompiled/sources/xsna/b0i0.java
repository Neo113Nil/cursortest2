package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;

/* compiled from: SearchViewHolder.kt */
/* loaded from: classes2.dex */
public final class b0i0 {
    public final View a;
    public final View b;
    public final DefaultErrorView c;
    public final RecyclerView d;

    public b0i0(View view, final tx30 tx30Var) {
        this.a = view.findViewById(R.id.vkim_progress);
        this.b = view.findViewById(R.id.vkim_empty);
        DefaultErrorView defaultErrorView = (DefaultErrorView) view.findViewById(R.id.error_view);
        this.c = defaultErrorView;
        this.d = (RecyclerView) view.findViewById(R.id.vkim_recycler_view);
        defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.a0i0
            @Override // xsna.xa80
            public final void b() {
                tx30.this.invoke();
            }
        });
    }

    public final void a() {
        this.d.setVisibility(0);
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.c.setVisibility(4);
    }

    public final void b() {
        View view = this.b;
        if (f4m.g(view)) {
            d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        RecyclerView recyclerView = this.d;
        recyclerView.setVisibility(4);
        recyclerView.stopScroll();
        this.a.setVisibility(4);
        view.setVisibility(0);
        this.c.setVisibility(4);
    }
}
