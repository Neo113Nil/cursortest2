package com.yandex.go.transfer_requirement.transferapi;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qje;
import defpackage.tc01;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;", "", "Companion", "PointA", "TransferType", "$serializer", "com/yandex/go/transfer_requirement/transferapi/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferParam {
    public static final d Companion = new d();
    public static final i3y[] l;
    public final TransferType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Integer i;
    public final PointA j;
    public final List k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferParam$TransferType;", "", "Companion", "com/yandex/go/transfer_requirement/transferapi/f", "AVIA", "TRAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TransferType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransferType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TransferType AVIA;
        public static final f Companion;
        public static final TransferType TRAIN;

        static {
            TransferType transferType = new TransferType("AVIA", 0);
            AVIA = transferType;
            TransferType transferType2 = new TransferType("TRAIN", 1);
            TRAIN = transferType2;
            TransferType[] transferTypeArr = {transferType, transferType2};
            $VALUES = transferTypeArr;
            $ENTRIES = kotlin.enums.a.a(transferTypeArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(14));
        }

        public static TransferType valueOf(String str) {
            return (TransferType) Enum.valueOf(TransferType.class, str);
        }

        public static TransferType[] values() {
            return (TransferType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new tc01(12)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tc01(13))};
    }

    public /* synthetic */ TransferParam(int i, TransferType transferType, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Integer num, PointA pointA, List list) {
        if (1767 != (i & 1767)) {
            qje.Z(i, 1767, TransferParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = transferType;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        this.f = str5;
        this.g = str6;
        this.h = z;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        this.j = pointA;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParam)) {
            return false;
        }
        TransferParam transferParam = (TransferParam) obj;
        return this.a == transferParam.a && jl40.l(this.b, transferParam.b) && jl40.l(this.c, transferParam.c) && jl40.l(this.d, transferParam.d) && jl40.l(this.e, transferParam.e) && jl40.l(this.f, transferParam.f) && jl40.l(this.g, transferParam.g) && this.h == transferParam.h && jl40.l(this.i, transferParam.i) && jl40.l(this.j, transferParam.j) && jl40.l(this.k, transferParam.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int e = unr0.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h);
        Integer num = this.i;
        int hashCode4 = (e + (num == null ? 0 : num.hashCode())) * 31;
        PointA pointA = this.j;
        return this.k.hashCode() + ((hashCode4 + (pointA != null ? pointA.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferParam(transferType=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", date=");
        g8e.D(sb, this.c, ", time=", this.d, ", trainCarriageNumber=");
        g8e.D(sb, this.e, ", greeting=", this.f, ", tz=");
        tse0.y(this.g, ", withSign=", ", luggageCount=", sb, this.h);
        sb.append(this.i);
        sb.append(", pointA=");
        sb.append(this.j);
        sb.append(", tariffClass=");
        return ly3.s(sb, this.k, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferParam$PointA;", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/transferapi/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PointA {
        public static final e Companion = new e();
        public final double a;
        public final double b;
        public final String c;

        public /* synthetic */ PointA(double d, double d2, int i, String str) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, TransferParam$PointA$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = d;
            this.b = d2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointA)) {
                return false;
            }
            PointA pointA = (PointA) obj;
            return Double.compare(this.a, pointA.a) == 0 && Double.compare(this.b, pointA.b) == 0 && jl40.l(this.c, pointA.c);
        }

        public final int hashCode() {
            int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder u = oyr.u(this.a, "PointA(lat=", ", lon=");
            u.append(this.b);
            u.append(", log=");
            u.append(this.c);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }

        public PointA(String str, double d, double d2) {
            this.a = d;
            this.b = d2;
            this.c = str;
        }
    }

    public TransferParam(TransferType transferType, String str, String str2, String str3, String str4, String str5, String str6, Integer num, PointA pointA, List list) {
        this.a = transferType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = true;
        this.i = num;
        this.j = pointA;
        this.k = list;
    }
}
