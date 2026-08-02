package xsna;

import com.vk.api.generated.esia.dto.EsiaCheckEsiaLinkFlowDto;
import com.vk.api.generated.esia.dto.EsiaGetEsiaUserInfoFlowDto;
import com.vk.superapp.api.dto.esia.EsiaCheckEsiaLinkFlow;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class iit implements efn0 {

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EsiaCheckEsiaLinkFlow.values().length];
            try {
                iArr[EsiaCheckEsiaLinkFlow.VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EsiaCheckEsiaLinkFlow.LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.efn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(String str, EsiaCheckEsiaLinkFlow esiaCheckEsiaLinkFlow) {
        EsiaGetEsiaUserInfoFlowDto esiaGetEsiaUserInfoFlowDto;
        int i = a.$EnumSwitchMapping$0[esiaCheckEsiaLinkFlow.ordinal()];
        if (i == 1) {
            esiaGetEsiaUserInfoFlowDto = EsiaGetEsiaUserInfoFlowDto.VERIFY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            esiaGetEsiaUserInfoFlowDto = EsiaGetEsiaUserInfoFlowDto.LOGIN;
        }
        ufx ufxVar = new ufx("esia.getEsiaUserInfo", new io.reactivex.rxjava3.subjects.c(17), new as(16));
        ufx.n(ufxVar, "esia_sid", str, 0, 12);
        ufx.n(ufxVar, "flow", esiaGetEsiaUserInfoFlowDto.i(), 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.efn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(String str) {
        ufx ufxVar = new ufx("esia.verifyUser", new r11(12), new sf3(10));
        ufx.n(ufxVar, "cua_token", str, 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new d9(new sm(26), 16));
    }

    @Override // xsna.efn0
    public final io.reactivex.rxjava3.internal.operators.single.y c(String str, String str2) {
        ufx ufxVar = new ufx("esia.linkAndVerify", new s11(10), new to(13));
        ufx.n(ufxVar, "esia_sid", str, 0, 12);
        ufx.n(ufxVar, "cua_token", str2, 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new vj0(new kz0(21), 21));
    }

    @Override // xsna.efn0
    public final io.reactivex.rxjava3.internal.operators.single.y d(String str, String str2) {
        ufx ufxVar = new ufx("esia.createLink", new p11(13), new rf3(10));
        ufx.n(ufxVar, "esia_sid", str, 0, 12);
        ufx.n(ufxVar, "cua_token", str2, 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new b9(new qm(27), 20));
    }

    @Override // xsna.efn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 e(EsiaCheckEsiaLinkFlow esiaCheckEsiaLinkFlow) {
        EsiaCheckEsiaLinkFlowDto esiaCheckEsiaLinkFlowDto;
        int i = a.$EnumSwitchMapping$0[esiaCheckEsiaLinkFlow.ordinal()];
        if (i == 1) {
            esiaCheckEsiaLinkFlowDto = EsiaCheckEsiaLinkFlowDto.VERIFY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            esiaCheckEsiaLinkFlowDto = EsiaCheckEsiaLinkFlowDto.LOGIN;
        }
        ufx ufxVar = new ufx("esia.checkEsiaLink", new io.reactivex.rxjava3.processors.b(15), new io.reactivex.rxjava3.subjects.b(17));
        ufx.n(ufxVar, "flow", esiaCheckEsiaLinkFlowDto.i(), 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }
}
