package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes4.dex */
public final class h361 implements zo31 {
    public final LinearLayout a;
    public final ToolbarView b;
    public final LoadableInput c;
    public final LoadableInput d;

    public h361(LinearLayout linearLayout, ToolbarView toolbarView, LoadableInput loadableInput, LoadableInput loadableInput2) {
        this.a = linearLayout;
        this.b = toolbarView;
        this.c = loadableInput;
        this.d = loadableInput2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
