package xsna;

import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: PhotosDeleteAvatarApiRequest.kt */
/* loaded from: classes15.dex */
public final class tea0 extends awi<String> {
    public final UserId s;

    public tea0(UserId userId) {
        this.s = userId;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) yfb.y(zga0.b(new aha0(), this.s, "-6", Boolean.TRUE, null, 1, null, 14314), new q520(11)).f(l7r0Var);
        yfb.x(zga0.p(new aha0(), photosPhotoDto.q(), Integer.valueOf(photosPhotoDto.getId()), null, 4)).f(l7r0Var);
        UserId userId = this.s;
        if (userId.b <= 0) {
            return (String) yfb.y(xqu.a.a(null, Collections.singletonList(userId), null), new jz30(6)).f(l7r0Var);
        }
        List singletonList = Collections.singletonList(userId);
        List singletonList2 = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
        if ((4 & 58) != 0) {
            singletonList2 = null;
        }
        return (String) yfb.y(s1r0.a.a((58 & 8) == 0 ? "dat" : null, singletonList, singletonList2), new f1s(15)).f(l7r0Var);
    }
}
