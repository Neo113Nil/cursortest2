package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: StoryBackgroundItemsMeasurer.kt */
/* loaded from: classes16.dex */
public final class ryl0 {
    public final int a = iah0.a(13);
    public final int b;
    public final int c;
    public final int d;
    public final k9x e;
    public final int f;

    public ryl0(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.story_background_editor_items_margin) * 2;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.story_background_editor_items_height) + dimensionPixelSize;
        int a = iah0.a(8) - dimensionPixelSize;
        this.c = a;
        int a2 = iah0.a(12) - dimensionPixelSize;
        this.d = a2;
        this.e = new k9x(a, a2, 1);
        this.f = iah0.f().widthPixels;
    }

    public final int a(int i, int i2) {
        int i3 = this.d;
        if (i > i3) {
            return i3;
        }
        k9x k9xVar = this.e;
        int i4 = k9xVar.b;
        if (i <= k9xVar.c && i4 <= i) {
            return i;
        }
        if (i2 == 0) {
            return this.c;
        }
        int i5 = this.f - this.a;
        int i6 = i2 - 1;
        int i7 = this.b;
        return a(an10.b(((i5 - (i7 * i6)) - (i7 / 2)) / i6), i6);
    }
}
