package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.adjust.sdk.Constants;
import com.ybsdk.api.DepositType;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.YBSdkScreenIntent$App;
import com.ybsdk.api.YBSdkScreenIntent$CreateRebindPaymentMethodScreen;
import com.ybsdk.api.YBSdkScreenIntent$Deeplink;
import com.ybsdk.api.YBSdkScreenIntent$DepositAmount;
import com.ybsdk.api.YBSdkScreenIntent$DepositMoney;
import com.ybsdk.api.YBSdkScreenIntent$SplitContractDraft;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$LaunchScreenRequested;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.navigation.InternalScreenIntent;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DefaultProductForDashboardSchema;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class ph51 implements mh51 {
    public final FragmentActivity a;
    public final pg51 b;
    public final vh51 c;
    public final Map d;
    public final tvv e;
    public lh51 f;

    public ph51(FragmentActivity fragmentActivity, pg51 pg51Var, vh51 vh51Var, Map map, tvv tvvVar) {
        this.a = fragmentActivity;
        this.b = pg51Var;
        this.c = vh51Var;
        this.d = map;
        this.e = tvvVar;
    }

    public static CommonEvents$LaunchScreenRequested c(vh51 vh51Var) {
        if (vh51Var instanceof YBSdkScreenIntent$App) {
            return CommonEvents$LaunchScreenRequested.HOME;
        }
        if (vh51Var instanceof YBSdkScreenIntent$Deeplink) {
            return CommonEvents$LaunchScreenRequested.DEEPLINK;
        }
        if (vh51Var instanceof th51) {
            return CommonEvents$LaunchScreenRequested.HOME;
        }
        if (vh51Var instanceof qh51) {
            return CommonEvents$LaunchScreenRequested.CHECK_CARD;
        }
        if (vh51Var instanceof uh51) {
            return CommonEvents$LaunchScreenRequested.HOME;
        }
        if (vh51Var instanceof rh51) {
            return CommonEvents$LaunchScreenRequested.CREATE_CARD;
        }
        if (vh51Var instanceof YBSdkScreenIntent$DepositMoney) {
            return CommonEvents$LaunchScreenRequested.TOPUP;
        }
        if (vh51Var instanceof sh51) {
            return CommonEvents$LaunchScreenRequested.CREDIT_LIMIT_DASHBOARD;
        }
        if (vh51Var instanceof YBSdkScreenIntent$CreateRebindPaymentMethodScreen) {
            return CommonEvents$LaunchScreenRequested.CREATE_REBIND_PAYMENT_METHOD;
        }
        if (vh51Var instanceof YBSdkScreenIntent$SplitContractDraft) {
            return CommonEvents$LaunchScreenRequested.SPLIT_CONTRACT_DRAFT_FLOW;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.mh51
    public final void a(hpo0 hpo0Var) {
        String str;
        Object failure;
        lh51 lh51Var = this.f;
        if (lh51Var != null) {
            lh51Var.b();
        }
        FragmentActivity fragmentActivity = this.a;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        NavigationFragment.Companion.getClass();
        str = NavigationFragment.FRAGMENT_TAG;
        Fragment F = supportFragmentManager.F(str);
        if (F != null) {
            NavigationFragment navigationFragment = F instanceof NavigationFragment ? (NavigationFragment) F : null;
            if (navigationFragment != null) {
                try {
                    FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    a aVar = new a(supportFragmentManager2);
                    aVar.p(navigationFragment);
                    aVar.n();
                    if (hpo0Var != null) {
                        hpo0Var.run();
                    }
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    if (!(a instanceof IllegalStateException)) {
                        x4c.g("Removing NavigationFragment ends with an unexpected error", a, null, null, 12);
                    }
                    new Handler(Looper.getMainLooper()).post(new ud30(1, fragmentActivity, navigationFragment, hpo0Var));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, zva0] */
    public final void b(ViewGroup viewGroup, lh51 lh51Var) {
        InternalScreenIntent internalScreenIntent;
        InternalScreenIntent internalScreenIntent2;
        DepositType depositType;
        String str;
        YBSdk yBSdk = YBSdk.INSTANCE;
        awa0 awa0Var = (awa0) ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).w0.get();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        awa0Var.getClass();
        ref$ObjectRef.element = new zva0(awa0Var, "BankSdkScreen.ShowTime");
        this.f = lh51Var;
        vh51 vh51Var = this.c;
        LinkedHashMap linkedHashMap = null;
        if (vh51Var instanceof YBSdkScreenIntent$App) {
            internalScreenIntent = ((YBSdkScreenIntent$App) vh51Var).getHasUid() ? new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.Products.INSTANCE, DeeplinkNavigation.Add.INSTANCE), c(this.c)) : new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.AuthLanding.INSTANCE, DeeplinkNavigation.ReplaceRoot.INSTANCE), c(this.c));
        } else if (vh51Var instanceof YBSdkScreenIntent$Deeplink) {
            internalScreenIntent = new InternalScreenIntent(((YBSdkScreenIntent$Deeplink) this.c).getDeeplink$yb_sdk_sdkRelease(), c(this.c));
        } else if (vh51Var.equals(qh51.a) || vh51Var.equals(rh51.a) || vh51Var.equals(th51.a)) {
            b bVar = (b) ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).A.get();
            bVar.getClass();
            internalScreenIntent = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.DashboardAction(((DefaultProductForDashboardSchema) bVar.d(lih.a).getData()).getProduct().getProductId(), null, null, null, 8, null), DeeplinkNavigation.Add.INSTANCE), c(this.c));
        } else if (vh51Var.equals(uh51.a)) {
            internalScreenIntent = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.Products.INSTANCE, DeeplinkNavigation.Add.INSTANCE), c(this.c));
        } else {
            if (vh51Var instanceof YBSdkScreenIntent$DepositMoney) {
                YBSdkScreenIntent$DepositAmount amount = ((YBSdkScreenIntent$DepositMoney) this.c).getAmount();
                DeeplinkAction.Topup.DepositAmount depositAmount = amount != null ? new DeeplinkAction.Topup.DepositAmount(amount.getCurrencyCode(), amount.getAmount()) : null;
                YBSdkScreenIntent$DepositAmount amount2 = ((YBSdkScreenIntent$DepositMoney) this.c).getAmount();
                if (amount2 == null || (depositType = amount2.getDepositType()) == null) {
                    depositType = DepositType.ExactAmount;
                }
                DepositType depositType2 = depositType;
                YBSdkScreenIntent$DepositAmount amount3 = ((YBSdkScreenIntent$DepositMoney) this.c).getAmount();
                internalScreenIntent2 = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Topup(depositAmount, true, null, depositType2, amount3 != null ? amount3.getSuppressTopupNotice() : false, null, false, false, ((YBSdkScreenIntent$DepositMoney) this.c).getPaymentMethodId(), null, null, 1764, null), DeeplinkNavigation.ReplaceRoot.INSTANCE), c(this.c));
            } else if (vh51Var.equals(sh51.a)) {
                internalScreenIntent = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.CreditLimit.INSTANCE, DeeplinkNavigation.ReplaceRoot.INSTANCE), c(this.c));
            } else if (vh51Var instanceof YBSdkScreenIntent$CreateRebindPaymentMethodScreen) {
                internalScreenIntent = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.RebindPaymentMethod(((YBSdkScreenIntent$CreateRebindPaymentMethodScreen) this.c).getPaymentMethodId()), DeeplinkNavigation.ReplaceRoot.INSTANCE), c(this.c));
            } else {
                if (!(vh51Var instanceof YBSdkScreenIntent$SplitContractDraft)) {
                    w511.b();
                    return;
                }
                List<YBSdkScreenIntent$SplitContractDraft.Cart.Item> items = ((YBSdkScreenIntent$SplitContractDraft) this.c).getCart().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                for (YBSdkScreenIntent$SplitContractDraft.Cart.Item item : items) {
                    arrayList.add(new DeeplinkAction.PdfLoad.SplitContractDraft.Cart.Item(item.getTitle(), item.getCount()));
                }
                internalScreenIntent2 = new InternalScreenIntent(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.PdfLoad.SplitContractDraft(new DeeplinkAction.PdfLoad.SplitContractDraft.Cart(arrayList, ((YBSdkScreenIntent$SplitContractDraft) this.c).getCart().getTotalAmount()), ((YBSdkScreenIntent$SplitContractDraft) this.c).getPlanConstructor(), ((YBSdkScreenIntent$SplitContractDraft) this.c).getMerchantID(), ((YBSdkScreenIntent$SplitContractDraft) this.c).isPrepayment()), DeeplinkNavigation.ReplaceRoot.INSTANCE), c(this.c));
            }
            internalScreenIntent = internalScreenIntent2;
        }
        tvv tvvVar = this.e;
        String uri = internalScreenIntent.getDeeplink().getParsedUri().toString();
        tvvVar.a.m0.a.a("tech.initial_deeplink.set", g8e.w(1, Constants.DEEPLINK, uri));
        tvvVar.b = uri;
        com.ybsdk.navigation.b bVar2 = NavigationFragment.Companion;
        pg51 pg51Var = this.b;
        Map map = this.d;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.toString());
            }
        }
        y750 y750Var = new y750(this);
        bVar2.getClass();
        NavigationFragment a = com.ybsdk.navigation.b.a(pg51Var, internalScreenIntent, linkedHashMap, y750Var);
        this.a.getSupportFragmentManager().d0(new oh51(ref$ObjectRef, this), true);
        FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
        a h = g8e.h(supportFragmentManager, supportFragmentManager);
        int id = viewGroup.getId();
        NavigationFragment.Companion.getClass();
        str = NavigationFragment.FRAGMENT_TAG;
        h.h(id, a, str);
        h.l(true, true);
    }
}
