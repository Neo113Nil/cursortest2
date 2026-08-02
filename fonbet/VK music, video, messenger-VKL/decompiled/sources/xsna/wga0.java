package xsna;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronLog;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.api.generated.store.dto.StoreGetStockItemsResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetQuestionsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetExternalStatsTokenResponseDto;
import com.vk.api.generated.vkRun.dto.VkRunSetStepsResponseDto;
import com.vk.clips.sdk.api.generated.GsonHolder;
import com.vk.clips.sdk.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wga0 implements f03, b03, io.reactivex.rxjava3.functions.l, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ wga0(int i) {
        this.b = i;
    }

    public static com.mbridge.msdk.setting.g a(com.mbridge.msdk.setting.i iVar) {
        return iVar.f(com.mbridge.msdk.foundation.controller.c.n().b());
    }

    public static void b(String str, String str2, String str3) {
        gu8.c(str3, str + str2);
    }

    public static void c(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 6:
                return Optional.empty();
            default:
                return ((nex0) obj).a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 5:
                return (StoriesGetQuestionsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoriesGetQuestionsExtendedResponseDto.class).getType())).a();
            case 9:
                return (VkRunSetStepsResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, VkRunSetStepsResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.m83.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
            case 3:
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetExternalStatsTokenResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, RecomSettingsGetRecomThemesResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreGetStockItemsResponseDto.class).getType());
        }
    }

    public /* synthetic */ wga0(izs izsVar, int i) {
        this.b = i;
    }
}
