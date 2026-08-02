package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FriendsCleanupAdapter.kt */
/* loaded from: classes15.dex */
public final class pms extends sxm {
    public final iw3 i;

    /* compiled from: FriendsCleanupAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ViewGroup, sms> {
        public static final a b = new a(1, sms.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final sms invoke(ViewGroup viewGroup) {
            return new sms(viewGroup, 0);
        }
    }

    /* compiled from: FriendsCleanupAdapter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ViewGroup, ins> {
        public static final b b = new b(1, ins.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final ins invoke(ViewGroup viewGroup) {
            return new ins(viewGroup, R.layout.vk_view_default_list_loading, 0);
        }
    }

    public pms(iw3 iw3Var) {
        this.i = iw3Var;
        x0(bns.class, a.b);
        x0(ans.class, new k0j(this, 15));
        x0(ens.class, new f2s(this, 2));
        x0(dns.class, b.b);
        x0(cns.class, new o1e(this, 26));
        setHasStableIds(true);
    }
}
