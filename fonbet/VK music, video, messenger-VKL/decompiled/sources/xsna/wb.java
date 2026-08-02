package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;

/* compiled from: AbsFriendsFragment.kt */
/* loaded from: classes15.dex */
public final class wb extends GridLayoutManager.c {
    public final /* synthetic */ AbsFriendsFragment<xqs, xb> d;

    public wb(AbsFriendsFragment<xqs, xb> absFriendsFragment) {
        this.d = absFriendsFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        xb xbVar = this.d.i0;
        if (xbVar != null) {
            return xbVar.v(i);
        }
        return 1;
    }
}
