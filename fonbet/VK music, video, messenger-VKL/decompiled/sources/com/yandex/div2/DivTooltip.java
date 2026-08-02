package com.yandex.div2;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ad;
import com.yandex.div2.bd;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.eqn;
import xsna.fpf0;
import xsna.izs;
import xsna.jon;
import xsna.zpn;

/* compiled from: DivTooltip.kt */
/* loaded from: classes8.dex */
public final class DivTooltip implements JSONSerializable, Hashable {
    public final DivAnimation a;
    public final DivAnimation b;
    public final Expression<String> c;
    public final Expression<Boolean> d;
    public final a e;
    public final Expression<Long> f;
    public final String g;
    public final bd h;
    public final jon i;
    public final Expression<Position> j;
    public final List<DivAction> k;
    public Integer l;

    /* compiled from: DivTooltip.kt */
    public enum Position {
        LEFT(TtmlNode.LEFT),
        TOP_LEFT(X3.e.c),
        TOP("top"),
        TOP_RIGHT(X3.e.b),
        RIGHT(TtmlNode.RIGHT),
        BOTTOM_RIGHT(X3.e.d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(X3.e.e),
        CENTER(TtmlNode.CENTER);

        private final String value;
        public static final c Converter = new c();
        public static final izs<Position, String> TO_STRING = b.i;
        public static final izs<String, Position> FROM_STRING = a.i;

        /* compiled from: DivTooltip.kt */
        public static final class a extends Lambda implements izs<String, Position> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Position invoke(String str) {
                String str2 = str;
                Position.Converter.getClass();
                Position position = Position.LEFT;
                if (epx.f(str2, position.value)) {
                    return position;
                }
                Position position2 = Position.TOP_LEFT;
                if (epx.f(str2, position2.value)) {
                    return position2;
                }
                Position position3 = Position.TOP;
                if (epx.f(str2, position3.value)) {
                    return position3;
                }
                Position position4 = Position.TOP_RIGHT;
                if (epx.f(str2, position4.value)) {
                    return position4;
                }
                Position position5 = Position.RIGHT;
                if (epx.f(str2, position5.value)) {
                    return position5;
                }
                Position position6 = Position.BOTTOM_RIGHT;
                if (epx.f(str2, position6.value)) {
                    return position6;
                }
                Position position7 = Position.BOTTOM;
                if (epx.f(str2, position7.value)) {
                    return position7;
                }
                Position position8 = Position.BOTTOM_LEFT;
                if (epx.f(str2, position8.value)) {
                    return position8;
                }
                Position position9 = Position.CENTER;
                if (epx.f(str2, position9.value)) {
                    return position9;
                }
                return null;
            }
        }

        /* compiled from: DivTooltip.kt */
        public static final class b extends Lambda implements izs<Position, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Position position) {
                Position.Converter.getClass();
                return position.value;
            }
        }

        /* compiled from: DivTooltip.kt */
        public static final class c {
        }

        Position(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        new bd.a(new zpn());
    }

    public DivTooltip(DivAnimation divAnimation, DivAnimation divAnimation2, Expression<String> expression, Expression<Boolean> expression2, a aVar, Expression<Long> expression3, String str, bd bdVar, jon jonVar, Expression<Position> expression4, List<DivAction> list) {
        this.a = divAnimation;
        this.b = divAnimation2;
        this.c = expression;
        this.d = expression2;
        this.e = aVar;
        this.f = expression3;
        this.g = str;
        this.h = bdVar;
        this.i = jonVar;
        this.j = expression4;
        this.k = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0153, code lost:
    
        if (r1 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c6, code lost:
    
        if (r4 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c8, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f4, code lost:
    
        if (r4 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(DivTooltip divTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        boolean z;
        Hashable hashable2;
        boolean z2;
        if (divTooltip != null) {
            List<DivAction> list = divTooltip.k;
            jon jonVar = divTooltip.i;
            DivAnimation divAnimation = divTooltip.b;
            DivAnimation divAnimation2 = divTooltip.a;
            DivAnimation divAnimation3 = this.a;
            if (divAnimation3 != null ? divAnimation3.a(divAnimation2, expressionResolver, expressionResolver2) : divAnimation2 == null) {
                DivAnimation divAnimation4 = this.b;
                if (divAnimation4 != null ? divAnimation4.a(divAnimation, expressionResolver, expressionResolver2) : divAnimation == null) {
                    Expression<String> expression = this.c;
                    String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                    Expression<String> expression2 = divTooltip.c;
                    if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.d.evaluate(expressionResolver).booleanValue() == divTooltip.d.evaluate(expressionResolver2).booleanValue() && this.e.a(divTooltip.e, expressionResolver, expressionResolver2) && this.f.evaluate(expressionResolver).longValue() == divTooltip.f.evaluate(expressionResolver2).longValue() && epx.f(this.g, divTooltip.g)) {
                        bd bdVar = divTooltip.h;
                        bd bdVar2 = this.h;
                        bdVar2.getClass();
                        if (bdVar != null) {
                            if (bdVar2 instanceof bd.b) {
                                eqn eqnVar = ((bd.b) bdVar2).b;
                                if (bdVar instanceof bd.b) {
                                    hashable2 = ((bd.b) bdVar).b;
                                } else {
                                    if (!(bdVar instanceof bd.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable2 = ((bd.a) bdVar).b;
                                }
                                eqn eqnVar2 = hashable2 instanceof eqn ? (eqn) hashable2 : null;
                                eqnVar.getClass();
                            } else {
                                if (!(bdVar2 instanceof bd.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zpn zpnVar = ((bd.a) bdVar2).b;
                                if (bdVar instanceof bd.b) {
                                    hashable = ((bd.b) bdVar).b;
                                } else {
                                    if (!(bdVar instanceof bd.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable = ((bd.a) bdVar).b;
                                }
                                zpn zpnVar2 = hashable instanceof zpn ? (zpn) hashable : null;
                                zpnVar.getClass();
                            }
                            if (z) {
                                jon jonVar2 = this.i;
                                if ((jonVar2 != null ? jonVar2.a(jonVar, expressionResolver, expressionResolver2) : jonVar == null) && this.j.evaluate(expressionResolver) == divTooltip.j.evaluate(expressionResolver2)) {
                                    List<DivAction> list2 = this.k;
                                    if (list2 != null) {
                                        if (list != null) {
                                            if (list2.size() == list.size()) {
                                                int i = 0;
                                                for (Object obj : list2) {
                                                    int i2 = i + 1;
                                                    if (i < 0) {
                                                        e43.t();
                                                        throw null;
                                                    }
                                                    if (((DivAction) obj).a(list.get(i), expressionResolver, expressionResolver2)) {
                                                        i = i2;
                                                    }
                                                }
                                                z2 = true;
                                            }
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        return true;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivTooltip.class).hashCode();
        int i = 0;
        DivAnimation divAnimation = this.a;
        int hash = hashCode + (divAnimation != null ? divAnimation.hash() : 0);
        DivAnimation divAnimation2 = this.b;
        int hash2 = hash + (divAnimation2 != null ? divAnimation2.hash() : 0);
        Expression<String> expression = this.c;
        int hash3 = this.h.hash() + this.g.hashCode() + this.f.hashCode() + this.e.hash() + this.d.hashCode() + hash2 + (expression != null ? expression.hashCode() : 0);
        jon jonVar = this.i;
        int hashCode2 = this.j.hashCode() + hash3 + (jonVar != null ? jonVar.hash() : 0);
        List<DivAction> list = this.k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        }
        int i2 = hashCode2 + i;
        this.l = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ad.b) BuiltInParserKt.getBuiltInParserComponent().V8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
