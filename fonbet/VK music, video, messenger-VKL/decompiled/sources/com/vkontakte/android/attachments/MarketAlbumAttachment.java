package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import ru.ok.gl.tf.Tensorflow;
import xsna.dd80;
import xsna.eso0;
import xsna.tfw;

/* loaded from: classes7.dex */
public class MarketAlbumAttachment extends Attachment implements eso0, tfw {
    public static final Serializer.c<MarketAlbumAttachment> CREATOR = new a();
    public final GoodAlbum f;
    public final int g;

    public class a extends Serializer.c<MarketAlbumAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketAlbumAttachment a(Serializer serializer) {
            return new MarketAlbumAttachment((GoodAlbum) serializer.G(GoodAlbum.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketAlbumAttachment[i];
        }
    }

    public MarketAlbumAttachment(GoodAlbum goodAlbum) {
        this.f = goodAlbum;
        Photo photo = goodAlbum.e;
        if (photo != null) {
            Image image = photo.Fb(604, false).d;
            if (image.b == 0 && image.c == 0 && image.d.endsWith(".gif")) {
                this.g = Tensorflow.FRAME_WIDTH;
            }
        }
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.f);
    }

    @Override // xsna.tfw
    public final String h9() {
        Photo photo = this.f.e;
        if (photo == null) {
            return null;
        }
        return photo.Fb(this.g, false).d.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("market_album");
        GoodAlbum goodAlbum = this.f;
        sb.append(goodAlbum.c);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(goodAlbum.b);
        return sb.toString();
    }
}
