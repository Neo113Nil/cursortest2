package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import java.util.ArrayList;

/* compiled from: CommentThreadFragment.kt */
/* loaded from: classes4.dex */
public final class scg extends RecyclerView.t {
    public final /* synthetic */ CommentThreadFragment b;

    public scg(CommentThreadFragment commentThreadFragment) {
        this.b = commentThreadFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList<dl60> arrayList = CommentThreadFragment.y0;
        ((yif0) this.b.w0.getValue()).a(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
