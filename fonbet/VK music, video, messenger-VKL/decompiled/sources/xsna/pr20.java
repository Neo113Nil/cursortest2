package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import xsna.dw20;
import xsna.gm50;
import xsna.kr20;
import xsna.lr20;
import xsna.mk50;
import xsna.tr20;
import xsna.xn50;

/* compiled from: MiniWidgetSettingsTabFragment.kt */
/* loaded from: classes6.dex */
public final class pr20 extends yk50<nr20, wr20, tr20> implements w8i {
    public final bpn0 i;
    public final ayu0 j;
    public SwitchSettingsView k;
    public ScrollView l;
    public View m;
    public RecyclerView n;
    public kr20 o;
    public final b p;

    /* compiled from: MiniWidgetSettingsTabFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileServicesType.values().length];
            try {
                iArr[MobileServicesType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileServicesType.HUAWEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileServicesType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pr20() {
        bpn0 bpn0Var = new bpn0(new pvh(this, 15));
        this.i = bpn0Var;
        this.j = ((VkHealthPermissionsComponent) bpn0Var.getValue()).Wb();
        this.p = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_mini_widget_settings_tab);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((wr20) ao50Var).a, new dn20(this, 1));
        SwitchSettingsView switchSettingsView = (SwitchSettingsView) view.findViewById(R.id.show_mini_widgets_switch);
        this.k = switchSettingsView;
        switchSettingsView.setOnCheckListener(new or20(this, 0));
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.mini_widgets_stub);
        this.l = scrollView;
        scrollView.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        ScrollView scrollView2 = this.l;
        if (scrollView2 == null) {
            scrollView2 = null;
        }
        View inflate = layoutInflater.inflate(R.layout.mini_widgets_disabled_redesign_stub, (ViewGroup) scrollView2, true);
        inflate.findViewById(R.id.stub_container).setClipToOutline(true);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.tile1_stub);
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        frameLayout.setOutlineProvider(viewOutlineProvider);
        ((FrameLayout) inflate.findViewById(R.id.tile2_stub)).setOutlineProvider(viewOutlineProvider);
        ScrollView scrollView3 = this.l;
        if (scrollView3 == null) {
            scrollView3 = null;
        }
        scrollView3.findViewById(R.id.stub_container).setOutlineProvider(new t0w0(6, cn70.a() * 16.0f, false, false));
        this.n = (RecyclerView) view.findViewById(R.id.mini_widgets_recycler_view);
        this.m = view.findViewById(R.id.recycler_stub);
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(this.p);
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            recyclerView = null;
        }
        rVar.l(recyclerView);
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.l itemAnimator = recyclerView2.getItemAnimator();
        androidx.recyclerview.widget.n0 n0Var = itemAnimator instanceof androidx.recyclerview.widget.n0 ? (androidx.recyclerview.widget.n0) itemAnimator : null;
        if (n0Var != null) {
            n0Var.g = false;
        }
        kr20 kr20Var = new kr20(new c2u(this, 14));
        this.o = kr20Var;
        RecyclerView recyclerView3 = this.n;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(kr20Var);
        RecyclerView recyclerView4 = this.n;
        RecyclerView recyclerView5 = recyclerView4 != null ? recyclerView4 : null;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(mo2getContext());
        flexboxLayoutManager.H(2);
        if (flexboxLayoutManager.d != 2) {
            flexboxLayoutManager.d = 2;
            flexboxLayoutManager.requestLayout();
        }
        recyclerView5.setLayoutManager(flexboxLayoutManager);
        xn50.a.c(this, tr20.b.b);
    }

    @Override // xsna.yk50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((nr20) vk50Var).g.a(new e2s(this, 11), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.j.o(activity, i, intent, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Fragment parentFragment = getParentFragment();
        dw20 dw20Var = parentFragment instanceof dw20 ? (dw20) parentFragment : null;
        if (dw20Var != null) {
            dw20Var.Un(new x310(this, 1));
        }
        kr20 kr20Var = this.o;
        (kr20Var == null ? null : kr20Var).notifyItemRangeChanged(0, (kr20Var != null ? kr20Var : null).d.size());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        xn50.a.c(this, tr20.f.b);
    }

    public final void tn() {
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            ((dw20.b) dw20.a.Q(new dw20.b(mo2getContext, null).M(R.drawable.vk_icon_error_outline_56, Integer.valueOf(R.attr.vk_ui_text_accent)).v0(R.string.vk_mini_widget_disable_click_title), R.string.vk_mini_widget_disable_click_subtitle)).h0(R.string.vk_mini_widget_disable_click_button, new b010(this, 1)).I0(null);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new nr20(new rr20(new qr20(requireContext(), this.j)), ((SuperAppServicesComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(SuperAppServicesComponent.class))).Tb());
    }

    /* compiled from: MiniWidgetSettingsTabFragment.kt */
    public static final class b extends r.d {
        public final float e = cn70.a() * 102.0f;
        public final float f = cn70.a() * 68.0f;
        public final int g = cn70.b(6);
        public final int h = cn70.b(4);

        public b() {
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            return e0Var2 instanceof kr20.c;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (e0Var instanceof kr20.c ? 51 : 0) << 16;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
            float f3;
            b bVar;
            Canvas canvas2;
            RecyclerView recyclerView2;
            RecyclerView.e0 e0Var2;
            int i2;
            boolean z2;
            float left = e0Var.itemView.getLeft();
            float top = e0Var.itemView.getTop();
            float width = (recyclerView.getWidth() - left) - this.e;
            float height = (recyclerView.getHeight() - top) - this.f;
            float f4 = (-left) + this.g;
            float f5 = f4 <= width ? swe0.f(f, f4, width) : f;
            float f6 = (-top) + this.h;
            if (f6 <= height) {
                f3 = swe0.f(f2, f6, height);
                bVar = this;
                recyclerView2 = recyclerView;
                e0Var2 = e0Var;
                i2 = i;
                z2 = z;
                canvas2 = canvas;
            } else {
                f3 = f2;
                bVar = this;
                canvas2 = canvas;
                recyclerView2 = recyclerView;
                e0Var2 = e0Var;
                i2 = i;
                z2 = z;
            }
            super.m(canvas2, recyclerView2, e0Var2, f5, f3, i2, z2);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            Object obj;
            if (!(e0Var instanceof kr20.c) || !(e0Var2 instanceof kr20.c)) {
                return true;
            }
            pr20 pr20Var = pr20.this;
            kr20 kr20Var = pr20Var.o;
            if (kr20Var == null) {
                kr20Var = null;
            }
            int absoluteAdapterPosition = ((kr20.c) e0Var).getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = ((kr20.c) e0Var2).getAbsoluteAdapterPosition();
            ArrayList arrayList = kr20Var.d;
            lr20 lr20Var = (lr20) j5g.b0(absoluteAdapterPosition, arrayList);
            if (lr20Var != null) {
                arrayList.remove(absoluteAdapterPosition);
                arrayList.add(absoluteAdapterPosition2, lr20Var);
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((lr20) obj) instanceof lr20.c) {
                        break;
                    }
                }
                lr20 lr20Var2 = (lr20) obj;
                if (lr20Var2 != null) {
                    int indexOf = arrayList.indexOf(lr20Var2);
                    arrayList.remove(indexOf);
                    arrayList.add(Integer.min(4, arrayList.size()), lr20Var2);
                    kr20Var.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                    kr20Var.notifyItemMoved(indexOf, Integer.min(4, arrayList.size()));
                }
            }
            kr20 kr20Var2 = pr20Var.o;
            ArrayList arrayList2 = (kr20Var2 != null ? kr20Var2 : null).d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof lr20.a) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((lr20.a) it2.next()).b);
            }
            xn50.a.c(pr20Var, new tr20.d(arrayList4));
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            pr20 pr20Var = pr20.this;
            if (i == 2) {
                RecyclerView recyclerView = pr20Var.n;
                wjf0.c(recyclerView != null ? recyclerView : null, new dy0(16, pr20Var, e0Var));
            } else {
                RecyclerView recyclerView2 = pr20Var.n;
                wjf0.c(recyclerView2 != null ? recyclerView2 : null, new mxj(pr20Var, 27));
            }
            xn50.a.c(pr20Var, new tr20.g(i == 2));
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
