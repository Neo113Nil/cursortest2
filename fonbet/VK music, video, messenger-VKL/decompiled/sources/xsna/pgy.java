package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: KeyboardNoteViewHolder.kt */
/* loaded from: classes6.dex */
public final class pgy extends qf6 {
    public final TextView l;
    public final View m;

    public pgy(ViewGroup viewGroup) {
        super(viewGroup, R.layout.sticker_keyboard_note, 0);
        this.l = (TextView) this.itemView.findViewById(R.id.note);
        View findViewById = this.itemView.findViewById(R.id.note_container);
        this.m = findViewById;
        findViewById.setBackgroundColor(l8g.f(0.4f, dhr0.Y(R.attr.vk_ui_background_tertiary, this.itemView.getContext())));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        this.l.setText(((qgy) hfzVar).b);
    }
}
