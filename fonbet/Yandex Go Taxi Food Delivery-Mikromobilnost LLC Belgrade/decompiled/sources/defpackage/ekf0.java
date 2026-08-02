package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import java.util.HashMap;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public final class ekf0 extends Transition {
    public static void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        ProgressView progressView = view instanceof ProgressView ? (ProgressView) view : null;
        if (progressView == null) {
            return;
        }
        if (progressView.isLaidOut() || progressView.getWidth() > 0 || progressView.getHeight() > 0) {
            progressView.getLocationOnScreen(new int[]{0, 0});
            hashMap.put(RemoteBioParameters.X, Float.valueOf(r2[0]));
            hashMap.put(RemoteBioParameters.Y, Float.valueOf(r2[1]));
            hashMap.put("progress", Integer.valueOf(progressView.getProgress()));
        }
    }

    public static dkf0 Y(TransitionValues transitionValues) {
        HashMap hashMap = transitionValues.a;
        Object obj = hashMap.get(RemoteBioParameters.X);
        Float f = obj instanceof Float ? (Float) obj : null;
        Object obj2 = hashMap.get(RemoteBioParameters.Y);
        Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
        Object obj3 = hashMap.get("progress");
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (f == null || f2 == null || num == null) {
            return null;
        }
        return new dkf0(num.intValue(), new PointF(f.floatValue(), f2.floatValue()));
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        dkf0 Y = Y(transitionValues);
        dkf0 Y2 = Y(transitionValues2);
        if (Y == null || Y2 == null) {
            return null;
        }
        View view = transitionValues2.b;
        ProgressView progressView = view instanceof ProgressView ? (ProgressView) view : null;
        if (progressView != null) {
            progressView.setProgress(Y.b);
        }
        View view2 = transitionValues2.b;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        Path path = new Path();
        PointF pointF = Y.a;
        float f = pointF.x;
        PointF pointF2 = Y2.a;
        path.moveTo(f - pointF2.x, pointF.y - pointF2.y);
        path.lineTo(0.0f, 0.0f);
        return ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, (Property<View, Float>) property2, path);
    }
}
