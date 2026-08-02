package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.MediaUtils;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsLayer.kt */
/* loaded from: classes3.dex */
public final class zie implements uq10 {
    public static final int k = iah0.a(4);
    public static final int l = iah0.a(12);
    public final MediaUtils.d a;
    public final int b;
    public final fny c;
    public final zke d;
    public final Bitmap e;
    public final Bitmap f;
    public final Paint g;
    public final Paint h;
    public final StaticLayout i;
    public final ArrayList j;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x015e, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zie(MediaUtils.d dVar, int i, fny fnyVar) {
        List singletonList;
        s3q0 s3q0Var;
        String f;
        gny gnyVar = fnyVar.b;
        this.a = dVar;
        this.b = i;
        this.c = fnyVar;
        dqz0 dqz0Var = new dqz0(7);
        gny gnyVar2 = fnyVar.a;
        String str = gnyVar2.c;
        String str2 = gnyVar2.b;
        this.d = new zke(str, dVar.b, dqz0Var);
        String e = y8g0.e(R.string.clips_deep_fake_watermark);
        int i2 = dVar.b;
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.MEDIUM;
        Typeface a = cqi.a(Font.Companion, fontFamily, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        new f9l(e, 1.15f, 0.010825f, a, i2, ply.a().contentEquals("ru") ? 7.25f : 6.15f, m33.a(ply.a().contentEquals("ru") ? R.drawable.vk_icon_logo_deepfake_vkproject_rus : R.drawable.vk_icon_logo_deepfake_vkproject_eng, e43.a), dqz0Var);
        if (ply.a().contentEquals("ru")) {
            new og6(dVar.b, 4.45f, m33.a(R.drawable.vk_icon_logo_deepfake_descriptor_rus, e43.a));
        } else {
            new og6(dVar.b, 3.35f, m33.a(R.drawable.vk_icon_logo_deepfake_descriptor_eng, e43.a));
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(Color.parseColor("#76787A"));
        Context context2 = e43.a;
        context2 = context2 == null ? null : context2;
        FontFamily fontFamily2 = FontFamily.REGULAR;
        Float valueOf = Float.valueOf(dVar.b * 0.0175f);
        TextSizeUnit textSizeUnit2 = TextSizeUnit.PX;
        com.vk.typography.b.c(textPaint, context2, fontFamily2, valueOf, textSizeUnit2);
        String e2 = y8g0.e(R.string.clips_deep_fake_watermark);
        int b = an10.b(dVar.a * 0.9452f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        new xxk0(e2, textPaint, b, alignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8152).a();
        int i3 = dVar.a;
        int i4 = dVar.b;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.e = Bitmap.createBitmap(i3, i4, config);
        this.f = Bitmap.createBitmap(dVar.a, dVar.b, config);
        this.g = new Paint(2);
        this.h = new Paint(2);
        float f2 = dVar.a * 0.192f;
        float f3 = 2;
        float f4 = ((dVar.b - f2) / f3) - (f2 / f3);
        if (gnyVar != null) {
            float f5 = l;
            float f6 = ((r4 / 2) - f2) + f5;
            float f7 = f6 + f2;
            float f8 = f4 + f2;
            singletonList = e43.l(new RectF(f6, f4, f7, f8), new RectF(f7 - f5, f4, ((f3 * f2) + f6) - f5, f8));
        }
        float f9 = (dVar.a - f2) / f3;
        singletonList = Collections.singletonList(new RectF(f9, f4, f9 + f2, f2 + f4));
        int i5 = (int) (dVar.a * 0.787f);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(-1);
        Context context3 = e43.a;
        com.vk.typography.b.c(textPaint2, context3 == null ? null : context3, fontFamily, Float.valueOf(dVar.b * 0.03f), textSizeUnit2);
        int i6 = i5;
        this.i = new xxk0((gnyVar == null || (f = y8g0.f(R.string.clips_watermark_duets, str2, gnyVar.b)) == null) ? str2 : f, textPaint2, i6, alignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8152).a();
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(e43.a.getColor(R.color.vk_gray_500));
        Context context4 = e43.a;
        com.vk.typography.b.c(textPaint3, context4 == null ? null : context4, fontFamily2, Float.valueOf(dVar.b * 0.02f), textSizeUnit2);
        List I = rl3.I(new gny[]{gnyVar2, gnyVar});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        Iterator it = I.iterator();
        while (it.hasNext()) {
            int i7 = i6;
            i6 = i7;
            arrayList.add(new xxk0(((gny) it.next()).c, textPaint3, i7, Layout.Alignment.ALIGN_CENTER, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8152).a());
        }
        this.j = arrayList;
        Canvas canvas = new Canvas(this.f);
        canvas.drawColor(-16119286);
        fny fnyVar2 = this.c;
        List I2 = rl3.I(new gny[]{fnyVar2.a, fnyVar2.b});
        ArrayList arrayList2 = new ArrayList(c5g.u(I2, 10));
        int i8 = 0;
        for (Object obj : I2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                e43.t();
                throw null;
            }
            Bitmap bitmap = ((gny) obj).d;
            if (bitmap != null) {
                if (i8 == 1) {
                    Paint paint = new Paint();
                    paint.setColor(-16119286);
                    canvas.drawCircle(((RectF) singletonList.get(i8)).centerX(), ((RectF) singletonList.get(i8)).centerY(), (((RectF) singletonList.get(i8)).width() / f3) + k, paint);
                }
                canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (RectF) singletonList.get(i8), this.h);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            arrayList2.add(s3q0Var);
            i8 = i9;
        }
        float height = (canvas.getHeight() * 0.024f) + ((RectF) singletonList.get(0)).bottom;
        int save = canvas.save();
        canvas.translate((canvas.getWidth() - this.i.getWidth()) / 2.0f, height);
        this.i.draw(canvas);
        canvas.restoreToCount(save);
        float height2 = (canvas.getHeight() * 0.012f) + height + this.i.getHeight();
        int save2 = canvas.save();
        canvas.translate((canvas.getWidth() - ((StaticLayout) this.j.get(0)).getWidth()) / 2.0f, height2);
        ((StaticLayout) this.j.get(0)).draw(canvas);
        canvas.restoreToCount(save2);
        StaticLayout staticLayout = (StaticLayout) j5g.b0(1, this.j);
        if (staticLayout != null) {
            float height3 = (canvas.getHeight() * 0.012f) + ((StaticLayout) this.j.get(0)).getHeight() + height2;
            int save3 = canvas.save();
            canvas.translate((canvas.getWidth() - staticLayout.getWidth()) / 2.0f, height3);
            staticLayout.draw(canvas);
            canvas.restoreToCount(save3);
            s3q0 s3q0Var2 = s3q0.a;
        }
        canvas.translate((canvas.getWidth() - this.d.c) / 2.0f, (canvas.getHeight() * 0.9f) - this.d.b);
        this.d.draw(canvas);
        a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    public final void a(float f, int i) {
        Bitmap bitmap = this.e;
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Paint paint = this.g;
            paint.setAlpha((int) (f * 255));
            canvas.drawBitmap(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            return;
        }
        int i2 = i - 230;
        zke zkeVar = this.d;
        int i3 = zkeVar.b;
        dqz0 dqz0Var = zkeVar.d;
        int i4 = zkeVar.c;
        StaticLayout staticLayout = zkeVar.e;
        float lineWidth = staticLayout.getLineWidth(0);
        int lineCount = staticLayout.getLineCount();
        for (int i5 = 1; i5 < lineCount; i5++) {
            float lineWidth2 = staticLayout.getLineWidth(i5);
            if (lineWidth2 > lineWidth) {
                lineWidth = lineWidth2;
            }
        }
        int max = Math.max(i4, (int) lineWidth);
        int height = staticLayout.getHeight() + i3;
        int save = canvas.save();
        int width = canvas.getWidth();
        dqz0Var.getClass();
        int i6 = (i2 / 4530) % 4;
        float f2 = (i6 == 0 || i6 == 2) ? width * 0.02998f : (width * 0.97002f) - max;
        int height2 = canvas.getHeight();
        canvas.translate(f2, (i6 == 1 || i6 == 2) ? height2 * 0.09866f : (height2 * 0.90134f) - height);
        int save2 = canvas.save();
        zkeVar.a.setAlpha((int) (dqz0Var.l(i2, 0) * 255));
        float f3 = i3;
        int i7 = (int) (0.45f * f3);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dqz0Var.n(i2, i7));
        zkeVar.draw(canvas);
        canvas.restoreToCount(save2);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f3 * 1.5f) + dqz0Var.n(i2, i7));
        int l2 = (int) (dqz0Var.l(i2, 200) * 255.0f);
        staticLayout.getPaint().setAlpha(l2);
        TextPaint paint2 = staticLayout.getPaint();
        if (l2 == 0) {
            paint2.clearShadowLayer();
        } else {
            paint2.setShadowLayer(20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha35));
        }
        staticLayout.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // xsna.uq10
    public final boolean c() {
        return false;
    }

    @Override // xsna.uq10
    public final uq10 copy() {
        return new zie(this.a, this.b, this.c);
    }

    @Override // xsna.uq10
    public final Bitmap d(int i, int i2) {
        a(xwk.a(this.b - i < 200 ? 1.0f - ((r6 - i) / 200) : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), i);
        return this.e;
    }

    @Override // xsna.uq10
    public final boolean z0() {
        return true;
    }

    @Override // xsna.uq10
    public final void b() {
    }

    @Override // xsna.uq10
    public final void e() {
    }

    @Override // xsna.uq10
    public final void f() {
    }
}
