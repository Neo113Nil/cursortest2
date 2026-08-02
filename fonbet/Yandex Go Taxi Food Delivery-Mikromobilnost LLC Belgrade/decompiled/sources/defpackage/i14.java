package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.PaymentMethodState;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.SaveButtonState;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.util.ArrayList;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class i14 implements ev31 {
    public final Context a;
    public final w530 b;

    public i14(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    public static unn b(ou3 ou3Var, boolean z, MoneyEntity moneyEntity, pln plnVar, AutoTopupType autoTopupType) {
        String str = ou3Var.a;
        Text.Constant i = g8e.i(Text.Companion, plnVar.b);
        Locale locale = tm60.a;
        return new unn(autoTopupType, str, i, new Text.Constant(tm60.e(moneyEntity.getCurrency()).getSymbol()), ou3Var.b, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b14 a(u04 u04Var, rr51 rr51Var) {
        c5z c5zVar;
        c5z c5zVar2;
        SaveButtonState saveButtonState;
        h5a0 h5a0Var;
        h5a0 h5a0Var2;
        PaymentMethodState paymentMethodState;
        String str;
        Text title;
        ThemedImageUrlEntity themedImageUrlEntity;
        String str2;
        String varName;
        MoneyEntity moneyEntity;
        SettingStatus settingStatus;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        SettingStatus settingStatus2;
        s24 s24Var = u04Var.d;
        r24 r24Var = u04Var.e;
        thq0 thq0Var = u04Var.h;
        String str3 = null;
        c5z c5zVar3 = (s24Var == null || (settingStatus2 = s24Var.a) == null) ? null : new c5z(LocalVariableName.AUTOTOPUP_STATE.getVarName(), settingStatus2.getValue());
        c5z c5zVar4 = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : new c5z(LocalVariableName.AUTOTOPUP_AMOUNT.getVarName(), w530.a(this.b, moneyEntity3.getAmount(), moneyEntity3.getCurrency(), false, null, false, 60));
        c5z c5zVar5 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : new c5z(LocalVariableName.AUTOTOPUP_THRESHOLD.getVarName(), w530.a(this.b, moneyEntity2.getAmount(), moneyEntity2.getCurrency(), false, null, false, 60));
        c5z c5zVar6 = (r24Var == null || (settingStatus = r24Var.a) == null) ? null : new c5z(LocalVariableName.AUTOFUND_STATE.getVarName(), settingStatus.getValue());
        c5z c5zVar7 = (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : new c5z(LocalVariableName.AUTOFUND_LIMIT.getVarName(), w530.a(this.b, moneyEntity.getAmount(), moneyEntity.getCurrency(), false, null, false, 60));
        h5a0 h5a0Var3 = thq0Var != null ? thq0Var.a : null;
        Context context = this.a;
        if (h5a0Var3 != null) {
            if (h5a0Var3 instanceof c5a0) {
                themedImageUrlEntity = ((c5a0) h5a0Var3).d;
            } else if (h5a0Var3 instanceof e5a0) {
                themedImageUrlEntity = ((e5a0) h5a0Var3).c.a;
            } else if (h5a0Var3 instanceof f5a0) {
                themedImageUrlEntity = ((f5a0) h5a0Var3).d;
            } else {
                if (!(h5a0Var3 instanceof g5a0)) {
                    w511.b();
                    return null;
                }
                themedImageUrlEntity = ((g5a0) h5a0Var3).g;
            }
            if (themedImageUrlEntity != null) {
                if (themedImageUrlEntity.getDarkUrl() == null || themedImageUrlEntity.getLightUrl() == null) {
                    String lightUrl = themedImageUrlEntity.getLightUrl();
                    str2 = lightUrl == null ? themedImageUrlEntity.getDarkUrl() : lightUrl;
                } else {
                    str2 = job1.b(themedImageUrlEntity, context);
                }
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = null;
            }
            if (str2 != null) {
                boolean f = lob1.f(context);
                if (f) {
                    varName = LocalVariableName.PAYMENT_METHOD_IMAGE_DARK.getVarName();
                } else {
                    if (f) {
                        w511.b();
                        return null;
                    }
                    varName = LocalVariableName.PAYMENT_METHOD_IMAGE_LIGHT.getVarName();
                }
                c5zVar = new c5z(varName, str2);
                c5z c5zVar8 = (h5a0Var3 != null || (title = h5a0Var3.getTitle()) == null) ? null : new c5z(LocalVariableName.PAYMENT_METHOD_TITLE.getVarName(), d.a(context, title).toString());
                f5a0 f5a0Var = !(h5a0Var3 instanceof f5a0) ? (f5a0) h5a0Var3 : null;
                c5z c5zVar9 = (f5a0Var != null || (str = f5a0Var.c) == null) ? null : new c5z(LocalVariableName.PAYMENT_METHOD_SAVING_SUBTITLE.getVarName(), str);
                if (thq0Var != null) {
                    h5a0 h5a0Var4 = thq0Var.a;
                    if (h5a0Var4 instanceof f5a0) {
                        paymentMethodState = PaymentMethodState.SAVING;
                    } else if (h5a0Var4 instanceof e5a0) {
                        paymentMethodState = PaymentMethodState.ME2ME;
                    } else {
                        if (!(h5a0Var4 instanceof c5a0) && !(h5a0Var4 instanceof g5a0) && h5a0Var4 != null) {
                            w511.b();
                            return null;
                        }
                        paymentMethodState = PaymentMethodState.UNSELECTED;
                    }
                    if (paymentMethodState != null) {
                        c5zVar2 = new c5z(LocalVariableName.PAYMENT_METHOD_STATE.getVarName(), paymentMethodState.getValue());
                        String varName2 = LocalVariableName.SAVE_BUTTON_STATE.getVarName();
                        if (u04Var.o) {
                            saveButtonState = SaveButtonState.LOADING;
                        } else {
                            String id = (thq0Var == null || (h5a0Var2 = thq0Var.a) == null) ? null : h5a0Var2.getId();
                            n04 n04Var = (n04) u04Var.a.a();
                            if (n04Var != null && (h5a0Var = n04Var.g) != null) {
                                str3 = h5a0Var.getId();
                            }
                            saveButtonState = (n2b1.j(u04Var) && jl40.l(id, str3)) ? SaveButtonState.SETTINGS_NOT_CHANGED : SaveButtonState.DEFAULT;
                        }
                        return new b14(rr51Var, j73.A(new c5z[]{c5zVar3, c5zVar4, c5zVar5, c5zVar6, c5zVar7, c5zVar2, c5zVar, c5zVar8, c5zVar9, new c5z(varName2, saveButtonState.getValue())}));
                    }
                }
                c5zVar2 = null;
                String varName22 = LocalVariableName.SAVE_BUTTON_STATE.getVarName();
                if (u04Var.o) {
                }
                return new b14(rr51Var, j73.A(new c5z[]{c5zVar3, c5zVar4, c5zVar5, c5zVar6, c5zVar7, c5zVar2, c5zVar, c5zVar8, c5zVar9, new c5z(varName22, saveButtonState.getValue())}));
            }
        }
        c5zVar = null;
        if (h5a0Var3 != null) {
        }
        if (!(h5a0Var3 instanceof f5a0)) {
        }
        if (f5a0Var != null) {
        }
        if (thq0Var != null) {
        }
        c5zVar2 = null;
        String varName222 = LocalVariableName.SAVE_BUTTON_STATE.getVarName();
        if (u04Var.o) {
        }
        return new b14(rr51Var, j73.A(new c5z[]{c5zVar3, c5zVar4, c5zVar5, c5zVar6, c5zVar7, c5zVar2, c5zVar, c5zVar8, c5zVar9, new c5z(varName222, saveButtonState.getValue())}));
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        zu3 zu3Var;
        zu3 vu3Var;
        h5a0 h5a0Var;
        h5a0 h5a0Var2;
        kr3 kr3Var;
        h5a0 h5a0Var3;
        h5a0 h5a0Var4;
        u04 u04Var = (u04) obj;
        u8j0 u8j0Var = u04Var.a;
        u8j0Var.getClass();
        if (u8j0Var instanceof t8j0) {
            return new f14();
        }
        unn unnVar = null;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        n04 n04Var = (n04) u8j0Var.a();
        if (th != null || n04Var == null) {
            return new e14(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        rr51 rr51Var = u04Var.c;
        isz0 isz0Var = u04Var.b;
        if (rr51Var == null || isz0Var == null) {
            return new e14(r501.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535));
        }
        b14 a = a(u04Var, rr51Var);
        c14 c14Var = new c14(a(u04Var, isz0Var.a), a(u04Var, isz0Var.b));
        su3 su3Var = u04Var.g;
        thq0 thq0Var = u04Var.h;
        if (su3Var instanceof ru3) {
            thq0 thq0Var2 = ((ru3) su3Var).a;
            String id = (thq0Var2 == null || (h5a0Var4 = thq0Var2.a) == null) ? null : h5a0Var4.getId();
            String id2 = (thq0Var == null || (h5a0Var3 = thq0Var.a) == null) ? null : h5a0Var3.getId();
            iaa0 iaa0Var = u04Var.i;
            zu3Var = new yu3(odq0.c(this.a, id, id2, iaa0Var != null ? iaa0Var.b : null, null, 48));
        } else if (su3Var instanceof mu3) {
            mu3 mu3Var = (mu3) su3Var;
            AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput = mu3Var.c;
            n04 n04Var2 = (n04) u8j0Var.a();
            if (n04Var2 != null) {
                b24 b24Var = n04Var2.e;
                i5r0 i5r0Var = b24Var.d;
                ArrayList<pln> arrayList = i5r0Var.g;
                ev3 ev3Var = i5r0Var.d;
                ArrayList arrayList2 = new ArrayList();
                for (pln plnVar : arrayList) {
                    int i = h14.a[plnVar.a.ordinal()];
                    if (i == 1) {
                        unnVar = b(mu3Var.a, autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput == AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.AMOUNT, b24Var.b, plnVar, AutoTopupType.AMOUNT);
                    } else if (i == 2) {
                        unnVar = b(mu3Var.b, autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput == AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.THRESHOLD, b24Var.c, plnVar, AutoTopupType.THRESHOLD);
                    } else if (i != 3) {
                        w511.b();
                        return unnVar;
                    }
                    if (unnVar != null) {
                        arrayList2.add(unnVar);
                    }
                    unnVar = null;
                }
                jv3 jv3Var = arrayList2.size() != 2 ? null : new jv3(g8e.i(Text.Companion, i5r0Var.e), new Text.Constant(i5r0Var.f), arrayList2);
                if (jv3Var != null) {
                    zu3Var = new uu3(jv3Var, new YbButtonView.a(g8e.i(Text.Companion, ev3Var.a.a), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Constant(ev3Var.b.a), null, null, null, null, null, null, false, false, null, 4094));
                }
            }
            zu3Var = null;
        } else if (su3Var instanceof lu3) {
            ou3 ou3Var = ((lu3) su3Var).a;
            n04 n04Var3 = (n04) u8j0Var.a();
            if (n04Var3 != null) {
                nr3 nr3Var = n04Var3.f;
                h5r0 h5r0Var = nr3Var.c;
                pln plnVar2 = h5r0Var.g;
                ev3 ev3Var2 = h5r0Var.d;
                if (plnVar2 != null) {
                    Text.Constant i2 = g8e.i(Text.Companion, h5r0Var.e);
                    Text.Constant constant = new Text.Constant(h5r0Var.f);
                    String str = plnVar2.c;
                    Text.Constant e = str != null ? d.e(str) : null;
                    String str2 = ou3Var.a;
                    Text.Constant constant2 = new Text.Constant(plnVar2.b);
                    Locale locale = tm60.a;
                    kr3Var = new kr3(i2, constant, new tnn(constant2, new Text.Constant(tm60.e(nr3Var.b.getCurrency()).getSymbol()), str2, ou3Var.b), e);
                } else {
                    kr3Var = null;
                }
                if (kr3Var != null) {
                    zu3Var = new tu3(kr3Var, new YbButtonView.a(g8e.i(Text.Companion, ev3Var2.a.a), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Constant(ev3Var2.b.a), null, null, null, null, null, null, false, false, null, 4094));
                }
            }
            zu3Var = null;
        } else {
            if (su3Var instanceof pu3) {
                pu3 pu3Var = (pu3) su3Var;
                n04 n04Var4 = (n04) u8j0Var.a();
                pz3 pz3Var = n04Var4 != null ? n04Var4.h.a : null;
                ArrayList arrayList3 = pz3Var != null ? pz3Var.c : null;
                thq0 thq0Var3 = pu3Var.a;
                vu3Var = new wu3(new pdq0(odq0.a(this.a, arrayList3, (thq0Var3 == null || (h5a0Var2 = thq0Var3.a) == null) ? null : h5a0Var2.getId(), (thq0Var == null || (h5a0Var = thq0Var.a) == null) ? null : h5a0Var.getId(), false), d.f(pz3Var != null ? pz3Var.a : null), null, new nbv(nyg0.ybsdk_ic_arrow_short_back, null), null, 32), new YbButtonView.a(d.f(pz3Var != null ? pz3Var.b : null), null, null, null, null, null, null, false, false, null, 4094));
            } else {
                if (su3Var instanceof nu3) {
                    n04 n04Var5 = (n04) u8j0Var.a();
                    if (n04Var5 != null) {
                        mmo mmoVar = n04Var5.i;
                        Text.Constant i3 = g8e.i(Text.Companion, mmoVar.a);
                        String str3 = mmoVar.b;
                        BottomSheetDialogView.State.a aVar = new BottomSheetDialogView.State.a(i3, str3 != null ? d.e(str3) : null, null, null, null, null, HProv.PP_SAME_MEDIA);
                        YbButtonView.a aVar2 = new YbButtonView.a(new Text.Constant(mmoVar.c.a), null, null, null, null, null, null, false, false, null, 4094);
                        dv3 dv3Var = mmoVar.d;
                        vu3Var = new vu3(aVar, aVar2, dv3Var != null ? new YbButtonView.a(new Text.Constant(dv3Var.a), null, null, null, null, null, null, false, false, null, 4094) : null);
                    }
                } else if (su3Var instanceof qu3) {
                    zu3Var = xu3.a;
                } else if (su3Var != null) {
                    w511.b();
                    return null;
                }
                zu3Var = null;
            }
            zu3Var = vu3Var;
        }
        return new d14(a, c14Var, zu3Var);
    }
}
