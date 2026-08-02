package xsna;

import android.view.ViewGroup;
import com.vk.core.view.ProgressButton;
import com.vkontakte.android.R;

/* compiled from: StickersReloadHolder.kt */
/* loaded from: classes6.dex */
public final class fcl0 extends qf6 {
    public final com.vk.stickers.settings.g l;
    public final ProgressButton m;

    public fcl0(ViewGroup viewGroup, com.vk.stickers.settings.g gVar) {
        super(R.layout.sticker_settings_reload_item, viewGroup);
        this.l = gVar;
        ProgressButton progressButton = (ProgressButton) this.itemView.findViewById(R.id.refresh_button);
        this.m = progressButton;
        jjc.g(progressButton, new nl30(this, 29));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        boolean z = ((o6l0) hfzVar).c;
        ProgressButton progressButton = this.m;
        progressButton.S(z);
        progressButton.setEnabled(!z);
    }
}
