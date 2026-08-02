package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.interests.AvatarWithStepProgress;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.wka;

/* compiled from: CategoryItemAnimator.kt */
/* loaded from: classes16.dex */
public final class bla extends AnimatorListenerAdapter {
    public final /* synthetic */ hla b;
    public final /* synthetic */ wka c;
    public final /* synthetic */ wka.d d;

    public bla(hla hlaVar, wka wkaVar, wka.d dVar) {
        this.b = hlaVar;
        this.c = wkaVar;
        this.d = dVar;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [T, xsna.dla] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hla hlaVar = this.b;
        final fla flaVar = hlaVar.p;
        flaVar.e = null;
        animator.removeListener(null);
        wka wkaVar = this.c;
        CopyOnWriteArrayList<wka.d> copyOnWriteArrayList = wkaVar.x;
        wka.a aVar = wkaVar.z;
        wka.d dVar = this.d;
        if (dVar != null && (aVar instanceof wka.a.C3938a)) {
            FrameLayout frameLayout = (FrameLayout) wkaVar.j.invoke();
            PointF pointF = (PointF) wkaVar.i.invoke();
            long j = dVar.c;
            int i = ((wka.a.C3938a) aVar).a;
            flaVar.getClass();
            View view = flaVar.a;
            VkText vkText = new VkText(view.getContext(), null, 6, 0);
            vkText.setBackground(view.getContext().getDrawable(R.drawable.bg_interest_item_active));
            VkText vkText2 = flaVar.b;
            int width = vkText2.getWidth();
            int height = vkText2.getHeight();
            vkText.setLayoutParams(new FrameLayout.LayoutParams(vkText2.getWidth(), vkText2.getHeight()));
            vkText.setText(vkText2.getText());
            vkText.setTypeface(vkText2.getTypeface());
            vkText.setTextColor(vkText2.getCurrentTextColor());
            vkText.setTextSize(0, vkText2.getTextSize());
            vkText.setGravity(17);
            int childCount = frameLayout.getChildCount();
            int childCount2 = frameLayout.getChildCount();
            int i2 = 0;
            while (true) {
                int i3 = childCount;
                if (i2 >= childCount2) {
                    break;
                }
                if (frameLayout.getChildAt(i2) instanceof AvatarWithStepProgress) {
                    childCount = i2 - 1;
                    if (childCount < 0) {
                        childCount = 0;
                    }
                } else {
                    i2++;
                    childCount = i3;
                }
            }
            frameLayout.addView(vkText, childCount);
            int[] iArr = new int[2];
            frameLayout.getLocationInWindow(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            vkText2.getLocationInWindow(new int[2]);
            float f = r14[0] - i4;
            float f2 = r14[1] - i5;
            float f3 = pointF.x - (width / 2);
            float f4 = pointF.y - (height / 2);
            Path path = new Path();
            path.setLastPoint(f, f2);
            path.quadTo(f3, f2, f3, f4);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.dla
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (valueAnimator.getAnimatedFraction() > 0.7f) {
                        valueAnimator.removeUpdateListener((ValueAnimator.AnimatorUpdateListener) Ref$ObjectRef.this.element);
                        sge sgeVar = flaVar.d;
                        if (sgeVar != null) {
                            sgeVar.a.f.c();
                        }
                    }
                }
            };
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.X, (Property<VkText, Float>) View.Y, path);
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener((ValueAnimator.AnimatorUpdateListener) ref$ObjectRef.element);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.SCALE_X, 1.0f, 0.3f);
            ofFloat2.setDuration(j);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.SCALE_Y, 1.0f, 0.3f);
            ofFloat3.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new sur(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, 1.0f));
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.addListener(new ela(flaVar, i, frameLayout, vkText));
            animatorSet.start();
        }
        wkaVar.y.remove(hlaVar);
        copyOnWriteArrayList.remove(dVar);
        if (copyOnWriteArrayList.isEmpty()) {
            wkaVar.z = wka.a.b.a;
        }
        flaVar.b.setAlpha(1.0f);
        View view2 = flaVar.a;
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        flaVar.c.setAlpha(1.0f);
        wkaVar.h.c();
        wkaVar.A(hlaVar);
        wkaVar.v.remove(hlaVar);
        wkaVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.p.e = animator;
        this.c.h.b();
    }
}
