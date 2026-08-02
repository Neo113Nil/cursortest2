package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.c;
import com.vk.core.view.components.tabs.e;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.ikv0;
import xsna.p1s;
import xsna.tlo0;
import xsna.u1s;
import xsna.wzr;

/* compiled from: FoldersPagerViewController.kt */
/* loaded from: classes18.dex */
public final class t1s extends fi6<v1s, p1s> {
    public final Object A;
    public final com.vk.im.engine.models.c B;
    public y5w C;
    public final wuj f;
    public final fib g;
    public final vi00 h;
    public final u5w i;
    public final Fragment j;
    public final m9u0 k;
    public final d7p l;
    public final k0w m;
    public final g9g0 n;
    public final Peer o;
    public ViewGroup p;
    public ViewPager2 q;
    public VkTabs r;
    public com.vk.core.view.components.tabs.e s;
    public View t;
    public VkContextMenu u;
    public final bpn0 v;
    public boolean w;
    public boolean x;
    public final io.reactivex.rxjava3.disposables.b y;
    public j1s z;

    /* compiled from: FoldersPagerViewController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FoldersPagerViewController.kt */
    public static final class b extends ViewPager2.g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            t1s t1sVar = t1s.this;
            j1s j1sVar = t1sVar.z;
            if (j1sVar == null) {
                j1sVar = null;
            }
            xyr xyrVar = (xyr) j5g.b0(i, j1sVar.C.f);
            if (xyrVar != null) {
                t1sVar.O(new p1s.f(xyrVar));
            }
            t1sVar.T(i);
        }
    }

    public t1s(wuj wujVar, fib fibVar, vi00 vi00Var, u5w u5wVar, MultiComponentFragment multiComponentFragment, m9u0 m9u0Var, d7p d7pVar, k0w k0wVar, g9g0 g9g0Var, Peer peer) {
        super(R.layout.vkim_folders_pager, null);
        this.f = wujVar;
        this.g = fibVar;
        this.h = vi00Var;
        this.i = u5wVar;
        this.j = multiComponentFragment;
        this.k = m9u0Var;
        this.l = d7pVar;
        this.m = k0wVar;
        this.n = g9g0Var;
        this.o = peer;
        this.v = new bpn0(new akh(this, 17));
        this.y = new io.reactivex.rxjava3.disposables.b();
        this.A = msy.a(LazyThreadSafetyMode.NONE, new xyh(this, 13));
        this.B = ((ImExperimentsComponent) m7m.d(multiComponentFragment).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.p = (ViewGroup) view.findViewById(R.id.folders_pager_container);
        this.q = (ViewPager2) view.findViewById(R.id.folders_pager);
        ViewPager2 viewPager2 = this.q;
        j1s j1sVar = new j1s(this.j, this.f, this.g, this.h, this.i, viewPager2 == null ? null : viewPager2, this.o);
        this.z = j1sVar;
        ViewPager2 viewPager22 = this.q;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        viewPager22.setAdapter(j1sVar);
        ViewPager2 viewPager23 = this.q;
        if (viewPager23 == null) {
            viewPager23 = null;
        }
        viewPager23.setOffscreenPageLimit(15);
        this.t = view.findViewById(R.id.folder_tab_header_container);
        View view2 = this.t;
        if (view2 != null) {
            dhr0 dhr0Var = dhr0.a;
            this.k.getClass();
            dhr0Var.e0(R.attr.vk_ui_background_content, view2);
        }
        this.B.getClass();
        VkTabs vkTabs = (VkTabs) viewGroup.findViewById(R.id.folders_carousel_vk_tabs);
        this.r = vkTabs;
        ViewPager2 viewPager24 = this.q;
        if (viewPager24 == null) {
            viewPager24 = null;
        }
        com.vk.core.view.components.tabs.e eVar = new com.vk.core.view.components.tabs.e(vkTabs, viewPager24, true, new e.d() { // from class: xsna.s1s
            @Override // com.vk.core.view.components.tabs.e.d
            public final void a(final VkTabs.c cVar, final int i) {
                com.vk.core.view.components.tabs.d dVar = cVar.a;
                final t1s t1sVar = t1s.this;
                j1s j1sVar2 = t1sVar.z;
                List<qko0> list = null;
                if (j1sVar2 == null) {
                    j1sVar2 = null;
                }
                final xyr xyrVar = j1sVar2.C.f.get(i);
                boolean z = xyrVar.a().b;
                ucp ucpVar = ucp.a;
                String y = brm0.y(ucp.i(xyrVar.getName()).toString(), "\n", " ");
                if (defpackage.b.b(y)) {
                    if (y.length() == 0) {
                        list = EmptyList.b;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String obj = y.toString();
                        int i2 = 0;
                        int i3 = -1;
                        int i4 = 0;
                        int i5 = -1;
                        while (i2 < obj.length()) {
                            int codePointAt = obj.codePointAt(i2);
                            int charCount = Character.charCount(codePointAt);
                            if (defpackage.b.d(codePointAt)) {
                                i2 += charCount;
                            } else {
                                if (!defpackage.b.c(codePointAt)) {
                                    if (i5 == i3) {
                                        i5 = i2;
                                    }
                                    i4 = i2 + charCount;
                                } else if (i5 != i3) {
                                    arrayList.add(new qko0(jgz.c(i5, i4)));
                                    i5 = -1;
                                }
                                i2 += charCount;
                                i3 = -1;
                            }
                        }
                        list = arrayList;
                        if (i5 != i3) {
                            arrayList.add(new qko0(jgz.c(i5, i4)));
                            list = arrayList;
                        }
                    }
                }
                dVar.Y4(y, list);
                if (z) {
                    if (xyrVar.getType() == FolderType.MANAGED_GROUPS) {
                        dVar.setBadgeAppearance(xyrVar.a().c ? VkBadge.Appearance.Design.Neutral : VkBadge.Appearance.Design.Accent);
                        dVar.setIndicator(c.a.a);
                    } else {
                        dVar.setCounterAppearance(xyrVar.a().c ? VkCounter.CounterAppearance.Appearance.Neutral : VkCounter.CounterAppearance.Appearance.Accent);
                        dVar.setCounterMode(VkCounter.Mode.Primary);
                        dVar.setIndicator(new c.b(xyrVar.a().a));
                    }
                }
                dVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.q1s
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        t1s.this.O(new p1s.c(xyrVar));
                        return true;
                    }
                });
                dVar.setOnClickListener(new View.OnClickListener() { // from class: xsna.r1s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        t1s.this.S(i, cVar, xyrVar);
                    }
                });
            }
        });
        this.s = eVar;
        eVar.a();
        e1s e1sVar = new e1s(new cfl(this, 9));
        j1s j1sVar2 = this.z;
        if (j1sVar2 == null) {
            j1sVar2 = null;
        }
        if (j1sVar2 == null) {
            j1sVar2 = null;
        }
        if (j1sVar2 != null) {
            j1sVar2.A.b.add(e1sVar);
        }
        ViewPager2 viewPager25 = this.q;
        (viewPager25 != null ? viewPager25 : null).b(new b());
        if (BuildInfo.s()) {
            Peer peer = this.o;
            peer.getClass();
            if (peer.Ab(Peer.Type.GROUP)) {
                return;
            }
            this.C = new y5w(this.i, this.j, new odm(this, 7));
        }
    }

    public final Context R() {
        ViewGroup viewGroup = this.p;
        if (viewGroup == null) {
            viewGroup = null;
        }
        return viewGroup.getContext();
    }

    public final void S(int i, VkTabs.c cVar, xyr xyrVar) {
        VkTabs vkTabs = this.r;
        if (vkTabs == null) {
            vkTabs = null;
        }
        VkTabs.c selectedTab = vkTabs.getSelectedTab();
        if (selectedTab != null && selectedTab.b == i) {
            O(p1s.e.b);
            return;
        }
        this.m.a(xyrVar.getType().j());
        L.e("trackOpenFolder");
        VkTabs vkTabs2 = this.r;
        VkTabs.k(vkTabs2 != null ? vkTabs2 : null, cVar);
        O(new p1s.f(xyrVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(int i) {
        j1s j1sVar = this.z;
        if (j1sVar == null) {
            j1sVar = null;
        }
        Fragment J0 = j1sVar.J0(i);
        if (J0 != null) {
            etm etmVar = J0 instanceof etm ? (etm) J0 : null;
            if (etmVar != null) {
                etmVar.Dh();
                return;
            }
            return;
        }
        j1s j1sVar2 = this.z;
        if (j1sVar2 == null) {
            j1sVar2 = null;
        }
        xyr xyrVar = (xyr) j5g.b0(i, j1sVar2.C.f);
        StringBuilder b2 = ji.b(i, "FoldersPager: empty fragment for selected tab position=", " folderId=");
        b2.append(xyrVar != null ? Integer.valueOf(xyrVar.getId()) : null);
        b2.append(" type=");
        b2.append(xyrVar != null ? xyrVar.getType() : null);
        b2.append(" itemsCount=");
        j1s j1sVar3 = this.z;
        if (j1sVar3 == null) {
            j1sVar3 = null;
        }
        b2.append(j1sVar3.C.f.size());
        b2.append(" currentItem=");
        ViewPager2 viewPager2 = this.q;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        b2.append(viewPager2.getCurrentItem());
        L.l(b2.toString());
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        StringBuilder b3 = ji.b(i, "Empty fragment for selected folder tab: position=", ", folderId=");
        b3.append(xyrVar != null ? Integer.valueOf(xyrVar.getId()) : null);
        b3.append(", type=");
        b3.append(xyrVar != null ? xyrVar.getType() : null);
        b3.append(", itemsCount=");
        j1s j1sVar4 = this.z;
        b3.append((j1sVar4 != null ? j1sVar4 : null).C.f.size());
        bVar.a(new IllegalStateException(b3.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        Drawable drawable;
        lwb0 lwb0Var;
        u1s u1sVar = (u1s) yn50Var;
        if (u1sVar instanceof u1s.e) {
            xyr xyrVar = ((u1s.e) yn50Var).a;
            com.vk.im.popup.a.d((com.vk.im.popup.a) this.v.getValue(), a.$EnumSwitchMapping$0[xyrVar.getType().ordinal()] == 1 ? new avl(R()) : new r3v(R()), new com.vk.catalog2.common.ui.holders.a(11, this, xyrVar), null, null, 12);
            return;
        }
        int i = -1;
        if (u1sVar instanceof u1s.g) {
            xyr xyrVar2 = ((u1s.g) yn50Var).a;
            g9g0 g9g0Var = this.n;
            if (xyrVar2.getId() == -1) {
                g9g0Var.f(R());
                return;
            } else {
                g9g0Var.a(R(), xyrVar2.getId(), xyrVar2.getName(), xyrVar2.getType());
                return;
            }
        }
        int i2 = 6;
        int i3 = 0;
        if (!(u1sVar instanceof u1s.f)) {
            if (u1sVar instanceof u1s.b) {
                j1s j1sVar = this.z;
                j1s j1sVar2 = j1sVar == null ? null : j1sVar;
                Iterator<xyr> it = (j1sVar != null ? j1sVar : null).C.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().getId() == ((u1s.b) yn50Var).a) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                Fragment J0 = j1sVar2.J0(i);
                if (J0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (J0 instanceof qhh0) {
                    ((qhh0) J0).s();
                    return;
                }
                return;
            }
            if (u1sVar instanceof u1s.d) {
                edw edwVar = edw.a;
                Context R = R();
                String str = ((u1s.d) yn50Var).b;
                ie3 ie3Var = new ie3(10, this, yn50Var);
                if (edw.c) {
                    tlo0.a aVar = tlo0.Companion;
                    String format = String.format(R.getString(R.string.vkim_folder_dialog_add_to_folder_toast), Arrays.copyOf(new Object[]{str}, 1));
                    aVar.getClass();
                    fdw.a(R, new tlo0.h(format), new tlo0.f(R.string.vkim_cancel), ie3Var);
                    return;
                }
                ikv0.a aVar2 = new ikv0.a(R);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                aVar2.u = new ikv0.d(String.format(R.getString(R.string.vkim_folder_dialog_add_to_folder_toast), Arrays.copyOf(new Object[]{str}, 1)), (String) null, (ikv0.d.a) null, 6);
                aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, R.getString(R.string.vkim_cancel), new mre(ie3Var, 26));
                edw.b(aVar2);
                return;
            }
            if (u1sVar instanceof u1s.h) {
                edw edwVar2 = edw.a;
                ViewPager2 viewPager2 = this.q;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                Context context = viewPager2.getContext();
                ViewPager2 viewPager22 = this.q;
                Context context2 = (viewPager22 != null ? viewPager22 : null).getContext();
                u1s.h hVar = (u1s.h) yn50Var;
                int i4 = hVar.a;
                Object[] objArr = hVar.b;
                edw.h(context, context2.getString(i4, Arrays.copyOf(objArr, objArr.length)));
                return;
            }
            if (u1sVar instanceof u1s.a) {
                fvr.l(R(), ((u1s.a) yn50Var).a);
                return;
            }
            if (!(u1sVar instanceof u1s.c)) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = ((u1s.c) yn50Var).a;
            VkTabs vkTabs = this.r;
            if (vkTabs == null) {
                vkTabs = null;
            }
            VkTabs.c f = vkTabs.f(i5);
            j1s j1sVar3 = this.z;
            S(i5, f, (j1sVar3 != null ? j1sVar3 : null).C.f.get(i5));
            return;
        }
        u1s.f fVar = (u1s.f) yn50Var;
        List<wzr> list = fVar.a;
        xyr xyrVar3 = fVar.b;
        j1s j1sVar4 = this.z;
        if (j1sVar4 == null) {
            j1sVar4 = null;
        }
        Iterator<xyr> it2 = j1sVar4.C.f.iterator();
        int i6 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i6 = -1;
                break;
            } else if (it2.next().getId() == xyrVar3.getId()) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 < 0) {
            return;
        }
        VkTabs vkTabs2 = this.r;
        if (vkTabs2 == null) {
            vkTabs2 = null;
        }
        VkTabs.c f2 = vkTabs2.f(i6);
        List<wzr> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (wzr wzrVar : list2) {
            if (wzrVar instanceof wzr.a) {
                wzr.a aVar3 = (wzr.a) wzrVar;
                Drawable a2 = m33.a(R.drawable.vk_icon_add_square_outline_28, R());
                if (a2 != null) {
                    sjo.d(a2, dhr0.r(R.attr.vk_ui_icon_accent));
                }
                lwb0Var = new lwb0(null, R.string.vkim_folder_add_peers_option, a2, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent, R())), 0, aVar3, false, null, false, false, 1937);
            } else if (wzrVar instanceof wzr.b) {
                wzr.b bVar = (wzr.b) wzrVar;
                Drawable a3 = m33.a(R.drawable.vk_icon_gear_outline_20, R());
                if (a3 != null) {
                    sjo.d(a3, dhr0.r(R.attr.vk_ui_icon_accent));
                }
                lwb0Var = new lwb0(null, R.string.vkim_folder_configure_option, a3, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent, R())), 0, bVar, false, null, false, false, 1937);
            } else if (epx.f(wzrVar, wzr.c.a)) {
                Drawable a4 = m33.a(R.drawable.vk_icon_gear_outline_20, R());
                if (a4 != null) {
                    sjo.d(a4, dhr0.r(R.attr.vk_ui_icon_accent));
                }
                lwb0Var = new lwb0(null, R.string.vkim_folders_configure_option, a4, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent, R())), 0, wzrVar, false, null, false, false, 1937);
            } else if (wzrVar instanceof wzr.f) {
                wzr.f fVar2 = (wzr.f) wzrVar;
                Drawable a5 = m33.a(R.drawable.vk_icon_message_check_outline_20, R());
                if (a5 != null) {
                    sjo.d(a5, dhr0.r(R.attr.vk_ui_icon_accent));
                }
                lwb0Var = new lwb0(null, fVar2.a.getId() == -1 ? R.string.vkim_folders_mark_all_as_read_option : R.string.vkim_folder_mark_all_as_read_option, a5, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent, R())), 0, fVar2, false, null, false, false, 1937);
            } else if (wzrVar instanceof wzr.e) {
                wzr.e eVar = (wzr.e) wzrVar;
                FolderType type = eVar.a.getType();
                FolderType folderType = FolderType.DEFAULT;
                Drawable a6 = m33.a(type != folderType ? R.drawable.vk_icon_hide_outline_20 : R.drawable.vk_icon_delete_outline_20, R());
                if (a6 != null) {
                    sjo.d(a6, dhr0.r(R.attr.vk_ui_background_negative));
                }
                lwb0Var = new lwb0(null, eVar.a.getType() != folderType ? R.string.vkim_folder_hide_option : R.string.vkim_folder_delete_option, a6, Integer.valueOf(dhr0.Y(R.attr.vk_ui_background_negative, R())), 0, eVar, true, null, false, false, 1937);
            } else {
                if (!(wzrVar instanceof wzr.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                wzr.d dVar = (wzr.d) wzrVar;
                Drawable a7 = m33.a(R.drawable.vk_icon_copy_outline_20, R());
                if (a7 != null) {
                    sjo.d(a7, dhr0.r(R.attr.vk_ui_icon_accent));
                }
                lwb0Var = new lwb0(null, R.string.vkim_folder_copy_link_option, a7, Integer.valueOf(dhr0.Y(R.attr.vk_ui_icon_accent, R())), 0, dVar, false, null, false, false, 1937);
            }
            arrayList.add(lwb0Var);
        }
        com.vk.core.view.components.tabs.d dVar2 = f2.a;
        u9 u9Var = new u9(17, this, xyrVar3);
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        dVar2.getContext();
        e.b bVar2 = new e.b(dVar2, null, null, l, 6);
        bVar2.w = R.layout.ds_internal_context_menu_item;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            lwb0 lwb0Var2 = (lwb0) it3.next();
            CharSequence charSequence = lwb0Var2.a;
            int i7 = lwb0Var2.e;
            int i8 = lwb0Var2.b;
            String obj = (charSequence.length() > 0 ? lwb0Var2.a : i8 != 0 ? R().getString(i8) : "").toString();
            Drawable drawable2 = lwb0Var2.c;
            if (drawable2 == null) {
                if (i7 != 0) {
                    Context R2 = R();
                    e3m.a aVar4 = e3m.a;
                    drawable2 = m33.a(i7, R2);
                } else {
                    drawable = null;
                    VkContextMenu.c.d(bVar2, obj, drawable, false, new j6(i2, u9Var, lwb0Var2), 28);
                }
            }
            drawable = drawable2;
            VkContextMenu.c.d(bVar2, obj, drawable, false, new j6(i2, u9Var, lwb0Var2), 28);
        }
        bVar2.m = iah0.a(8);
        VkContextMenu a8 = bVar2.a();
        this.u = a8;
        a8.j(false);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        v1s v1sVar = (v1s) ao50Var;
        List<xyr> list = v1sVar.c;
        boolean z = this.w;
        boolean z2 = v1sVar.f;
        if (z != z2) {
            ViewGroup viewGroup = this.p;
            if (viewGroup == null) {
                viewGroup = null;
            }
            TransitionManager.endTransitions(viewGroup);
            ViewGroup viewGroup2 = this.p;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            TransitionManager.beginDelayedTransition(viewGroup2);
            VkTabs vkTabs = this.r;
            if (vkTabs == null) {
                vkTabs = null;
            }
            vkTabs.setVisibility(z2 ? 0 : 8);
            this.w = z2;
        }
        j1s j1sVar = this.z;
        if (j1sVar == null) {
            j1sVar = null;
        }
        if (epx.f(list, j1sVar.C.f) || v1sVar.g) {
            return;
        }
        j1s j1sVar2 = this.z;
        if (j1sVar2 == null) {
            j1sVar2 = null;
        }
        j1sVar2.C.b(list, null);
        ViewPager2 viewPager2 = this.q;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        int i = list.size() > 1 ? 1 : 2;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        i1s i1sVar = (i1s) this.A.getValue();
        if (i1sVar != null) {
            i1sVar.l = v1sVar;
        }
        y5w y5wVar = this.C;
        if (y5wVar != null) {
            y5wVar.a();
        }
        if (this.x) {
            return;
        }
        j1s j1sVar3 = this.z;
        if (j1sVar3 == null) {
            j1sVar3 = null;
        }
        if (j1sVar3.C.f.isEmpty()) {
            return;
        }
        this.x = true;
        ViewPager2 viewPager22 = this.q;
        (viewPager22 != null ? viewPager22 : null).post(new vq3(this, 5));
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        this.C = null;
        this.y.e();
        super.onDestroyView();
    }
}
