package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: MusicTrackMenuRenderExtension.kt */
/* loaded from: classes3.dex */
public final class hd50 implements gm50 {
    public final Context b;
    public final yc50 c;
    public final ai6 d;
    public final View e;
    public final TextView f;
    public final View g;
    public final ThumbsImageView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public final DownloadingView n;
    public final TextView o;
    public final View p;
    public final View q;
    public final View r;
    public final vc50 s;

    public hd50(AudioManager audioManager, Context context, yc50 yc50Var, ai6 ai6Var) {
        this.b = context;
        this.c = yc50Var;
        this.d = ai6Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_track_menu, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.audio_bottom_sheet_header_remaining_time);
        this.g = inflate.findViewById(R.id.top_divider);
        this.h = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
        this.i = (TextView) inflate.findViewById(R.id.audio_title);
        this.j = (TextView) inflate.findViewById(R.id.audio_artist);
        this.k = (TextView) inflate.findViewById(R.id.adult_content_tv);
        this.l = (TextView) inflate.findViewById(R.id.foreign_agent_notice_tv);
        this.m = (LinearLayout) inflate.findViewById(R.id.actions_block);
        this.n = (DownloadingView) inflate.findViewById(R.id.downloading);
        this.o = (TextView) inflate.findViewById(R.id.label_downloading);
        View findViewById = inflate.findViewById(R.id.music_action_toggle_download);
        bwt0.i0(findViewById, new o3w(this, 19));
        this.p = findViewById;
        View findViewById2 = inflate.findViewById(R.id.music_action_broadcast);
        bwt0.i0(findViewById2, new j4x(this, 21));
        this.q = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.music_action_share);
        bwt0.i0(findViewById3, new yhu(this, 10));
        this.r = findViewById3;
        vc50 vc50Var = new vc50(audioManager, ai6Var);
        this.s = vc50Var;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(vc50Var);
        f4m.v(e3m.a(R.dimen.player_redesign_menu_bottom_padding, recyclerView.getContext()), recyclerView);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
