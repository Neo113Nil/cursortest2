package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: LyricsTimecodeLineVh.kt */
/* loaded from: classes3.dex */
public final class qb00 extends rb00<qa00> {
    public final a07 n;
    public final TextView o;

    public qb00(Context context, mb40 mb40Var) {
        super(context, R.layout.item_lyrics_timecode_line);
        this.n = mb40Var;
        View view = this.itemView;
        TextView textView = (TextView) view;
        this.o = textView;
        jjc.g(view, new pb00(this, 0));
        com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(24.0f), 4);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        qa00 qa00Var = (qa00) obj;
        String str = qa00Var.a;
        TextView textView = this.o;
        textView.setText(str);
        textView.setAlpha(qa00Var.d ? 1.0f : 0.4f);
    }
}
