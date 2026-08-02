package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.search.params.api.SearchParams;
import xsna.ath0;

/* compiled from: SearchFilterInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class ysh0 implements xsh0 {
    @Override // xsna.xsh0
    public final void a(Context context, FragmentManager fragmentManager, SearchParams searchParams) {
        tas tasVar = new tas(fragmentManager);
        tasVar.a(new ath0.a(context, searchParams, tasVar, fragmentManager).a());
    }
}
