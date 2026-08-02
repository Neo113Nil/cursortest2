package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes4.dex */
public final class e961 implements zo31 {
    public final ToolbarView a;
    public final CloseButtonView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final LinearLayout f;
    public final SpoilerTextView g;
    public final TextView h;
    public final FrameLayout i;
    public final AppCompatImageView j;
    public final TextView k;

    public e961(ToolbarView toolbarView, CloseButtonView closeButtonView, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, SpoilerTextView spoilerTextView, TextView textView2, FrameLayout frameLayout, AppCompatImageView appCompatImageView, TextView textView3) {
        this.a = toolbarView;
        this.b = closeButtonView;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = linearLayout;
        this.g = spoilerTextView;
        this.h = textView2;
        this.i = frameLayout;
        this.j = appCompatImageView;
        this.k = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
