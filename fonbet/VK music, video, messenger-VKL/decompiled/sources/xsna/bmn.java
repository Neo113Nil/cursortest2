package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputFilter.kt */
/* loaded from: classes8.dex */
public abstract class bmn implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivInputFilter.kt */
    public static final class a extends bmn {
        public final cmn b;

        public a(cmn cmnVar) {
            this.b = cmnVar;
        }
    }

    /* compiled from: DivInputFilter.kt */
    public static final class b extends bmn {
        public final kmn b;

        public b(kmn kmnVar) {
            this.b = kmnVar;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int hash;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((a) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((hmn) BuiltInParserKt.getBuiltInParserComponent().p4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
