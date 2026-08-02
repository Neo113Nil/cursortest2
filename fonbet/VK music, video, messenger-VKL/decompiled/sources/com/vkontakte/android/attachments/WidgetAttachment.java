package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;

/* compiled from: WidgetAttachment.kt */
/* loaded from: classes7.dex */
public final class WidgetAttachment extends Attachment {
    public static final Serializer.c<WidgetAttachment> CREATOR = new a();
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetAttachment a(Serializer serializer) {
            return new WidgetAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetAttachment[i];
        }
    }

    public WidgetAttachment(String str, String str2, String str3) {
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public WidgetAttachment(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
