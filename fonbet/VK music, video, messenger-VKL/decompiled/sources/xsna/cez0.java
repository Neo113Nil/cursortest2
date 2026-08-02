package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class cez0 extends FrameLayout {
    public final dvy0 b;
    public final whz0 c;
    public final TextView d;
    public final ImageView e;
    public final LinearLayout f;
    public final kfz0 g;
    public final ujz0 h;
    public final r0z0 i;
    public final loy0 j;
    public float k;

    public cez0(loy0 loy0Var, dvy0 dvy0Var, Context context, r0z0 r0z0Var) {
        super(context);
        this.j = loy0Var;
        this.i = r0z0Var;
        this.b = dvy0Var;
        c1z0.n(dvy0Var, "video_view");
        ujz0 ujz0Var = new ujz0(context);
        this.h = ujz0Var;
        rvy0 rvy0Var = new rvy0(context);
        int i = rvy0.x;
        SparseIntArray sparseIntArray = rvy0Var.a;
        setBackgroundColor(sparseIntArray.get(i));
        FrameLayout frameLayout = new FrameLayout(context);
        c1z0.n(frameLayout, "video_container");
        whz0 whz0Var = new whz0(context);
        whz0Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.c = whz0Var;
        c1z0.n(whz0Var, "preview_view");
        frameLayout.addView(whz0Var);
        frameLayout.addView(dvy0Var);
        addView(frameLayout);
        kfz0 kfz0Var = new kfz0(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        kfz0Var.setLayoutParams(layoutParams);
        kfz0Var.setVisibility(4);
        this.g = kfz0Var;
        addView(kfz0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388613;
        int i2 = ujz0.g;
        SparseIntArray sparseIntArray2 = ujz0Var.a;
        int i3 = sparseIntArray2.get(i2);
        layoutParams2.setMargins(0, 0, i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(sparseIntArray.get(rvy0.d));
        gradientDrawable.setCornerRadius(sparseIntArray2.get(ujz0.v));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setGravity(17);
        int i4 = sparseIntArray2.get(i2);
        linearLayout.setPadding(i4, i4, i4, i4);
        linearLayout.setLayoutParams(layoutParams2);
        this.f = linearLayout;
        ImageView imageView = new ImageView(context);
        int i5 = sparseIntArray2.get(ujz0.n);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        this.e = imageView;
        linearLayout.addView(imageView);
        c1z0.n(imageView, "icon_image_view");
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(sparseIntArray2.get(i2));
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams3);
        linearLayout.setVisibility(8);
        this.d = textView;
        c1z0.n(textView, "domain_text_view");
        linearLayout.addView(textView);
        c1z0.n(linearLayout, "domain_container");
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        linearLayout2.setLayoutParams(layoutParams4);
        linearLayout2.addView(linearLayout);
        linearLayout.setVisibility(8);
        c1z0.n(linearLayout2, "bottom_layout");
        addView(linearLayout2);
        Configuration configuration = context.getResources().getConfiguration();
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (configuration.orientation == 2) {
            layoutParams5.gravity = 8388627;
        } else {
            layoutParams5.gravity = 49;
        }
        whz0Var.setLayoutParams(layoutParams5);
        frameLayout.setLayoutParams(layoutParams5);
    }

    public final void a(float f) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i = this.h.a.get(ujz0.v);
        Bitmap bitmap3 = null;
        kfz0 kfz0Var = this.g;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Context context = getContext();
            try {
                bitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                gu8.c(null, "BaseResources: Cannot build icon - OOME");
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                Path d = rq90.d("M15.5 5.5C15.9602 5.5 16.3333 5.8731 16.3333 6.33333V19.6667C16.3333 20.1269 15.9602 20.5 15.5 20.5C14.9655 20.5 14.4518 20.2924 14.0674 19.921L9.49177 15.5H7.16667C6.24619 15.5 5.5 14.7538 5.5 13.8333V12.1667C5.5 11.2462 6.24619 10.5 7.16667 10.5H9.47083L14.0662 6.07783C14.4515 5.7071 14.9653 5.5 15.5 5.5ZM19.9867 8.28596C20.2796 7.99306 20.7545 7.99306 21.0474 8.28596C23.6509 10.8895 23.6509 15.1106 21.0474 17.714C20.7545 18.0069 20.2796 18.0069 19.9867 17.714C19.6938 17.4212 19.6938 16.9463 19.9867 16.6534C22.0044 14.6357 22.0044 11.3643 19.9867 9.34662C19.6938 9.05372 19.6938 8.57885 19.9867 8.28596ZM17.8654 10.4073C18.1583 10.1144 18.6332 10.1144 18.9261 10.4073C20.358 11.8392 20.358 14.1608 18.9261 15.5927C18.6332 15.8856 18.1583 15.8856 17.8654 15.5927C17.5725 15.2998 17.5725 14.825 17.8654 14.5321C18.7115 13.6859 18.7115 12.3141 17.8654 11.4679C17.5725 11.175 17.5725 10.7002 17.8654 10.4073Z");
                Path d2 = rq90.d("M15.5 5.25C16.0982 5.25 16.5828 5.73485 16.583 6.33301V19.667C16.5828 20.2652 16.0982 20.75 15.5 20.75C14.9006 20.75 14.3246 20.5171 13.8936 20.1006L9.3916 15.75H7.16699C6.10845 15.75 5.25 14.8916 5.25 13.833V12.167C5.25 11.1084 6.10845 10.25 7.16699 10.25H9.37109L13.8926 5.89746C14.3244 5.4819 14.9007 5.25 15.5 5.25ZM19.8096 8.10938C20.2001 7.71885 20.8341 7.71885 21.2246 8.10938C23.9253 10.8104 23.9253 15.1896 21.2246 17.8906C20.8341 18.2811 20.2001 18.2811 19.8096 17.8906C19.4194 17.5001 19.4193 16.867 19.8096 16.4766C21.7296 14.5565 21.7296 11.4435 19.8096 9.52344C19.4193 9.13299 19.4194 8.49987 19.8096 8.10938ZM17.6885 10.2305C18.0789 9.84 18.712 9.84011 19.1025 10.2305C20.6321 11.76 20.6321 14.24 19.1025 15.7695C18.712 16.1599 18.0789 16.16 17.6885 15.7695C17.2981 15.3791 17.2981 14.746 17.6885 14.3555C18.437 13.607 18.437 12.393 17.6885 11.6445C17.2981 11.254 17.2981 10.6209 17.6885 10.2305Z");
                RectF rectF = new RectF();
                d.computeBounds(rectF, true);
                d2.computeBounds(rectF, true);
                Matrix matrix = new Matrix();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                matrix.postTranslate(-rectF.left, -rectF.top);
                float f2 = displayMetrics.density;
                matrix.postScale(f2, f2);
                float f3 = i;
                matrix.postTranslate((f3 - (rectF.width() * f2)) / 2.0f, (f3 - (rectF.height() * f2)) / 2.0f);
                d.transform(matrix);
                d2.transform(matrix);
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setAntiAlias(true);
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                Paint paint2 = new Paint();
                paint2.setColor(520093696);
                paint2.setAntiAlias(true);
                paint2.setStrokeWidth(0.5f);
                paint2.setStyle(Paint.Style.STROKE);
                Paint paint3 = new Paint();
                paint3.setColor(-1);
                paint3.setAntiAlias(true);
                paint3.setStyle(style);
                paint3.setShadowLayer(5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 687865856);
                Canvas canvas = new Canvas(bitmap2);
                canvas.drawPath(d, paint);
                canvas.drawPath(d2, paint2);
                canvas.drawPath(d2, paint3);
                bitmap3 = bitmap2;
            }
            kfz0Var.getSoundControlButton().a(bitmap3, false);
            kfz0Var.getSoundControlButton().setContentDescription("sound_on");
            return;
        }
        Context context2 = getContext();
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap != null) {
            Path d3 = rq90.d("M8.59561 5.74605L20.2512 17.4044C20.5766 17.7299 20.5766 18.2575 20.2512 18.5829C19.9508 18.8833 19.4782 18.9064 19.1513 18.6523L19.0727 18.5829L16.3333 15.8425V19.6667C16.3333 20.094 16.0116 20.4463 15.5972 20.4944L15.5 20.5C14.9655 20.5 14.4518 20.2924 14.0674 19.921L9.49177 15.5H7.16667C6.24619 15.5 5.5 14.7538 5.5 13.8333V12.1667C5.5 11.2462 6.24619 10.5 7.16667 10.5H9.47083L10.2458 9.75333L7.41716 6.92463C7.09175 6.59915 7.09178 6.0715 7.41723 5.74605C7.74263 5.42065 8.27021 5.42065 8.59561 5.74605ZM15.5 5.5C15.9602 5.5 16.3333 5.8731 16.3333 6.33333V11.1333L12.645 7.445L14.0662 6.07783C14.4129 5.74417 14.8638 5.54306 15.3403 5.50617L15.5 5.5Z");
            Path d4 = rq90.d("M7.24023 5.56934C7.66326 5.14631 8.34943 5.14631 8.77246 5.56934L20.4277 17.2275C20.8508 17.6507 20.8508 18.3367 20.4277 18.7598C20.0371 19.1502 19.4231 19.18 18.998 18.8496L18.9912 18.8447L18.9854 18.8398L18.9072 18.7705L18.9014 18.7646L18.8955 18.7598L16.583 16.4463V19.667C16.5828 20.2226 16.1649 20.6806 15.626 20.7432H15.6191L15.6113 20.7441L15.5146 20.75H15.5C14.9006 20.75 14.3246 20.5171 13.8936 20.1006L9.3916 15.75H7.16699C6.10845 15.75 5.25 14.8916 5.25 13.833V12.167C5.25 11.1084 6.10845 10.25 7.16699 10.25H9.37109L9.88867 9.74902L7.24023 7.10156C6.81726 6.67849 6.8173 5.99242 7.24023 5.56934ZM15.3311 5.25684L15.4902 5.25H15.5C16.0982 5.25 16.5828 5.73485 16.583 6.33301V11.7373L12.4678 7.62207L12.2881 7.44141L12.4717 7.26465L13.8926 5.89746C14.2812 5.52346 14.7872 5.29818 15.3213 5.25684L15.3311 5.25586V5.25684Z");
            RectF rectF2 = new RectF();
            d3.computeBounds(rectF2, true);
            d4.computeBounds(rectF2, true);
            Matrix matrix2 = new Matrix();
            DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
            matrix2.postTranslate(-rectF2.left, -rectF2.top);
            float f4 = displayMetrics2.density;
            matrix2.postScale(f4, f4);
            float f5 = i;
            matrix2.postTranslate((f5 - (rectF2.width() * f4)) / 2.0f, (f5 - (rectF2.height() * f4)) / 2.0f);
            d3.transform(matrix2);
            d4.transform(matrix2);
            Paint paint4 = new Paint();
            paint4.setColor(-1);
            paint4.setAntiAlias(true);
            Paint.Style style2 = Paint.Style.FILL;
            paint4.setStyle(style2);
            Paint paint5 = new Paint();
            paint5.setColor(520093696);
            paint5.setAntiAlias(true);
            paint5.setStrokeWidth(0.5f);
            paint5.setStyle(Paint.Style.STROKE);
            Paint paint6 = new Paint();
            paint6.setColor(-1);
            paint6.setAntiAlias(true);
            paint5.setStyle(style2);
            paint6.setShadowLayer(5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 687865856);
            Canvas canvas2 = new Canvas(bitmap);
            canvas2.drawPath(d3, paint4);
            canvas2.drawPath(d4, paint5);
            canvas2.drawPath(d4, paint6);
            bitmap3 = bitmap;
        }
        kfz0Var.getSoundControlButton().a(bitmap3, false);
        kfz0Var.getSoundControlButton().setContentDescription("sound_off");
    }

    public final void b() {
        this.c.setVisibility(0);
        this.b.setVisibility(4);
        int i = this.h.a.get(ujz0.v);
        kfz0 kfz0Var = this.g;
        kfz0Var.getVideoControlButton().a(ywy0.c(i, getContext()), false);
        kfz0Var.getProgressView().setTimeChanged(this.k);
        this.i.a();
    }

    public final void c() {
        this.c.setVisibility(0);
        this.g.setVisibility(4);
        this.i.b();
    }

    public final void d() {
        this.g.getVideoControlButton().a(ywy0.c(this.h.a.get(ujz0.v), getContext()), false);
    }

    public final void e() {
        kfz0 kfz0Var = this.g;
        kfz0Var.setVisibility(0);
        kfz0Var.getVideoControlButton().a(ywy0.c(this.h.a.get(ujz0.v), getContext()), false);
    }

    public final void f() {
        Bitmap bitmap;
        this.c.setVisibility(4);
        this.b.setVisibility(0);
        kfz0 kfz0Var = this.g;
        kfz0Var.setVisibility(0);
        int i = this.h.a.get(ujz0.v);
        auy0 videoControlButton = kfz0Var.getVideoControlButton();
        Context context = getContext();
        Bitmap bitmap2 = null;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gu8.c(null, "BaseResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap != null) {
            Path d = rq90.d("M6 7.6C6 7.03995 6 6.75992 6.10899 6.54601C6.20487 6.35785 6.35785 6.20487 6.54601 6.10899C6.75992 6 7.03995 6 7.6 6H8.4C8.96005 6 9.24008 6 9.45399 6.10899C9.64215 6.20487 9.79513 6.35785 9.89101 6.54601C10 6.75992 10 7.03995 10 7.6V18.4C10 18.9601 10 19.2401 9.89101 19.454C9.79513 19.6422 9.64215 19.7951 9.45399 19.891C9.24008 20 8.96005 20 8.4 20H7.6C7.03995 20 6.75992 20 6.54601 19.891C6.35785 19.7951 6.20487 19.6422 6.10899 19.454C6 19.2401 6 18.9601 6 18.4V7.6Z");
            Path d2 = rq90.d("M14 7.6C14 7.03995 14 6.75992 14.109 6.54601C14.2049 6.35785 14.3578 6.20487 14.546 6.10899C14.7599 6 15.0399 6 15.6 6H16.4C16.9601 6 17.2401 6 17.454 6.10899C17.6422 6.20487 17.7951 6.35785 17.891 6.54601C18 6.75992 18 7.03995 18 7.6V18.4C18 18.9601 18 19.2401 17.891 19.454C17.7951 19.6422 17.6422 19.7951 17.454 19.891C17.2401 20 16.9601 20 16.4 20H15.6C15.0399 20 14.7599 20 14.546 19.891C14.3578 19.7951 14.2049 19.6422 14.109 19.454C14 19.2401 14 18.9601 14 18.4V7.6Z");
            Path d3 = rq90.d("M8.40039 5.75C8.67611 5.75 8.89794 5.75001 9.07715 5.76465C9.25936 5.77954 9.41931 5.81127 9.56738 5.88672C9.8025 6.00655 9.99345 6.1975 10.1133 6.43262C10.1887 6.58069 10.2205 6.74064 10.2354 6.92285C10.25 7.10206 10.25 7.32389 10.25 7.59961V18.4004C10.25 18.6761 10.25 18.8979 10.2354 19.0771C10.2205 19.2594 10.1887 19.4193 10.1133 19.5674C9.99345 19.8025 9.8025 19.9935 9.56738 20.1133C9.41931 20.1887 9.25936 20.2205 9.07715 20.2354C8.89794 20.25 8.67611 20.25 8.40039 20.25H7.59961C7.32389 20.25 7.10206 20.25 6.92285 20.2354C6.74064 20.2205 6.58069 20.1887 6.43262 20.1133C6.1975 19.9935 6.00655 19.8025 5.88672 19.5674C5.81127 19.4193 5.77954 19.2594 5.76465 19.0771C5.75001 18.8979 5.75 18.6761 5.75 18.4004V7.59961C5.75 7.32389 5.75001 7.10206 5.76465 6.92285C5.77954 6.74064 5.81127 6.58069 5.88672 6.43262C6.00655 6.1975 6.1975 6.00655 6.43262 5.88672C6.58069 5.81127 6.74064 5.77954 6.92285 5.76465C7.10206 5.75001 7.32389 5.75 7.59961 5.75H8.40039ZM16.4004 5.75C16.6761 5.75 16.8979 5.75001 17.0771 5.76465C17.2594 5.77954 17.4193 5.81127 17.5674 5.88672C17.8025 6.00655 17.9935 6.1975 18.1133 6.43262C18.1887 6.58069 18.2205 6.74064 18.2354 6.92285C18.25 7.10206 18.25 7.32389 18.25 7.59961V18.4004C18.25 18.6761 18.25 18.8979 18.2354 19.0771C18.2205 19.2594 18.1887 19.4193 18.1133 19.5674C17.9935 19.8025 17.8025 19.9935 17.5674 20.1133C17.4193 20.1887 17.2594 20.2205 17.0771 20.2354C16.8979 20.25 16.6761 20.25 16.4004 20.25H15.5996C15.3239 20.25 15.1021 20.25 14.9229 20.2354C14.7406 20.2205 14.5807 20.1887 14.4326 20.1133C14.1975 19.9935 14.0065 19.8025 13.8867 19.5674C13.8113 19.4193 13.7795 19.2594 13.7646 19.0771C13.75 18.8979 13.75 18.6761 13.75 18.4004V7.59961C13.75 7.32389 13.75 7.10206 13.7646 6.92285C13.7795 6.74064 13.8113 6.58069 13.8867 6.43262C14.0065 6.1975 14.1975 6.00655 14.4326 5.88672C14.5807 5.81127 14.7406 5.77954 14.9229 5.76465C15.1021 5.75001 15.3239 5.75 15.5996 5.75H16.4004Z");
            RectF rectF = new RectF();
            d.computeBounds(rectF, true);
            d2.computeBounds(rectF, true);
            d3.computeBounds(rectF, true);
            Matrix matrix = new Matrix();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            matrix.postTranslate(-rectF.left, -rectF.top);
            float f = displayMetrics.density;
            matrix.postScale(f, f);
            float f2 = i;
            matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
            d.transform(matrix);
            d2.transform(matrix);
            d3.transform(matrix);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            paint2.setColor(520093696);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(0.5f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            paint3.setColor(-1);
            paint3.setAntiAlias(true);
            paint3.setStyle(style);
            paint3.setShadowLayer(5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 687865856);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawPath(d, paint);
            canvas.drawPath(d2, paint);
            canvas.drawPath(d3, paint2);
            canvas.drawPath(d3, paint3);
            bitmap2 = bitmap;
        }
        videoControlButton.a(bitmap2, false);
    }

    @NonNull
    public LinearLayout getDomainContainer() {
        return this.f;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.d;
    }

    @NonNull
    public ImageView getLogoImageView() {
        return this.e;
    }

    @NonNull
    public whz0 getPreviewView() {
        return this.c;
    }

    @NonNull
    public kfz0 getVideoControlView() {
        return this.g;
    }

    @NonNull
    public loy0 getVideoPlayer() {
        return this.j;
    }

    @NonNull
    public dvy0 getVideoView() {
        return this.b;
    }

    public void setDuration(float f) {
        this.k = f;
        this.g.getProgressView().setMaxTime(f);
    }

    @NonNull
    public FrameLayout getAndroidView() {
        return this;
    }
}
