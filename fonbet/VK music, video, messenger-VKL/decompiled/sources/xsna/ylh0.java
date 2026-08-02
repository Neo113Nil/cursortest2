package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.GifItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.c;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ixm;

/* compiled from: SearchAdapter.kt */
/* loaded from: classes15.dex */
public final class ylh0 extends RecyclerView.Adapter<RecyclerView.e0> implements vic, c.i {
    public final uei0 c;
    public final SelectionStickerView.OpenFrom d;
    public final RecyclerView e;
    public final gzs<String> f;
    public final androidx.recyclerview.widget.d<Object> g;
    public final d h;
    public String i;

    /* compiled from: SearchAdapter.kt */
    public static final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            ylh0 ylh0Var = ylh0.this;
            RecyclerView.o layoutManager = ylh0Var.e.getLayoutManager();
            Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            RecyclerView.o layoutManager2 = ylh0Var.e.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.onRestoreInstanceState(onSaveInstanceState);
            }
        }
    }

    /* compiled from: SearchAdapter.kt */
    public static final class b extends m.e<Object> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(Object obj, Object obj2) {
            return ((obj instanceof StickerItem) && (obj2 instanceof StickerItem) && ((StickerItem) obj).h != ((StickerItem) obj2).h) ? false : true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Object obj, Object obj2) {
            return ((obj instanceof StickerItem) && (obj2 instanceof StickerItem)) ? ((StickerItem) obj).b == ((StickerItem) obj2).b : ((obj instanceof GifItem) && (obj2 instanceof GifItem)) ? epx.f(((GifItem) obj).b, ((GifItem) obj2).b) : ((obj instanceof pzo0) && (obj2 instanceof pzo0)) ? ((pzo0) obj).a == ((pzo0) obj2).a : (obj instanceof vkc) && (obj2 instanceof vkc) && ((vkc) obj).a == ((vkc) obj2).a;
        }
    }

    /* compiled from: SearchAdapter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(!((ylh0) this.receiver).e.isComputingLayout());
        }
    }

    /* compiled from: SearchAdapter.kt */
    public static final class d implements sfp0 {
        public d() {
        }

        @Override // xsna.sfp0
        public final void a(GifItem gifItem) {
            String str = gifItem.b;
            String str2 = ylh0.this.i;
            if (str2 == null) {
                str2 = "";
            }
            bpn0 bpn0Var = jcl0.a;
            b.d dVar = new b.d("gif_sticker_selected");
            dVar.b((String) jcl0.a.getValue(), "session_id");
            dVar.b(str, "gif_sticker_id");
            dVar.b(str2, "search_query");
            dVar.e();
        }

        @Override // xsna.sfp0
        public final void b(int i) {
            ylh0 ylh0Var = ylh0.this;
            String str = ylh0Var.i;
            if (str == null || str.length() == 0 || ylh0Var.d != SelectionStickerView.OpenFrom.STORY) {
                return;
            }
            String str2 = ylh0Var.i;
            bpn0 bpn0Var = jcl0.a;
            b.d a = io.reactivex.rxjava3.processors.b.a("search_sticker_click", "query", str2);
            a.b(Integer.valueOf(i), "sticker_search_position");
            a.e();
        }
    }

    public ylh0(uei0 uei0Var, SelectionStickerView.OpenFrom openFrom, RecyclerView recyclerView, gzs<String> gzsVar) {
        this.c = uei0Var;
        this.d = openFrom;
        this.e = recyclerView;
        this.f = gzsVar;
        ixm.a aVar = new ixm.a(this, new c(0, this, ylh0.class, "isSafeToNotify", "isSafeToNotify()Z", 0));
        b bVar = new b();
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    asu0.a.getClass();
                    ExecutorService D = asu0.D();
                    c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = new androidx.recyclerview.widget.d<>(aVar, new androidx.recyclerview.widget.c(null, c.a.b, bVar));
        this.h = new d();
        setHasStableIds(true);
        registerAdapterDataObserver(new a());
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return this.g.f.isEmpty();
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        EmptyList emptyList = EmptyList.b;
        this.i = "";
        this.g.b(emptyList, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        long j;
        int i2;
        Object obj = this.g.f.get(i);
        if (obj instanceof StickerItem) {
            i2 = ((StickerItem) obj).b;
        } else if (obj instanceof GifItem) {
            i2 = ((GifItem) obj).b.hashCode();
        } else if (obj instanceof pzo0) {
            i2 = ((pzo0) obj).a;
        } else {
            if (!(obj instanceof vkc)) {
                j = -1;
                return Objects.hash(Integer.valueOf(getItemViewType(i)), Long.valueOf(j));
            }
            i2 = ((vkc) obj).a;
        }
        j = i2;
        return Objects.hash(Integer.valueOf(getItemViewType(i)), Long.valueOf(j));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object obj = this.g.f.get(i);
        if (obj instanceof StickerItem) {
            return 0;
        }
        if (obj instanceof GifItem) {
            return 1;
        }
        if (obj instanceof pzo0) {
            return 2;
        }
        if (obj instanceof vkc) {
            return 3;
        }
        throw new IllegalStateException(cqi.c(obj, "Can't calculate type for "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Object obj = this.g.f.get(i);
        if (e0Var instanceof q4l0) {
            ((q4l0) e0Var).V5((StickerItem) obj);
            return;
        }
        if (e0Var instanceof f4m0) {
            f4m0 f4m0Var = (f4m0) e0Var;
            GifItem gifItem = (GifItem) obj;
            f4m0Var.l = gifItem;
            VKImageView vKImageView = f4m0Var.m;
            vKImageView.setPlaceholderImage(R.drawable.bg_gif_sticker_placeholder);
            bwt0.S(vKImageView, new nk0(27, gifItem, f4m0Var));
            return;
        }
        if (e0Var instanceof kzo0) {
            ((kzo0) e0Var).l.setText(y8g0.e(((pzo0) obj).a));
            return;
        }
        if (e0Var instanceof ukc) {
            ukc ukcVar = (ukc) e0Var;
            vkc vkcVar = (vkc) obj;
            ImageView imageView = ukcVar.m;
            ukcVar.n = vkcVar;
            if (vkcVar.d) {
                ukcVar.itemView.setClickable(true);
            } else {
                ukcVar.itemView.setClickable(false);
                Integer num = vkcVar.c;
                if (num != null) {
                    imageView.setContentDescription(ukcVar.itemView.getContext().getString(num.intValue()));
                }
            }
            ukcVar.l.setText(ukcVar.itemView.getContext().getString(vkcVar.a));
            imageView.setImageResource(vkcVar.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        d dVar = this.h;
        uei0 uei0Var = this.c;
        if (i == 0) {
            return new q4l0(viewGroup.getContext(), uei0Var, dVar, this.f);
        }
        if (i == 1) {
            return new f4m0(viewGroup, uei0Var, dVar);
        }
        if (i == 2) {
            return new kzo0(viewGroup);
        }
        if (i == 3) {
            return new ukc(viewGroup);
        }
        throw new IllegalStateException(lhg.a(i, "Can't create holder for viewType: "));
    }
}
