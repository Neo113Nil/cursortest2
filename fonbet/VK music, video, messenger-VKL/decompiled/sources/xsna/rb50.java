package xsna;

import android.view.MenuItem;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class rb50 implements fsv<MusicTrack> {
    public final /* synthetic */ qb50 b;

    public rb50(qb50 qb50Var) {
        this.b = qb50Var;
    }

    @Override // xsna.fsv
    public final void Ig(int i, MusicTrack musicTrack) {
        qb50 qb50Var = this.b;
        qb50Var.g.a(qb50Var.e);
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
