package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u58 implements View.OnLongClickListener {
    public final /* synthetic */ w58 b;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.b.d;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(view);
        }
        return false;
    }
}
