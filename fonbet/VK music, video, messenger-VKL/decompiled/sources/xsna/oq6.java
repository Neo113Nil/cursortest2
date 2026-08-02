package xsna;

import android.widget.TextView;

/* compiled from: BaseVideoCommentViewHolder.kt */
/* loaded from: classes4.dex */
public final class oq6 implements gzs<s3q0> {
    public final /* synthetic */ pq6 b;
    public final /* synthetic */ CharSequence c;

    public oq6(pq6 pq6Var, CharSequence charSequence) {
        this.b = pq6Var;
        this.c = charSequence;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        int i = pq6.W;
        TextView textView = this.b.A;
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setText(this.c);
        return s3q0.a;
    }
}
