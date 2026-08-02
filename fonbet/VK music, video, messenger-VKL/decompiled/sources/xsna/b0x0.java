package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.vzw0;
import xsna.zzw0;

/* compiled from: VoipSelectVideoMovieHolder.kt */
/* loaded from: classes7.dex */
public final class b0x0 extends yzw0<zzw0.h> {
    public final s0x0<vzw0.d> l;
    public final VKImageView m;
    public final VKImageView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    /* JADX WARN: Multi-variable type inference failed */
    public b0x0(ViewGroup viewGroup, s0x0<? super vzw0.d> s0x0Var) {
        super(R.layout.voip_watch_movie_select_video_item, viewGroup);
        this.l = s0x0Var;
        this.m = (VKImageView) this.itemView.findViewById(R.id.voip_video_preview);
        this.n = (VKImageView) this.itemView.findViewById(R.id.voip_unavailable_preview_bg);
        this.o = (TextView) this.itemView.findViewById(R.id.voip_video_preview_title);
        this.p = (TextView) this.itemView.findViewById(R.id.voip_video_preview_unavailable_video);
        this.q = (TextView) this.itemView.findViewById(R.id.voip_video_preview_subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.voip_video_preview_author_name);
        this.s = (TextView) this.itemView.findViewById(R.id.voip_video_preview_duration);
    }

    @Override // xsna.yzw0, xsna.vfz
    /* renamed from: W5 */
    public final void h6(hfz hfzVar) {
        p3x0 p3x0Var = ((zzw0.h) hfzVar).b;
        this.o.setText(p3x0Var.c);
        this.q.setText(p3x0Var.d);
        this.r.setText(p3x0Var.f);
        boolean z = p3x0Var.a != 0;
        this.n.setVisibility(!z ? 0 : 8);
        float f = z ? 1.0f : 0.2f;
        VKImageView vKImageView = this.m;
        vKImageView.setAlpha(f);
        int i = z ? 0 : 8;
        TextView textView = this.s;
        textView.setVisibility(i);
        this.p.setVisibility(z ? 8 : 0);
        long j = p3x0Var.g;
        textView.setBackgroundResource(j < 0 ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old);
        textView.setText(his0.h(j, textView.getContext()));
        vKImageView.s0(p3x0Var.i);
        vKImageView.setContentDescription(p3x0Var.c);
        bwt0.i0(this.itemView, new prd0(10, p3x0Var, this));
    }
}
