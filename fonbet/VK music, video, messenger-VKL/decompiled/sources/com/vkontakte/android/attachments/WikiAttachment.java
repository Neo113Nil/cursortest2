package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.R;

/* loaded from: classes7.dex */
public class WikiAttachment extends Attachment {
    public static final Serializer.c<WikiAttachment> CREATOR = new a();
    public final String f;
    public final String g;
    public final long h;
    public final int i;
    public transient String j = "";

    public class a extends Serializer.c<WikiAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WikiAttachment a(Serializer serializer) {
            return new WikiAttachment(serializer.H(), serializer.H(), serializer.w(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WikiAttachment[i];
        }
    }

    public WikiAttachment(String str, String str2, long j, int i) {
        this.f = str;
        this.g = str2;
        this.h = j;
        this.i = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.Y(this.h);
        serializer.S(this.i);
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_wiki;
    }
}
