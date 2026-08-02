package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ybp0;

/* compiled from: TopshelfFragment2.kt */
/* loaded from: classes16.dex */
public final class bcp0 extends Fragment {
    public static final a w;
    public static final /* synthetic */ qcy<Object>[] x;
    public gzs<Boolean> h = new a8j0(8);
    public final Object i;
    public final bpn0 j;
    public final Object k;
    public b l;
    public sh50<ybp0> m;
    public Map<Integer, xh5> n;
    public boolean o;
    public final g7s0 p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final bpn0 u;
    public final g v;

    /* compiled from: TopshelfFragment2.kt */
    public static final class a {
    }

    /* compiled from: TopshelfFragment2.kt */
    public static final class b {
        public final List<UIBlockTopshelf.TopshelfItem> a;
        public final String b;
        public final VideoTopshelfVh.d c;
        public final boolean d;

        public b(List list, String str, VideoTopshelfVh.d dVar, boolean z) {
            this.a = list;
            this.b = str;
            this.c = dVar;
            this.d = z;
        }
    }

    /* compiled from: TopshelfFragment2.kt */
    @b6l(c = "com.vk.catalog2.common.ui.holders.video.topshelf.TopshelfFragment2$onCreate$1", f = "TopshelfFragment2.kt", l = {56}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: TopshelfFragment2.kt */
        public static final /* synthetic */ class a extends AdaptedFunctionReference implements wzs<ybp0, spj<? super s3q0>, Object> {
            @Override // xsna.wzs
            public final Object invoke(ybp0 ybp0Var, spj<? super s3q0> spjVar) {
                bcp0.tn((bcp0) this.receiver, ybp0Var);
                return s3q0.a;
            }
        }

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return bcp0.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bcp0 bcp0Var = bcp0.this;
                sh50<ybp0> sh50Var = bcp0Var.m;
                if (sh50Var != null) {
                    a aVar = new a(2, bcp0Var, bcp0.class, "onTopshelfEvent", "onTopshelfEvent(Lcom/vk/catalog2/common/ui/holders/video/topshelf/TopshelfEvent;)V", 4);
                    this.label = 1;
                    if (rsr.k(sh50Var, aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfFragment2.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ybp0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ybp0 ybp0Var) {
            bcp0.tn((bcp0) this.receiver, ybp0Var);
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfFragment2.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ybp0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ybp0 ybp0Var) {
            bcp0.tn((bcp0) this.receiver, ybp0Var);
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfFragment2.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<xh5, s3q0> {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(xh5 xh5Var) {
            bcp0 bcp0Var = (bcp0) this.receiver;
            bcp0Var.n.put(Integer.valueOf(((Number) bcp0Var.k.getValue()).intValue()), xh5Var);
            return s3q0.a;
        }
    }

    /* compiled from: Delegates.kt */
    public static final class g extends wq70<vcp0> {
        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, vcp0 vcp0Var, vcp0 vcp0Var2) {
            vcp0 vcp0Var3 = vcp0Var2;
            vcp0 vcp0Var4 = vcp0Var;
            if (vcp0Var4 == null || vcp0Var4.equals(vcp0Var3)) {
                return;
            }
            vcp0Var4.onDestroyView();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(bcp0.class, "currentView", "getCurrentView()Lcom/vk/catalog2/common/ui/holders/video/topshelf/TopshelfView;", 0);
        fpf0.a.getClass();
        x = new qcy[]{mutablePropertyReference1Impl};
        w = new a();
    }

    public bcp0() {
        gd40 gd40Var = new gd40(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, gd40Var);
        this.j = new bpn0(new uho0(this, 2));
        this.k = msy.a(lazyThreadSafetyMode, new avj0(this, 11));
        this.n = new LinkedHashMap();
        this.o = true;
        this.p = fxc0.B();
        this.q = msy.a(lazyThreadSafetyMode, new hk70(this, 28));
        int i = 8;
        this.r = msy.a(lazyThreadSafetyMode, new cck0(this, i));
        this.s = msy.a(lazyThreadSafetyMode, new dck0(this, i));
        this.t = msy.a(lazyThreadSafetyMode, new acp0(this, 0));
        this.u = new bpn0(new i8n0(this, 3));
        this.v = new g(null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void tn(bcp0 bcp0Var, ybp0 ybp0Var) {
        sh50<ybp0> sh50Var = bcp0Var.m;
        g gVar = bcp0Var.v;
        if (sh50Var != null) {
            sh50Var.e(ybp0Var);
        }
        boolean z = ybp0Var instanceof ybp0.d;
        qcy<?>[] qcyVarArr = x;
        if (z) {
            vcp0 value = gVar.getValue(bcp0Var, qcyVarArr[0]);
            if (value != null) {
                value.a(((ybp0.d) ybp0Var).a == ((Number) bcp0Var.k.getValue()).intValue());
                return;
            }
            return;
        }
        if (ybp0Var instanceof ybp0.c) {
            vcp0 value2 = gVar.getValue(bcp0Var, qcyVarArr[0]);
            if (value2 != null) {
                value2.b(new ybp0.c(((ybp0.c) ybp0Var).a));
            }
            bcp0Var.o = ((ybp0.c) ybp0Var).a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean("extra_mute")) {
            z = true;
        }
        this.o = z;
        androidx.lifecycle.j a2 = g5z.a(this);
        myc0.h(a2, null, null, new i4z(a2, new c(null), null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c2;
        jp6 hcp0Var;
        b bVar = this.l;
        if (bVar == null) {
            L.i(new NullPointerException("UIBlock is null"));
            return null;
        }
        VideoTopshelfVh.d dVar = bVar.c;
        List<UIBlockTopshelf.TopshelfItem> list = bVar.a;
        ?? r3 = this.k;
        UIBlockTopshelf.TopshelfItem topshelfItem = (UIBlockTopshelf.TopshelfItem) j5g.b0(((Number) r3.getValue()).intValue(), list);
        if (topshelfItem == null) {
            StringBuilder sb = new StringBuilder("Can not resolve UIBlockTopshelf.TopshelfItem. position = ");
            sb.append(((Number) r3.getValue()).intValue());
            sb.append(", list = ");
            b bVar2 = this.l;
            sb.append(bVar2 != null ? bVar2.a : null);
            L.i(new IllegalStateException(sb.toString()));
            return null;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setPadding(0, (int) constraintLayout.getResources().getDimension(R.dimen.video_topshelf_padding_top), 0, 0);
        tu10 tu10Var = new tu10(new e(1, this, bcp0.class, "onTopshelfEvent", "onTopshelfEvent(Lcom/vk/catalog2/common/ui/holders/video/topshelf/TopshelfEvent;)V", 0), new f(1, this, bcp0.class, "onAutoPlayNow", "onAutoPlayNow(Lcom/vk/libvideo/autoplay/AutoPlayNow;)V", 0));
        boolean z = topshelfItem instanceof UIBlockTopshelf.TopshelfLive;
        bpn0 bpn0Var = this.j;
        ?? r32 = this.q;
        ?? r4 = this.i;
        if (z) {
            b25 b25Var = (b25) r32.getValue();
            boolean booleanValue = ((Boolean) r4.getValue()).booleanValue();
            String str = bVar.b;
            boolean z2 = this.o;
            hcp0Var = new ecp0(b25Var, this.p, new zbp0(16, str, booleanValue, ((Boolean) bpn0Var.getValue()).booleanValue(), z2), tu10Var, (UIBlockTopshelf.TopshelfLive) topshelfItem, new b990(this, 23), dVar, this.h, bVar.d);
        } else {
            if (!(topshelfItem instanceof UIBlockTopshelf.TopshelfKids)) {
                if (topshelfItem instanceof UIBlockTopshelf.TopshelfNews) {
                    c2 = 0;
                    hcp0Var = new icp0(new zbp0(48, bVar.b, ((Boolean) r4.getValue()).booleanValue(), ((Boolean) bpn0Var.getValue()).booleanValue(), this.o), (s2f) this.t.getValue(), (ClipsRouter) this.u.getValue(), this.p, tu10Var, (UIBlockTopshelf.TopshelfNews) topshelfItem, new bi80(this, 28), dVar, this.h, bVar.d);
                } else {
                    c2 = 0;
                    hcp0Var = new hcp0(requireContext(), this.p, (b25) r32.getValue(), topshelfItem, new zbp0(48, bVar.b, ((Boolean) r4.getValue()).booleanValue(), ((Boolean) bpn0Var.getValue()).booleanValue(), this.o), tu10Var, new wmd0(this, 12), dVar, this.h, bVar.d);
                }
                hcp0Var.d(constraintLayout);
                this.v.setValue(this, x[c2], hcp0Var);
                return constraintLayout;
            }
            hcp0Var = new dcp0(requireContext(), ((Boolean) r4.getValue()).booleanValue(), new d(1, this, bcp0.class, "onTopshelfEvent", "onTopshelfEvent(Lcom/vk/catalog2/common/ui/holders/video/topshelf/TopshelfEvent;)V", 0), (b25) r32.getValue(), (jlu0) this.r.getValue(), (UIBlockTopshelf.TopshelfKids) topshelfItem, dVar, bVar.d);
        }
        c2 = 0;
        hcp0Var.d(constraintLayout);
        this.v.setValue(this, x[c2], hcp0Var);
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.v.setValue(this, x[0], null);
    }
}
