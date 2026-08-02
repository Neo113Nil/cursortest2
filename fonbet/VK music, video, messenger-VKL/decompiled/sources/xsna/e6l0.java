package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: StickerSettingsCaptionHolder.kt */
/* loaded from: classes6.dex */
public final class e6l0 extends qf6 {
    public final TextView l;

    public e6l0(ViewGroup viewGroup) {
        super(R.layout.sticker_settings_caption_item, viewGroup);
        this.l = (TextView) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        this.l.setText(((f6l0) hfzVar).c);
    }
}
