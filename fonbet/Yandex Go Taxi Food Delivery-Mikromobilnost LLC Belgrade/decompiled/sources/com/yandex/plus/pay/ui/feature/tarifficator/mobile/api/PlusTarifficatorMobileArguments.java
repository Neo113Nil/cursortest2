package com.yandex.plus.pay.ui.feature.tarifficator.mobile.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010\u0015J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010)¨\u0006C"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "purchaseSessionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;", "analyticsParams", "", "", "externalCallerPayload", "", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$Screen;", "screensToSkip", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;", "preferredMode", "paymentMethodId", "<init>", "(Ljava/util/UUID;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;Ljava/util/Map;Ljava/util/Set;Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component3", "()Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;", "component4", "()Ljava/util/Map;", "component5", "()Ljava/util/Set;", "component6", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;", "component7", "()Ljava/lang/String;", "copy", "(Ljava/util/UUID;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;Ljava/util/Map;Ljava/util/Set;Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;Ljava/lang/String;)Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getPurchaseSessionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;", "getAnalyticsParams", "Ljava/util/Map;", "getExternalCallerPayload", "Ljava/util/Set;", "getScreensToSkip", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;", "getPreferredMode", "Ljava/lang/String;", "getPaymentMethodId", "Screen", "PreferredMode", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTarifficatorMobileArguments implements Parcelable {
    public static final Parcelable.Creator<PlusTarifficatorMobileArguments> CREATOR = new Creator();
    private final PlusPayPaymentAnalyticsParams analyticsParams;
    private final Map<String, String> externalCallerPayload;
    private final PlusPayCompositeOffers.Offer offer;
    private final String paymentMethodId;
    private final PreferredMode preferredMode;
    private final UUID purchaseSessionId;
    private final Set<Screen> screensToSkip;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$PreferredMode;", "", "SILENT", "DEFAULT", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreferredMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreferredMode[] $VALUES;
        public static final PreferredMode DEFAULT;
        public static final PreferredMode SILENT;

        static {
            PreferredMode preferredMode = new PreferredMode("SILENT", 0);
            SILENT = preferredMode;
            PreferredMode preferredMode2 = new PreferredMode("DEFAULT", 1);
            DEFAULT = preferredMode2;
            PreferredMode[] preferredModeArr = {preferredMode, preferredMode2};
            $VALUES = preferredModeArr;
            $ENTRIES = kotlin.enums.a.a(preferredModeArr);
        }

        public static PreferredMode valueOf(String str) {
            return (PreferredMode) Enum.valueOf(PreferredMode.class, str);
        }

        public static PreferredMode[] values() {
            return (PreferredMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/api/PlusTarifficatorMobileArguments$Screen;", "", "UPSALE", "TOPUP", "FAMILY", "CONTACTS", "SUCCESS", "ERROR", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Screen {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen CONTACTS;
        public static final Screen ERROR;
        public static final Screen FAMILY;
        public static final Screen SUCCESS;
        public static final Screen TOPUP;
        public static final Screen UPSALE;

        static {
            Screen screen = new Screen("UPSALE", 0);
            UPSALE = screen;
            Screen screen2 = new Screen("TOPUP", 1);
            TOPUP = screen2;
            Screen screen3 = new Screen("FAMILY", 2);
            FAMILY = screen3;
            Screen screen4 = new Screen("CONTACTS", 3);
            CONTACTS = screen4;
            Screen screen5 = new Screen("SUCCESS", 4);
            SUCCESS = screen5;
            Screen screen6 = new Screen("ERROR", 5);
            ERROR = screen6;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6};
            $VALUES = screenArr;
            $ENTRIES = kotlin.enums.a.a(screenArr);
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusTarifficatorMobileArguments(UUID uuid, PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map<String, String> map, Set<? extends Screen> set, PreferredMode preferredMode, String str) {
        this.purchaseSessionId = uuid;
        this.offer = offer;
        this.analyticsParams = plusPayPaymentAnalyticsParams;
        this.externalCallerPayload = map;
        this.screensToSkip = set;
        this.preferredMode = preferredMode;
        this.paymentMethodId = str;
    }

    public static /* synthetic */ PlusTarifficatorMobileArguments copy$default(PlusTarifficatorMobileArguments plusTarifficatorMobileArguments, UUID uuid, PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map map, Set set, PreferredMode preferredMode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = plusTarifficatorMobileArguments.purchaseSessionId;
        }
        if ((i & 2) != 0) {
            offer = plusTarifficatorMobileArguments.offer;
        }
        if ((i & 4) != 0) {
            plusPayPaymentAnalyticsParams = plusTarifficatorMobileArguments.analyticsParams;
        }
        if ((i & 8) != 0) {
            map = plusTarifficatorMobileArguments.externalCallerPayload;
        }
        if ((i & 16) != 0) {
            set = plusTarifficatorMobileArguments.screensToSkip;
        }
        if ((i & 32) != 0) {
            preferredMode = plusTarifficatorMobileArguments.preferredMode;
        }
        if ((i & 64) != 0) {
            str = plusTarifficatorMobileArguments.paymentMethodId;
        }
        PreferredMode preferredMode2 = preferredMode;
        String str2 = str;
        Set set2 = set;
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams2 = plusPayPaymentAnalyticsParams;
        return plusTarifficatorMobileArguments.copy(uuid, offer, plusPayPaymentAnalyticsParams2, map, set2, preferredMode2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getPurchaseSessionId() {
        return this.purchaseSessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayPaymentAnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    public final Map<String, String> component4() {
        return this.externalCallerPayload;
    }

    public final Set<Screen> component5() {
        return this.screensToSkip;
    }

    /* renamed from: component6, reason: from getter */
    public final PreferredMode getPreferredMode() {
        return this.preferredMode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PlusTarifficatorMobileArguments copy(UUID purchaseSessionId, PlusPayCompositeOffers.Offer offer, PlusPayPaymentAnalyticsParams analyticsParams, Map<String, String> externalCallerPayload, Set<? extends Screen> screensToSkip, PreferredMode preferredMode, String paymentMethodId) {
        return new PlusTarifficatorMobileArguments(purchaseSessionId, offer, analyticsParams, externalCallerPayload, screensToSkip, preferredMode, paymentMethodId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusTarifficatorMobileArguments)) {
            return false;
        }
        PlusTarifficatorMobileArguments plusTarifficatorMobileArguments = (PlusTarifficatorMobileArguments) other;
        return jl40.l(this.purchaseSessionId, plusTarifficatorMobileArguments.purchaseSessionId) && jl40.l(this.offer, plusTarifficatorMobileArguments.offer) && jl40.l(this.analyticsParams, plusTarifficatorMobileArguments.analyticsParams) && jl40.l(this.externalCallerPayload, plusTarifficatorMobileArguments.externalCallerPayload) && jl40.l(this.screensToSkip, plusTarifficatorMobileArguments.screensToSkip) && this.preferredMode == plusTarifficatorMobileArguments.preferredMode && jl40.l(this.paymentMethodId, plusTarifficatorMobileArguments.paymentMethodId);
    }

    public final PlusPayPaymentAnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    public final Map<String, String> getExternalCallerPayload() {
        return this.externalCallerPayload;
    }

    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PreferredMode getPreferredMode() {
        return this.preferredMode;
    }

    public final UUID getPurchaseSessionId() {
        return this.purchaseSessionId;
    }

    public final Set<Screen> getScreensToSkip() {
        return this.screensToSkip;
    }

    public int hashCode() {
        int hashCode = (this.preferredMode.hashCode() + g8e.e(this.screensToSkip, unr0.d((this.analyticsParams.hashCode() + ((this.offer.hashCode() + (this.purchaseSessionId.hashCode() * 31)) * 31)) * 31, 31, this.externalCallerPayload), 31)) * 31;
        String str = this.paymentMethodId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusTarifficatorMobileArguments(purchaseSessionId=");
        sb.append(this.purchaseSessionId);
        sb.append(", offer=");
        sb.append(this.offer);
        sb.append(", analyticsParams=");
        sb.append(this.analyticsParams);
        sb.append(", externalCallerPayload=");
        sb.append(this.externalCallerPayload);
        sb.append(", screensToSkip=");
        sb.append(this.screensToSkip);
        sb.append(", preferredMode=");
        sb.append(this.preferredMode);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.paymentMethodId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.purchaseSessionId);
        dest.writeParcelable(this.offer, flags);
        dest.writeParcelable(this.analyticsParams, flags);
        Iterator x = qv10.x(this.externalCallerPayload, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        Set<Screen> set = this.screensToSkip;
        dest.writeInt(set.size());
        Iterator<Screen> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeString(this.preferredMode.name());
        dest.writeString(this.paymentMethodId);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTarifficatorMobileArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTarifficatorMobileArguments createFromParcel(Parcel parcel) {
            UUID uuid = (UUID) parcel.readSerializable();
            PlusPayCompositeOffers.Offer offer = (PlusPayCompositeOffers.Offer) parcel.readParcelable(PlusTarifficatorMobileArguments.class.getClassLoader());
            PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = (PlusPayPaymentAnalyticsParams) parcel.readParcelable(PlusTarifficatorMobileArguments.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashSet.add(Screen.valueOf(parcel.readString()));
            }
            return new PlusTarifficatorMobileArguments(uuid, offer, plusPayPaymentAnalyticsParams, linkedHashMap, linkedHashSet, PreferredMode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTarifficatorMobileArguments[] newArray(int i) {
            return new PlusTarifficatorMobileArguments[i];
        }
    }
}
