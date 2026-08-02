package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e6w0;
import xsna.sf90;

/* compiled from: VmojiRecommendationsBlockHolder.kt */
/* loaded from: classes7.dex */
public final class oaw0 extends u6w0<dbf0> {
    public final b8w0 l;
    public final VmojiCharacterFragment.c m;
    public final View n;
    public final TextView o;
    public final b p;
    public String q;
    public final a r;

    /* compiled from: VmojiRecommendationsBlockHolder.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public oaw0(ViewGroup viewGroup, b8w0 b8w0Var, VmojiCharacterFragment.c cVar) {
        super(R.layout.vmoji_character_stock_sticker_packs_item, viewGroup);
        this.l = b8w0Var;
        this.m = cVar;
        this.n = this.itemView.findViewById(R.id.show_all);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler_view);
        this.o = (TextView) this.itemView.findViewById(R.id.recommendations_block_title);
        b bVar = new b(cVar);
        this.p = bVar;
        fyd0 fyd0Var = new fyd0(this, 29);
        a aVar = new a();
        aVar.x0(ebf0.class, new gsq0(b8w0Var, 10));
        aVar.x0(u990.class, new gxj0(11));
        aVar.x0(n990.class, new gyo0(fyd0Var, 15));
        this.r = aVar;
        recyclerView.setAdapter(aVar);
        recyclerView.setAdapter(recyclerView.getAdapter());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setClipToPadding(false);
        f4m.l(cn70.b(8), cn70.b(8), recyclerView);
        recyclerView.addOnScrollListener(new ef90(bVar));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        dbf0 dbf0Var = (dbf0) hfzVar;
        RecommendationsBlockModel recommendationsBlockModel = dbf0Var.b;
        String str = recommendationsBlockModel.b;
        this.q = str;
        if (str == null) {
            str = null;
        }
        this.p.c = str;
        List<VmojiStickerPackPreviewModel> list = recommendationsBlockModel.f;
        sf90 sf90Var = dbf0Var.c;
        a aVar = this.r;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        List<VmojiStickerPackPreviewModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ebf0((VmojiStickerPackPreviewModel) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (!(sf90Var instanceof sf90.b)) {
            if (sf90Var instanceof sf90.c) {
                arrayList.add(u990.b);
            } else {
                if (!(sf90Var instanceof sf90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new n990(((sf90.a) sf90Var).b));
            }
        }
        aVar.setItems(arrayList);
        this.o.setText(recommendationsBlockModel.c);
        bwt0.i0(this.n, new k1x0(1, this, dbf0Var));
    }

    /* compiled from: VmojiRecommendationsBlockHolder.kt */
    public static final class b implements df90 {
        public final VmojiCharacterFragment.c b;
        public String c;

        public b(VmojiCharacterFragment.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            String str;
            if (i - 4 > i3 || i3 > i || (str = this.c) == null) {
                return;
            }
            this.b.invoke(new e6w0.i.b(str));
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }
}
