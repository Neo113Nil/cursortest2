package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.pmx;
import xsna.yhp;

/* compiled from: AlbumDetailsEmptyView.kt */
/* loaded from: classes4.dex */
public final class gf1 extends androidx.recyclerview.widget.x<pmx, yhp> {
    public final pu c;

    public gf1(pu puVar) {
        super(new xhp());
        this.c = puVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        pmx item = getItem(i);
        if (epx.f(item, pmx.a.a)) {
            return R.layout.album_details_empty_view;
        }
        if (item instanceof pmx.b) {
            return R.layout.photos_root_error_view;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((yhp) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.album_details_empty_view) {
            return new yhp.a(tf3.b(viewGroup, i, viewGroup, false));
        }
        bga0 bga0Var = new bga0(viewGroup.getContext(), null, 6);
        bga0Var.setErrorText(bga0Var.getContext().getString(R.string.album_details_loading_error));
        bga0Var.setRetryClickListener(new xa80() { // from class: xsna.ff1
            @Override // xsna.xa80
            public final void b() {
                gf1.this.c.invoke();
            }
        });
        bga0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new yhp.b(bga0Var);
    }
}
