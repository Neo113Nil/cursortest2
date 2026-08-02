package defpackage;

import com.yandex.go.payments.data.model.CardDto;
import com.yandex.go.payments.data.model.CashDto;
import com.yandex.go.payments.data.model.CashLikeDto;
import com.yandex.go.payments.data.model.ClickWalletDto;
import com.yandex.go.payments.data.model.CorpAccountDto;
import com.yandex.go.payments.data.model.EasypaisaWalletDto;
import com.yandex.go.payments.data.model.FastshiftAccountDto;
import com.yandex.go.payments.data.model.GooglePayDto;
import com.yandex.go.payments.data.model.JazzcashWalletDto;
import com.yandex.go.payments.data.model.KaspiDto;
import com.yandex.go.payments.data.model.MBankAccountDto;
import com.yandex.go.payments.data.model.NequiTokenDto;
import com.yandex.go.payments.data.model.PersonalWalletDto;
import com.yandex.go.payments.data.model.SbpBindTokenDto;
import com.yandex.go.payments.data.model.SbpTokenDto;
import com.yandex.go.payments.data.model.SharedAccountDto;
import com.yandex.go.payments.data.model.TransportCardDto;
import com.yandex.go.payments.data.model.TransportExternalDto;
import com.yandex.go.payments.data.model.UnknownDto;
import com.yandex.go.payments.data.model.YapeTokenDto;
import com.yandex.go.payments.data.model.YbCardDto;
import com.yandex.go.payments.data.model.k0;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;

/* loaded from: classes13.dex */
public final class bty extends lnt {
    public static final bty f = new bty();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, UnknownDto.Companion.serializer(), qoi0.a(UnknownDto.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "type";
    }

    @Override // defpackage.h9
    public final List f() {
        ListPaymentMethodDtoType listPaymentMethodDtoType = ListPaymentMethodDtoType.CASH;
        f9 f9Var = new f9((String) h().invoke(listPaymentMethodDtoType), CashDto.Companion.serializer(), qoi0.a(CashDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType2 = ListPaymentMethodDtoType.CARD;
        f9 f9Var2 = new f9((String) h().invoke(listPaymentMethodDtoType2), CardDto.Companion.serializer(), qoi0.a(CardDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType3 = ListPaymentMethodDtoType.CORP;
        f9 f9Var3 = new f9((String) h().invoke(listPaymentMethodDtoType3), CorpAccountDto.Companion.serializer(), qoi0.a(CorpAccountDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType4 = ListPaymentMethodDtoType.GOOGLE_PAY;
        f9 f9Var4 = new f9((String) h().invoke(listPaymentMethodDtoType4), GooglePayDto.Companion.serializer(), qoi0.a(GooglePayDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType5 = ListPaymentMethodDtoType.PERSONAL_WALLET;
        f9 f9Var5 = new f9((String) h().invoke(listPaymentMethodDtoType5), PersonalWalletDto.Companion.serializer(), qoi0.a(PersonalWalletDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType6 = ListPaymentMethodDtoType.FAMILY_ACCOUNT;
        k0 k0Var = SharedAccountDto.Companion;
        f9 f9Var6 = new f9((String) h().invoke(listPaymentMethodDtoType6), k0Var.serializer(), qoi0.a(SharedAccountDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType7 = ListPaymentMethodDtoType.BUSINESS_ACCOUNT;
        f9 f9Var7 = new f9((String) h().invoke(listPaymentMethodDtoType7), k0Var.serializer(), qoi0.a(SharedAccountDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType8 = ListPaymentMethodDtoType.SBP_TOKEN;
        f9 f9Var8 = new f9((String) h().invoke(listPaymentMethodDtoType8), SbpTokenDto.Companion.serializer(), qoi0.a(SbpTokenDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType9 = ListPaymentMethodDtoType.YB_CARD;
        f9 f9Var9 = new f9((String) h().invoke(listPaymentMethodDtoType9), YbCardDto.Companion.serializer(), qoi0.a(YbCardDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType10 = ListPaymentMethodDtoType.MBANK_ACCOUNT;
        f9 f9Var10 = new f9((String) h().invoke(listPaymentMethodDtoType10), MBankAccountDto.Companion.serializer(), qoi0.a(MBankAccountDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType11 = ListPaymentMethodDtoType.YAPE_TOKEN;
        f9 f9Var11 = new f9((String) h().invoke(listPaymentMethodDtoType11), YapeTokenDto.Companion.serializer(), qoi0.a(YapeTokenDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType12 = ListPaymentMethodDtoType.TRANSPORT_CARD;
        f9 f9Var12 = new f9((String) h().invoke(listPaymentMethodDtoType12), TransportCardDto.Companion.serializer(), qoi0.a(TransportCardDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType13 = ListPaymentMethodDtoType.TRANSPORT_EXTERNAL;
        f9 f9Var13 = new f9((String) h().invoke(listPaymentMethodDtoType13), TransportExternalDto.Companion.serializer(), qoi0.a(TransportExternalDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType14 = ListPaymentMethodDtoType.NEQUI_TOKEN;
        f9 f9Var14 = new f9((String) h().invoke(listPaymentMethodDtoType14), NequiTokenDto.Companion.serializer(), qoi0.a(NequiTokenDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType15 = ListPaymentMethodDtoType.SBP_BIND_TOKEN;
        f9 f9Var15 = new f9((String) h().invoke(listPaymentMethodDtoType15), SbpBindTokenDto.Companion.serializer(), qoi0.a(SbpBindTokenDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType16 = ListPaymentMethodDtoType.KASPI;
        f9 f9Var16 = new f9((String) h().invoke(listPaymentMethodDtoType16), KaspiDto.Companion.serializer(), qoi0.a(KaspiDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType17 = ListPaymentMethodDtoType.CLICK_WALLET;
        f9 f9Var17 = new f9((String) h().invoke(listPaymentMethodDtoType17), ClickWalletDto.Companion.serializer(), qoi0.a(ClickWalletDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType18 = ListPaymentMethodDtoType.EASYPAISA_WALLET;
        f9 f9Var18 = new f9((String) h().invoke(listPaymentMethodDtoType18), EasypaisaWalletDto.Companion.serializer(), qoi0.a(EasypaisaWalletDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType19 = ListPaymentMethodDtoType.JAZZCASH_WALLET;
        f9 f9Var19 = new f9((String) h().invoke(listPaymentMethodDtoType19), JazzcashWalletDto.Companion.serializer(), qoi0.a(JazzcashWalletDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType20 = ListPaymentMethodDtoType.FASTSHIFT_ACCOUNT;
        f9 f9Var20 = new f9((String) h().invoke(listPaymentMethodDtoType20), FastshiftAccountDto.Companion.serializer(), qoi0.a(FastshiftAccountDto.class));
        ListPaymentMethodDtoType listPaymentMethodDtoType21 = ListPaymentMethodDtoType.CASH_LIKE;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, f9Var8, f9Var9, f9Var10, f9Var11, f9Var12, f9Var13, f9Var14, f9Var15, f9Var16, f9Var17, f9Var18, f9Var19, f9Var20, new f9((String) h().invoke(listPaymentMethodDtoType21), CashLikeDto.Companion.serializer(), qoi0.a(CashLikeDto.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return ListPaymentMethodDtoType.Companion.serializer();
    }
}
