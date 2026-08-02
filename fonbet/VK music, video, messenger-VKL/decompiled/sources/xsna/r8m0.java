package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollOption;
import com.vk.polls.ui.PollStyle;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.nov;

/* compiled from: StoryPollSticker.kt */
/* loaded from: classes5.dex */
public final class r8m0 extends kr9 implements v4l0 {
    public static final float Z = iah0.b(264.0f);
    public final float A;
    public final t8m0 B;
    public final Drawable C;
    public final float D;
    public final float E;
    public final float F;
    public final int G;
    public final int H;
    public final int I;
    public final a[] J;
    public final StaticLayout[] K;
    public final float L;
    public final float M;
    public final float N;
    public final ArrayList O;
    public float P;
    public final int Q;
    public StaticLayout R;
    public StaticLayout S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public final float W;
    public final float X;
    public int Y;
    public q8m0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final PollStyle l;
    public final wrb0 m;
    public final Paint n;
    public final TextPaint o;
    public final TextPaint p;
    public final Paint q;
    public final TextPaint r;
    public final TextPaint s;
    public final TextPaint t;
    public final Paint u;
    public final TextPaint v;
    public final TextPaint w;
    public boolean x;
    public final float y;
    public final float z;

    /* compiled from: StoryPollSticker.kt */
    public static final class a {
        public final StaticLayout a;
        public final StaticLayout b;
        public final StaticLayout c;
        public final Paint d;

        public a(StaticLayout staticLayout, StaticLayout staticLayout2, StaticLayout staticLayout3, Paint paint) {
            this.a = staticLayout;
            this.b = staticLayout2;
            this.c = staticLayout3;
            this.d = paint;
        }
    }

    public r8m0(q8m0 q8m0Var, boolean z) {
        int f;
        this.h = q8m0Var;
        this.i = z;
        s8m0 s8m0Var = q8m0Var.c;
        s8m0Var.getClass();
        this.j = true;
        boolean z2 = s8m0Var.a;
        this.k = z2;
        PollStyle pollStyle = z2 ? PollStyle.CONTENT_COLOR : PollStyle.DYNAMIC;
        this.l = pollStyle;
        this.m = new wrb0();
        this.n = rqi.b(1, -1);
        this.o = wrb0.c(pollStyle);
        TextPaint textPaint = new TextPaint(1);
        Context context = e43.a;
        context = context == null ? null : context;
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.j(textPaint, context, fontFamily, Float.valueOf(13.0f), 8);
        this.p = textPaint;
        Paint paint = new Paint(1);
        if (z2) {
            Context context2 = e43.a;
            f = krv0.m(R.attr.vk_ui_background_secondary, context2 == null ? null : context2);
        } else {
            f = l8g.f(0.16f, -1);
        }
        paint.setColor(f);
        this.q = paint;
        TextPaint a2 = wrb0.a(pollStyle);
        this.r = a2;
        TextPaint textPaint2 = new TextPaint(a2);
        textPaint2.setColor(l8g.f(0.36f, -1));
        this.s = textPaint2;
        TextPaint textPaint3 = new TextPaint(a2);
        Context context3 = e43.a;
        context3 = context3 == null ? null : context3;
        FontFamily fontFamily2 = FontFamily.MEDIUM;
        com.vk.typography.b.j(textPaint3, context3, fontFamily2, null, 12);
        this.t = textPaint3;
        this.u = rqi.b(1, -1);
        TextPaint textPaint4 = new TextPaint(1);
        textPaint4.setColor(-16777216);
        Context context4 = e43.a;
        com.vk.typography.b.j(textPaint4, context4 == null ? null : context4, fontFamily2, Float.valueOf(14.0f), 8);
        this.v = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        Context context5 = e43.a;
        textPaint5.setColor((context5 == null ? null : context5).getColor(R.color.vk_white_alpha60));
        Context context6 = e43.a;
        com.vk.typography.b.c(textPaint5, context6 == null ? null : context6, fontFamily, Float.valueOf(iah0.b(13.0f)), TextSizeUnit.PX);
        this.w = textPaint5;
        this.x = true;
        this.y = iah0.b(12.0f);
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b = z2 ? 0.0f : iah0.b(6.0f);
        this.z = b;
        float b2 = z2 ? 0.0f : iah0.b(25.0f);
        this.A = b2;
        this.B = new t8m0(b + b2, this.h.c.a, z);
        Context context7 = e43.a;
        Drawable a3 = m33.a(R.drawable.ic_poll_circle_shape, context7 != null ? context7 : null);
        this.C = a3;
        this.D = iah0.b(16.0f);
        this.E = iah0.b(z2 ? 17.0f : 12.0f);
        this.F = iah0.b(4.0f);
        this.G = 10;
        this.H = iah0.a(z2 ? 4 : 8);
        this.I = iah0.a(z2 ? 38 : 32);
        this.J = new a[10];
        this.K = new StaticLayout[10];
        this.L = iah0.b(36.0f);
        this.M = iah0.b(10.0f);
        this.N = iah0.b(8.0f);
        this.O = new ArrayList();
        this.P = this.h.a.i ? iah0.b(4.0f) : f2;
        this.Q = iah0.a(z2 ? 10 : 9);
        this.V = iah0.b(150.0f);
        int a4 = iah0.a(2);
        int b3 = an10.b((Z - a3.getIntrinsicWidth()) * 0.5f);
        a3.setAlpha(255);
        a3.setBounds(b3 + a4, -a4, (a3.getIntrinsicWidth() + b3) - a4, a3.getIntrinsicHeight() - (a4 * 3));
        p();
        this.W = 4.0f;
        this.X = 0.25f;
        this.Y = this.g;
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        r8m0 r8m0Var = new r8m0(this.h, this.i);
        nov.a.b(this, r8m0Var);
        return r8m0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        int i;
        Paint paint;
        int i2;
        wrb0 wrb0Var;
        float f;
        float f2;
        Ref$FloatRef ref$FloatRef;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        Canvas canvas2 = canvas;
        boolean z = this.k;
        float f4 = this.E;
        t8m0 t8m0Var = this.B;
        float f5 = this.y;
        if (z) {
            t8m0Var.draw(canvas2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            float f6 = this.D;
            ref$FloatRef2.element = f6;
            StaticLayout staticLayout = this.R;
            if (staticLayout != null) {
                int save = canvas2.save();
                canvas2.translate(f5, f6);
                staticLayout.draw(canvas2);
                canvas2.restoreToCount(save);
                f6 += staticLayout.getHeight();
            }
            ref$FloatRef2.element = f6;
            s3q0 s3q0Var = s3q0.a;
            float f7 = f6 + this.P;
            ref$FloatRef2.element = f7;
            StaticLayout staticLayout2 = this.S;
            if (staticLayout2 != null) {
                int save2 = canvas2.save();
                canvas2.translate(f5, f7);
                staticLayout2.draw(canvas2);
                canvas2.restoreToCount(save2);
                f7 += staticLayout2.getHeight();
            }
            ref$FloatRef2.element = f7 + f4;
            if (this.h.a.isExpired()) {
                r(canvas2, ref$FloatRef2.element, new fuc0(ref$FloatRef2, 11));
                return;
            } else {
                s(canvas2, ref$FloatRef2.element, new j6l0(ref$FloatRef2, 4));
                return;
            }
        }
        boolean z2 = this.j;
        float f8 = this.A;
        float f9 = this.z;
        if (z2) {
            Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            t8m0Var.draw(canvas2);
            q(canvas);
            float f10 = ((f9 + f8) * 2) + ref$FloatRef3.element;
            ref$FloatRef3.element = f10;
            StaticLayout staticLayout3 = this.R;
            if (staticLayout3 != null) {
                int save3 = canvas2.save();
                canvas2.translate(f5, f10);
                staticLayout3.draw(canvas2);
                canvas2.restoreToCount(save3);
                f10 += staticLayout3.getHeight();
            }
            ref$FloatRef3.element = f10;
            s3q0 s3q0Var2 = s3q0.a;
            float f11 = f10 + this.P;
            ref$FloatRef3.element = f11;
            StaticLayout staticLayout4 = this.S;
            if (staticLayout4 != null) {
                int save4 = canvas2.save();
                canvas2.translate(f5, f11);
                staticLayout4.draw(canvas2);
                canvas2.restoreToCount(save4);
                f11 += staticLayout4.getHeight();
            }
            ref$FloatRef3.element = f11 + f4;
            if (this.h.a.isExpired()) {
                r(canvas2, ref$FloatRef3.element, new mi10(ref$FloatRef3, 29));
                return;
            } else {
                s(canvas2, ref$FloatRef3.element, new xd40(ref$FloatRef3, 23));
                return;
            }
        }
        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
        t8m0Var.draw(canvas2);
        q(canvas);
        float f12 = 2;
        float f13 = ((f9 + f8) * f12) + ref$FloatRef4.element;
        ref$FloatRef4.element = f13;
        StaticLayout staticLayout5 = this.R;
        if (staticLayout5 != null) {
            int save5 = canvas2.save();
            canvas2.translate(f5, f13);
            staticLayout5.draw(canvas2);
            canvas2.restoreToCount(save5);
            f13 += staticLayout5.getHeight();
        }
        ref$FloatRef4.element = f13;
        s3q0 s3q0Var3 = s3q0.a;
        StaticLayout staticLayout6 = this.T;
        if (staticLayout6 != null) {
            float f14 = f13 + this.F;
            int save6 = canvas2.save();
            canvas2.translate(f5, f14);
            staticLayout6.draw(canvas2);
            canvas2.restoreToCount(save6);
            f13 = f14 + staticLayout6.getHeight();
        }
        float f15 = f13 + f4;
        ref$FloatRef4.element = f15;
        int size = this.h.a.f.size();
        int i7 = this.G;
        int min = StrictMath.min(size, i7);
        int save7 = canvas2.save();
        float f16 = f15;
        int i8 = 0;
        while (true) {
            i = this.H;
            paint = this.q;
            i2 = this.I;
            wrb0Var = this.m;
            f = Z;
            if (i8 >= min) {
                break;
            }
            a aVar = (a) rl3.S(i8, this.J);
            if (aVar != null) {
                StaticLayout staticLayout7 = aVar.b;
                f2 = f5;
                StaticLayout staticLayout8 = aVar.a;
                f3 = f12;
                StaticLayout staticLayout9 = aVar.c;
                int i9 = i8;
                float f17 = this.y;
                float f18 = f - (f3 * f17);
                float f19 = i2 + f16;
                float f20 = this.M;
                i3 = i7;
                i4 = min;
                i6 = i9;
                ref$FloatRef = ref$FloatRef4;
                i5 = save7;
                canvas.drawRoundRect(f17, f16, f17 + f18, f19, f20, f20, paint);
                float f21 = f18 * this.h.a.f.get(i6).e * 0.01f;
                float f22 = this.y;
                float f23 = this.M;
                canvas2 = canvas;
                canvas2.drawRoundRect(f22, f16, f22 + f21, f19, f23, f23, aVar.d);
                int save8 = canvas2.save();
                canvas2.translate(((f - f2) - wrb0Var.a) - staticLayout9.getWidth(), ((i2 - staticLayout9.getHeight()) * 0.5f) + f16);
                staticLayout9.draw(canvas2);
                canvas2.restoreToCount(save8);
                float f24 = f2 + wrb0Var.a;
                int save9 = canvas2.save();
                canvas2.translate(f24, ((i2 - staticLayout8.getHeight()) * 0.5f) + f16);
                staticLayout8.draw(canvas2);
                canvas2.restoreToCount(save9);
                int save10 = canvas2.save();
                canvas2.translate(f24 + staticLayout8.getWidth(), ((i2 - staticLayout7.getHeight()) * 0.5f) + f16);
                staticLayout7.draw(canvas2);
                canvas2.restoreToCount(save10);
                f16 += i2 + i;
            } else {
                f2 = f5;
                ref$FloatRef = ref$FloatRef4;
                f3 = f12;
                i3 = i7;
                i4 = min;
                i5 = save7;
                i6 = i8;
            }
            i8 = i6 + 1;
            i7 = i3;
            f5 = f2;
            f12 = f3;
            ref$FloatRef4 = ref$FloatRef;
            save7 = i5;
            min = i4;
        }
        float f25 = f5;
        Ref$FloatRef ref$FloatRef5 = ref$FloatRef4;
        float f26 = f12;
        canvas2.restoreToCount(save7);
        ref$FloatRef5.element = f16;
        s3q0 s3q0Var4 = s3q0.a;
        int min2 = StrictMath.min(this.h.a.f.size(), i7);
        int save11 = canvas2.save();
        for (int i10 = 0; i10 < min2; i10++) {
            StaticLayout staticLayout10 = (StaticLayout) rl3.S(i10, this.K);
            if (staticLayout10 != null) {
                float f27 = this.y;
                float f28 = this.M;
                canvas2.drawRoundRect(f27, f16, (f - (f26 * f27)) + f27, i2 + f16, f28, f28, paint);
                int save12 = canvas2.save();
                canvas2.translate(f25 + wrb0Var.a, ((i2 - staticLayout10.getHeight()) * 0.5f) + f16);
                staticLayout10.draw(canvas2);
                canvas2.restoreToCount(save12);
                f16 += i2 + i;
            }
        }
        canvas2.restoreToCount(save11);
        ref$FloatRef5.element = f16;
        s3q0 s3q0Var5 = s3q0.a;
        StaticLayout staticLayout11 = this.U;
        if (staticLayout11 != null) {
            float f29 = this.y;
            float f30 = this.L;
            float f31 = f16 + f30;
            float f32 = this.M;
            canvas2.drawRoundRect(f29, f16, f - f29, f31, f32, f32, this.u);
            int save13 = canvas2.save();
            canvas2.translate(f25 + this.N, u11.b(f30, staticLayout11.getHeight(), 0.5f, f16));
            staticLayout11.draw(canvas2);
            canvas2.restoreToCount(save13);
            f16 = f31;
        }
        ref$FloatRef5.element = f16;
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMaxScaleLimit() {
        return this.W;
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMinScaleLimit() {
        return this.X;
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.V;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return Z;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.Y;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p() {
        TextPaint textPaint;
        int i;
        float f;
        TextPaint textPaint2;
        TextPaint textPaint3;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        TextPaint textPaint4;
        StaticLayout staticLayout3;
        float f2;
        int i2;
        int f3;
        int i3;
        int i4;
        StaticLayout staticLayout4;
        TextPaint textPaint5;
        int i5;
        int i6;
        float f4;
        TextPaint textPaint6;
        int i7;
        TextPaint textPaint7;
        int i8;
        TextPaint textPaint8;
        float f5;
        a aVar;
        int f6;
        Poll poll = this.h.a;
        String str = poll.d;
        List<PollOption> list = poll.f;
        this.c.q = poll.h == 0 && !poll.isExpired();
        float f7 = 2;
        float f8 = this.y;
        float f9 = Z;
        float f10 = f9 - (f7 * f8);
        PollBackground pollBackground = this.h.a.s;
        boolean z = pollBackground == null || ((pollBackground instanceof PhotoPoll) && l8g.d(((PhotoPoll) pollBackground).c)) || ((pollBackground instanceof PollContentColor) && ((PollContentColor) pollBackground).d != StickerCommonStyle.DARK);
        int i9 = (int) f10;
        wrb0 wrb0Var = this.m;
        wrb0Var.getClass();
        int i10 = wrb0Var.a;
        TextPaint textPaint9 = this.o;
        this.R = wrb0.d(i9, textPaint9, str);
        boolean isExpired = poll.isExpired();
        TextPaint textPaint10 = this.w;
        boolean z2 = this.k;
        if (isExpired && z2) {
            this.P = iah0.b(4.0f);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            f = 4.0f;
            textPaint = textPaint10;
            i = i9;
            this.S = new StaticLayout(context.getString(R.string.poll_expired_status), textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        } else {
            textPaint = textPaint10;
            i = i9;
            f = 4.0f;
            this.S = null;
        }
        StaticLayout staticLayout5 = this.S;
        boolean z3 = this.j;
        if (staticLayout5 != null) {
            textPaint2 = textPaint;
        } else if (poll.i && z3) {
            this.P = iah0.b(f);
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            textPaint2 = textPaint;
            this.S = new StaticLayout(context2.getString(R.string.poll_anonymous), textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        } else {
            textPaint2 = textPaint;
            this.S = null;
        }
        boolean isExpired2 = poll.isExpired();
        TextPaint textPaint11 = this.p;
        if (isExpired2) {
            int i11 = AbstractPollView.S;
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            xxk0 xxk0Var = new xxk0(AbstractPollView.b.a(context3, poll, false), textPaint11, i, Layout.Alignment.ALIGN_CENTER, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TextUtils.TruncateAt.END, 0, 7640);
            textPaint3 = textPaint11;
            staticLayout = xxk0Var.a();
        } else {
            textPaint3 = textPaint11;
            staticLayout = null;
        }
        this.T = staticLayout;
        int i12 = z ? -16777216 : -1;
        TextPaint textPaint12 = this.r;
        textPaint12.setColor(i12);
        int i13 = z ? -16777216 : -1;
        TextPaint textPaint13 = this.s;
        textPaint13.setColor(i13);
        int i14 = z ? -16777216 : -1;
        TextPaint textPaint14 = textPaint13;
        TextPaint textPaint15 = this.t;
        textPaint15.setColor(i14);
        int size = poll.isExpired() ? list.size() : 0;
        int i15 = this.G;
        int min = StrictMath.min(size, i15);
        a[] aVarArr = this.J;
        int length = aVarArr.length;
        TextPaint textPaint16 = textPaint12;
        int i16 = 0;
        while (i16 < length) {
            if (i16 < min) {
                String str2 = list.get(i16).c;
                Serializer.c<PollOption> cVar = PollOption.CREATOR;
                i6 = length;
                String a2 = lhg.a(list.get(i16).d, " · ");
                String a3 = PollOption.a.a(list.get(i16).e);
                StaticLayout a4 = new xxk0(a2, textPaint14, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8188).a();
                textPaint14 = textPaint14;
                StaticLayout a5 = new xxk0(a3, textPaint15, 0, Layout.Alignment.ALIGN_OPPOSITE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8156).a();
                i8 = min;
                f4 = f7;
                i7 = i10;
                textPaint6 = textPaint2;
                TextPaint textPaint17 = textPaint16;
                textPaint5 = textPaint3;
                f5 = f8;
                textPaint7 = textPaint9;
                textPaint8 = textPaint17;
                StaticLayout b = wrb0.b(str2, (int) this.m.e(str2, f10, a4.getWidth(), a5.getWidth(), textPaint17), textPaint8, this.l);
                float f11 = list.get(i16).e / 100.0f;
                Paint paint = new Paint(1);
                if (z) {
                    i5 = i16;
                    f6 = l8g.f(f11 * 0.1f, e43.a.getColor(R.color.vk_blue_600));
                } else {
                    i5 = i16;
                    f6 = l8g.f(f11 * 0.16f, -1);
                }
                paint.setColor(f6);
                s3q0 s3q0Var = s3q0.a;
                aVar = new a(b, a4, a5, paint);
            } else {
                textPaint5 = textPaint3;
                i5 = i16;
                i6 = length;
                f4 = f7;
                textPaint6 = textPaint2;
                i7 = i10;
                textPaint7 = textPaint9;
                i8 = min;
                textPaint8 = textPaint16;
                f5 = f8;
                aVar = null;
            }
            aVarArr[i5] = aVar;
            i16 = i5 + 1;
            i10 = i7;
            min = i8;
            f8 = f5;
            length = i6;
            f7 = f4;
            textPaint2 = textPaint6;
            textPaint16 = textPaint8;
            textPaint9 = textPaint7;
            textPaint3 = textPaint5;
        }
        TextPaint textPaint18 = textPaint3;
        float f12 = f7;
        TextPaint textPaint19 = textPaint2;
        int i17 = i10;
        TextPaint textPaint20 = textPaint9;
        TextPaint textPaint21 = textPaint16;
        float f13 = f8;
        StaticLayout[] staticLayoutArr = this.K;
        ArrayList arrayList = this.O;
        if (z3) {
            arrayList.clear();
            int min2 = StrictMath.min(list.size(), i15);
            int length2 = staticLayoutArr.length;
            int i18 = 0;
            while (i18 < length2) {
                if (i18 < min2) {
                    String str3 = list.get(i18).c;
                    i3 = min2;
                    i4 = i17;
                    staticLayout4 = StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint21, (int) StrictMath.min((f10 - i17) - iah0.a(60), textPaint21.measureText(str3))).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(3).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                    arrayList.add(Integer.valueOf((this.Q * 2) + staticLayout4.getHeight()));
                } else {
                    i3 = min2;
                    i4 = i17;
                    staticLayout4 = null;
                }
                staticLayoutArr[i18] = staticLayout4;
                i18++;
                min2 = i3;
                i17 = i4;
            }
        } else if (!poll.isExpired()) {
            int min3 = StrictMath.min(list.size(), i15);
            int length3 = staticLayoutArr.length;
            for (int i19 = 0; i19 < length3; i19++) {
                if (i19 < min3) {
                    String str4 = list.get(i19).c;
                    staticLayout2 = new xxk0(str4, textPaint21, (int) StrictMath.min(f10 - (i17 * 2), textPaint21.measureText(str4)), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TextUtils.TruncateAt.END, 0, 7672).a();
                } else {
                    staticLayout2 = null;
                }
                staticLayoutArr[i19] = staticLayout2;
            }
        }
        String str5 = "";
        if (poll.isExpired()) {
            if (list.size() > i15) {
                str5 = y8g0.e(R.string.poll_result_show_all);
            }
        } else if (this.h.a.f.size() > i15) {
            str5 = y8g0.c(R.plurals.poll_extra_options, this.h.a.f.size() - i15);
        }
        String str6 = str5;
        int length4 = str6.length();
        TextPaint textPaint22 = this.v;
        if (length4 > 0) {
            textPaint4 = textPaint22;
            staticLayout3 = new xxk0(str6, textPaint22, an10.b(f9 - ((f13 + this.N) * f12)), Layout.Alignment.ALIGN_CENTER, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TextUtils.TruncateAt.END, 0, 7640).a();
        } else {
            textPaint4 = textPaint22;
            staticLayout3 = null;
        }
        this.U = staticLayout3;
        int i20 = this.H;
        float f14 = this.E;
        float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            int min4 = StrictMath.min(list.size(), i15);
            StaticLayout staticLayout6 = this.R;
            int height = staticLayout6 != null ? staticLayout6.getHeight() : 0;
            StaticLayout staticLayout7 = this.S;
            int height2 = staticLayout7 != null ? staticLayout7.getHeight() : 0;
            float f16 = this.D + height;
            if (this.S != null) {
                f15 = height2 + this.P;
            }
            f2 = f16 + f15 + f14 + j5g.F0(arrayList) + ((min4 - 1) * i20) + f13;
        } else {
            float f17 = this.A;
            float f18 = this.z;
            if (z3) {
                int min5 = StrictMath.min(list.size(), i15);
                StaticLayout staticLayout8 = this.R;
                int height3 = staticLayout8 != null ? staticLayout8.getHeight() : 0;
                StaticLayout staticLayout9 = this.S;
                int height4 = staticLayout9 != null ? staticLayout9.getHeight() : 0;
                float f19 = ((f18 + f17) * 2.0f) + height3;
                if (this.S != null) {
                    f15 = height4 + this.P;
                }
                f2 = f19 + f15 + f14 + j5g.F0(arrayList) + ((min5 - 1) * i20) + f13;
            } else {
                int min6 = StrictMath.min(list.size(), i15);
                StaticLayout staticLayout10 = this.R;
                float height5 = ((this.I + i20) * min6) + ((f18 + f17) * 2.0f) + (staticLayout10 != null ? staticLayout10.getHeight() : 0) + (this.T == null ? 0.0f : this.F + (this.T != null ? r5.getHeight() : 0)) + f14;
                if (this.U != null) {
                    f15 = this.L;
                }
                f2 = height5 + f15 + f13;
            }
        }
        this.V = f2;
        q8m0 q8m0Var = this.h;
        PollBackground pollBackground2 = q8m0Var.a.s;
        PollContentColor pollContentColor = pollBackground2 instanceof PollContentColor ? (PollContentColor) pollBackground2 : null;
        StickerCommonStyle stickerCommonStyle = pollContentColor != null ? pollContentColor.d : null;
        v2l0 v2l0Var = q8m0Var.c.b;
        t8m0 t8m0Var = this.B;
        t8m0Var.setBounds(0, 0, (int) f9, (int) f2);
        t8m0Var.b(pollBackground, v2l0Var);
        boolean z4 = pollBackground instanceof PhotoPoll;
        this.x = z4;
        Paint paint2 = this.u;
        Paint paint3 = this.q;
        if (!z2 || stickerCommonStyle == null || v2l0Var == null) {
            Drawable drawable = this.C;
            if (z) {
                int color = e43.a.getColor(R.color.vk_azure_300);
                drawable.setTint(color);
                paint2.setColor(color);
                textPaint4.setColor(-1);
                textPaint20.setColor(-16777216);
                textPaint19.setColor(e43.a.getColor(R.color.vk_steel_gray_400));
                paint3.setColor(l8g.f(0.1f, e43.a.getColor(R.color.vk_blue_600)));
            } else {
                drawable.setTint(-1);
                paint2.setColor(-1);
                textPaint4.setColor(-16777216);
                textPaint20.setColor((z4 && l8g.d(((PhotoPoll) pollBackground).c)) ? -16777216 : -1);
                if (z4 && l8g.d(((PhotoPoll) pollBackground).c)) {
                    f3 = e43.a.getColor(R.color.vk_steel_gray_400);
                    i2 = -1;
                } else {
                    i2 = -1;
                    f3 = l8g.f(0.85f, -1);
                }
                textPaint19.setColor(f3);
                paint3.setColor(l8g.f(0.16f, i2));
            }
        } else {
            Context context4 = e43.a;
            if (context4 == null) {
                context4 = null;
            }
            textPaint20.setColor(v2l0Var.b(context4, stickerCommonStyle, StickerColorToken.POLL_TITLE));
            Context context5 = e43.a;
            if (context5 == null) {
                context5 = null;
            }
            textPaint19.setColor(v2l0Var.b(context5, stickerCommonStyle, StickerColorToken.POLL_SUBTITLE));
            Context context6 = e43.a;
            if (context6 == null) {
                context6 = null;
            }
            paint3.setColor(v2l0Var.b(context6, stickerCommonStyle, StickerColorToken.POLL_OPTION_BACKGROUND));
            Context context7 = e43.a;
            if (context7 == null) {
                context7 = null;
            }
            textPaint21.setColor(v2l0Var.b(context7, stickerCommonStyle, StickerColorToken.POLL_OPTION_TEXT));
        }
        paint2.setAlpha(z3 ? 163 : 0);
        textPaint4.setAlpha(z3 ? 163 : 0);
        textPaint18.setColor(l8g.f(0.72f, textPaint20.getColor()));
        this.n.setColor(pollBackground != null ? pollBackground.c : 0);
    }

    public final void q(Canvas canvas) {
        boolean z = this.x;
        float f = Z;
        if (z) {
            int a2 = iah0.a(2);
            float f2 = this.z;
            float f3 = this.A;
            canvas.drawCircle(f * 0.5f, f2 + f3, f3 - a2, this.n);
        }
        int save = canvas.save();
        float b = iah0.b(66.0f);
        Drawable drawable = this.C;
        canvas.scale(b / drawable.getIntrinsicWidth(), b / drawable.getIntrinsicHeight(), f * 0.5f, drawable.getBounds().top);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void r(Canvas canvas, float f, izs<? super Float, s3q0> izsVar) {
        int i;
        int min = StrictMath.min(this.h.a.f.size(), this.G);
        int save = canvas.save();
        float f2 = f;
        int i2 = 0;
        while (i2 < min) {
            a aVar = (a) rl3.S(i2, this.J);
            if (aVar != null) {
                StaticLayout staticLayout = aVar.a;
                StaticLayout staticLayout2 = aVar.c;
                float f3 = this.y;
                float f4 = Z;
                float f5 = f4 - (2 * f3);
                ArrayList arrayList = this.O;
                float floatValue = ((Number) arrayList.get(i2)).floatValue() + f2;
                float f6 = this.M;
                i = min;
                canvas.drawRoundRect(f3, f2, f3 + f5, floatValue, f6, f6, this.q);
                float f7 = f5 * this.h.a.f.get(i2).e * 0.01f;
                float f8 = this.y;
                float floatValue2 = ((Number) arrayList.get(i2)).floatValue() + f2;
                float f9 = this.M;
                canvas.drawRoundRect(f8, f2, f8 + f7, floatValue2, f9, f9, aVar.d);
                float f10 = this.y;
                wrb0 wrb0Var = this.m;
                int save2 = canvas.save();
                canvas.translate(((f4 - f10) - wrb0Var.a) - staticLayout2.getWidth(), ((((Number) arrayList.get(i2)).intValue() - staticLayout2.getHeight()) * 0.5f) + f2);
                staticLayout2.draw(canvas);
                canvas.restoreToCount(save2);
                float f11 = f10 + wrb0Var.a;
                int save3 = canvas.save();
                canvas.translate(f11, ((((Number) arrayList.get(i2)).intValue() - staticLayout.getHeight()) * 0.5f) + f2);
                staticLayout.draw(canvas);
                canvas.restoreToCount(save3);
                f2 += ((Number) arrayList.get(i2)).intValue() + this.H;
            } else {
                i = min;
            }
            i2++;
            min = i;
        }
        canvas.restoreToCount(save);
        izsVar.invoke(Float.valueOf(f2));
    }

    public final void s(Canvas canvas, float f, izs<? super Float, s3q0> izsVar) {
        Canvas canvas2;
        int min = StrictMath.min(this.h.a.f.size(), this.G);
        int save = canvas.save();
        int i = 0;
        float f2 = f;
        while (i < min) {
            StaticLayout staticLayout = (StaticLayout) rl3.S(i, this.K);
            if (staticLayout != null) {
                float f3 = this.y;
                float f4 = (Z - (2 * f3)) + f3;
                float floatValue = ((Number) this.O.get(i)).floatValue() + f2;
                float f5 = this.M;
                canvas2 = canvas;
                canvas2.drawRoundRect(f3, f2, f4, floatValue, f5, f5, this.q);
                float f6 = this.y + this.m.a;
                int save2 = canvas2.save();
                canvas2.translate(f6, ((((Number) r11.get(i)).intValue() - staticLayout.getHeight()) * 0.5f) + f2);
                staticLayout.draw(canvas2);
                canvas2.restoreToCount(save2);
                f2 += ((Number) r11.get(i)).intValue() + this.H;
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
        canvas.restoreToCount(save);
        izsVar.invoke(Float.valueOf(f2));
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.Y = i;
        this.n.setAlpha(i);
        this.C.setAlpha(i);
        this.o.setAlpha(i);
        this.u.setAlpha(i);
        this.v.setAlpha(i);
        this.B.setAlpha(i);
    }
}
