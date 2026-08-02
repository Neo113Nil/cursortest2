package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.zzw0;

/* compiled from: VoipSelectVideoListLoadingHolder.kt */
/* loaded from: classes7.dex */
public final class a0x0 extends yzw0<zzw0.c> {
    public final TextView l;

    public a0x0(ViewGroup viewGroup) {
        super(R.layout.voip_watch_movie_list_loading_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.voip_select_video_loading_text);
    }

    @Override // xsna.yzw0, xsna.vfz
    public final void W5(hfz hfzVar) {
        this.l.setText(((zzw0.c) hfzVar).b);
    }
}
