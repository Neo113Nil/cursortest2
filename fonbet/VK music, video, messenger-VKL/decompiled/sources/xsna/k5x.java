package xsna;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: InspectorFAB.kt */
/* loaded from: classes17.dex */
public final class k5x extends FrameLayout {
    public static final /* synthetic */ int b = 0;

    /* compiled from: InspectorFAB.kt */
    public static final class a {
        public static void a(Activity activity, gzs gzsVar) {
            if (activity.findViewById(R.id.fab_id) == null) {
                k5x k5xVar = new k5x(activity, null, 0);
                k5xVar.setClipChildren(false);
                k5xVar.setClipToPadding(false);
                int a = iah0.a(56);
                FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setBackgroundResource(R.drawable.bg_di_fab);
                k5xVar.addView(frameLayout, new FrameLayout.LayoutParams(a, a));
                frameLayout.addView(new b(activity), new FrameLayout.LayoutParams(-1, -1));
                k5xVar.setTranslationY(iah0.f().heightPixels * 0.87f);
                k5xVar.setTranslationX((iah0.f().widthPixels - a) - iah0.a(16));
                k5xVar.setAlpha(0.5f);
                k5xVar.setId(R.id.fab_id);
                activity.getWindow().addContentView(k5xVar, new ViewGroup.LayoutParams(-2, -2));
                k5xVar.setOnClickListener(new aj6(gzsVar));
            }
        }
    }

    /* compiled from: InspectorFAB.kt */
    public static final class b extends View {
        public final bpn0 b;
        public final float c;
        public final float d;

        public b(Activity activity) {
            super(activity, null, 0);
            this.b = new bpn0(new l5x(activity, 0));
            this.c = iah0.a(16.0f);
            this.d = iah0.a(24.0f);
        }

        private final Paint getTextPaint() {
            return (Paint) this.b.getValue();
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            new Handler(Looper.getMainLooper()).postDelayed(new vb(this, 11), 2500L);
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = 2.0f;
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float f2 = 0.85f;
            float measureText = getTextPaint().measureText("Design") * 0.85f;
            float f3 = this.c;
            float f4 = 6.2831855f;
            float f5 = 360.0f;
            float f6 = 360.0f / (f3 * 6.2831855f);
            float f7 = 270.0f - ((measureText * f6) / 2.0f);
            int i = 0;
            while (i < 6) {
                char charAt = "Design".charAt(i);
                float f8 = f2;
                float f9 = f4;
                float measureText2 = getTextPaint().measureText(String.valueOf(charAt)) * f6 * f8;
                float f10 = (measureText2 / f) + f7;
                float f11 = f5;
                double radians = Math.toRadians(f10);
                float f12 = height;
                float cos = (((float) Math.cos(radians)) * f3) + width;
                float sin = (((float) Math.sin(radians)) * f3) + f12;
                canvas.save();
                canvas.translate(cos, sin);
                canvas.rotate(f10 + 90.0f);
                canvas.drawText(String.valueOf(charAt), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getTextPaint());
                canvas.restore();
                f7 += measureText2;
                i++;
                f2 = f8;
                f4 = f9;
                f5 = f11;
                height = f12;
                f = 2.0f;
            }
            float f13 = height;
            float f14 = 1.15f;
            float measureText3 = getTextPaint().measureText("Inspector") * 1.15f;
            float f15 = this.d;
            float f16 = f5 / (f15 * f4);
            float f17 = 2.0f;
            float a = uq.a(measureText3, f16, 2.0f, 90.0f);
            int i2 = 0;
            while (i2 < 9) {
                char charAt2 = "Inspector".charAt(i2);
                float measureText4 = getTextPaint().measureText(String.valueOf(charAt2)) * f16 * f14;
                float f18 = a - (measureText4 / f17);
                float f19 = f15;
                double radians2 = Math.toRadians(f18);
                int i3 = i2;
                float cos2 = (((float) Math.cos(radians2)) * f19) + width;
                float sin2 = (f19 * ((float) Math.sin(radians2))) + f13;
                int save = canvas.save();
                canvas.translate(cos2, sin2);
                try {
                    canvas.rotate(f18 - 90.0f);
                    canvas.drawText(String.valueOf(charAt2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getTextPaint());
                    canvas.restoreToCount(save);
                    a -= measureText4;
                    i2 = i3 + 1;
                    f15 = f19;
                    f14 = 1.15f;
                    f17 = 2.0f;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            int a = iah0.a(56);
            setMeasuredDimension(a, a);
        }
    }
}
