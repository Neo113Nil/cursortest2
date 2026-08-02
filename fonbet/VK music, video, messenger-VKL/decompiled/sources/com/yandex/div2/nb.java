package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTemplate.kt */
/* loaded from: classes8.dex */
public abstract class nb implements JSONSerializable, JsonTemplate<com.yandex.div2.a> {

    /* compiled from: DivTemplate.kt */
    public static final class a extends nb {
        public final x2 a;

        public a(x2 x2Var) {
            this.a = x2Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class b extends nb {
        public final i3 a;

        public b(i3 i3Var) {
            this.a = i3Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class c extends nb {
        public final x4 a;

        public c(x4 x4Var) {
            this.a = x4Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class d extends nb {
        public final a5 a;

        public d(a5 a5Var) {
            this.a = a5Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class e extends nb {
        public final d5 a;

        public e(d5 d5Var) {
            this.a = d5Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class f extends nb {
        public final j5 a;

        public f(j5 j5Var) {
            this.a = j5Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class g extends nb {
        public final q5 a;

        public g(q5 q5Var) {
            this.a = q5Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class h extends nb {
        public final a6 a;

        public h(a6 a6Var) {
            this.a = a6Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class i extends nb {
        public final o7 a;

        public i(o7 o7Var) {
            this.a = o7Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class j extends nb {
        public final j9 a;

        public j(j9 j9Var) {
            this.a = j9Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class k extends nb {
        public final m9 a;

        public k(m9 m9Var) {
            this.a = m9Var;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class l extends nb {
        public final ka a;

        public l(ka kaVar) {
            this.a = kaVar;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class m extends nb {
        public final ra a;

        public m(ra raVar) {
            this.a = raVar;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class n extends nb {
        public final fb a;

        public n(fb fbVar) {
            this.a = fbVar;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class o extends nb {
        public final mb a;

        public o(mb mbVar) {
            this.a = mbVar;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class p extends nb {
        public final wc a;

        public p(wc wcVar) {
            this.a = wcVar;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class q extends nb {
        public final yd a;

        public q(yd ydVar) {
            this.a = ydVar;
        }
    }

    public final Object a() {
        if (this instanceof f) {
            return ((f) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
        }
        if (this instanceof p) {
            return ((p) this).a;
        }
        if (this instanceof k) {
            return ((k) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof e) {
            return ((e) this).a;
        }
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof i) {
            return ((i) this).a;
        }
        if (this instanceof o) {
            return ((o) this).a;
        }
        if (this instanceof m) {
            return ((m) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof g) {
            return ((g) this).a;
        }
        if (this instanceof l) {
            return ((l) this).a;
        }
        if (this instanceof n) {
            return ((n) this).a;
        }
        if (this instanceof h) {
            return ((h) this).a;
        }
        if (this instanceof j) {
            return ((j) this).a;
        }
        if (this instanceof q) {
            return ((q) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((q6) BuiltInParserKt.getBuiltInParserComponent().A9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
