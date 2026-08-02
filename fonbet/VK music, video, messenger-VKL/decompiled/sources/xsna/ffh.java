package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.klh;

/* compiled from: CommunityProfileContentAlbumAdapter.kt */
/* loaded from: classes5.dex */
public final class ffh extends zoj0<s3q0, a> {
    public final glh e;
    public final UserId f;
    public final FragmentImpl g;
    public final FunctionReferenceImpl h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final gzs<s3q0> m;
    public final m2l n;
    public klh o;

    /* compiled from: CommunityProfileContentAlbumAdapter.kt */
    public static final class a extends vif0<s3q0> {
        public final p160 n;
        public final klh o;

        public a(p160 p160Var, glh glhVar, klh klhVar, int i, int i2, int i3, int i4) {
            super(p160Var);
            this.n = p160Var;
            this.o = klhVar;
            p160Var.setTag("ALBUMS_RECYCLER");
            p160Var.setPadding(i2, i3, i2, i4);
            p160Var.setClipToPadding(false);
            p160Var.getContext();
            p160Var.setLayoutManager(new LinearLayoutManager(0, false));
            if (i != 0) {
                p160Var.addItemDecoration(new ehk0(i, true));
            }
            p160Var.setAdapter(glhVar);
            this.itemView.addOnAttachStateChangeListener(new efh(this));
        }

        @Override // xsna.vif0
        public final void i6(s3q0 s3q0Var) {
            this.n.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ffh(glh glhVar, UserId userId, FragmentImpl fragmentImpl, izs izsVar, int i, int i2, int i3, int i4, p3h p3hVar, int i5) {
        i = (i5 & 16) != 0 ? iah0.a(12) : i;
        i2 = (i5 & 32) != 0 ? iah0.a(16) : i2;
        i3 = (i5 & 64) != 0 ? 0 : i3;
        i4 = (i5 & 128) != 0 ? iah0.a(4) : i4;
        p3hVar = (i5 & 256) != 0 ? null : p3hVar;
        this.e = glhVar;
        this.f = userId;
        this.g = fragmentImpl;
        this.h = (FunctionReferenceImpl) izsVar;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = p3hVar;
        this.n = new m2l();
    }

    public final void K0() {
        klh klhVar = this.o;
        if (klhVar != null) {
            klhVar.a();
        }
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        p160 p160Var = new p160(viewGroup.getContext());
        p160Var.setId(R.id.community_profile_clips_playlist_list);
        p160Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (this.m != null) {
            p160Var.addOnScrollListener(new ef90(new gfh(this)));
        }
        klh klhVar = new klh(p160Var, this.h, this.g, new jlh(new klh.a(), this.f));
        this.o = klhVar;
        return new a(p160Var, this.e, klhVar, this.i, this.j, this.k, this.l);
    }
}
