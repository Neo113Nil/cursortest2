package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.services.dto.ServicesYcVKReviewsPublishSetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gsi0 implements b03, f03, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, yads.sq0, yads.wl1 {
    public final /* synthetic */ int b;

    public /* synthetic */ gsi0(int i) {
        this.b = i;
    }

    public static etn b() {
        return fxc0.B().J().f1();
    }

    public static void c(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    @Override // yads.wl1
    public int a(Object obj) {
        return yads.xl1.a((yads.jl1) obj);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() | ((Boolean) obj2).booleanValue());
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.re.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (ServicesYcVKReviewsPublishSetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServicesYcVKReviewsPublishSetResponseDto.class).getType())).a();
            case 1:
                return (ShortVideoGetUserSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetUserSettingsResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof fjw0) || (obj instanceof h3x0);
    }
}
