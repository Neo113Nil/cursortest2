package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: CardView.kt */
/* loaded from: classes13.dex */
public class au9 extends FrameLayout {
    public final float b;
    public final View c;
    public final View d;

    public au9(Context context, int i) {
        super(context, null, 0);
        this.b = 0.75f;
        if (i != 0) {
            LayoutInflater.from(context).inflate(i, this);
        }
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        int a = gbg0.a(getResources(), 8.0f);
        setPadding(a, a, a, gbg0.a(getResources(), 16.0f));
        this.c = findViewById(R.id.user_discover_foreground);
        this.d = findViewById(R.id.user_discover_info_container);
    }

    public final View getForegroundView() {
        return this.c;
    }

    public final View getInfoView() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + View.MeasureSpec.getSize(i);
        float f = this.b;
        int i3 = (int) (paddingRight / f);
        if (i3 > paddingBottom) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingBottom * f), 1073741824);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
    }
}
