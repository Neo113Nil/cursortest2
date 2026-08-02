package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.jnk;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.tls;
import kotlin.Metadata;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivSlideTransition implements c4x {
    public static final kvo g = ngd0.m(200L);
    public static final kvo h = ngd0.m(Edge.BOTTOM);
    public static final kvo i = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo j = ngd0.m(0L);
    public final jnk a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public Integer f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/y1", "LEFT", "TOP", "RIGHT", "BOTTOM", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Edge {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");

        private final String value;
        public static final y1 Converter = new y1();
        public static final tls TO_STRING = DivSlideTransition$Edge$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivSlideTransition$Edge$Converter$FROM_STRING$1.w;

        Edge(String str) {
            this.value = str;
        }
    }

    public DivSlideTransition(jnk jnkVar, Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.a = jnkVar;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = expression4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((z1) ft6.b.r7.getValue()).b(ft6.a, this);
    }

    public DivSlideTransition() {
        this(null, g, h, i, j);
    }
}
