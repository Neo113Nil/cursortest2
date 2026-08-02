package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.AddressesTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffDescriptionTextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.header.TariffNameTextStyleUiState;
import defpackage.avj0;
import defpackage.gcx0;
import defpackage.hcx0;
import defpackage.lhc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qje;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isHeaderRedesigned", "isSmallScreen", "Lhcx0;", "<anonymous>", "(ZZ)Lhcx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1", f = "TariffHeaderConfigsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1(o0 o0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = o0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1 tariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1 = new TariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1(this.this$0, (Continuation) obj3);
        tariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1.Z$0 = booleanValue;
        tariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1.Z$1 = booleanValue2;
        return tariffHeaderConfigsUiStateInteractor$tariffHeaderConfigsUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o0 o0Var = this.this$0;
        o0Var.getClass();
        AddressesTextStyleUiState addressesTextStyleUiState = z ? AddressesTextStyleUiState.HEADER_REDESIGNED_TEXT_STYLE : AddressesTextStyleUiState.HEADER_TEXT_STYLE;
        TariffNameTextStyleUiState tariffNameTextStyleUiState = z ? TariffNameTextStyleUiState.CAR_HEADER_REDESIGNED_TEXT_STYLE : TariffNameTextStyleUiState.CAR_HEADER_TEXT_STYLE;
        int i = (!z2 && z) ? 6 : 2;
        TariffDescriptionTextStyleUiState tariffDescriptionTextStyleUiState = z ? TariffDescriptionTextStyleUiState.CAR_HEADER_REDESIGNED_TEXT_STYLE : TariffDescriptionTextStyleUiState.CAR_HEADER_TEXT_STYLE;
        int i2 = (!z2 && z) ? 14 : 2;
        AppColor$Palette appColor$Palette = AppColor$Palette.Text;
        gcx0 gcx0Var = new gcx0(z, appColor$Palette, addressesTextStyleUiState, appColor$Palette, tariffNameTextStyleUiState, appColor$Palette, i, tariffDescriptionTextStyleUiState, appColor$Palette, null, i2, z, 8, appColor$Palette, qje.t(xng0.textMain, ((avj0) o0Var.a).a), appColor$Palette, false, null, null);
        zuj0 zuj0Var = this.this$0.a;
        AddressesTextStyleUiState addressesTextStyleUiState2 = z ? AddressesTextStyleUiState.HEADER_REDESIGNED_TEXT_STYLE : AddressesTextStyleUiState.HEADER_TEXT_STYLE;
        int i3 = (!z2 && z) ? 6 : 2;
        int i4 = z2 ? 2 : z ? 28 : 22;
        int i5 = z2 ? 8 : 20;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.EverFront;
        avj0 avj0Var = (avj0) zuj0Var;
        return new hcx0(gcx0Var, new gcx0(z, appColor$Palette2, addressesTextStyleUiState2, appColor$Palette2, TariffNameTextStyleUiState.BACKGROUND_HEADER_TEXT_STYLE, appColor$Palette2, i3, TariffDescriptionTextStyleUiState.BACKGROUND_HEADER_TEXT_STYLE, appColor$Palette2, q5z.s(lhc.f(qje.t(xng0.everFront, avj0Var.a), Math.abs(HProv.PP_VERSION_TIMESTAMP) & 255)), i4, z, i5, appColor$Palette2, qje.t(xng0.everFront, avj0Var.a), appColor$Palette2, true, appColor$Palette2, Float.valueOf(0.2f)));
    }
}
