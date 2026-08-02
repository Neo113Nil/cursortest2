package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.div.legacy.view.DivView;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.taxi.order.info.OrderInfoContentView;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import com.yandex.messaging.input.ChatInputEditText;
import com.yandex.messaging.internal.view.input.UnderKeyboardLinearLayout;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.payment.sdk.ui.common.ResultFragment;
import com.yandex.payment.sdk.ui.payment.sbp.BankAppsAdapter;
import com.yandex.plus.acquisition.adapter.internal.controller.a;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.sharedpayments.AccountLinkingInfoFullscreenModalView;

/* loaded from: classes15.dex */
public final /* synthetic */ class nl implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ nl(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        Object obj = this.c;
        Object obj2 = this.w;
        Object obj3 = this.b;
        switch (i4) {
            case 0:
                AccountLinkingInfoFullscreenModalView._init_$lambda$1((aap) obj3, (SharedPaymentContext) obj, (AccountLinkingInfoFullscreenModalView) obj2, view);
                break;
            case 1:
                fl2 fl2Var = (fl2) obj3;
                fl2Var.P.clearFocus();
                ((View) obj).clearFocus();
                ((j7f) obj2).invoke(Integer.valueOf(fl2Var.F()));
                break;
            case 2:
                np4 np4Var = (np4) obj3;
                BankAppsAdapter bankAppsAdapter = (BankAppsAdapter) obj;
                mp4 mp4Var = (mp4) obj2;
                if (np4Var.F() != -1) {
                    int F = np4Var.F();
                    i = bankAppsAdapter.selectedIndex;
                    if (F != i) {
                        i2 = bankAppsAdapter.selectedIndex;
                        bankAppsAdapter.notifyItemChanged(i2);
                        bankAppsAdapter.notifyItemChanged(np4Var.F());
                        bankAppsAdapter.selectedIndex = np4Var.F();
                        wls wlsVar = np4Var.O;
                        String str = mp4Var.b;
                        i3 = bankAppsAdapter.selectedIndex;
                        wlsVar.invoke(str, Integer.valueOf(i3));
                        break;
                    }
                }
                break;
            case 3:
                PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params = (PlusAcquisitionPaymentAnalytics$Params) obj;
                a aVar = (a) obj2;
                cb5 cb5Var = ((x17) obj3).m;
                if (cb5Var != null) {
                    cb5Var.f(plusAcquisitionPaymentAnalytics$Params, aVar);
                    break;
                }
                break;
            case 4:
                ((tls) obj3).invoke(null);
                ((sls) obj2).invoke();
                break;
            case 5:
                ((tbb) obj3).invoke((hf7) obj, (CalendarDayView) obj2);
                break;
            case 6:
                ((DivView) obj3).lambda$setActionHandlerForView$0((View) obj, (x3k) obj2, view);
                break;
            case 7:
                UnderKeyboardLinearLayout underKeyboardLinearLayout = (UnderKeyboardLinearLayout) obj3;
                yvf0 yvf0Var = (yvf0) obj;
                ChatInputEditText chatInputEditText = ((com.yandex.messaging.internal.view.input.edit.a) obj2).D;
                if (underKeyboardLinearLayout.getChildCount() == 0) {
                    rtn rtnVar = (rtn) yvf0Var.get();
                    gym gymVar = new gym(chatInputEditText);
                    rtnVar.b = gymVar;
                    rtnVar.d.c = gymVar;
                    underKeyboardLinearLayout.addView(rtnVar.a);
                }
                if (!underKeyboardLinearLayout.isShown()) {
                    underKeyboardLinearLayout.show();
                    break;
                } else {
                    chatInputEditText.requestFocusAndOpenKeyboard();
                    break;
                }
            case 8:
                ClipboardManager clipboardManager = (ClipboardManager) obj3;
                tkz tkzVar = (tkz) obj;
                skz skzVar = (skz) obj2;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(((hdd0) tkzVar.getItem(skzVar.F())).c, ((TextView) skzVar.N.a(skz.O[0])).getText()));
                    break;
                }
                break;
            case 9:
                LogsFragment.setupScrollUpButton$lambda$4((RecyclerView) obj3, (tkz) obj, (FloatingActionButton) obj2, view);
                break;
            case 10:
                ((BottomSheetDialog) obj3).dismiss();
                ((xs10) obj).b.a(MessageMenuReporter$Item.DELETE_CONFIRM);
                ((Runnable) obj2).run();
                break;
            case 11:
                OrderInfoContentView.fillCarInfo$lambda$0((OrderInfoContentView) obj3, (qim) obj, (String) obj2, view);
                break;
            case 12:
                cg91.c(((i261) obj3).a, ok31.c);
                ((i4b0) obj).invoke((l9b0) obj2);
                break;
            case 13:
                ResultFragment.handleSuccess$lambda$1$0$0((Bundle) obj3, (ResultFragment) obj, (cn90) obj2, view);
                break;
            case 14:
                u2m0 u2m0Var = (u2m0) obj;
                ((wls) obj3).invoke(d.a(((n70) obj2).P, u2m0Var.b).toString(), u2m0Var.c);
                break;
            case 15:
                SettingsFragment.showWipeNfcDialogBottomSheet$lambda$16$lambda$13((SettingsFragment) obj3, (Ref$BooleanRef) obj, (BottomSheetDialogView) obj2, view);
                break;
            case 16:
                ((wls) ((vp4) obj3).T).invoke(((tkr0) obj).a.b, (EditContactNameConfigDto) obj2);
                break;
            case 17:
                CheckBoxView checkBoxView = (CheckBoxView) obj2;
                if (((Boolean) ((lav0) obj3).c.invoke((CashbackSelectorCategoryEntity) obj)).booleanValue()) {
                    checkBoxView.toggle();
                    break;
                }
                break;
            default:
                h7x0 h7x0Var = (h7x0) obj3;
                r8i0 r8i0Var = h7x0Var.a;
                boolean z = !r8i0Var.c;
                r8i0Var.c = z;
                ((g7x0) obj).d.setSelectedItem(z);
                s8i0 s8i0Var = ((com.yandex.go.taxi.order.feedback.tag.a) obj2).g;
                if (s8i0Var != null) {
                    s8i0Var.c(h7x0Var.d, h7x0Var.a.c);
                    break;
                }
                break;
        }
    }
}
