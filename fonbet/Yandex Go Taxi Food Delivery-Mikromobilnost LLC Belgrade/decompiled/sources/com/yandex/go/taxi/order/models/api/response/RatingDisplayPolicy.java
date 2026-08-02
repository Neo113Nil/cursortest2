package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RatingDisplayPolicy;", "", "Companion", "DisplayOnType", "$serializer", "com/yandex/go/taxi/order/models/api/response/s3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatingDisplayPolicy {
    public static final s3 Companion = new s3();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(7))};
    public final jsq0 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RatingDisplayPolicy$DisplayOnType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/t3", "MULTIORDER", "DETAILS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DisplayOnType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayOnType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final t3 Companion;
        public static final DisplayOnType DETAILS;
        public static final DisplayOnType MULTIORDER;

        static {
            DisplayOnType displayOnType = new DisplayOnType("MULTIORDER", 0);
            MULTIORDER = displayOnType;
            DisplayOnType displayOnType2 = new DisplayOnType("DETAILS", 1);
            DETAILS = displayOnType2;
            DisplayOnType[] displayOnTypeArr = {displayOnType, displayOnType2};
            $VALUES = displayOnTypeArr;
            $ENTRIES = kotlin.enums.a.a(displayOnTypeArr);
            Companion = new t3();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(8));
        }

        public static DisplayOnType valueOf(String str) {
            return (DisplayOnType) Enum.valueOf(DisplayOnType.class, str);
        }

        public static DisplayOnType[] values() {
            return (DisplayOnType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RatingDisplayPolicy(int i, jsq0 jsq0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = jsq0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final jsq0 getA() {
        return this.a;
    }

    public RatingDisplayPolicy() {
        this.a = null;
    }
}
