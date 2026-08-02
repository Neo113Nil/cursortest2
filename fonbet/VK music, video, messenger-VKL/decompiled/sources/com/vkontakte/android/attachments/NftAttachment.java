package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.nft.Nft;
import java.util.Map;
import xsna.zcl;

/* compiled from: NftAttachment.kt */
/* loaded from: classes7.dex */
public final class NftAttachment extends PhotoAttachment {
    public static final Serializer.c<NftAttachment> CREATOR = new a();
    public final Nft y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NftAttachment> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final NftAttachment a(Serializer serializer) {
            return new NftAttachment((Nft) serializer.G(Nft.class.getClassLoader()), null, 2, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NftAttachment[i];
        }
    }

    public /* synthetic */ NftAttachment(Nft nft, Map map, int i, zcl zclVar) {
        this(nft, (i & 2) != 0 ? null : map);
    }

    public final Nft Jb() {
        return this.y;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.y);
    }

    public NftAttachment(Nft nft, Map<UserId, Owner> map) {
        super(nft.e, map);
        this.y = nft;
    }
}
