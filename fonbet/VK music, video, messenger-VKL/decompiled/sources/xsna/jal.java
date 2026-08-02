package xsna;

import android.util.Size;
import com.vk.core.preference.Preference;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.debug.internal.ApiResponseMocks;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggestApplyState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ikv0;
import xsna.nx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jal implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jal(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                oal oalVar = (oal) this.c;
                ((Boolean) obj).booleanValue();
                oalVar.e();
                return s3q0.a;
            case 1:
                nx50 nx50Var = (nx50) this.c;
                NavigationDelegateActivity navigationDelegateActivity = nx50Var.b;
                TabbarSuggestApplyState tabbarSuggestApplyState = (TabbarSuggestApplyState) obj;
                Size size = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if ((tabbarSuggestApplyState == null ? -1 : nx50.c.$EnumSwitchMapping$0[tabbarSuggestApplyState.ordinal()]) == 1) {
                    ((jwn0) nx50Var.V.getValue()).c(navigationDelegateActivity, null);
                } else {
                    FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = nx50Var.t0;
                    if (fitSystemWindowsFragmentWrapperFrameLayout != null) {
                        fitSystemWindowsFragmentWrapperFrameLayout.performHapticFeedback(17);
                    }
                    ikv0.a aVar = new ikv0.a(navigationDelegateActivity);
                    aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), size, 12));
                    aVar.i(new ikv0.d(navigationDelegateActivity.getString(tabbarSuggestApplyState == TabbarSuggestApplyState.AddFailed ? R.string.tabbar_suggest_add_failed_snackbar : R.string.tabbar_suggest_remove_failed_snackbar), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6));
                    aVar.e(iah0.a(8));
                    aVar.n();
                }
                return s3q0.a;
            case 2:
                return ApiResponseMocks.b(ApiResponseMocks.a, ((r360) this.c).b, (a03) obj);
            case 3:
                String str = (String) obj;
                List<String> list = (List) this.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (String str2 : list) {
                    Preference preference = Preference.a;
                    String str3 = Preference.f;
                    preference.getClass();
                    arrayList.add(Preference.M(str2, str3));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f((String) it.next(), str)) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            default:
                ((dun0) this.c).d((TabbarState) obj, true);
                return s3q0.a;
        }
    }
}
