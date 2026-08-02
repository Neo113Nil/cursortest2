package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: FooterErrorHolder.kt */
/* loaded from: classes16.dex */
public final class j6s extends vfz<x4e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.picker.a, s3q0> l;

    public j6s(ViewGroup viewGroup, qr0 qr0Var) {
        super(R.layout.clips_favorites_folders_picker_footer_error, viewGroup);
        this.l = qr0Var;
        jjc.g(this.itemView.findViewById(R.id.clips_favorites_footer_error_retry), new sop(this, 5));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(x4e x4eVar) {
    }
}
