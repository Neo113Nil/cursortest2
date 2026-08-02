package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.ListItemButton;

/* loaded from: classes4.dex */
public final class e261 implements zo31 {
    public final ListItemButton a;
    public final TextView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;

    public e261(ListItemButton listItemButton, TextView textView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.a = listItemButton;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
