package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: PostReplyAttachment.kt */
/* loaded from: classes7.dex */
public final class PostReplyAttachment extends Attachment {
    public static final Serializer.c<PostReplyAttachment> CREATOR = new a();
    public final UserId f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostReplyAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostReplyAttachment a(Serializer serializer) {
            return new PostReplyAttachment(new UserId(serializer.w()), serializer.u(), serializer.u(), serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostReplyAttachment[i];
        }
    }

    public PostReplyAttachment(UserId userId, int i, int i2, int i3, String str, String str2) {
        this.f = userId;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str;
        this.k = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.f.b);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.S(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("wall");
        sb.append(this.f);
        sb.append('_');
        sb.append(this.g);
        sb.append("?reply=");
        sb.append(this.h);
        int i = this.i;
        if (i > 0) {
            str = "&thread=" + i;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.wall_post_reply;
    }
}
