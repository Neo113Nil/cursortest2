package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.GoodAlbum;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileContentMarketAlbumsAdapter.kt */
/* loaded from: classes5.dex */
public final class qjh extends zoj0<GoodAlbum, b> {
    public final FunctionReferenceImpl e;
    public final boolean f;

    /* compiled from: CommunityProfileContentMarketAlbumsAdapter.kt */
    public static final class a extends m.e<GoodAlbum> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(GoodAlbum goodAlbum, GoodAlbum goodAlbum2) {
            GoodAlbum goodAlbum3 = goodAlbum;
            GoodAlbum goodAlbum4 = goodAlbum2;
            return epx.f(goodAlbum3.c, goodAlbum4.c) && goodAlbum3.b == goodAlbum4.b && epx.f(goodAlbum3.e, goodAlbum4.e) && epx.f(goodAlbum3.d, goodAlbum4.d) && goodAlbum3.f == goodAlbum4.f;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(GoodAlbum goodAlbum, GoodAlbum goodAlbum2) {
            GoodAlbum goodAlbum3 = goodAlbum;
            GoodAlbum goodAlbum4 = goodAlbum2;
            return epx.f(goodAlbum3.c, goodAlbum4.c) && goodAlbum3.b == goodAlbum4.b;
        }
    }

    /* compiled from: CommunityProfileContentMarketAlbumsAdapter.kt */
    public static final class b extends vif0<GoodAlbum> {
        public final izs<GoodAlbum, s3q0> n;
        public final boolean o;
        public final ComposeView p;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ViewGroup viewGroup, izs<? super GoodAlbum, s3q0> izsVar, boolean z) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.n = izsVar;
            this.o = z;
            this.p = (ComposeView) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(GoodAlbum goodAlbum) {
            GoodAlbum goodAlbum2 = goodAlbum;
            String str = goodAlbum2.d;
            ComposeView composeView = this.p;
            composeView.setTag(str);
            composeView.setContent(new jai(792390894, new xs8(1, goodAlbum2, this), true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qjh(izs<? super GoodAlbum, s3q0> izsVar, boolean z) {
        super(new com.vk.lists.a(new a()));
        this.e = (FunctionReferenceImpl) izsVar;
        this.f = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(viewGroup, this.e, this.f);
    }
}
