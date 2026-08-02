package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpn;
import xsna.jnn;

/* compiled from: DivBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public abstract class q1 implements JSONSerializable, JsonTemplate<m1> {

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class a extends q1 {
        public final h5 a;

        public a(h5 h5Var) {
            this.a = h5Var;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class b extends q1 {
        public final v6 a;

        public b(v6 v6Var) {
            this.a = v6Var;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class c extends q1 {
        public final jnn a;

        public c(jnn jnnVar) {
            this.a = jnnVar;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class d extends q1 {
        public final x8 a;

        public d(x8 x8Var) {
            this.a = x8Var;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class e extends q1 {
        public final fpn a;

        public e(fpn fpnVar) {
            this.a = fpnVar;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
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
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((o1) BuiltInParserKt.getBuiltInParserComponent().G1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
