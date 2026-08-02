package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.s7;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivPatch.kt */
/* loaded from: classes8.dex */
public final class DivPatch implements JSONSerializable, Hashable {
    public final List<a> a;
    public final Expression<Mode> b;
    public final List<DivAction> c;
    public final List<DivAction> d;
    public Integer e;

    /* compiled from: DivPatch.kt */
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Mode, String> TO_STRING = b.i;
        public static final izs<String, Mode> FROM_STRING = a.i;

        /* compiled from: DivPatch.kt */
        public static final class a extends Lambda implements izs<String, Mode> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Mode invoke(String str) {
                String str2 = str;
                Mode.Converter.getClass();
                Mode mode = Mode.TRANSACTIONAL;
                if (epx.f(str2, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.PARTIAL;
                if (epx.f(str2, mode2.value)) {
                    return mode2;
                }
                return null;
            }
        }

        /* compiled from: DivPatch.kt */
        public static final class b extends Lambda implements izs<Mode, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Mode mode) {
                Mode.Converter.getClass();
                return mode.value;
            }
        }

        /* compiled from: DivPatch.kt */
        public static final class c {
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivPatch.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final String a;
        public final List<com.yandex.div2.a> b;
        public Integer c;
        public Integer d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends com.yandex.div2.a> list) {
            this.a = str;
            this.b = list;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int propertiesHash = propertiesHash();
            int i = 0;
            List<com.yandex.div2.a> list = this.b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    i += ((com.yandex.div2.a) it.next()).hash();
                }
            }
            int i2 = propertiesHash + i;
            this.d = Integer.valueOf(i2);
            return i2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int propertiesHash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.a.hashCode() + fpf0.a(a.class).hashCode();
            this.c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            p7 p7Var = (p7) BuiltInParserKt.getBuiltInParserComponent().E5.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            p7Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(builtInParsingContext, jSONObject, "id", this.a);
            JsonPropertyParser.writeList(builtInParsingContext, jSONObject, "items", this.b, p7Var.a.z9);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Mode.PARTIAL, null, 2, null);
    }

    public DivPatch(Expression expression, List list, List list2, List list3) {
        this.a = list;
        this.b = expression;
        this.c = list2;
        this.d = list3;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivPatch.class).hashCode();
        Iterator<T> it = this.a.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((a) it.next()).hash();
        }
        int hashCode2 = this.b.hashCode() + hashCode + i3;
        List<DivAction> list = this.c;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((DivAction) it2.next()).hash();
            }
        } else {
            i = 0;
        }
        int i4 = hashCode2 + i;
        List<DivAction> list2 = this.d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                i2 += ((DivAction) it3.next()).hash();
            }
        }
        int i5 = i4 + i2;
        this.e = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((s7.b) BuiltInParserKt.getBuiltInParserComponent().C5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
