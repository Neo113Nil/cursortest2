package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickerDetailsAdapter.kt */
/* loaded from: classes6.dex */
public final class f3l0 extends sxm implements i5l0 {
    public final g3l0 i;
    public final smg j;
    public final kcl0 k;
    public final rdf0 l;
    public final ContextUser m;
    public RecyclerView n;
    public Bundle o;
    public final bpn0 p = new bpn0(new wqf0(3));
    public final bpn0 q = new bpn0(new x1c0(8));
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();

    /* compiled from: StickerDetailsAdapter.kt */
    public static abstract class a {

        /* compiled from: StickerDetailsAdapter.kt */
        /* renamed from: xsna.f3l0$a$a, reason: collision with other inner class name */
        public static final class C2847a extends a {
            public final List<StickerPackRecommendationBlock> a;

            public C2847a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2847a) && epx.f(this.a, ((C2847a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Data(blocks="), this.a);
            }

            public C2847a(List<StickerPackRecommendationBlock> list) {
                this.a = list;
            }

            public C2847a(int i) {
                this(EmptyList.b);
            }
        }

        /* compiled from: StickerDetailsAdapter.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* compiled from: StickerDetailsAdapter.kt */
    public interface b {
        void F3();

        void e3();
    }

    /* compiled from: StickerDetailsAdapter.kt */
    public interface c {
        void b2(Bundle bundle);

        void d(Bundle bundle);
    }

    /* compiled from: StickerDetailsAdapter.kt */
    public static final class e extends RecyclerView.t {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                Iterator it = f3l0.this.s.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).e3();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Iterator it = f3l0.this.s.iterator();
            while (it.hasNext()) {
                ((b) it.next()).e3();
            }
        }
    }

    public f3l0(g3l0 g3l0Var, smg smgVar, kcl0 kcl0Var, rdf0 rdf0Var, ContextUser contextUser, GiftData giftData) {
        this.i = g3l0Var;
        this.j = smgVar;
        this.k = kcl0Var;
        this.l = rdf0Var;
        this.m = contextUser;
        x0(p690.class, new q130(this, 29));
        x0(a790.class, new zb60(this, 25));
        x0(pbw0.class, new qjg0(this, 3));
        x0(y690.class, new mga0(this, 16));
        x0(y1l0.class, new ggb0(this, 13));
        x0(zl2.class, new p010(this, 29));
        x0(acf0.class, new vsq(28));
        x0(bbf0.class, new kpk0(1, this, giftData));
        x0(iki0.class, new n1g0(6));
        x0(u690.class, new uh40(this, 28));
    }

    public final boolean J0(int i) {
        return (j5g.b0(i, this.h) instanceof y1l0) || (j5g.b0(i, this.h) instanceof zl2);
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
        recyclerView.getContext();
        e eVar = new e();
        recyclerView.addOnScrollListener(eVar);
        recyclerView.addOnAttachStateChangeListener(new d(recyclerView, this, recyclerView, eVar));
        this.n = recyclerView;
    }

    @Override // xsna.i5l0
    public final StickerItem p0(View view) {
        RecyclerView recyclerView = this.n;
        int childAdapterPosition = recyclerView != null ? recyclerView.getChildAdapterPosition(view) : -1;
        if (J0(childAdapterPosition)) {
            return this.h.get(childAdapterPosition) instanceof y1l0 ? ((y1l0) this.h.get(childAdapterPosition)).c : ((zl2) this.h.get(childAdapterPosition)).c;
        }
        return null;
    }

    /* compiled from: ViewExt.kt */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ f3l0 c;
        public final /* synthetic */ RecyclerView d;
        public final /* synthetic */ e e;

        public d(RecyclerView recyclerView, f3l0 f3l0Var, RecyclerView recyclerView2, e eVar) {
            this.b = recyclerView;
            this.c = f3l0Var;
            this.d = recyclerView2;
            this.e = eVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = this.c.s;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).F3();
            }
            arrayList.clear();
            this.d.removeOnScrollListener(this.e);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
