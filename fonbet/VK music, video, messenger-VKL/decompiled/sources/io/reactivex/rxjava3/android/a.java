package io.reactivex.rxjava3.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4382j6;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.aej0;
import xsna.bwt0;
import xsna.bxu;
import xsna.c63;
import xsna.c7c0;
import xsna.cor;
import xsna.cwy0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.fil0;
import xsna.foe;
import xsna.g3a;
import xsna.i5g;
import xsna.kiu;
import xsna.lj8;
import xsna.mb20;
import xsna.mzp0;
import xsna.n3w;
import xsna.nlk;
import xsna.ob20;
import xsna.rli0;
import xsna.skm0;
import xsna.tb20;
import xsna.tmo;
import xsna.u7z0;
import xsna.wb20;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.o layoutManager;
        switch (this.b) {
            case 0:
                ((b) this.c).a();
                return;
            case 1:
                BanInfo banInfo = (BanInfo) this.c;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                    int i = AuthActivity.W;
                    Context context = e43.a;
                    Intent a = AuthActivity.a.a(context != null ? context : null);
                    VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
                    a.putExtra("banData", new VkBanRouterInfo(banInfo, VkAuthMetaInfo.a.a()));
                    DefaultAuthActivity.b.a(a);
                    b.startActivityForResult(a, 18539);
                    return;
                }
                return;
            case 2:
                lj8 lj8Var = (lj8) this.c;
                lj8Var.d.setVisibility(0);
                lj8Var.i.setVisibility(0);
                f4m.j(lj8Var.e);
                f4m.j(lj8Var.f);
                return;
            case 3:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.c;
                foe.f fVar = foe.f.b;
                clipsOwnerSwipeFragment.getClass();
                xn50.a.c(clipsOwnerSwipeFragment, fVar);
                return;
            case 4:
                tmo tmoVar = (tmo) this.c;
                boolean isPopupShowing = tmoVar.h.isPopupShowing();
                tmoVar.t(isPopupShowing);
                tmoVar.m = isPopupShowing;
                return;
            case 5:
                ((FrameEncoderImpl) this.c).c();
                return;
            case 6:
                ((bxu) this.c).m = 0;
                return;
            case 7:
                n3w n3wVar = (n3w) this.c;
                n3wVar.g.b = false;
                fil0 fil0Var = n3wVar.g;
                fil0Var.c = true;
                fil0Var.d.e();
                return;
            case 8:
                ListGroupCallView listGroupCallView = (ListGroupCallView) this.c;
                HashSet<CallMemberId> hashSet = listGroupCallView.W;
                HashSet<CallMemberId> hashSet2 = listGroupCallView.V;
                ListGroupCallView.c cVar = listGroupCallView.R;
                ListGroupCallView.b bVar = listGroupCallView.Q;
                if (listGroupCallView.getVisibility() == 0) {
                    int v = cVar.v();
                    int x = cVar.x();
                    if (v < 0 || x >= bVar.d.size()) {
                        return;
                    }
                    hashSet2.clear();
                    hashSet.clear();
                    Iterator<T> it = bVar.d.subList(v, x + 1).iterator();
                    while (it.hasNext()) {
                        hashSet2.add(((kiu) it.next()).a.a);
                    }
                    cor.a aVar = new cor.a(rli0.x(rli0.y(rli0.i(new i5g(bVar.d), Math.max(v, 0)), Math.min(v, 3)), rli0.y(rli0.i(new i5g(bVar.d), x), 0)));
                    while (aVar.hasNext()) {
                        hashSet.add(((kiu) aVar.next()).a.a);
                    }
                    nlk.b.getClass();
                    nlk.c();
                    return;
                }
                return;
            case 9:
                wb20 wb20Var = (wb20) this.c;
                synchronized (wb20Var) {
                    tb20 P0 = wb20Var.f.P0();
                    tb20 a2 = tb20.a(P0, null, null, null, new ob20.b(mb20.b), true, 7);
                    if (!P0.equals(a2)) {
                        wb20Var.f.onNext(a2);
                    }
                }
                wb20Var.k = null;
                return;
            case 10:
                com.vk.media.ok.b bVar2 = (com.vk.media.ok.b) this.c;
                com.vk.media.ok.a aVar2 = bVar2.h;
                if (aVar2 != null) {
                    aVar2.r(bVar2.V0);
                    return;
                }
                return;
            case 11:
                c7c0.a aVar3 = (c7c0.a) this.c;
                if (dhr0.M()) {
                    dhr0.a.getClass();
                    aVar3.d.setTextColor(e3m.f(R.attr.vk_ui_text_primary, dhr0.y()));
                }
                CharSequence charSequence = aVar3.e;
                if (charSequence != null) {
                    aVar3.c.setText(charSequence);
                }
                VkOnboardingHighlighter.e(aVar3.c, false, null, true, null, 8);
                return;
            case 12:
                ((HandlerThread) this.c).quitSafely();
                return;
            case 13:
                aej0 aej0Var = (aej0) this.c;
                aej0Var.getClass();
                f4m.t(bwt0.y(R.dimen.paddingXS, aej0Var.itemView), aej0Var.J);
                return;
            case 14:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) this.c;
                mzp0 mzp0Var = stickerCatalogRootVh.r;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(stickerCatalogRootVh.C, stickerCatalogRootVh);
                return;
            case 15:
                ((skm0.a) this.c).F();
                return;
            case 16:
                TabsRecycler tabsRecycler = (TabsRecycler) this.c;
                if (tabsRecycler.getScrollState() != 0 || (layoutManager = tabsRecycler.getLayoutManager()) == null || layoutManager.isSmoothScrolling()) {
                    return;
                }
                tabsRecycler.a(true);
                if (tabsRecycler.getInited()) {
                    Iterator<TabsRecycler.b> it2 = tabsRecycler.getScrollListners().iterator();
                    while (it2.hasNext()) {
                        it2.next().b(tabsRecycler.k, true);
                    }
                    return;
                }
                return;
            case 17:
                ((Tensorflow) this.c).changeSettings();
                return;
            case 18:
                cwy0 cwy0Var = (cwy0) this.c;
                u7z0.a aVar4 = cwy0Var.j;
                if (aVar4 != null) {
                    aVar4.a(cwy0Var.l / 1000.0d);
                }
                long j = cwy0Var.l;
                if (j > 0) {
                    cwy0Var.l = j - 200;
                    return;
                }
                cwy0Var.e.setVisibility(0);
                u7z0.a aVar5 = cwy0Var.j;
                if (aVar5 != null) {
                    aVar5.a(true);
                    cwy0Var.b.h(cwy0Var.c);
                    return;
                }
                return;
            default:
                C4382j6.d((C4382j6) this.c);
                return;
        }
    }
}
