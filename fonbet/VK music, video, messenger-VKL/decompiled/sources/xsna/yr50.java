package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.search.ui.api.SearchInputMethod;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ls50;

/* compiled from: MyTargetMarketAdsItemImmediateFeature.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class yr50 extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr50(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        wp50 wp50Var;
        wp50 wp50Var2;
        switch (this.b) {
            case 0:
                ls50 ls50Var = (ls50) obj;
                ls50 ls50Var2 = (ls50) obj2;
                zr50 zr50Var = (zr50) this.receiver;
                zr50Var.getClass();
                if ((ls50Var2 instanceof ls50.a) && (wp50Var2 = ((ls50.a) ls50Var2).b) != null) {
                    zr50Var.b.f(wp50Var2);
                } else if ((ls50Var2 instanceof ls50.b) && (ls50Var instanceof ls50.a) && (wp50Var = ((ls50.a) ls50Var).b) != null) {
                    wp50Var.g();
                }
                break;
            default:
                String str = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                o0i0 o0i0Var = (o0i0) this.receiver;
                if (o0i0Var.l) {
                    o0i0Var.l = false;
                    o0i0Var.m = false;
                } else if (o0i0Var.d(SearchState.Suggestion)) {
                    if (str.length() == 0) {
                        o0i0Var.c().c.clear();
                    }
                    SearchResultsVh.cb(o0i0Var.c(), str, null, null, false, searchInputMethod, false, 46);
                }
                break;
        }
        return s3q0.a;
    }
}
