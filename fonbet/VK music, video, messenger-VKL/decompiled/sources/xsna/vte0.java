package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: RadioMenuRenderExtension.kt */
/* loaded from: classes3.dex */
public final class vte0 implements gm50 {
    public final Context b;
    public final yc50 c;
    public final View d;
    public final TextView e;
    public final View f;
    public final ThumbsImageView g;
    public final TextView h;
    public final TextView i;
    public final vc50 j;

    public vte0(AudioManager audioManager, Context context, yc50 yc50Var, bi6 bi6Var) {
        this.b = context;
        this.c = yc50Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_radio_menu, (ViewGroup) null);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.audio_bottom_sheet_header_remaining_time);
        this.f = inflate.findViewById(R.id.top_divider);
        this.g = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
        this.h = (TextView) inflate.findViewById(R.id.audio_title);
        this.i = (TextView) inflate.findViewById(R.id.audio_artist);
        vc50 vc50Var = new vc50(audioManager, bi6Var);
        this.j = vc50Var;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(vc50Var);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
