package xsna;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.dto.podcast.PodcastInfo;
import com.vkontakte.android.R;

/* compiled from: TabletPodcastPageToolbarViewController.kt */
/* loaded from: classes3.dex */
public final class xxn0 extends fib0 {
    public final TextView b;
    public final MenuItem c;

    public xxn0(View view, final gjb0 gjb0Var) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.b = (TextView) view.findViewById(R.id.playlist_collapsed_title);
        MenuItem add = toolbar.getMenu().add(0, R.id.playlist_menu, 0, "");
        this.c = add;
        add.setIcon(dhr0.t.b(R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_accent_themed));
        add.setShowAsAction(2);
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.wxn0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                gjb0 gjb0Var2 = gjb0.this;
                if (gjb0Var2 == null) {
                    return true;
                }
                gjb0Var2.E0();
                return true;
            }
        });
        n720.a(add, view.getContext().getString(R.string.accessibility_actions));
        add.setEnabled(false);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setIcon(dhr0.t.b(R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_accent_themed));
    }

    @Override // xsna.fib0
    public final void a(PodcastInfo podcastInfo) {
        this.b.setText(podcastInfo.b);
        this.c.setEnabled(true);
    }
}
