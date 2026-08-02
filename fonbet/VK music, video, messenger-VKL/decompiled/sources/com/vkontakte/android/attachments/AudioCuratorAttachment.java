package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.music.Curator;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import xsna.dd80;
import xsna.iah0;
import xsna.tfw;

/* loaded from: classes7.dex */
public class AudioCuratorAttachment extends Attachment implements tfw {
    public static final Serializer.c<AudioCuratorAttachment> CREATOR = new a();
    public final Curator f;
    public final Thumb g;
    public String h;

    public class a extends Serializer.c<AudioCuratorAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioCuratorAttachment a(@NonNull Serializer serializer) {
            Curator curator = (Curator) serializer.G(Curator.class.getClassLoader());
            String H = serializer.H();
            if (curator == null) {
                return null;
            }
            return new AudioCuratorAttachment(curator, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioCuratorAttachment[i];
        }
    }

    public AudioCuratorAttachment(Curator curator) {
        this(curator, null);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 16;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.f);
        serializer.j0(this.h);
    }

    @Override // xsna.tfw
    public final String h9() {
        Thumb thumb = this.g;
        if (thumb != null) {
            return thumb.Ab(iah0.v(), false);
        }
        return null;
    }

    public final String toString() {
        return "curator" + this.f.b;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_curator;
    }

    public AudioCuratorAttachment(Curator curator, String str) {
        Image image;
        this.f = curator;
        if (curator == null || (image = curator.e) == null || image.b.isEmpty()) {
            this.g = null;
        } else {
            this.g = new Thumb(curator.e);
        }
        this.h = str;
    }
}
