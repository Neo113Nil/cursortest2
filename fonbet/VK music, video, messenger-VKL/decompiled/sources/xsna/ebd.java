package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannedString;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a3p0;
import xsna.b25;
import xsna.ebd;
import xsna.ixe;
import xsna.tlo0;
import xsna.y2p0;

/* compiled from: ClipProfileToolbar.kt */
/* loaded from: classes17.dex */
public final class ebd extends sjd {
    public static final /* synthetic */ qcy<Object>[] I;
    public static final String J;
    public final y2p0 A;
    public izs<? super ClipGridParams.Data.Profile, s3q0> B;
    public final HashMap<UserId, ClipGridParams.Data.Profile> C;
    public final a D;
    public final uvm0 E;
    public final oxj F;
    public final dbd G;
    public final Object H;
    public final c6f o;
    public final uge p;
    public final cye q;
    public jce r;
    public final FrameLayout s;
    public final ComposeView t;
    public final dg9 u;
    public final abe0 v;
    public boolean w;
    public final boolean x;
    public dw20 y;
    public final fxe z;

    /* compiled from: ClipProfileToolbar.kt */
    public static final class a implements p7f0<ebd, List<? extends UserId>> {
        public List<UserId> b;

        @Override // xsna.i7f0
        public final Object getValue(Object obj, qcy qcyVar) {
            List<UserId> list = this.b;
            if (list != null) {
                return list;
            }
            List<UserId> u0 = rl3.u0(g620.f().e().D());
            this.b = u0;
            return u0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.p7f0
        public final void setValue(ebd ebdVar, qcy qcyVar, List<? extends UserId> list) {
            this.b = list;
        }
    }

    /* compiled from: ClipProfileToolbar.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<String, Boolean, s8u0> {
        @Override // xsna.wzs
        public final s8u0 invoke(String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            return ebd.m((ebd) this.receiver, str, booleanValue);
        }
    }

    /* compiled from: ClipProfileToolbar.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<String, Boolean, s8u0> {
        @Override // xsna.wzs
        public final s8u0 invoke(String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            return ebd.m((ebd) this.receiver, str, booleanValue);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ebd.class, "selectedIds", "getSelectedIds()Ljava/util/List;", 0);
        fpf0.a.getClass();
        I = new qcy[]{mutablePropertyReference1Impl};
        J = i5s.a(new StringBuilder("https://"), a0a.d, "/app6363684#?act=clipList&owner_id=");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [xsna.b25$a, xsna.dbd] */
    public ebd(f5z f5zVar, View view, fee feeVar, ree reeVar, Lazy lazy, UserId userId, c6f c6fVar, uge ugeVar, nye nyeVar) {
        super(feeVar, view, reeVar);
        this.o = c6fVar;
        this.p = ugeVar;
        cye cyeVar = new cye(new ixe.j(userId, feeVar.F0()), lazy);
        this.q = cyeVar;
        this.s = new FrameLayout(this.h);
        ComposeView c2 = nyeVar.c();
        this.t = c2;
        this.u = new dg9(feeVar, this, view);
        this.v = new abe0(feeVar, view);
        this.x = true;
        this.z = new fxe();
        this.A = new y2p0(feeVar, this.d, true);
        this.B = new vr0(10);
        this.C = new HashMap<>();
        this.D = new a();
        this.E = new uvm0(view.getContext(), this, cyeVar, feeVar);
        this.F = new oxj(feeVar, view.getContext());
        ?? r15 = new b25.a() { // from class: xsna.dbd
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                if (tbu0Var.b()) {
                    ebd ebdVar = ebd.this;
                    ebdVar.C.clear();
                    List<UserId> u0 = rl3.u0(g620.f().e().D());
                    ebd.a aVar = ebdVar.D;
                    qcy<Object> qcyVar = ebd.I[0];
                    aVar.b = u0;
                    ebdVar.q.C(ixe.s.b);
                }
            }
        };
        this.G = r15;
        this.H = msy.a(LazyThreadSafetyMode.NONE, new yc(view, 18));
        VkTopBar vkTopBar = this.d;
        boolean z = reeVar.a;
        vkTopBar.setVisibility(!z ? 0 : 8);
        if (z && !s()) {
            bwt0.l(nyeVar.c(), 100L, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 18), null);
        }
        cyeVar.A();
        nyeVar.f(cyeVar.c.g(), new on(this, 19));
        cyeVar.g.a(new u19(1, this, ebd.class, "observeClipsProfileSwapToolbarEvents", "observeClipsProfileSwapToolbarEvents(Lcom/vk/clips/viewer/impl/grid/toolbar/profile/swap/mvi/models/ClipsProfileToolbarExternalEvent;)V", 0, 1), f5zVar);
        c2.setVisibility(0);
        o25.a().b0(r15);
    }

    public static final s8u0 m(ebd ebdVar, String str, boolean z) {
        CharSequence charSequence;
        ebdVar.getClass();
        String d = cqm0.d(drm0.p0(str).toString());
        String str2 = (String) j5g.i0(drm0.Q(d));
        if (drm0.Q(d).size() == 1 && drm0.E(str2, '\n')) {
            int length = d.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    char charAt = d.charAt(length);
                    if (charAt != '\n' && !ro.j(charAt)) {
                        charSequence = d.subSequence(0, length + 1);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
            charSequence = "";
            d = charSequence.toString();
        }
        fxe fxeVar = ebdVar.z;
        final hbd hbdVar = new hbd(1, ebdVar.q, cye.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0);
        fxeVar.getClass();
        s8u0 s8u0Var = new s8u0(0);
        SpannedString valueOf = SpannedString.valueOf(fxe.a(fxeVar, d, z));
        Iterable<qjc> u0 = valueOf != null ? rl3.u0(valueOf.getSpans(0, valueOf.length(), qjc.class)) : EmptyList.b;
        int i2 = s8u0Var.i(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextMuted));
        try {
            s8u0Var.e(valueOf.toString());
            for (final qjc qjcVar : u0) {
                s8u0Var.d(new klv0(VkTypographyToken.FootnoteNormal, VkColorToken.TextLink), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
                s8u0Var.a(new h2v0(qjg.a(qjcVar), null, new i9z() { // from class: xsna.zwe
                    @Override // xsna.i9z
                    public final void a(q8z q8zVar) {
                        String i3 = qjcVar.i();
                        if (i3 == null) {
                            i3 = "";
                        }
                        hbd.this.invoke(new ixe.i(i3));
                    }
                }), valueOf.getSpanStart(qjcVar), valueOf.getSpanEnd(qjcVar));
            }
            s3q0 s3q0Var = s3q0.a;
            s8u0Var.f(i2);
            return s8u0Var;
        } catch (Throwable th) {
            s8u0Var.f(i2);
            throw th;
        }
    }

    @Override // xsna.sjd, xsna.d3p0
    public final void a() {
        if (this.C.isEmpty()) {
            this.t.setVisibility(0);
            this.q.C(new ixe.l(this.a.F0()));
        }
    }

    @Override // xsna.d3p0
    public final void b(a3p0 a3p0Var) {
        HashMap<UserId, ClipGridParams.Data.Profile> hashMap;
        if (a3p0Var instanceof a3p0.b) {
            l().setVisibility(8);
            int i = 0;
            k().setVisibility(0);
            a3p0.b bVar = (a3p0.b) a3p0Var;
            boolean z = bVar instanceof a3p0.b.a;
            cye cyeVar = this.q;
            if (z) {
                ClipGridParams.Data.Profile profile = ((a3p0.b.a) a3p0Var).a;
                if (o(profile.b)) {
                    return;
                }
                ClipsAuthor clipsAuthor = profile.b;
                Deactivation deactivation = clipsAuthor.j;
                y2p0 y2p0Var = this.A;
                if (deactivation == null) {
                    y2p0Var.b(profile);
                } else {
                    this.a.E0(false);
                    y2p0Var.a(rl3.y0(new y2p0.a[]{new y2p0.a.d(profile), y2p0.a.c.a}));
                }
                uvm0 uvm0Var = this.E;
                uvm0Var.getClass();
                uvm0Var.e.b(xwk.e().T().m().d.a0(asu0.a.d()).subscribe(new h4f0(new qvm0(i, clipsAuthor, uvm0Var), 7)));
                r(clipsAuthor.e);
                cyeVar.C(new ixe.p(profile, new fbd(2, this, ebd.class, "getComposeAnnotatedDescription", "getComposeAnnotatedDescription(Ljava/lang/String;Z)Lcom/vk/core/compose/annotated/VkAnnotatedStringBuilder;", 0)));
                return;
            }
            if (!(bVar instanceof a3p0.b.C2520b)) {
                throw new NoWhenBranchMatchedException();
            }
            a3p0.b.C2520b c2520b = (a3p0.b.C2520b) a3p0Var;
            this.B = c2520b.d;
            this.w = true;
            ArrayList arrayList = c2520b.a;
            UserId userId = c2520b.b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = this.C;
                if (!hasNext) {
                    break;
                }
                ClipGridParams.Data.Profile profile2 = (ClipGridParams.Data.Profile) it.next();
                hashMap.put(profile2.b.b.b, profile2);
            }
            boolean contains = n().contains(userId);
            qcy<Object>[] qcyVarArr = I;
            a aVar = this.D;
            if (!contains) {
                ArrayList v0 = j5g.v0(userId, n());
                qcy<Object> qcyVar = qcyVarArr[0];
                aVar.b = v0;
            }
            if (!n().contains(o25.a().c())) {
                ArrayList v02 = j5g.v0(o25.a().c(), n());
                qcy<Object> qcyVar2 = qcyVarArr[0];
                aVar.b = v02;
            }
            cyeVar.C(new ixe.h(j5g.O0(hashMap.values()), n(), new gbd(2, this, ebd.class, "getComposeAnnotatedDescription", "getComposeAnnotatedDescription(Ljava/lang/String;Z)Lcom/vk/core/compose/annotated/VkAnnotatedStringBuilder;", 0)));
        }
    }

    @Override // xsna.d3p0
    public final dg9 c() {
        return this.u;
    }

    @Override // xsna.sjd, xsna.d3p0
    public final void d(v9f v9fVar) {
        boolean z = v9fVar instanceof t9f;
        cye cyeVar = this.q;
        if (z) {
            cyeVar.C(new ixe.n(((t9f) v9fVar).a));
        } else {
            if (!(v9fVar instanceof u9f)) {
                throw new NoWhenBranchMatchedException();
            }
            cyeVar.C(new ixe.t(((u9f) v9fVar).a));
        }
    }

    @Override // xsna.d3p0
    public final boolean f() {
        return this.w;
    }

    @Override // xsna.d3p0
    public final void g(ClipGridParams.Data data) {
        if (data instanceof ClipGridParams.Data.Profile) {
            ClipGridParams.Data.Profile profile = (ClipGridParams.Data.Profile) data;
            if (!o(profile.b)) {
                this.q.C(new ixe.p(profile, new c(2, this, ebd.class, "getComposeAnnotatedDescription", "getComposeAnnotatedDescription(Ljava/lang/String;Z)Lcom/vk/core/compose/annotated/VkAnnotatedStringBuilder;", 0)));
            }
        }
    }

    @Override // xsna.sjd, xsna.d3p0
    public final void h(a3p0.c cVar) {
        r(this.h.getString(R.string.clip_grid_anon_id));
        y2p0 y2p0Var = this.A;
        y2p0Var.getClass();
        y2p0Var.a(Collections.singleton(y2p0.a.c.a));
        this.q.C(new ixe.m(cVar));
    }

    @Override // xsna.d3p0
    public final abe0 i() {
        return this.v;
    }

    @Override // xsna.sjd
    public final boolean j() {
        return this.x;
    }

    @Override // xsna.sjd
    public final View k() {
        return this.t;
    }

    @Override // xsna.sjd
    public final FrameLayout l() {
        return this.s;
    }

    public final List<UserId> n() {
        qcy<Object> qcyVar = I[0];
        a aVar = this.D;
        List<UserId> list = aVar.b;
        if (list != null) {
            return list;
        }
        List<UserId> u0 = rl3.u0(g620.f().e().D());
        aVar.b = u0;
        return u0;
    }

    public final boolean o(ClipsAuthor clipsAuthor) {
        Owner owner = clipsAuthor.b;
        if (qr.f(owner.b) && fkq0.d(owner.b)) {
            return true;
        }
        return fkq0.b(owner.b) && this.a.F0();
    }

    @Override // xsna.d3p0
    public final void onDestroyView() {
        boolean z;
        FragmentManager supportFragmentManager;
        o25.a().B(this.G);
        this.E.e.dispose();
        Context context = this.h;
        while (true) {
            z = context instanceof AppCompatActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context : null);
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.f("picker_bs_result_req_key");
    }

    public final void p(ClipsAuthor clipsAuthor, String str) {
        ClipsAuthor e = ClipsAuthor.e(clipsAuthor, null, str, 127);
        UserId userId = e.b.b;
        ClipGridParams.Data.Profile profile = new ClipGridParams.Data.Profile(e);
        HashMap<UserId, ClipGridParams.Data.Profile> hashMap = this.C;
        hashMap.put(userId, profile);
        this.q.C(new ixe.h(j5g.O0(hashMap.values()), n(), new b(2, this, ebd.class, "getComposeAnnotatedDescription", "getComposeAnnotatedDescription(Ljava/lang/String;Z)Lcom/vk/core/compose/annotated/VkAnnotatedStringBuilder;", 0)));
    }

    public final void q(iee ieeVar) {
        this.E.g = ieeVar;
        this.r = ieeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(String str) {
        tlo0.a aVar = tlo0.Companion;
        if (str == null) {
            str = "";
        }
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        this.d.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, str), null, null, null, null, 30), cVar, objArr, com.vk.core.compose.component.semantics.b.a(null, new od3(8), 3), 6));
    }

    public final boolean s() {
        c6f c6fVar = this.o;
        Integer valueOf = c6fVar != null ? Integer.valueOf(c6fVar.T3()) : null;
        if (valueOf == null || valueOf.intValue() <= 0) {
            return false;
        }
        int intValue = valueOf.intValue();
        see seeVar = this.k;
        seeVar.d = intValue;
        seeVar.a();
        return true;
    }
}
