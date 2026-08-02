package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vkontakte.android.R;
import xsna.s6a0;

/* compiled from: PhotoEditorPickerLargePreviewAdapter.kt */
/* loaded from: classes5.dex */
public final class t6a0 extends androidx.recyclerview.widget.x<s6a0.a, RecyclerView.e0> {
    public static final a e = new a();
    public final q6a0 c;
    public final sly d;

    /* compiled from: PhotoEditorPickerLargePreviewAdapter.kt */
    public static final class a extends m.e<s6a0.a> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(s6a0.a aVar, s6a0.a aVar2) {
            return aVar.equals(aVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(s6a0.a aVar, s6a0.a aVar2) {
            return aVar.a.getId() == aVar2.a.getId();
        }
    }

    public t6a0(q6a0 q6a0Var, sly slyVar) {
        super(e);
        this.c = q6a0Var;
        this.d = slyVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (!(e0Var instanceof s6a0)) {
            throw new IllegalStateException("Invalid holder type");
        }
        ((s6a0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new s6a0(tf3.b(viewGroup, R.layout.photo_editor_gallery_picker_large_preview_item, viewGroup, false), this.c, this.d);
    }
}
