package xsna;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTypedValueTemplate.kt */
/* loaded from: classes8.dex */
public abstract class oqn implements JSONSerializable, JsonTemplate<kqn> {

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class a extends oqn {
        public final kl3 a;

        public a(kl3 kl3Var) {
            this.a = kl3Var;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class b extends oqn {
        public final w08 a;

        public b(w08 w08Var) {
            this.a = w08Var;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class c extends oqn {
        public final s8g a;

        public c(s8g s8gVar) {
            this.a = s8gVar;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class d extends oqn {
        public final xwm a;

        public d(xwm xwmVar) {
            this.a = xwmVar;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class e extends oqn {
        public final bax a;

        public e(bax baxVar) {
            this.a = baxVar;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class f extends oqn {
        public final on70 a;

        public f(on70 on70Var) {
            this.a = on70Var;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class g extends oqn {
        public final aom0 a;

        public g(aom0 aom0Var) {
            this.a = aom0Var;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class h extends oqn {
        public final ofq0 a;

        public h(ofq0 ofq0Var) {
            this.a = ofq0Var;
        }
    }

    public final Object a() {
        if (this instanceof g) {
            return ((g) this).a;
        }
        if (this instanceof e) {
            return ((e) this).a;
        }
        if (this instanceof f) {
            return ((f) this).a;
        }
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof h) {
            return ((h) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((mqn) BuiltInParserKt.getBuiltInParserComponent().f9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
