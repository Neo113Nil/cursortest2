package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.m3e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/ContractItem;", "", "Companion", "ContractItemType", "$serializer", "com/yandex/go/taxi/order/models/api/response/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContractItem {
    public static final g0 Companion = new g0();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(13)), null, null};
    public final ContractItemType a;
    public final String b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/ContractItem$ContractItemType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/h0", "CHECK", "COST_STRING", "STRING", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ContractItemType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ContractItemType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ContractItemType CHECK;
        public static final ContractItemType COST_STRING;
        public static final h0 Companion;
        public static final ContractItemType STRING;
        public static final ContractItemType UNKNOWN;

        static {
            ContractItemType contractItemType = new ContractItemType("CHECK", 0);
            CHECK = contractItemType;
            ContractItemType contractItemType2 = new ContractItemType("COST_STRING", 1);
            COST_STRING = contractItemType2;
            ContractItemType contractItemType3 = new ContractItemType("STRING", 2);
            STRING = contractItemType3;
            ContractItemType contractItemType4 = new ContractItemType("UNKNOWN", 3);
            UNKNOWN = contractItemType4;
            ContractItemType[] contractItemTypeArr = {contractItemType, contractItemType2, contractItemType3, contractItemType4};
            $VALUES = contractItemTypeArr;
            $ENTRIES = kotlin.enums.a.a(contractItemTypeArr);
            Companion = new h0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(14));
        }

        public static ContractItemType valueOf(String str) {
            return (ContractItemType) Enum.valueOf(ContractItemType.class, str);
        }

        public static ContractItemType[] values() {
            return (ContractItemType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ContractItem(int i, ContractItemType contractItemType, String str, String str2) {
        this.a = (i & 1) == 0 ? ContractItemType.UNKNOWN : contractItemType;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public ContractItem() {
        this.a = ContractItemType.UNKNOWN;
        this.b = "";
        this.c = "";
    }
}
