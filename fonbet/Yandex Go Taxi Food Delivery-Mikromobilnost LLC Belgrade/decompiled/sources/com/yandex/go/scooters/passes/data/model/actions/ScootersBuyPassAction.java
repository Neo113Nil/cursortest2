package com.yandex.go.scooters.passes.data.model.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/actions/ScootersBuyPassAction;", "Lkr;", "Companion", "PassPurchaseType", "$serializer", "com/yandex/go/scooters/passes/data/model/actions/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBuyPassAction extends kr {
    public static final c Companion = new c();
    public static final i3y[] d;
    public final String a;
    public final PassPurchaseType b;
    public final kr c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/actions/ScootersBuyPassAction$PassPurchaseType;", "", "Companion", "com/yandex/go/scooters/passes/data/model/actions/d", "PACKAGE", "SUPERPASS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PassPurchaseType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PassPurchaseType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final PassPurchaseType PACKAGE;
        public static final PassPurchaseType SUPERPASS;

        static {
            PassPurchaseType passPurchaseType = new PassPurchaseType("PACKAGE", 0);
            PACKAGE = passPurchaseType;
            PassPurchaseType passPurchaseType2 = new PassPurchaseType("SUPERPASS", 1);
            SUPERPASS = passPurchaseType2;
            PassPurchaseType[] passPurchaseTypeArr = {passPurchaseType, passPurchaseType2};
            $VALUES = passPurchaseTypeArr;
            $ENTRIES = kotlin.enums.a.a(passPurchaseTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(3));
        }

        public static PassPurchaseType valueOf(String str) {
            return (PassPurchaseType) Enum.valueOf(PassPurchaseType.class, str);
        }

        public static PassPurchaseType[] values() {
            return (PassPurchaseType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new s3n0(1)), kotlin.a.b(lazyThreadSafetyMode, new s3n0(2))};
    }

    public /* synthetic */ ScootersBuyPassAction(int i, String str, PassPurchaseType passPurchaseType, kr krVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ScootersBuyPassAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = passPurchaseType;
        this.c = krVar;
    }
}
