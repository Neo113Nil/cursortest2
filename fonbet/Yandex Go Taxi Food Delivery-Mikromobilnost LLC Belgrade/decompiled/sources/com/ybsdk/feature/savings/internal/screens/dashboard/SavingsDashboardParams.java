package com.ybsdk.feature.savings.internal.screens.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.x4e;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/dashboard/SavingsDashboardParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "", "additionalData", "<init>", "(Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/feature/savings/internal/screens/dashboard/SavingsDashboardParams;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalData", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsDashboardParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsDashboardParams> CREATOR = new Creator();
    private final Map<String, String> additionalData;

    public /* synthetic */ SavingsDashboardParams(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsDashboardParams copy$default(SavingsDashboardParams savingsDashboardParams, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = savingsDashboardParams.additionalData;
        }
        return savingsDashboardParams.copy(map);
    }

    public final Map<String, String> component1() {
        return this.additionalData;
    }

    public final SavingsDashboardParams copy(Map<String, String> additionalData) {
        return new SavingsDashboardParams(additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavingsDashboardParams) && jl40.l(this.additionalData, ((SavingsDashboardParams) other).additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public int hashCode() {
        Map<String, String> map = this.additionalData;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return nnm.j("SavingsDashboardParams(additionalData=", Extension.C_BRAKE, this.additionalData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Map<String, String> map = this.additionalData;
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
    public static final class Creator implements Parcelable.Creator<SavingsDashboardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsDashboardParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SavingsDashboardParams(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsDashboardParams[] newArray(int i) {
            return new SavingsDashboardParams[i];
        }
    }

    public SavingsDashboardParams(Map<String, String> map) {
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavingsDashboardParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
