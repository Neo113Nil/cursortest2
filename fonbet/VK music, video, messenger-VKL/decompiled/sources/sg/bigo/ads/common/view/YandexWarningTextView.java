package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes9.dex */
public class YandexWarningTextView extends TextView {
    private int a;
    private int b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private int h;
    private float i;
    private int j;
    private int k;
    private final int l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.BigoAd_YandexWarningTextView);
            this.a = f.d(getContext(), obtainStyledAttributes.getDimensionPixelSize(R.styleable.BigoAd_YandexWarningTextView_bigo_ad_maxTextSize, this.a));
            this.b = f.d(getContext(), obtainStyledAttributes.getDimensionPixelSize(R.styleable.BigoAd_YandexWarningTextView_bigo_ad_minTextSize, this.b));
            obtainStyledAttributes.recycle();
        }
        this.j = f.c(getContext());
        this.k = f.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i = this.e;
        if (i > 2) {
            i = 2;
        }
        canvas.save();
        canvas.scale(1.0f, ((this.d * 1.0f) / i) / this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        super.onDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9 A[Catch: all -> 0x00ee, TryCatch #0 {all -> 0x00ee, blocks: (B:5:0x0007, B:10:0x0013, B:11:0x004e, B:13:0x0058, B:16:0x007d, B:18:0x00a6, B:23:0x00af, B:24:0x00d3, B:26:0x00d9, B:28:0x00dd, B:29:0x00df, B:34:0x00b8, B:35:0x00bd, B:41:0x00cf, B:42:0x005e, B:44:0x0065), top: B:4:0x0007 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
            this.d = paddingTop;
            float f = this.a;
            float f2 = paddingTop * 0.5f;
            this.c = f2;
            setLineSpacing(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            setTextSize(2, f);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, true);
            while (true) {
                if ((staticLayout.getHeight() > this.d || staticLayout.getWidth() > paddingLeft) && f > this.b) {
                    f -= 1.0f;
                    setTextSize(2, f);
                    staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, true);
                }
            }
            this.e = staticLayout.getLineCount();
            this.h = staticLayout.getLineAscent(0);
            this.f = f.b(getContext(), Math.round(f));
            int abs = Math.abs(this.h);
            boolean z = this.g;
            if (!z && 1 != (i5 = this.e)) {
                if (i5 >= 3) {
                    this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (f <= 36.0f) {
                        this.i = (abs * 1.0f) / i5;
                    }
                    this.i = abs * 1.1f;
                }
                if (this.k <= 1000 && this.j <= 1000) {
                    this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                setLineSpacing(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                getPaint().getTextScaleX();
                staticLayout.getLineTop(0);
            }
            if (z && f > 20.0f) {
                this.i = abs * 1.1f;
                if (this.k <= 1000) {
                }
                setLineSpacing(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                getPaint().getTextScaleX();
                staticLayout.getLineTop(0);
            }
            this.i = abs / 2.0f;
            if (this.k <= 1000) {
                this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            setLineSpacing(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            getPaint().getTextScaleX();
            staticLayout.getLineTop(0);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z) {
        this.g = z;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(attributeSet);
    }
}
