package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.vk.search.integration.api.SearchDelegate;
import xsna.iqh0;

/* compiled from: SearchDelegateFactory.kt */
/* loaded from: classes5.dex */
public interface kqh0 {
    public static final a a = a.a;

    SearchDelegate a(iqh0 iqh0Var);

    iax b(iqh0.e eVar);

    /* compiled from: SearchDelegateFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final bpn0 b = new bpn0(new dgc0(7));

        /* compiled from: SearchDelegateFactory.kt */
        /* renamed from: xsna.kqh0$a$a, reason: collision with other inner class name */
        public static final class C3198a implements kqh0 {
            @Override // xsna.kqh0
            public final SearchDelegate a(iqh0 iqh0Var) {
                return new C3199a();
            }

            @Override // xsna.kqh0
            public final iax b(iqh0.e eVar) {
                return new jqh0();
            }

            /* compiled from: SearchDelegateFactory.kt */
            /* renamed from: xsna.kqh0$a$a$a, reason: collision with other inner class name */
            public static final class C3199a implements SearchDelegate {
                @Override // com.vk.search.integration.api.SearchDelegate
                public final View e(Context context, ViewGroup viewGroup) {
                    return null;
                }

                @Override // com.vk.search.integration.api.SearchDelegate
                public final void d() {
                }

                @Override // com.vk.search.integration.api.SearchDelegate
                public final void onConfigurationChanged(Configuration configuration) {
                }
            }
        }
    }
}
