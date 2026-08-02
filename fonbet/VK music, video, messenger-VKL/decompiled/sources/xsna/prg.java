package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.c;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;

/* compiled from: CommunityAddressesPaginatedView.kt */
/* loaded from: classes5.dex */
public final class prg implements c.n {
    public final RecyclerView b;
    public final pd90<?> c;
    public final CommunityAddressesFragment d;

    /* compiled from: CommunityAddressesPaginatedView.kt */
    public static final class a extends RecyclerView.i {
        public final /* synthetic */ gzs<s3q0> a;

        public a(gzs<s3q0> gzsVar) {
            this.a = gzsVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            this.a.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            this.a.invoke();
        }
    }

    public prg(RecyclerView recyclerView, pd90 pd90Var, CommunityAddressesFragment communityAddressesFragment) {
        this.b = recyclerView;
        this.c = pd90Var;
        this.d = communityAddressesFragment;
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        this.c.y0();
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        this.b.removeOnScrollListener(new ef90(df90Var));
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        this.b.addOnScrollListener(new ef90(df90Var));
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
        this.d.so(true);
    }

    @Override // com.vk.lists.c.n
    public final void f0() {
        this.d.so(false);
        this.c.A0();
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        if (th != null) {
            this.d.ro(th);
        }
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        this.c.z0();
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new a(gzsVar));
        }
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
    }
}
