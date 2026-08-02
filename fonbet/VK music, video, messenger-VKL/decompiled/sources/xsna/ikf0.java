package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import java.util.Iterator;
import xsna.r9r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ikf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ikf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((View) this.c).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fkm0 fkm0Var = (fkm0) this.c;
                sk3<Integer> sk3Var = fkm0Var.g;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9r0.a aVar = fkm0Var.o;
                float f = fkm0Var.i;
                StoryAvatarView storyAvatarView = (StoryAvatarView) fkm0Var.e.b;
                uvl0 uvl0Var = fkm0Var.d;
                aVar.a = floatValue;
                Integer num = fkm0Var.h;
                if (num != null ? uvl0Var.n(num.intValue()) : true) {
                    Iterator it = fkm0Var.b.iterator();
                    boolean z = false;
                    while (it.hasNext() && !(z = uvl0Var.g(((Number) it.next()).intValue()))) {
                    }
                    if (z || sk3Var.isEmpty()) {
                        ValueAnimator valueAnimator2 = fkm0Var.m;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        storyAvatarView.C = true;
                    } else {
                        r2 = false;
                    }
                    if (z) {
                        gzs<s3q0> onUploadErrorCallback = storyAvatarView.getOnUploadErrorCallback();
                        if (onUploadErrorCallback != null) {
                            onUploadErrorCallback.invoke();
                        }
                        storyAvatarView.setOnUploadErrorCallback(null);
                        storyAvatarView.F.clear();
                    } else if (r2) {
                        fkm0Var.b(1.0f);
                    } else {
                        fkm0Var.l += f;
                        do {
                            Integer l = sk3Var.l();
                            if (l == null || !uvl0Var.j(l.intValue())) {
                            }
                            fkm0Var.h = l;
                        } while (!sk3Var.isEmpty());
                        fkm0Var.h = l;
                    }
                } else {
                    float f2 = fkm0Var.l;
                    Integer num2 = fkm0Var.h;
                    float h = f2 + (num2 != null ? uvl0Var.h(num2.intValue()) * f : 0.0f);
                    r9r0.a aVar2 = fkm0Var.o;
                    float f3 = aVar2.b;
                    if (f3 < fkm0Var.j) {
                        if (h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f4 = f3 + fkm0Var.k;
                            aVar2.b = f4;
                            fkm0Var.c.j = swe0.f(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                    }
                    if (fkm0Var.n == null && f3 < h) {
                        fkm0Var.b(h);
                    }
                }
                fkm0Var.f.a();
                break;
        }
    }
}
