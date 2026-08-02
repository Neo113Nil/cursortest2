package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.vk.core.widget.LifecycleHandler;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: CreateChatPlaylistViewHolder.kt */
/* loaded from: classes15.dex */
public final class c7k extends vif0<s3q0> implements fsv<s3q0>, g380 {
    public final LifecycleHandler n;
    public final b5z o;
    public final Intent p;
    public dcn q;

    public c7k(ViewGroup viewGroup, LifecycleHandler lifecycleHandler, b5z b5zVar, Intent intent) {
        super(viewGroup, R.layout.music_create_chat_playlist_picker_button, 0);
        this.n = lifecycleHandler;
        this.o = b5zVar;
        this.p = intent;
        ((ThumbsImageView) this.itemView.findViewById(R.id.tiv_image)).setThumb(null);
        this.itemView.setId(R.id.music_create_chat_playlist_button);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.fsv
    public final void Ig(int i, s3q0 s3q0Var) {
        this.n.g(23, String.valueOf(this.o.b), this.p);
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(s3q0 s3q0Var) {
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        dcn dcnVar = this.q;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
