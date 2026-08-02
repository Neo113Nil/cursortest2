package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivTextRangeMask.kt */
/* loaded from: classes8.dex */
public abstract class ic implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivTextRangeMask.kt */
    public static final class a extends ic {
        public final pc b;

        public a(pc pcVar) {
            this.b = pcVar;
        }
    }

    /* compiled from: DivTextRangeMask.kt */
    public static final class b extends ic {
        public final sc b;

        public b(sc scVar) {
            this.b = scVar;
        }
    }

    public final Object a() {
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
        return ((mc) BuiltInParserKt.getBuiltInParserComponent().r8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
