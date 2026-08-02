package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ClipsTemplateGalleryPickerPreviewAdapter.kt */
/* loaded from: classes5.dex */
public final class p8f extends androidx.recyclerview.widget.x<a8f, RecyclerView.e0> {
    public final rx0 c;

    public p8f(rx0 rx0Var) {
        super(q8f.a);
        this.c = rx0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof s5d0) {
            ((s5d0) e0Var).V5(getItem(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new s5d0(tf3.b(viewGroup, R.layout.clips_template_gallery_picker_preview_item, viewGroup, false), this.c);
    }
}
