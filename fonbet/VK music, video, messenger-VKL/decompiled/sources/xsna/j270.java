package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.text.Regex;
import ru.ok.gl.tf.Tensorflow;
import xsna.cpv;
import xsna.fqv;
import xsna.gjo0;

/* compiled from: NoCategoriesIconDrawer.kt */
/* loaded from: classes2.dex */
public final class j270 extends fqv<k270> {
    public static final int l = Color.argb(an10.b(7.6499996f), 0, 0, 0);
    public static final int m = Color.argb(an10.b(15.299999f), 0, 0, 0);
    public final Object k;

    static {
        cn70.a();
        cn70.a();
    }

    public j270(float f, IconDrawConfig iconDrawConfig, k270 k270Var) {
        super(f, iconDrawConfig, k270Var);
        this.k = msy.a(LazyThreadSafetyMode.PUBLICATION, new ag20(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Triple l(j270 j270Var, CharSequence charSequence, CharSequence charSequence2, Integer num, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        float f = j270Var.a;
        IconDrawConfig iconDrawConfig = j270Var.b;
        if (charSequence.length() != 0) {
            String obj = charSequence.toString();
            float f2 = iconDrawConfig.e * f * 1.0f;
            int intValue = num != null ? num.intValue() : iconDrawConfig.f;
            float f3 = iconDrawConfig.h;
            float f4 = iconDrawConfig.n;
            Bitmap k = j270Var.k(obj, f2, cn70.a() * f3, intValue, iconDrawConfig.c, iconDrawConfig.g);
            if (k != null) {
                if (charSequence2 == null || charSequence2.length() == 0) {
                    return new Triple(k, Boolean.TRUE, Boolean.FALSE);
                }
                Bitmap k2 = j270Var.k(charSequence2.toString(), iconDrawConfig.j * f * 1.0f, iconDrawConfig.m * f * 1.0f, iconDrawConfig.k, iconDrawConfig.d, iconDrawConfig.l);
                if (k2 == null) {
                    return new Triple(k, Boolean.TRUE, Boolean.FALSE);
                }
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(k.getWidth(), k2.getWidth()), an10.b(cn70.a() * f4) + k2.getHeight() + k.getHeight(), Bitmap.Config.ARGB_8888);
                Paint paint = (Paint) j270Var.f.b.get();
                paint.setColor(-16777216);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(k, (createBitmap.getWidth() - k.getWidth()) * 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                canvas.drawBitmap(k2, (r12 - k2.getWidth()) * 0.5f, dq.a(f4, k.getHeight()), paint);
                ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                Boolean bool = Boolean.TRUE;
                return new Triple(createBitmap, bool, bool);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fqv
    public final Bitmap b(Bitmap bitmap, float f, int i) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        k270 k270Var = (k270) this.c;
        float f2 = k270Var.c * f;
        float max = Math.max(2.0f, 2.0f) / 2;
        Bitmap i2 = i((max * f) + f2, (k270Var.d + max) * f, true, null);
        Canvas canvas = new Canvas(i2);
        Paint paint = (Paint) this.f.b.get();
        ?? r10 = this.k;
        Path path = ((fqv.a) r10.getValue()).a;
        if (f != 1.0f) {
            Path path2 = new Path(path);
            path2.transform(s1v.o(f, f));
            path = path2;
        }
        float a = cn70.a() * max;
        float f3 = f2 * this.a;
        float width = ((canvas.getWidth() - an10.b(f3)) * 0.5f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int save = canvas.save();
        canvas.translate(width, a);
        try {
            paint.setColor(0);
            paint.setShadowLayer(cn70.a() * 2.0f, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            paint.setShadowLayer(cn70.a() * 2.0f, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 2.0f, m);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            paint.setColor(-1);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save);
            RectF rectF = (RectF) this.h.b.get();
            RectF rectF2 = (RectF) this.g.b.get();
            Path path3 = ((fqv.a) r10.getValue()).b;
            if (f != 1.0f) {
                Path path4 = new Path(path3);
                path4.transform(s1v.o(f, f));
                path3 = path4;
            }
            path3.computeBounds(rectF2, true);
            int b = an10.b(rectF2.right);
            int b2 = an10.b(rectF2.bottom);
            float f4 = rectF2.left / 2.0f;
            float f5 = rectF2.top / 2.0f;
            if (an10.b(bitmap.getWidth() * 1.0f) != b) {
                bitmap2 = i2;
                bitmap3 = Bitmap.createScaledBitmap(bitmap, an10.b(b * 1.0f), an10.b(b2 * 1.0f), true);
            } else {
                bitmap2 = i2;
                bitmap3 = bitmap;
            }
            rectF.set(f4, f5, rectF2.right, rectF2.bottom);
            Bitmap createBitmap = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            int color = paint.getColor();
            paint.setColor(i);
            save = canvas.save();
            canvas.translate(-f4, -f5);
            try {
                canvas.drawPath(path3, paint);
                canvas.restoreToCount(save);
                paint.setColor(color);
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.i.getValue();
                ColorFilter colorFilter = paint.getColorFilter();
                paint.setColorFilter(porterDuffColorFilter);
                canvas.drawBitmap(bitmap3, (canvas.getWidth() - bitmap3.getWidth()) * 0.5f, (canvas.getHeight() - bitmap3.getHeight()) * 0.5f, paint);
                paint.setColorFilter(colorFilter);
                if (bitmap3 != bitmap) {
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                }
                float f6 = rectF.left;
                float a2 = dq.a(max, rectF.top);
                save = canvas.save();
                canvas.translate(((canvas.getWidth() - an10.b(f3)) * 0.5f) + f6, a2);
                try {
                    canvas.drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap2 = vc7.a;
                    return bitmap2;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fqv
    public final cpv.a c(Bitmap bitmap, int i, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence.length() == 0) {
            return new cpv.a(bitmap, 1.0f, 96);
        }
        Triple l2 = l(this, charSequence, charSequence2, Integer.valueOf(i), 1008);
        Bitmap bitmap2 = (Bitmap) (l2 != null ? l2.i() : null);
        boolean booleanValue = l2 != null ? ((Boolean) l2.j()).booleanValue() : false;
        boolean booleanValue2 = l2 != null ? ((Boolean) l2.k()).booleanValue() : false;
        if (bitmap2 == null) {
            return new cpv.a(bitmap, 1.0f, 96);
        }
        Bitmap i2 = i(bitmap.getWidth(), bitmap.getHeight(), false, bitmap2);
        Canvas canvas = new Canvas(i2);
        canvas.drawBitmap(bitmap, (i2.getWidth() - bitmap.getWidth()) * 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) this.f.b.get());
        j(canvas, bitmap2, cn70.a() * (Math.max(2.0f, 2.0f) / 2));
        float f = swe0.f(1.0f - (bitmap2.getHeight() / i2.getHeight()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        return new cpv.a(i2, 0.5f, f, booleanValue, booleanValue2, charSequence, charSequence2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fqv
    public final cpv.a d(Bitmap bitmap, cpv.a aVar, int i, float f, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        Bitmap bitmap2 = aVar.a;
        float a = cn70.a() * 1.2f;
        if (f > 1.0f) {
            a = cn70.a() * 1.5f;
        }
        float f2 = 2 * a;
        int b = an10.b(bitmap.getWidth() + f2);
        int b2 = an10.b(bitmap.getHeight() + f2);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(b, b2, config);
        float width = bitmap.getWidth() * 0.22f;
        Paint paint = (Paint) this.f.b.get();
        paint.setColor(-1);
        RectF rectF = (RectF) this.g.b.get();
        rectF.set(a, a, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(createBitmap);
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, width, width, paint);
        Xfermode xfermode = paint.getXfermode();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, a, a, paint);
        paint.setXfermode(xfermode);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a);
        canvas.drawRoundRect(rectF, width, width, paint);
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        paint.setStyle(style);
        int max = Math.max(createBitmap.getWidth(), bitmap2.getWidth());
        int height = bitmap2.getHeight() + createBitmap.getHeight();
        I i2 = this.c;
        Bitmap createBitmap2 = Bitmap.createBitmap(max, height - ((k270) i2).t, config);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawBitmap(createBitmap, (createBitmap2.getWidth() - createBitmap.getWidth()) * 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        canvas2.drawBitmap(bitmap2, (createBitmap2.getWidth() - bitmap2.getWidth()) * 0.5f, createBitmap2.getHeight() - bitmap2.getHeight(), paint);
        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        int i3 = 268435464;
        if (aVar.d && !VisibleStyle.f(268435464)) {
            i3 = 268435496;
        }
        if (aVar.e && !VisibleStyle.e(i3)) {
            i3 |= 128;
        }
        long a2 = i2.a(i3, null);
        return new cpv.a(createBitmap2, Float.intBitsToFloat((int) (a2 >> 32)), Float.intBitsToFloat((int) (a2 & 4294967295L)), aVar.d, aVar.e, aVar.f, aVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fqv
    public final cpv.a e(Bitmap bitmap, float f, CharSequence charSequence, CharSequence charSequence2) {
        float f2;
        Triple l2 = charSequence != null ? l(this, charSequence, charSequence2, null, Z3.l) : null;
        Bitmap bitmap2 = (Bitmap) (l2 != null ? l2.i() : null);
        boolean booleanValue = l2 != null ? ((Boolean) l2.j()).booleanValue() : false;
        boolean booleanValue2 = l2 != null ? ((Boolean) l2.k()).booleanValue() : false;
        k270 k270Var = (k270) this.c;
        float f3 = k270Var.c * f;
        float max = Math.max(2.0f, 2.0f) / 2;
        Bitmap i = i((max * f) + f3, (k270Var.d + max) * f, true, bitmap2);
        Canvas canvas = new Canvas(i);
        Paint paint = (Paint) this.f.b.get();
        ?? r11 = this.k;
        Path path = ((fqv.a) r11.getValue()).a;
        if (f == 1.0f) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
            Path path2 = new Path(path);
            path2.transform(s1v.o(f, f));
            path = path2;
        }
        float a = cn70.a() * max;
        float f4 = f3 * this.a;
        float width = ((canvas.getWidth() - an10.b(f4)) * 0.5f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z = booleanValue;
        int save = canvas.save();
        canvas.translate(width, a);
        try {
            paint.setColor(0);
            boolean z2 = booleanValue2;
            paint.setShadowLayer(cn70.a() * 2.0f, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            paint.setShadowLayer(cn70.a() * 2.0f, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 2.0f, m);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            paint.setColor(-1);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save);
            wqo0 wqo0Var = this.g;
            RectF rectF = (RectF) wqo0Var.b.get();
            Path path3 = ((fqv.a) r11.getValue()).b;
            if (f != 1.0f) {
                Path path4 = new Path(path3);
                path4.transform(s1v.o(f, f));
                path3 = path4;
            }
            path3.computeBounds(rectF, true);
            int b = an10.b(rectF.right);
            int b2 = an10.b(rectF.bottom);
            Bitmap createScaledBitmap = (bitmap.getWidth() == b && bitmap.getHeight() == b2) ? bitmap : Bitmap.createScaledBitmap(bitmap, b, b2, true);
            Bitmap createBitmap = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            save = canvas.save();
            try {
                canvas.translate(-rectF.left, -rectF.top);
                canvas.drawPath(path3, paint);
                canvas.restoreToCount(save);
                Xfermode xfermode = paint.getXfermode();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(createScaledBitmap, -rectF.left, -rectF.top, paint);
                paint.setXfermode(xfermode);
                if (createScaledBitmap != bitmap) {
                    ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                }
                float f5 = ((RectF) wqo0Var.b.get()).left;
                float a2 = dq.a(max, ((RectF) wqo0Var.b.get()).top);
                float width2 = ((canvas.getWidth() - an10.b(f4)) * 0.5f) + f5;
                save = canvas.save();
                canvas.translate(width2, a2);
                try {
                    canvas.drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    if (createBitmap != bitmap) {
                        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap2 = vc7.a;
                    }
                    if (bitmap2 != null) {
                        j(canvas, bitmap2, cn70.a() * max);
                    }
                    return new cpv.a(i, 0.5f, bitmap2 != null ? swe0.f(f2 - (bitmap2.getHeight() / i.getHeight()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2) : f2, z, z2, charSequence, charSequence2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fqv
    public final Bitmap f(elr0 elr0Var, int i) {
        RectF rectF = (RectF) this.g.b.get();
        Path path = ((fqv.a) this.k.getValue()).b;
        float F = VisibleStyle.F(i);
        if (F != 1.0f) {
            Path path2 = new Path(path);
            path2.transform(s1v.o(F, F));
            path = path2;
        }
        path.computeBounds(rectF, true);
        int b = an10.b(rectF.right);
        int b2 = an10.b(rectF.bottom);
        Bitmap createBitmap = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int b3 = an10.b((VisibleStyle.D(i) ? 0.35f : 0.5f) * b);
        elr0Var.setBounds(0, 0, b3, an10.b((VisibleStyle.D(i) ? 0.35f : 0.5f) * b2));
        canvas.translate((canvas.getWidth() - b3) * 0.5f, (canvas.getHeight() - r9) * 0.5f);
        elr0Var.draw(canvas);
        return createBitmap;
    }

    @Override // xsna.fqv
    public final int g() {
        return krv0.l(R.attr.vk_ui_background_content);
    }

    public final Bitmap i(float f, float f2, boolean z, Bitmap bitmap) {
        float f3 = z ? this.a : 1.0f;
        int b = an10.b(f * f3);
        int b2 = an10.b(f2 * f3);
        if (bitmap != null) {
            b = Math.max(b, bitmap.getWidth());
            b2 += bitmap.getHeight() + an10.b(this.b.i * f3);
        }
        return Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Canvas canvas, Bitmap bitmap, float f) {
        wqo0 wqo0Var = this.f;
        ((Paint) wqo0Var.b.get()).setColor(-16777216);
        canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) * 0.5f, (canvas.getHeight() - bitmap.getHeight()) - f, (Paint) wqo0Var.b.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final Bitmap k(String str, float f, float f2, int i, int i2, Integer num) {
        int i3;
        ?? arrayList;
        Layout layout;
        float f3;
        if (str == null || str.length() == 0) {
            return null;
        }
        String g = fqv.j.g(str, " ");
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        int b = an10.b(this.b.u * this.a);
        if (num == null) {
            Regex regex = hjo0.a;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            Layout a = hjo0.a(g, f, i, b, i2, 0, alignment, null, Tensorflow.FRAME_HEIGHT);
            if (a != null) {
                return fqv.h(a);
            }
            return null;
        }
        Regex regex2 = hjo0.a;
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        int intValue = num.intValue();
        SpannableString valueOf = SpannableString.valueOf(g);
        hjo0.b(valueOf, i, intValue, f2);
        gjo0 gjo0Var = new gjo0();
        gjo0Var.c(f);
        gjo0.a aVar = gjo0Var.b;
        float desiredWidth = Layout.getDesiredWidth(valueOf, aVar.a);
        if (desiredWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList = 0;
            i3 = 0;
        } else if (desiredWidth > b) {
            i3 = 0;
            try {
                Layout a2 = hjo0.a(g, f, 0, b, i2, 0, null, null, 900);
                if (a2 != null && a2.getLineCount() > 0 && a2.getLineCount() <= i2) {
                    arrayList = new ArrayList(a2.getLineCount());
                    int lineCount = a2.getLineCount();
                    for (int i4 = 0; i4 < lineCount; i4++) {
                        if (an10.b(a2.getLineWidth(i4)) > 0) {
                            int lineStart = a2.getLineStart(i4);
                            int lineEnd = a2.getLineEnd(i4);
                            String obj = a2.getText().toString();
                            int length = a2.getText().length();
                            if (lineEnd > length) {
                                lineEnd = length;
                            }
                            SpannableString valueOf2 = SpannableString.valueOf(hjo0.a.g(obj.substring(lineStart, lineEnd), ""));
                            hjo0.b(valueOf2, i, intValue, f2);
                            gjo0 gjo0Var2 = new gjo0();
                            gjo0Var2.b(valueOf2);
                            gjo0Var2.c(f);
                            gjo0Var2.d = false;
                            Layout a3 = gjo0Var2.a();
                            if (a3 != null) {
                                arrayList.add(a3);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                L.i(th);
            }
            arrayList = 0;
            break;
        } else {
            gjo0Var.b(valueOf);
            gjo0Var.a = b;
            int i5 = i2 == 1 ? Integer.MAX_VALUE : i2;
            if (aVar.h != i5) {
                aVar.h = i5;
                layout = null;
                gjo0Var.c = null;
            } else {
                layout = null;
            }
            if (aVar.k != 0) {
                aVar.k = 0;
                gjo0Var.c = layout;
            }
            if (aVar.g != truncateAt2) {
                aVar.g = truncateAt2;
                gjo0Var.c = layout;
            }
            if (aVar.i != alignment) {
                aVar.i = alignment;
                gjo0Var.c = layout;
            }
            gjo0Var.d = false;
            Layout a4 = gjo0Var.a();
            if (a4 == null) {
                i3 = 0;
                arrayList = 0;
                break;
            }
            arrayList = Collections.singletonList(a4);
            i3 = 0;
        }
        if (arrayList != 0 && !arrayList.isEmpty()) {
            int i6 = i3;
            int i7 = i6;
            for (Layout layout2 : arrayList) {
                i7 = Math.max(i7, layout2.getWidth());
                i6 += layout2.getHeight();
            }
            if (i7 > 0 && i6 > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(i7, i6, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                for (Layout layout3 : (Iterable) arrayList) {
                    int i8 = i3 + 1;
                    int i9 = fqv.b.$EnumSwitchMapping$0[alignment.ordinal()];
                    if (i9 == 1) {
                        f3 = 0.0f;
                    } else if (i9 == 2) {
                        f3 = 1.0f;
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f3 = 0.5f;
                    }
                    float height = layout3.getHeight() * i3;
                    int save = canvas.save();
                    canvas.translate(f3 * (i7 - layout3.getWidth()), height);
                    try {
                        layout3.draw(canvas);
                        canvas.restoreToCount(save);
                        i3 = i8;
                    } catch (Throwable th2) {
                        canvas.restoreToCount(save);
                        throw th2;
                    }
                }
                return createBitmap;
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.w, new Object[]{"could not create bitmap for layouts"});
            }
        }
        return null;
    }
}
