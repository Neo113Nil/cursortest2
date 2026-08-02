package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.lpn;
import xsna.qpn;

/* compiled from: DivStrokeStyle.kt */
/* loaded from: classes8.dex */
public abstract class xa implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivStrokeStyle.kt */
    public static final class a extends xa {
        public final lpn b;

        public a(lpn lpnVar) {
            this.b = lpnVar;
        }
    }

    /* compiled from: DivStrokeStyle.kt */
    public static final class b extends xa {
        public final qpn b;

        public b(qpn qpnVar) {
            this.b = qpnVar;
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
        return ((ya) BuiltInParserKt.getBuiltInParserComponent().F7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
