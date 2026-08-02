package xsna;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.channels.api.Channel;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupChat;
import com.vk.dto.polls.Poll;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.c0e;
import xsna.c5i;
import xsna.cwb0;
import xsna.dob;
import xsna.f29;
import xsna.fvf;
import xsna.gm50;
import xsna.kt8;
import xsna.l7x0;
import xsna.q29;
import xsna.qv4;
import xsna.r2j;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wl0(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar, xx0 xx0Var) {
        this.b = 28;
        this.c = dVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockMusicPage uIBlockMusicPage;
        int i = this.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i2 = 20;
        int i3 = 13;
        int i4 = 12;
        int i5 = 18;
        int i6 = 0;
        switch (i) {
            case 0:
                return rsg0.y0(new u20(((AddLinkPresenter) this.c).h), null, null, 3);
            case 1:
                np0 np0Var = (np0) this.c;
                np0Var.d.h7(l7x0.b.a);
                b7d0 b7d0Var = np0Var.d;
                b7d0Var.i7((Throwable) obj);
                b7d0Var.b7((Poll) np0Var.b.y.b);
                return s3q0.a;
            case 2:
                ArtistInfoVh artistInfoVh = (ArtistInfoVh) this.c;
                uq3 uq3Var = (uq3) obj;
                if (epx.f(uq3Var.a.b, artistInfoVh.x) && (uIBlockMusicPage = artistInfoVh.l) != null) {
                    UIBlockMusicArtist uIBlockMusicArtist = uIBlockMusicPage instanceof UIBlockMusicArtist ? (UIBlockMusicArtist) uIBlockMusicPage : null;
                    if (uIBlockMusicArtist != null) {
                        uIBlockMusicArtist.z.i = uq3Var.b;
                        artistInfoVh.N6(uIBlockMusicPage);
                    }
                }
                return s3q0.a;
            case 3:
                pv4 pv4Var = (pv4) this.c;
                boolean z = ((qv4.d) obj).f;
                AppCompatImageView appCompatImageView = pv4Var.w;
                if (appCompatImageView == null) {
                    appCompatImageView = null;
                }
                if (!z) {
                    f = 1.0f;
                }
                appCompatImageView.setAlpha(f);
                AppCompatImageView appCompatImageView2 = pv4Var.x;
                if (appCompatImageView2 == null) {
                    appCompatImageView2 = null;
                }
                appCompatImageView2.setImageResource(z ? R.drawable.vk_icon_lock_16 : R.drawable.ic_unlocked_16);
                kkm kkmVar = pv4Var.c;
                AppCompatImageView appCompatImageView3 = pv4Var.x;
                kkmVar.d(appCompatImageView3 != null ? appCompatImageView3 : null, z ? R.attr.vk_legacy_accent : R.attr.vk_legacy_icon_outline_secondary);
                return s3q0.a;
            case 4:
                Integer num = (Integer) obj;
                j05 j05Var = (j05) ((k05) this.c).b;
                if (j05Var == null) {
                    return Float.valueOf(dn70.a() * 0.2f);
                }
                int intValue = num.intValue();
                i05 i05Var = (i05) j05Var.b;
                float f2 = i05Var.e;
                float f3 = i05Var.d;
                if (intValue > 7000) {
                    intValue = 7000;
                }
                return Float.valueOf((((intValue - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (f3 - f2)) / 7000.0f) + f2);
            case 5:
                ((mp5) this.c).l.set(false);
                L.G("error: " + ((Throwable) obj));
                return s3q0.a;
            case 6:
                u440 u440Var = (u440) this.c;
                tam0 tam0Var = (tam0) obj;
                mat0 d = tam0Var.d();
                if (d != null) {
                    return u440Var.r0.a(d, tam0Var.e(), false);
                }
                return null;
            case 7:
                o48 o48Var = (o48) this.c;
                VkBottomBar vkBottomBar = new VkBottomBar((Context) obj, null, 6);
                vkBottomBar.getButton().setText("Button");
                vkBottomBar.getSecondButton().setText("Button");
                ((zak0) o48Var.k).setValue(vkBottomBar);
                return vkBottomBar;
            case 8:
                awt0.u(((VkBlurContentView) obj).getChildAt(0), ((Boolean) ((zak0) ((hr8) this.c).g).getValue()).booleanValue());
                return s3q0.a;
            case 9:
                kt8.a aVar = (kt8.a) this.c;
                g2v.d().v().e(xhr0.b(aVar.a, g2v.d().v().d()));
                gau.e(aVar.a, 4, g2v.d().v().d());
                return s3q0.a;
            case 10:
                ((z19) this.c).T(new f29.e(((q29.b) obj).a));
                return s3q0.a;
            case 11:
                hna hnaVar = (hna) this.c;
                ((Boolean) obj).booleanValue();
                hnaVar.d.invoke();
                return s3q0.a;
            case 12:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new jxa(i6, (Channel) obj, (lxa) this.c)).r0(asu0.a.c());
            case 13:
                ynb ynbVar = (ynb) this.c;
                dob.g gVar = (dob.g) obj;
                gm50.a.a(ynbVar, gVar.f, new sa(ynbVar, i2));
                gm50.a.a(ynbVar, gVar.a, new dg(ynbVar, 15));
                gm50.a.a(ynbVar, gVar.b, new m7(ynbVar, 25));
                gm50.a.a(ynbVar, gVar.c, new zx(ynbVar, i5));
                gm50.a.a(ynbVar, gVar.d, new gr3(ynbVar, 9));
                gm50.a.a(ynbVar, gVar.e, new com.vk.im.engine.internal.api_commands.messages.a(ynbVar, i4));
                return s3q0.a;
            case 14:
                cxb cxbVar = (cxb) this.c;
                int intValue2 = ((Integer) obj).intValue();
                ftb ftbVar = cxbVar.x;
                Peer peer = cxbVar.c.f;
                if (!hg1.d(ftbVar.m)) {
                    io.reactivex.rxjava3.core.x b = ftbVar.c.b(ftbVar, new bdm(peer, true, intValue2, true));
                    asu0 asu0Var = asu0.a;
                    int i7 = 7;
                    io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(b.q(asu0Var.c()).m(asu0Var.d()), new tp0(new zx0(ftbVar, i2), i7)), new ctb(ftbVar, i6)).subscribe(new dtb(new qt0(11), 0), new np3(new sa(ftbVar, 21), i7));
                    ftbVar.p.b(subscribe);
                    ftbVar.m = subscribe;
                }
                return s3q0.a;
            case 15:
                azb azbVar = ((xyb) this.c).A;
                if (azbVar != null) {
                    azbVar.a().c(new cwb0.x(), new il1(azbVar, i3));
                }
                return s3q0.a;
            case 16:
                ((o1d) this.c).x0.a(new ClipItemViewEvent.h(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 17:
                und undVar = (und) this.c;
                vqt vqtVar = (vqt) obj;
                undVar.i.l(vqtVar.b);
                com.vk.lists.c cVar = undVar.i;
                String j = cVar.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 18:
                L.l("ClipsEditorStickersLoadingInteractor", "fail to load sticker= " + ((c0e.b) this.c) + " error= " + ((Throwable) obj) + ' ');
                return s3q0.a;
            case 19:
                o9e o9eVar = (o9e) this.c;
                ArrayList arrayList = new ArrayList();
                for (MediaStoreEntry mediaStoreEntry : (List) obj) {
                    if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                        MediaStoreVideoEntry mediaStoreVideoEntry = (MediaStoreVideoEntry) mediaStoreEntry;
                        arrayList.add(new m5t(mediaStoreVideoEntry.q, mediaStoreVideoEntry.k));
                    } else {
                        arrayList.add(new i4t(mediaStoreEntry.f()));
                    }
                }
                o9eVar.d(j5g.u0(arrayList.subList(0, Math.min(arrayList.size(), 500 - o9eVar.j.size())), o9eVar.j));
                return s3q0.a;
            case 20:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                clipsGridFragment.mo().i2((ClipGridParams.Data.Profile) obj);
                return s3q0.a;
            case 21:
                HashSet hashSet = (HashSet) this.c;
                ClipsDraftVk Ab = ((ClipsPersistentStore.PersistedUpload) ((Map.Entry) obj).getValue()).Ab();
                hashSet.addAll(Ab != null ? Ab.f() : EmptySet.b);
                return s3q0.a;
            case 22:
                fvf fvfVar = (fvf) this.c;
                myc0.h(fvfVar.W1(), null, null, new fvf.b.C2896b(fvfVar, (ov70) obj, null), 3);
                return s3q0.a;
            case 23:
                Throwable th = (Throwable) obj;
                ((vqg) this.c).c.ro(th);
                L.i(th);
                return s3q0.a;
            case 24:
                ((dvg) this.c).b.mo();
                return s3q0.a;
            case 25:
                mm50 mm50Var = (mm50) this.c;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new qzg(mm50Var, i6), f9t.z(mm50Var), new oj(i3));
                l370.m(g47Var, f9t.w(mm50Var));
                g47Var.d(new szg(mm50Var));
                return s3q0.a;
            case 26:
                ufh ufhVar = (ufh) this.c;
                GroupChat groupChat = (GroupChat) obj;
                pzb pzbVar = (pzb) ufhVar.t;
                if (pzbVar != null) {
                    zih.a(ufhVar.E, pzbVar, new vmb(groupChat, pzbVar), null, 12);
                }
                return s3q0.a;
            case 27:
                mvh mvhVar = (mvh) this.c;
                awh awhVar = mvhVar.d0;
                UserId userId = mvhVar.e0;
                c5i c5iVar = (c5i) obj;
                if (c5iVar instanceof c5i.b) {
                    c5i.b bVar = (c5i.b) c5iVar;
                    if (epx.f(userId, bVar.a)) {
                        awhVar.bg(bVar.b);
                    }
                } else if (!epx.f(c5iVar, c5i.a.a)) {
                    if (!(c5iVar instanceof c5i.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c5i.c cVar2 = (c5i.c) c5iVar;
                    if (epx.f(cVar2.a, userId)) {
                        ExtendedUserProfile L0 = mvhVar.g0.L0(cVar2.a);
                        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
                        if (extendedCommunityProfile != null) {
                            awhVar.T7(extendedCommunityProfile);
                        }
                    }
                }
                return s3q0.a;
            case 28:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c;
                dVar.T((e.h) obj);
                s3q0 s3q0Var = s3q0.a;
                mzp0 mzp0Var = dVar.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                return s3q0.a;
            default:
                p2j p2jVar = (p2j) this.c;
                tj50.a aVar2 = (tj50.a) obj;
                ak akVar = new ak(i5);
                ao8 ao8Var = ao8.d;
                return new r2j.g(aVar2.a(akVar, ao8Var), aVar2.a(new c2(24), ao8Var), aVar2.a(new wq3(p2jVar), ao8Var));
        }
    }

    public /* synthetic */ wl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
