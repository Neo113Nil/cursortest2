package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto;", "", "Companion", "Action", "PurchaseParamsDto", "$serializer", "com/yandex/go/chargers/data/model/r", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferButtonDto {
    public static final r Companion = new r();
    public static final i3y[] h = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(16)), null, null};
    public final FormattedText a;
    public final FormattedText b;
    public final Boolean c;
    public final kotlinx.serialization.json.b d;
    public final Action e;
    public final String f;
    public final PurchaseParamsDto g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto$Action;", "", "Companion", "com/yandex/go/chargers/data/model/q", "CREATE_ORDER", "RETURN_CHARGER", "BUY_SHARING_SUBSCRIPTION_THEN_CREATE_ORDER", "BUY_PLUS_DVIZH_SUBSCRIPTION_THEN_CREATE_ORDER", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Action BUY_PLUS_DVIZH_SUBSCRIPTION_THEN_CREATE_ORDER;
        public static final Action BUY_SHARING_SUBSCRIPTION_THEN_CREATE_ORDER;
        public static final Action CREATE_ORDER;
        public static final q Companion;
        public static final Action RETURN_CHARGER;

        static {
            Action action = new Action("CREATE_ORDER", 0);
            CREATE_ORDER = action;
            Action action2 = new Action("RETURN_CHARGER", 1);
            RETURN_CHARGER = action2;
            Action action3 = new Action("BUY_SHARING_SUBSCRIPTION_THEN_CREATE_ORDER", 2);
            BUY_SHARING_SUBSCRIPTION_THEN_CREATE_ORDER = action3;
            Action action4 = new Action("BUY_PLUS_DVIZH_SUBSCRIPTION_THEN_CREATE_ORDER", 3);
            BUY_PLUS_DVIZH_SUBSCRIPTION_THEN_CREATE_ORDER = action4;
            Action[] actionArr = {action, action2, action3, action4};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(17));
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersOfferButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, Boolean bool, kotlinx.serialization.json.b bVar, Action action, String str, PurchaseParamsDto purchaseParamsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = action;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = purchaseParamsDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto$PurchaseParamsDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/data/model/s", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PurchaseParamsDto {
        public static final s Companion = new s();
        public final kotlinx.serialization.json.b a;
        public final String b;

        public /* synthetic */ PurchaseParamsDto(int i, String str, kotlinx.serialization.json.b bVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public PurchaseParamsDto() {
            this.a = null;
            this.b = null;
        }
    }

    public ChargersOfferButtonDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
