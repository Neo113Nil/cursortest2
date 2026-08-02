package xsna;

import android.content.Context;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: LyricsInterludeVh.kt */
/* loaded from: classes3.dex */
public final class ia00 extends rb00<ma00> {
    public final a07 n;
    public final ImageView o;

    public ia00(Context context, mb40 mb40Var) {
        super(context, R.layout.item_lyrics_interlude_line);
        this.n = mb40Var;
        this.o = (ImageView) this.itemView.findViewById(R.id.interlude_icon);
        jjc.g(this.itemView, new m1k(this, 20));
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        this.o.setAlpha(((ma00) obj).c ? 1.0f : 0.4f);
    }
}
