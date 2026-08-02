package xsna;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import java.util.List;

/* compiled from: DivAnimatorBase.kt */
/* loaded from: classes8.dex */
public interface hkn {
    Expression<DivAnimationDirection> b();

    List<DivAction> c();

    com.yandex.div2.b3 d();

    Expression<DivAnimationInterpolator> e();

    List<DivAction> f();

    Expression<Long> g();

    Expression<Long> getDuration();

    String getId();
}
