package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivVisitor.kt */
/* loaded from: classes7.dex */
public abstract class DivVisitor<T> {
    public abstract T defaultVisit(a aVar, ExpressionResolver expressionResolver);

    public final T visit(a aVar, ExpressionResolver expressionResolver) {
        if (aVar instanceof a.p) {
            return visit((a.p) aVar, expressionResolver);
        }
        if (aVar instanceof a.f) {
            return visit((a.f) aVar, expressionResolver);
        }
        if (aVar instanceof a.d) {
            return visit((a.d) aVar, expressionResolver);
        }
        if (aVar instanceof a.k) {
            return visit((a.k) aVar, expressionResolver);
        }
        if (aVar instanceof a.C2110a) {
            return visit((a.C2110a) aVar, expressionResolver);
        }
        if (aVar instanceof a.e) {
            return visit((a.e) aVar, expressionResolver);
        }
        if (aVar instanceof a.c) {
            return visit((a.c) aVar, expressionResolver);
        }
        if (aVar instanceof a.i) {
            return visit((a.i) aVar, expressionResolver);
        }
        if (aVar instanceof a.o) {
            return visit((a.o) aVar, expressionResolver);
        }
        if (aVar instanceof a.m) {
            return visit((a.m) aVar, expressionResolver);
        }
        if (aVar instanceof a.b) {
            return visit((a.b) aVar, expressionResolver);
        }
        if (aVar instanceof a.g) {
            return visit((a.g) aVar, expressionResolver);
        }
        if (aVar instanceof a.l) {
            return visit((a.l) aVar, expressionResolver);
        }
        if (aVar instanceof a.h) {
            return visit((a.h) aVar, expressionResolver);
        }
        if (aVar instanceof a.j) {
            return visit((a.j) aVar, expressionResolver);
        }
        if (aVar instanceof a.q) {
            return visit((a.q) aVar, expressionResolver);
        }
        if (aVar instanceof a.n) {
            return visit((a.n) aVar, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public T visit(a.p pVar, ExpressionResolver expressionResolver) {
        return defaultVisit(pVar, expressionResolver);
    }

    public T visit(a.f fVar, ExpressionResolver expressionResolver) {
        return defaultVisit(fVar, expressionResolver);
    }

    public T visit(a.d dVar, ExpressionResolver expressionResolver) {
        return defaultVisit(dVar, expressionResolver);
    }

    public T visit(a.k kVar, ExpressionResolver expressionResolver) {
        return defaultVisit(kVar, expressionResolver);
    }

    public T visit(a.C2110a c2110a, ExpressionResolver expressionResolver) {
        return defaultVisit(c2110a, expressionResolver);
    }

    public T visit(a.e eVar, ExpressionResolver expressionResolver) {
        return defaultVisit(eVar, expressionResolver);
    }

    public T visit(a.c cVar, ExpressionResolver expressionResolver) {
        return defaultVisit(cVar, expressionResolver);
    }

    public T visit(a.i iVar, ExpressionResolver expressionResolver) {
        return defaultVisit(iVar, expressionResolver);
    }

    public T visit(a.o oVar, ExpressionResolver expressionResolver) {
        return defaultVisit(oVar, expressionResolver);
    }

    public T visit(a.m mVar, ExpressionResolver expressionResolver) {
        return defaultVisit(mVar, expressionResolver);
    }

    public T visit(a.b bVar, ExpressionResolver expressionResolver) {
        return defaultVisit(bVar, expressionResolver);
    }

    public T visit(a.g gVar, ExpressionResolver expressionResolver) {
        return defaultVisit(gVar, expressionResolver);
    }

    public T visit(a.l lVar, ExpressionResolver expressionResolver) {
        return defaultVisit(lVar, expressionResolver);
    }

    public T visit(a.h hVar, ExpressionResolver expressionResolver) {
        return defaultVisit(hVar, expressionResolver);
    }

    public T visit(a.j jVar, ExpressionResolver expressionResolver) {
        return defaultVisit(jVar, expressionResolver);
    }

    public T visit(a.q qVar, ExpressionResolver expressionResolver) {
        return defaultVisit(qVar, expressionResolver);
    }

    public T visit(a.n nVar, ExpressionResolver expressionResolver) {
        return defaultVisit(nVar, expressionResolver);
    }
}
