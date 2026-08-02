package xsna;

import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import xsna.qr60;
import xsna.wrc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class aqs implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aqs(isc0 isc0Var, boolean z) {
        this.d = isc0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean z = this.c;
                dqs dqsVar = (dqs) this.d;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                if (z) {
                    dqsVar.e = friendsGetFieldsResponseDto.d().size() + dqsVar.e;
                } else {
                    dqsVar.f = friendsGetFieldsResponseDto.d().size() + dqsVar.f;
                }
                return s3q0.a;
            default:
                isc0 isc0Var = (isc0) this.d;
                boolean z2 = this.c;
                gtc0 gtc0Var = (gtc0) obj;
                isc0Var.c(new wrc0.a(zp60.a));
                return new ksc0(new qr60.a.g(gtc0Var.a, gtc0Var.b, gtc0Var.d, !z2, false, null, null, 96));
        }
    }

    public /* synthetic */ aqs(boolean z, dqs dqsVar) {
        this.c = z;
        this.d = dqsVar;
    }
}
