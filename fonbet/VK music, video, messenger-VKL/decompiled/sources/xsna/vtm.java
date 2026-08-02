package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import xsna.e3m;
import xsna.ffp;
import xsna.hgp;
import xsna.hhp;
import xsna.igp;
import xsna.ofe0;

/* compiled from: DialogsListVc.java */
/* loaded from: classes2.dex */
public final class vtm extends ur6 {
    public pep A;
    public hhp B;
    public int C;
    public qsm D;
    public final boolean E;

    @Nullable
    public xtm F;
    public bzb0 G;
    public final com.vk.im.engine.models.c H;

    @Nullable
    public irb I;
    public jim J;
    public final io.reactivex.rxjava3.disposables.b K;
    public final io.reactivex.rxjava3.subjects.f<hfz> L;
    public wtm M;
    public Context d;
    public g e;
    public final Handler f;
    public final Object g;

    @NonNull
    public final mxv h;

    @NonNull
    public final zdw i;

    @Nullable
    public final asm j;

    @NonNull
    public final ltm k;
    public DialogSkeletonView l;
    public View m;
    public RecyclerView n;
    public final RecyclerView.u o;
    public final LayoutInflater p;
    public LinearLayoutManager q;
    public bsm r;
    public f s;
    public e t;
    public final ofe0 u;
    public final h v;
    public igp w;
    public hgp x;
    public bhp y;
    public ffp z;

    /* compiled from: DialogsListVc.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            a = iArr;
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DialogsFilter.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DialogsFilter.UNREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DialogsFilter.CHATS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[DialogsFilter.REQUESTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[DialogsFilter.ARCHIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: DialogsListVc.java */
    public class b extends yj3<zqr0<? extends View>> {
        public b(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // xsna.yj3
        public final void l(@NonNull MotionEvent motionEvent) {
            u(motionEvent);
        }

        @Override // xsna.yj3
        public final void m(@NonNull zqr0<? extends View> zqr0Var) {
            DialogExt V5 = zqr0Var.V5();
            xtm xtmVar = vtm.this.F;
            if (xtmVar != null) {
                xtmVar.f(V5);
            }
        }

        @Override // xsna.yj3
        public final void n(@NonNull zqr0<? extends View> zqr0Var) {
            zqr0<? extends View> zqr0Var2 = zqr0Var;
            if (zqr0Var2 instanceof yqr0) {
                yqr0 yqr0Var = (yqr0) zqr0Var2;
                View avatarView = ((DialogItemView) yqr0Var.l).getAvatarView();
                DialogExt V5 = zqr0Var2.V5();
                qtd0 Cb = V5.b.Cb(Long.valueOf(V5.e));
                xtm xtmVar = vtm.this.F;
                if (xtmVar == null || Cb == null) {
                    return;
                }
                agm agmVar = yqr0Var.x;
                if (agmVar == null) {
                    agmVar = null;
                }
                ImStoryState imStoryState = agmVar.t;
                imStoryState.getClass();
                xtmVar.l(avatarView, Cb, imStoryState == ImStoryState.NEW);
            }
        }

        @Override // xsna.yj3
        public final void o(@NonNull zqr0<? extends View> zqr0Var) {
            zqr0<? extends View> zqr0Var2 = zqr0Var;
            if (zqr0Var2 instanceof yqr0) {
                yqr0 yqr0Var = (yqr0) zqr0Var2;
                jim jimVar = vtm.this.J;
                if (jimVar != null) {
                    jimVar.b.setItemAnimator((RecyclerView.l) jimVar.f.getValue());
                    jimVar.e.x(yqr0Var);
                    jimVar.g = yqr0Var.getAdapterPosition();
                    jimVar.d = yqr0Var.itemView.getBackground();
                    Context context = jimVar.a;
                    e3m.a aVar = e3m.a;
                    yqr0Var.itemView.setBackground(m33.a(R.drawable.vkim_white_bg_with_big_corners, context));
                    yqr0Var.B = true;
                    DialogItemView dialogItemView = (DialogItemView) yqr0Var.l;
                    yqr0Var.A = dialogItemView.getExtraIconType();
                    yqr0Var.W5();
                    DialogItemView.ExtraIcon extraIcon = DialogItemView.ExtraIcon.DRAG;
                    Dialog dialog = yqr0Var.m;
                    if (dialog == null) {
                        dialog = null;
                    }
                    dialogItemView.j(extraIcon, !yqr0.a6(dialog));
                }
            }
        }

        @Override // xsna.yj3
        public final void p() {
            vtm vtmVar = vtm.this;
            irb irbVar = vtmVar.I;
            if (irbVar != null) {
                irbVar.a();
                vtmVar.I = null;
            }
        }

        @Override // xsna.yj3
        public final void q(@NonNull zqr0<? extends View> zqr0Var) {
            DialogExt V5 = zqr0Var.V5();
            xtm xtmVar = vtm.this.F;
            if (xtmVar != null) {
                xtmVar.c(V5);
            }
        }

        @Override // xsna.yj3
        public final void t(@NonNull zqr0<? extends View> zqr0Var) {
            vtm vtmVar = vtm.this;
            Context context = vtmVar.d;
            bpn0 bpn0Var = enj.a;
            AppCompatActivity appCompatActivity = (AppCompatActivity) e3m.h(context);
            DialogExt V5 = zqr0Var.V5();
            mxv mxvVar = vtmVar.h;
            zdw zdwVar = vtmVar.i;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            irb irbVar = new irb(appCompatActivity, mxvVar, zdwVar, V5, Peer.Unknown.e, ajm.a(V5, vtmVar.H, com.vk.dto.common.a.a(o25.a().c()), vtmVar.d), new o40(vtmVar, 16));
            vtmVar.I = irbVar;
            irbVar.f();
        }

        @Override // xsna.yj3
        public final void u(@NonNull MotionEvent motionEvent) {
            irb irbVar = vtm.this.I;
            if (irbVar == null) {
                return;
            }
            irbVar.c(motionEvent);
        }

        @Override // xsna.yj3
        public final boolean w(@NonNull zqr0<? extends View> zqr0Var, float f) {
            irb irbVar = vtm.this.I;
            if (irbVar == null) {
                return false;
            }
            if (f < irbVar.f) {
                irbVar.b(f);
                return false;
            }
            irbVar.d();
            return true;
        }
    }

    /* compiled from: DialogsListVc.java */
    public class c {
        public c() {
        }
    }

    /* compiled from: DialogsListVc.java */
    public class d implements ViewTreeObserver.OnPreDrawListener {
        public WeakReference<RecyclerView> b;
        public WeakReference<ViewTreeObserver> c;

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            WeakReference<ViewTreeObserver> weakReference = this.c;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                this.c = null;
            }
            WeakReference<RecyclerView> weakReference2 = this.b;
            if (weakReference2 == null) {
                return false;
            }
            RecyclerView recyclerView = weakReference2.get();
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
            this.b = null;
            return false;
        }
    }

    /* compiled from: DialogsListVc.java */
    public class e extends gc80 {
        public e(int i) {
            super(i);
        }

        @Override // xsna.gc80
        public final void l(boolean z) {
            xtm xtmVar;
            if (!z || (xtmVar = vtm.this.F) == null) {
                return;
            }
            xtmVar.i();
        }

        @Override // xsna.gc80
        public final void m(boolean z) {
            xtm xtmVar;
            if (!z || (xtmVar = vtm.this.F) == null) {
                return;
            }
            xtmVar.p();
        }
    }

    /* compiled from: DialogsListVc.java */
    public class f extends vc80 {
        public final bsm f;

        public f(bsm bsmVar) {
            this.f = bsmVar;
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            xtm xtmVar;
            boolean z = i3 > 0;
            boolean z2 = i3 - i2 <= 15;
            vtm vtmVar = vtm.this;
            if (z && z2 && (xtmVar = vtmVar.F) != null) {
                xtmVar.j("Scroll");
            }
            List<T> list = this.f.c.f;
            Iterator it = list.subList(i, Math.min(i2 + 1, list.size())).iterator();
            while (it.hasNext()) {
                vtmVar.L.onNext((ogm) it.next());
            }
        }
    }

    /* compiled from: DialogsListVc.java */
    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            wjf0.d(vtm.this.n);
        }
    }

    /* compiled from: DialogsListVc.java */
    public class h implements igp.a, hgp.a, ffp.a, hhp.a {
        public h() {
        }
    }

    public vtm(RecyclerView.u uVar, LayoutInflater layoutInflater, mxv mxvVar, zdw zdwVar, @Nullable asm asmVar, boolean z, ltm ltmVar) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new Object();
        this.u = new ofe0();
        this.v = new h();
        this.C = 1;
        this.D = new qsm();
        this.F = null;
        this.G = null;
        this.K = new io.reactivex.rxjava3.disposables.b();
        this.o = uVar;
        this.p = layoutInflater;
        this.h = mxvVar;
        this.i = zdwVar;
        a1w a1wVar = zdwVar.b;
        a1wVar.getClass();
        this.H = a1wVar.r().h;
        this.j = asmVar;
        this.E = z;
        this.k = ltmVar;
        this.L = new io.reactivex.rxjava3.subjects.f<>();
    }

    @Override // xsna.ur6
    public final void e() {
        this.K.e();
        ofe0 ofe0Var = this.u;
        ofe0Var.f = null;
        LinkedHashMap<pfe0, PullFromTopMode> linkedHashMap = ofe0Var.n;
        ((Handler) ofe0Var.e.getValue()).removeCallbacksAndMessages(null);
        RecyclerView recyclerView = ofe0Var.g;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener((ofe0.f) ofe0Var.b.getValue());
            recyclerView.removeOnChildAttachStateChangeListener((ofe0.a) ofe0Var.c.getValue());
        }
        RecyclerView.Adapter<?> adapter = ofe0Var.i;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((ofe0.c) ofe0Var.d.getValue());
            ofe0Var.i = null;
        }
        ofe0Var.h = null;
        ofe0Var.g = null;
        Iterator<Map.Entry<pfe0, PullFromTopMode>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ofe0Var.a(it.next().getKey().getView(), true);
        }
        linkedHashMap.clear();
        owi.b(this.g);
        this.f.removeCallbacksAndMessages(null);
        this.d.unregisterReceiver(this.e);
        this.M.a();
        this.G.a();
    }

    @Override // xsna.ur6
    public final void f() {
        this.n.setItemAnimator(null);
        this.n.removeOnScrollListener(this.s);
        this.n.removeOnScrollListener(this.t);
    }

    @Override // xsna.ur6
    public final void g() {
        this.n.addOnScrollListener(this.t);
        this.n.addOnScrollListener(this.s);
    }

    public final void h(@NonNull Object obj) {
        int i = this.C;
        Object obj2 = this.g;
        switch (i) {
            case 1:
                owi.a(obj2, 300L, new jpf(this, 12));
                return;
            case 2:
                owi.a(obj2, 300L, new qbj(this, 2));
                return;
            case 3:
            default:
                throw new IllegalStateException("Unknown state: " + this.C);
            case 4:
                owi.a(obj2, 300L, new m2j(this, 4));
                return;
            case 5:
                owi.b(obj2);
                ltm ltmVar = this.k;
                if (ltmVar.isEnabled()) {
                    bwt0.k(this.l, new yve(this, 14));
                }
                this.l.setVisibility(8);
                this.w.e(false);
                this.x.c(false);
                this.y.c(false);
                this.z.c(false);
                this.A.c(false);
                this.B.c(false);
                if (ltmVar.isEnabled()) {
                    ltmVar.a();
                }
                this.r.submitList(this.D.a);
                this.n.setVisibility(0);
                this.f.post(new zz9(1, this, obj));
                return;
            case 6:
                owi.a(obj2, 300L, new dnh(this, 12));
                return;
            case 7:
                owi.a(obj2, 300L, new sfg(this, 11));
                return;
            case 8:
                owi.a(obj2, 300L, new m2g(this, 11));
                return;
        }
    }

    public final void i(io.reactivex.rxjava3.functions.m<agm> mVar, io.reactivex.rxjava3.functions.f<Set<Peer>> fVar) {
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(this.L.b0(agm.class), mVar).U(new pn(14)).d(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, new stm()), new sn(16));
        int i = kwg0.a;
        this.K.b(i0Var.subscribe(fVar, new de9(1)));
    }

    public final boolean j() {
        int s = this.q.s();
        if (s <= 0 || !this.n.canScrollVertically(-1)) {
            return false;
        }
        this.n.stopScroll();
        if (s < 50) {
            this.q.smoothScrollToPosition(this.n, null, 0);
            return true;
        }
        this.q.scrollToPosition(0);
        return true;
    }

    public final void k(@NonNull Object obj, qsm qsmVar) {
        List<ogm> list = qsmVar.a;
        DialogsFilter dialogsFilter = qsmVar.c;
        if (!list.isEmpty()) {
            this.C = 5;
        } else if (qsmVar.g != null) {
            this.C = 8;
        } else {
            switch (a.a[dialogsFilter.ordinal()]) {
                case 1:
                case 2:
                    this.C = 2;
                    break;
                case 3:
                    this.C = 3;
                    break;
                case 4:
                    this.C = 6;
                    break;
                case 5:
                    this.C = 4;
                    break;
                case 6:
                    this.C = 7;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filter: " + dialogsFilter);
            }
        }
        this.D = qsmVar;
        h(obj);
    }
}
