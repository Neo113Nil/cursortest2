package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.lkp;
import xsna.xpk0;

/* compiled from: DivActionScrollDestination.kt */
/* loaded from: classes8.dex */
public abstract class p implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivActionScrollDestination.kt */
    public static final class a extends p {
        public final lkp b;

        public a(lkp lkpVar) {
            this.b = lkpVar;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class b extends p {
        public final ce b;

        public b(ce ceVar) {
            this.b = ceVar;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class c extends p {
        public final ge b;

        public c(ge geVar) {
            this.b = geVar;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class d extends p {
        public final xpk0 b;

        public d(xpk0 xpk0Var) {
            this.b = xpk0Var;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof d) {
            return ((d) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
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
        } else if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else if (this instanceof d) {
            hash = ((d) this).b.hash();
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
        return ((q) BuiltInParserKt.getBuiltInParserComponent().x0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
