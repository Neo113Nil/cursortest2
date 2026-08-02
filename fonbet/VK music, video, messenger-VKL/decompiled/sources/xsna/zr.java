package xsna;

import com.vk.api.generated.account.dto.AccountGetTogglesResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zr implements f03 {
    public static String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetTogglesResponseDto.class).getType());
    }
}
