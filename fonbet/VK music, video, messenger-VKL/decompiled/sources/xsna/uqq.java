package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FavePagesHolder.kt */
/* loaded from: classes4.dex */
public final class uqq extends rp6<vqq, NewsEntry> {
    public static final /* synthetic */ int F = 0;
    public final xc90 E;

    /* compiled from: FavePagesHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<FavePage, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(FavePage favePage) {
            uqq uqqVar = (uqq) this.receiver;
            int i = uqq.F;
            uqqVar.getClass();
            uqqVar.X6(new NewsfeedExternalAction.Navigation.j(favePage));
            return s3q0.a;
        }
    }

    public uqq(ViewGroup viewGroup) {
        super(R.layout.fave_pages_block, viewGroup);
        this.D = t980.a;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.pages_recycler_view);
        xc90 xc90Var = new xc90(new a(1, this, uqq.class, "onClickItem", "onClickItem(Lcom/vk/fave/entities/FavePage;)V", 0));
        this.E = xc90Var;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(xc90Var);
        recyclerView.setClipToPadding(false);
        int a2 = iah0.a(8);
        recyclerView.setPadding(a2, 0, a2, 0);
    }

    @Override // xsna.rp6
    public final void R6(vqq vqqVar) {
        this.E.setItems(vqqVar.h);
    }
}
