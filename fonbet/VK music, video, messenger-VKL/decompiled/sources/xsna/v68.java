package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.hints.HintId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.CharacterCounterView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ify;
import xsna.l7v;
import xsna.wac0;

/* compiled from: BottomPanelPostingControllerImpl.kt */
/* loaded from: classes4.dex */
public final class v68 implements t68, View.OnClickListener, fux<xac0>, wac0.b {
    public static final int E;
    public static final int F;
    public int A;
    public final ArrayList D;
    public qdc0 b;
    public dxb0 i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public TextView o;
    public ProgressBar p;
    public RecyclerView q;
    public View r;
    public View s;
    public View t;
    public CharacterCounterView u;
    public View v;
    public int z;
    public final wac0 c = new wac0(this, this);
    public final LinearLayoutManager d = new LinearLayoutManager(0, false);
    public final pxo0 e = new pxo0(1000);
    public final pxo0 f = new pxo0(300);
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean w = true;
    public boolean x = true;
    public boolean y = true;
    public final bpn0 B = new bpn0(new im0(this, 12));
    public final bpn0 C = new bpn0(new ra(this, 12));

    /* compiled from: BottomPanelPostingControllerImpl.kt */
    public static final class a implements fux<exb0> {
        public a() {
        }

        @Override // xsna.fux
        public final void li(int i, Object obj) {
            AttachType[] attachTypeArr;
            AttachType attachType;
            exb0 exb0Var = (exb0) obj;
            v68 v68Var = v68.this;
            if (v68Var.e.a()) {
                return;
            }
            AttachType.a aVar = AttachType.Companion;
            int i2 = exb0Var.a;
            aVar.getClass();
            attachTypeArr = AttachType.VALUES;
            int length = attachTypeArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    attachType = null;
                    break;
                }
                attachType = attachTypeArr[i3];
                if (attachType.i() == i2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (attachType != null) {
                qdc0 qdc0Var = v68Var.b;
                if (qdc0Var != null) {
                    qdc0Var.hb(attachType);
                }
                ((VkContextMenu) v68Var.B.getValue()).b();
            }
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        E = context.getResources().getDimensionPixelSize(R.dimen.newsfeed_newpost_bottom_panel_button_width);
        F = iah0.a(2);
    }

    public v68() {
        int i = AttachType.VIDEO.i();
        Context context = e43.a;
        exb0 exb0Var = new exb0(i, (context == null ? null : context).getString(R.string.picker_video));
        Context context2 = null;
        int i2 = AttachType.DOCUMENT.i();
        Context context3 = e43.a;
        exb0 exb0Var2 = new exb0(i2, (context3 == null ? null : context3).getString(R.string.attach_document));
        int i3 = AttachType.POLL.i();
        Context context4 = e43.a;
        exb0 exb0Var3 = new exb0(i3, (context4 == null ? null : context4).getString(R.string.attach_poll));
        int i4 = AttachType.PLACE.i();
        Context context5 = e43.a;
        exb0 exb0Var4 = new exb0(i4, (context5 == null ? null : context5).getString(R.string.place));
        int i5 = AttachType.GOOD.i();
        Context context6 = e43.a;
        exb0 exb0Var5 = new exb0(i5, (context6 == null ? null : context6).getString(R.string.posting_attach_good));
        int i6 = AttachType.SERVICE.i();
        Context context7 = e43.a;
        this.D = e43.o(exb0Var, exb0Var2, exb0Var3, exb0Var4, exb0Var5, new exb0(i6, (context7 != null ? context7 : context2).getString(R.string.posting_attach_market_service)));
    }

    @Override // xsna.t68
    public final void G3() {
        this.y = false;
        View view = this.k;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, false);
        f();
    }

    @Override // xsna.t68
    public final void I7() {
        int i = this.A;
        if (i == 0) {
            ib();
        } else if (i == 1) {
            vg();
        } else {
            if (i != 2) {
                return;
            }
            wk();
        }
    }

    @Override // xsna.t68
    public final void Ja(xac0 xac0Var) {
        wac0 wac0Var = this.c;
        Iterator it = ((ArrayList) wac0Var.y0()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            xac0 xac0Var2 = (xac0) it.next();
            if (xac0Var.a == (xac0Var2 != null ? xac0Var2.a : -1)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || wac0Var.getItemCount() - 1 <= i) {
            return;
        }
        wac0Var.K0(xac0Var, i + 1, null);
    }

    @Override // xsna.t68
    public final void M3() {
        d(AttachType.POLL);
    }

    @Override // xsna.t68
    public final void O5() {
        d(AttachType.VIDEO);
    }

    @Override // xsna.t68
    public final void Pi(int i) {
        CharacterCounterView characterCounterView = this.u;
        if (characterCounterView == null) {
            characterCounterView = null;
        }
        bwt0.p0(characterCounterView, true);
        CharacterCounterView characterCounterView2 = this.u;
        (characterCounterView2 != null ? characterCounterView2 : null).setLimit(i);
    }

    @Override // xsna.t68
    public final void Th() {
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        textView.setText(R.string.nothing_found);
    }

    @Override // xsna.wac0.b
    public final void b() {
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.Cf();
        }
    }

    @Override // xsna.t68
    public final void b4() {
        d(AttachType.PLACE);
    }

    public final void c() {
        Activity h;
        if (this.x) {
            int i = ify.a;
            if (ify.e(ify.c)) {
                l7v b2 = pla.e().b();
                HintId hintId = HintId.INFO_BUBBLE_POST_COPYRIGHT;
                if (b2.a(hintId.getId())) {
                    Rect rect = new Rect();
                    View view = this.n;
                    if (view == null) {
                        view = null;
                    }
                    view.getGlobalVisibleRect(rect);
                    l7v b3 = pla.e().b();
                    String id = hintId.getId();
                    b3.getClass();
                    l7v.b bVar = new l7v.b(id, b3, rect);
                    bVar.e = new u68();
                    View view2 = this.n;
                    Context context = (view2 != null ? view2 : null).getContext();
                    if (context == null || (h = e3m.h(context)) == null) {
                        return;
                    }
                    bVar.j(h);
                }
            }
        }
    }

    public final void d(AttachType attachType) {
        dxb0 dxb0Var = this.i;
        if (dxb0Var == null) {
            dxb0Var = null;
        }
        int i = attachType.i();
        ArrayList<exb0> arrayList = dxb0Var.d;
        Iterator<exb0> it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            arrayList.remove(i2);
            dxb0Var.notifyItemRemoved(i2);
        }
        View view = this.l;
        if (view == null) {
            view = null;
        }
        dxb0 dxb0Var2 = this.i;
        bwt0.p0(view, (dxb0Var2 != null ? dxb0Var2 : null).d.size() > 0);
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        dxb0 dxb0Var = new dxb0((a) this.C.getValue());
        this.i = dxb0Var;
        ArrayList<exb0> arrayList = dxb0Var.d;
        arrayList.clear();
        arrayList.addAll(this.D);
        dxb0Var.notifyDataSetChanged();
        View findViewById = view.findViewById(R.id.posting_tab_photo_button);
        ImageView imageView = (ImageView) findViewById;
        jjc.f(this, imageView);
        ArrayList arrayList2 = this.g;
        arrayList2.add(imageView);
        ArrayList arrayList3 = this.h;
        arrayList3.add(imageView);
        this.j = findViewById;
        View findViewById2 = view.findViewById(R.id.posting_tab_music_button);
        ImageView imageView2 = (ImageView) findViewById2;
        o25.a().getClass();
        awt0.u(imageView2, true);
        jjc.f(this, imageView2);
        arrayList2.add(imageView2);
        arrayList3.add(imageView2);
        this.k = findViewById2;
        View findViewById3 = view.findViewById(R.id.posting_tab_more_button);
        ImageView imageView3 = (ImageView) findViewById3;
        jjc.f(this, imageView3);
        arrayList2.add(imageView3);
        arrayList3.add(imageView3);
        this.l = findViewById3;
        View findViewById4 = view.findViewById(R.id.posting_bottom_settings_button);
        jjc.f(this, findViewById4);
        arrayList2.add(findViewById4);
        this.n = findViewById4;
        View findViewById5 = view.findViewById(R.id.posting_bottom_mention_button);
        jjc.f(this, findViewById5);
        arrayList2.add(findViewById5);
        this.m = findViewById5;
        this.r = view.findViewById(R.id.posting_poster_preview_shadow_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.posting_poster_preview_recycler_view);
        recyclerView.setLayoutManager(this.d);
        recyclerView.setAdapter(this.c);
        int a2 = iah0.a(24);
        int i = F;
        recyclerView.addItemDecoration(new v98(i, i, a2, true));
        this.q = recyclerView;
        u1u0.g(view.findViewById(R.id.posting_bottom_layout));
        f();
        this.p = (ProgressBar) view.findViewById(R.id.posting_bottom_progress_bar);
        this.o = (TextView) view.findViewById(R.id.posting_bottom_name_hint_text);
        this.s = view.findViewById(R.id.top_divider);
        this.t = view.findViewById(R.id.bottom_divider);
        this.u = (CharacterCounterView) view.findViewById(R.id.posting_bottom_counter);
        View findViewById6 = view.findViewById(R.id.posting_bottom_layout);
        this.v = findViewById6;
        findViewById6.setOnClickListener(this);
        int i2 = ify.a;
        ify.a(new b(view, this));
    }

    public final void f() {
        Iterator it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            View view = (View) it.next();
            if (bwt0.K(view)) {
                ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(i);
                i += E;
            }
        }
    }

    @Override // xsna.t68
    public final void f2(boolean z) {
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            progressBar = null;
        }
        bwt0.p0(progressBar, z);
    }

    @Override // xsna.t68
    public final void f4(boolean z) {
        this.c.f4(z);
    }

    @Override // xsna.t68
    public final void gk() {
        d(AttachType.GOOD);
        d(AttachType.SERVICE);
        f();
    }

    @Override // xsna.t68
    public final void ib() {
        boolean z;
        Iterator it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                bwt0.p0((View) it.next(), true);
            }
        }
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, this.w);
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        bwt0.p0(recyclerView, false);
        View view2 = this.k;
        if (view2 == null) {
            view2 = null;
        }
        if (this.y) {
            o25.a().getClass();
            z = true;
        } else {
            z = false;
        }
        bwt0.p0(view2, z);
        View view3 = this.n;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, this.x);
        View view4 = this.m;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.p0(view4, true);
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, false);
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            progressBar = null;
        }
        bwt0.p0(progressBar, false);
        View view5 = this.r;
        if (view5 == null) {
            view5 = null;
        }
        bwt0.p0(view5, false);
        View view6 = this.s;
        View view7 = view6 == null ? null : view6;
        float f = 16;
        bwt0.f0(view7, iah0.a(f), 0, iah0.a(f), 0, 10);
        View view8 = this.t;
        bwt0.f0(view8 == null ? null : view8, iah0.a(f), 0, iah0.a(f), 0, 10);
        View view9 = this.n;
        if (view9 == null) {
            view9 = null;
        }
        view9.getBackground().setLevel(0);
        View view10 = this.r;
        if (view10 == null) {
            view10 = null;
        }
        bwt0.p0(view10, false);
        this.z = 0;
        View view11 = this.l;
        if (view11 == null) {
            view11 = null;
        }
        dxb0 dxb0Var = this.i;
        if (dxb0Var == null) {
            dxb0Var = null;
        }
        bwt0.p0(view11, dxb0Var.d.size() > 0);
        CharacterCounterView characterCounterView = this.u;
        bwt0.p0(characterCounterView == null ? null : characterCounterView, (characterCounterView != null ? characterCounterView : null).getLimit() > 0);
    }

    @Override // xsna.t68
    public final void k2(boolean z) {
        this.x = z;
        View view = this.n;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, z);
        int i = 0;
        if (z) {
            View view2 = this.m;
            if (view2 == null) {
                view2 = null;
            }
            Resources resources = view2.getResources();
            if (resources != null) {
                i = resources.getDimensionPixelSize(R.dimen.newsfeed_newpost_bottom_panel_settings_button_width);
            }
        }
        View view3 = this.m;
        if (view3 == null) {
            view3 = null;
        }
        ((ViewGroup.MarginLayoutParams) view3.getLayoutParams()).rightMargin = i;
        View view4 = this.r;
        if (view4 == null) {
            view4 = null;
        }
        ((ViewGroup.MarginLayoutParams) view4.getLayoutParams()).rightMargin = i;
        RecyclerView recyclerView = this.q;
        ((ViewGroup.MarginLayoutParams) (recyclerView != null ? recyclerView : null).getLayoutParams()).rightMargin = i;
        c();
    }

    @Override // xsna.t68
    public final void km(xac0 xac0Var) {
        wac0 wac0Var = this.c;
        ListDataSet listDataSet = (ListDataSet) wac0Var.c;
        if (listDataSet.d.contains(xac0Var)) {
            return;
        }
        wac0Var.f4(false);
        listDataSet.j(0);
        listDataSet.d.add(0, xac0Var);
        listDataSet.f(0);
    }

    @Override // xsna.t68
    public final void l4() {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, false);
        this.w = false;
        f();
    }

    @Override // xsna.t68
    public final void la(List<xac0> list) {
        this.c.setItems(list);
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        xac0 xac0Var = (xac0) obj;
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.h8(xac0Var);
        }
    }

    @Override // xsna.t68
    public final void mj() {
        ((VkContextMenu) this.B.getValue()).b();
    }

    @Override // xsna.t68
    public final void n6(int i) {
        CharacterCounterView characterCounterView = this.u;
        if (characterCounterView == null) {
            characterCounterView = null;
        }
        characterCounterView.setCharacters(i);
    }

    @Override // xsna.wac0.b
    public final void o() {
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.E6();
        }
    }

    @Override // xsna.t68
    public final void ol(int i, boolean z) {
        int i2;
        wac0 wac0Var = this.c;
        wac0Var.getClass();
        int i3 = i + 1;
        RecyclerView recyclerView = this.q;
        RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int measuredWidth = recyclerView.getMeasuredWidth() / ((F * 2) + wac0.d.w);
        if (i3 < measuredWidth) {
            i2 = i3;
        } else {
            i2 = i3 + measuredWidth;
            if (wac0Var.getItemCount() < i2) {
                i2 = (measuredWidth / 2) + i3;
            }
        }
        int min = Math.min(i2, Math.max(wac0Var.getItemCount() - 1, 0));
        if (z) {
            recyclerView2.smoothScrollToPosition(min);
        } else {
            recyclerView2.scrollToPosition(min);
        }
        xac0 xac0Var = (xac0) wac0Var.c.c(i);
        if (xac0Var == null) {
            return;
        }
        wac0Var.K0(xac0Var, i3, null);
        qdc0 qdc0Var = this.b;
        if (qdc0Var != null) {
            qdc0Var.h8(xac0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        dxb0 dxb0Var;
        dxb0 dxb0Var2;
        boolean z2;
        qdc0 qdc0Var;
        qdc0 qdc0Var2;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        pxo0 pxo0Var = this.e;
        if (valueOf != null && valueOf.intValue() == R.id.posting_tab_photo_button) {
            if (pxo0Var.a() || (qdc0Var2 = this.b) == null) {
                return;
            }
            qdc0Var2.hb(AttachType.PHOTO);
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.posting_tab_music_button) {
            if (pxo0Var.a() || (qdc0Var = this.b) == null) {
                return;
            }
            qdc0Var.hb(AttachType.MUSIC);
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.posting_tab_more_button) {
            if (valueOf != null && valueOf.intValue() == R.id.posting_bottom_mention_button) {
                qdc0 qdc0Var3 = this.b;
                if (qdc0Var3 != null) {
                    qdc0Var3.Xc();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.posting_bottom_settings_button) {
                qdc0 qdc0Var4 = this.b;
                if (qdc0Var4 != null) {
                    qdc0Var4.g2();
                }
                pla.e().b().b(HintId.INFO_BUBBLE_POST_COPYRIGHT.getId());
                return;
            }
            return;
        }
        if (this.f.a()) {
            return;
        }
        bpn0 bpn0Var = this.B;
        ((VkContextMenu) bpn0Var.getValue()).b();
        qdc0 qdc0Var5 = this.b;
        boolean z3 = false;
        boolean G6 = qdc0Var5 != null ? qdc0Var5.G6() : false;
        dxb0 dxb0Var3 = this.i;
        if (dxb0Var3 == null) {
            dxb0Var3 = null;
        }
        dxb0Var3.x0(AttachType.VIDEO.i(), G6);
        dxb0 dxb0Var4 = this.i;
        if (dxb0Var4 == null) {
            dxb0Var4 = null;
        }
        dxb0Var4.x0(AttachType.DOCUMENT.i(), G6);
        dxb0 dxb0Var5 = this.i;
        if (dxb0Var5 == null) {
            dxb0Var5 = null;
        }
        int i = AttachType.POLL.i();
        if (G6) {
            qdc0 qdc0Var6 = this.b;
            if (!(qdc0Var6 != null ? qdc0Var6.wh() : false)) {
                z = true;
                dxb0Var5.x0(i, z);
                dxb0Var = this.i;
                if (dxb0Var == null) {
                    dxb0Var = null;
                }
                dxb0Var.x0(AttachType.PLACE.i(), G6);
                dxb0Var2 = this.i;
                if (dxb0Var2 == null) {
                    dxb0Var2 = null;
                }
                int i2 = AttachType.GOOD.i();
                if (G6) {
                    qdc0 qdc0Var7 = this.b;
                    if (!(qdc0Var7 != null ? qdc0Var7.X4() : false)) {
                        z2 = true;
                        dxb0Var2.x0(i2, z2);
                        dxb0 dxb0Var6 = this.i;
                        dxb0 dxb0Var7 = dxb0Var6 != null ? dxb0Var6 : null;
                        int i3 = AttachType.SERVICE.i();
                        if (G6) {
                            qdc0 qdc0Var8 = this.b;
                            if (!(qdc0Var8 != null ? qdc0Var8.X4() : false)) {
                                z3 = true;
                            }
                        }
                        dxb0Var7.x0(i3, z3);
                        ((VkContextMenu) bpn0Var.getValue()).g();
                    }
                }
                z2 = false;
                dxb0Var2.x0(i2, z2);
                dxb0 dxb0Var62 = this.i;
                if (dxb0Var62 != null) {
                }
                int i32 = AttachType.SERVICE.i();
                if (G6) {
                }
                dxb0Var7.x0(i32, z3);
                ((VkContextMenu) bpn0Var.getValue()).g();
            }
        }
        z = false;
        dxb0Var5.x0(i, z);
        dxb0Var = this.i;
        if (dxb0Var == null) {
        }
        dxb0Var.x0(AttachType.PLACE.i(), G6);
        dxb0Var2 = this.i;
        if (dxb0Var2 == null) {
        }
        int i22 = AttachType.GOOD.i();
        if (G6) {
        }
        z2 = false;
        dxb0Var2.x0(i22, z2);
        dxb0 dxb0Var622 = this.i;
        if (dxb0Var622 != null) {
        }
        int i322 = AttachType.SERVICE.i();
        if (G6) {
        }
        dxb0Var7.x0(i322, z3);
        ((VkContextMenu) bpn0Var.getValue()).g();
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        ((VkContextMenu) this.B.getValue()).b();
    }

    @Override // xsna.t68
    public final void p4(boolean z) {
        if (z) {
            return;
        }
        d(AttachType.DOCUMENT);
    }

    @Override // xsna.dc6
    public final void setPresenter(cc6 cc6Var) {
        this.b = (qdc0) cc6Var;
    }

    @Override // xsna.t68
    public final void vg() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            bwt0.p0((View) it.next(), false);
        }
        View view = this.n;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, this.x);
        View view2 = this.m;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.p0(view2, false);
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, false);
        ProgressBar progressBar = this.p;
        if (progressBar == null) {
            progressBar = null;
        }
        bwt0.p0(progressBar, false);
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        bwt0.p0(recyclerView, true);
        View view3 = this.r;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, true);
        View view4 = this.s;
        bwt0.f0(view4 == null ? null : view4, 0, 0, 0, 0, 10);
        View view5 = this.t;
        View view6 = view5 == null ? null : view5;
        float f = 0;
        bwt0.f0(view6, iah0.a(f), 0, iah0.a(f), 0, 10);
        View view7 = this.n;
        if (view7 == null) {
            view7 = null;
        }
        view7.getBackground().setLevel(1);
        View view8 = this.r;
        bwt0.p0(view8 != null ? view8 : null, true);
        this.z = 1;
    }

    @Override // xsna.t68
    public final void wk() {
        int i = this.z;
        if (i != 2) {
            this.A = i;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            bwt0.p0((View) it.next(), false);
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        bwt0.p0(recyclerView, false);
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, true);
        View view = this.r;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, false);
        this.z = 2;
        CharacterCounterView characterCounterView = this.u;
        bwt0.p0(characterCounterView != null ? characterCounterView : null, false);
    }

    @Override // xsna.t68
    public final void yj(xac0 xac0Var) {
        wac0 wac0Var = this.c;
        int i = wac0Var.h;
        Iterator it = ((ArrayList) wac0Var.y0()).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            xac0 xac0Var2 = (xac0) it.next();
            if (xac0Var.a == (xac0Var2 != null ? xac0Var2.a : -1)) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = this.d;
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        if (s > i3 || i3 > w) {
            recyclerView.smoothScrollToPosition(i3);
            return;
        }
        int i4 = wac0.d.w + F;
        int i5 = i <= i3 ? 1 : -1;
        recyclerView.scrollToPosition(i);
        recyclerView.smoothScrollBy(i4 * i5, 0);
    }

    @Override // xsna.t68
    public final void zl() {
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        textView.setText(R.string.posting_name_or_address);
    }

    /* compiled from: BottomPanelPostingControllerImpl.kt */
    public static final class b implements ify.a {
        public final /* synthetic */ View b;
        public final /* synthetic */ v68 c;

        public b(View view, v68 v68Var) {
            this.b = view;
            this.c = v68Var;
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            this.b.postDelayed(new kv3(this.c, 1), 300L);
            int i2 = ify.a;
            ify.g(this);
        }

        @Override // xsna.ify.a
        public final void Y0() {
        }
    }

    @Override // xsna.t68
    public final void Z9() {
    }

    @Override // xsna.t68
    public final void g7() {
    }

    @Override // xsna.t68
    public final void onResume() {
    }

    @Override // xsna.t68
    public final void p6() {
    }

    @Override // xsna.t68
    public final void y9() {
    }

    @Override // xsna.t68
    public final void O7(boolean z) {
    }

    @Override // xsna.t68
    public final void Vc(int i) {
    }

    @Override // xsna.t68
    public final void Yj(ArrayList arrayList) {
    }
}
