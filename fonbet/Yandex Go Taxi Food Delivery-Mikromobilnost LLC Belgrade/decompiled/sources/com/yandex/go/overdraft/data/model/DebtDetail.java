package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.rsf;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtDetail;", "", "Companion", "Type", "$serializer", "com/yandex/go/overdraft/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtDetail {
    public static final i Companion = new i();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(12))};
    public final double a;
    public final String b;
    public final Type c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtDetail$Type;", "", "Companion", "com/yandex/go/overdraft/data/model/j", "RIDE", "TIPS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final j Companion;
        public static final Type RIDE;
        public static final Type TIPS;

        static {
            Type type = new Type("RIDE", 0);
            RIDE = type;
            Type type2 = new Type("TIPS", 1);
            TIPS = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new j();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(13));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DebtDetail(int i, double d2, String str, Type type) {
        this.a = (i & 1) == 0 ? 0.0d : d2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = type;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtDetail)) {
            return false;
        }
        DebtDetail debtDetail = (DebtDetail) obj;
        return Double.compare(this.a, debtDetail.a) == 0 && jl40.l(this.b, debtDetail.b) && this.c == debtDetail.c;
    }

    public final int hashCode() {
        int b = unr0.b(Double.hashCode(this.a) * 31, 31, this.b);
        Type type = this.c;
        return b + (type == null ? 0 : type.hashCode());
    }

    public final String toString() {
        return "DebtDetail(cost=" + this.a + ", costAsString=" + this.b + ", type=" + this.c + Extension.C_BRAKE;
    }

    public DebtDetail() {
        this.a = 0.0d;
        this.b = "";
        this.c = null;
    }
}
