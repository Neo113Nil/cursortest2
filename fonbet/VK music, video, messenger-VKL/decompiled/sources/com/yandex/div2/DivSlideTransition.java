package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.da;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivSlideTransition.kt */
/* loaded from: classes8.dex */
public final class DivSlideTransition implements JSONSerializable, Hashable {
    public static final Expression<Long> g;
    public static final Expression<Edge> h;
    public static final Expression<DivAnimationInterpolator> i;
    public static final Expression<Long> j;
    public final s3 a;
    public final Expression<Long> b;
    public final Expression<Edge> c;
    public final Expression<DivAnimationInterpolator> d;
    public final Expression<Long> e;
    public Integer f;

    /* compiled from: DivSlideTransition.kt */
    public enum Edge {
        LEFT(TtmlNode.LEFT),
        TOP("top"),
        RIGHT(TtmlNode.RIGHT),
        BOTTOM("bottom");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Edge, String> TO_STRING = b.i;
        public static final izs<String, Edge> FROM_STRING = a.i;

        /* compiled from: DivSlideTransition.kt */
        public static final class a extends Lambda implements izs<String, Edge> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Edge invoke(String str) {
                String str2 = str;
                Edge.Converter.getClass();
                Edge edge = Edge.LEFT;
                if (epx.f(str2, edge.value)) {
                    return edge;
                }
                Edge edge2 = Edge.TOP;
                if (epx.f(str2, edge2.value)) {
                    return edge2;
                }
                Edge edge3 = Edge.RIGHT;
                if (epx.f(str2, edge3.value)) {
                    return edge3;
                }
                Edge edge4 = Edge.BOTTOM;
                if (epx.f(str2, edge4.value)) {
                    return edge4;
                }
                return null;
            }
        }

        /* compiled from: DivSlideTransition.kt */
        public static final class b extends Lambda implements izs<Edge, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Edge edge) {
                Edge.Converter.getClass();
                return edge.value;
            }
        }

        /* compiled from: DivSlideTransition.kt */
        public static final class c {
        }

        Edge(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        h = Expression.Companion.constant$default(companion, Edge.BOTTOM, null, 2, null);
        i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public DivSlideTransition(s3 s3Var, Expression<Long> expression, Expression<Edge> expression2, Expression<DivAnimationInterpolator> expression3, Expression<Long> expression4) {
        this.a = s3Var;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = expression4;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivSlideTransition.class).hashCode();
        s3 s3Var = this.a;
        int hashCode2 = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (s3Var != null ? s3Var.hash() : 0);
        this.f = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((da.c) BuiltInParserKt.getBuiltInParserComponent().b7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivSlideTransition() {
        this(null, g, h, i, j);
    }
}
