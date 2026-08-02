package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eqn;
import xsna.fpf0;
import xsna.zpn;

/* compiled from: DivTooltipMode.kt */
/* loaded from: classes8.dex */
public abstract class bd implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivTooltipMode.kt */
    public static final class a extends bd {
        public final zpn b;

        public a(zpn zpnVar) {
            this.b = zpnVar;
        }
    }

    /* compiled from: DivTooltipMode.kt */
    public static final class b extends bd {
        public final eqn b;

        public b(eqn eqnVar) {
            this.b = eqnVar;
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
        return ((cd) BuiltInParserKt.getBuiltInParserComponent().S8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
