package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import xsna.ja00;

/* compiled from: LyricsViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class rb00<T extends ja00> extends se50<T> {
    public rb00(Context context, int i) {
        super(LayoutInflater.from(context).inflate(i, (ViewGroup) null, false));
    }

    public final void l6(int i) {
        if (this.itemView.getLayoutParams() != null) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
