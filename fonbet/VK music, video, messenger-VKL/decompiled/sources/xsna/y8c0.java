package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fb80;

/* compiled from: PostView.kt */
/* loaded from: classes4.dex */
public final class y8c0 {
    public static final /* synthetic */ qcy<Object>[] J;
    public RecyclerView A;
    public final io.reactivex.rxjava3.disposables.b B;
    public boolean C;
    public final Object D;
    public final Object E;
    public final Object F;
    public ek40 G;
    public final lxd H;
    public r1c0 I;
    public final f0c0 a;
    public final h7m b;
    public final FragmentImpl c;
    public final String d;
    public final mbs e;
    public final f5z f;
    public final mga0 g;
    public bin0<Context> h = new bin0() { // from class: xsna.x8c0
        @Override // xsna.bin0
        public final Object get() {
            return y8c0.this.c.mo2getContext();
        }
    };
    public final s8c0 i = new s8c0(this);
    public final bpn0 j = new bpn0(new gd40(this, 12));
    public final bpn0 k = new bpn0(new re40(this, 12));
    public final bpn0 l = new bpn0(new rf20(this, 13));
    public final Object m;
    public qn60 n;
    public pn60 o;
    public VkContextMenu p;
    public final Object q;
    public final Object r;
    public boolean s;
    public final nzw t;
    public final io.reactivex.rxjava3.disposables.b u;
    public final wt60 v;
    public final bpn0 w;
    public final bpn0 x;
    public final z8c0 y;
    public final a9c0 z;

    /* compiled from: PostView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Post.SourceFrom.values().length];
            try {
                iArr[Post.SourceFrom.Discover.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostView.kt */
    public static final /* synthetic */ class b implements fb80.a, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, y8c0.this, y8c0.class, "getEventScreen", "getEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.fb80.a
        public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
            return a.$EnumSwitchMapping$0[y8c0.this.a.a.ordinal()] == 1 ? MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_POST : MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(y8c0.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/newsfeed_post/presentation/feature/PostMviStore;", 0);
        fpf0.a.getClass();
        J = new qcy[]{propertyReference1Impl};
    }

    public y8c0(xyt0 xyt0Var, f0c0 f0c0Var, l7m l7mVar, FragmentImpl fragmentImpl, String str, mbs mbsVar, f5z f5zVar, mga0 mga0Var) {
        this.a = f0c0Var;
        this.b = l7mVar;
        this.c = fragmentImpl;
        this.d = str;
        this.e = mbsVar;
        this.f = f5zVar;
        this.g = mga0Var;
        ltb0 ltb0Var = new ltb0(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, ltb0Var);
        this.q = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.a(23));
        this.r = msy.a(lazyThreadSafetyMode, new b410(this, 15));
        this.t = new nzw(fpf0.d(n5c0.class).toString(), xyt0Var, new pp00(this, 24));
        this.u = new io.reactivex.rxjava3.disposables.b();
        this.v = l370.t();
        this.w = new bpn0(new ln20(this, 13));
        this.x = new bpn0(new io60(this, 14));
        this.y = new z8c0(this);
        this.z = new a9c0(this);
        this.B = new io.reactivex.rxjava3.disposables.b();
        this.D = msy.a(lazyThreadSafetyMode, new f880(this, 8));
        int i = 19;
        this.E = msy.a(lazyThreadSafetyMode, new g13(i));
        this.F = msy.a(lazyThreadSafetyMode, new h13(i));
        this.H = new lxd(null);
    }

    public final r1c0 a() {
        r1c0 r1c0Var = this.I;
        if (r1c0Var != null) {
            return r1c0Var;
        }
        bin0<Context> bin0Var = this.h;
        mo60 mo60Var = new mo60(new ju4((AtomicReference) this.j.getValue(), (AtomicReference) this.k.getValue()), this.l, this.e, new tr60(this.d, false, new InitializedLazyImpl(Boolean.FALSE), null, null, null, 497), this.y, this.z, this.B, msy.a(LazyThreadSafetyMode.NONE, new b010(this, 26)), new b(), null);
        mo60Var.e = this.h;
        r1c0 r1c0Var2 = new r1c0(bin0Var, mo60Var);
        if (!this.C) {
            this.I = r1c0Var2;
        }
        return r1c0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 b() {
        return (uq60) this.D.getValue();
    }

    public final n5c0 c() {
        qcy<Object> qcyVar = J[0];
        return (n5c0) this.t.getValue();
    }
}
