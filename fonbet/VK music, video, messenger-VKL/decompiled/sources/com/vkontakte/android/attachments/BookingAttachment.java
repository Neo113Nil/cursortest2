package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import org.json.JSONObject;
import xsna.f010;
import xsna.tec0;
import xsna.zcl;

/* compiled from: BookingAttachment.kt */
/* loaded from: classes7.dex */
public final class BookingAttachment extends Attachment implements tec0, f010 {
    public static final Serializer.c<BookingAttachment> CREATOR = new a();
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BookingAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BookingAttachment a(Serializer serializer) {
            return new BookingAttachment(serializer.I(), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingAttachment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookingAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // xsna.f010
    public final AttachmentType E9() {
        return AttachmentType.BOOKING;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.m0(this.f);
        serializer.m0(this.g);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        return new JSONObject().put("author", this.f).put("booking_app_url", this.g);
    }

    public final String toString() {
        return "online_booking";
    }

    public /* synthetic */ BookingAttachment(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public BookingAttachment(String str, String str2) {
        this.f = str;
        this.g = str2;
    }
}
