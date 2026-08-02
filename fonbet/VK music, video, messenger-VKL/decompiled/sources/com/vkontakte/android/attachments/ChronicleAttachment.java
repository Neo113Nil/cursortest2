package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import xsna.tfw;

/* loaded from: classes7.dex */
public class ChronicleAttachment extends Attachment implements tfw {
    public static final Serializer.c<ChronicleAttachment> CREATOR = new a();
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public int m;

    public class a extends Serializer.c<ChronicleAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChronicleAttachment a(@NonNull Serializer serializer) {
            ChronicleAttachment chronicleAttachment = new ChronicleAttachment();
            chronicleAttachment.l = serializer.u();
            chronicleAttachment.m = serializer.u();
            chronicleAttachment.f = serializer.H();
            chronicleAttachment.g = serializer.H();
            chronicleAttachment.h = serializer.H();
            chronicleAttachment.i = serializer.H();
            chronicleAttachment.j = serializer.H();
            chronicleAttachment.k = serializer.H();
            return chronicleAttachment;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChronicleAttachment[i];
        }
    }

    public ChronicleAttachment(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.l = i;
        this.m = i2;
        this.f = str;
        this.h = str3;
        this.g = str2;
        this.i = str4;
        this.j = str5;
        this.k = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    @Override // xsna.tfw
    public final String h9() {
        String str = this.k;
        if (str.length() > 0) {
            return str;
        }
        return "B|7|" + this.j;
    }
}
