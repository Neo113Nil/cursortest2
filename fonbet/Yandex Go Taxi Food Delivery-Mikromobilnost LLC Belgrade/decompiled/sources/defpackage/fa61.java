package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes2.dex */
public final class fa61 implements zo31 {
    public final TransferToolbarView a;
    public final ToolbarView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final SpoilerTextView f;
    public final View g;
    public final TextView h;
    public final TextView i;

    public fa61(TransferToolbarView transferToolbarView, ToolbarView toolbarView, ImageView imageView, ImageView imageView2, TextView textView, SpoilerTextView spoilerTextView, View view, TextView textView2, TextView textView3) {
        this.a = transferToolbarView;
        this.b = toolbarView;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = spoilerTextView;
        this.g = view;
        this.h = textView2;
        this.i = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
