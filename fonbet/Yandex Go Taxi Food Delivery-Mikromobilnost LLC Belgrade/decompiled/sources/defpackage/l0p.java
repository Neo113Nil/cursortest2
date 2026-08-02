package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.PartnersEvents$PartnersLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.ProductsScreenEvents$ProductsScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsFiltersLoadResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle;
import com.ybsdk.core.analytics.generated.delegates.TransactionsFeedEvents$TransactionsListLoadResultResult;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class l0p {
    public final a a;

    public /* synthetic */ l0p(a aVar) {
        this.a = aVar;
    }

    public static void j(l0p l0pVar, String str, String str2, RegularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType regularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType) {
        LinkedHashMap t = x4e.t(4, "agreement_id", str, "button", str2);
        t.put("bottomsheet_type", regularAutotopupEvents$RegularAutotopupSettingsWhenButtonClickBottomsheetType.getOriginalValue());
        l0pVar.a.a("regular_autotopup.settings.when.button.click", t);
    }

    public void a(PartnersEvents$PartnersLoadedResult partnersEvents$PartnersLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, partnersEvents$PartnersLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("partners.loaded", linkedHashMap);
    }

    public void b(InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult internetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("payment.internet_tv.providers_account_screen_loaded", linkedHashMap);
    }

    public void c(InternetServicesEvents$PaymentInternetTvProvidersLoadedResult internetServicesEvents$PaymentInternetTvProvidersLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvProvidersLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("payment.internet_tv.providers_loaded", linkedHashMap);
    }

    public void d(InternetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult internetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvSuccessScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        this.a.a("payment.internet_tv.success_screen_loaded", linkedHashMap);
    }

    public void e(InternetServicesEvents$PaymentInternetTvSuccessScreenShownResult internetServicesEvents$PaymentInternetTvSuccessScreenShownResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, internetServicesEvents$PaymentInternetTvSuccessScreenShownResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("cashback", str);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        this.a.a("payment.internet_tv.success_screen_shown", linkedHashMap);
    }

    public void f(yab0 yab0Var, ArrayList arrayList, i9b0 i9b0Var, ArrayList arrayList2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (yab0Var != null) {
            linkedHashMap.put("filter_old", yab0Var.a());
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((yab0) it.next()).a());
        }
        linkedHashMap.put("filters", arrayList3);
        if (i9b0Var != null) {
            linkedHashMap.put("category_old", i9b0Var.a());
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((i9b0) it2.next()).a());
        }
        linkedHashMap.put("categories", arrayList4);
        this.a.a("pfm.analytics.update", linkedHashMap);
    }

    public void g(ProductsScreenEvents$ProductsScreenLoadedResult productsScreenEvents$ProductsScreenLoadedResult, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, productsScreenEvents$ProductsScreenLoadedResult.getOriginalValue());
        if (list != null) {
            linkedHashMap.put("errors", list);
        }
        this.a.a("products_screen.loaded", linkedHashMap);
    }

    public void h(String str, List list, String str2, String str3, RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup, List list2, List list3, Double d, String str4, RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton) {
        LinkedHashMap w = g8e.w(10, "agreement_id", str);
        if (list != null) {
            w.put("payment_method_types", list);
        }
        if (str2 != null) {
            w.put("source_agreement_id", str2);
        }
        if (str3 != null) {
            byte[] bArr = y5e.W;
            byte[] bArr2 = new byte[7];
            for (int i = 0; i < 7; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            w.put(new String(bArr2, uza.a), str3);
        }
        if (regularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup.getOriginalValue());
        }
        if (list2 != null) {
            w.put("amount_size", list2);
        }
        if (list3 != null) {
            w.put("day_when", list3);
        }
        if (d != null) {
            w.put("amount_predict", d);
        }
        if (str4 != null) {
            w.put("amount_fact", str4);
        }
        w.put("button", regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.getOriginalValue());
        this.a.a("regular_autotopup.settings.button.click", w);
    }

    public void i(String str, RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult regularAutotopupEvents$RegularAutotopupSettingsLoadedResult, String str2, RegularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup) {
        LinkedHashMap w = g8e.w(4, "agreement_id", str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, regularAutotopupEvents$RegularAutotopupSettingsLoadedResult.getOriginalValue());
        if (str2 != null) {
            w.put("error", str2);
        }
        if (regularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsLoadedStateAutotopup.getOriginalValue());
        }
        this.a.a("regular_autotopup.settings.loaded", w);
    }

    public void k(TransactionsFeedEvents$TransactionsFiltersLoadResultResult transactionsFeedEvents$TransactionsFiltersLoadResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transactionsFeedEvents$TransactionsFiltersLoadResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("transactions.filters.load.result", linkedHashMap);
    }

    public void l(TransactionsFeedEvents$TransactionsListLoadResultResult transactionsFeedEvents$TransactionsListLoadResultResult, String str, String str2, String str3, int i, Boolean bool, Boolean bool2, TransactionsFeedEvents$TransactionsListLoadResultHeaderStyle transactionsFeedEvents$TransactionsListLoadResultHeaderStyle, TransactionsFeedEvents$TransactionsListLoadResultFiltersStyle transactionsFeedEvents$TransactionsListLoadResultFiltersStyle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(9);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transactionsFeedEvents$TransactionsListLoadResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str2);
        }
        if (str3 != null) {
            linkedHashMap.put("agreement_id", str3);
        }
        linkedHashMap.put("load_depth", Integer.valueOf(i));
        linkedHashMap.put("show_tabbar", bool);
        linkedHashMap.put("hide_filters", bool2);
        if (transactionsFeedEvents$TransactionsListLoadResultHeaderStyle != null) {
            linkedHashMap.put("header_style", transactionsFeedEvents$TransactionsListLoadResultHeaderStyle.getOriginalValue());
        }
        if (transactionsFeedEvents$TransactionsListLoadResultFiltersStyle != null) {
            linkedHashMap.put("filters_style", transactionsFeedEvents$TransactionsListLoadResultFiltersStyle.getOriginalValue());
        }
        this.a.a("transactions.list.load.result", linkedHashMap);
    }
}
