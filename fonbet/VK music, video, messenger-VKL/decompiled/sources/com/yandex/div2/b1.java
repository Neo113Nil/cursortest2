package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.c1;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivAppearanceSetTransition.kt */
/* loaded from: classes8.dex */
public final class b1 implements JSONSerializable, Hashable {
    public final List<e1> a;
    public Integer b;
    public Integer c;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(List<? extends e1> list) {
        this.a = list;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator<T> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((e1) it.next()).hash();
        }
        int i2 = propertiesHash + i;
        this.c = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int propertiesHash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(b1.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((c1.a) BuiltInParserKt.getBuiltInParserComponent().w1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
