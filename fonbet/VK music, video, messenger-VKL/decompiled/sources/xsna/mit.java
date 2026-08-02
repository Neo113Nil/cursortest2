package xsna;

import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mit implements izs {
    public final /* synthetic */ WebIdentityLabel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ mit(int i, int i2, WebIdentityLabel webIdentityLabel, String str, String str2) {
        this.b = webIdentityLabel;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        IdentityAddressResponseDto identityAddressResponseDto = (IdentityAddressResponseDto) obj;
        return new WebIdentityAddress(this.b, identityAddressResponseDto.d(), this.c, this.d, identityAddressResponseDto.getId(), this.e, this.f);
    }
}
