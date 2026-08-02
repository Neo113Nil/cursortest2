package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.d;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.internal.view.chat.b;
import com.yandex.messaging.ui.calls.feedback.a;
import com.yandex.payment.sdk.ui.bind.AdditionalVerifyCardActivity;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.ybsdk.feature.about.internal.presentation.AboutFragment;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import com.ybsdk.widgets.common.AdLabelView;
import com.ybsdk.widgets.common.CircleButtonsListView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.bottombar.BottomBarTabView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.chip.ChipListView;
import ru.yandex.taxi.order.view.AllRatingReasonsView;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.ui.DarkThemeModeModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AboutFragment.render$lambda$2$lambda$1((AboutFragment) obj2, (z561) obj, view);
                break;
            case 1:
                ((y4) obj2).invoke(((n70) obj).Z());
                break;
            case 2:
                n70 n70Var = (n70) obj2;
                irb1.a(n70Var.P, ((t29) n70Var.Z()).c).f(((rz51) obj).c, 0L);
                break;
            case 3:
                AdLabelView.setOnAdLabelClickListener$lambda$3((AdLabelView) obj2, (tls) obj, view);
                break;
            case 4:
                ((j7f) obj2).invoke(Integer.valueOf(((w80) obj).F()));
                break;
            case 5:
                ((x460) obj2).invoke();
                Object obj3 = dgo.a;
                ev5 a = dgo.a(((pwf) ((AdditionalVerifyCardActivity) obj).getBaseComponent$paymentsdk_release()).b());
                if (a != null) {
                    a.a(msb1.N);
                    break;
                }
                break;
            case 6:
                AllRatingReasonsView.updateItemsAndExpand$lambda$0((AllRatingReasonsView) obj2, (r8i0) obj, view);
                break;
            case 7:
                AutoTopupSummaryView.setTooltip$lambda$6((AutoTopupSummaryView) obj2, (String) obj, view);
                break;
            case 8:
                ((ays) obj2).a(((zk4) ((pl4) obj)).d);
                break;
            case 9:
                ((x460) obj2).invoke();
                Object obj4 = dgo.a;
                ev5 a2 = dgo.a(((pwf) ((BindCardActivity) obj).getBaseComponent$paymentsdk_release()).b());
                if (a2 != null) {
                    a2.a(msb1.N);
                    break;
                }
                break;
            case 10:
                BottomBarNavigation.render$lambda$3$lambda$2((BottomBarTabView) obj2, (BottomBarNavigation) obj, view);
                break;
            case 11:
                ((w47) obj2).z.invoke(((oz7) obj).d);
                break;
            case 12:
                ((tls) obj2).invoke((pf7) obj);
                break;
            case 13:
                a aVar = (a) obj2;
                o020 o020Var = (o020) obj;
                euq euqVar = aVar.w;
                Integer num = aVar.M;
                if ((aVar.H == null && aVar.I == null) || num == null) {
                    z83.j("Score and callGuid or meetingId are required to send feedback");
                } else {
                    dh7 dh7Var = new dh7(aVar.H, num.intValue(), kotlin.collections.a.N0(euqVar.B), kotlin.collections.a.N0(euqVar.A), aVar.B.getText().toString(), aVar.I, aVar.J, aVar.K, aVar.L);
                    md6 md6Var = aVar.b;
                    md6Var.getClass();
                    tje.e();
                    b00 b00Var = (b00) md6Var.b;
                    ((Handler) b00Var.a.get()).post(new lz(4, b00Var, (ChatRequest) md6Var.c, dh7Var));
                }
                o020Var.a.finish();
                break;
            case 14:
                j1 j1Var = ((wx7) obj2).c;
                String str = ((ww7) obj).a;
                dVar = ((CancelReasonsV2View) j1Var.b).presenter;
                dVar.Lg(new ux7(str));
                break;
            case 15:
                CardDetailsFragment.showSamsungPayBottomSheet$lambda$52$lambda$50((sls) obj2, (BottomSheetDialogView) obj, view);
                break;
            case 16:
                CardIssueFragment.render$lambda$7$lambda$4$lambda$3((CardIssueFragment) obj2, (yh8) obj, view);
                break;
            case 17:
                b bVar = (b) obj;
                for (String str2 : ((Metadata.ChatbarButton) obj2).links) {
                    c220 c220Var = bVar.y;
                    Uri parse = Uri.parse(str2);
                    bVar.z.getClass();
                    if (c220Var.a(parse)) {
                        break;
                    }
                }
                break;
            case 18:
                ChipListView.chipsAdapterDelegate$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3((ChipListView) obj2, (n70) obj, view);
                break;
            case 19:
                CircleButtonsListView.buttonsAdapterDelegate$lambda$6$lambda$5$lambda$4$lambda$2((CircleButtonsListView) obj2, (n70) obj, view);
                break;
            case 20:
                CodeConfirmationFragment.render$lambda$10$lambda$9((v9c) obj2, (CodeConfirmationFragment) obj, view);
                break;
            case 21:
                ((fce) obj2).a.accept((fde) obj);
                break;
            case 22:
                ((tls) ((qze) obj2).w).invoke(Integer.valueOf(((pze) obj).F()));
                break;
            case 23:
                CreditDepositFragment.onViewCreated$lambda$14$lambda$9((CreditDepositFragment) obj2, (q661) obj, view);
                break;
            case 24:
                ((tdg) obj2).h().setVisibility(8);
                ((View.OnClickListener) obj).onClick(view);
                break;
            case 25:
                DarkThemeModeModalView.getThemeModeItemView$lambda$1((DarkThemeModeModalView) obj2, (ThemeChangeMode) obj, view);
                break;
            case 26:
                ((tls) obj2).invoke(Uri.parse((String) obj));
                break;
            case 27:
                n70 n70Var2 = (n70) obj;
                ((mjg) obj2).invoke(((bwz0) n70Var2.Z()).a, ((bwz0) n70Var2.Z()).c);
                break;
            case 28:
                ((zah) obj2).c.setEnabled(false);
                ((abh) obj).a.a(new jxl(true));
                break;
            default:
                rvh rvhVar = (rvh) obj2;
                rvhVar.T.e((hki) obj);
                rvhVar.S.b();
                ((c1x) ((zo31) rvhVar.R)).c.hide(true);
                break;
        }
    }
}
