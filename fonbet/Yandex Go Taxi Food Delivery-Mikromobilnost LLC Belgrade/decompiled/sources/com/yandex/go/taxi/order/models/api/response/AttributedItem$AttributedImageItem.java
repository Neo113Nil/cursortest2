package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.p73;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/AttributedItem$AttributedImageItem", "Lcom/yandex/go/taxi/order/models/api/response/o;", "Companion", "AlignmentType", "$serializer", "com/yandex/go/taxi/order/models/api/response/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AttributedItem$AttributedImageItem extends o {
    public static final j Companion = new j();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(7)), null};
    public final String a;
    public final int b;
    public final AlignmentType c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/AttributedItem$AttributedImageItem$AlignmentType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/i", "UNKNOWN", "BASELINE", "CENTER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AlignmentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AlignmentType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final AlignmentType BASELINE;
        public static final AlignmentType CENTER;
        public static final i Companion;
        public static final AlignmentType UNKNOWN;

        static {
            AlignmentType alignmentType = new AlignmentType("UNKNOWN", 0);
            UNKNOWN = alignmentType;
            AlignmentType alignmentType2 = new AlignmentType("BASELINE", 1);
            BASELINE = alignmentType2;
            AlignmentType alignmentType3 = new AlignmentType("CENTER", 2);
            CENTER = alignmentType3;
            AlignmentType[] alignmentTypeArr = {alignmentType, alignmentType2, alignmentType3};
            $VALUES = alignmentTypeArr;
            $ENTRIES = kotlin.enums.a.a(alignmentTypeArr);
            Companion = new i();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(8));
        }

        public static AlignmentType valueOf(String str) {
            return (AlignmentType) Enum.valueOf(AlignmentType.class, str);
        }

        public static AlignmentType[] values() {
            return (AlignmentType[]) $VALUES.clone();
        }
    }

    public AttributedItem$AttributedImageItem(int i, String str, int i2, AlignmentType alignmentType, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = AlignmentType.UNKNOWN;
        } else {
            this.c = alignmentType;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributedItem$AttributedImageItem)) {
            return false;
        }
        AttributedItem$AttributedImageItem attributedItem$AttributedImageItem = (AttributedItem$AttributedImageItem) obj;
        return jl40.l(this.a, attributedItem$AttributedImageItem.a) && this.b == attributedItem$AttributedImageItem.b && this.c == attributedItem$AttributedImageItem.c && jl40.l(this.d, attributedItem$AttributedImageItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "AttributedImageItem(imageTag=", this.a, ", width=", ", verticalAlignment=");
        u.append(this.c);
        u.append(", color=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public AttributedItem$AttributedImageItem() {
        AlignmentType alignmentType = AlignmentType.UNKNOWN;
        this.a = "";
        this.b = 0;
        this.c = alignmentType;
        this.d = "";
    }
}
