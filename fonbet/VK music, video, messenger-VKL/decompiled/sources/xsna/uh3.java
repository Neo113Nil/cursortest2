package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.MinElf;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.log.L;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.reactions.view.ElevationImageView;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TextEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.b9a0;
import xsna.dz40;
import xsna.ig3;
import xsna.jnd;
import xsna.lbf;
import xsna.ljh;
import xsna.o0r0;
import xsna.o9t;
import xsna.sx40;
import xsna.vo7;
import xsna.xn50;
import xsna.ynh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uh3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 4;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = ArchiveFragment.e0;
                xn50.a.c((ArchiveFragment) obj2, new ig3.k.c((String) obj));
                return s3q0.a;
            case 1:
                wa6 wa6Var = (wa6) obj2;
                VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) obj;
                ek20 ek20Var = (ek20) wa6Var.J.getValue();
                FragmentManager supportFragmentManager = wa6Var.kn().getSupportFragmentManager();
                sj20 sj20Var = wa6Var.K;
                String str = wa6Var.t;
                if (str == null) {
                    str = null;
                }
                String str2 = wa6Var.s;
                ek20Var.a(supportFragmentManager, sj20Var, new mj20(str, str2 != null ? str2 : null, verificationMethodTypes, wa6Var.O));
                return s3q0.a;
            case 2:
                return "removePositionChangeListener() - count= " + ((BaseVideoPlayer) obj2).m.size() + " listener= " + ((OneVideoPlayer.d) obj);
            case 3:
                ((us6) obj2).o1.d(((ModernSearchView) obj).getContext());
                return s3q0.a;
            case 4:
                yzo yzoVar = (yzo) obj;
                int i4 = vo7.a.$EnumSwitchMapping$1[((BookingEditScreenState.InfoBlock) ((mtk0) obj2).getValue()).e.ordinal()];
                if (i4 == 1) {
                    return null;
                }
                if (i4 == 2) {
                    return yzoVar.b;
                }
                if (i4 == 3) {
                    return yzoVar.d;
                }
                if (i4 == 4) {
                    return yzoVar.c;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                q49 q49Var = (q49) obj2;
                mlp mlpVar = (mlp) obj;
                L.e("CallLifecycleListenerProxy", fw3.d(q49Var.b, new StringBuilder("callLifecycleListeners: ")));
                Iterator<g49> it = q49Var.b.iterator();
                while (it.hasNext()) {
                    it.next().w(mlpVar);
                }
                return s3q0.a;
            case 6:
                dz40.d.b bVar = (dz40.d.b) obj2;
                izs izsVar = (izs) obj;
                if (bVar.c.length() > 0) {
                    izsVar.invoke(new sx40.b.C3699b(bVar.c));
                }
                return s3q0.a;
            case 7:
                hjf hjfVar = (hjf) obj;
                if (((jnd.a) obj2) instanceof jnd.a.b) {
                    hjfVar.b(lbf.a.g.b);
                } else {
                    hjfVar.b(new lbf.c.s.a(false));
                }
                return s3q0.a;
            case 8:
                ((d4h) obj2).c.invoke();
                ((nsg) obj).getClass();
                throw null;
            case 9:
                ljh.b bVar2 = (ljh.b) obj2;
                bVar2.n.invoke((f5u) obj, Integer.valueOf(bVar2.getAbsoluteAdapterPosition()));
                return s3q0.a;
            case 10:
                izs izsVar2 = (izs) obj;
                String str3 = ((CommunityTrustMarksArgs.TrustMarkData) obj2).f;
                if (str3 != null) {
                    izsVar2.invoke(new c.f(str3));
                }
                return s3q0.a;
            case 11:
                com.vk.im.ui.components.contacts.b bVar3 = (com.vk.im.ui.components.contacts.b) obj2;
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                List<qtd0> list = bVar3.d().a;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (qtd0 qtd0Var : list) {
                    qtd0 Cb = profilesInfo.Cb(Long.valueOf(qtd0Var.G3()));
                    if (Cb != null) {
                        qtd0Var = Cb;
                    }
                    arrayList.add(qtd0Var);
                }
                ArrayList arrayList2 = arrayList;
                if (bVar3.k) {
                    Object obj3 = nbj.a;
                    arrayList2 = nbj.a(new ProfilesSimpleInfo(arrayList), bVar3.d().e.p);
                }
                bVar3.o.onNext(gdj.a(bVar3.d(), arrayList2, null, null, null, null, false, null, 2046));
                return s3q0.a;
            case 12:
                ((ptk0) obj2).a((lm50) obj);
                return s3q0.a;
            case 13:
                return ((e0w) obj2).compileStatement(((ldm) obj).a.e());
            case 14:
                return ElevationImageView.U0((ElevationImageView) obj2, (Drawable) obj);
            case 15:
                com.vk.core.fragments.e eVar = (com.vk.core.fragments.e) obj2;
                FragmentEntry fragmentEntry = (FragmentEntry) obj;
                boolean Nb = eVar.e.c.Nb(fragmentEntry.e);
                eVar.e.c.b.getFirst().Bb(fragmentEntry);
                vbs vbsVar = eVar.a;
                vbsVar.c();
                eVar.d(fragmentEntry, null);
                eVar.f(vbsVar);
                if (Nb) {
                    eVar.b.b(eVar.e.c.Ob().b);
                }
                eVar.e();
                return s3q0.a;
            case 16:
                ((izs) obj2).invoke(((MarketProductCardMainInfo.a) obj).a);
                return s3q0.a;
            case 17:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(new sx40.t(PlayerContext.FULL, null));
                return s3q0.a;
            case 18:
                rw30 rw30Var = (rw30) obj2;
                g6o0 g6o0Var = (g6o0) obj;
                ox30 ox30Var = rw30Var.l;
                boolean z = false;
                Context context = rw30Var.k;
                b25 b25Var = rw30Var.m;
                boolean c = o25.c(b25Var);
                boolean z2 = !BuildInfo.t();
                a1w a1wVar = rw30Var.i;
                Peer q = a1wVar.q();
                cau0 cau0Var = a1wVar.r().h;
                q.getClass();
                if (!q.Ab(Peer.Type.GROUP) && (!o25.b(b25Var) || b25Var.i().S)) {
                    z = true;
                }
                return new iy30(rw30Var, ox30Var, context, c, z2, z, g6o0Var, new k7y(rw30Var, 13));
            case 19:
                ((na50) obj2).n.g.invoke(((lna) obj).a);
                return s3q0.a;
            case 20:
                dw20 dw20Var = (dw20) obj;
                wzf wzfVar = ((oe80) obj2).h;
                if (wzfVar != null) {
                    wzfVar.invoke(Boolean.TRUE);
                }
                dw20Var.hide();
                return s3q0.a;
            case 21:
                o6a0 o6a0Var = (o6a0) obj2;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(o6a0Var.c(), o6a0Var.b.a(), null, null, null, null, null, null, null, (MobileOfficialAppsCorePhotoEditorStat$TextEvent) obj, null, null, null, null, null, null, 65016, null);
            case 22:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).h.b(new b9a0.f.d(((PhotoAlbumWrapper.CommonPhotoAlbum) obj).e));
                return s3q0.a;
            case 23:
                izs izsVar3 = (izs) obj;
                uet uetVar = ((w7t) obj2).b;
                if (uetVar != null) {
                    izsVar3.invoke(new o9t.b(uetVar));
                }
                return s3q0.a;
            case 24:
                xwk.e().m((Activity) obj2, ((UserProfile) obj).c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 25:
                izs izsVar4 = (izs) obj;
                if (((Boolean) ((mtk0) obj2).getValue()).booleanValue()) {
                    izsVar4.invoke(ynh0.j.b);
                }
                return s3q0.a;
            case 26:
                Activity activity = (Activity) obj;
                PermissionHelper.a.getClass();
                if (!((ArrayList) obj2).containsAll(rl3.u0(PermissionHelper.h)) || q7n0.a().d().c(activity)) {
                    return s3q0.a;
                }
                q7n0.a().d().a(activity, null, null);
                return s3q0.a;
            case 27:
                ((slq0) obj2).a(new UserProfileAction.s.c.a.l(new a0m0((VkButton) obj, i2)));
                return s3q0.a;
            case 28:
                VideoDiscoveryRecommendationsRepository.Params.a aVar = (VideoDiscoveryRecommendationsRepository.Params.a) ((VideoDiscoveryRecommendationsRepository.Params) obj);
                ((VideoDiscoveryRecommendationsRepository) obj2).getClass();
                fz2 y = yfb.y(tft0.d(new uft0(), r11.b(new StringBuilder(), aVar.b.b, '_', aVar.a), null, aVar.d, aVar.g, aVar.c, 6), new z6u(29));
                ahn.D(y);
                return rsg0.T(y);
            default:
                VkTooltip vkTooltip = (VkTooltip) obj;
                ((gzs) obj2).invoke();
                f4m.j(vkTooltip);
                vkTooltip.C = false;
                return s3q0.a;
        }
    }

    public /* synthetic */ uh3(ArrayList arrayList, com.vk.superapp.ui.a aVar, Activity activity) {
        this.b = 26;
        this.c = arrayList;
        this.d = activity;
    }
}
