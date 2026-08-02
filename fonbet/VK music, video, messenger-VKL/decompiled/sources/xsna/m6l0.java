package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: StickerSettingsPopupHolder.kt */
/* loaded from: classes6.dex */
public final class m6l0 extends qf6 {
    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        View view = this.itemView;
        boolean z = ((n6l0) hfzVar).c;
        view.setEnabled(z);
        View findViewById = this.itemView.findViewById(R.id.disabled_bg_view);
        if (findViewById != null) {
            bwt0.p0(findViewById, !z);
        }
    }
}
