package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: LyricsErrorVh.kt */
/* loaded from: classes3.dex */
public final class ga00 extends rb00<la00> {
    public final a07 n;

    public ga00(Context context, mb40 mb40Var) {
        super(context, R.layout.item_lyrics_error);
        this.n = mb40Var;
        bwt0.i0(this.itemView.findViewById(R.id.retry), new fa00(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void a6() {
        la00 la00Var = (la00) this.l;
        l6(la00Var != null ? la00Var.a : -2);
        this.itemView.requestLayout();
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        l6(((la00) obj).a);
    }
}
