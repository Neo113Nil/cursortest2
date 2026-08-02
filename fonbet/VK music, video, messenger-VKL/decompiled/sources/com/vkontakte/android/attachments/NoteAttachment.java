package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.R;

/* loaded from: classes7.dex */
public class NoteAttachment extends Attachment {
    public static final Serializer.c<NoteAttachment> CREATOR = new a();
    public final String f;
    public final long g;
    public final int h;

    public class a extends Serializer.c<NoteAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NoteAttachment a(Serializer serializer) {
            return new NoteAttachment(serializer.H(), serializer.w(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NoteAttachment[i];
        }
    }

    public NoteAttachment(String str, long j, int i) {
        this.f = str;
        this.g = j;
        this.h = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.f);
        serializer.Y(this.g);
        serializer.S(this.h);
    }

    public final String toString() {
        return "note" + this.g + BundleUtil.UNDERLINE_TAG + this.h;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_note;
    }
}
