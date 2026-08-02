package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.EntryAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import xsna.n420;
import xsna.ucp;

/* loaded from: classes7.dex */
public class PostAttachment extends Attachment {
    public static final Serializer.c<PostAttachment> CREATOR = new a();
    public final UserId f;
    public final int g;
    public final UserId h;
    public final String i;
    public final boolean j;
    public final List<Attachment> k;

    public class a extends Serializer.c<PostAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostAttachment a(@NonNull Serializer serializer) {
            return new PostAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostAttachment[i];
        }
    }

    public PostAttachment(UserId userId, int i, String str, boolean z, UserId userId2, List<Attachment> list) {
        this.f = userId;
        this.g = i;
        this.i = str;
        this.j = z;
        this.h = userId2;
        this.k = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.e0(this.h);
        serializer.f0(this.k);
    }

    public final String toString() {
        return "wall" + this.f + BundleUtil.UNDERLINE_TAG + this.g;
    }

    public PostAttachment(Post post) {
        this.i = "";
        UserId userId = post.m;
        this.f = userId;
        this.g = post.n;
        ucp ucpVar = ucp.a;
        Pattern pattern = n420.a;
        this.i = ucp.i(n420.b(post.s)).toString();
        this.j = "post_ads".equals(post.t);
        Owner owner = post.o;
        if (owner != null) {
            this.h = owner.b;
        } else {
            this.h = userId;
        }
        ArrayList<EntryAttachment> arrayList = post.z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<EntryAttachment> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().b);
        }
        this.k = arrayList2;
    }

    public PostAttachment(Serializer serializer) {
        this.i = "";
        this.f = (UserId) serializer.A(UserId.class.getClassLoader());
        this.g = serializer.u();
        this.i = serializer.H();
        this.j = serializer.m();
        this.h = (UserId) serializer.A(UserId.class.getClassLoader());
        this.k = serializer.B(Attachment.class.getClassLoader());
    }

    public PostAttachment(PromoPost promoPost) {
        this(promoPost.n);
        this.j = true;
    }
}
