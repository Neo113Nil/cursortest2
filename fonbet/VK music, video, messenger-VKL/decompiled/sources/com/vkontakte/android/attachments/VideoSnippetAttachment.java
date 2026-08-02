package com.vkontakte.android.attachments;

import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.ButtonAction;
import xsna.dd80;

/* compiled from: VideoSnippetAttachment.kt */
/* loaded from: classes7.dex */
public final class VideoSnippetAttachment extends VideoAttachment {
    public static final Serializer.c<VideoSnippetAttachment> CREATOR = new a();
    public final AwayLink p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final ButtonAction w;
    public final int x;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoSnippetAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoSnippetAttachment a(Serializer serializer) {
            return new VideoSnippetAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoSnippetAttachment[i];
        }
    }

    public VideoSnippetAttachment(VideoFile videoFile, AwayLink awayLink, String str, String str2, String str3, String str4, String str5, String str6, ButtonAction buttonAction) {
        super(videoFile);
        Mb(null);
        this.k.n8(true);
        this.x = dd80.r;
        this.p = awayLink;
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.w = buttonAction;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, com.vk.dto.common.Attachment
    public final int Bb() {
        return this.x;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.j0(this.u);
        serializer.j0(this.v);
        serializer.i0(this.w);
    }

    public final VideoSnippetAttachment Pb(VideoFile videoFile) {
        return new VideoSnippetAttachment(videoFile, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment
    public final boolean equals(Object obj) {
        return (obj instanceof VideoSnippetAttachment) && super.equals(obj);
    }

    public VideoSnippetAttachment(Serializer serializer) {
        super(serializer);
        Mb(null);
        this.k.n8(true);
        this.x = dd80.r;
        this.p = (AwayLink) serializer.G(AwayLink.class.getClassLoader());
        this.q = serializer.H();
        this.r = serializer.H();
        this.s = serializer.H();
        this.t = serializer.H();
        this.u = serializer.H();
        this.v = serializer.H();
        this.w = (ButtonAction) serializer.G(ButtonAction.class.getClassLoader());
    }
}
