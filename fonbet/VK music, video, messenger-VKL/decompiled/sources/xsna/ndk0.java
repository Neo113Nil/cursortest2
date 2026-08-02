package xsna;

import com.vk.core.view.search.ModernSearchView;
import xsna.bcw0;

/* compiled from: SocialGraphFriendsFragment.kt */
/* loaded from: classes5.dex */
public final class ndk0 extends bcw0 {
    public final /* synthetic */ odk0 a;

    public ndk0(odk0 odk0Var) {
        this.a = odk0Var;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        String str = aVar.a;
        if (str != null) {
            ModernSearchView modernSearchView = this.a.q;
            if (modernSearchView == null) {
                modernSearchView = null;
            }
            modernSearchView.setQuery(str);
        }
    }
}
