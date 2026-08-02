package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.List;
import xsna.ned0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cam0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ dam0 c;

    public /* synthetic */ cam0(int i, dam0 dam0Var) {
        this.b = i;
        this.c = dam0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (UsersUserFullDto usersUserFullDto : (List) obj) {
            this.c.c.getClass();
            Serializer.c<Image> cVar = Image.CREATOR;
            ImageSize Cb = Image.b.a(usersUserFullDto.r2()).Cb(400, true, false);
            String str = Cb != null ? Cb.d.d : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new ned0.a(arrayList, this.b);
    }
}
