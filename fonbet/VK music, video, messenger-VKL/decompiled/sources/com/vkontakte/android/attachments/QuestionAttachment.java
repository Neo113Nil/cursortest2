package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: QuestionAttachment.kt */
/* loaded from: classes7.dex */
public final class QuestionAttachment extends Attachment {
    public static final Serializer.c<QuestionAttachment> CREATOR = new a();
    public final long f;
    public final UserId g;
    public final String h;
    public final String i;
    public final int j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionAttachment a(Serializer serializer) {
            return new QuestionAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionAttachment[i];
        }
    }

    public QuestionAttachment(long j, UserId userId, String str, String str2) {
        this.f = j;
        this.g = userId;
        this.h = str;
        this.i = str2;
        this.j = 20;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionAttachment)) {
            return false;
        }
        QuestionAttachment questionAttachment = (QuestionAttachment) obj;
        return this.f == questionAttachment.f && epx.f(this.g, questionAttachment.g) && epx.f(this.h, questionAttachment.h) && epx.f(this.i, questionAttachment.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + urd0.a(bh10.a(Long.hashCode(this.f) * 31, 31, this.g.b), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionAttachment(id=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", question=");
        sb.append(this.h);
        sb.append(", url=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_question;
    }

    public QuestionAttachment(Serializer serializer) {
        this(serializer.w(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H());
    }
}
