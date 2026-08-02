package xsna;

import android.widget.TextView;
import xsna.ifz;

/* compiled from: ListViewHolderLabel.kt */
/* loaded from: classes7.dex */
public final class lgz extends kgz<ifz.a> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public lgz(TextView textView) {
        super(textView);
        this.m = textView;
    }

    @Override // xsna.kgz
    public final void W5(ifz.a aVar) {
        this.m.setText(aVar.a);
    }
}
