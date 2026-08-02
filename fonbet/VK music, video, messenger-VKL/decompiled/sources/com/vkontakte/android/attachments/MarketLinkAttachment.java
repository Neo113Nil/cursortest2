package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import org.json.JSONObject;
import xsna.f010;
import xsna.tec0;
import xsna.xus;
import xsna.zcl;

/* compiled from: MarketLinkAttachment.kt */
/* loaded from: classes7.dex */
public final class MarketLinkAttachment extends Attachment implements tec0, f010 {
    public static final Serializer.c<MarketLinkAttachment> CREATOR = new a();
    public final String f;
    public final String g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarketLinkAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketLinkAttachment a(Serializer serializer) {
            return new MarketLinkAttachment(serializer.I(), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketLinkAttachment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketLinkAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.h;
    }

    @Override // xsna.f010
    public final AttachmentType E9() {
        return AttachmentType.MARKET_LINK;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.m0(this.f);
        serializer.m0(this.g);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        e.put("author", this.f);
        e.put("url", this.g);
        return e;
    }

    public final String toString() {
        return "market_link";
    }

    public /* synthetic */ MarketLinkAttachment(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public MarketLinkAttachment(String str, String str2) {
        this.f = str;
        this.g = str2;
        this.h = 21;
    }
}
