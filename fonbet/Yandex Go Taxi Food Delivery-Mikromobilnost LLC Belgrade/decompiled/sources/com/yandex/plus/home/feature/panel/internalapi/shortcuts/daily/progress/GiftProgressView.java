package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.plus.home.common.utils.c;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ard0;
import defpackage.bb1;
import defpackage.cht;
import defpackage.dht;
import defpackage.eht;
import defpackage.eob1;
import defpackage.fht;
import defpackage.ght;
import defpackage.hht;
import defpackage.iws;
import defpackage.j73;
import defpackage.nj2;
import defpackage.nvg0;
import defpackage.rng0;
import defpackage.sls;
import defpackage.sss;
import defpackage.sxo;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.yso;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/progress/GiftProgressView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lght;", "content", "Lzy11;", "initProperties", "(Lght;)V", "", "progressPercent", "updateTextPaintShader", "(Lght;F)V", "updateBackground", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDetachedFromWindow", "()V", "", "withAnimation", "Lard0;", "shortcutViewAwarenessDetector", "Ltse;", "scope", "setContent", "(Lght;ZLard0;Ltse;)V", "contentHeight", CA20Status.STATUS_USER_I, UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "scoreMarginStart", "Landroid/graphics/drawable/ShapeDrawable;", "shapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Z", "Lcht;", "animator", "Lcht;", "Companion", "hht", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GiftProgressView extends AppCompatTextView {
    private static final hht Companion = new hht();

    @Deprecated
    public static final float DEFAULT_TEXT_SIZE = 14.0f;
    private cht animator;
    private final int contentHeight;
    private final float cornerRadius;
    private final float scoreMarginStart;
    private final ShapeDrawable shapeDrawable;
    private boolean withAnimation;

    public GiftProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.contentHeight = bb1.q(nvg0.plus_sdk_panel_daily_gift_progress_content_height, this);
        this.cornerRadius = bb1.q(nvg0.plus_sdk_panel_daily_gift_progress_corner_radius, this);
        float q = bb1.q(nvg0.plus_sdk_panel_daily_gift_progress_score_margin_start, this);
        this.scoreMarginStart = q;
        this.shapeDrawable = new ShapeDrawable();
        setTextSize(14.0f);
        setTypeface(wuj0.b(eob1.b(context.getTheme(), rng0.plus_sdk_fontFamily_medium).resourceId, context));
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        setTextAlignment(5);
        setPadding((int) q, getPaddingTop(), (int) q, getPaddingBottom());
        this.animator = new cht();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initProperties(final ght content) {
        CharSequence charSequence = content.b;
        float f = content.f;
        setText(charSequence);
        cht chtVar = this.animator;
        ValueAnimator valueAnimator = chtVar.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        chtVar.a = null;
        ValueAnimator valueAnimator2 = chtVar.b;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        chtVar.b = null;
        chtVar.c = false;
        if (!this.withAnimation) {
            updateBackground(content, f);
            updateTextPaintShader(content, f);
            return;
        }
        updateBackground(content, 0.0f);
        final cht chtVar2 = this.animator;
        sxo sxoVar = new sxo(22, this, content);
        final sss sssVar = new sss(14);
        final iws iwsVar = new iws(5);
        chtVar2.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new yso(4, sxoVar));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.GiftProgressAnimator$initialize$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i;
                sls.this.invoke();
                final cht chtVar3 = chtVar2;
                fht fhtVar = content.c;
                tls tlsVar = iwsVar;
                chtVar3.getClass();
                if (fhtVar instanceof dht) {
                    i = ((dht) fhtVar).a.getAlpha();
                } else {
                    if (!(fhtVar instanceof eht)) {
                        w511.b();
                        return;
                    }
                    i = (((eht) fhtVar).a >> 24) & 255;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
                ofInt.setDuration(500L);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new nj2(4, tlsVar));
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.GiftProgressAnimator$createAndStartTextAlphaAnimator$lambda$5$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        cht.this.c = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                    }
                });
                ofInt.start();
                chtVar3.b = ofInt;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        chtVar2.a = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initProperties$lambda$1(GiftProgressView giftProgressView, ght ghtVar, float f) {
        giftProgressView.updateBackground(ghtVar, f);
        giftProgressView.updateTextPaintShader(ghtVar, f);
        giftProgressView.invalidate();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initProperties$lambda$3(int i) {
        return zy11.a;
    }

    private final void updateBackground(ght content, float progressPercent) {
        float[] fArr;
        fht fhtVar = content.e;
        eht ehtVar = fhtVar instanceof eht ? (eht) fhtVar : null;
        Integer valueOf = ehtVar != null ? Integer.valueOf(ehtVar.a) : null;
        fht fhtVar2 = content.a;
        eht ehtVar2 = fhtVar2 instanceof eht ? (eht) fhtVar2 : null;
        Integer valueOf2 = ehtVar2 != null ? Integer.valueOf(ehtVar2.a) : null;
        if (bb1.y(this)) {
            progressPercent = 1.0f - progressPercent;
        }
        int[] I0 = a.I0(j73.A(new Integer[]{valueOf, valueOf, valueOf2}));
        float[] fArr2 = {0.0f, progressPercent, progressPercent};
        Paint paint = this.shapeDrawable.getPaint();
        float width = getWidth();
        if (bb1.y(this)) {
            I0 = j73.V(I0);
        }
        int[] iArr = I0;
        if (bb1.y(this)) {
            float[] fArr3 = new float[3];
            int i = 0;
            while (true) {
                fArr3[2 - i] = fArr2[i];
                if (i == 2) {
                    break;
                } else {
                    i++;
                }
            }
            fArr = fArr3;
        } else {
            fArr = fArr2;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        ShapeDrawable shapeDrawable = this.shapeDrawable;
        float[] fArr4 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr4[i2] = this.cornerRadius;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr4, null, null));
        setBackground(this.shapeDrawable);
    }

    private final void updateTextPaintShader(ght content, float progressPercent) {
        float[] fArr;
        fht fhtVar = content.c;
        eht ehtVar = fhtVar instanceof eht ? (eht) fhtVar : null;
        Integer valueOf = ehtVar != null ? Integer.valueOf(ehtVar.a) : null;
        fht fhtVar2 = content.d;
        eht ehtVar2 = fhtVar2 instanceof eht ? (eht) fhtVar2 : null;
        Integer valueOf2 = ehtVar2 != null ? Integer.valueOf(ehtVar2.a) : null;
        float width = this.scoreMarginStart / getWidth();
        if (bb1.y(this)) {
            progressPercent = 1.0f - progressPercent;
        }
        float f = progressPercent - width;
        int[] I0 = a.I0(j73.A(new Integer[]{valueOf, valueOf, valueOf2}));
        int i = 0;
        float[] fArr2 = {0.0f, f, f};
        TextPaint paint = getPaint();
        float width2 = getWidth();
        if (bb1.y(this)) {
            I0 = j73.V(I0);
        }
        int[] iArr = I0;
        if (bb1.y(this)) {
            float[] fArr3 = new float[3];
            while (true) {
                fArr3[2 - i] = fArr2[i];
                if (i == 2) {
                    break;
                } else {
                    i++;
                }
            }
            fArr = fArr3;
        } else {
            fArr = fArr2;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, width2, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        cht chtVar = this.animator;
        ValueAnimator valueAnimator = chtVar.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        chtVar.a = null;
        ValueAnimator valueAnimator2 = chtVar.b;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        chtVar.b = null;
        chtVar.c = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), this.contentHeight);
    }

    public final void setContent(final ght content, final boolean withAnimation, final ard0 shortcutViewAwarenessDetector, final tse scope) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView$setContent$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    GiftProgressView.this.withAnimation = withAnimation;
                    GiftProgressView.this.initProperties(content);
                    if (!withAnimation) {
                        GiftProgressView.this.invalidate();
                        return;
                    }
                    c.c(((com.yandex.plus.home.feature.panel.internalapi.a) shortcutViewAwarenessDetector).f(GiftProgressView.this, true), scope, new GiftProgressView$setContent$1$1(GiftProgressView.this, null));
                }
            });
            return;
        }
        this.withAnimation = withAnimation;
        initProperties(content);
        if (withAnimation) {
            c.c(((com.yandex.plus.home.feature.panel.internalapi.a) shortcutViewAwarenessDetector).f(this, true), scope, new GiftProgressView$setContent$1$1(this, null));
        } else {
            invalidate();
        }
    }

    public GiftProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ GiftProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public GiftProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
