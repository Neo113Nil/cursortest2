package com.yandex.passport.internal.ui.bouncer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/RendererKeyData;", "Landroid/os/Parcelable;", "", "stringMode", "index", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "asKey", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/bouncer/RendererKeyData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStringMode", "getIndex", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RendererKeyData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RendererKeyData> CREATOR = new Creator();
    private final String index;
    private final String stringMode;

    public RendererKeyData(String str, String str2) {
        this.stringMode = str;
        this.index = str2;
    }

    public static /* synthetic */ RendererKeyData copy$default(RendererKeyData rendererKeyData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rendererKeyData.stringMode;
        }
        if ((i & 2) != 0) {
            str2 = rendererKeyData.index;
        }
        return rendererKeyData.copy(str, str2);
    }

    public final String asKey() {
        return this.stringMode + '|' + this.index;
    }

    /* renamed from: component1, reason: from getter */
    public final String getStringMode() {
        return this.stringMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    public final RendererKeyData copy(String stringMode, String index) {
        return new RendererKeyData(stringMode, index);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RendererKeyData)) {
            return false;
        }
        RendererKeyData rendererKeyData = (RendererKeyData) other;
        return jl40.l(this.stringMode, rendererKeyData.stringMode) && jl40.l(this.index, rendererKeyData.index);
    }

    public final String getIndex() {
        return this.index;
    }

    public final String getStringMode() {
        return this.stringMode;
    }

    public int hashCode() {
        return this.index.hashCode() + (this.stringMode.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RendererKeyData(stringMode=");
        sb.append(this.stringMode);
        sb.append(", index=");
        return b64.p(sb, this.index, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.stringMode);
        dest.writeString(this.index);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RendererKeyData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RendererKeyData createFromParcel(Parcel parcel) {
            return new RendererKeyData(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RendererKeyData[] newArray(int i) {
            return new RendererKeyData[i];
        }
    }
}
