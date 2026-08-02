package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.internal.view.input.emojipanel.EmojiView;
import com.yandex.messaging.internal.view.input.emojipanel.a;
import com.yandex.messaging.internal.view.stickers.StickersView;

/* loaded from: classes15.dex */
public final class mae0 {
    public final Activity a;
    public final xav b;
    public final a c;
    public final int d;
    public int e;
    public final int f;
    public final ImageView g;
    public final EmojiView h;
    public final LinearLayout i;
    public e1k j;
    public AnimatorSet k;
    public AnimatorSet l;
    public PopupWindow m;
    public StickersView n;

    public mae0(Activity activity, xav xavVar, a aVar) {
        this.a = activity;
        this.b = xavVar;
        this.c = aVar;
        int dimension = (int) activity.getResources().getDimension(gvg0.emoji_view_size);
        this.d = dimension;
        this.e = activity.getResources().getDimensionPixelSize(gvg0.max_sticker_size);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(gvg0.min_sticker_size);
        this.f = dimensionPixelSize;
        ImageView imageView = new ImageView(activity);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.g = imageView;
        EmojiView emojiView = new EmojiView(activity);
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(dimension, dimension));
        this.h = emojiView;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor((drb1.c(jng0.messagingViewerBackgroundColor, linearLayout.getContext()) & 16777215) | 2130706432);
        linearLayout.setGravity(81);
        linearLayout.setOrientation(1);
        linearLayout.addView(emojiView);
        linearLayout.addView(imageView);
        this.i = linearLayout;
    }

    public final void a(String str, String str2, boolean z) {
        g9v load = this.b.load(b.f(str));
        int i = this.e;
        yn50 yn50Var = (yn50) load;
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = i;
        xn50Var.j = i;
        xn50Var.k = ScaleMode.FIT_CENTER;
        e1k e1kVar = this.j;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.j = null;
        this.j = this.c.a(new vfc0(4, this), str2, this.d);
        ImageView imageView = this.g;
        if (z) {
            yn50Var.b(imageView, new dnh(5, this));
        } else {
            yn50Var.b(imageView, null);
        }
    }
}
