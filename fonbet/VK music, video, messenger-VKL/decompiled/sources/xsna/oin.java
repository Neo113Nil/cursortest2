package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContent.kt */
/* loaded from: classes8.dex */
public abstract class oin implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivActionCopyToClipboardContent.kt */
    public static final class a extends oin {
        public final elj b;

        public a(elj eljVar) {
            this.b = eljVar;
        }
    }

    /* compiled from: DivActionCopyToClipboardContent.kt */
    public static final class b extends oin {
        public final olj b;

        public b(olj oljVar) {
            this.b = oljVar;
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
        if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((b) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((pin) BuiltInParserKt.getBuiltInParserComponent().c0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
