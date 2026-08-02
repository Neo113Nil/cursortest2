package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;

/* compiled from: ClipsFavoriteFoldersListFragment.kt */
/* loaded from: classes16.dex */
public final class s3e extends GridLayoutManager.c {
    public final /* synthetic */ ClipsFavoriteFoldersListFragment d;

    public s3e(ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment) {
        this.d = clipsFavoriteFoldersListFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        int i2 = ClipsFavoriteFoldersListFragment.U;
        ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = this.d;
        m3e m3eVar = (m3e) clipsFavoriteFoldersListFragment.T.getValue();
        int intValue = ((Number) clipsFavoriteFoldersListFragment.S.getValue()).intValue();
        hfz hfzVar = m3eVar.h.get(i);
        if ((hfzVar instanceof x3e) || (hfzVar instanceof w3e) || (hfzVar instanceof u3e)) {
            return intValue;
        }
        if (hfzVar instanceof v3e) {
            return 1;
        }
        throw new IllegalArgumentException("Unsupported item type " + hfzVar);
    }
}
