package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: AdHideReason.kt */
/* loaded from: classes7.dex */
public final class AdHideReason extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AdHideReason> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AdHideReason> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdHideReason a(Serializer serializer) {
            return new AdHideReason(serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdHideReason[i];
        }
    }

    public /* synthetic */ AdHideReason(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdHideReason)) {
            return false;
        }
        AdHideReason adHideReason = (AdHideReason) obj;
        return this.b == adHideReason.b && epx.f(this.c, adHideReason.c) && epx.f(this.d, adHideReason.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdHideReason(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", icon=");
        return ho8.a(sb, this.d, ')');
    }

    public AdHideReason(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }
}
