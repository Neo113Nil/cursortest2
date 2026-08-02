package com.vkontakte.android.attachments;

import android.content.Context;
import android.content.res.Resources;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import xsna.dd80;
import xsna.e43;
import xsna.epx;
import xsna.gmq;
import xsna.ptx0;
import xsna.tfw;
import xsna.zcl;

/* compiled from: PodcastAttachment.kt */
/* loaded from: classes7.dex */
public final class PodcastAttachment extends Attachment implements gmq, ptx0, tfw {
    public static final Serializer.c<PodcastAttachment> CREATOR = new a();
    public final MusicTrack f;
    public final Owner g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PodcastAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastAttachment a(Serializer serializer) {
            return new PodcastAttachment((MusicTrack) serializer.G(Episode.class.getClassLoader()), (Owner) serializer.G(Owner.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastAttachment[i];
        }
    }

    public /* synthetic */ PodcastAttachment(MusicTrack musicTrack, Owner owner, int i, zcl zclVar) {
        this(musicTrack, (i & 2) != 0 ? null : owner);
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.h;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.k;
    }

    public final boolean Db() {
        return this.f.g == 11;
    }

    public final boolean Eb() {
        Episode episode = this.f.w;
        return (episode != null ? episode.j : null) != null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.i0(this.g);
    }

    @Override // xsna.gmq
    public final boolean X() {
        Episode episode = this.f.w;
        if (episode != null) {
            return episode.c;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PodcastAttachment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        PodcastAttachment podcastAttachment = (PodcastAttachment) obj;
        MusicTrack musicTrack = this.f;
        return epx.f(musicTrack.c, podcastAttachment.f.c) && musicTrack.b == podcastAttachment.f.b;
    }

    @Override // xsna.tfw
    public final String h9() {
        Resources resources;
        Image image;
        ImageSize Cb;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (context != null && (resources = context.getResources()) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.podcast_cover_sise);
            Episode episode = this.f.w;
            if (episode != null && (image = episode.f) != null && (Cb = image.Cb(dimensionPixelSize, false, false)) != null) {
                return Cb.d.d;
            }
        }
        return null;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.f;
        return Integer.hashCode(musicTrack.b) + (Long.hashCode(musicTrack.c.b) * 31);
    }

    @Override // xsna.ptx0
    public final UserId q() {
        throw null;
    }

    @Override // xsna.ptx0
    public final Owner s() {
        throw null;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        Episode episode = this.f.w;
        if (episode != null) {
            episode.c = z;
        }
    }

    public final String toString() {
        return "podcast" + this.f.Ib();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_music_title_podcast;
    }

    public PodcastAttachment(MusicTrack musicTrack, Owner owner) {
        this.f = musicTrack;
        this.g = owner;
        this.h = 9;
    }
}
