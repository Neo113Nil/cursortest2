package xsna;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesDecorationConfigBorderDto;
import com.vk.api.generated.stories.dto.StoriesDecorationConfigDto;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.random.Random;

/* compiled from: View.kt */
/* loaded from: classes6.dex */
public final class htl0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ jtl0 b;

    public htl0(jtl0 jtl0Var) {
        this.b = jtl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int c;
        StoriesDecorationConfigBorderDto d;
        List<String> e;
        String str;
        view.removeOnLayoutChangeListener(this);
        jtl0 jtl0Var = this.b;
        opl0 opl0Var = jtl0Var.n;
        int absoluteAdapterPosition = jtl0Var.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition >= 0) {
            if (opl0Var.W()) {
                absoluteAdapterPosition = absoluteAdapterPosition != 0 ? absoluteAdapterPosition - 1 : 0;
            }
            view.getContext();
            boolean d2 = ((uvl0) jtl0Var.w.getValue()).d((StoriesContainer) jtl0Var.m);
            List<StoriesContainer> y0 = opl0Var.y0();
            ?? r5 = opl0Var.q;
            StoriesContainer storiesContainer = (StoriesContainer) j5g.b0(absoluteAdapterPosition, y0);
            if (storiesContainer == null) {
                c = dhr0.t.c(R.attr.colorAccent);
            } else {
                StoriesDecorationConfigDto storiesDecorationConfigDto = storiesContainer.c;
                if (storiesDecorationConfigDto != null && (d = storiesDecorationConfigDto.d()) != null && (e = d.e()) != null && (str = (String) j5g.a0(e)) != null) {
                    c = Color.parseColor("#".concat(str));
                } else if (d2 || fsk.A(storiesContainer) || (storiesContainer instanceof LiveFinishedStoriesContainer)) {
                    c = dhr0.t.c(R.attr.vk_ui_accent_red);
                } else if (storiesContainer instanceof DiscoverStoriesContainer) {
                    ((xp5) r5.getValue()).getClass();
                    c = dhr0.t.c(R.attr.vk_ui_accent_purple);
                } else if (fsk.B(storiesContainer)) {
                    ((xp5) r5.getValue()).getClass();
                    c = 0;
                } else if (storiesContainer.Db()) {
                    ((xp5) r5.getValue()).getClass();
                    c = dhr0.t.c(R.attr.vk_ui_stroke_accent);
                } else {
                    ((xp5) r5.getValue()).getClass();
                    c = dhr0.t.c(R.attr.vk_ui_stroke_accent);
                }
            }
            if (opl0Var.E(absoluteAdapterPosition)) {
                view.setBackgroundColor(view.getContext().getColor(android.R.color.transparent));
                return;
            }
            ((j3m0) jtl0Var.y.getValue()).getClass();
            final int[] iArr = {c, c, c};
            int b = cn70.b(72);
            float f = 2;
            float b2 = cn70.b(50);
            final float width = (view.getWidth() / f) - b2;
            final float height = (view.getHeight() / f) - b2;
            float f2 = b;
            final ShapeDrawable shapeDrawable = new ShapeDrawable();
            Paint paint = shapeDrawable.getPaint();
            paint.setShadowLayer(b2 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216);
            paint.setShader(new SweepGradient(width, height, iArr, (float[]) null));
            float[] fArr = new float[8];
            for (int i9 = 0; i9 < 8; i9++) {
                fArr[i9] = f2;
            }
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            abg0 abg0Var = dhr0.t;
            int c2 = abg0Var.c(R.attr.vk_legacy_background_content);
            int b3 = cn70.b(44);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(c2);
            gradientDrawable.setCornerRadius(b3);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable});
            layerDrawable.setLayerInset(0, cn70.b(16), cn70.b(36), cn70.b(16), cn70.b(40));
            layerDrawable.setLayerInset(1, cn70.b(11), cn70.b(22), cn70.b(11), cn70.b(35));
            view.setBackground(layerDrawable);
            final int[] iArr2 = {abg0Var.c(R.attr.vk_legacy_accent_alpha10), abg0Var.c(R.attr.vk_legacy_accent_alpha10), abg0Var.c(R.attr.vk_legacy_accent_alpha10)};
            Random.b.getClass();
            long o = Random.c.o(1200L, 1800L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            final Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = System.currentTimeMillis();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.i3m0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Ref$LongRef ref$LongRef2 = Ref$LongRef.this;
                    if (currentTimeMillis - ref$LongRef2.element > 75) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ref$LongRef2.element = System.currentTimeMillis();
                        int[] iArr3 = iArr;
                        int length = iArr3.length;
                        int[] iArr4 = new int[length];
                        int i10 = length - 1;
                        if (i10 >= 0) {
                            int i11 = 0;
                            while (true) {
                                iArr4[i11] = n8g.d(floatValue, iArr3[i11], iArr2[i11]);
                                if (i11 == i10) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        ShapeDrawable shapeDrawable2 = shapeDrawable;
                        shapeDrawable2.getPaint().setShader(new SweepGradient(width, height, iArr4, (float[]) null));
                        shapeDrawable2.invalidateSelf();
                    }
                }
            });
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(o);
            ofFloat.start();
        }
    }
}
