package com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSetupAction;
import defpackage.x4e;
import defpackage.xvz;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b/\u0010#R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/state/AutoTopupSetupV2ScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "autoTopupId", "agreementId", "Ljava/math/BigDecimal;", "amount", "threshold", "source", "Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "autoTopupShowOnly", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSetupAction;", "setupAction", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSettingType;", "setupSetting", "limit", "", "additionalParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSetupAction;Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSettingType;Ljava/math/BigDecimal;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getAutoTopupId", "()Ljava/lang/String;", "getAgreementId", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "getThreshold", "getSource", "Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "getAutoTopupShowOnly", "()Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSetupAction;", "getSetupAction", "()Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSetupAction;", "Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSettingType;", "getSetupSetting", "()Lcom/ybsdk/feature/deeplink/api/actions/AutoTopupSettingType;", "getLimit", "Ljava/util/Map;", "getAdditionalParams", "()Ljava/util/Map;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSetupV2ScreenParams implements ScreenParams {
    public static final Parcelable.Creator<AutoTopupSetupV2ScreenParams> CREATOR = new Creator();
    private final Map<String, String> additionalParams;
    private final String agreementId;
    private final BigDecimal amount;
    private final String autoTopupId;
    private final AutoTopupShowOnly autoTopupShowOnly;
    private final BigDecimal limit;
    private final AutoTopupSetupAction setupAction;
    private final AutoTopupSettingType setupSetting;
    private final String source;
    private final BigDecimal threshold;

    public AutoTopupSetupV2ScreenParams(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, AutoTopupShowOnly autoTopupShowOnly, AutoTopupSetupAction autoTopupSetupAction, AutoTopupSettingType autoTopupSettingType, BigDecimal bigDecimal3, Map<String, String> map) {
        this.autoTopupId = str;
        this.agreementId = str2;
        this.amount = bigDecimal;
        this.threshold = bigDecimal2;
        this.source = str3;
        this.autoTopupShowOnly = autoTopupShowOnly;
        this.setupAction = autoTopupSetupAction;
        this.setupSetting = autoTopupSettingType;
        this.limit = bigDecimal3;
        this.additionalParams = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final AutoTopupShowOnly getAutoTopupShowOnly() {
        return this.autoTopupShowOnly;
    }

    public final BigDecimal getLimit() {
        return this.limit;
    }

    public final AutoTopupSetupAction getSetupAction() {
        return this.setupAction;
    }

    public final AutoTopupSettingType getSetupSetting() {
        return this.setupSetting;
    }

    public final String getSource() {
        return this.source;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.autoTopupId);
        dest.writeString(this.agreementId);
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.threshold);
        dest.writeString(this.source);
        AutoTopupShowOnly autoTopupShowOnly = this.autoTopupShowOnly;
        if (autoTopupShowOnly == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(autoTopupShowOnly.name());
        }
        AutoTopupSetupAction autoTopupSetupAction = this.setupAction;
        if (autoTopupSetupAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(autoTopupSetupAction.name());
        }
        AutoTopupSettingType autoTopupSettingType = this.setupSetting;
        if (autoTopupSettingType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(autoTopupSettingType.name());
        }
        dest.writeSerializable(this.limit);
        Map<String, String> map = this.additionalParams;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator s = x4e.s(dest, 1, map);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoTopupSetupV2ScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSetupV2ScreenParams createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String readString3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            AutoTopupShowOnly valueOf = parcel.readInt() == 0 ? null : AutoTopupShowOnly.valueOf(parcel.readString());
            AutoTopupSetupAction valueOf2 = parcel.readInt() == 0 ? null : AutoTopupSetupAction.valueOf(parcel.readString());
            AutoTopupSettingType valueOf3 = parcel.readInt() == 0 ? null : AutoTopupSettingType.valueOf(parcel.readString());
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            return new AutoTopupSetupV2ScreenParams(readString, readString2, bigDecimal, bigDecimal2, readString3, valueOf, valueOf2, valueOf3, bigDecimal3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSetupV2ScreenParams[] newArray(int i) {
            return new AutoTopupSetupV2ScreenParams[i];
        }
    }
}
