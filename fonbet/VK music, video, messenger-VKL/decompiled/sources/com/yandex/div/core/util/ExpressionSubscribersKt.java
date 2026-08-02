package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.aa;
import com.yandex.div2.b;
import com.yandex.div2.e4;
import com.yandex.div2.f5;
import com.yandex.div2.f8;
import com.yandex.div2.g8;
import com.yandex.div2.hd;
import com.yandex.div2.i2;
import com.yandex.div2.m1;
import com.yandex.div2.m8;
import com.yandex.div2.q4;
import com.yandex.div2.q8;
import com.yandex.div2.q9;
import com.yandex.div2.s6;
import com.yandex.div2.v9;
import com.yandex.div2.va;
import com.yandex.div2.w6;
import com.yandex.div2.x7;
import com.yandex.div2.y3;
import com.yandex.div2.y7;
import com.yandex.div2.y8;
import java.util.Iterator;
import java.util.List;
import xsna.fnn;
import xsna.izs;
import xsna.krn;
import xsna.s3q0;
import xsna.ukn;
import xsna.von;

/* compiled from: ExpressionSubscribers.kt */
/* loaded from: classes7.dex */
public final class ExpressionSubscribersKt {
    public static final void observeAbsoluteEdgeInsets(ExpressionSubscriber expressionSubscriber, b bVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (bVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(bVar.b.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(bVar.d.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(bVar.c.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(bVar.a.observe(expressionResolver, izsVar));
    }

    public static final void observeBackground(ExpressionSubscriber expressionSubscriber, m1 m1Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (m1Var != null) {
            if (m1Var instanceof m1.e) {
                expressionSubscriber.addSubscription(((m1.e) m1Var).b.a.observe(expressionResolver, izsVar));
                return;
            }
            if (m1Var instanceof m1.a) {
                f5 f5Var = ((m1.a) m1Var).b;
                expressionSubscriber.addSubscription(f5Var.a.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(f5Var.e.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(f5Var.b.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(f5Var.c.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(f5Var.f.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(f5Var.g.observe(expressionResolver, izsVar));
                List<e4> list = f5Var.d;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (e4) it.next(), expressionResolver, izsVar);
                    }
                    return;
                }
                return;
            }
            if (m1Var instanceof m1.b) {
                s6 s6Var = ((m1.b) m1Var).b;
                expressionSubscriber.addSubscription(s6Var.a.observe(expressionResolver, izsVar));
                ExpressionList<Integer> expressionList = s6Var.c;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, izsVar) : null);
                List<s6.a> list2 = s6Var.b;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (s6.a) it2.next(), expressionResolver, izsVar);
                    }
                    return;
                }
                return;
            }
            if (!(m1Var instanceof m1.d)) {
                if (m1Var instanceof m1.c) {
                    fnn fnnVar = ((m1.c) m1Var).b;
                    expressionSubscriber.addSubscription(fnnVar.a.observe(expressionResolver, izsVar));
                    observeAbsoluteEdgeInsets(expressionSubscriber, fnnVar.b, expressionResolver, izsVar);
                    return;
                }
                return;
            }
            f8 f8Var = ((m1.d) m1Var).b;
            ExpressionList<Integer> expressionList2 = f8Var.d;
            expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, izsVar) : null);
            observeRadialGradientCenter(expressionSubscriber, f8Var.a, expressionResolver, izsVar);
            observeRadialGradientCenter(expressionSubscriber, f8Var.b, expressionResolver, izsVar);
            observeRadialGradientRadius(expressionSubscriber, f8Var.e, expressionResolver, izsVar);
        }
    }

    public static final void observeCircleShape(ExpressionSubscriber expressionSubscriber, i2 i2Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (i2Var == null) {
            return;
        }
        Expression<Integer> expression = i2Var.a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        observeFixedSize(expressionSubscriber, i2Var.b, expressionResolver, izsVar);
        observeStroke(expressionSubscriber, i2Var.c, expressionResolver, izsVar);
    }

    public static final void observeColorPoint(ExpressionSubscriber expressionSubscriber, s6.a aVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (aVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(aVar.a.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(aVar.b.observe(expressionResolver, izsVar));
    }

    public static final void observeDrawable(ExpressionSubscriber expressionSubscriber, ukn uknVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (uknVar == null || !(uknVar instanceof ukn.a)) {
            return;
        }
        von vonVar = ((ukn.a) uknVar).b;
        expressionSubscriber.addSubscription(vonVar.a.observe(expressionResolver, izsVar));
        observeShape(expressionSubscriber, vonVar.b, expressionResolver, izsVar);
        observeStroke(expressionSubscriber, vonVar.c, expressionResolver, izsVar);
    }

    public static final void observeEdgeInsets(ExpressionSubscriber expressionSubscriber, y3 y3Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (y3Var == null) {
            return;
        }
        Expression<Long> expression = y3Var.b;
        expressionSubscriber.addSubscription(y3Var.f.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var.a.observe(expressionResolver, izsVar));
        Expression<Long> expression2 = y3Var.e;
        if (expression2 == null && expression == null) {
            expressionSubscriber.addSubscription(y3Var.c.observe(expressionResolver, izsVar));
            expressionSubscriber.addSubscription(y3Var.d.observe(expressionResolver, izsVar));
        } else {
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, izsVar) : null);
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        }
    }

    public static final void observeFilter(ExpressionSubscriber expressionSubscriber, e4 e4Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (e4Var == null || (e4Var instanceof e4.b) || !(e4Var instanceof e4.a)) {
            return;
        }
        expressionSubscriber.addSubscription(((e4.a) e4Var).b.a.observe(expressionResolver, izsVar));
    }

    public static final void observeFixedSize(ExpressionSubscriber expressionSubscriber, q4 q4Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (q4Var == null) {
            return;
        }
        expressionSubscriber.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
    }

    public static final void observePivot(ExpressionSubscriber expressionSubscriber, x7 x7Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (x7Var != null) {
            if (!(x7Var instanceof x7.a)) {
                if (x7Var instanceof x7.b) {
                    expressionSubscriber.addSubscription(((x7.b) x7Var).b.a.observe(expressionResolver, izsVar));
                }
            } else {
                y7 y7Var = ((x7.a) x7Var).b;
                Expression<Long> expression = y7Var.b;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
                expressionSubscriber.addSubscription(y7Var.a.observe(expressionResolver, izsVar));
            }
        }
    }

    public static final void observeRadialGradientCenter(ExpressionSubscriber expressionSubscriber, g8 g8Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (g8Var != null) {
            if (g8Var instanceof g8.a) {
                m8 m8Var = ((g8.a) g8Var).b;
                expressionSubscriber.addSubscription(m8Var.a.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(m8Var.b.observe(expressionResolver, izsVar));
            } else if (g8Var instanceof g8.b) {
                expressionSubscriber.addSubscription(((g8.b) g8Var).b.a.observe(expressionResolver, izsVar));
            }
        }
    }

    public static final void observeRadialGradientRadius(ExpressionSubscriber expressionSubscriber, q8 q8Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (q8Var != null) {
            if (q8Var instanceof q8.a) {
                q4 q4Var = ((q8.a) q8Var).b;
                expressionSubscriber.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
            } else if (q8Var instanceof q8.b) {
                expressionSubscriber.addSubscription(((q8.b) q8Var).b.a.observe(expressionResolver, izsVar));
            }
        }
    }

    public static final void observeRoundedRectangleShape(ExpressionSubscriber expressionSubscriber, y8 y8Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (y8Var == null) {
            return;
        }
        Expression<Integer> expression = y8Var.a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        observeFixedSize(expressionSubscriber, y8Var.b, expressionResolver, izsVar);
        observeFixedSize(expressionSubscriber, y8Var.d, expressionResolver, izsVar);
        observeFixedSize(expressionSubscriber, y8Var.c, expressionResolver, izsVar);
        observeStroke(expressionSubscriber, y8Var.e, expressionResolver, izsVar);
    }

    public static final void observeShape(ExpressionSubscriber expressionSubscriber, q9 q9Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (q9Var != null) {
            if (q9Var instanceof q9.b) {
                observeRoundedRectangleShape(expressionSubscriber, ((q9.b) q9Var).b, expressionResolver, izsVar);
            } else if (q9Var instanceof q9.a) {
                observeCircleShape(expressionSubscriber, ((q9.a) q9Var).b, expressionResolver, izsVar);
            }
        }
    }

    public static final void observeSize(ExpressionSubscriber expressionSubscriber, v9 v9Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        Expression<DivSizeUnit> expression;
        Expression<Long> expression2;
        Expression<DivSizeUnit> expression3;
        Expression<Long> expression4;
        Expression<DivSizeUnit> expression5;
        Expression<Long> expression6;
        Expression<DivSizeUnit> expression7;
        Expression<Long> expression8;
        if (v9Var != null) {
            if (v9Var instanceof v9.a) {
                q4 q4Var = ((v9.a) v9Var).b;
                expressionSubscriber.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
                return;
            }
            Disposable disposable = null;
            if (v9Var instanceof v9.b) {
                w6 w6Var = ((v9.b) v9Var).b;
                Expression<Double> expression9 = w6Var.c;
                aa aaVar = w6Var.a;
                aa aaVar2 = w6Var.b;
                expressionSubscriber.addSubscription(expression9 != null ? expression9.observe(expressionResolver, izsVar) : null);
                expressionSubscriber.addSubscription((aaVar2 == null || (expression8 = aaVar2.b) == null) ? null : expression8.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription((aaVar2 == null || (expression7 = aaVar2.a) == null) ? null : expression7.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription((aaVar == null || (expression6 = aaVar.b) == null) ? null : expression6.observe(expressionResolver, izsVar));
                if (aaVar != null && (expression5 = aaVar.a) != null) {
                    disposable = expression5.observe(expressionResolver, izsVar);
                }
                expressionSubscriber.addSubscription(disposable);
                return;
            }
            if (v9Var instanceof v9.c) {
                krn krnVar = ((v9.c) v9Var).b;
                Expression<Boolean> expression10 = krnVar.a;
                aa aaVar3 = krnVar.b;
                aa aaVar4 = krnVar.c;
                expressionSubscriber.addSubscription(expression10 != null ? expression10.observe(expressionResolver, izsVar) : null);
                expressionSubscriber.addSubscription((aaVar4 == null || (expression4 = aaVar4.b) == null) ? null : expression4.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription((aaVar4 == null || (expression3 = aaVar4.a) == null) ? null : expression3.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription((aaVar3 == null || (expression2 = aaVar3.b) == null) ? null : expression2.observe(expressionResolver, izsVar));
                if (aaVar3 != null && (expression = aaVar3.a) != null) {
                    disposable = expression.observe(expressionResolver, izsVar);
                }
                expressionSubscriber.addSubscription(disposable);
            }
        }
    }

    public static final void observeStroke(ExpressionSubscriber expressionSubscriber, va vaVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (vaVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(vaVar.a.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(vaVar.d.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(vaVar.c.observe(expressionResolver, izsVar));
    }

    public static final void observeTransform(ExpressionSubscriber expressionSubscriber, hd hdVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        if (hdVar == null) {
            return;
        }
        Expression<Double> expression = hdVar.c;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        observePivot(expressionSubscriber, hdVar.a, expressionResolver, izsVar);
        observePivot(expressionSubscriber, hdVar.b, expressionResolver, izsVar);
    }
}
