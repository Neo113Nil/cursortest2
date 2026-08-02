package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vkontakte.android.R;

/* compiled from: PostingItemDraftAdapter.kt */
/* loaded from: classes4.dex */
public final class igc0 extends vif0<s3q0> implements dc6, View.OnClickListener {
    public static final /* synthetic */ int q = 0;
    public final egc0 n;
    public PostingCreationEntryPoint o;
    public final ImageView p;

    public igc0(int i, ViewGroup viewGroup, egc0 egc0Var, PostingCreationEntryPoint postingCreationEntryPoint) {
        super(viewGroup, i, 0);
        this.n = egc0Var;
        this.o = postingCreationEntryPoint;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.draft_remove);
        this.p = imageView;
        bwt0.h0(this, this.itemView);
        bwt0.p0(this.itemView, false);
        bwt0.h0(this, imageView);
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(s3q0 s3q0Var) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean f = epx.f(view, this.itemView);
        egc0 egc0Var = this.n;
        if (f) {
            if (egc0Var != null) {
                egc0Var.A6(this.o);
            }
        } else {
            if (!epx.f(view, this.p) || egc0Var == null) {
                return;
            }
            egc0Var.d3();
        }
    }
}
