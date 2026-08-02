package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import defpackage.aqd0;
import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.upd0;
import defpackage.yjd;
import defpackage.zpd0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 02\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u000212B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J(\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010#¨\u00063"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "Landroid/os/Parcelable;", "Lupd0;", "", "light", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_core_common_release", "(Lcom/yandex/plus/core/data/common/PlusThemedUrl;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isEmpty", "()Z", "isNotEmpty", "isValid", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight", "getDark", "Companion", "zpd0", "aqd0", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusThemedUrl implements Parcelable, upd0 {
    private final String dark;
    private final String light;
    public static final aqd0 Companion = new aqd0();
    public static final Parcelable.Creator<PlusThemedUrl> CREATOR = new Creator();

    public /* synthetic */ PlusThemedUrl(int i, String str, String str2, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, zpd0.a.getDescriptor());
            throw null;
        }
        this.light = str;
        this.dark = str2;
    }

    public static /* synthetic */ PlusThemedUrl copy$default(PlusThemedUrl plusThemedUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusThemedUrl.light;
        }
        if ((i & 2) != 0) {
            str2 = plusThemedUrl.dark;
        }
        return plusThemedUrl.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$plus_core_common_release(PlusThemedUrl self, yjd output, SerialDescriptor serialDesc) {
        auu0 auu0Var = auu0.a;
        output.g(serialDesc, 0, auu0Var, self.getLight());
        output.g(serialDesc, 1, auu0Var, self.getDark());
    }

    /* renamed from: component1, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    public final PlusThemedUrl copy(String light, String dark) {
        return new PlusThemedUrl(light, dark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusThemedUrl)) {
            return false;
        }
        PlusThemedUrl plusThemedUrl = (PlusThemedUrl) other;
        return jl40.l(this.light, plusThemedUrl.light) && jl40.l(this.dark, plusThemedUrl.dark);
    }

    public int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return getLight() == null && getDark() == null;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final boolean isValid() {
        return URLUtil.isValidUrl(getLight()) && URLUtil.isValidUrl(getDark());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusThemedUrl(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return b64.p(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.light);
        dest.writeString(this.dark);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusThemedUrl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusThemedUrl createFromParcel(Parcel parcel) {
            return new PlusThemedUrl(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusThemedUrl[] newArray(int i) {
            return new PlusThemedUrl[i];
        }
    }

    @Override // defpackage.upd0
    public String getDark() {
        return this.dark;
    }

    @Override // defpackage.upd0
    public String getLight() {
        return this.light;
    }

    public PlusThemedUrl(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }
}
