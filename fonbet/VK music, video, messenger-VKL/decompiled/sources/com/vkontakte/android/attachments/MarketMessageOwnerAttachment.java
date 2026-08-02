package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.f010;
import xsna.tec0;
import xsna.xus;
import xsna.zcl;

/* compiled from: MarketMessageOwnerAttachment.kt */
/* loaded from: classes7.dex */
public final class MarketMessageOwnerAttachment extends Attachment implements tec0, f010 {
    public static final Serializer.c<MarketMessageOwnerAttachment> CREATOR = new a();
    public final UserId f;
    public final String g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarketMessageOwnerAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketMessageOwnerAttachment a(Serializer serializer) {
            return new MarketMessageOwnerAttachment((UserId) serializer.A(UserId.class.getClassLoader()), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketMessageOwnerAttachment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMessageOwnerAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.h;
    }

    @Override // xsna.f010
    public final AttachmentType E9() {
        return AttachmentType.MESSAGE_TO_BC;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.f);
        serializer.m0(this.g);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        e.put("owner_title", this.g);
        return e;
    }

    public final String toString() {
        return "message_to_bc";
    }

    public /* synthetic */ MarketMessageOwnerAttachment(UserId userId, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str);
    }

    public MarketMessageOwnerAttachment(UserId userId, String str) {
        this.f = userId;
        this.g = str;
        this.h = 22;
    }
}
