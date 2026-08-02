package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;

/* compiled from: MiniAppSnippetAttachment.kt */
/* loaded from: classes7.dex */
public final class MiniAppSnippetAttachment extends Attachment {
    public static final Serializer.c<MiniAppSnippetAttachment> CREATOR = new a();
    public final long f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MiniAppSnippetAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MiniAppSnippetAttachment a(Serializer serializer) {
            return new MiniAppSnippetAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MiniAppSnippetAttachment[i];
        }
    }

    public MiniAppSnippetAttachment(long j, Integer num, String str, String str2, String str3, String str4) {
        this.f = j;
        this.g = num;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.f);
        serializer.V(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    public MiniAppSnippetAttachment(Serializer serializer) {
        this(serializer.w(), serializer.v(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
