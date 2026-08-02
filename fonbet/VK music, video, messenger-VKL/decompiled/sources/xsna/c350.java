package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: MusicRecommendationResultOnBoardingDecorator.kt */
/* loaded from: classes3.dex */
public final class c350 extends RecyclerView.n {
    public final int b = cn70.b(52);
    public final int c = cn70.b(15);
    public final int d = cn70.b(20);
    public final int e;
    public final int f;
    public int g;

    public c350(int i) {
        int i2 = i / 2;
        this.e = i2;
        this.f = i2 - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int y = bwt0.y(R.dimen.music_recommendation_on_boarding_finish_image_size, view);
        int width = recyclerView.getWidth() + y;
        int i = this.e;
        int abs = Math.abs((width - (y * i)) / (i + 1));
        int i2 = this.d;
        if (abs <= i2) {
            abs = i2;
        }
        int i3 = this.g + 1;
        this.g = i3;
        int i4 = this.f;
        int i5 = this.c;
        int i6 = this.b;
        if (childLayoutPosition <= i4) {
            i2 = childLayoutPosition % 2 == 0 ? i6 : -(i6 + i5);
        } else if (i3 % 2 == 0) {
            i2 = -((i5 * 2) + i2 + i6);
        }
        rect.top = i2;
        rect.left = abs * i3;
        if (i3 == i) {
            this.g = 0;
        }
    }
}
