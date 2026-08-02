package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.entities.theme.Theme;
import defpackage.nzs;
import defpackage.tn0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002>?B¥\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b*\u0010#R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b.\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b/\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b0\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b1\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b8\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b<\u0010#¨\u0006@"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/AdditionalSettings;", "Landroid/os/Parcelable;", "", "currency", "", "enableDebranding", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/IntegrationInfo;", "integrationInfo", "integrationProfileId", "", "params", "partition", "paymentTo", "pos", "redirectURLForSbpTokenBinding", "", "regionId", "showFailureScreen", "showSuccessScreen", "spanId", "Lcom/yandex/fintechsdk/entities/theme/Theme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/yandex/fintechsdk/flows/payment/kit/api/model/IntegrationInfo;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Lcom/yandex/fintechsdk/entities/theme/Theme;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnableDebranding", "()Ljava/lang/Boolean;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/IntegrationInfo;", "getIntegrationInfo", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/IntegrationInfo;", "getIntegrationProfileId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getPartition", "getPaymentTo", "getPos", "getRedirectURLForSbpTokenBinding", CA20Status.STATUS_USER_I, "getRegionId", "Z", "getShowFailureScreen", "()Z", "getShowSuccessScreen", "getSpanId", "Lcom/yandex/fintechsdk/entities/theme/Theme;", "getTheme", "()Lcom/yandex/fintechsdk/entities/theme/Theme;", "getTraceId", "Companion", "a", "tn0", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdditionalSettings implements Parcelable {
    private final String currency;
    private final Boolean enableDebranding;
    private final IntegrationInfo integrationInfo;
    private final String integrationProfileId;
    private final Map<String, String> params;
    private final String partition;
    private final String paymentTo;
    private final String pos;
    private final String redirectURLForSbpTokenBinding;
    private final int regionId;
    private final boolean showFailureScreen;
    private final boolean showSuccessScreen;
    private final String spanId;
    private final Theme theme;
    private final String traceId;
    public static final tn0 Companion = new tn0();
    public static final Parcelable.Creator<AdditionalSettings> CREATOR = new Creator();

    /* renamed from: default, reason: not valid java name */
    private static final AdditionalSettings f2default = new a().a();

    public static final class a {
        public Boolean a;
        public Theme b;

        public final AdditionalSettings a() {
            return new AdditionalSettings(null, this.a, null, null, null, null, null, null, null, 225, true, true, null, this.b, null);
        }

        public final void b(Theme theme) {
            this.b = theme;
        }
    }

    public AdditionalSettings(String str, Boolean bool, IntegrationInfo integrationInfo, String str2, Map<String, String> map, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, String str7, Theme theme, String str8) {
        this.currency = str;
        this.enableDebranding = bool;
        this.integrationInfo = integrationInfo;
        this.integrationProfileId = str2;
        this.params = map;
        this.partition = str3;
        this.paymentTo = str4;
        this.pos = str5;
        this.redirectURLForSbpTokenBinding = str6;
        this.regionId = i;
        this.showFailureScreen = z;
        this.showSuccessScreen = z2;
        this.spanId = str7;
        this.theme = theme;
        this.traceId = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Boolean getEnableDebranding() {
        return this.enableDebranding;
    }

    public final IntegrationInfo getIntegrationInfo() {
        return this.integrationInfo;
    }

    public final String getIntegrationProfileId() {
        return this.integrationProfileId;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getPartition() {
        return this.partition;
    }

    public final String getPaymentTo() {
        return this.paymentTo;
    }

    public final String getPos() {
        return this.pos;
    }

    public final String getRedirectURLForSbpTokenBinding() {
        return this.redirectURLForSbpTokenBinding;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final boolean getShowFailureScreen() {
        return this.showFailureScreen;
    }

    public final boolean getShowSuccessScreen() {
        return this.showSuccessScreen;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currency);
        Boolean bool = this.enableDebranding;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        IntegrationInfo integrationInfo = this.integrationInfo;
        if (integrationInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            integrationInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.integrationProfileId);
        Map<String, String> map = this.params;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeString(this.partition);
        dest.writeString(this.paymentTo);
        dest.writeString(this.pos);
        dest.writeString(this.redirectURLForSbpTokenBinding);
        dest.writeInt(this.regionId);
        dest.writeInt(this.showFailureScreen ? 1 : 0);
        dest.writeInt(this.showSuccessScreen ? 1 : 0);
        dest.writeString(this.spanId);
        Theme theme = this.theme;
        if (theme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(theme.name());
        }
        dest.writeString(this.traceId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettings createFromParcel(Parcel parcel) {
            Boolean valueOf;
            LinkedHashMap linkedHashMap;
            boolean z;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            IntegrationInfo createFromParcel = parcel.readInt() == 0 ? null : IntegrationInfo.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z2 = false;
            String readString5 = parcel.readString();
            Theme theme = null;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                theme = Theme.valueOf(parcel.readString());
            }
            return new AdditionalSettings(readString, valueOf, createFromParcel, readString2, linkedHashMap2, readString3, readString4, readString5, readString6, readInt2, z2, z, readString7, theme, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettings[] newArray(int i) {
            return new AdditionalSettings[i];
        }
    }
}
