package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.ImageSize;
import kotlin.collections.builders.ListBuilder;

/* compiled from: NotificationTest.kt */
/* loaded from: classes5.dex */
public final class bi70 {
    public static ListBuilder a(UsersUserFullDto usersUserFullDto) {
        ListBuilder e = e43.e();
        String r2 = usersUserFullDto.r2();
        if (r2 != null) {
            m900<String, ImageSize> m900Var = ImageSize.e;
            e.add(ImageSize.b.a(r2));
        }
        String o2 = usersUserFullDto.o2();
        if (o2 != null) {
            e.add(new ImageSize(o2, 50, (char) 0, false, 12, (zcl) null));
        }
        String X1 = usersUserFullDto.X1();
        if (X1 != null) {
            e.add(new ImageSize(X1, 100, (char) 0, false, 12, (zcl) null));
        }
        String i2 = usersUserFullDto.i2();
        if (i2 != null) {
            e.add(new ImageSize(i2, 200, (char) 0, false, 12, (zcl) null));
        }
        String l2 = usersUserFullDto.l2();
        if (l2 != null) {
            e.add(new ImageSize(l2, 400, (char) 0, false, 12, (zcl) null));
        }
        return e.g();
    }
}
