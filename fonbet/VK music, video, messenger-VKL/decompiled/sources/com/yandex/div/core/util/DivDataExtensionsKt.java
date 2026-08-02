package com.yandex.div.core.util;

import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivInput;
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
import com.yandex.div2.n9;
import com.yandex.div2.q4;
import com.yandex.div2.q8;
import com.yandex.div2.q9;
import com.yandex.div2.s3;
import com.yandex.div2.s6;
import com.yandex.div2.u1;
import com.yandex.div2.v9;
import com.yandex.div2.va;
import com.yandex.div2.w6;
import com.yandex.div2.x7;
import com.yandex.div2.y2;
import com.yandex.div2.y3;
import com.yandex.div2.y7;
import com.yandex.div2.y8;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e43;
import xsna.fnn;
import xsna.j5g;
import xsna.jon;
import xsna.jw5;
import xsna.krn;
import xsna.ukn;
import xsna.von;

/* compiled from: DivDataExtensions.kt */
/* loaded from: classes7.dex */
public final class DivDataExtensionsKt {
    public static final boolean equalsToConstant(v9 v9Var, v9 v9Var2) {
        if (v9Var == null) {
            return v9Var2 == null;
        }
        if (v9Var instanceof v9.a) {
            if (v9Var2 instanceof v9.a) {
                q4 q4Var = ((v9.a) v9Var).b;
                v9.a aVar = (v9.a) v9Var2;
                if (ExpressionsKt.equalsToConstant(q4Var.b, aVar.b.b) && ExpressionsKt.equalsToConstant(q4Var.a, aVar.b.a)) {
                    return true;
                }
            }
            return false;
        }
        if (v9Var instanceof v9.b) {
            if (v9Var2 instanceof v9.b) {
                w6 w6Var = ((v9.b) v9Var).b;
                v9.b bVar = (v9.b) v9Var2;
                if (ExpressionsKt.equalsToConstant(w6Var.c, bVar.b.c)) {
                    aa aaVar = w6Var.b;
                    Expression<Long> expression = aaVar != null ? aaVar.b : null;
                    aa aaVar2 = bVar.b.b;
                    if (ExpressionsKt.equalsToConstant(expression, aaVar2 != null ? aaVar2.b : null)) {
                        aa aaVar3 = w6Var.b;
                        Expression<DivSizeUnit> expression2 = aaVar3 != null ? aaVar3.a : null;
                        aa aaVar4 = bVar.b.b;
                        if (ExpressionsKt.equalsToConstant(expression2, aaVar4 != null ? aaVar4.a : null)) {
                            aa aaVar5 = w6Var.a;
                            Expression<Long> expression3 = aaVar5 != null ? aaVar5.b : null;
                            aa aaVar6 = bVar.b.a;
                            if (ExpressionsKt.equalsToConstant(expression3, aaVar6 != null ? aaVar6.b : null)) {
                                aa aaVar7 = w6Var.a;
                                Expression<DivSizeUnit> expression4 = aaVar7 != null ? aaVar7.a : null;
                                aa aaVar8 = bVar.b.a;
                                if (ExpressionsKt.equalsToConstant(expression4, aaVar8 != null ? aaVar8.a : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (!(v9Var instanceof v9.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (v9Var2 instanceof v9.c) {
            krn krnVar = ((v9.c) v9Var).b;
            v9.c cVar = (v9.c) v9Var2;
            if (ExpressionsKt.equalsToConstant(krnVar.a, cVar.b.a)) {
                aa aaVar9 = krnVar.c;
                Expression<Long> expression5 = aaVar9 != null ? aaVar9.b : null;
                aa aaVar10 = cVar.b.c;
                if (ExpressionsKt.equalsToConstant(expression5, aaVar10 != null ? aaVar10.b : null)) {
                    aa aaVar11 = krnVar.c;
                    Expression<DivSizeUnit> expression6 = aaVar11 != null ? aaVar11.a : null;
                    aa aaVar12 = cVar.b.c;
                    if (ExpressionsKt.equalsToConstant(expression6, aaVar12 != null ? aaVar12.a : null)) {
                        aa aaVar13 = krnVar.b;
                        Expression<Long> expression7 = aaVar13 != null ? aaVar13.b : null;
                        aa aaVar14 = cVar.b.b;
                        if (ExpressionsKt.equalsToConstant(expression7, aaVar14 != null ? aaVar14.b : null)) {
                            aa aaVar15 = krnVar.b;
                            Expression<DivSizeUnit> expression8 = aaVar15 != null ? aaVar15.a : null;
                            aa aaVar16 = cVar.b.b;
                            if (ExpressionsKt.equalsToConstant(expression8, aaVar16 != null ? aaVar16.a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(v9 v9Var) {
        if (v9Var == null) {
            return true;
        }
        if (v9Var instanceof v9.a) {
            q4 q4Var = ((v9.a) v9Var).b;
            return ExpressionsKt.isConstant(q4Var.b) && ExpressionsKt.isConstant(q4Var.a);
        }
        if (v9Var instanceof v9.b) {
            w6 w6Var = ((v9.b) v9Var).b;
            if (ExpressionsKt.isConstantOrNull(w6Var.c)) {
                aa aaVar = w6Var.b;
                if (ExpressionsKt.isConstantOrNull(aaVar != null ? aaVar.b : null)) {
                    aa aaVar2 = w6Var.b;
                    if (ExpressionsKt.isConstantOrNull(aaVar2 != null ? aaVar2.a : null)) {
                        aa aaVar3 = w6Var.a;
                        if (ExpressionsKt.isConstantOrNull(aaVar3 != null ? aaVar3.b : null)) {
                            aa aaVar4 = w6Var.a;
                            if (ExpressionsKt.isConstantOrNull(aaVar4 != null ? aaVar4.a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (!(v9Var instanceof v9.c)) {
            throw new NoWhenBranchMatchedException();
        }
        krn krnVar = ((v9.c) v9Var).b;
        if (ExpressionsKt.isConstantOrNull(krnVar.a)) {
            aa aaVar5 = krnVar.c;
            if (ExpressionsKt.isConstantOrNull(aaVar5 != null ? aaVar5.b : null)) {
                aa aaVar6 = krnVar.c;
                if (ExpressionsKt.isConstantOrNull(aaVar6 != null ? aaVar6.a : null)) {
                    aa aaVar7 = krnVar.b;
                    if (ExpressionsKt.isConstantOrNull(aaVar7 != null ? aaVar7.b : null)) {
                        aa aaVar8 = krnVar.b;
                        if (ExpressionsKt.isConstantOrNull(aaVar8 != null ? aaVar8.a : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Colormap toColormap(s6 s6Var, final ExpressionResolver expressionResolver) {
        List<s6.a> list = s6Var.b;
        List D0 = list != null ? j5g.D0(new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(((s6.a) t).b.evaluate(ExpressionResolver.this), ((s6.a) t2).b.evaluate(ExpressionResolver.this));
            }
        }, list) : null;
        ExpressionList<Integer> expressionList = s6Var.c;
        if (D0 == null) {
            return expressionList != null ? new Colormap(j5g.N0(expressionList.evaluate(expressionResolver)), null, 2, null) : Colormap.EMPTY;
        }
        int[] iArr = new int[D0.size()];
        float[] fArr = new float[D0.size()];
        int size = D0.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((s6.a) D0.get(i)).a.evaluate(expressionResolver).intValue();
            fArr[i] = (float) ((s6.a) D0.get(i)).b.evaluate(expressionResolver).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }

    public static final boolean isConstant(q4 q4Var) {
        if (q4Var == null) {
            return true;
        }
        return ExpressionsKt.isConstant(q4Var.b) && ExpressionsKt.isConstant(q4Var.a);
    }

    public static final boolean isConstant(y3 y3Var) {
        if (y3Var == null) {
            return true;
        }
        return ExpressionsKt.isConstant(y3Var.c) && ExpressionsKt.isConstant(y3Var.f) && ExpressionsKt.isConstant(y3Var.d) && ExpressionsKt.isConstant(y3Var.a) && ExpressionsKt.isConstantOrNull(y3Var.e) && ExpressionsKt.isConstantOrNull(y3Var.b);
    }

    public static final boolean isConstant(b bVar) {
        if (bVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(bVar.b) && ExpressionsKt.isConstant(bVar.d) && ExpressionsKt.isConstant(bVar.c) && ExpressionsKt.isConstant(bVar.a);
    }

    public static final boolean isConstant(hd hdVar) {
        if (hdVar == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(hdVar.c) && isConstant(hdVar.a) && isConstant(hdVar.b);
    }

    public static final boolean isConstant(x7 x7Var) {
        if (x7Var == null) {
            return true;
        }
        if (x7Var instanceof x7.a) {
            y7 y7Var = ((x7.a) x7Var).b;
            return ExpressionsKt.isConstantOrNull(y7Var.b) && ExpressionsKt.isConstantOrNull(y7Var.b);
        }
        if (x7Var instanceof x7.b) {
            return ExpressionsKt.isConstant(((x7.b) x7Var).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(e4 e4Var) {
        if (e4Var == null || (e4Var instanceof e4.b)) {
            return true;
        }
        if (e4Var instanceof e4.a) {
            return ExpressionsKt.isConstant(((e4.a) e4Var).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(ukn uknVar) {
        if (uknVar == null) {
            return true;
        }
        if (!(uknVar instanceof ukn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        von vonVar = ((ukn.a) uknVar).b;
        return ExpressionsKt.isConstant(vonVar.a) && isConstant(vonVar.b) && isConstant(vonVar.c);
    }

    public static final boolean isConstant(q9 q9Var) {
        va vaVar;
        if (q9Var == null) {
            return true;
        }
        if (q9Var instanceof q9.b) {
            y8 y8Var = ((q9.b) q9Var).b;
            return ExpressionsKt.isConstantOrNull(y8Var.a) && isConstant(y8Var.e) && isConstant(y8Var.d) && isConstant(y8Var.c) && isConstant(y8Var.b);
        }
        if (!(q9Var instanceof q9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        i2 i2Var = ((q9.a) q9Var).b;
        return ExpressionsKt.isConstantOrNull(i2Var.a) && ((vaVar = i2Var.c) == null || isConstant(vaVar)) && isConstant(i2Var.b);
    }

    public static final boolean equalsToConstant(q4 q4Var, q4 q4Var2) {
        if (q4Var == null && q4Var2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(q4Var != null ? q4Var.b : null, q4Var2 != null ? q4Var2.b : null)) {
            return ExpressionsKt.equalsToConstant(q4Var != null ? q4Var.a : null, q4Var2 != null ? q4Var2.a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(y3 y3Var, y3 y3Var2) {
        if (y3Var == null && y3Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.c : null, y3Var2 != null ? y3Var2.c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.f : null, y3Var2 != null ? y3Var2.f : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.d : null, y3Var2 != null ? y3Var2.d : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.a : null, y3Var2 != null ? y3Var2.a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.e : null, y3Var2 != null ? y3Var2.e : null)) {
            return ExpressionsKt.equalsToConstant(y3Var != null ? y3Var.b : null, y3Var2 != null ? y3Var2.b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(b bVar, b bVar2) {
        if (bVar == null && bVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(bVar != null ? bVar.b : null, bVar2 != null ? bVar2.b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(bVar != null ? bVar.d : null, bVar2 != null ? bVar2.d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(bVar != null ? bVar.c : null, bVar2 != null ? bVar2.c : null)) {
            return ExpressionsKt.equalsToConstant(bVar != null ? bVar.a : null, bVar2 != null ? bVar2.a : null);
        }
        return false;
    }

    public static final boolean isConstant(va vaVar) {
        if (vaVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(vaVar.a) && ExpressionsKt.isConstant(vaVar.d) && ExpressionsKt.isConstant(vaVar.c);
    }

    public static final boolean isConstant(u1 u1Var) {
        if (u1Var == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(u1Var.a) && isConstant(u1Var.b) && ExpressionsKt.isConstant(u1Var.c) && isConstant(u1Var.d) && isConstant(u1Var.e);
    }

    public static final boolean equalsToConstant(hd hdVar, hd hdVar2) {
        if (hdVar == null && hdVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(hdVar != null ? hdVar.c : null, hdVar2 != null ? hdVar2.c : null)) {
            return false;
        }
        if (equalsToConstant(hdVar != null ? hdVar.a : null, hdVar2 != null ? hdVar2.a : null)) {
            return equalsToConstant(hdVar != null ? hdVar.b : null, hdVar2 != null ? hdVar2.b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(x7 x7Var, x7 x7Var2) {
        if (x7Var == null) {
            return x7Var2 == null;
        }
        if (x7Var instanceof x7.a) {
            if (x7Var2 instanceof x7.a) {
                y7 y7Var = ((x7.a) x7Var).b;
                x7.a aVar = (x7.a) x7Var2;
                if (ExpressionsKt.equalsToConstant(y7Var.b, aVar.b.b) && ExpressionsKt.equalsToConstant(y7Var.a, aVar.b.a)) {
                    return true;
                }
            }
            return false;
        }
        if (x7Var instanceof x7.b) {
            return (x7Var2 instanceof x7.b) && ExpressionsKt.equalsToConstant(((x7.b) x7Var).b.a, ((x7.b) x7Var2).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(y2 y2Var) {
        if (y2Var == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(y2Var.c) && ExpressionsKt.isConstantOrNull(y2Var.d) && ExpressionsKt.isConstantOrNull(y2Var.b) && ExpressionsKt.isConstantOrNull(y2Var.a);
    }

    public static final boolean isConstant(n9 n9Var) {
        if (n9Var == null) {
            return true;
        }
        return ExpressionsKt.isConstant(n9Var.a) && ExpressionsKt.isConstant(n9Var.b) && ExpressionsKt.isConstant(n9Var.c) && isConstant(n9Var.d);
    }

    public static final boolean isConstant(jon jonVar) {
        if (jonVar == null) {
            return true;
        }
        return isConstant(jonVar.a) && isConstant(jonVar.b);
    }

    public static final boolean isConstant(s3 s3Var) {
        if (s3Var == null) {
            return true;
        }
        return ExpressionsKt.isConstant(s3Var.a) && ExpressionsKt.isConstant(s3Var.b);
    }

    public static final boolean isConstant(m1 m1Var) {
        if (m1Var == null) {
            return true;
        }
        if (m1Var instanceof m1.e) {
            return ExpressionsKt.isConstant(((m1.e) m1Var).b.a);
        }
        if (m1Var instanceof m1.a) {
            f5 f5Var = ((m1.a) m1Var).b;
            if (ExpressionsKt.isConstant(f5Var.a) && ExpressionsKt.isConstant(f5Var.b) && ExpressionsKt.isConstant(f5Var.c)) {
                List<e4> list = f5Var.d;
                if (list != null) {
                    List<e4> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (!isConstant((e4) it.next())) {
                                break;
                            }
                        }
                    }
                }
                if (!ExpressionsKt.isConstant(f5Var.e) || !ExpressionsKt.isConstant(f5Var.f) || !ExpressionsKt.isConstant(f5Var.g)) {
                    break;
                }
                return true;
            }
            return false;
        }
        if (m1Var instanceof m1.b) {
            s6 s6Var = ((m1.b) m1Var).b;
            return ExpressionsKt.isConstant(s6Var.a) && ExpressionsKt.isConstantOrNull(s6Var.c);
        }
        if (m1Var instanceof m1.d) {
            f8 f8Var = ((m1.d) m1Var).b;
            return isConstant(f8Var.a) && isConstant(f8Var.b) && ExpressionsKt.isConstantOrNull(f8Var.d) && isConstant(f8Var.e);
        }
        if (!(m1Var instanceof m1.c)) {
            throw new NoWhenBranchMatchedException();
        }
        fnn fnnVar = ((m1.c) m1Var).b;
        return ExpressionsKt.isConstant(fnnVar.a) && isConstant(fnnVar.b);
    }

    public static final boolean equalsToConstant(e4 e4Var, e4 e4Var2) {
        if (e4Var == null) {
            return e4Var2 == null;
        }
        if (e4Var instanceof e4.b) {
            return e4Var2 instanceof e4.b;
        }
        if (e4Var instanceof e4.a) {
            return (e4Var2 instanceof e4.a) && ExpressionsKt.equalsToConstant(((e4.a) e4Var).b.a, ((e4.a) e4Var2).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(ukn uknVar, ukn uknVar2) {
        if (uknVar == null) {
            return uknVar2 == null;
        }
        if (!(uknVar instanceof ukn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (uknVar2 instanceof ukn.a) {
            von vonVar = ((ukn.a) uknVar).b;
            ukn.a aVar = (ukn.a) uknVar2;
            if (ExpressionsKt.equalsToConstant(vonVar.a, aVar.b.a) && equalsToConstant(vonVar.b, aVar.b.b) && equalsToConstant(vonVar.c, aVar.b.c)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(q9 q9Var, q9 q9Var2) {
        if (q9Var == null) {
            return q9Var2 == null;
        }
        if (q9Var instanceof q9.b) {
            if (q9Var2 instanceof q9.b) {
                y8 y8Var = ((q9.b) q9Var).b;
                q9.b bVar = (q9.b) q9Var2;
                if (ExpressionsKt.equalsToConstant(y8Var.a, bVar.b.a) && equalsToConstant(y8Var.e, bVar.b.e) && equalsToConstant(y8Var.d, bVar.b.d) && equalsToConstant(y8Var.c, bVar.b.c) && equalsToConstant(y8Var.b, bVar.b.b)) {
                    return true;
                }
            }
            return false;
        }
        if (!(q9Var instanceof q9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (q9Var2 instanceof q9.a) {
            i2 i2Var = ((q9.a) q9Var).b;
            q9.a aVar = (q9.a) q9Var2;
            if (ExpressionsKt.equalsToConstant(i2Var.a, aVar.b.a) && equalsToConstant(i2Var.c, aVar.b.c) && equalsToConstant(i2Var.b, aVar.b.b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(s6.a aVar) {
        if (aVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(aVar.a) && ExpressionsKt.isConstant(aVar.b);
    }

    public static final boolean isConstant(g8 g8Var) {
        if (g8Var == null) {
            return true;
        }
        if (g8Var instanceof g8.a) {
            m8 m8Var = ((g8.a) g8Var).b;
            return ExpressionsKt.isConstant(m8Var.a) && ExpressionsKt.isConstant(m8Var.b);
        }
        if (g8Var instanceof g8.b) {
            return ExpressionsKt.isConstant(((g8.b) g8Var).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(q8 q8Var) {
        if (q8Var == null) {
            return true;
        }
        if (q8Var instanceof q8.a) {
            q4 q4Var = ((q8.a) q8Var).b;
            return ExpressionsKt.isConstant(q4Var.a) && ExpressionsKt.isConstant(q4Var.b);
        }
        if (q8Var instanceof q8.b) {
            return ExpressionsKt.isConstant(((q8.b) q8Var).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(DivInput.a aVar) {
        if (aVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(aVar.a);
    }

    public static final boolean equalsToConstant(va vaVar, va vaVar2) {
        if (vaVar == null && vaVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(vaVar != null ? vaVar.a : null, vaVar2 != null ? vaVar2.a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(vaVar != null ? vaVar.d : null, vaVar2 != null ? vaVar2.d : null)) {
            return ExpressionsKt.equalsToConstant(vaVar != null ? vaVar.c : null, vaVar2 != null ? vaVar2.c : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(u1 u1Var, u1 u1Var2) {
        if (u1Var == null && u1Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(u1Var != null ? u1Var.a : null, u1Var2 != null ? u1Var2.a : null)) {
            return false;
        }
        if (!equalsToConstant(u1Var != null ? u1Var.b : null, u1Var2 != null ? u1Var2.b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(u1Var != null ? u1Var.c : null, u1Var2 != null ? u1Var2.c : null)) {
            return false;
        }
        if (equalsToConstant(u1Var != null ? u1Var.d : null, u1Var2 != null ? u1Var2.d : null)) {
            return equalsToConstant(u1Var != null ? u1Var.e : null, u1Var2 != null ? u1Var2.e : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(y2 y2Var, y2 y2Var2) {
        if (y2Var == null && y2Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(y2Var != null ? y2Var.c : null, y2Var2 != null ? y2Var2.c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(y2Var != null ? y2Var.d : null, y2Var2 != null ? y2Var2.d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(y2Var != null ? y2Var.b : null, y2Var2 != null ? y2Var2.b : null)) {
            return ExpressionsKt.equalsToConstant(y2Var != null ? y2Var.a : null, y2Var2 != null ? y2Var2.a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(n9 n9Var, n9 n9Var2) {
        if (n9Var == null && n9Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(n9Var != null ? n9Var.a : null, n9Var2 != null ? n9Var2.a : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(n9Var != null ? n9Var.b : null, n9Var2 != null ? n9Var2.b : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(n9Var != null ? n9Var.c : null, n9Var2 != null ? n9Var2.c : null)) {
            return equalsToConstant(n9Var != null ? n9Var.d : null, n9Var2 != null ? n9Var2.d : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(jon jonVar, jon jonVar2) {
        if (jonVar == null && jonVar2 == null) {
            return true;
        }
        if (equalsToConstant(jonVar != null ? jonVar.a : null, jonVar2 != null ? jonVar2.a : null)) {
            return equalsToConstant(jonVar != null ? jonVar.b : null, jonVar2 != null ? jonVar2.b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(s3 s3Var, s3 s3Var2) {
        if (s3Var == null && s3Var2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(s3Var != null ? s3Var.a : null, s3Var2 != null ? s3Var2.a : null)) {
            return ExpressionsKt.equalsToConstant(s3Var != null ? s3Var.b : null, s3Var2 != null ? s3Var2.b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(m1 m1Var, m1 m1Var2) {
        if (m1Var == null) {
            return m1Var2 == null;
        }
        if (m1Var instanceof m1.e) {
            return (m1Var2 instanceof m1.e) && ExpressionsKt.equalsToConstant(((m1.e) m1Var).b.a, ((m1.e) m1Var2).b.a);
        }
        if (m1Var instanceof m1.a) {
            f5 f5Var = ((m1.a) m1Var).b;
            List list = f5Var.d;
            if (list == null) {
                list = EmptyList.b;
            }
            if (m1Var2 instanceof m1.a) {
                m1.a aVar = (m1.a) m1Var2;
                if (ExpressionsKt.equalsToConstant(f5Var.a, aVar.b.a) && ExpressionsKt.equalsToConstant(f5Var.b, aVar.b.b) && ExpressionsKt.equalsToConstant(f5Var.c, aVar.b.c)) {
                    List list2 = aVar.b.d;
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    if (list.size() == list2.size()) {
                        Iterator it = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!ExpressionsKt.equalsToConstant(f5Var.e, aVar.b.e) || !ExpressionsKt.equalsToConstant(f5Var.f, aVar.b.f) || !ExpressionsKt.equalsToConstant(f5Var.g, aVar.b.g)) {
                                    break;
                                }
                                return true;
                            }
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (!equalsToConstant((e4) next, (e4) list2.get(i))) {
                                    break;
                                }
                                i = i2;
                            } else {
                                e43.t();
                                throw null;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (m1Var instanceof m1.b) {
            s6 s6Var = ((m1.b) m1Var).b;
            List list3 = s6Var.b;
            if (list3 == null) {
                list3 = EmptyList.b;
            }
            if (m1Var2 instanceof m1.b) {
                m1.b bVar = (m1.b) m1Var2;
                if (ExpressionsKt.equalsToConstant(s6Var.a, bVar.b.a) && ExpressionsKt.equalsToConstant(s6Var.c, bVar.b.c)) {
                    List list4 = bVar.b.b;
                    if (list4 == null) {
                        list4 = EmptyList.b;
                    }
                    if (list3.size() == list4.size()) {
                        int i3 = 0;
                        for (Object obj : list3) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                if (equalsToConstant((s6.a) obj, (s6.a) list4.get(i3))) {
                                    i3 = i4;
                                }
                            } else {
                                e43.t();
                                throw null;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        if (m1Var instanceof m1.d) {
            if (m1Var2 instanceof m1.d) {
                f8 f8Var = ((m1.d) m1Var).b;
                m1.d dVar = (m1.d) m1Var2;
                if (equalsToConstant(f8Var.a, dVar.b.a) && equalsToConstant(f8Var.b, dVar.b.b) && ExpressionsKt.equalsToConstant(f8Var.d, dVar.b.d) && equalsToConstant(f8Var.e, dVar.b.e)) {
                    return true;
                }
            }
            return false;
        }
        if (!(m1Var instanceof m1.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (m1Var2 instanceof m1.c) {
            fnn fnnVar = ((m1.c) m1Var).b;
            m1.c cVar = (m1.c) m1Var2;
            if (ExpressionsKt.equalsToConstant(fnnVar.a, cVar.b.a) && equalsToConstant(fnnVar.b, cVar.b.b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(s6.a aVar, s6.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.a : null, aVar2 != null ? aVar2.a : null)) {
            return ExpressionsKt.equalsToConstant(aVar != null ? aVar.b : null, aVar2 != null ? aVar2.b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(g8 g8Var, g8 g8Var2) {
        if (g8Var == null) {
            return g8Var2 == null;
        }
        if (g8Var instanceof g8.a) {
            if (g8Var2 instanceof g8.a) {
                m8 m8Var = ((g8.a) g8Var).b;
                g8.a aVar = (g8.a) g8Var2;
                if (ExpressionsKt.equalsToConstant(m8Var.a, aVar.b.a) && ExpressionsKt.equalsToConstant(m8Var.b, aVar.b.b)) {
                    return true;
                }
            }
            return false;
        }
        if (g8Var instanceof g8.b) {
            return (g8Var2 instanceof g8.b) && ExpressionsKt.equalsToConstant(((g8.b) g8Var).b.a, ((g8.b) g8Var2).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(q8 q8Var, q8 q8Var2) {
        if (q8Var == null) {
            return q8Var2 == null;
        }
        if (q8Var instanceof q8.a) {
            if (q8Var2 instanceof q8.a) {
                q4 q4Var = ((q8.a) q8Var).b;
                q8.a aVar = (q8.a) q8Var2;
                if (ExpressionsKt.equalsToConstant(q4Var.a, aVar.b.a) && ExpressionsKt.equalsToConstant(q4Var.b, aVar.b.b)) {
                    return true;
                }
            }
            return false;
        }
        if (q8Var instanceof q8.b) {
            return (q8Var2 instanceof q8.b) && ExpressionsKt.equalsToConstant(((q8.b) q8Var).b.a, ((q8.b) q8Var2).b.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(DivInput.a aVar, DivInput.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(aVar != null ? aVar.a : null, aVar2 != null ? aVar2.a : null);
    }
}
