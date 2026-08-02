package xsna;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.dto.common.Attachment;
import com.vk.dto.user.UserProfile;
import com.vk.mentions.MentionProfileVO;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.EventAttachment;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.k420;

/* compiled from: MentionSelectViewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class h420 implements g420, c420 {
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public final f420 a;
    public final int b;
    public final l320 c;
    public io.reactivex.rxjava3.disposables.c d;
    public FrameLayout e;
    public VkBottomSheetBehavior<FrameLayout> f;
    public RecyclerView g;
    public View h;
    public List<? extends UserProfile> i;
    public List<? extends Attachment> j;
    public List<? extends Attachment> k;
    public boolean l;
    public k420 m;
    public float n;
    public io.reactivex.rxjava3.disposables.c o;
    public final int p;
    public int q;
    public final bpn0 r;

    /* compiled from: MentionSelectViewControllerImpl.kt */
    public static final class a extends VkBottomSheetBehavior.a {
        public Drawable a;

        public a() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, View view) {
            h420 h420Var = h420.this;
            f420 f420Var = h420Var.a;
            if (i == 3) {
                f420Var.getClass();
            } else if (i == 5) {
                f420Var.e0();
            }
            Drawable drawable = this.a;
            if (drawable == null) {
                View view2 = h420Var.h;
                drawable = view2 != null ? view2.getBackground() : null;
            }
            this.a = drawable;
            if (i != 3) {
                View view3 = h420Var.h;
                if (view3 != null) {
                    view3.setBackground(drawable);
                    return;
                }
                return;
            }
            View view4 = h420Var.h;
            if (view4 != null) {
                RecyclerView recyclerView = h420Var.g;
                view4.setBackground(((ViewGroup) (recyclerView != null ? recyclerView.getParent() : null)).getBackground());
            }
        }
    }

    static {
        int a2 = iah0.a(54);
        s = a2;
        int a3 = iah0.a(6);
        t = a3;
        int a4 = y8g0.a(R.dimen.clip_bottomsheet_separator_height);
        u = a4;
        v = rqi.a(a3, 2, a2, a4);
        w = rqi.a(a2, 2, a3, a4);
        x = rqi.a(a2, 3, a3, a4);
    }

    public /* synthetic */ h420(f420 f420Var) {
        this(f420Var, 0);
    }

    @Override // xsna.g420
    public final void a(int i) {
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            bwt0.f0(recyclerView, 0, 0, 0, i, 7);
        }
    }

    @Override // xsna.c420
    public final void b(MentionProfileVO mentionProfileVO) {
        Object obj;
        if (this.m instanceof k420.b) {
            hide();
            return;
        }
        b420 b420Var = new b420(mentionProfileVO.b, mentionProfileVO.c, mentionProfileVO.d, mentionProfileVO.e, mentionProfileVO.f, false);
        f420 f420Var = this.a;
        f420Var.D0(b420Var);
        List<? extends Attachment> list = this.k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Attachment attachment = (Attachment) obj;
                if ((attachment instanceof EventAttachment) && epx.f(((EventAttachment) attachment).f.b, mentionProfileVO.b)) {
                    break;
                }
            }
            Attachment attachment2 = (Attachment) obj;
            if (attachment2 != null) {
                f420Var.s5(attachment2);
            }
        }
    }

    @Override // xsna.g420
    public final void c() {
        this.d = rsr.r().c("").subscribe(new g600(new g1j(this, 25), 2), new lkz(new xmz(5), 2));
    }

    @Override // xsna.g420
    public final View d(ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.q, viewGroup, false);
        f4m.v(this.b, inflate);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mention_select_recycler);
        recyclerView.setAdapter(this.c);
        inflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int i = t;
        recyclerView.addItemDecoration(new v98(0, i, i, false));
        this.g = recyclerView;
        this.h = inflate.findViewById(R.id.mention_select_shadow);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.mention_select_layout);
        bwt0.p0(frameLayout, false);
        this.e = frameLayout;
        VkBottomSheetBehavior<FrameLayout> F = VkBottomSheetBehavior.F(frameLayout);
        F.I(x);
        F.h = true;
        F.J(4);
        F.q = (a) this.r.getValue();
        this.f = F;
        com.vk.core.utils.newtork.b.a.getClass();
        this.o = com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ljs(new f0z(this, 7), 8));
        if (bundle != null && bundle.getBoolean("key_rounded_top_without_shadow")) {
            FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.mention_select_background);
            if (frameLayout2 != null) {
                bwt0.d(frameLayout2, cn70.a() * 12.0f, false, true);
            }
            View view = this.h;
            if (view != null) {
                bwt0.p0(view, false);
            }
        }
        return inflate;
    }

    @Override // xsna.g420
    public final k420 e() {
        return this.m;
    }

    @Override // xsna.g420
    public final void f() {
        this.q = R.layout.view_post_mention_select;
    }

    @Override // xsna.g420
    public final void g(VkPaginationList<UserProfile> vkPaginationList) {
        this.i = vkPaginationList.b;
    }

    @Override // xsna.g420
    public final void h(b420 b420Var) {
        k420 k420Var = this.m;
        if (k420Var instanceof k420.b) {
            if (epx.f(((k420.b) k420Var).a, b420Var)) {
                return;
            }
        } else if (!epx.f(k420Var, k420.a.a)) {
            hide();
        }
        m(Collections.singletonList(new MentionProfileVO(b420Var.a, b420Var.b, b420Var.c, b420Var.d, b420Var.e)));
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.f;
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.w = false;
        }
        this.m = new k420.b(b420Var);
    }

    @Override // xsna.g420
    public final void hide() {
        k420 k420Var = this.m;
        k420.a aVar = k420.a.a;
        if (epx.f(k420Var, aVar)) {
            return;
        }
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.f;
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.w = true;
        }
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.J(4);
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            bwt0.p0(frameLayout, false);
        }
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        this.m = aVar;
    }

    @Override // xsna.g420
    public final void i(int i) {
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.f;
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.g = i;
        }
    }

    @Override // xsna.g420
    public final void j(String str) {
        k420 k420Var = this.m;
        if (k420Var instanceof k420.c) {
            if (epx.f(((k420.c) k420Var).a, str)) {
                return;
            }
        } else if (!epx.f(k420Var, k420.a.a)) {
            hide();
        }
        List<? extends UserProfile> list = this.i;
        if (str.length() == 0 && list != null && (!list.isEmpty())) {
            io.reactivex.rxjava3.disposables.c cVar = this.d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.d = null;
            l(str, list, this.j);
        } else {
            this.a.S1();
            io.reactivex.rxjava3.disposables.c cVar2 = this.d;
            this.d = new io.reactivex.rxjava3.internal.operators.observable.c0(rsr.r().c(str), io.reactivex.rxjava3.internal.functions.a.d, new u00(cVar2, 2)).subscribe(new w00(new go6(cVar2, this, str, 3), 24), new wmz(new nt10(this, 1), 2));
        }
        this.m = new k420.c(str);
    }

    @Override // xsna.g420
    public final void k(List<? extends Attachment> list) {
        this.j = list;
    }

    public final void l(String str, List list, List list2) {
        this.a.x4(list.isEmpty());
        if (str.length() == 0) {
            this.i = list;
            this.j = list2;
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(ao8.t((UserProfile) it.next()));
        }
        m(arrayList);
        this.k = list2;
    }

    public final void m(List<MentionProfileVO> list) {
        l320 l320Var = this.c;
        l320Var.clear();
        l320Var.n0(list);
        if (list.isEmpty()) {
            hide();
            return;
        }
        int size = list.size();
        int i = u;
        int i2 = this.p;
        if (i2 == -1) {
            VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.f;
            if (vkBottomSheetBehavior != null) {
                int i3 = size != 1 ? size != 2 ? size != 3 ? ((int) (this.n * s)) + t + i : x : w : v;
                RecyclerView recyclerView = this.g;
                vkBottomSheetBehavior.I(i3 + (recyclerView != null ? bwt0.M(recyclerView) : 0));
            }
        } else {
            VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior2 = this.f;
            if (vkBottomSheetBehavior2 != null) {
                vkBottomSheetBehavior2.e = false;
                int max = Math.max(0, i2 - i);
                vkBottomSheetBehavior2.f = max;
                vkBottomSheetBehavior2.c = vkBottomSheetBehavior2.n - max;
            }
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            bwt0.p0(frameLayout, true);
        }
    }

    @Override // xsna.g420
    public final void n(float f) {
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.setTranslationY(f);
        }
    }

    @Override // xsna.g420
    public final void onDestroyView() {
        this.f = null;
        this.e = null;
        this.g = null;
        this.h = null;
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        this.o.dispose();
    }

    public h420(f420 f420Var, int i) {
        this.a = f420Var;
        this.b = i;
        l320 l320Var = new l320();
        l320Var.e = this;
        this.c = l320Var;
        this.m = k420.a.a;
        this.n = 3.0f;
        this.o = EmptyDisposable.INSTANCE;
        this.p = -1;
        this.q = R.layout.view_mention_select;
        this.r = new bpn0(new cvs(this, 18));
    }
}
