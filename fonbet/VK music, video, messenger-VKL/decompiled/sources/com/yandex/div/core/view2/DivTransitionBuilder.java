package com.yandex.div.core.view2;

import android.content.Context;
import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.b4;
import com.yandex.div2.b9;
import com.yandex.div2.d2;
import com.yandex.div2.e1;
import com.yandex.div2.s3;
import com.yandex.div2.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dnp0;
import xsna.uki0;
import xsna.vlp0;
import xsna.wra;

/* compiled from: DivTransitionBuilder.kt */
/* loaded from: classes7.dex */
public class DivTransitionBuilder {
    private final Context context;
    private final DivViewIdProvider viewIdProvider;

    /* compiled from: DivTransitionBuilder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSlideTransition.Edge.values().length];
            try {
                iArr[DivSlideTransition.Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSlideTransition.Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSlideTransition.Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivSlideTransition.Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTransitionBuilder(Context context, DivViewIdProvider divViewIdProvider) {
        this.context = context;
        this.viewIdProvider = divViewIdProvider;
    }

    private List<vlp0> buildChangeTransitions(uki0<DivItemBuilderResult> uki0Var, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : uki0Var) {
            String id = divItemBuilderResult.getDiv().b().getId();
            d2 t = divItemBuilderResult.getDiv().b().t();
            if (id != null && t != null) {
                vlp0 androidTransition = toAndroidTransition(t, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<vlp0> buildIncomingTransitions(uki0<DivItemBuilderResult> uki0Var, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : uki0Var) {
            String id = divItemBuilderResult.getDiv().b().getId();
            e1 q = divItemBuilderResult.getDiv().b().q();
            if (id != null && q != null) {
                vlp0 androidTransition = toAndroidTransition(q, 1, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<vlp0> buildOutgoingTransitions(uki0<DivItemBuilderResult> uki0Var, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : uki0Var) {
            String id = divItemBuilderResult.getDiv().b().getId();
            e1 k = divItemBuilderResult.getDiv().b().k();
            if (id != null && k != null) {
                vlp0 androidTransition = toAndroidTransition(k, 2, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    private vlp0 toAndroidTransition(e1 e1Var, int i, ExpressionResolver expressionResolver) {
        if (e1Var instanceof e1.c) {
            dnp0 dnp0Var = new dnp0();
            Iterator<T> it = ((e1.c) e1Var).b.a.iterator();
            while (it.hasNext()) {
                vlp0 androidTransition = toAndroidTransition((e1) it.next(), i, expressionResolver);
                dnp0Var.e(Math.max(dnp0Var.getDuration(), androidTransition.getDuration() + androidTransition.getStartDelay()));
                dnp0Var.c(androidTransition);
            }
            return dnp0Var;
        }
        if (e1Var instanceof e1.a) {
            e1.a aVar = (e1.a) e1Var;
            b4 b4Var = aVar.b;
            b4 b4Var2 = aVar.b;
            Fade fade = new Fade((float) b4Var.a.evaluate(expressionResolver).doubleValue());
            fade.setMode(i);
            fade.setDuration(b4Var2.b.evaluate(expressionResolver).longValue());
            fade.setStartDelay(b4Var2.d.evaluate(expressionResolver).longValue());
            fade.setInterpolator(DivUtilKt.getAndroidInterpolator(b4Var2.c.evaluate(expressionResolver)));
            return fade;
        }
        if (e1Var instanceof e1.b) {
            e1.b bVar = (e1.b) e1Var;
            b9 b9Var = bVar.b;
            b9 b9Var2 = bVar.b;
            Scale scale = new Scale((float) b9Var.e.evaluate(expressionResolver).doubleValue(), (float) b9Var2.c.evaluate(expressionResolver).doubleValue(), (float) b9Var2.d.evaluate(expressionResolver).doubleValue());
            scale.setMode(i);
            scale.setDuration(b9Var2.a.evaluate(expressionResolver).longValue());
            scale.setStartDelay(b9Var2.f.evaluate(expressionResolver).longValue());
            scale.setInterpolator(DivUtilKt.getAndroidInterpolator(b9Var2.b.evaluate(expressionResolver)));
            return scale;
        }
        if (!(e1Var instanceof e1.d)) {
            throw new NoWhenBranchMatchedException();
        }
        e1.d dVar = (e1.d) e1Var;
        DivSlideTransition divSlideTransition = dVar.b;
        DivSlideTransition divSlideTransition2 = dVar.b;
        s3 s3Var = divSlideTransition.a;
        Slide slide = new Slide(s3Var != null ? BaseDivViewExtensionsKt.toPx(s3Var, getDisplayMetrics(), expressionResolver) : -1, toGravity(divSlideTransition2.c.evaluate(expressionResolver)));
        slide.setMode(i);
        slide.setDuration(divSlideTransition2.b.evaluate(expressionResolver).longValue());
        slide.setStartDelay(divSlideTransition2.e.evaluate(expressionResolver).longValue());
        slide.setInterpolator(DivUtilKt.getAndroidInterpolator(divSlideTransition2.d.evaluate(expressionResolver)));
        return slide;
    }

    private int toGravity(DivSlideTransition.Edge edge) {
        int i = WhenMappings.$EnumSwitchMapping$0[edge.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 80;
        }
        throw new NoWhenBranchMatchedException();
    }

    public dnp0 buildTransitions(uki0<DivItemBuilderResult> uki0Var, uki0<DivItemBuilderResult> uki0Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        dnp0 dnp0Var = new dnp0();
        dnp0Var.g(0);
        if (uki0Var != null) {
            TransitionsKt.plusAssign(dnp0Var, buildOutgoingTransitions(uki0Var, expressionResolver));
        }
        if (uki0Var != null && uki0Var2 != null) {
            TransitionsKt.plusAssign(dnp0Var, buildChangeTransitions(uki0Var, expressionResolver));
        }
        if (uki0Var2 != null) {
            TransitionsKt.plusAssign(dnp0Var, buildIncomingTransitions(uki0Var2, expressionResolver2));
        }
        return dnp0Var;
    }

    public vlp0 createAndroidTransition(e1 e1Var, int i, ExpressionResolver expressionResolver) {
        if (e1Var == null) {
            return null;
        }
        return toAndroidTransition(e1Var, i, expressionResolver);
    }

    private vlp0 toAndroidTransition(d2 d2Var, ExpressionResolver expressionResolver) {
        if (d2Var instanceof d2.b) {
            dnp0 dnp0Var = new dnp0();
            Iterator<T> it = ((d2.b) d2Var).b.a.iterator();
            while (it.hasNext()) {
                dnp0Var.c(toAndroidTransition((d2) it.next(), expressionResolver));
            }
            return dnp0Var;
        }
        if (d2Var instanceof d2.a) {
            wra wraVar = new wra();
            d2.a aVar = (d2.a) d2Var;
            x1 x1Var = aVar.b;
            x1 x1Var2 = aVar.b;
            wraVar.setDuration(x1Var.a.evaluate(expressionResolver).longValue());
            wraVar.setStartDelay(x1Var2.c.evaluate(expressionResolver).longValue());
            wraVar.setInterpolator(DivUtilKt.getAndroidInterpolator(x1Var2.b.evaluate(expressionResolver)));
            return wraVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
