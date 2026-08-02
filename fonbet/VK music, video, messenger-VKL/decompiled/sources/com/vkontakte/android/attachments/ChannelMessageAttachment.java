package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.PostDonut;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMessageAttachment.kt */
/* loaded from: classes7.dex */
public final class ChannelMessageAttachment extends Attachment {
    public static final Serializer.c<ChannelMessageAttachment> CREATOR = new a();
    public final long f;
    public final Peer g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final List<Attachment> l;
    public final String m;
    public final String n;
    public final PostDonut o;
    public final int p;
    public final ImageList q;
    public final int r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChannelMessageAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelMessageAttachment a(Serializer serializer) {
            return new ChannelMessageAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelMessageAttachment[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ChannelMessageAttachment(long r18, com.vk.dto.common.Peer r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.lang.String r26, java.lang.String r27, com.vk.dto.newsfeed.PostDonut r28, int r29, com.vk.dto.common.im.ImageList r30, int r31, xsna.zcl r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r8 = r2
            goto Lc
        La:
            r8 = r22
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r23
        L14:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L1b
            r10 = r3
            goto L1d
        L1b:
            r10 = r24
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.b
            r11 = r1
            goto L27
        L25:
            r11 = r25
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2d
            r12 = r2
            goto L2f
        L2d:
            r12 = r26
        L2f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L35
            r13 = r2
            goto L37
        L35:
            r13 = r27
        L37:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3d
            r14 = r3
            goto L3f
        L3d:
            r14 = r28
        L3f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L46
            r1 = 0
            r15 = r1
            goto L48
        L46:
            r15 = r29
        L48:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L57
            r16 = r3
            r4 = r18
            r6 = r20
            r7 = r21
            r3 = r17
            goto L61
        L57:
            r16 = r30
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
        L61:
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vkontakte.android.attachments.ChannelMessageAttachment.<init>(long, com.vk.dto.common.Peer, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, com.vk.dto.newsfeed.PostDonut, int, com.vk.dto.common.im.ImageList, int, xsna.zcl):void");
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.r;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.f);
        serializer.Y(this.g.b);
        serializer.S(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.m0(this.k);
        serializer.W(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.i0(this.o);
        serializer.S(this.p);
        serializer.i0(this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelMessageAttachment(long j, Peer peer, int i, String str, String str2, String str3, List<? extends Attachment> list, String str4, String str5, PostDonut postDonut, int i2, ImageList imageList) {
        this.f = j;
        this.g = peer;
        this.h = i;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = list;
        this.m = str4;
        this.n = str5;
        this.o = postDonut;
        this.p = i2;
        this.q = imageList;
        this.r = 23;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChannelMessageAttachment(Serializer serializer) {
        this(r1, r3, r4, r0, r6, r7, r8, r9, r10 == null ? "" : r10, (PostDonut) serializer.G(PostDonut.class.getClassLoader()), serializer.u(), (ImageList) serializer.G(ImageList.class.getClassLoader()));
        long w = serializer.w();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(serializer.w());
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String I = serializer.I();
        List k = serializer.k(Attachment.class);
        k = k == null ? EmptyList.b : k;
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
    }
}
