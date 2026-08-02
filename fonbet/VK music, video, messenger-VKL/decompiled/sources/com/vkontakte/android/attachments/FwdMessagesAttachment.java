package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import java.util.List;

/* compiled from: FwdMessagesAttachment.kt */
/* loaded from: classes7.dex */
public final class FwdMessagesAttachment extends Attachment {
    public static final Serializer.c<FwdMessagesAttachment> CREATOR = new a();
    public final long f;
    public final List<Integer> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FwdMessagesAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FwdMessagesAttachment a(Serializer serializer) {
            return new FwdMessagesAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FwdMessagesAttachment[i];
        }
    }

    public FwdMessagesAttachment(long j, List<Integer> list) {
        this.f = j;
        this.g = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.f);
        serializer.U(this.g);
    }

    public FwdMessagesAttachment(Serializer serializer) {
        this(serializer.w(), serializer.d());
    }
}
