package xsna;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.tags.Tag;
import com.vk.im.engine.models.users.User;
import com.vk.log.L;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.network.eventhub.api.EventHubServiceUrlBuilder;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import com.vk.network.eventhub.impl.di.EventHubComponentImpl;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.bxi;
import xsna.dai;
import xsna.gdn;
import xsna.kef0;
import xsna.q2j;
import xsna.whg;
import xsna.xx30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        pni0 pni0Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj2;
                if (!n4Var.c(n4Var.e.e)) {
                    n4Var.f.g(n4Var.b, n4Var.e, null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : Boolean.TRUE);
                }
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                int i2 = 1;
                sa0 sa0Var = new sa0(cVar, i2);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, sa0Var);
                return new qy0(msy.a(lazyThreadSafetyMode, new sk(i2, cVar, (Context) obj)), msy.a(lazyThreadSafetyMode, new tx(i2, cVar, a)), a, cVar.r);
            case 2:
                ((f15) obj2).k.a.invoke(new gdn.a.b(((hlb) obj).a.b));
                return s3q0.a;
            case 3:
                r620 r620Var = (r620) obj2;
                mv90 mv90Var = r620Var.c;
                FragmentImpl fragmentImpl = r620Var.a;
                VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) ((SearchParams) obj);
                if (((Boolean) mv90Var.b.getValue()).booleanValue()) {
                    mv90Var.a.a(fragmentImpl.requireContext(), fragmentImpl.getChildFragmentManager(), vkPeopleSearchParams);
                } else {
                    ams.a().c(fragmentImpl.kn(), fragmentImpl.getChildFragmentManager(), vkPeopleSearchParams);
                }
                return s3q0.a;
            case 4:
                ((ede) obj2).l.invoke((nmv) obj);
                return s3q0.a;
            case 5:
                yhg yhgVar = (yhg) obj2;
                whg.u uVar = (whg.u) obj;
                yhgVar.c.j().d(yhgVar.a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), uVar.a, uVar.b);
                return s3q0.a;
            case 6:
                qvi0 qvi0Var = ((a2j) obj2).g;
                q2j.h hVar = (q2j.h) ((q2j) obj);
                qvi0Var.a.m(hVar.e.size());
                svi0 svi0Var = hVar.h;
                if (svi0Var.a) {
                    qvi0Var.a.M(svi0Var.c, svi0Var.b);
                }
                L.A("Known rooms list was activated");
                return s3q0.a;
            case 7:
                String str = ((bxi.a.C2631a) obj2).b;
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj;
                d6q0.a.getClass();
                Iterator<ny1> it = d6q0.d.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
                if (epx.f(str, "vpn_settings")) {
                    wp80.d(appCompatActivity);
                } else {
                    d6q0.a.getClass();
                    bxi bxiVar = d6q0.b;
                    if (bxiVar != null && (pni0Var = bxiVar.i) != null) {
                        pni0Var.invoke(appCompatActivity, str);
                    }
                }
                return s3q0.a;
            case 8:
                Lazy lazy = (Lazy) obj2;
                qcy<Object>[] qcyVarArr = EventHubComponentImpl.e;
                return new EventHubServiceClient((EventHubServiceUrlBuilder) ((vzp) lazy.getValue()).a.invoke(), ((vzp) lazy.getValue()).b, ((vzp) lazy.getValue()).c, (hzs) ((vzp) lazy.getValue()).d.invoke(), ((vzp) lazy.getValue()).e, ((EventHubComponentImpl) obj).c, ((vzp) lazy.getValue()).f, ((vzp) lazy.getValue()).g, ((vzp) lazy.getValue()).h);
            case 9:
                sw30 sw30Var = (sw30) obj;
                return new rmm((a1w) obj2, new xw30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new yw30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 10:
                ((gzs) obj2).invoke();
                ((gzs) obj).invoke();
                return s3q0.a;
            case 11:
                String str2 = (String) obj2;
                nx50 nx50Var = (nx50) obj;
                if (str2 != null) {
                    ((mun0) nx50Var.W.getValue()).c(str2, nx50Var.H0().h());
                }
                VkContextMenu vkContextMenu = nx50Var.L0;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 12:
                izs izsVar = (izs) obj2;
                snv snvVar = (snv) obj;
                if (!jjc.d().a()) {
                    izsVar.invoke(snvVar);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 13:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((vva0) obj2)).a(fpf0.a(PlayerAnalyticsComponent.class))).Ec(((ex40) obj).getConfig().a().c());
            case 14:
                ((dai.d) ((kef0) obj2).l.getValue()).c.invoke(new kef0.a(((ee50) obj).a));
                return s3q0.a;
            case 15:
                ((uhj0) obj2).e0((com.vkontakte.android.actionlinks.a) obj);
                return s3q0.a;
            case 16:
                cvj0 cvj0Var = (cvj0) obj2;
                Tag tag = (Tag) obj;
                zzq zzqVar = (zzq) cvj0Var.J.getValue();
                int i3 = tag.b;
                long j = tag.d.b;
                String str3 = cvj0Var.v;
                FeedGoodsPhotoHolder.a aVar = cvj0Var.I;
                Integer valueOf = aVar != null ? Integer.valueOf(aVar.m2()) : null;
                zzqVar.getClass();
                zzq.b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.AUTHOR_MENU, i3, j, str3, valueOf, null);
                cvj0Var.f7(tag, (PhotoAttachment) cvj0Var.C);
                return s3q0.a;
            case 17:
                myc0.h((yvj) obj2, null, null, new nyn0((yjl) obj, null), 3);
                return s3q0.a;
            case 18:
                ((ioq0) obj2).w.c((User) obj);
                return s3q0.a;
            default:
                return ((s290) ((com.vk.libvideo.offline.ui.a) obj2).t.getValue()).a(((VideoFileOld) obj).w2());
        }
    }
}
