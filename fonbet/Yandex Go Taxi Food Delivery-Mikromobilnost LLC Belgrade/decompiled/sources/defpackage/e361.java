package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.widgets.common.TextsHolder;

/* loaded from: classes4.dex */
public final class e361 implements zo31 {
    public final TextsHolder a;
    public final TextView b;
    public final TextView c;

    public e361(TextsHolder textsHolder, TextView textView, TextView textView2) {
        this.a = textsHolder;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
