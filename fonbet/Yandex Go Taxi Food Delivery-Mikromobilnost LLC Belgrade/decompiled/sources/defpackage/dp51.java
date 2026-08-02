package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.YapeTokenDto;
import com.yandex.go.payments.data.model.YbCardDto;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.c2;
import com.yandex.go.payments.data.model.x0;
import com.yandex.go.payments.data.model.y0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.messaging.internal.avatar.b;
import com.ybsdk.api.YBSdk;
import com.ybsdk.core.design.theme.ThemeType;
import java.lang.annotation.Annotation;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.taxi.eatskit.dto.YbDepositType;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;
import ru.yandex.taxi.eatskit.dto.YbTransaction$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class dp51 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ dp51(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ThemeType themeType;
        switch (this.a) {
            case 0:
                x0 x0Var = YapeTokenDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 1:
                y0 y0Var = YbCardDto.Companion;
                return new p53(auu0.a, 0);
            case 2:
                y0 y0Var2 = YbCardDto.Companion;
                return YbCardDto.YbCardType.Companion.serializer();
            case 3:
                return vez0.g("com.yandex.go.payments.data.model.YbCardDto.YbCardType", YbCardDto.YbCardType.values(), new String[]{"pro", "pay", "split", null}, new Annotation[][]{null, null, null, null});
            case 4:
                throw new IllegalStateException("YbColors not provided. Wrap your composable with YbTheme { }");
            case 5:
                ThemeType.Companion.getClass();
                themeType = ThemeType.DEFAULT_THEME_TYPE;
                return themeType;
            case 6:
                return vez0.g("ru.yandex.taxi.eatskit.dto.YbDepositType", YbDepositType.values(), new String[]{"exactAmount", "orderAmount"}, new Annotation[][]{null, null});
            case 7:
                return YbStateResponse$YbState.Companion.serializer();
            case 8:
                return new p53(wx51.a, 0);
            case 9:
                return vez0.g("ru.yandex.taxi.eatskit.dto.YbStateResponse.YbState", YbStateResponse$YbState.values(), new String[]{"unavailable", "restricted", "noBankAccount", "unauthenticated", "unauthorized", Constants.NORMAL}, new Annotation[][]{null, null, null, null, null, null});
            case 10:
                ety0 ety0Var = by51.b;
                long E = uh6.E(60);
                long E2 = uh6.E(64);
                lzr lzrVar = lzr.G;
                ety0 a = ety0.a(ety0Var, 0L, E, lzrVar, null, null, uh6.w(-0.01d), null, null, null, 0, E2, null, null, 16646009);
                long E3 = uh6.E(60);
                long E4 = uh6.E(64);
                lzr lzrVar2 = lzr.D;
                ety0 a2 = ety0.a(ety0Var, 0L, E3, lzrVar2, null, null, uh6.w(-0.03d), null, null, null, 0, E4, null, null, 16646009);
                ety0 a3 = ety0.a(ety0Var, 0L, uh6.E(52), lzrVar2, null, null, uh6.w(-0.03d), null, null, null, 0, uh6.E(56), null, null, 16646009);
                ety0 a4 = ety0.a(ety0Var, 0L, uh6.E(40), lzrVar2, null, null, uh6.w(-0.03d), null, null, null, 0, uh6.E(44), null, null, 16646009);
                ety0 a5 = ety0.a(ety0Var, 0L, uh6.E(32), lzrVar2, null, null, uh6.w(-0.03d), null, null, null, 0, uh6.E(36), null, null, 16646009);
                long E5 = uh6.E(24);
                long E6 = uh6.E(26);
                lzr lzrVar3 = lzr.E;
                ety0 a6 = ety0.a(ety0Var, 0L, E5, lzrVar3, null, null, uh6.w(-0.01d), null, null, null, 0, E6, null, null, 16646009);
                ety0 a7 = ety0.a(ety0Var, 0L, uh6.E(18), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137);
                ety0 a8 = ety0.a(ety0Var, 0L, uh6.E(28), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(30), null, null, 16646137);
                ety0 a9 = ety0.a(ety0Var, 0L, uh6.E(40), lzrVar, null, null, 0L, null, null, null, 0, uh6.E(40), null, null, 16646137);
                ety0 a10 = ety0.a(ety0Var, 0L, uh6.E(36), lzrVar, null, null, uh6.w(-0.01d), null, null, null, 0, uh6.E(40), null, null, 16646009);
                ety0 a11 = ety0.a(ety0Var, 0L, uh6.E(42), lzr.I, null, null, uh6.w(-0.01d), null, null, null, 0, uh6.E(42), null, null, 16646009);
                long E7 = uh6.E(72);
                long E8 = uh6.E(72);
                lzr lzrVar4 = lzr.H;
                return new ay51(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, ety0.a(ety0Var, 0L, E7, lzrVar4, null, null, 0L, null, null, null, 0, E8, null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(48), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(52), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(40), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(44), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(32), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(36), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(28), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(32), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(24), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(28), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(18), lzrVar4, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(17), lzrVar4, null, null, uh6.w(0.01d), null, null, null, 0, uh6.E(22), null, null, 16646009), ety0.a(ety0Var, 0L, uh6.E(32), lzrVar3, null, null, uh6.w(-0.02d), null, null, null, 0, uh6.E(34), null, null, 16646009), ety0.a(ety0Var, 0L, uh6.E(26), lzrVar3, null, null, uh6.w(-0.02d), null, null, null, 0, uh6.E(28), null, null, 16646009), ety0.a(ety0Var, 0L, uh6.E(22), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(24), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(20), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(24), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(18), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(16), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(14), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(18), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(18), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(16), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(20), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(14), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(18), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(13), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(16), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(12), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(14), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(11), lzrVar2, null, null, 0L, null, null, null, 0, uh6.E(12), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(13), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(16), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(12), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(14), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(11), lzrVar3, null, null, 0L, null, null, null, 0, uh6.E(12), null, null, 16646137), ety0.a(ety0Var, 0L, uh6.E(11), lzrVar, null, null, 0L, null, null, null, 0, uh6.E(12), null, null, 16646137));
            case 11:
                return YbTransaction$Type.Companion.serializer();
            case 12:
                return vez0.g("ru.yandex.taxi.eatskit.dto.YbTransaction.Type", YbTransaction$Type.values(), new String[]{"debit", "credit"}, new Annotation[][]{null, null});
            case 13:
                throw new IllegalStateException("YbTypography not provided. Wrap your composable with YbTheme { }");
            case 14:
                c2 c2Var = YbWallet.Companion;
                return new p53(auu0.a, 0);
            case 15:
                c2 c2Var2 = YbWallet.Companion;
                return YbCardDto.YbCardType.Companion.serializer();
            case 16:
                return zy11.a;
            case 17:
                return YBSdk.INSTANCE.createViewFactory();
            case 18:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral(LicenseUtility.SEPARATOR).appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            case 19:
                b bVar = ub61.b;
                if (bVar != null) {
                    return bVar;
                }
                ny61.r("Image loader is not set. Use Yx360ImageLoaderConfiguration.setupDefault or WithImageLoader to provide");
                return null;
            case 20:
                return new oz31();
            case 21:
                return new ap2();
            case 22:
                qc61 qc61Var = rc61.Companion;
                return new p53(gsw.a, 0);
            case 23:
                qc61 qc61Var2 = rc61.Companion;
                return new p53(ao0.a, 0);
            case 24:
                tc61 tc61Var = uc61.Companion;
                return new p53(qke.n(y3q0.e), 0);
            default:
                return new a3y0(TaxiOrderLogGroup.MAP.getTag(), "ZoomAnalytics");
        }
    }
}
