package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.x0;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class ncu0 extends x0 {
    public final ImageView N;
    public final Drawable O;
    public final xav P;
    public final int Q;
    public hhs0 R;
    public String S;
    public int T;
    public yn50 U;

    public ncu0(View view, xav xavVar) {
        super(view);
        ImageView imageView = (ImageView) view;
        this.N = imageView;
        this.P = xavVar;
        this.Q = view.getResources().getDimensionPixelSize(gvg0.emoji_strip_height);
        imageView.setOnClickListener(new eaj0(29, this));
        imageView.setOnLongClickListener(new ly4(11, this));
        Drawable t = vng.t(wwg0.msg_ic_stickers_stub, imageView.getContext());
        Objects.requireNonNull(t);
        this.O = t;
    }
}
