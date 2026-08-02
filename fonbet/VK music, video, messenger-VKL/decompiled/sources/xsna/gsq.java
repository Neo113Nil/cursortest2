package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h7u0;

/* compiled from: FaveTagsEditorView.kt */
/* loaded from: classes4.dex */
public final class gsq extends FrameLayout implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int f = 0;
    public final t1o0 b;
    public final com.vk.lists.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public final esq e;

    /* compiled from: FaveTagsEditorView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<FaveTag, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(FaveTag faveTag) {
            gsq gsqVar = (gsq) this.receiver;
            int i = gsq.f;
            gsqVar.getClass();
            int i2 = h7u0.p;
            h7u0.a c = h7u0.b.c(gsqVar.getContext());
            c.g0(R.string.confirm);
            c.U(R.string.fave_remove_tag);
            c.c0(R.string.yes, new a10(1, gsqVar, faveTag));
            c.W(R.string.no, null);
            c.m();
            return s3q0.a;
        }
    }

    /* compiled from: FaveTagsEditorView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            gsq gsqVar = (gsq) this.receiver;
            int i = gsq.f;
            mqq.a(gsqVar.getContext(), null);
            return s3q0.a;
        }
    }

    /* compiled from: FaveTagsEditorView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<FaveTag, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(FaveTag faveTag) {
            gsq gsqVar = (gsq) this.receiver;
            int i = gsq.f;
            mqq.a(gsqVar.getContext(), faveTag);
            return s3q0.a;
        }
    }

    /* compiled from: FaveTagsEditorView.kt */
    public static final class e implements c.l<List<? extends FaveTag>> {
        public e() {
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<List<FaveTag>> hj(com.vk.lists.c cVar, boolean z) {
            return rsg0.y0(new jqq(), null, null, 3);
        }

        @Override // com.vk.lists.c.l
        public final io.reactivex.rxjava3.core.q<List<? extends FaveTag>> ui(int i, com.vk.lists.c cVar) {
            return rsg0.y0(new jqq(), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<List<FaveTag>> qVar, boolean z, com.vk.lists.c cVar) {
            gsq gsqVar = gsq.this;
            io.reactivex.rxjava3.disposables.c cVar2 = gsqVar.d;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            gsqVar.d = qVar.subscribe(new pf1(new ng3(16, cVar, gsqVar), 17), new kl6(new tb4(23), 16));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.esq] */
    public gsq(Context context) {
        super(context);
        t1o0 t1o0Var = new t1o0(new b(1, this, gsq.class, "openConfirmRemoveTagDialog", "openConfirmRemoveTagDialog(Lcom/vk/dto/newsfeed/FaveTag;)V", 0), new c(0, this, gsq.class, "openNewTagsDialog", "openNewTagsDialog()V", 0), new d(1, this, gsq.class, "editTagDialog", "editTagDialog(Lcom/vk/dto/newsfeed/FaveTag;)V", 0));
        this.b = t1o0Var;
        e eVar = new e();
        this.e = new bd70() { // from class: xsna.esq
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                gsq gsqVar = gsq.this;
                t1o0 t1o0Var2 = gsqVar.b;
                int i3 = 0;
                if (i == 1200) {
                    com.vk.lists.c cVar = gsqVar.c;
                    if (cVar != null) {
                        cVar.p(false);
                        return;
                    }
                    return;
                }
                if (i == 1205 && (obj instanceof FaveTag)) {
                    int size = ((ArrayList) t1o0Var2.y0()).size();
                    while (i3 < size) {
                        if (((FaveTag) ((ArrayList) t1o0Var2.y0()).get(i3)).b == ((FaveTag) obj).b) {
                            ((ArrayList) t1o0Var2.y0()).set(i3, obj);
                            if (!t1o0Var2.K0()) {
                                i3++;
                            }
                            t1o0Var2.notifyItemChanged(i3);
                            return;
                        }
                        i3++;
                    }
                }
            }
        };
        LayoutInflater.from(getContext()).inflate(R.layout.fave_tags_editor_fragment, this);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) findViewById(R.id.tags_editor_list);
        if (recyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
            dVar.c(2);
            dVar.f = 1;
            dVar.a();
            recyclerPaginatedView.setAdapter(t1o0Var);
            recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
            recyclerPaginatedView.getRecyclerView().setPaddingRelative(0, 0, 0, iah0.a(8));
            c.h hVar = new c.h(eVar);
            hVar.s = 0;
            this.c = com.vk.lists.f.a(hVar, recyclerPaginatedView);
            new androidx.recyclerview.widget.r(new a(t1o0Var)).l(recyclerPaginatedView.getRecyclerView());
            recyclerPaginatedView.setSwipeRefreshEnabled(false);
        }
        addOnAttachStateChangeListener(this);
        bwt0.V(this, new t61(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTags(List<FaveTag> list) {
        this.b.setItems(list);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p870 f2 = p870.f();
        esq esqVar = this.e;
        f2.b(1200, esqVar);
        p870.f().b(1205, esqVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p870.f().g(this.e);
    }

    /* compiled from: FaveTagsEditorView.kt */
    public static final class a extends r.d {
        public final t1o0 e;

        public a(t1o0 t1o0Var) {
            this.e = t1o0Var;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            int adapterPosition = e0Var.getAdapterPosition();
            if (this.e.K0() || adapterPosition != 0) {
                return r.d.l(3, 0);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean j() {
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean k() {
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            int adapterPosition = e0Var.getAdapterPosition();
            int adapterPosition2 = e0Var2.getAdapterPosition();
            t1o0 t1o0Var = this.e;
            if (!t1o0Var.K0() && adapterPosition == 0) {
                return false;
            }
            if (!t1o0Var.K0() && adapterPosition2 == 0) {
                return false;
            }
            Collections.swap(t1o0Var.y0(), t1o0Var.K0() ? adapterPosition : adapterPosition - 1, t1o0Var.K0() ? adapterPosition2 : adapterPosition2 - 1);
            Context context = recyclerView.getContext();
            List<FaveTag> y0 = t1o0Var.y0();
            ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
            Iterator it = ((ArrayList) y0).iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((FaveTag) it.next()).b));
            }
            prq prqVar = new prq("fave.reorderTags", 0);
            prqVar.K("ids", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
            io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(prqVar, null, null, 3).subscribe(new l50(new nfj((ListDataSet.ArrayListImpl) y0, 17), 23), new tp0(new gv3(25), 27));
            Activity h = context != null ? e3m.h(context) : null;
            if (h != null) {
                ver0.b(h, subscribe);
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return true;
            }
            adapter.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
