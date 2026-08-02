package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.y6y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiRouteInputAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "AdditionalAction", "AdditionalActionType", "$serializer", "com/yandex/go/flex/common/api/actions/u0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaxiRouteInputAction extends n {
    public static final u0 Companion = new u0();
    public final String b;
    public final String c;
    public final AdditionalAction d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiRouteInputAction$AdditionalActionType;", "", "PREORDER", "ORDER_TO_ANOTHER", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class AdditionalActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AdditionalActionType[] $VALUES;
        public static final AdditionalActionType NONE;
        public static final AdditionalActionType ORDER_TO_ANOTHER;
        public static final AdditionalActionType PREORDER;

        static {
            AdditionalActionType additionalActionType = new AdditionalActionType("PREORDER", 0);
            PREORDER = additionalActionType;
            AdditionalActionType additionalActionType2 = new AdditionalActionType("ORDER_TO_ANOTHER", 1);
            ORDER_TO_ANOTHER = additionalActionType2;
            AdditionalActionType additionalActionType3 = new AdditionalActionType(JCP.RAW_PREFIX, 2);
            NONE = additionalActionType3;
            AdditionalActionType[] additionalActionTypeArr = {additionalActionType, additionalActionType2, additionalActionType3};
            $VALUES = additionalActionTypeArr;
            $ENTRIES = kotlin.enums.a.a(additionalActionTypeArr);
        }

        public static AdditionalActionType valueOf(String str) {
            return (AdditionalActionType) Enum.valueOf(AdditionalActionType.class, str);
        }

        public static AdditionalActionType[] values() {
            return (AdditionalActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TaxiRouteInputAction(int i, String str, String str2, AdditionalAction additionalAction) {
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = new AdditionalAction(AdditionalActionType.NONE);
        } else {
            this.d = additionalAction;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiRouteInputAction)) {
            return false;
        }
        TaxiRouteInputAction taxiRouteInputAction = (TaxiRouteInputAction) obj;
        return jl40.l(this.b, taxiRouteInputAction.b) && jl40.l(this.c, taxiRouteInputAction.c) && jl40.l(this.d, taxiRouteInputAction.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("TaxiRouteInputAction(suggestMode=", this.b, ", tariffClass=", this.c, ", additionalAction=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/TaxiRouteInputAction$AdditionalAction;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/t0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class AdditionalAction {
        public static final t0 Companion = new t0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(3))};
        public final AdditionalActionType a;

        public /* synthetic */ AdditionalAction(int i, AdditionalActionType additionalActionType) {
            if ((i & 1) == 0) {
                this.a = AdditionalActionType.NONE;
            } else {
                this.a = additionalActionType;
            }
        }

        /* renamed from: a, reason: from getter */
        public final AdditionalActionType getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdditionalAction) && this.a == ((AdditionalAction) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AdditionalAction(additionalActionType=" + this.a + Extension.C_BRAKE;
        }

        public AdditionalAction(AdditionalActionType additionalActionType) {
            this.a = additionalActionType;
        }

        public AdditionalAction() {
            this(AdditionalActionType.NONE);
        }
    }

    public TaxiRouteInputAction() {
        AdditionalAction additionalAction = new AdditionalAction(AdditionalActionType.NONE);
        this.b = "";
        this.c = "";
        this.d = additionalAction;
    }
}
