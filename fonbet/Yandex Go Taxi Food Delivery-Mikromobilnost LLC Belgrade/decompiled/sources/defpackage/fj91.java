package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.platform.m;
import com.yandex.div.core.animation.ReverseInterpolator;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import defpackage.v2w;
import defpackage.v3k;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class fj91 {
    public static void a(ObjectAnimator objectAnimator, final Div2View div2View, aek aekVar, y3k y3kVar, final rvo rvoVar) {
        DivAnimationDirection divAnimationDirection;
        DivAnimationInterpolator divAnimationInterpolator;
        int i;
        Expression expression = y3kVar.b;
        if (expression == null || (divAnimationDirection = (DivAnimationDirection) expression.a(rvoVar)) == null) {
            divAnimationDirection = (DivAnimationDirection) aekVar.getDirection().a(rvoVar);
        }
        Expression expression2 = y3kVar.c;
        if (expression2 == null) {
            expression2 = aekVar.getDuration();
        }
        objectAnimator.setDuration(((Number) expression2.a(rvoVar)).longValue());
        Expression expression3 = y3kVar.g;
        if (expression3 == null) {
            expression3 = aekVar.e();
        }
        objectAnimator.setStartDelay(((Number) expression3.a(rvoVar)).longValue());
        Expression expression4 = y3kVar.e;
        if (expression4 == null || (divAnimationInterpolator = (DivAnimationInterpolator) expression4.a(rvoVar)) == null) {
            divAnimationInterpolator = (DivAnimationInterpolator) aekVar.c().a(rvoVar);
        }
        int[] iArr = tml.b;
        int i2 = iArr[divAnimationDirection.ordinal()];
        int i3 = 2;
        objectAnimator.setInterpolator((i2 == 1 || i2 == 2) ? new ReverseInterpolator(uml.e(divAnimationInterpolator)) : uml.e(divAnimationInterpolator));
        pkk pkkVar = y3kVar.f;
        if (pkkVar == null) {
            pkkVar = aekVar.a();
        }
        if (pkkVar instanceof nkk) {
            i = ((int) ((Number) ((nkk) pkkVar).b.a.a(rvoVar)).longValue()) - 1;
            if (i < 0) {
                i = 0;
            }
        } else {
            if (!(pkkVar instanceof okk)) {
                w511.b();
                return;
            }
            i = -1;
        }
        objectAnimator.setRepeatCount(i);
        int i4 = iArr[divAnimationDirection.ordinal()];
        if (i4 != 2 && i4 != 3) {
            i3 = 1;
        }
        objectAnimator.setRepeatMode(i3);
        final List d = aekVar.d();
        if (d != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((v3k) it.next(), "animation_end", rvoVar);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        final List b = aekVar.b();
        if (b != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((v3k) it.next(), "animation_cancel", rvoVar);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    public static final Point b(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return new Point(bounds.width(), bounds.height());
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static final f530 c(f530 f530Var, final IntrinsicSize intrinsicSize) {
        return f530Var.k(new wuw(intrinsicSize, m.b ? new tls() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("intrinsicSize", IntrinsicSize.this);
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 d(f530 f530Var, final IntrinsicSize intrinsicSize) {
        return f530Var.k(new avw(intrinsicSize, m.b ? new tls() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("intrinsicSize", IntrinsicSize.this);
                return zy11.a;
            }
        } : m.a()));
    }
}
