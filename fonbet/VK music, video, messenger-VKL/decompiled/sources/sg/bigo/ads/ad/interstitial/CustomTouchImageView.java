package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes9.dex */
public class CustomTouchImageView extends ImageView {
    private AdCountDownButton.a a;
    private Rect b;
    private float c;
    private boolean d;

    public CustomTouchImageView(Context context) {
        super(context);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d && motionEvent.getAction() == 0) {
            if (this.c == 1.0f) {
                AdCountDownButton.a aVar = this.a;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
            float x = (int) motionEvent.getX();
            float y = (int) motionEvent.getY();
            float f = this.c;
            float width = getWidth();
            float f2 = width * f;
            float height = getHeight();
            float f3 = f * height;
            float f4 = (width - f2) / 2.0f;
            float f5 = (height - f3) / 2.0f;
            float f6 = f2 + f4;
            float f7 = f3 + f5;
            if (x >= f4 && x <= f6 && y >= f5 && y <= f7) {
                AdCountDownButton.a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return true;
            }
            getGlobalVisibleRect(this.b);
            AdCountDownButton.a aVar3 = this.a;
            if (aVar3 != null) {
                aVar3.a(this.b);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.d = z;
    }

    public void setCloseListener(AdCountDownButton.a aVar) {
        this.a = aVar;
    }

    public void setRegionScale(float f) {
        this.c = f;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }

    public CustomTouchImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.c = 1.0f;
        this.d = true;
    }
}
