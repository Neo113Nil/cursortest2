package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivRadialGradientRadius.kt */
/* loaded from: classes8.dex */
public abstract class q8 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class a extends q8 {
        public final q4 b;

        public a(q4 q4Var) {
            this.b = q4Var;
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class b extends q8 {
        public final DivRadialGradientRelativeRadius b;

        public b(DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            this.b = divRadialGradientRelativeRadius;
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
        return ((r8) BuiltInParserKt.getBuiltInParserComponent().f6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
