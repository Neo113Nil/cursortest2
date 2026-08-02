package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ka90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ka90(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new VkPaginationList((List) obj, ((FriendsGetFieldsResponseDto) this.d).getCount(), !r5.isEmpty(), this.c);
            default:
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                bVar.k = wbp0.a((ic60) this.d);
                bVar.t = 0;
                bVar.v = 0;
                int b = cn70.b(20);
                int i = this.c;
                bVar.setMargins(i, 0, i, b);
                return s3q0.a;
        }
    }
}
