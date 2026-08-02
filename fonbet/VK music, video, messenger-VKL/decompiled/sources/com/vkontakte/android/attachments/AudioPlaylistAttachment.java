package com.vkontakte.android.attachments;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import xsna.ad0;
import xsna.dd80;
import xsna.iah0;
import xsna.tfw;

/* loaded from: classes7.dex */
public class AudioPlaylistAttachment extends Attachment implements tfw {
    public static final Serializer.c<AudioPlaylistAttachment> CREATOR = new a();
    public final Playlist f;
    public String g;
    public transient PostInteract h;

    public class a extends Serializer.c<AudioPlaylistAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioPlaylistAttachment a(@NonNull Serializer serializer) {
            Playlist playlist = (Playlist) serializer.G(Playlist.class.getClassLoader());
            String H = serializer.H();
            if (playlist == null) {
                return null;
            }
            return new AudioPlaylistAttachment(playlist, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioPlaylistAttachment[i];
        }
    }

    public AudioPlaylistAttachment(Playlist playlist) {
        this(playlist, null);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 11;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.o;
    }

    public final Playlist Db() {
        return this.f;
    }

    public final void Eb(String str, PostInteract postInteract) {
        this.g = str;
        this.h = postInteract;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f.equals(((AudioPlaylistAttachment) obj).f);
    }

    @Override // xsna.tfw
    public final String h9() {
        int v = iah0.v();
        Playlist playlist = this.f;
        Thumb thumb = playlist.m;
        if (thumb != null) {
            return thumb.Ab(v, false);
        }
        if (ad0.u(playlist.p)) {
            return null;
        }
        return playlist.p.get(0).Ab(v, false);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("audio_playlist");
        Playlist playlist = this.f;
        sb.append(playlist.c);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(playlist.b);
        if (!TextUtils.isEmpty(playlist.x)) {
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(playlist.x);
        }
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_music_title_playlist;
    }

    public AudioPlaylistAttachment(Playlist playlist, String str) {
        this.f = playlist;
        this.g = str;
    }
}
