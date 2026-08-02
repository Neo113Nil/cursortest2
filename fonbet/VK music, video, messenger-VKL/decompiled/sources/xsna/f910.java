package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MarketMultiSelectPickerView.kt */
/* loaded from: classes18.dex */
public final class f910 implements gm50, w8i {
    public static final int D = iah0.a(480);
    public final fa00 A;
    public final bpn0 B;
    public final bpn0 C;
    public final c810 b;
    public final Context c;
    public final c810 d;
    public final x4u e;
    public final View f;
    public final VkTopBar g;
    public View h;
    public VkAvatar i;
    public TextView j;
    public ViewPager k;
    public VkSpinner l;
    public VKTabLayout m;
    public VkContextMenu n;
    public final ArrayList<wrn0> o;
    public final ComposeView p;
    public final ComposeView q;
    public final ArrayList r;
    public final rg50 s;
    public final rg50 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public d910 z;

    public f910(c810 c810Var, Context context, c810 c810Var2, x4u x4uVar) {
        this.b = c810Var;
        this.c = context;
        this.d = c810Var2;
        this.e = x4uVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.product_multipicker_view, (ViewGroup) null);
        this.f = inflate;
        ArrayList<wrn0> arrayList = new ArrayList<>();
        this.o = arrayList;
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.placeholder_state_view);
        this.p = composeView;
        ComposeView composeView2 = (ComposeView) inflate.findViewById(R.id.attach_button_holder);
        this.q = composeView2;
        this.r = new ArrayList();
        this.s = androidx.compose.runtime.i.a(0);
        this.t = androidx.compose.runtime.i.a(-1);
        this.u = new bpn0(new pp00(this, 3));
        this.v = new bpn0(new z0h(this, 29));
        this.w = new bpn0(new s6y(this, 4));
        this.x = new bpn0(new gzv(this, 8));
        this.y = new bpn0(new x4u(this, 7));
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        this.g = vkTopBar;
        if (vkTopBar != null) {
            vkTopBar.setInitialMode(com.vk.core.view.components.topbar.d.a);
            vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.attach_multipicker_top_bar_close), new f5x(this, 5), new a8g(VkColorToken.IconAccentThemed), null, 8));
        }
        arrayList.add(new wrn0(0, R.string.attach_multipicker_goods_title, new o3w(this, 9)));
        arrayList.add(new wrn0(1, R.string.attach_multipicker_fave_title, new rop(this, 16)));
        composeView.setContent(new jai(-1669438838, new wmg(this, 3), true));
        composeView2.setContent(new jai(-1777722656, new com.vk.movika.tools.controls.seekbar.w(this, 13), true));
        this.A = new fa00(this, 3);
        this.B = new bpn0(new b1h(this, 29));
        this.C = new bpn0(new p5y(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VkTopBar.Middle.Text c(tlo0 tlo0Var) {
        gzs gzsVar = null;
        VkTopBar.Middle.Text.Title.a aVar = null;
        VkTopBar.Middle.Text.Title.Size size = null;
        return new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0Var, gzsVar, aVar, size, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14);
    }

    public final la10 a() {
        Object obj;
        Iterator it = this.r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((la10) obj).getType() == 1) {
                break;
            }
        }
        return (la10) obj;
    }

    public final la10 b() {
        Object obj;
        Iterator it = this.r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((la10) obj).getType() == 0) {
                break;
            }
        }
        return (la10) obj;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
