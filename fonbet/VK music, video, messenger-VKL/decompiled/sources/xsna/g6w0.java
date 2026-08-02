package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VmojiCharacterCaptionHolder.kt */
/* loaded from: classes7.dex */
public final class g6w0 extends u6w0<h6w0> {
    public final TextView l;

    public g6w0(ViewGroup viewGroup) {
        super(R.layout.vmoji_character_caption_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.title);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        this.l.setText(this.itemView.getContext().getString(((h6w0) hfzVar).b, null));
    }
}
