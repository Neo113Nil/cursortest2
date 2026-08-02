package com.vkontakte.android.attachments;

import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;

/* compiled from: MarusiaChatScreenSharingAttachment.kt */
/* loaded from: classes7.dex */
public final class MarusiaChatScreenSharingAttachment extends Attachment {
    public static final Serializer.c<MarusiaChatScreenSharingAttachment> CREATOR = new a();
    public final Uri f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarusiaChatScreenSharingAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarusiaChatScreenSharingAttachment a(Serializer serializer) {
            return new MarusiaChatScreenSharingAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarusiaChatScreenSharingAttachment[i];
        }
    }

    public MarusiaChatScreenSharingAttachment(Uri uri, String str) {
        this.f = uri;
        this.g = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f.toString());
        serializer.j0(this.g);
    }

    public MarusiaChatScreenSharingAttachment(Serializer serializer) {
        this(Uri.parse(serializer.H()), serializer.H());
    }
}
