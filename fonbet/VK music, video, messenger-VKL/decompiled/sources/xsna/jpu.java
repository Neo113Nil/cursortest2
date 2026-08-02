package xsna;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.group.GroupsCollectionHeaderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jpu implements AppBarLayout.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ CatalogViewHolder c;

    public /* synthetic */ jpu(CatalogViewHolder catalogViewHolder, int i) {
        this.b = i;
        this.c = catalogViewHolder;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i) {
        l4v0 l4v0Var;
        switch (this.b) {
            case 0:
                GroupsCollectionHeaderVh groupsCollectionHeaderVh = (GroupsCollectionHeaderVh) this.c;
                if (appBarLayout.getTotalScrollRange() != 0) {
                    int abs = Math.abs(i) - appBarLayout.getTotalScrollRange();
                    Toolbar toolbar = groupsCollectionHeaderVh.e;
                    if (toolbar == null) {
                        toolbar = null;
                    }
                    if (abs <= (-toolbar.getHeight())) {
                        Toolbar toolbar2 = groupsCollectionHeaderVh.e;
                        if (toolbar2 == null) {
                            toolbar2 = null;
                        }
                        Drawable navigationIcon = toolbar2.getNavigationIcon();
                        baf0 baf0Var = navigationIcon instanceof baf0 ? (baf0) navigationIcon : null;
                        if (baf0Var != null) {
                            baf0Var.a(-1);
                            break;
                        }
                    } else {
                        Toolbar toolbar3 = groupsCollectionHeaderVh.e;
                        if (toolbar3 == null) {
                            toolbar3 = null;
                        }
                        Drawable navigationIcon2 = toolbar3.getNavigationIcon();
                        baf0 baf0Var2 = navigationIcon2 instanceof baf0 ? (baf0) navigationIcon2 : null;
                        if (baf0Var2 != null) {
                            Toolbar toolbar4 = groupsCollectionHeaderVh.e;
                            baf0Var2.a(dhr0.Y(R.attr.vk_ui_icon_accent_themed, (toolbar4 != null ? toolbar4 : null).getContext()));
                            break;
                        }
                    }
                }
                break;
            default:
                MusicHidingToolbarVh musicHidingToolbarVh = (MusicHidingToolbarVh) this.c;
                if (musicHidingToolbarVh.q && (l4v0Var = musicHidingToolbarVh.n) != null) {
                    l4v0Var.e();
                }
                float min = Math.min(((-i) / 100.0f) * 255.0f, 255.0f);
                if (min != musicHidingToolbarVh.p) {
                    musicHidingToolbarVh.p = min;
                    musicHidingToolbarVh.E.c();
                    break;
                }
                break;
        }
    }
}
