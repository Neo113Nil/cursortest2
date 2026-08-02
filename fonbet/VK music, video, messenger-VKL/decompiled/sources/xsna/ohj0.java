package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.search.ui.api.SearchInputMethod;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ShowAllListVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class ohj0 extends FunctionReferenceImpl implements wzs<String, SearchInputMethod, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(String str, SearchInputMethod searchInputMethod) {
        String str2 = str;
        SearchInputMethod searchInputMethod2 = searchInputMethod;
        ShowAllListVh showAllListVh = (ShowAllListVh) this.receiver;
        showAllListVh.getClass();
        if (str2.length() == 0) {
            showAllListVh.i8(alj.a);
        } else {
            showAllListVh.i8(vyh0.a);
            SearchResultsVh.cb(showAllListVh.e, str2, null, null, false, searchInputMethod2, false, 46);
        }
        return s3q0.a;
    }
}
