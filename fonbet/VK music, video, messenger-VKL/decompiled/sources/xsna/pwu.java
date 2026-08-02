package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import java.util.Collections;
import java.util.List;

/* compiled from: HeaderExt.kt */
/* loaded from: classes18.dex */
public final class pwu {
    public static final EntryHeader a() {
        return new EntryHeader(new SourcePhoto(null, null, null), new HeaderTitle(null, null, null, new VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false), null, null, null, null, null, null, null);
    }

    public static final EntryHeader b(Owner owner) {
        Image image;
        String str;
        VerifyInfo verifyInfo;
        String str2;
        UserId userId;
        String str3;
        List singletonList = owner != null ? Collections.singletonList(owner) : null;
        if (owner != null && (str3 = owner.d) != null) {
            Serializer.c<Image> cVar = Image.CREATOR;
            image = Image.b.a(str3);
        } else if (owner == null || (str = owner.e) == null) {
            image = owner != null ? owner.g : null;
        } else {
            Serializer.c<Image> cVar2 = Image.CREATOR;
            float f = 40;
            image = Image.b.c(str, iah0.a(f), iah0.a(f), ImageSizeKey.SIZE_M_0130.i());
        }
        return new EntryHeader(new SourcePhoto(singletonList, image, owner != null ? owner.f(iah0.a(40)) : null), new HeaderTitle((owner == null || (userId = owner.b) == null) ? null : Collections.singletonList(userId), (owner == null || (str2 = owner.c) == null) ? null : Collections.singletonList(new Text(str2, null, 2, null)), owner != null ? owner.k : null, (owner == null || (verifyInfo = owner.f) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : verifyInfo, owner != null ? owner.i(256) : false, owner != null ? owner.i(8192) : false, owner != null ? owner.i(16384) : false), null, null, null, null, null, null, null);
    }
}
