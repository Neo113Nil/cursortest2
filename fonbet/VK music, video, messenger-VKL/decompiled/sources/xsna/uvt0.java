package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uvt0 implements View.OnClickListener {
    public final /* synthetic */ long b;
    public final /* synthetic */ View.OnClickListener c;

    public /* synthetic */ uvt0(long j, View.OnClickListener onClickListener) {
        this.b = j;
        this.c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (bwt0.B().b(this.b)) {
            return;
        }
        this.c.onClick(view);
    }
}
