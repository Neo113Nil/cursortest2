package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: VmojiCharacterLoadingHolders.kt */
/* loaded from: classes7.dex */
public final class s6w0 extends c7w0<t6w0> {
    public final View l;

    public s6w0(ViewGroup viewGroup) {
        super(R.layout.vmoji_character_header_loading_item, viewGroup);
        this.l = this.itemView.findViewById(R.id.edit);
    }

    @Override // xsna.c7w0, xsna.vfz
    public final void W5(hfz hfzVar) {
        bwt0.p0(this.l, ((t6w0) hfzVar).b);
    }

    @Override // xsna.c7w0
    /* renamed from: h6 */
    public final void W5(t6w0 t6w0Var) {
        bwt0.p0(this.l, t6w0Var.b);
    }
}
