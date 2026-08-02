package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.zzw0;

/* compiled from: VoipSelectVideoNoItemsHolder.kt */
/* loaded from: classes7.dex */
public final class d0x0 extends yzw0<zzw0.a> {
    public final ImageView l;
    public final TextView m;
    public final TextView n;

    public d0x0(ViewGroup viewGroup) {
        super(R.layout.voip_watch_movie_empty_list, viewGroup);
        this.l = (ImageView) this.itemView.findViewById(R.id.voip_watch_movie_empty_icon);
        this.m = (TextView) this.itemView.findViewById(R.id.voip_watch_movie_empty_title);
        this.n = (TextView) this.itemView.findViewById(R.id.voip_watch_movie_empty_description);
    }

    @Override // xsna.yzw0, xsna.vfz
    public final void W5(hfz hfzVar) {
        zzw0.a aVar = (zzw0.a) hfzVar;
        String str = aVar.b;
        int i = (str == null || str.length() == 0) ? 8 : 0;
        TextView textView = this.m;
        textView.setVisibility(i);
        textView.setText(str);
        this.n.setText(aVar.c);
        this.l.setImageResource(R.drawable.vk_icon_video_outline_56);
    }
}
