package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.b18;
import xsna.cxm;
import xsna.fom0;
import xsna.gax;
import xsna.pl3;
import xsna.tfq0;
import xsna.tn70;
import xsna.x8g;

/* compiled from: DivVariableTemplate.kt */
/* loaded from: classes8.dex */
public abstract class qd implements JSONSerializable, JsonTemplate<md> {

    /* compiled from: DivVariableTemplate.kt */
    public static final class a extends qd {
        public final pl3 a;

        public a(pl3 pl3Var) {
            this.a = pl3Var;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class b extends qd {
        public final b18 a;

        public b(b18 b18Var) {
            this.a = b18Var;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class c extends qd {
        public final x8g a;

        public c(x8g x8gVar) {
            this.a = x8gVar;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class d extends qd {
        public final cxm a;

        public d(cxm cxmVar) {
            this.a = cxmVar;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class e extends qd {
        public final gax a;

        public e(gax gaxVar) {
            this.a = gaxVar;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class f extends qd {
        public final tn70 a;

        public f(tn70 tn70Var) {
            this.a = tn70Var;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class g extends qd {
        public final le a;

        public g(le leVar) {
            this.a = leVar;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class h extends qd {
        public final fom0 a;

        public h(fom0 fom0Var) {
            this.a = fom0Var;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class i extends qd {
        public final tfq0 a;

        public i(tfq0 tfq0Var) {
            this.a = tfq0Var;
        }
    }

    public final Object a() {
        if (this instanceof h) {
            return ((h) this).a;
        }
        if (this instanceof f) {
            return ((f) this).a;
        }
        if (this instanceof e) {
            return ((e) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof i) {
            return ((i) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof g) {
            return ((g) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((od) BuiltInParserKt.getBuiltInParserComponent().i9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
