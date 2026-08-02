package xsna;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EditorBottomMultiStoriesView.kt */
/* loaded from: classes16.dex */
public final class r3p extends RecyclerView.t {
    public final /* synthetic */ s3p b;

    public r3p(s3p s3pVar) {
        this.b = s3pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        s3p s3pVar = this.b;
        if (i != 1) {
            s3pVar.b();
            return;
        }
        ImageView imageView = s3pVar.h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
