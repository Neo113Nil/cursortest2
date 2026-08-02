package com.ybsdk.feature.divkit.internal.domain.hmac;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import io.appmetrica.analytics.impl.C0689ro;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;", "", "specs", "", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Spec;", "<init>", "(Ljava/util/List;)V", "getSpecs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Spec", "Item", "KeyType", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HmacData {
    private final List<Spec> specs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "", "<init>", "(Ljava/lang/String;I)V", C0689ro.f, "UNKNOWN", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeyType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ KeyType[] $VALUES;
        public static final KeyType SESSION_ID = new KeyType(C0689ro.f, 0);
        public static final KeyType UNKNOWN = new KeyType("UNKNOWN", 1);

        private static final /* synthetic */ KeyType[] $values() {
            return new KeyType[]{SESSION_ID, UNKNOWN};
        }

        static {
            KeyType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private KeyType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static KeyType valueOf(String str) {
            return (KeyType) Enum.valueOf(KeyType.class, str);
        }

        public static KeyType[] values() {
            return (KeyType[]) $VALUES.clone();
        }
    }

    public HmacData(@Json(name = "specs") List<Spec> list) {
        this.specs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmacData copy$default(HmacData hmacData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hmacData.specs;
        }
        return hmacData.copy(list);
    }

    public final List<Spec> component1() {
        return this.specs;
    }

    public final HmacData copy(@Json(name = "specs") List<Spec> specs) {
        return new HmacData(specs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HmacData) && jl40.l(this.specs, ((HmacData) other).specs);
    }

    public final List<Spec> getSpecs() {
        return this.specs;
    }

    public int hashCode() {
        return this.specs.hashCode();
    }

    public String toString() {
        return tse0.k("HmacData(specs=", Extension.C_BRAKE, this.specs);
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item;", "", "type", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item$Type;", "value", "", "<init>", "(Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item$Type;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item$Type;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        private final Type type;
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item$Type;", "", "<init>", "(Ljava/lang/String;I)V", "VALUE", "IDEMPOTENCY_TOKEN", "UNKNOWN", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type VALUE = new Type("VALUE", 0);
            public static final Type IDEMPOTENCY_TOKEN = new Type("IDEMPOTENCY_TOKEN", 1);
            public static final Type UNKNOWN = new Type("UNKNOWN", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{VALUE, IDEMPOTENCY_TOKEN, UNKNOWN};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private Type(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Item(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ Item copy$default(Item item, Type type, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                type = item.type;
            }
            if ((i & 2) != 0) {
                str = item.value;
            }
            return item.copy(type, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Item copy(@Json(name = "type") Type type, @Json(name = "value") String value) {
            return new Item(type, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.type == item.type && jl40.l(this.value, item.value);
        }

        public final Type getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.value;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Item(type=" + this.type + ", value=" + this.value + Extension.C_BRAKE;
        }

        public Item(@Json(name = "type") Type type, @Json(name = "value") String str) {
            this.type = type;
            this.value = str;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Spec;", "", "placeholder", "", "items", "", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$Item;", "keyType", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;)V", "getPlaceholder", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getKeyType", "()Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Spec {
        private final List<Item> items;
        private final KeyType keyType;
        private final String placeholder;

        public Spec(@Json(name = "placeholder") String str, @Json(name = "items") List<Item> list, @Json(name = "key_type") KeyType keyType) {
            this.placeholder = str;
            this.items = list;
            this.keyType = keyType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Spec copy$default(Spec spec, String str, List list, KeyType keyType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spec.placeholder;
            }
            if ((i & 2) != 0) {
                list = spec.items;
            }
            if ((i & 4) != 0) {
                keyType = spec.keyType;
            }
            return spec.copy(str, list, keyType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final List<Item> component2() {
            return this.items;
        }

        /* renamed from: component3, reason: from getter */
        public final KeyType getKeyType() {
            return this.keyType;
        }

        public final Spec copy(@Json(name = "placeholder") String placeholder, @Json(name = "items") List<Item> items, @Json(name = "key_type") KeyType keyType) {
            return new Spec(placeholder, items, keyType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spec)) {
                return false;
            }
            Spec spec = (Spec) other;
            return jl40.l(this.placeholder, spec.placeholder) && jl40.l(this.items, spec.items) && this.keyType == spec.keyType;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final KeyType getKeyType() {
            return this.keyType;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.keyType.hashCode() + unr0.c(this.placeholder.hashCode() * 31, 31, this.items);
        }

        public String toString() {
            String str = this.placeholder;
            List<Item> list = this.items;
            KeyType keyType = this.keyType;
            StringBuilder r = xvz.r("Spec(placeholder=", str, ", items=", list, ", keyType=");
            r.append(keyType);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public /* synthetic */ Spec(String str, List list, KeyType keyType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? KeyType.SESSION_ID : keyType);
        }
    }
}
