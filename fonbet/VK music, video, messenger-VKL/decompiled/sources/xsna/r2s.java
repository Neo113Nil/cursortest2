package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.popup.Popup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bzr;
import xsna.ifo;
import xsna.j2s;
import xsna.p2s;
import xsna.r0s;
import xsna.s2s;
import xsna.xzr;

/* compiled from: FoldersShowViewController.kt */
/* loaded from: classes18.dex */
public final class r2s extends fi6<t2s, p2s> {
    public RecyclerView f;
    public a0s g;
    public VkTopBar h;
    public View i;
    public ifo<o2s> j;
    public final bpn0 k;
    public List<? extends hfz> l;

    @SuppressLint({"NotifyDataSetChanged"})
    public final q2s m;

    /* compiled from: FoldersShowViewController.kt */
    public final class a implements e680, j2s.b, r0s.a, xzr.a {
        public a() {
        }

        @Override // xsna.e680
        public final void a(yyr yyrVar) {
            r2s.this.a.onNext(new p2s.e(yyrVar));
        }

        @Override // xsna.e680
        public final void b() {
            ifo<o2s> ifoVar = r2s.this.j;
            if (ifoVar == null) {
                ifoVar = null;
            }
            ifoVar.a();
        }

        @Override // xsna.e680
        public final void c(yyr yyrVar) {
            r2s.this.a.onNext(new p2s.d(yyrVar));
        }

        @Override // xsna.e680
        public final void d(azr azrVar) {
            ifo<o2s> ifoVar = r2s.this.j;
            if (ifoVar == null) {
                ifoVar = null;
            }
            if (ifoVar.c.g != null) {
                return;
            }
            awt0.p(azrVar.itemView);
            ifoVar.d.x(azrVar);
            azrVar.getAdapterPosition();
        }

        @Override // xsna.r0s.a
        public final void e() {
            r2s.this.a.onNext(p2s.a.b);
        }

        @Override // xsna.xzr.a
        public final void f(xzr xzrVar) {
            r2s.this.a.onNext(new p2s.f(xzrVar));
        }

        @Override // xsna.j2s.b
        public final void v() {
            r2s.this.a.onNext(p2s.a.b);
        }
    }

    /* compiled from: FoldersShowViewController.kt */
    public static final /* synthetic */ class b {
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

    /* compiled from: FoldersShowViewController.kt */
    public static final class c implements ifo.b {
        public c() {
        }

        @Override // xsna.ifo.b
        public final void a(hfz hfzVar, int i) {
            if (hfzVar instanceof yyr) {
                r2s.this.a.onNext(new p2s.g((yyr) hfzVar, i));
            }
        }
    }

    public r2s() {
        super(R.layout.vkim_folders_show_fragment, null);
        this.k = new bpn0(new x5i(this, 17));
        this.m = new q2s(this);
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        this.g = new a0s(new a());
        this.f = (RecyclerView) view.findViewById(R.id.vkim_recycler_view);
        a0s a0sVar = this.g;
        if (a0sVar == null) {
            a0sVar = null;
        }
        a0sVar.setHasStableIds(true);
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            recyclerView = null;
        }
        a0s a0sVar2 = this.g;
        if (a0sVar2 == null) {
            a0sVar2 = null;
        }
        recyclerView.setAdapter(a0sVar2);
        this.h = (VkTopBar) view.findViewById(R.id.im_toolbar);
        this.i = view.findViewById(R.id.progress);
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        c cVar = new c();
        a0s a0sVar3 = this.g;
        if (a0sVar3 == null) {
            a0sVar3 = null;
        }
        this.j = new ifo<>(recyclerView2, cVar, a0sVar3);
        Context context = view.getContext();
        VkTopBar vkTopBar = this.h;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setShowBottomDivider(true);
        VkTopBar vkTopBar2 = this.h;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        ocg ocgVar = new ocg(this, 20);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar2.setBack(new VkTopBar.b(ocgVar, null, null, null, com.vk.core.compose.component.semantics.b.a(mode, new fgh(context, 14), 2), 14));
        VkTopBar vkTopBar3 = this.h;
        (vkTopBar3 != null ? vkTopBar3 : null).setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(context.getString(R.string.vkim_folders_show_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(mode, new l2i(context, 11), 2), 6));
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        Popup.e r3vVar;
        boolean z = yn50Var instanceof s2s.b;
        bpn0 bpn0Var = this.k;
        if (!z) {
            if (yn50Var instanceof s2s.a) {
                yyr yyrVar = ((s2s.a) yn50Var).a;
                if (b.$EnumSwitchMapping$0[yyrVar.getType().ordinal()] == 1) {
                    RecyclerView recyclerView = this.f;
                    r3vVar = new avl((recyclerView != null ? recyclerView : null).getContext());
                } else {
                    RecyclerView recyclerView2 = this.f;
                    r3vVar = new r3v((recyclerView2 != null ? recyclerView2 : null).getContext());
                }
                com.vk.im.popup.a.d((com.vk.im.popup.a) bpn0Var.getValue(), r3vVar, new ag1(5, this, yyrVar), null, null, 12);
                return;
            }
            if (yn50Var instanceof s2s.c) {
                edw edwVar = edw.a;
                RecyclerView recyclerView3 = this.f;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                Context context = recyclerView3.getContext();
                RecyclerView recyclerView4 = this.f;
                Context context2 = (recyclerView4 != null ? recyclerView4 : null).getContext();
                s2s.c cVar = (s2s.c) yn50Var;
                int i = cVar.a;
                Object[] objArr = cVar.b;
                edw.h(context, context2.getString(i, Arrays.copyOf(objArr, objArr.length)));
                return;
            }
            return;
        }
        s2s.b bVar = (s2s.b) yn50Var;
        yyr yyrVar2 = bVar.a;
        a0s a0sVar = this.g;
        if (a0sVar == null) {
            a0sVar = null;
        }
        Iterator<? extends hfz> it = a0sVar.d.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            hfz next = it.next();
            if ((next instanceof yyr) && ((yyr) next).getId() == yyrVar2.getId()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        RecyclerView recyclerView5 = this.f;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        azr azrVar = (azr) recyclerView5.findViewHolderForAdapterPosition(i2);
        List<bzr> list = bVar.b;
        List<bzr> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (bzr bzrVar : list2) {
            if (!(bzrVar instanceof bzr.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bzr.a aVar = (bzr.a) bzrVar;
            FolderType type = yyrVar2.getType();
            FolderType folderType = FolderType.DEFAULT;
            int i3 = type != folderType ? R.drawable.vk_icon_hide_outline_20 : R.drawable.vk_icon_delete_outline_20;
            RecyclerView recyclerView6 = this.f;
            if (recyclerView6 == null) {
                recyclerView6 = null;
            }
            Drawable a2 = m33.a(i3, recyclerView6.getContext());
            if (a2 != null) {
                sjo.d(a2, dhr0.r(R.attr.vk_ui_background_negative));
            }
            int i4 = yyrVar2.getType() != folderType ? R.string.vkim_folder_hide_option : R.string.vkim_folder_delete_option;
            RecyclerView recyclerView7 = this.f;
            if (recyclerView7 == null) {
                recyclerView7 = null;
            }
            arrayList.add(new lwb0(null, i4, a2, Integer.valueOf(dhr0.Y(R.attr.vk_ui_background_negative, recyclerView7.getContext())), 0, aVar, true, null, false, false, 1937));
        }
        ((com.vk.im.popup.a) bpn0Var.getValue()).f(new Popup.a(arrayList, list, new Popup.g.a(azrVar.itemView), 2431), azrVar.itemView, azrVar.m.b(VkCell.Region.RightExtraAction), new a5(9, this, bVar));
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        t2s t2sVar = (t2s) ao50Var;
        if (t2sVar.b) {
            View view = this.i;
            View view2 = view == null ? null : view;
            if (view2.getVisibility() == 8) {
                d3m.c(view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        View view3 = this.i;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(8);
        boolean z = this.l != null;
        this.l = t2sVar.a;
        if (z) {
            return;
        }
        RecyclerView recyclerView = this.f;
        RecyclerView.l itemAnimator = (recyclerView != null ? recyclerView : null).getItemAnimator();
        q2s q2sVar = this.m;
        if (itemAnimator != null) {
            itemAnimator.o(q2sVar);
        } else {
            q2sVar.a();
        }
    }
}
