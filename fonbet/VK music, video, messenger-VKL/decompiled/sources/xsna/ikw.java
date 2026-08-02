package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.List;

/* compiled from: ImageMapper.kt */
/* loaded from: classes6.dex */
public final class ikw {
    public static WebImage a(UsersUserFullDto usersUserFullDto) {
        String r2 = usersUserFullDto.r2();
        if (r2 != null) {
            WebImage.CREATOR.getClass();
            return WebImage.a.c(r2);
        }
        String o2 = usersUserFullDto.o2();
        WebImageSize webImageSize = new WebImageSize(o2 == null ? "" : o2, 50, 50, (char) 0, false, null, 56, null);
        String X1 = usersUserFullDto.X1();
        WebImageSize webImageSize2 = new WebImageSize(X1 == null ? "" : X1, 100, 100, (char) 0, false, null, 56, null);
        String i2 = usersUserFullDto.i2();
        WebImageSize webImageSize3 = new WebImageSize(i2 == null ? "" : i2, 200, 200, (char) 0, false, null, 56, null);
        String l2 = usersUserFullDto.l2();
        return new WebImage((List<WebImageSize>) e43.l(webImageSize, webImageSize2, webImageSize3, new WebImageSize(l2 == null ? "" : l2, 400, 400, (char) 0, false, null, 56, null)));
    }
}
