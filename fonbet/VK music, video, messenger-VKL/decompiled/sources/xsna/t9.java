package xsna;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.impl.fragment.video.VideoData;
import com.vk.catalog2.common.ui.mvp.auto.a;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.a;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.libvideo.bottomsheet.about.delegate.a0;
import com.vk.log.L;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantPermissionsFragment;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.b4;
import xsna.cce;
import xsna.d4e;
import xsna.dob;
import xsna.knb;
import xsna.mwa;
import xsna.qv4;
import xsna.rcb;
import xsna.uxd0;
import xsna.wih0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.vk.clips.sdk.shared.paging.PaginationKey$Next] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        byte[] bArr;
        PaginationKey.LoadedFull next;
        PaginationKey paginationKey;
        boolean z = false;
        PrivacySetting privacySetting = null;
        switch (this.b) {
            case 0:
                ((a0.a) this.c).l.d(b4.g0.a);
                return s3q0.a;
            case 1:
                ((zak0) ((z40) this.c).c).setValue((tho0) obj);
                return s3q0.a;
            case 2:
                a.C0494a c0494a = (a.C0494a) this.c;
                bn40.f("onAdStarted");
                u2b0 u2b0Var = com.vk.catalog2.common.ui.mvp.auto.a.this.d;
                c0494a.N3(u2b0Var.m0(), u2b0Var.H());
                return s3q0.a;
            case 3:
                AppCarouselItem appCarouselItem = (AppCarouselItem) obj;
                t1e t1eVar = ((ee3) this.c).d;
                if (t1eVar != null) {
                    t1eVar.invoke(appCarouselItem);
                }
                return s3q0.a;
            case 4:
                ix3 ix3Var = (ix3) this.c;
                Image image = (Image) obj;
                io.reactivex.rxjava3.core.a.l(new dx3(ix3Var, image)).subscribe(new ex3(), new defpackage.i0(new hx3(com.vk.metrics.eventtracking.b.a, 0), 5));
                ix3Var.b.onNext(image);
                return s3q0.a;
            case 5:
                AttachVideoFragment.b bVar = (AttachVideoFragment.b) this.c;
                Object obj2 = bVar.m;
                VideoData videoData = (VideoData) obj2;
                if (videoData.b != null) {
                    bVar.n.li(bVar.getAdapterPosition(), obj2);
                } else {
                    VideoAlbum videoAlbum = videoData.c;
                    if (videoAlbum != null) {
                        bVar.o.invoke(videoAlbum);
                    }
                }
                return s3q0.a;
            case 6:
                vu4 vu4Var = (vu4) this.c;
                vu4Var.l.Z();
                av4 av4Var = vu4Var.D;
                int intValue = ((Integer) obj).intValue();
                long uptimeMillis = SystemClock.uptimeMillis() - vu4Var.A;
                qv4 b = av4Var.b();
                qv4.d dVar = (qv4.d) (b instanceof qv4.d ? b : null);
                if (dVar == null) {
                    throw new IllegalStateException("expected=" + fpf0.a(qv4.d.class).l() + ", was=" + av4Var.b());
                }
                byte[] bArr2 = dVar.c;
                int i = dVar.d;
                int i2 = i + 1;
                if (i2 >= bArr2.length) {
                    bArr = new byte[Math.max((int) (bArr2.length * 1.5f), 50)];
                    System.arraycopy(bArr2, 0, bArr, 0, i);
                } else {
                    bArr = bArr2;
                }
                bArr[i] = (byte) intValue;
                av4Var.a.onNext(qv4.d.b(dVar, bArr, i2, uptimeMillis / 1000, false, false, 248));
                return s3q0.a;
            case 7:
                ((fh5) this.c).K();
                return s3q0.a;
            case 8:
                ((l57) this.c).c.vn();
                return s3q0.a;
            case 9:
                return new fk7((ViewGroup) obj, (BonusCatalogFragment) this.c);
            case 10:
                BroadcastConfigFragment broadcastConfigFragment = (BroadcastConfigFragment) this.c;
                int i3 = BroadcastConfigFragment.U;
                new BroadcastScheduledFragment().Td(broadcastConfigFragment.getParentFragmentManager(), "BroadcastScheduledFragment");
                return s3q0.a;
            case 11:
                ArrayList a = ((dg8) this.c).g().a((ArrayList) obj, Collections.singleton("lives"));
                if (a == null) {
                    return null;
                }
                Iterator it = a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next2 = it.next();
                        if (epx.f(((PrivacySetting) next2).b, "lives")) {
                            privacySetting = next2;
                        }
                    }
                }
                return privacySetting;
            case 12:
                CallParticipantPermissionsFragment callParticipantPermissionsFragment = (CallParticipantPermissionsFragment) this.c;
                int i4 = CallParticipantPermissionsFragment.S;
                nr4.b().k(callParticipantPermissionsFragment.requireContext(), (String) obj);
                return s3q0.a;
            case 13:
                ((m99) this.c).r();
                return s3q0.a;
            case 14:
                vgb0 vgb0Var = ((kea) this.c).F;
                if (vgb0Var != null) {
                    vgb0Var.invoke();
                }
                return s3q0.a;
            case 15:
                ecb ecbVar = ((pua) this.c).c;
                AvatarAction avatarAction = AvatarAction.CHANGE_BY_GALLERY;
                rcb rcbVar = ecbVar.j;
                rcbVar.getClass();
                int i5 = 2;
                if (rcb.c.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
                    bzb0 bzb0Var = rcbVar.f;
                    if (bzb0Var != null) {
                        bzb0Var.c(rcb.b.e, new m84(i5, rcbVar, avatarAction));
                    }
                } else {
                    bzb0 bzb0Var2 = rcbVar.f;
                    if (bzb0Var2 != null) {
                        bzb0Var2.c(rcb.a.e, new lb6(i5, rcbVar, avatarAction));
                    }
                }
                return s3q0.a;
            case 16:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 17:
                ((com.vk.im.channelcreation.impl.h) this.c).O(g.a.b);
                return s3q0.a;
            case 18:
                ((com.vk.movika.sdk.base.ui.g) this.c).invoke();
                return s3q0.a;
            case 19:
                nnb nnbVar = (nnb) this.c;
                knb.c cVar = (knb.c) obj;
                DialogExt dialogExt = cVar.b;
                Msg msg = cVar.c;
                return new dob.j(dialogExt, msg, (!msg.i || cVar.i) ? dob.j.a.b.a : !cVar.e ? dob.j.a.c.a : dob.j.a.C2746a.a, nnbVar.d.get());
            case 20:
                cxb cxbVar = (cxb) this.c;
                Throwable th = (Throwable) obj;
                L.i(th);
                cxbVar.k(new uxd0.w(th));
                return s3q0.a;
            case 21:
                h8c h8cVar = (h8c) this.c;
                k7r k7rVar = (k7r) obj;
                if (k7rVar instanceof x1x) {
                    List<u1x> list = ((x1x) k7rVar).d;
                    int size = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            if (epx.f(list.get(i6).b, h8cVar.a)) {
                                z = true;
                            } else {
                                i6++;
                            }
                        }
                    }
                } else {
                    z = epx.f(k7rVar.getKey(), h8cVar.a);
                }
                return Boolean.valueOf(z);
            case 22:
                fcn fcnVar = (fcn) obj;
                ?? c = g2u0.c(((l0d) this.c).a);
                ey50 ey50Var = c instanceof ey50 ? (ey50) c : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y != null) {
                    Y.S(fcnVar);
                }
                return s3q0.a;
            case 23:
                ((x6d) this.c).e.a.a(x5d.b);
                return s3q0.a;
            case 24:
                q9d q9dVar = (q9d) this.c;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                List e = ums0.e(ums0.a, q9dVar.c() ? shortVideoGetOwnerVideosResponseDto.e() : new fgg0(shortVideoGetOwnerVideosResponseDto.e()), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator it2 = e.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new wih0.a(k15.B((VideoFile) it2.next()), null));
                }
                if (q9dVar.c()) {
                    next = PaginationKey.LoadedFull.b;
                } else {
                    String g = shortVideoGetOwnerVideosResponseDto.g();
                    next = (g == null || g.length() == 0 || g.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g);
                }
                PaginationKey.LoadedFull loadedFull = next;
                if (q9dVar.c()) {
                    String g2 = shortVideoGetOwnerVideosResponseDto.g();
                    paginationKey = (g2 == null || g2.length() == 0 || g2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g2);
                } else {
                    paginationKey = PaginationKey.LoadedFull.b;
                }
                return new qih0(arrayList, loadedFull, paginationKey, null, null);
            case 25:
                com.vk.clips.editor.voiceover.impl.a aVar = (com.vk.clips.editor.voiceover.impl.a) this.c;
                Throwable th2 = (Throwable) obj;
                StringBuilder sb = new StringBuilder("error in amp timer state=");
                a1e a1eVar = aVar.l;
                sb.append(a1eVar != null ? a1eVar : null);
                sb.append(' ');
                lyd.a.a("ClipsEditorVoiceoverDelegateImpl", new Exception(sb.toString(), th2));
                return s3q0.a;
            case 26:
                com.vk.clips.favorites.impl.ui.folders.content.b bVar2 = (com.vk.clips.favorites.impl.ui.folders.content.b) this.c;
                u2e u2eVar = ((d4e.a.f) obj).a;
                if (epx.f(u2eVar.a, bVar2.f.b())) {
                    bVar2.T(new d.a(u2eVar));
                }
                return s3q0.a;
            case 27:
                ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) this.c;
                int i7 = ClipsFavoriteFoldersListFragment.U;
                ((m3e) clipsFavoriteFoldersListFragment.T.getValue()).setItems((List) obj);
                return s3q0.a;
            case 28:
                return com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b.k((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c, (cce.f) obj);
            default:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) this.c;
                int i8 = ClipsInterestsFragment.Y;
                xn50.a.c(clipsInterestsFragment, new a.b(((vka) obj).b));
                return s3q0.a;
        }
    }
}
