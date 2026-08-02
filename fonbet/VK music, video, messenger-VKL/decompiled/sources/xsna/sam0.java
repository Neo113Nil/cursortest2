package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import xsna.nov;

/* compiled from: StoryQuestionSticker.kt */
/* loaded from: classes6.dex */
public final class sam0 extends kr9 implements v4l0 {
    public static final float A;
    public static final TextPaint B;
    public static final TextPaint C;
    public static final TextPaint D;
    public static final int u;
    public static final int v;
    public static final float w;
    public static final float x;
    public static final int y;
    public static final int z;
    public StoryQuestionInfo h;
    public final Drawable i = m33.a(R.drawable.bg_story_question, e43.a);
    public final Drawable j = m33.a(R.drawable.bg_story_question_button, e43.a);
    public final Drawable k = m33.a(R.drawable.bg_story_input_sample, e43.a);
    public final Rect l = new Rect();
    public final Rect m = new Rect();
    public final Rect n = new Rect();
    public StaticLayout o;
    public StaticLayout p;
    public StaticLayout q;
    public float r;
    public final float s;
    public final float t;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        u = e3m.a(R.dimen.story_question_sticker_width, context);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        v = e3m.a(R.dimen.story_question_sticker_content_bottom_space, context2);
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        w = e3m.a(R.dimen.story_question_sticker_content_top_space, context3);
        Context context4 = e43.a;
        if (context4 == null) {
            context4 = null;
        }
        x = e3m.a(R.dimen.story_question_sticker_content_left_right_space, context4);
        Context context5 = e43.a;
        if (context5 == null) {
            context5 = null;
        }
        y = e3m.a(R.dimen.story_question_sticker_button_height, context5);
        Context context6 = e43.a;
        if (context6 == null) {
            context6 = null;
        }
        z = e3m.a(R.dimen.story_question_sticker_input_field_height, context6);
        Context context7 = e43.a;
        if (context7 == null) {
            context7 = null;
        }
        A = e3m.a(R.dimen.story_question_button_outer_top_space_new, context7);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-16777216);
        Context context8 = e43.a;
        if (context8 == null) {
            context8 = null;
        }
        FontFamily fontFamily = FontFamily.MEDIUM;
        Context context9 = e43.a;
        if (context9 == null) {
            context9 = null;
        }
        Float valueOf = Float.valueOf(e3m.a(R.dimen.story_question_text_size, context9));
        TextSizeUnit textSizeUnit = TextSizeUnit.PX;
        com.vk.typography.b.c(textPaint, context8, fontFamily, valueOf, textSizeUnit);
        B = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(-1);
        Context context10 = e43.a;
        Context context11 = context10 != null ? context10 : null;
        if (context10 == null) {
            context10 = null;
        }
        com.vk.typography.b.c(textPaint2, context11, fontFamily, Float.valueOf(e3m.a(R.dimen.story_question_button_text_size, context10)), textSizeUnit);
        C = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(-1);
        Context context12 = e43.a;
        if (context12 == null) {
            context12 = null;
        }
        com.vk.typography.b.c(textPaint3, context12, FontFamily.REGULAR, Float.valueOf(e3m.a(R.dimen.story_answer_field_text_size, e43.a != null ? r4 : null)), textSizeUnit);
        D = textPaint3;
    }

    public sam0(StoryQuestionInfo storyQuestionInfo) {
        this.h = storyQuestionInfo;
        p(this.h);
        this.s = 0.25f;
        this.t = 4.0f;
    }

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        sam0 sam0Var = new sam0(this.h);
        nov.a.b(this, sam0Var);
        return sam0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        this.i.draw(canvas);
        canvas.save();
        float f = w;
        float f2 = x;
        canvas.translate(f2, f);
        StaticLayout staticLayout = this.o;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        this.k.draw(canvas);
        canvas.save();
        Rect rect = this.n;
        canvas.translate(rect.left + f2, rect.top + this.r);
        StaticLayout staticLayout2 = this.q;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        canvas.restore();
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMaxScaleLimit() {
        return this.t;
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMinScaleLimit() {
        return this.s;
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.l.height();
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return this.l.width();
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.g;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final void p(StoryQuestionInfo storyQuestionInfo) {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        float f = x;
        int b = an10.b(f);
        int i = storyQuestionInfo.c;
        int i2 = u;
        if (i == 0 || i == i2) {
            i = i2;
        }
        int i3 = i - (b * 2);
        ucp ucpVar = ucp.a;
        CharSequence i4 = ucp.i(storyQuestionInfo.a);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.o = new StaticLayout(i4, B, i3, alignment, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        float height = w + r5.getHeight() + A;
        int i5 = z;
        int i6 = v;
        int b2 = an10.b(height + i5 + i6);
        Rect rect = this.l;
        rect.set(0, 0, i, b2);
        Drawable drawable = this.i;
        drawable.setBounds(rect);
        int b3 = an10.b(f) + rect.left;
        int i7 = (rect.bottom - i6) - y;
        int b4 = rect.right - an10.b(f);
        int i8 = rect.bottom - i6;
        Rect rect2 = this.m;
        rect2.set(b3, i7, b4, i8);
        Drawable drawable2 = this.j;
        drawable2.setBounds(rect2);
        this.p = new StaticLayout(ucp.i(storyQuestionInfo.b), C, rect2.width(), alignment, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        rect2.height();
        this.p.getHeight();
        int b5 = an10.b(f) + rect.left;
        int i9 = (rect.bottom - i6) - i5;
        int b6 = rect.right - an10.b(f);
        int i10 = rect.bottom - i6;
        Rect rect3 = this.n;
        rect3.set(b5, i9, b6, i10);
        Drawable drawable3 = this.k;
        drawable3.setBounds(rect3);
        this.q = new StaticLayout(y8g0.e(R.string.story_question_input_field_hint), D, rect3.width(), Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        this.r = (rect3.height() - this.q.getHeight()) * 0.5f;
        StoryQuestionInfo.a aVar = storyQuestionInfo.d;
        ((GradientDrawable) drawable).setColor(aVar.a);
        StaticLayout staticLayout = this.o;
        if (staticLayout != null && (paint3 = staticLayout.getPaint()) != null) {
            paint3.setColor(aVar.d);
        }
        ((GradientDrawable) drawable2).setColor(aVar.b);
        ((GradientDrawable) drawable3).setColor(aVar.g);
        StaticLayout staticLayout2 = this.p;
        if (staticLayout2 != null && (paint2 = staticLayout2.getPaint()) != null) {
            paint2.setColor(aVar.f);
        }
        StaticLayout staticLayout3 = this.q;
        if (staticLayout3 == null || (paint = staticLayout3.getPaint()) == null) {
            return;
        }
        paint.setColor(aVar.h);
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        this.i.setAlpha(i);
        this.j.setAlpha(i);
        StaticLayout staticLayout = this.o;
        if (staticLayout != null && (paint3 = staticLayout.getPaint()) != null) {
            paint3.setAlpha(i);
        }
        StaticLayout staticLayout2 = this.p;
        if (staticLayout2 != null && (paint2 = staticLayout2.getPaint()) != null) {
            paint2.setAlpha(i);
        }
        this.k.setAlpha(i);
        StaticLayout staticLayout3 = this.q;
        if (staticLayout3 == null || (paint = staticLayout3.getPaint()) == null) {
            return;
        }
        paint.setAlpha(i);
    }
}
