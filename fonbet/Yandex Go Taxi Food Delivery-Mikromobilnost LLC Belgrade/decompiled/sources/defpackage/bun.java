package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.emoji2.emojipicker.EmojiView;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class bun {
    public int[][] a;

    public void a() {
    }

    public void b() {
    }

    public void c() {
        EmojiView emojiView;
        int[][] iArr = this.a;
        if (iArr == null) {
            iArr = null;
        }
        for (int[] iArr2 : iArr) {
            LinearLayout linearLayout = new LinearLayout(d());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            for (int i : iArr2) {
                if (i == 0) {
                    emojiView = new EmojiView(d(), null, 2, null);
                } else {
                    EmojiView emojiView2 = new EmojiView(d(), null, 2, null);
                    emojiView2.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
                    emojiView2.setEmoji((CharSequence) j().get(i - 1));
                    emojiView2.setOnClickListener(e());
                    if (i == 1) {
                        h().post(new uhm(20, emojiView2));
                    }
                    emojiView = emojiView2;
                }
                emojiView.setLayoutParams(new ViewGroup.LayoutParams(i().getWidth(), i().getHeight()));
                linearLayout.addView(emojiView);
            }
            h().addView(linearLayout);
        }
    }

    public abstract Context d();

    public abstract View.OnClickListener e();

    public abstract int f();

    public abstract int g();

    public abstract LinearLayout h();

    public abstract View i();

    public abstract List j();
}
