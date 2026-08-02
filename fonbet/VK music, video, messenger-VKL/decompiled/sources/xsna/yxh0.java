package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import java.lang.ref.WeakReference;

/* compiled from: TextView.kt */
/* loaded from: classes5.dex */
public final class yxh0 implements TextWatcher {
    public final /* synthetic */ SearchQueryValueHelper b;
    public final /* synthetic */ VkSearchView c;

    public yxh0(SearchQueryValueHelper searchQueryValueHelper, VkSearchView vkSearchView) {
        this.b = searchQueryValueHelper;
        this.c = vkSearchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SearchQueryValueHelper searchQueryValueHelper = this.b;
        if (searchQueryValueHelper.a) {
            return;
        }
        io.reactivex.rxjava3.subjects.d<SearchQueryValueHelper.a> dVar = searchQueryValueHelper.b;
        String obj = editable != null ? editable.toString() : null;
        if (obj == null) {
            obj = "";
        }
        dVar.onNext(new SearchQueryValueHelper.a(new SearchQuery(obj, SearchInputMethod.Keyboard, null, null, 12, null), SearchQueryValueHelper.ChangeType.KEYBOARD, new WeakReference(this.c)));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
