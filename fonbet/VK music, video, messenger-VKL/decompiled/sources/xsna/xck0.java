package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Thumb;
import com.vk.music.snippet.ui.presentation.base.view.SnippetBlurBackgroundView;
import com.vk.music.snippet.ui.presentation.base.view.SnippetZoomLayoutManager;
import com.vk.music.view.ThumbsImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SnippetSectionViewHolder.kt */
/* loaded from: classes3.dex */
public final class xck0 extends vfz<pck0> {
    public static final /* synthetic */ int q = 0;
    public final tck0 l;
    public final bgy m;
    public final wd8 n;
    public pck0 o;
    public final f650 p;

    public xck0(tck0 tck0Var, bgy bgyVar, wd8 wd8Var, kck0 kck0Var) {
        super(tck0Var);
        this.l = tck0Var;
        this.m = bgyVar;
        this.n = wd8Var;
        wck0 wck0Var = new wck0(this);
        f650 f650Var = new f650();
        f650Var.x0(yck0.class, new sx4(bgyVar, kck0Var, wck0Var, 7));
        this.p = f650Var;
        tck0Var.getContext();
        SnippetZoomLayoutManager snippetZoomLayoutManager = new SnippetZoomLayoutManager();
        androidx.recyclerview.widget.g0 g0Var = tck0Var.C;
        RecyclerView recyclerView = tck0Var.t;
        g0Var.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(snippetZoomLayoutManager);
        int i = tck0Var.getResources().getConfiguration().orientation;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i == 2 ? iah0.p(tck0Var.getContext()) : iah0.z(tck0Var.getContext());
        if (fnj.d(tck0Var.getContext())) {
            ref$IntRef.element -= tck0.E;
        }
        recyclerView.addItemDecoration(new sck0(tck0Var, ref$IntRef));
        tck0Var.getHorizontalRecycler().setAdapter(f650Var);
        mck0 mck0Var = new mck0(g0Var, new vck0(this));
        tck0Var.D = mck0Var;
        recyclerView.addOnScrollListener(mck0Var);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(pck0 pck0Var) {
        pck0 pck0Var2 = pck0Var;
        nck0 nck0Var = pck0Var2.b;
        pck0 pck0Var3 = this.o;
        boolean z = pck0Var3 == null || !epx.f(pck0Var3.b.a, nck0Var.a);
        this.o = pck0Var2;
        String str = nck0Var.b;
        List<nbk0> list = nck0Var.g;
        tck0 tck0Var = this.l;
        tck0Var.setPlaylistName(str);
        tck0Var.setTypeStyle(nck0Var.f);
        tck0Var.setPlaylistDescription(nck0Var.c);
        tck0Var.setThumb(nck0Var.d);
        tck0Var.setTracksCount(list.size());
        tck0Var.setOnPlaylistClickListener(new k75(16, this, nck0Var));
        if (!list.isEmpty()) {
            tck0Var.v.setVisibility(0);
            if (z) {
                nbk0 nbk0Var = (nbk0) j5g.a0(list);
                Thumb Jb = nbk0Var != null ? nbk0Var.b.Jb() : null;
                SnippetBlurBackgroundView snippetBlurBackgroundView = tck0Var.u;
                snippetBlurBackgroundView.d = null;
                snippetBlurBackgroundView.e = null;
                snippetBlurBackgroundView.f = true;
                snippetBlurBackgroundView.g = false;
                ThumbsImageView thumbsImageView = snippetBlurBackgroundView.c;
                thumbsImageView.setVisibility(4);
                thumbsImageView.setThumb(null);
                snippetBlurBackgroundView.setThumb(Jb);
                tck0Var.setCurrentTrackNum(0);
            }
        }
        List<nbk0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (nbk0 nbk0Var2 : list2) {
            arrayList.add(new yck0(nck0Var.a, nbk0Var2.b, nbk0Var2.d, nbk0Var2.c));
        }
        this.p.setItems(arrayList);
        if (z) {
            tck0Var.t.scrollToPosition(0);
            mck0 mck0Var = tck0Var.D;
            if (mck0Var != null) {
                mck0Var.d = 0;
                mck0Var.e = 0;
            }
        }
    }
}
