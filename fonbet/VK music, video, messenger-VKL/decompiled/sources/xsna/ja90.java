package xsna;

import android.graphics.Bitmap;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import xsna.la90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ja90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja90(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                la90 la90Var = (la90) this.d;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                return ((zi50) la90Var.f.getValue()).a(cj50.a(friendsGetFieldsResponseDto.d(), new la90.a(1, la90Var.d, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0))).l(new iw3(new ka90(friendsGetFieldsResponseDto, this.c, 0), 29));
            default:
                Bitmap bitmap = (Bitmap) obj;
                ((a8w0) this.d).getClass();
                int i = this.c;
                return (i <= 0 || i <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, i, i, false);
        }
    }
}
