package xsna;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.ui.fragments.ChatAttachmentHistoryFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.gyn0.a;

/* compiled from: TabsHistoryAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class fyn0 extends j8i {
    public static final /* synthetic */ qcy<Object>[] p;
    public final ChatAttachmentHistoryFragment.b i;
    public final a1w j;
    public final Peer k;
    public final ChatSettings l;
    public final e8v m;
    public final ArrayList n;
    public final g9e0 o;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(fyn0.class, "vc", "getVc()Lcom/vk/im/ui/components/attaches_history/tabs/TabsHistoryAttachesVC;", 0);
        fpf0.a.getClass();
        p = new qcy[]{propertyReference1Impl};
    }

    public fyn0(FragmentActivity fragmentActivity, mxv mxvVar, zdw zdwVar, ImageViewer imageViewer, ChatAttachmentHistoryFragment.b bVar, a1w a1wVar, Peer peer, ChatSettings chatSettings) {
        this.i = bVar;
        this.j = a1wVar;
        this.k = peer;
        this.l = chatSettings;
        this.m = new e8v(a1wVar, mxvVar, zdwVar, imageViewer, fragmentActivity, peer, false, null);
        boolean zb = peer.zb();
        ArrayList b = n0v0.a.b(!zb ? Collections.singletonList(new o8v(MediaType.APPS)) : zb ? Collections.singletonList(new o8v(MediaType.APPS)) : EmptyList.b);
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(this.m.a((MediaType) it.next(), this.l));
        }
        this.n = arrayList;
        this.o = new g9e0(new h8n0(this, 1));
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((c8v) it.next()).K0(configuration);
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        g9e0 g9e0Var = this.o;
        g9e0Var.d();
        Source source = Source.CACHE;
        Peer peer = this.k;
        io.reactivex.rxjava3.internal.operators.single.c C = this.j.C(this, new tqm(peer, source));
        asu0 asu0Var = asu0.a;
        I0(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.r(C.q(asu0Var.c()), new oe40(new vnb0(3, peer, this), 13)).m(asu0Var.d()), new gky(27), new n7b0(this, 14)));
        qcy<Object> qcyVar = p[0];
        gyn0 gyn0Var = (gyn0) g9e0Var.b();
        gyn0Var.getClass();
        View inflate = layoutInflater.inflate(R.layout.vkim_history_attaches_view_pager, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        gyn0Var.e = toolbar;
        toolbar.setNavigationOnClickListener(new rg0(gyn0Var, 12));
        Toolbar toolbar2 = gyn0Var.e;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationContentDescription(R.string.accessibility_back);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.vkim_viewpager);
        gyn0Var.c = viewPager;
        viewPager.setAdapter(gyn0Var.new a());
        ViewPager viewPager2 = gyn0Var.c;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(gyn0Var.a.size());
        gyn0Var.d = (VKTabLayout) inflate.findViewById(R.id.vkim_tab_layout);
        z1q0 z1q0Var = new z1q0((List<? extends MobileOfficialAppsCoreNavStat$EventScreen>) e43.l(MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_PHOTO, MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_VIDEO, MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_AUDIO, MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_DOCS, MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_LINKS));
        VKTabLayout vKTabLayout = gyn0Var.d;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        vKTabLayout.f(z1q0Var);
        VKTabLayout vKTabLayout2 = gyn0Var.d;
        if (vKTabLayout2 == null) {
            vKTabLayout2 = null;
        }
        ViewPager viewPager3 = gyn0Var.c;
        vKTabLayout2.setupWithViewPager(viewPager3 != null ? viewPager3 : null);
        return inflate;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.o.a();
    }
}
