package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.oo31;
import defpackage.qb8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB/\b\u0000\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/CardBinValidationConfig;", "Landroid/os/Parcelable;", "", "Lkotlin/Pair;", "", "ranges", ErrorResponseData.JSON_ERROR_MESSAGE, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getRanges$core_release", "()Ljava/util/List;", "Ljava/lang/String;", "getErrorMessage$core_release", "()Ljava/lang/String;", "Companion", "a", "qb8", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardBinValidationConfig implements Parcelable {
    private static final CardBinValidationConfig Default;
    private final String errorMessage;
    private final List<Pair<String, String>> ranges;
    public static final qb8 Companion = new qb8();
    public static final Parcelable.Creator<CardBinValidationConfig> CREATOR = new Creator();

    public static final class a {
        public final ArrayList a = new ArrayList();
    }

    static {
        ArrayList arrayList = new a().a;
        Default = arrayList.isEmpty() ? new CardBinValidationConfig(null, null) : new CardBinValidationConfig(arrayList, null);
    }

    public CardBinValidationConfig(List<Pair<String, String>> list, String str) {
        this.ranges = list;
        this.errorMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: getErrorMessage$core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<Pair<String, String>> getRanges$core_release() {
        return this.ranges;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        List<Pair<String, String>> list = this.ranges;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator m = oo31.m(dest, 1, list);
            while (m.hasNext()) {
                dest.writeSerializable((Serializable) m.next());
            }
        }
        dest.writeString(this.errorMessage);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardBinValidationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardBinValidationConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(parcel.readSerializable());
                }
                arrayList = arrayList2;
            }
            return new CardBinValidationConfig(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardBinValidationConfig[] newArray(int i) {
            return new CardBinValidationConfig[i];
        }
    }
}
