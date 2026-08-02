package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.ironsource.C4217a2;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.BottomConfirmButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.o0r0;

/* compiled from: CreateChatComponent.kt */
/* loaded from: classes2.dex */
public final class y6k extends j8i {
    public static final /* synthetic */ qcy<Object>[] w;
    public final Context i;
    public final mxv j;
    public final jbs k;
    public final String l;
    public final String m;
    public final lzv n;
    public final f1w o;
    public final com.vk.im.engine.models.c p;
    public final int q = 1;
    public final g9e0 r = new g9e0(new n5i(this, 4));
    public ChatControls s = ChatControls.o;
    public final v230 t;
    public ImCreateChatFragment.b u;
    public final k0w v;

    /* compiled from: CreateChatComponent.kt */
    public static final class a extends wx20 {
        public final drg c;
        public final hj3 d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CreateChatComponent.kt */
        /* renamed from: xsna.y6k$a$a, reason: collision with other inner class name */
        public static final class EnumC4079a {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EnumC4079a[] $VALUES;
            public static final EnumC4079a ALL;
            public static final EnumC4079a DONUTS;

            static {
                EnumC4079a enumC4079a = new EnumC4079a("ALL", 0);
                ALL = enumC4079a;
                EnumC4079a enumC4079a2 = new EnumC4079a("DONUTS", 1);
                DONUTS = enumC4079a2;
                EnumC4079a[] enumC4079aArr = {enumC4079a, enumC4079a2};
                $VALUES = enumC4079aArr;
                $ENTRIES = new asp(enumC4079aArr);
            }

            public EnumC4079a() {
                throw null;
            }

            public static EnumC4079a valueOf(String str) {
                return (EnumC4079a) Enum.valueOf(EnumC4079a.class, str);
            }

            public static EnumC4079a[] values() {
                return (EnumC4079a[]) $VALUES.clone();
            }
        }

        public a(drg drgVar, hj3 hj3Var) {
            this.c = drgVar;
            this.d = hj3Var;
        }

        @Override // xsna.wx20
        public final List<e520> a() {
            EnumC4079a enumC4079a = EnumC4079a.ALL;
            e520 e520Var = new e520(enumC4079a.ordinal(), 0, R.string.vkim_new_chat_admission_all, enumC4079a.ordinal(), false, 0, 0, false, null, 0, null, false, 8178);
            EnumC4079a enumC4079a2 = EnumC4079a.DONUTS;
            return e43.l(e520Var, new e520(enumC4079a2.ordinal(), 0, R.string.vkim_new_chat_admission_dons, enumC4079a2.ordinal(), false, 0, 0, false, null, 0, null, false, 8178));
        }

        @Override // xsna.wx20
        public final void f(Context context, e520 e520Var) {
            int i = e520Var.a;
            if (i == EnumC4079a.ALL.ordinal()) {
                this.c.invoke();
            } else if (i == EnumC4079a.DONUTS.ordinal()) {
                this.d.invoke();
            }
        }
    }

    /* compiled from: CreateChatComponent.kt */
    public final class b implements nkr0 {
        public b() {
        }

        @Override // xsna.nkr0
        public final void a(long j, Peer.Type type) {
            y6k y6kVar = y6k.this;
            v230 v230Var = y6kVar.t;
            List<? extends qtd0> list = v230Var.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                qtd0 qtd0Var = (qtd0) obj;
                if (!qtd0Var.getId().equals(Long.valueOf(j)) || qtd0Var.t8() != type) {
                    arrayList.add(obj);
                }
            }
            v230Var.f = arrayList;
            y6kVar.Y0().a(v230Var);
        }

        @Override // xsna.nkr0
        public final void b() {
            y6k y6kVar = y6k.this;
            iwv.f(y6kVar.j.k(), y6kVar.i, 7754294, null, "im_chat_create", null, null, 48);
        }

        @Override // xsna.nkr0
        public final void c(long j) {
            ImCreateChatFragment.b bVar = y6k.this.u;
            if (bVar != null) {
                g2v.c().d().m(ImCreateChatFragment.this.kn(), new UserId(j), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
        }

        @Override // xsna.nkr0
        public final void d() {
            PermissionHelper permissionHelper = PermissionHelper.a;
            y6k y6kVar = y6k.this;
            Context context = y6kVar.i;
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, context, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new trf(y6kVar, 13), null, 32);
        }

        @Override // xsna.nkr0
        public final void e() {
            PermissionHelper permissionHelper = PermissionHelper.a;
            y6k y6kVar = y6k.this;
            Context context = y6kVar.i;
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new pce(y6kVar, 14), null, 32);
        }

        @Override // xsna.nkr0
        public final void f() {
            y6k y6kVar = y6k.this;
            jbs jbsVar = y6kVar.k;
            Integer num = y6kVar.t.k;
            if (num != null) {
                int intValue = num.intValue();
                ChatControls chatControls = y6kVar.s;
                Peer a = y6kVar.o.a();
                ImCreateChatControlParamsFragment.a aVar = new ImCreateChatControlParamsFragment.a(ImCreateChatControlParamsFragment.class, null, null);
                Bundle bundle = aVar.j;
                bundle.putInt("title", R.string.vkim_new_chat_type);
                bundle.putParcelable("chat_controls", chatControls);
                bundle.putParcelable("owner_id", a);
                bundle.putInt("chat_type", intValue);
                jbsVar.D(aVar.n(jbsVar.a.kn()), 2020, null);
            }
        }

        @Override // xsna.nkr0
        public final void g() {
            y6k y6kVar = y6k.this;
            zt4 zt4Var = new zt4(y6kVar, 28);
            wx20.c(new a(new drg(zt4Var, 6), new hj3(this, y6kVar, zt4Var, 2)), y6kVar.i, "ADMISSION_MENU", 0, 0, 28);
        }

        @Override // xsna.nkr0
        public final void h() {
            y6k y6kVar = y6k.this;
            y6kVar.t.j = "";
            RecyclerView recyclerView = y6kVar.Y0().f;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(0);
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(y6k.class, "vc", "getVc()Lcom/vk/im/ui/components/new_chat/CreateChatVC;", 0);
        fpf0.a.getClass();
        w = new qcy[]{propertyReference1Impl};
    }

    public y6k(Context context, mxv mxvVar, jbs jbsVar, zdw zdwVar, String str, String str2, List list, List list2, boolean z, lzv lzvVar, f1w f1wVar, com.vk.im.engine.models.c cVar) {
        this.i = context;
        this.j = mxvVar;
        this.k = jbsVar;
        this.l = str;
        this.m = str2;
        this.n = lzvVar;
        this.o = f1wVar;
        this.p = cVar;
        Peer a2 = f1wVar.a();
        a2.getClass();
        this.t = new v230(list, list2, a2.Ab(Peer.Type.GROUP), z, str2, 752);
        this.v = zdwVar.d.w();
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        if (this.r.c()) {
            Y0().b(configuration);
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        MenuItem findItem;
        this.r.d();
        j7k Y0 = Y0();
        Y0.getClass();
        View inflate = layoutInflater.inflate(R.layout.vkim_new_chat, viewGroup, false);
        b bVar = Y0.c;
        Context context = Y0.a;
        Y0.h = new t6k(context, Y0.b, bVar);
        Y0.g = inflate.findViewById(R.id.vkim_progress);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_recycler_view);
        Y0.f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = Y0.f;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        t6k t6kVar = Y0.h;
        if (t6kVar == null) {
            t6kVar = null;
        }
        recyclerView2.setAdapter(t6kVar);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        if (bVar2.a(imFeatures)) {
            RecyclerView recyclerView3 = Y0.f;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.addItemDecoration(new a7k(context, on00.f(new Pair(1, context.getString(R.string.vkim_new_chat_participants)))));
        } else {
            RecyclerView recyclerView4 = Y0.f;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.addItemDecoration(new z6k(context, on00.f(new Pair(1, context.getString(R.string.vkim_new_chat_participants)))));
        }
        RecyclerView recyclerView5 = Y0.f;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        RecyclerView.l itemAnimator = recyclerView5.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.t();
        }
        Y0.b(inflate.getContext().getResources().getConfiguration());
        j7k Y02 = Y0();
        owi.a(Y02.d, 200L, new myh(Y02, 2));
        Peer a2 = this.o.a();
        a2.getClass();
        if (a2.Ab(Peer.Type.GROUP)) {
            I0(this.n.b(this, new hpz(0)).m(asu0.a.d()).subscribe(new ff3(new omf(this, 9), 12), new b60(new n3i(this, 4), 19)));
        } else {
            Z0();
        }
        ImCreateChatFragment.b bVar3 = this.u;
        if (bVar3 != null) {
            ImCreateChatFragment imCreateChatFragment = ImCreateChatFragment.this;
            imFeatures.getClass();
            if (!bVar2.a(imFeatures)) {
                BottomConfirmButton bottomConfirmButton = imCreateChatFragment.U;
                if (bottomConfirmButton == null) {
                    bottomConfirmButton = null;
                }
                bottomConfirmButton.setAlpha(1.0f);
                Toolbar toolbar = imCreateChatFragment.R;
                Menu menu = (toolbar != null ? toolbar : null).getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.create_new_chat)) != null) {
                    findItem.setEnabled(true);
                }
            }
        }
        return inflate;
    }

    @Override // xsna.j8i
    public final void N0() {
        j7k Y0 = Y0();
        owi.b(Y0.d);
        ((bzb0) Y0.e.getValue()).a();
        this.r.a();
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        String str;
        String string;
        String str2 = "";
        if (bundle == null || (str = bundle.getString("chat_name", "")) == null) {
            str = this.m;
        }
        v230 v230Var = this.t;
        v230Var.i = str;
        if (bundle != null && (string = bundle.getString("chat_avatar", "")) != null) {
            str2 = string;
        }
        v230Var.j = str2;
        Y0().a(v230Var);
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        v230 v230Var = this.t;
        bundle.putString("chat_name", v230Var.i.toString());
        bundle.putString("chat_avatar", v230Var.j.toString());
    }

    public final void X0() {
        v230 v230Var = this.t;
        List<? extends qtd0> list = v230Var.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((qtd0) obj) instanceof com.vk.im.engine.models.contacts.a)) {
                arrayList.add(obj);
            }
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qtd0 qtd0Var = (qtd0) it.next();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(qtd0Var.G3()));
        }
        List<? extends qtd0> list2 = v230Var.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof com.vk.im.engine.models.contacts.a) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.vk.im.engine.models.contacts.a) it2.next()).c5());
        }
        CharSequence charSequence = v230Var.i;
        String str = v230Var.j;
        boolean z = v230Var.d;
        ChatPermissions q = kq01.q(this.s);
        e0o e0oVar = v230Var.h;
        int i2 = 18;
        I0(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.n.b(this, new x6k(charSequence, str, arrayList2, arrayList4, z, q, e0oVar != null ? Integer.valueOf(e0oVar.a) : null, Boolean.valueOf(epx.f(this.s.k, C4217a2.e)))).m(io.reactivex.rxjava3.android.schedulers.a.b()), new bn3(new i4h(this, 9), 20)), new l46(this, 4)).subscribe(new com.vk.im.ui.components.dialogs_list.b(new fh1(i, this, arrayList2), i2), new eu0(new b5h(this, 5), i2)));
    }

    public final j7k Y0() {
        qcy<Object> qcyVar = w[0];
        return (j7k) this.r.b();
    }

    public final void Z0() {
        v230 v230Var = this.t;
        I0(this.n.a(this, new aqz(v230Var.a, v230Var.b), new m20(this, 17), new c60(this, 18)));
    }
}
