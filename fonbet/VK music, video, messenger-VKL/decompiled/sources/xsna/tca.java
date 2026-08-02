package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vkontakte.android.R;

/* compiled from: CatalogRecyclerViewHolder.kt */
/* loaded from: classes16.dex */
public final class tca extends RecyclerView.e0 implements ent0, b2q0<tca> {
    public final CatalogViewHolder l;
    public final zha m;
    public UIBlock n;
    public Boolean o;

    public tca(ViewGroup viewGroup, CatalogViewHolder catalogViewHolder, zha zhaVar) {
        super(catalogViewHolder.k5(LayoutInflater.from(viewGroup.getContext()), viewGroup, null));
        this.l = catalogViewHolder;
        this.m = zhaVar;
    }

    public static void V5(View view, boolean z) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                V5(viewGroup.getChildAt(i), z);
            }
        }
        if (!z) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            if (view.isEnabled()) {
                view.setEnabled(false);
                view.setAlpha(0.7f);
                return;
            }
        }
        if (!z) {
            qcy<Object>[] qcyVarArr2 = bwt0.a;
            if (!view.isEnabled()) {
                view.setTag(R.id.catalog_ui_tag_ignore, Boolean.TRUE);
                return;
            }
        }
        if (z && epx.f(view.getTag(R.id.catalog_ui_tag_ignore), Boolean.TRUE)) {
            view.setTag(R.id.catalog_ui_tag_ignore, null);
        } else {
            if (!z || epx.f(view.getTag(R.id.catalog_ui_tag_ignore), Boolean.TRUE)) {
                return;
            }
            bwt0.a0(view, true);
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.m.q3();
    }

    @Override // xsna.b2q0
    public final tca A5() {
        return this;
    }
}
