package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.fragments.SettingsListFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.kjf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v2j0 implements izs {
    public final /* synthetic */ SettingsListFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ v2j0(SettingsListFragment settingsListFragment, int i) {
        this.b = settingsListFragment;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = SettingsListFragment.X0;
        SettingsListFragment settingsListFragment = this.b;
        UsableRecyclerView usableRecyclerView = settingsListFragment.n0;
        RecyclerView.Adapter adapter = usableRecyclerView != null ? usableRecyclerView.getAdapter() : null;
        if (adapter instanceof SettingsListFragment.f) {
            SettingsListFragment.f fVar = (SettingsListFragment.f) adapter;
            int i2 = this.c;
            kjf0.a a = kjf0.a.a(1, settingsListFragment.Lo(i2));
            if (i2 < 0) {
                fVar.getClass();
            } else if (i2 < fVar.x0().size()) {
                fVar.x0().set(i2, a);
                fVar.notifyItemChanged(i2);
            }
        }
        return s3q0.a;
    }
}
