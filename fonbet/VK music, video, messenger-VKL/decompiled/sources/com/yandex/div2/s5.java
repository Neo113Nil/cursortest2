package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.kkn;
import xsna.qmn;
import xsna.znn;

/* compiled from: DivInputMask.kt */
/* loaded from: classes8.dex */
public abstract class s5 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivInputMask.kt */
    public static final class a extends s5 {
        public final kkn b;

        public a(kkn kknVar) {
            this.b = kknVar;
        }
    }

    /* compiled from: DivInputMask.kt */
    public static final class b extends s5 {
        public final m4 b;

        public b(m4 m4Var) {
            this.b = m4Var;
        }
    }

    /* compiled from: DivInputMask.kt */
    public static final class c extends s5 {
        public final znn b;

        public c(znn znnVar) {
            this.b = znnVar;
        }
    }

    public final qmn a() {
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof c) {
            return ((c) this).b;
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
        } else if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((c) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((t5) BuiltInParserKt.getBuiltInParserComponent().s4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
