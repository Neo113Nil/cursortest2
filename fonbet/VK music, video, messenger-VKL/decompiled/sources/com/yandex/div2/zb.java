package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bpn;
import xsna.fpf0;

/* compiled from: DivTextRangeBackground.kt */
/* loaded from: classes8.dex */
public abstract class zb implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivTextRangeBackground.kt */
    public static final class a extends zb {
        public final l2 b;

        public a(l2 l2Var) {
            this.b = l2Var;
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    public static final class b extends zb {
        public final bpn b;

        public b(bpn bpnVar) {
            this.b = bpnVar;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b;
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
        return ((ac) BuiltInParserKt.getBuiltInParserComponent().d8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
