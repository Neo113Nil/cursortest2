package com.ybsdk.feature.qr.payments.internal.screens.presentation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.Text;
import defpackage.is10;
import defpackage.jl40;
import defpackage.js10;
import defpackage.tcc;
import defpackage.xty0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\n\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/MessageAnimatedView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljs10;", ClidProvider.STATE, "Lzy11;", "startAnimation", "(Ljs10;)V", "Lcom/ybsdk/core/utils/text/Text;", "text", "", "duration", "Landroid/animation/Animator;", "changeTextWithFade", "(Lcom/ybsdk/core/utils/text/Text;J)Landroid/animation/Animator;", "newState", "render", "Ljs10;", "Landroid/animation/AnimatorSet;", "animations", "Landroid/animation/AnimatorSet;", "Companion", "is10", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageAnimatedView extends AppCompatTextView {
    private static final is10 Companion = new is10();

    @Deprecated
    public static final long DEFAULT_FADE_DURATION_MS = 200;

    @Deprecated
    public static final long PROCESSING_FADE_DURATION_MS = 1250;
    private AnimatorSet animations;
    private js10 state;

    public /* synthetic */ MessageAnimatedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Animator changeTextWithFade(final Text text, long duration) {
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<MessageAnimatedView, Float>) property, 0.0f);
        ofFloat.setDuration(duration);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.payments.internal.screens.presentation.view.MessageAnimatedView$changeTextWithFade$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MessageAnimatedView.this.setVisibility(4);
                xty0.d(MessageAnimatedView.this, text);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<MessageAnimatedView, Float>) property, 1.0f);
        ofFloat2.setDuration(duration);
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.payments.internal.screens.presentation.view.MessageAnimatedView$changeTextWithFade$lambda$7$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MessageAnimatedView.this.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (text instanceof Text.Empty) {
            animatorSet.play(ofFloat);
            return animatorSet;
        }
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    private final void startAnimation(js10 state) {
        if (state.a.isEmpty()) {
            changeTextWithFade(Text.Empty.INSTANCE, 200L);
            return;
        }
        long j = state.b ? 1250L : 200L;
        List list = state.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(changeTextWithFade((Text) it.next(), j));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.payments.internal.screens.presentation.view.MessageAnimatedView$startAnimation$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MessageAnimatedView.this.animations = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.start();
        this.animations = animatorSet;
    }

    public final void render(js10 newState) {
        if (jl40.l(this.state, newState)) {
            return;
        }
        AnimatorSet animatorSet = this.animations;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.state = newState;
        startAnimation(newState);
    }

    public MessageAnimatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MessageAnimatedView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MessageAnimatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.state = new js10(EmptyList.a, false);
    }
}
