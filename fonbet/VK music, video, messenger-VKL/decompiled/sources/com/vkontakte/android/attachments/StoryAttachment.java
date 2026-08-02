package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vkontakte.android.R;
import xsna.zcl;

/* compiled from: StoryAttachment.kt */
/* loaded from: classes7.dex */
public final class StoryAttachment extends Attachment {
    public static final Serializer.c<StoryAttachment> CREATOR = new a();
    public final StoryEntry f;
    public final StoryOwner g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryAttachment a(Serializer serializer) {
            return new StoryAttachment((StoryEntry) serializer.G(StoryEntry.class.getClassLoader()), (StoryOwner) serializer.G(StoryOwner.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryAttachment[i];
        }
    }

    public StoryAttachment(StoryEntry storyEntry, StoryOwner storyOwner) {
        this.f = storyEntry;
        this.g = storyOwner;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.i0(this.g);
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.story;
    }

    public /* synthetic */ StoryAttachment(StoryEntry storyEntry, StoryOwner storyOwner, int i, zcl zclVar) {
        this(storyEntry, (i & 2) != 0 ? null : storyOwner);
    }
}
