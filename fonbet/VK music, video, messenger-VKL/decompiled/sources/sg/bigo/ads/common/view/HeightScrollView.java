package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes9.dex */
public class HeightScrollView extends ScrollView {
    private a a;
    private boolean b;
    private View c;
    private int d;

    public interface a {
        void a(int i);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.b = true;
        this.d = 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        View view = this.c;
        if (view != null) {
            this.d = view.getHeight() - i2;
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.b) {
            return false;
        }
        if (this.c == null || y >= this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBlankView(View view) {
        this.c = view;
    }

    public void setOnScrollListener(a aVar) {
        this.a = aVar;
    }

    public void setScrollEnable(boolean z) {
        this.b = z;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = 0;
    }
}
