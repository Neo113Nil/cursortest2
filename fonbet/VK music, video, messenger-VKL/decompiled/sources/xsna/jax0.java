package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.wall.dto.WallGetResponseDto;
import com.vk.internal.api.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jax0 implements f03, yads.sq0 {
    public static void a(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.jw1.a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetResponseDto.class).getType());
    }
}
