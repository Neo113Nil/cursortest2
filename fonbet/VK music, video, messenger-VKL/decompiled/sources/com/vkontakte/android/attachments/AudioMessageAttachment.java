package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.vk.api.base.Document;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* loaded from: classes7.dex */
public class AudioMessageAttachment extends DocumentAttachment {
    public static final Serializer.c<AudioMessageAttachment> CREATOR = new a();
    public final String v;
    public final String w;
    public final int x;
    public final byte[] y;

    public class a extends Serializer.c<AudioMessageAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioMessageAttachment a(@NonNull Serializer serializer) {
            return new AudioMessageAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i) {
            return new AudioMessageAttachment[i];
        }
    }

    public AudioMessageAttachment(String str, String str2, int i, byte[] bArr, String str3, String str4, int i2, UserId userId, int i3, String str5) {
        super(str3, str4, i2, null, userId, i3, str5, null, 0, 0, null);
        this.v = str;
        this.w = str2;
        this.x = i;
        this.y = bArr;
    }

    @Override // com.vkontakte.android.attachments.DocumentAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.v);
        serializer.j0(this.w);
        serializer.S(this.x);
        serializer.M(this.y);
    }

    @Override // com.vkontakte.android.attachments.DocumentAttachment, com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.audio_message;
    }

    public AudioMessageAttachment(Document document) {
        super(document);
        this.v = document.p;
        this.w = document.q;
        this.x = document.f;
        this.y = document.r;
    }

    public AudioMessageAttachment(Serializer serializer) {
        super(serializer);
        this.v = serializer.H();
        this.w = serializer.H();
        this.x = serializer.u();
        this.y = serializer.a();
    }
}
