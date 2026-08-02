package xsna;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dto.common.Peer;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment.h;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogErrorVh;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.b78;
import xsna.bgp0;
import xsna.c9p0;
import xsna.svv0;
import xsna.sx40;
import xsna.yno0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w2j0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2j0(VideoCatalogSearchRootVh videoCatalogSearchRootVh, Activity activity) {
        this.b = 15;
        this.c = videoCatalogSearchRootVh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        pk30 pk30Var;
        ?? r1;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = SettingsListFragment.X0;
                return ((TabbarSettingsComponent) m7m.d((SettingsListFragment) obj).a(fpf0.a(TabbarSettingsComponent.class))).Ue();
            case 1:
                ShortVideoListView.c cVar = (ShortVideoListView.c) ((zoi) ((ShortVideoListView.e) obj).j.getValue()).getValue();
                if (cVar != null) {
                    cVar.invoke(false);
                }
                return s3q0.a;
            case 2:
                c8m0 c8m0Var = (c8m0) obj;
                o1l0 o1l0Var = c8m0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(c8m0Var);
                }
                return s3q0.a;
            case 3:
                return ((StoryReactionsComponent) ((k7m) m7m.c(((ebm0) obj).a)).mo408a(fpf0.a(StoryReactionsComponent.class))).b();
            case 4:
                int i3 = StorySettingsActivity.P;
                return ((StoriesComponent) m7m.a((StorySettingsActivity) obj).a(fpf0.a(StoriesComponent.class))).w3();
            case 5:
                m6n0 m6n0Var = (m6n0) obj;
                dw20 dw20Var = m6n0Var.d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                m6n0Var.d = null;
                m6n0Var.e = null;
                m6n0Var.f = null;
                m6n0Var.b.invoke(Integer.valueOf(m6n0Var.g));
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr = TemplateDetailsFragment.R;
                return new TemplateDetailsFragment.b((TemplateDetailsFragment) obj);
            case 7:
                return ((yno0) obj).new c();
            case 8:
                ((izs) ((zak0) ((c9p0.e) obj).d).getValue()).invoke(new sx40.g0(PlayerContext.TOP));
                return s3q0.a;
            case 9:
                ((xfp0) obj).T(new bgp0.b());
                return s3q0.a;
            case 10:
                ((fuv0) obj).show();
                return s3q0.a;
            case 11:
                Regex regex = hgr0.X;
                ok8 Jn = ((hgr0) obj).Jn();
                if (Jn != null) {
                    Jn.close();
                }
                return s3q0.a;
            case 12:
                return ((lor0) obj).a.findViewById(R.id.ads_image_container);
            case 13:
                pur0 pur0Var = (pur0) obj;
                Peer peer = pur0Var.q;
                if (peer != null && (pk30Var = pur0Var.r) != null) {
                    pk30Var.L(peer);
                }
                return s3q0.a;
            case 14:
                com.vk.video.ad.b bVar = (com.vk.video.ad.b) obj;
                if (bVar.g) {
                    bVar.f.f();
                }
                return s3q0.a;
            case 15:
                int i4 = VideoCatalogSearchRootVh.S;
                ((VideoCatalogSearchRootVh) obj).m.c.getClass();
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((hgs0) obj).M);
            case 17:
                bos0 bos0Var = (bos0) obj;
                cos0 cos0Var = (cos0) bos0Var.d.getValue();
                if (cos0Var != null) {
                    ArrayList arrayList = cos0Var.a;
                    r1 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        zns0 zns0Var = (zns0) obj2;
                        Set<String> stringSet = ((SharedPreferences) bos0Var.c.getValue()).getStringSet("pref_key_shown_bomb_trap_ids", new LinkedHashSet());
                        if (stringSet == null) {
                            stringSet = new LinkedHashSet<>();
                        }
                        if (!stringSet.contains(zns0Var.a)) {
                            r1.add(obj2);
                        }
                    }
                } else {
                    r1 = EmptyList.b;
                }
                return new sk3((Collection) r1);
            case 18:
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = (VideoInteractiveFullscreenFragment) obj;
                FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = videoInteractiveFullscreenFragment.u0;
                FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout2 = fitSystemWindowsFrameLayout == null ? null : fitSystemWindowsFrameLayout;
                rcx rcxVar = videoInteractiveFullscreenFragment.t0;
                if (rcxVar == null) {
                    rcxVar = null;
                }
                tn10 q3 = rcxVar.q3();
                rcx rcxVar2 = videoInteractiveFullscreenFragment.t0;
                return new xnt0(fitSystemWindowsFrameLayout2, rl3.I(new tn10[]{q3, new com.vk.libvideo.api.ui.b((rcxVar2 != null ? rcxVar2 : null).o0())}), EmptyList.b, videoInteractiveFullscreenFragment.new h(), 112);
            case 19:
                return (VideoTechBugreportComponent) ((f8m) obj).c(fpf0.a(VideoTechBugreportComponent.class));
            case 20:
                ((VideoProfileCatalogErrorVh) obj).f.invoke();
                return s3q0.a;
            case 21:
                uxt0 uxt0Var = (uxt0) obj;
                return new dfj0(uxt0Var.F, uxt0Var.k, uxt0Var.q.Ef(), uxt0Var.g, uxt0Var.t, uxt0Var.M, uxt0Var.N, uxt0Var.p.Ef());
            case 22:
                ((b78.b) obj).a().invoke(sx40.g.b);
                return s3q0.a;
            case 23:
                svv0 svv0Var = (svv0) ((com.vk.superapp.browser.ui.a) obj).o.getValue();
                if (svv0Var instanceof svv0.b) {
                    return new rwv0((svv0.b) svv0Var);
                }
                if (!(svv0Var instanceof svv0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                svv0.a aVar = (svv0.a) svv0Var;
                zuv0 zuv0Var = new zuv0();
                zuv0Var.a = aVar;
                zuv0Var.c = aVar.a.D;
                return zuv0Var;
            case 24:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(BridgeComponent.class))).h8();
            case 25:
                isv0 isv0Var = (isv0) obj;
                return new tyo0(new eml(0), (htk0) isv0Var.e.getValue(), isv0Var.c);
            case 26:
                int i5 = qtw0.l1;
                ((qtw0) obj).dismiss();
                return s3q0.a;
            default:
                ((Handler) obj).removeCallbacksAndMessages(null);
                return s3q0.a;
        }
    }

    public /* synthetic */ w2j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
