package com.yandex.div.data;

import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.ojp0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: StoredValue.kt */
/* loaded from: classes7.dex */
public abstract class StoredValue {

    /* compiled from: StoredValue.kt */
    public static final class ArrayStoredValue extends StoredValue {
        private final String name;
        private final JSONArray value;

        public ArrayStoredValue(String str, JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.value = jSONArray;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) obj;
            return epx.f(this.name, arrayStoredValue.name) && epx.f(this.value, arrayStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final JSONArray getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class BooleanStoredValue extends StoredValue {
        private final String name;
        private final boolean value;

        public BooleanStoredValue(String str, boolean z) {
            super(null);
            this.name = str;
            this.value = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) obj;
            return epx.f(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            boolean z = this.value;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BooleanStoredValue(name=");
            sb.append(this.name);
            sb.append(", value=");
            return q0.a(sb, this.value, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class ColorStoredValue extends StoredValue {
        private final String name;
        private final int value;

        public /* synthetic */ ColorStoredValue(String str, int i, zcl zclVar) {
            this(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) obj;
            return epx.f(this.name, colorStoredValue.name) && Color.m187equalsimpl0(this.value, colorStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        /* renamed from: getValue-WpymAT4, reason: not valid java name */
        public final int m135getValueWpymAT4() {
            return this.value;
        }

        public int hashCode() {
            return Color.m189hashCodeimpl(this.value) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m191toStringimpl(this.value)) + ')';
        }

        private ColorStoredValue(String str, int i) {
            super(null);
            this.name = str;
            this.value = i;
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class DictStoredValue extends StoredValue {
        private final String name;
        private final JSONObject value;

        public DictStoredValue(String str, JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.value = jSONObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) obj;
            return epx.f(this.name, dictStoredValue.name) && epx.f(this.value, dictStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final JSONObject getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class DoubleStoredValue extends StoredValue {
        private final String name;
        private final double value;

        public DoubleStoredValue(String str, double d) {
            super(null);
            this.name = str;
            this.value = d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) obj;
            return epx.f(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value) + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DoubleStoredValue(name=");
            sb.append(this.name);
            sb.append(", value=");
            return ojp0.a(sb, this.value, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class IntegerStoredValue extends StoredValue {
        private final String name;
        private final long value;

        public IntegerStoredValue(String str, long j) {
            super(null);
            this.name = str;
            this.value = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) obj;
            return epx.f(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return Long.hashCode(this.value) + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("IntegerStoredValue(name=");
            sb.append(this.name);
            sb.append(", value=");
            return vu5.a(')', this.value, sb);
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class StringStoredValue extends StoredValue {
        private final String name;
        private final String value;

        public StringStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) obj;
            return epx.f(this.name, stringStoredValue.name) && epx.f(this.value, stringStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StringStoredValue(name=");
            sb.append(this.name);
            sb.append(", value=");
            return ho8.a(sb, this.value, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    public enum Type {
        STRING("string"),
        INTEGER("integer"),
        BOOLEAN("boolean"),
        NUMBER("number"),
        COLOR("color"),
        URL("url"),
        ARRAY("array"),
        DICT("dict");

        public static final Converter Converter = new Converter(null);
        private final String value;

        /* compiled from: StoredValue.kt */
        public static final class Converter {
            public /* synthetic */ Converter(zcl zclVar) {
                this();
            }

            public final Type fromString(String str) {
                Type type = Type.STRING;
                if (epx.f(str, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (epx.f(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (epx.f(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (epx.f(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (epx.f(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (epx.f(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (epx.f(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (epx.f(str, type8.value)) {
                    return type8;
                }
                return null;
            }

            public final String toString(Type type) {
                return type.value;
            }

            private Converter() {
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class UrlStoredValue extends StoredValue {
        private final String name;
        private final String value;

        public /* synthetic */ UrlStoredValue(String str, String str2, zcl zclVar) {
            this(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) obj;
            return epx.f(this.name, urlStoredValue.name) && Url.m198equalsimpl0(this.value, urlStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        public String getName() {
            return this.name;
        }

        /* renamed from: getValue-OXPJC6E, reason: not valid java name */
        public final String m136getValueOXPJC6E() {
            return this.value;
        }

        public int hashCode() {
            return Url.m199hashCodeimpl(this.value) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m200toStringimpl(this.value)) + ')';
        }

        private UrlStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }
    }

    public /* synthetic */ StoredValue(zcl zclVar) {
        this();
    }

    public abstract String getName();

    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m184boximpl(((ColorStoredValue) this).m135getValueWpymAT4());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m195boximpl(((UrlStoredValue) this).m136getValueOXPJC6E());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    private StoredValue() {
    }
}
