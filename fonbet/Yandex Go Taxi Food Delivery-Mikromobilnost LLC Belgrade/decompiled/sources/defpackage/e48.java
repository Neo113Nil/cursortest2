package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.camera2.internal.s;
import androidx.concurrent.futures.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.samsung.android.sdk.samsungpay.v2.ErrorType;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;
import com.yandex.go.chargers.discovery.shortcuts.c;
import com.yandex.go.places.complaint.impl.ui.modal.ComplaintModalView;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewState$CodeState;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.OtpValidationResultEntity$Error$Type;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.banners.CardBannerV1ModalView;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.cashback.analytics.CashbackAnalyticsImpl$CashbackNotificationContext;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.superapp.shortcuts.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class e48 implements el7, r48, o88, kds, zqx, PartnerRequest.b, ai60, mep0, u1d0, pj21, yp11, go3, xe4, rl3, a9f, ev31, pi, xv51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e48(hez0 hez0Var, i9c i9cVar) {
        this.a = 27;
        this.b = i9cVar;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ((u5b) this.b).b((ChatMutingsBucket) obj);
    }

    @Override // defpackage.zqx
    public void a(List list) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                CardBannerV1ModalView.setData$lambda$0((CardBannerV1ModalView) obj, list);
                break;
            default:
                CardBannerV2ModalView.setData$lambda$2((CardBannerV2ModalView) obj, list);
                break;
        }
    }

    @Override // defpackage.xv51
    public void b() {
        e eVar = (e) this.b;
        if (eVar.E0.d() instanceof jw51) {
            eVar.F0.a();
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.PartnerRequest.b
    public void d(ErrorType errorType, int i, Bundle bundle) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 7:
                CardManager.r((g4t) obj, errorType, i, bundle);
                break;
            default:
                CardManager.p((t90) obj, errorType, i, bundle);
                break;
        }
    }

    @Override // defpackage.r48
    public void e(String str, CopyInfoType copyInfoType, CopySource copySource) {
        m48 m48Var = (m48) this.b;
        jj10 jj10Var = m48Var.c;
        int i = l48.a[copyInfoType.ordinal()];
        if (i == 1) {
            String alias = copySource.getAlias();
            jj10Var.getClass();
            HashMap hashMap = new HashMap();
            if (alias != null) {
                hashMap.put("source", alias);
            }
            jj10Var.a.a("Menu.CopyCarPlateFullNumber.Tapped", hashMap, 1, new HashMap());
        } else if (i == 2) {
            String alias2 = copySource.getAlias();
            jj10Var.getClass();
            HashMap hashMap2 = new HashMap();
            if (alias2 != null) {
                hashMap2.put("source", alias2);
            }
            jj10Var.a.a("Menu.CopyCarModelDetails.Tapped", hashMap2, 1, new HashMap());
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            String alias3 = copySource.getAlias();
            jj10Var.getClass();
            HashMap hashMap3 = new HashMap();
            if (alias3 != null) {
                hashMap3.put("source", alias3);
            }
            jj10Var.a.a("Menu.CopyCarPlateFullNumberAndCarDetails.Tapped", hashMap3, 1, new HashMap());
        }
        m48Var.a(str, copyInfoType, copySource);
    }

    @Override // defpackage.yp11
    public void f(String str) {
        ((e4b) this.b).Z().e(str);
    }

    @Override // defpackage.rl3
    public String g() {
        return ((heb) this.b).d.d;
    }

    @Override // defpackage.u1d0
    public void h(w7o w7oVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                ((dz30) obj).r(new qu(9));
                break;
            default:
                ((nm7) obj).run();
                break;
        }
    }

    @Override // defpackage.ai60
    public void i(boolean z) {
        x39 x39Var = (x39) this.b;
        if (z) {
            x39Var.c.b.i(CashbackAnalyticsImpl$CashbackNotificationContext.PAYMENT_METHOD_CHANGE.getContext(), null);
        }
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        String str;
        s sVar = (s) this.b;
        synchronized (sVar.a) {
            d6z.y("Release completer expected to be null", sVar.l == null);
            sVar.l = bVar;
            str = "Release[session=" + sVar + "]";
        }
        return str;
    }

    @Override // defpackage.mep0
    public a k(dgp0 dgp0Var) {
        c cVar = (c) this.b;
        tse tseVar = cVar.b;
        mx9 mx9Var = new mx9(cVar);
        i47 i47Var = cVar.g;
        xpa xpaVar = cVar.e;
        dgp0Var.getClass();
        return new a(tseVar, dgp0Var.a, i47Var, xpaVar, mx9Var);
    }

    @Override // defpackage.a9f
    public Object l(m mVar) {
        return (Fragment) this.b;
    }

    @Override // defpackage.pj21
    public void m() {
        ((s3b) this.b).q();
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        boolean onAttachedToWindow$lambda$0;
        onAttachedToWindow$lambda$0 = ComplaintModalView.onAttachedToWindow$lambda$0((ComplaintModalView) this.b, view, hiVar);
        return onAttachedToWindow$lambda$0;
    }

    @Override // defpackage.xe4
    public boolean onBackClick() {
        boolean lambda$new$1;
        lambda$new$1 = ((ChatSearchToolbarBrick) this.b).lambda$new$1();
        return lambda$new$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0317  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        Text.Join join;
        rtz0 rtz0Var;
        ktv ktvVar;
        String str;
        jbs0 jbs0Var;
        stz0 stz0Var;
        OtpResponseDataEntity.CodeFormat codeFormat;
        Text text;
        boolean z;
        stz0 stz0Var2;
        jbs0 jbs0Var2;
        boolean z2;
        boolean z3;
        ColorModel.Attr attr;
        int secondsToAction;
        i9c i9cVar = (i9c) this.b;
        com.ybsdk.screens.registration.codeconfirmation.presentation.a aVar = (com.ybsdk.screens.registration.codeconfirmation.presentation.a) obj;
        CodeConfirmationParams.HeaderText headerText = aVar.a;
        boolean z4 = aVar.l;
        u8j0 u8j0Var = aVar.h;
        u8j0 u8j0Var2 = aVar.d;
        OtpResponseDataEntity otpResponseDataEntity = (OtpResponseDataEntity) u8j0Var2.a();
        if (otpResponseDataEntity != null) {
            join = (otpResponseDataEntity.getStatus() != OtpResponseDataEntity.Status.FAILED && (secondsToAction = otpResponseDataEntity.getSecondsToAction() - ((int) ((aVar.f - aVar.e) / 1000))) > 0) ? new Text.Join(scc.g(unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_request_another_sms_code), new Text.Constant(String.valueOf(secondsToAction)), new Text.Plural(gwh0.ybsdk_common_seconds, secondsToAction)), " ") : null;
        } else {
            join = null;
        }
        CodeConfirmationParams.HeaderImage headerImage = aVar.c;
        boolean z5 = headerImage instanceof CodeConfirmationParams.HeaderImage.Url;
        rtz0 rtz0Var2 = qtz0.a;
        if (z5) {
            rtz0Var = new ptz0(new pbv(((CodeConfirmationParams.HeaderImage.Url) headerImage).getUrl(), (ccv) null, rev.n, (dcv) null, (vfv) null, 58));
        } else if (headerImage instanceof CodeConfirmationParams.HeaderImage.Resource) {
            rtz0Var = new ptz0(new nbv(((CodeConfirmationParams.HeaderImage.Resource) headerImage).getDrawableRes(), null));
        } else if (jl40.l(headerImage, CodeConfirmationParams.HeaderImage.CloseButton.INSTANCE)) {
            rtz0Var = new ntz0(0);
        } else {
            if (headerImage != null) {
                w511.b();
                return null;
            }
            rtz0Var = rtz0Var2;
        }
        boolean z6 = (u8j0Var != null ? (wr80) u8j0Var.a() : null) instanceof ur80;
        wr80 wr80Var = u8j0Var != null ? (wr80) u8j0Var.a() : null;
        ur80 ur80Var = wr80Var instanceof ur80 ? (ur80) wr80Var : null;
        Text text2 = ur80Var != null ? ur80Var.a : null;
        OtpResponseDataEntity otpResponseDataEntity2 = (OtpResponseDataEntity) u8j0Var2.a();
        Text hint = otpResponseDataEntity2 != null ? otpResponseDataEntity2.getHint() : null;
        if (u8j0Var == null || !(u8j0Var instanceof t8j0)) {
            ktvVar = ((ur80Var != null ? ur80Var.d : null) == OtpValidationResultEntity$Error$Type.CODE_MISMATCH || text2 == null) ? hint != null ? new ktv(hint, Integer.valueOf(ung0.ybColor_textIcon_primary)) : null : new ktv(text2, Integer.valueOf(ung0.ybColor_textIcon_negative));
        } else {
            ktvVar = new ktv(unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_checking_code), Integer.valueOf(ung0.ybColor_textIcon_secondary));
        }
        boolean z7 = join == null;
        boolean z8 = (u8j0Var2 instanceof t8j0) || u8j0Var2.b();
        rtz0 rtz0Var3 = ((rtz0Var instanceof ntz0) && u8j0Var != null && (u8j0Var instanceof t8j0)) ? rtz0Var2 : rtz0Var;
        OtpResponseDataEntity otpResponseDataEntity3 = (OtpResponseDataEntity) u8j0Var2.a();
        if (otpResponseDataEntity3 == null || (str = otpResponseDataEntity3.getSupportUrl()) == null) {
            wr80 wr80Var2 = u8j0Var != null ? (wr80) u8j0Var.a() : null;
            ur80 ur80Var2 = wr80Var2 instanceof ur80 ? (ur80) wr80Var2 : null;
            str = ur80Var2 != null ? ur80Var2.c : null;
        }
        int i = headerText instanceof CodeConfirmationParams.HeaderText.UniversalText ? dzh0.ybsdk_sms_code_confirmation_enter_phone_code_pronoun_subtitle : dzh0.ybsdk_sms_code_confirmation_request_sms_phone_title;
        ws51 ws51Var = aVar.j;
        if (ws51Var != null) {
            Text text3 = ws51Var.c;
            if (text3 == null) {
                text3 = ws51Var.b;
            }
            jbs0Var = new jbs0(text3, 8, l1i0.Widget_YB_Text_Body3, 28, w5b1.d(ws51Var, nyg0.ybsdk_ic_person_avatar_unknown));
        } else {
            jbs0Var = null;
        }
        boolean z9 = i9cVar instanceof com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b;
        s8j0 s8j0Var = u8j0Var2 instanceof s8j0 ? (s8j0) u8j0Var2 : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        kao a = r501.a(failDataException, unr0.h(Text.Companion, dzh0.ybsdk_change_phone_change_phone_no_attempts_left_title), new Text.Resource(dzh0.ybsdk_change_phone_change_phone_no_attempts_left_subtitle), new Text.Resource(dzh0.ybsdk_common_button_reload), new Text.Resource(dzh0.ybsdk_common_send_message_to_support), null, null, null, null, null, null, null, null, 65474);
        if (!z9 || failDataException == null) {
            a = null;
        }
        if (!z4 || a == null) {
            Text.Empty empty = Text.Empty.INSTANCE;
            stz0Var = new stz0(empty, empty, null, null, null, rtz0Var3, false, null, null, null, null, null, 32732);
        } else {
            Text.Empty empty2 = Text.Empty.INSTANCE;
            nbv nbvVar = new nbv(nyg0.ybsdk_ic_arrow_short_back, null);
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_common_accessability_back_title);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            stz0Var = new stz0(empty2, empty2, null, nbvVar, resource, rtz0Var3, false, null, null, null, null, null, 28612);
        }
        boolean z10 = (u8j0Var == null || !(u8j0Var instanceof t8j0)) && (!z9 || z4);
        boolean z11 = aVar.k && z4;
        boolean z12 = (str == null || z9) ? false : true;
        boolean z13 = str == null && aVar.m && !z9;
        Text.Resource resource2 = z12 ? new Text.Resource(dzh0.ybsdk_sms_code_confirmation_support_chat_button_title) : new Text.Resource(dzh0.ybsdk_sms_code_confirmation_return_back_button_title);
        Text c = i9cVar.c((OtpResponseDataEntity) u8j0Var2.a(), Integer.valueOf(i));
        if (c == null) {
            c = new Text.Resource(dzh0.ybsdk_sms_code_confirmation_pin_request_sms_info_title);
        }
        boolean z14 = !z8 && (u8j0Var == null || !(u8j0Var instanceof t8j0));
        OtpResponseDataEntity otpResponseDataEntity4 = (OtpResponseDataEntity) u8j0Var2.a();
        if (otpResponseDataEntity4 == null || (codeFormat = otpResponseDataEntity4.getCodeFormat()) == null) {
            codeFormat = OtpResponseDataEntity.CodeFormat.DIGIT_6;
        }
        int digitsAmount = codeFormat.getDigitsAmount();
        if (u8j0Var == null || !(u8j0Var instanceof t8j0)) {
            text = null;
            z = false;
        } else {
            text = null;
            z = true;
        }
        if (z7 && z8) {
            stz0Var2 = stz0Var;
            jbs0Var2 = jbs0Var;
            z2 = true;
        } else {
            stz0Var2 = stz0Var;
            jbs0Var2 = jbs0Var;
            z2 = false;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Text text4 = ktvVar != null ? ktvVar.a : text;
        Integer num = ktvVar != null ? ktvVar.b : text;
        Text header = headerText.getHeader();
        if (u8j0Var != null) {
            boolean z15 = u8j0Var instanceof t8j0;
            z3 = true;
            if (z15) {
                attr = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                boolean z16 = jbs0Var2 == null ? z3 : false;
                boolean z17 = (z9 || (z4 && a != null)) ? false : z3;
                boolean z18 = aVar.m;
                CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState = aVar.n;
                CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState2 = CodeConfirmationViewState$CodeState.ERROR;
                return new v9c(stz0Var2, c, z14, digitsAmount, z, z6, z7, z2, z12, z13, resource2, str2, z10, z11, text4, attr, num, join, jbs0Var2, header, z16, z17, z18, (codeConfirmationViewState$CodeState == codeConfirmationViewState$CodeState2 || z18) ? z3 : false, !z18 ? codeConfirmationViewState$CodeState2 : codeConfirmationViewState$CodeState, aVar.i, a, z9);
            }
        } else {
            z3 = true;
        }
        attr = text;
        if (jbs0Var2 == null) {
        }
        if (z9) {
        }
        boolean z182 = aVar.m;
        CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState3 = aVar.n;
        CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState22 = CodeConfirmationViewState$CodeState.ERROR;
        return new v9c(stz0Var2, c, z14, digitsAmount, z, z6, z7, z2, z12, z13, resource2, str2, z10, z11, text4, attr, num, join, jbs0Var2, header, z16, z17, z182, (codeConfirmationViewState$CodeState3 == codeConfirmationViewState$CodeState22 || z182) ? z3 : false, !z182 ? codeConfirmationViewState$CodeState22 : codeConfirmationViewState$CodeState3, aVar.i, a, z9);
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                CardActivationFragment.onCreate$lambda$6((CardActivationFragment) obj, str, bundle);
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                CheckPinFragment.onCreate$lambda$7((CheckPinFragment) obj, str, bundle);
                break;
            case 6:
                CardDeletionFragment.onCreate$lambda$0((CardDeletionFragment) obj, str, bundle);
                break;
            case 9:
                CardPinCodeFragment.onCreate$lambda$0((CardPinCodeFragment) obj, str, bundle);
                break;
            case 10:
                CardReissueFragment.onViewCreated$lambda$7((CardReissueFragment) obj, str, bundle);
                break;
            case 11:
                CardSetStatusProcessingFragment.onCreate$lambda$0((CardSetStatusProcessingFragment) obj, str, bundle);
                break;
            case 12:
                CashbackDashboardFragment.onViewCreated$lambda$5((CashbackDashboardFragment) obj, str, bundle);
                break;
        }
    }

    public /* synthetic */ e48(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
