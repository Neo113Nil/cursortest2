package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.jkk;
import defpackage.kvo;
import defpackage.ngd0;
import defpackage.tls;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public final class DivTabs$TabTitleStyle implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final Expression h;
    public final jkk i;
    public final Expression j;
    public final Expression k;
    public final Expression l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final Expression p;
    public final Expression q;
    public final Expression r;
    public final Expression s;
    public final Expression t;
    public final Expression u;
    public final DivEdgeInsets v;
    public Integer w;
    public static final kvo x = ngd0.m(-9120);
    public static final kvo y = ngd0.m(-872415232);
    public static final kvo z = ngd0.m(300L);
    public static final kvo A = ngd0.m(AnimationType.SLIDE);
    public static final kvo B = ngd0.m(12L);
    public static final kvo C = ngd0.m(DivSizeUnit.SP);
    public static final kvo D = ngd0.m(DivFontWeight.REGULAR);
    public static final kvo E = ngd0.m(Integer.MIN_VALUE);
    public static final kvo F = ngd0.m(0L);
    public static final kvo G = ngd0.m(Double.valueOf(0.0d));
    public static final DivEdgeInsets H = new DivEdgeInsets(ngd0.m(6L), ngd0.m(8L), ngd0.m(8L), ngd0.m(6L), 82);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/j2", "SLIDE", "FADE", JCP.RAW_PREFIX, "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AnimationType {
        SLIDE("slide"),
        FADE("fade"),
        NONE("none");

        private final String value;
        public static final j2 Converter = new j2();
        public static final tls TO_STRING = DivTabs$TabTitleStyle$AnimationType$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivTabs$TabTitleStyle$AnimationType$Converter$FROM_STRING$1.w;

        AnimationType(String str) {
            this.value = str;
        }
    }

    public DivTabs$TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, jkk jkkVar, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, Expression expression19, Expression expression20, DivEdgeInsets divEdgeInsets) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = expression7;
        this.h = expression8;
        this.i = jkkVar;
        this.j = expression9;
        this.k = expression10;
        this.l = expression11;
        this.m = expression12;
        this.n = expression13;
        this.o = expression14;
        this.p = expression15;
        this.q = expression16;
        this.r = expression17;
        this.s = expression18;
        this.t = expression19;
        this.u = expression20;
        this.v = divEdgeInsets;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((l2) ft6.b.h8.getValue()).b(ft6.a, this);
    }

    public DivTabs$TabTitleStyle() {
        this(0);
    }

    public /* synthetic */ DivTabs$TabTitleStyle(int i) {
        this(x, null, null, null, y, z, A, null, null, null, B, C, D, null, null, null, null, E, F, G, null, H);
    }
}
