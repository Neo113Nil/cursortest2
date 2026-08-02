package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes4.dex */
public final class g361 implements zo31 {
    public final LinearLayout a;
    public final TextView b;
    public final LoadableInput c;
    public final ToolbarView d;

    public g361(LinearLayout linearLayout, TextView textView, LoadableInput loadableInput, ToolbarView toolbarView) {
        this.a = linearLayout;
        this.b = textView;
        this.c = loadableInput;
        this.d = toolbarView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
