package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.stickers.ShareVmojiStoryParams;

/* compiled from: VmojiAttachment.kt */
/* loaded from: classes7.dex */
public final class VmojiAttachment extends Attachment {
    public static final Serializer.c<VmojiAttachment> CREATOR = new a();
    public final String f;
    public final ShareVmojiStoryParams g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiAttachment a(Serializer serializer) {
            return new VmojiAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiAttachment[i];
        }
    }

    public VmojiAttachment(String str, ShareVmojiStoryParams shareVmojiStoryParams) {
        this.f = str;
        this.g = shareVmojiStoryParams;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.i0(this.g);
    }

    public VmojiAttachment(Serializer serializer) {
        this(serializer.H(), (ShareVmojiStoryParams) serializer.G(ShareVmojiStoryParams.class.getClassLoader()));
    }
}
