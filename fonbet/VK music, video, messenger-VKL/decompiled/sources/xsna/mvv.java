package xsna;

import com.vk.api.generated.identity.dto.IdentityLabelDto;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;

/* compiled from: IdentityMapper.kt */
/* loaded from: classes6.dex */
public final class mvv {
    public static WebIdentityLabel a(IdentityLabelDto identityLabelDto) {
        Integer d = identityLabelDto.d();
        return new WebIdentityLabel(d != null ? d.intValue() : 0, identityLabelDto.e());
    }
}
