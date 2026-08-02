package xsna;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeTemplate.kt */
/* loaded from: classes8.dex */
public abstract class ynn implements JSONSerializable, JsonTemplate<unn> {

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class a extends ynn {
        public final enn a;

        public a(enn ennVar) {
            this.a = ennVar;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class b extends ynn {
        public final onn a;

        public b(onn onnVar) {
            this.a = onnVar;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class c extends ynn {
        public final tnn a;

        public c(tnn tnnVar) {
            this.a = tnnVar;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((wnn) BuiltInParserKt.getBuiltInParserComponent().x5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
