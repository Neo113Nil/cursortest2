package xsna;

import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vkontakte.android.R;

/* compiled from: ArchiveWithChannelsFragment.kt */
/* loaded from: classes15.dex */
public final class pj3 extends ViewPager2.g {
    public final /* synthetic */ li3 d;
    public final /* synthetic */ ArchiveWithChannelsFragment e;

    public pj3(li3 li3Var, ArchiveWithChannelsFragment archiveWithChannelsFragment) {
        this.d = li3Var;
        this.e = archiveWithChannelsFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        int i2 = this.d.o;
        ArchiveWithChannelsFragment archiveWithChannelsFragment = this.e;
        if (i == i2) {
            Menu menu = archiveWithChannelsFragment.U;
            MenuItem findItem = (menu != null ? menu : null).findItem(R.id.search);
            if (findItem != null) {
                findItem.setVisible(false);
                return;
            }
            return;
        }
        Menu menu2 = archiveWithChannelsFragment.U;
        MenuItem findItem2 = (menu2 != null ? menu2 : null).findItem(R.id.search);
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
    }
}
