package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutMode.kt */
/* loaded from: classes8.dex */
public abstract class unn implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class a extends unn {
        public final ann b;

        public a(ann annVar) {
            this.b = annVar;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class b extends unn {
        public final knn b;

        public b(knn knnVar) {
            this.b = knnVar;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class c extends unn {
        public final pnn b;

        public c(pnn pnnVar) {
            this.b = pnnVar;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int hash;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof c) {
            hash = ((c) this).b.hash();
        } else if (this instanceof a) {
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
        return ((vnn) BuiltInParserKt.getBuiltInParserComponent().w5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
