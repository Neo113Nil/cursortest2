package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivInputValidator.kt */
/* loaded from: classes8.dex */
public abstract class b6 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivInputValidator.kt */
    public static final class a extends b6 {
        public final f6 b;

        public a(f6 f6Var) {
            this.b = f6Var;
        }
    }

    /* compiled from: DivInputValidator.kt */
    public static final class b extends b6 {
        public final l6 b;

        public b(l6 l6Var) {
            this.b = l6Var;
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
        return ((i6) BuiltInParserKt.getBuiltInParserComponent().D4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
