package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ModerationItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class p530 {
    public final View a;
    public final VKImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;

    public /* synthetic */ p530(View view, VKImageView vKImageView, TextView textView, TextView textView2, TextView textView3, int i) {
        this(view, vKImageView, (i & 4) != 0 ? null : textView, (i & 8) != 0 ? null : textView2, (i & 16) != 0 ? null : textView3, (View) null);
    }

    public p530(View view, VKImageView vKImageView, TextView textView, TextView textView2, TextView textView3, View view2) {
        this.a = view;
        this.b = vKImageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = view2;
    }
}
