package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fbz0 extends LinearLayout {
    public final auy0 b;
    public final auy0 c;
    public final auy0 d;
    public final RelativeLayout e;
    public final TextView f;
    public final ujz0 g;

    public fbz0(Context context) {
        super(context);
        Bitmap bitmap;
        float f;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        ujz0 ujz0Var = new ujz0(context);
        this.g = ujz0Var;
        rvy0 rvy0Var = new rvy0(context);
        setOrientation(0);
        auy0 auy0Var = new auy0(context);
        int i = ujz0.C;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        int i3 = ujz0.D;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, sparseIntArray.get(i3));
        int i4 = ujz0.k;
        int i5 = sparseIntArray.get(i4);
        auy0Var.setPadding(i5, i5, i5 / 2, i5);
        auy0Var.setLayoutParams(layoutParams);
        int i6 = ujz0.w;
        auy0Var.a(ywy0.b(sparseIntArray.get(i6), getContext(), true), false);
        this.b = auy0Var;
        c1z0.n(auy0Var, "ad_choices_button");
        addView(auy0Var);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        int i7 = sparseIntArray.get(i6);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i7, i7);
        int i8 = ujz0.g;
        int i9 = sparseIntArray.get(i8);
        int i10 = sparseIntArray.get(i4);
        layoutParams2.setMargins(i9, i10, i10, i10);
        relativeLayout.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(rvy0Var.a.get(rvy0.d));
        gradientDrawable.setShape(1);
        relativeLayout.setBackground(gradientDrawable);
        relativeLayout.setGravity(49);
        relativeLayout.setPadding(0, sparseIntArray.get(i8), 0, sparseIntArray.get(ujz0.j));
        relativeLayout.setClickable(true);
        relativeLayout.setFocusable(true);
        this.e = relativeLayout;
        addView(relativeLayout);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, sparseIntArray.get(ujz0.r)));
        textView.setTextSize(sparseIntArray.get(ujz0.P));
        textView.setTypeface(null, 1);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        this.f = textView;
        c1z0.n(textView, "progress_wheel");
        relativeLayout.addView(textView);
        auy0 auy0Var2 = new auy0(context);
        int i11 = sparseIntArray.get(i4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(sparseIntArray.get(i), sparseIntArray.get(i3));
        auy0Var2.setPadding(i11 / 2, i11, i11, i11);
        auy0Var2.setLayoutParams(layoutParams3);
        auy0Var2.setVisibility(8);
        int i12 = sparseIntArray.get(i6);
        Context context2 = getContext();
        try {
            bitmap = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = null;
            f = 2.0f;
        } else {
            Paint paint = new Paint();
            f = 2.0f;
            Canvas canvas = new Canvas(bitmap);
            paint.setAntiAlias(true);
            paint.setColor(1711276032);
            float f2 = i12;
            canvas.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2), paint);
            Path d = rq90.d("M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z");
            RectF rectF = new RectF();
            d.computeBounds(rectF, true);
            Matrix matrix = new Matrix();
            DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
            matrix.postTranslate(-rectF.left, -rectF.top);
            float f3 = displayMetrics.density;
            matrix.postScale(f3, f3);
            matrix.postTranslate((f2 - (rectF.width() * f3)) / 2.0f, (f2 - (rectF.height() * f3)) / 2.0f);
            d.transform(matrix);
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
            canvas.drawPath(d, paint2);
        }
        auy0Var2.a(bitmap, false);
        this.c = auy0Var2;
        c1z0.n(auy0Var2, "close_button");
        addView(auy0Var2);
        auy0 auy0Var3 = new auy0(context);
        ujz0 ujz0Var2 = this.g;
        int i13 = ujz0.k;
        SparseIntArray sparseIntArray2 = ujz0Var2.a;
        int i14 = sparseIntArray2.get(i13);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(sparseIntArray2.get(ujz0.C), sparseIntArray2.get(ujz0.D));
        auy0Var3.setPadding(i14 / 2, i14, i14, i14);
        auy0Var3.setLayoutParams(layoutParams4);
        auy0Var3.setVisibility(8);
        int i15 = sparseIntArray2.get(ujz0.w);
        Context context3 = getContext();
        try {
            bitmap3 = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
            bitmap2 = null;
        } catch (OutOfMemoryError unused2) {
            bitmap2 = null;
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap3 = null;
        }
        if (bitmap3 == null) {
            bitmap4 = bitmap2;
        } else {
            Paint paint3 = new Paint();
            Canvas canvas2 = new Canvas(bitmap3);
            paint3.setAntiAlias(true);
            paint3.setColor(1711276032);
            float f4 = i15;
            canvas2.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f4), paint3);
            Path d2 = rq90.d("M14.25 5C13.8358 5 13.5 5.33579 13.5 5.75V8.92779L6.38414 5.1129C5.75794 4.77719 5 5.23084 5 5.94136V14.0587C5 14.7692 5.75794 15.2228 6.38414 14.8871L13.5 11.0722V14.2498C13.5 14.664 13.8358 14.9998 14.25 14.9998C14.6642 14.9998 15 14.664 15 14.2498V5.75C15 5.33579 14.6642 5 14.25 5Z");
            RectF rectF2 = new RectF();
            d2.computeBounds(rectF2, true);
            Matrix matrix2 = new Matrix();
            DisplayMetrics displayMetrics2 = context3.getResources().getDisplayMetrics();
            matrix2.postTranslate(-rectF2.left, -rectF2.top);
            float f5 = displayMetrics2.density;
            matrix2.postScale(f5, f5);
            matrix2.postTranslate((f4 - (rectF2.width() * f5)) / f, (f4 - (rectF2.height() * f5)) / f);
            d2.transform(matrix2);
            Paint paint4 = new Paint();
            paint4.setColor(-1);
            paint4.setAntiAlias(true);
            paint4.setStyle(Paint.Style.FILL);
            canvas2.drawPath(d2, paint4);
            bitmap4 = bitmap3;
        }
        auy0Var3.a(bitmap4, false);
        this.d = auy0Var3;
        c1z0.n(auy0Var3, "skip_button");
        addView(auy0Var3);
    }

    @NonNull
    public auy0 getAdChoicesButton() {
        return this.b;
    }

    @NonNull
    public auy0 getCloseButton() {
        return this.c;
    }

    @NonNull
    public TextView getProgress() {
        return this.f;
    }

    @NonNull
    public RelativeLayout getProgressFrame() {
        return this.e;
    }

    @NonNull
    public auy0 getSkipButton() {
        return this.d;
    }
}
