package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderOpenCatalogHolder.kt */
/* loaded from: classes6.dex */
public final class tfy extends qf6 {
    public final y4l0 l;
    public final TextView m;

    public tfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_header_open_catalog_item, 0);
        this.l = y4l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.open_catalog_button);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        this.m.setOnClickListener(new com.vk.movika.sdk.android.defaultplayer.control.i(2, this, (ufy) hfzVar));
    }
}
