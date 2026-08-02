package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;

/* compiled from: SituationalThemeAttachment.kt */
/* loaded from: classes7.dex */
public final class SituationalThemeAttachment extends Attachment {
    public static final Serializer.c<SituationalThemeAttachment> CREATOR = new a();
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SituationalThemeAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SituationalThemeAttachment a(Serializer serializer) {
            return new SituationalThemeAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SituationalThemeAttachment[i];
        }
    }

    public SituationalThemeAttachment(int i, String str, String str2, String str3, boolean z) {
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
    }

    public final boolean Db() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }

    public final String toString() {
        return "situational_theme" + this.f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SituationalThemeAttachment(Serializer serializer) {
        this(r1, r0, r3, r4 == null ? "" : r4, serializer.m());
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
