package defpackage;

import android.os.Looper;
import com.yandex.go.loyalty.impl.common.data.c;
import com.yandex.go.payments.acceptance.data.AcceptancePaymentApi;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.data.PaymentMethodsApi;
import com.yandex.go.payments.data.UnbindPaymentMethodsApi;
import com.yandex.go.payments.sbp.data.SbpTokenApi;
import com.yandex.go.payments.shared.business.accountcreation.corp.CitySuggestApi;
import com.yandex.go.payments.shared.data.CoopAccountApi;
import com.yandex.go.taxi.order.f0;
import com.yandex.messaging.data.a;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.orders.g;

/* loaded from: classes8.dex */
public final class bea0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ bea0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 6;
        final int i3 = 2;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new yo40((lx4) xvf0Var.get());
            case 1:
                return new o370((c) xvf0Var.get());
            case 2:
                return new zf((pho) xvf0Var.get());
            case 3:
                return new t61((pho) xvf0Var.get());
            case 4:
                return new xla0((zbw0) xvf0Var.get());
            case 5:
                return new yla0((zuj0) xvf0Var.get());
            case 6:
                return new x770((pho) xvf0Var.get());
            case 7:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                AcceptancePaymentApi acceptancePaymentApi = (AcceptancePaymentApi) on2Var.a(GoApiName.TaxiV4, AcceptancePaymentApi.class);
                q5z.i(acceptancePaymentApi);
                return acceptancePaymentApi;
            case 8:
                on2 on2Var2 = (on2) xvf0Var.get();
                on2Var2.getClass();
                BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi = (BindUniversalPaymentMethodApi) on2Var2.a(GoApiName.TaxiV4, BindUniversalPaymentMethodApi.class);
                q5z.i(bindUniversalPaymentMethodApi);
                return bindUniversalPaymentMethodApi;
            case 9:
                on2 on2Var3 = (on2) xvf0Var.get();
                on2Var3.getClass();
                CitySuggestApi citySuggestApi = (CitySuggestApi) on2Var3.a(GoApiName.TaxiV4, CitySuggestApi.class);
                q5z.i(citySuggestApi);
                return citySuggestApi;
            case 10:
                on2 on2Var4 = (on2) xvf0Var.get();
                on2Var4.getClass();
                CoopAccountApi coopAccountApi = (CoopAccountApi) on2Var4.a(GoApiName.TaxiV4, CoopAccountApi.class);
                q5z.i(coopAccountApi);
                return coopAccountApi;
            case 11:
                on2 on2Var5 = (on2) xvf0Var.get();
                on2Var5.getClass();
                PaymentMethodsApi paymentMethodsApi = (PaymentMethodsApi) on2Var5.a(GoApiName.TaxiV3, PaymentMethodsApi.class);
                q5z.i(paymentMethodsApi);
                return paymentMethodsApi;
            case 12:
                on2 on2Var6 = (on2) xvf0Var.get();
                on2Var6.getClass();
                SbpTokenApi sbpTokenApi = (SbpTokenApi) on2Var6.a(GoApiName.TaxiV4, SbpTokenApi.class);
                q5z.i(sbpTokenApi);
                return sbpTokenApi;
            case 13:
                on2 on2Var7 = (on2) xvf0Var.get();
                on2Var7.getClass();
                UnbindPaymentMethodsApi unbindPaymentMethodsApi = (UnbindPaymentMethodsApi) on2Var7.a(GoApiName.TaxiV4, UnbindPaymentMethodsApi.class);
                q5z.i(unbindPaymentMethodsApi);
                return unbindPaymentMethodsApi;
            case 14:
                return new ynt(i3, i5m.a(xvf0Var));
            case 15:
                return new sx90((ju6) xvf0Var.get(), 3);
            case 16:
                return new sx90((ju6) xvf0Var.get(), i3);
            case 17:
                final jna0 jna0Var = (jna0) xvf0Var.get();
                jna0Var.getClass();
                final int i4 = 0;
                final int i5 = 8;
                final int i6 = 9;
                final int i7 = 10;
                final int i8 = 12;
                final int i9 = 13;
                final int i10 = 14;
                final int i11 = 15;
                final int i12 = 16;
                final int i13 = 11;
                final int i14 = 17;
                final int i15 = 18;
                final int i16 = 19;
                final int i17 = 20;
                final int i18 = 21;
                final int i19 = 22;
                final int i20 = 23;
                final int i21 = 24;
                final int i22 = 1;
                final int i23 = 3;
                final int i24 = 4;
                final int i25 = 5;
                final int i26 = 6;
                final int i27 = 7;
                return j73.f0(new i231[]{new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i4;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i3;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i5;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i6;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i7;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i8;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i9;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i10;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i11;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i12;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i13;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i14;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i15;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i16;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i17;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i18;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i19;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i20;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i21;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i22;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i23;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i24;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i25;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i26;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }, new i231() { // from class: ina0
                    @Override // defpackage.i231
                    public final c231 create() {
                        int i28 = i27;
                        jna0 jna0Var2 = jna0Var;
                        switch (i28) {
                            case 0:
                                jna0Var2.a.getClass();
                                return new u131("payments.plus.enabled", false);
                            case 1:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.total_debt", "");
                            case 2:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.enabled", false);
                            case 3:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_user_upgraded", false);
                            case 4:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.has_active_split", false);
                            case 5:
                                jna0Var2.f.getClass();
                                return new u131("payments.yb_saver.should_show_promo", false);
                            case 6:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.max_interest_rate", "");
                            case 7:
                                jna0Var2.f.getClass();
                                return new z131("payments.yb_saver.action", "");
                            case 8:
                                jna0Var2.c.getClass();
                                return new u131("payments.yb.has_card", false);
                            case 9:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.balance", "");
                            case 10:
                                jna0Var2.c.getClass();
                                return new z131("payments.yb.currency_sign", "");
                            case 11:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.base_limit", "");
                            case 12:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.enabled", false);
                            case 13:
                                jna0Var2.b.getClass();
                                return new u131("payments.yandex_bank.has_yandex_card", false);
                            case 14:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_balance", "");
                            case 15:
                                jna0Var2.b.getClass();
                                return new z131("payments.yandex_bank.yandex_card_currency_sign", "");
                            case 16:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_available", false);
                            case 17:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.remaining_limit", "");
                            case 18:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.currency_sign", "");
                            case 19:
                                jna0Var2.d.getClass();
                                return new z131("payments.yandex_split.total_debt", "");
                            case 20:
                                jna0Var2.d.getClass();
                                return new u131("payments.yandex_split.is_user_upgraded", false);
                            case 21:
                                jna0Var2.e.getClass();
                                return new u131("payments.yb_split.is_available", false);
                            case 22:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.base_limit", "");
                            case 23:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.remaining_limit", "");
                            default:
                                jna0Var2.e.getClass();
                                return new z131("payments.yb_split.currency_sign", "");
                        }
                    }
                }});
            case 18:
                return new tqa0((b) xvf0Var.get());
            case 19:
                return new kra0((r) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.orders.b((rqo) xvf0Var.get());
            case 21:
                return new f0((g) xvf0Var.get());
            case 22:
                return new kta0((Looper) xvf0Var.get());
            case 23:
                return new a((kse) xvf0Var.get());
            case 24:
                return new rta0(kotlin.a.a(new t9a0(i2, (kb20) xvf0Var.get())));
            case 25:
                return new sta0((jtq0) xvf0Var.get());
            case 26:
                return new bva0((ru.yandex.taxi.perf.screen.c) xvf0Var.get());
            case 27:
                return new yhp((rqo) xvf0Var.get(), 1);
            case 28:
                return new jva0((awa0) xvf0Var.get());
            default:
                return new jxa0((m0c0) xvf0Var.get());
        }
    }
}
