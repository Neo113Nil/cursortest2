package xsna;

import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class knt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ knt(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                BoundingBox boundingBox = (BoundingBox) obj;
                ((GeoStaticPreview) this.d).getClass();
                int i = this.c;
                return Float.valueOf(i == 0 ? 500.0f : boundingBox.a0() / i);
            case 1:
                LikesAddResponseDto likesAddResponseDto = (LikesAddResponseDto) obj;
                gnz.b0(this.c, (UserId) this.d, true);
                return likesAddResponseDto;
            default:
                mov0 mov0Var = (mov0) this.d;
                bqu0 bqu0Var = (bqu0) obj;
                bqu0Var.show();
                mov0Var.i(bqu0Var, this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ knt(gnz gnzVar, UserId userId, int i) {
        this.b = 1;
        this.d = userId;
        this.c = i;
    }
}
