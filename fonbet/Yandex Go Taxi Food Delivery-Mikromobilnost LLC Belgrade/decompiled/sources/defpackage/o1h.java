package defpackage;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.HomeScreenEvents$LimitsPageOpenContext;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.a;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.f;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class o1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AccountStatus)) {
                    return x0hVar;
                }
                qq7 qq7Var = ((AppAnalyticsReporter) obj4).D;
                HomeScreenEvents$LimitsPageOpenContext homeScreenEvents$LimitsPageOpenContext = HomeScreenEvents$LimitsPageOpenContext.DEEPLINK;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("context", homeScreenEvents$LimitsPageOpenContext.getOriginalValue());
                qq7Var.a.a("limits_page.open", linkedHashMap);
                b bVar = (b) obj;
                a aVar = bVar.i;
                YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
                String accountStatusUrl = ybCommonUrlsImpl.getAccountStatusUrl();
                if (accountStatusUrl.length() == 0) {
                    accountStatusUrl = ybCommonUrlsImpl2.getAccountStatusUrl();
                }
                List c = ((l3h) ((j3h) ((yvf0) obj3).get())).c(accountStatusUrl);
                if (c == null) {
                    c = Collections.singletonList(com.ybsdk.navigation.a.a((np41) obj2, accountStatusUrl));
                }
                return new v0h(c, null, 6);
            default:
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) obj4;
                bhk bhkVar = (bhk) obj3;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.BottomSheet)) {
                    return x0hVar;
                }
                BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(contextThemeWrapper, null, 0, 6, null);
                bottomSheetDialogView.render(new BottomSheetDialogView.State((d) new f(new com.ybsdk.di.modules.b(contextThemeWrapper, (lhk) obj2, (DeeplinkAction.BottomSheet) baseDeeplinkAction, bottomSheetDialogView)), (YbButtonViewGroup.b) null, (h) null, true, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65526));
                BottomSheetDialogView.show$default(bottomSheetDialogView, (FragmentActivity) obj, null, 2, null);
                Iterator it = bhkVar.d.iterator();
                while (it.hasNext()) {
                    ((sls) it.next()).invoke();
                }
                bottomSheetDialogView.onDismiss(new j1(9, bhkVar));
                return new v0h(EmptyList.a, null, 6);
        }
    }
}
