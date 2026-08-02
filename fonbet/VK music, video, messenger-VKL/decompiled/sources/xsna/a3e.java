package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;

/* compiled from: ClipsFavoriteFolderContentListFragment.kt */
/* loaded from: classes16.dex */
public final class a3e extends GridLayoutManager.c {
    public final /* synthetic */ ClipsFavoriteFolderContentListFragment d;

    public a3e(ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment) {
        this.d = clipsFavoriteFolderContentListFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        int i2 = ClipsFavoriteFolderContentListFragment.W;
        hfz hfzVar = ((v2e) this.d.U.getValue()).h.f.get(i);
        if ((hfzVar instanceof e3e) || (hfzVar instanceof d3e)) {
            return 3;
        }
        if (hfzVar instanceof c3e) {
            return 1;
        }
        throw new IllegalArgumentException("Unsupported item type " + hfzVar);
    }
}
