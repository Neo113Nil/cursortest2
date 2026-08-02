package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.music.Artist;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.bottomsheet.about.delegate.d;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.voip.ui.call_effects.beauty.ui.BeautySettingsFragment;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vk.webapp.fragments.AccountFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.b4;
import xsna.c5v0;
import xsna.cce;
import xsna.cpc;
import xsna.cwb0;
import xsna.di8;
import xsna.ew6;
import xsna.gm50;
import xsna.ozj;
import xsna.pt2;
import xsna.rd8;
import xsna.t5e;
import xsna.tj50;
import xsna.tlo0;
import xsna.u0j;
import xsna.y6d;
import xsna.z7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, xsna.t0j, xsna.wx3] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.vk.dto.common.Attachment] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        StoryEntry storyEntry;
        com.vk.media.ok.b bVar;
        int i = this.b;
        int i2 = 14;
        int i3 = 2;
        int i4 = 10;
        int i5 = 8;
        int i6 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((d.a) obj3).l.d(new b4.f0(MobileOfficialAppsSharingStat$TypeEventSource.BUTTON));
                return s3q0.a;
            case 1:
                x.b bVar2 = (x.b) obj3;
                View findViewById = ((djt0) obj).findViewById(R.id.video_swipe_remove_button);
                if (findViewById != null) {
                    bwt0.i0(findViewById, new r9(bVar2, i6));
                }
                return s3q0.a;
            case 2:
                int i7 = AccountFragment.a0;
                Bundle arguments = ((AccountFragment) obj3).getArguments();
                if (arguments != null) {
                    return (VkAuthCredentials) arguments.getParcelable("authCredentials");
                }
                return null;
            case 3:
                pt2.a aVar = ((st2) obj3).A;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 4:
                ?? r9 = (ArtistBiographyVh) obj3;
                uq3 uq3Var = (uq3) obj;
                UIBlockArtistBio uIBlockArtistBio = r9.j;
                if (uIBlockArtistBio != null) {
                    Artist artist = uIBlockArtistBio.y;
                    if (epx.f(artist.b, uq3Var.a.b)) {
                        artist.i = uq3Var.b;
                        r9.N6(uIBlockArtistBio);
                    }
                }
                return s3q0.a;
            case 5:
                AttachVideoFragment.b bVar3 = (AttachVideoFragment.b) obj3;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = bVar3.y;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                bVar3.y = cVar;
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((zu90) obj).S() == ((ju90) ((Attachment) obj3)).S());
            case 7:
                wa6 wa6Var = (wa6) obj3;
                String str = (String) obj;
                Object obj4 = wa6Var.o;
                ((p0c) (obj4 != null ? obj4 : null)).h();
                wa6Var.Q.a(str, false);
                return s3q0.a;
            case 8:
                BeautySettingsFragment beautySettingsFragment = (BeautySettingsFragment) obj3;
                int i8 = BeautySettingsFragment.Q;
                if (epx.f((ew6) obj, ew6.a.a)) {
                    beautySettingsFragment.tn();
                }
                return s3q0.a;
            case 9:
                pd8 pd8Var = (pd8) obj3;
                pd8Var.getClass();
                pd8Var.b(rd8.d.a);
                return s3q0.a;
            case 10:
                bi8 bi8Var = (bi8) obj3;
                bzb0 bzb0Var = bi8Var.i;
                di8 di8Var = bi8Var.k;
                di8.a aVar2 = di8Var instanceof di8.a ? (di8.a) di8Var : null;
                ?? r6 = (aVar2 == null || !aVar2.c) ? 0 : 1;
                bzb0.d(bzb0Var, new cwb0.a1(r6 != 0 ? R.string.voip_broadcast_record_finish_submit_dialog_title : R.string.voip_broadcast_stream_finish_submit_dialog_title, null, r6 != 0 ? R.string.voip_broadcast_record_finish_submit_description : R.string.voip_broadcast_finish_submit_description, null, R.string.voip_broadcast_finish_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new j1(bi8Var, i2), null, null, 28);
                return s3q0.a;
            case 11:
                cb9 cb9Var = (cb9) obj3;
                FragmentManager fragmentManager = cb9Var.b;
                if (fragmentManager != null) {
                    fragmentManager.r0(cb9Var.c);
                }
                return Boolean.valueOf(r6m.i());
            case 12:
                return new hv9((ViewGroup) obj, ((jv9) obj3).l);
            case 13:
                hda hdaVar = (hda) obj;
                List a = jda.a(((g3a) obj3).d, hdaVar.a, hdaVar.b, false, false, 12);
                Iterator it = a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((UIBlock) obj2) instanceof UIBlockCatalog) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UIBlockCatalog uIBlockCatalog = obj2 instanceof UIBlockCatalog ? (UIBlockCatalog) obj2 : null;
                if (uIBlockCatalog == null) {
                    if (BuildInfo.h()) {
                        throw new NoSuchElementException(go9.c("Can't find UIBlockCatalog from blocks: ", a));
                    }
                    Serializer.c<UIBlockList> cVar3 = UIBlockList.CREATOR;
                    UIBlockList a2 = UIBlockList.a.a();
                    UIBlockList a3 = UIBlockList.a.a();
                    EmptyList emptyList = EmptyList.b;
                    uIBlockCatalog = new UIBlockCatalog(a2, a3, emptyList, null, "", null, null, false, emptyList, PsExtractor.AUDIO_STREAM, null);
                }
                return new Pair(hdaVar, uIBlockCatalog);
            case 14:
                ((s7b) obj3).j.b(z7b.b.a);
                L.i((Throwable) obj);
                return s3q0.a;
            case 15:
                ubb ubbVar = (ubb) obj3;
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null && (storyEntry = zjm0Var.g) != null) {
                    i0q0.j(new ja3(i3, ubbVar, storyEntry));
                }
                return s3q0.a;
            case 16:
                ((krb) obj3).n.onNext((mrb) obj);
                return s3q0.a;
            case 17:
                ((ftb) obj3).e.s0((Throwable) obj);
                return s3q0.a;
            case 18:
                qpc qpcVar = (qpc) obj3;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new we0(qpcVar, 15), f9t.z(qpcVar), new oj(7));
                l370.m(g47Var, f9t.w(qpcVar));
                g47Var.d(new cpc.a(qpcVar));
                return s3q0.a;
            case 19:
                o1d o1dVar = (o1d) obj3;
                gm50.a.a(o1dVar, ((y6d.c) obj).a, new n40(o1dVar, 21));
                return s3q0.a;
            case 20:
                jpd jpdVar = (jpd) obj3;
                ClipVideoItem clipVideoItem = (ClipVideoItem) obj;
                int i9 = (int) (clipVideoItem.c / clipVideoItem.h);
                jpdVar.G += i9;
                jpdVar.q.add(clipVideoItem);
                jpdVar.z.d += i9;
                vm9 vm9Var = jpdVar.d;
                long j = jpdVar.G;
                zd9 camera1View = ((com.vk.cameraui.impl.a) vm9Var.c).b.getCamera1View();
                if (camera1View != null && (bVar = ((mo9) camera1View.getCameraPreview()).g.B) != null) {
                    bVar.H.applyRecordingTime(j);
                }
                jpdVar.b.W0();
                if (jpdVar.r) {
                    jpdVar.o();
                } else {
                    jpdVar.z();
                }
                jpdVar.s(true);
                jpdVar.C = false;
                jpdVar.B();
                return s3q0.a;
            case 21:
                return new w2e((ViewGroup) obj, ((v2e) obj3).j);
            case 22:
                ((h5e) obj3).b.d(t5e.k.a, null);
                return s3q0.a;
            case 23:
                return com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b.n((com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) obj3, (cce.d) obj);
            case 24:
                ((com.vk.clips.playlists.ui.picker.b) obj3).T(new c.b.C0634c((xpe) obj));
                return s3q0.a;
            case 25:
                com.vk.profile.community.impl.ui.events.e eVar = (com.vk.profile.community.impl.ui.events.e) obj3;
                awg0 awg0Var = (awg0) obj;
                sj50 sj50Var = eVar.b;
                CommunityEventsState.Content content = ((CommunityEventsState) sj50Var.getCurrentState()).c;
                CommunityEventsState.Content.Items items = content instanceof CommunityEventsState.Content.Items ? (CommunityEventsState.Content.Items) content : null;
                if (items == null) {
                    return null;
                }
                return awg0Var.g(com.vk.profile.community.impl.ui.events.f.a((com.vk.profile.community.impl.ui.events.f) eVar.c.getValue(), ((CommunityEventsState) sj50Var.getCurrentState()).b, items.a.size(), 4), new ew(eVar, i2), new om1(eVar, i4));
            case 26:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj3;
                if (((Boolean) obj).booleanValue()) {
                    jzg jzgVar = fVar.b.f.i;
                    Context context = fVar.k.getContext();
                    izg izgVar = new izg(new defpackage.u(i5, jzgVar, context), jzgVar.d);
                    c5v0 c5v0Var = new c5v0(context);
                    c5v0Var.setTop(new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_finish_flag_120h), null, new Size(iah0.a(PsExtractor.AUDIO_STREAM), iah0.a(120)), 8));
                    c5v0Var.setMain(new c5v0.b(12, tq.h(tlo0.Companion, R.string.community_created_card_title), new tlo0.f(R.string.community_created_card_description)));
                    int i10 = 27;
                    c5v0Var.setButtons(new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.community_created_card_invite_friends), new c5f(izgVar, i3), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), new c5v0.a.C2643a(new tlo0.f(R.string.community_created_card_open_community), new yh(izgVar, i10), null, VkButton.Mode.Link, null, false, 444), true));
                    c5v0Var.setWithPaddings(false);
                    f4m.y(iah0.a(24), c5v0Var);
                    izgVar.c = new VkModal(VkModal.Mode.Card, new b.a.C0790b(null, null, c5v0Var, null, 59), new ic(izgVar, i10), false, 20).b(context, "CommunityCreatedModalCard");
                }
                return s3q0.a;
            case 27:
                i1j i1jVar = (i1j) obj3;
                pvi0 pvi0Var = (pvi0) obj;
                ?? r2 = (t0j) i1jVar.n.getValue();
                r2.getClass();
                boolean z = pvi0Var.b;
                boolean z2 = pvi0Var.b;
                List<SessionRoomParticipantModel> list = pvi0Var.c;
                List<SessionRoomParticipantModel> list2 = pvi0Var.d;
                ArrayList arrayList = new ArrayList();
                if (!list.isEmpty() || !z) {
                    arrayList.add(new u0j(u0j.a.ROOM_PARTICIPANTS_INDICATOR, list.size()));
                }
                if (list.isEmpty()) {
                    arrayList.add(new w0j(z));
                } else {
                    List<SessionRoomParticipantModel> list3 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new x0j(pvi0Var.a, z2, (SessionRoomParticipantModel) it2.next()));
                    }
                    arrayList.addAll(arrayList2);
                }
                if (!list2.isEmpty()) {
                    arrayList.add(new u0j(u0j.a.CALL_PARTICIPANTS_INDICATOR, list2.size()));
                    List<SessionRoomParticipantModel> list4 = list2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new x0j(SessionRoomId.MainCall.INSTANCE, z2, (SessionRoomParticipantModel) it3.next()));
                    }
                    arrayList.addAll(arrayList3);
                }
                r2.setItems(arrayList);
                ((View) i1jVar.o.getValue()).setEnabled(pvi0Var.e);
                return s3q0.a;
            default:
                nzj nzjVar = (nzj) obj3;
                tj50.a aVar3 = (tj50.a) obj;
                z8f z8fVar = new z8f(nzjVar, i5);
                ao8 ao8Var = ao8.d;
                return new ozj.c(aVar3.a(z8fVar, ao8Var), aVar3.a(new f1j(nzjVar, r6 ? 1 : 0), ao8Var));
        }
    }
}
