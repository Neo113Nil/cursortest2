package xsna;

import com.google.android.gms.internal.cast.zzxp;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.store.dto.StoreStockItemDiscountsDto;
import com.vk.api.generated.stories.dto.StoriesGetTopHashtagsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class caf0 implements f03, b03, Optional.Action, io.reactivex.rxjava3.functions.l, yads.xy0 {
    public final /* synthetic */ int b;

    public /* synthetic */ caf0(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return zzxp.zzv(i) + i2 + i3 + i4;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        VerificationController.lambda$verifySmsCode$14((VerificationListener) obj);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return ((wj8) obj).c;
            default:
                return new yads.kb0((yads.xv) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (StoreStockItemDiscountsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoreStockItemDiscountsDto.class).getType())).a();
            case 2:
                return (StoriesGetTopHashtagsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetTopHashtagsResponseDto.class).getType())).a();
            case 3:
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, RecomSettingsGetAvailableRecomThemesResponseDto.class).getType());
    }

    public /* synthetic */ caf0(zzl0 zzl0Var) {
        this.b = 5;
    }
}
