package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class c161 implements zo31 {
    public final LinearLayout a;
    public final YbButtonView b;
    public final TextView c;
    public final f361 d;
    public final RecyclerView e;

    public c161(LinearLayout linearLayout, YbButtonView ybButtonView, TextView textView, f361 f361Var, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = ybButtonView;
        this.c = textView;
        this.d = f361Var;
        this.e = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
