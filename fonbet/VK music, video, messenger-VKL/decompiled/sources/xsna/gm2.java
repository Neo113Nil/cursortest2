package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.ArrayMap;
import android.util.LruCache;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import java.util.ArrayList;

/* compiled from: AnimatedVectorDrawableParser.kt */
/* loaded from: classes6.dex */
public final class gm2 {
    public static final fy2 c = new fy2();
    public final Context a;
    public final Resources b;

    /* compiled from: AnimatedVectorDrawableParser.kt */
    public static final class a {
        public final EnhancedVectorDrawable a;
        public final ArrayList<Animator> b;
        public final ArrayMap<Animator, String> c;

        public a(EnhancedVectorDrawable enhancedVectorDrawable, ArrayList<Animator> arrayList, ArrayMap<Animator, String> arrayMap) {
            this.a = enhancedVectorDrawable;
            this.b = arrayList;
            this.c = arrayMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ParsedResource(drawable=" + this.a + ", animators=" + this.b + ", targetNameMap=" + this.c + ')';
        }
    }

    public gm2(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public static boolean c(Animator animator) {
        AnimatorSet animatorSet = animator instanceof AnimatorSet ? (AnimatorSet) animator : null;
        if (animatorSet == null) {
            ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
            return epx.f(objectAnimator != null ? objectAnimator.getPropertyName() : null, "pathData");
        }
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        if (childAnimations.isEmpty()) {
            return false;
        }
        for (Animator animator2 : childAnimations) {
            ObjectAnimator objectAnimator2 = animator2 instanceof ObjectAnimator ? (ObjectAnimator) animator2 : null;
            if (epx.f(objectAnimator2 != null ? objectAnimator2.getPropertyName() : null, "pathData")) {
                return true;
            }
        }
        return false;
    }

    public final Animator a(int i) {
        com.vk.utils.vectordrawable.internal.animatorparser.a aVar = new com.vk.utils.vectordrawable.internal.animatorparser.a(this.a);
        fy2 fy2Var = com.vk.utils.vectordrawable.internal.animatorparser.a.c;
        Animator animator = (Animator) ((LruCache) fy2Var.b).get(Integer.valueOf(i));
        if (animator != null) {
            return animator.clone();
        }
        Animator a2 = aVar.a(aVar.b.getAnimation(i), null, 0);
        if (a2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((LruCache) fy2Var.b).put(Integer.valueOf(i), a2.clone());
        return a2;
    }

    public final EnhancedVectorDrawable b(XmlResourceParser xmlResourceParser) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            }
            if (epx.f(xmlResourceParser.getAttributeName(i), "drawable")) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    return new EnhancedVectorDrawable(this.b, attributeResourceValue);
                }
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }
}
