package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoTag;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class xi6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xi6(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new VkPaginationList((List) obj, ((List) this.d).size(), !r5.isEmpty(), this.c);
            default:
                UserId userId = (UserId) this.d;
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append('_');
                sb.append(this.c);
                sb.append('_');
                sb.append(((PhotoTag) obj).b);
                return sb.toString();
        }
    }
}
