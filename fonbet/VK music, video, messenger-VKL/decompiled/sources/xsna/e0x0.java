package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vzw0;
import xsna.zzw0;

/* compiled from: VoipSelectVideoPageErrorHolder.kt */
/* loaded from: classes7.dex */
public final class e0x0 extends yzw0<zzw0.d> {
    public final s0x0<vzw0.c> l;

    /* JADX WARN: Multi-variable type inference failed */
    public e0x0(ViewGroup viewGroup, s0x0<? super vzw0.c> s0x0Var) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = s0x0Var;
        bwt0.i0((TextView) this.itemView.findViewById(R.id.error_button), new i9u0(this, 10));
    }
}
