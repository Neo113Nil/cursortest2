package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import xsna.dd80;
import xsna.iah0;
import xsna.tfw;

/* loaded from: classes7.dex */
public class AudioArtistAttachment extends Attachment implements tfw {
    public static final Serializer.c<AudioArtistAttachment> CREATOR = new a();
    public final Artist f;
    public final Thumb g;
    public String h;

    public class a extends Serializer.c<AudioArtistAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioArtistAttachment a(@NonNull Serializer serializer) {
            Artist artist = (Artist) serializer.G(Artist.class.getClassLoader());
            String H = serializer.H();
            if (artist == null) {
                return null;
            }
            return new AudioArtistAttachment(artist, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioArtistAttachment[i];
        }
    }

    public AudioArtistAttachment(Artist artist) {
        Image image;
        this.f = artist;
        if (artist == null || (image = artist.f) == null) {
            this.g = null;
        } else {
            this.g = new Thumb(image);
        }
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 12;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.i;
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
        return "artist" + this.f.b;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_artist;
    }

    public AudioArtistAttachment(Artist artist, String str) {
        Image image;
        this.f = artist;
        if (artist != null && (image = artist.f) != null) {
            this.g = new Thumb(image);
        } else {
            this.g = null;
        }
        this.h = str;
    }
}
