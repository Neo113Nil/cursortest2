package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivIndicatorItemPlacement.kt */
/* loaded from: classes8.dex */
public abstract class k5 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class a extends k5 {
        public final p3 b;

        public a(p3 p3Var) {
            this.b = p3Var;
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class b extends k5 {
        public final sa b;

        public b(sa saVar) {
            this.b = saVar;
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
        return ((l5) BuiltInParserKt.getBuiltInParserComponent().a4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
