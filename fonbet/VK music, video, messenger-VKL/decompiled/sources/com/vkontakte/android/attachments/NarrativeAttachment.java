package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.narratives.Narrative;
import com.vkontakte.android.R;
import xsna.dd80;
import xsna.epx;

/* compiled from: NarrativeAttachment.kt */
/* loaded from: classes7.dex */
public final class NarrativeAttachment extends Attachment {
    public static final Serializer.c<NarrativeAttachment> CREATOR = new a();
    public final Narrative f;
    public final int g = dd80.g;
    public final int h = 10;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NarrativeAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NarrativeAttachment a(Serializer serializer) {
            return new NarrativeAttachment((Narrative) serializer.G(Narrative.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NarrativeAttachment[i];
        }
    }

    public NarrativeAttachment(Narrative narrative) {
        this.f = narrative;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.h;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NarrativeAttachment) && epx.f(this.f, ((NarrativeAttachment) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("narrative");
        Narrative narrative = this.f;
        sb.append(narrative.c);
        sb.append('_');
        sb.append(narrative.b);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_narrative;
    }
}
