package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vzw0;
import xsna.zzw0;

/* compiled from: VoipSelectVideoErrorHolder.kt */
/* loaded from: classes7.dex */
public final class wzw0 extends yzw0<zzw0.b> {
    public final s0x0<vzw0.b> l;
    public final TextView m;

    /* JADX WARN: Multi-variable type inference failed */
    public wzw0(ViewGroup viewGroup, s0x0<? super vzw0.b> s0x0Var) {
        super(R.layout.voip_video_load_error_item, viewGroup);
        this.l = s0x0Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.voip_watch_video_error_retry_button);
        this.m = (TextView) this.itemView.findViewById(R.id.voip_watch_video_error_title);
        bwt0.i0(textView, new b8j0(this, 28));
    }

    @Override // xsna.yzw0, xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        this.m.setText(((zzw0.b) hfzVar).b);
    }
}
