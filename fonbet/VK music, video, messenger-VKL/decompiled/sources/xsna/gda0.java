package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.channels.impl.post_settings.e;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.log.L;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.reefton.ReefEvent;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedCoownersEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.design.view.ReactionView;
import com.vk.stories.design.view.editor.verticalization.VerticalizationPickerView;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.AudioDevice;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.cca0;
import xsna.fh8;
import xsna.ftt;
import xsna.g0e0;
import xsna.isc0;
import xsna.k9d0;
import xsna.klx0;
import xsna.mot0;
import xsna.pnb0;
import xsna.pqc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gda0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gda0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0325  */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long a;
        Owner owner;
        UserId userId;
        boolean z;
        boolean z2;
        gzs<s3q0> gzsVar;
        int i = this.b;
        int i2 = 3;
        Long l = null;
        boolean z3 = true;
        z3 = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kca0) obj2).a.getFeature().C(new cca0.h((qba0) obj));
                return s3q0.a;
            case 1:
                VideoAlbum videoAlbum = (VideoAlbum) obj2;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                mot0.b(mot0.a.a, (Context) obj, videoAlbum.c, videoAlbum.b, null, 24);
                return s3q0.a;
            case 2:
                job0 job0Var = (job0) obj2;
                Poll poll = ((PollAttachment) obj).f;
                job0Var.getClass();
                int i3 = poll.b;
                UserId userId2 = poll.c;
                String str = poll.d;
                List<PollOption> list = poll.f;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (PollOption pollOption : list) {
                    arrayList.add(new PollAnswerDto(pollOption.b, pollOption.c));
                }
                boolean z4 = poll.i;
                boolean Ib = poll.Ib();
                boolean z5 = poll.o;
                long j = poll.k;
                boolean z6 = j > 0;
                if (j > 0) {
                    a = TimeUnit.SECONDS.toMillis(j);
                } else {
                    xuo0.a.getClass();
                    a = xuo0.a() + TimeUnit.HOURS.toMillis(24L);
                }
                job0Var.a.b(new pnb0.a.C3521a(new PostingPollDto(i3, userId2, str, arrayList, z4, Ib, z5, z6, a, true, false, 1024, null)));
                return s3q0.a;
            case 3:
                j1c0 j1c0Var = (j1c0) obj2;
                m1c0 m1c0Var = (m1c0) j1c0Var.C;
                if (m1c0Var != null) {
                    Post post = m1c0Var.h;
                    wxq wxqVar = (wxq) j1c0Var.G.getValue();
                    Long valueOf = Long.valueOf(post.n);
                    Long valueOf2 = Long.valueOf(post.m.b);
                    String str2 = post.L.b;
                    m1c0 m1c0Var2 = (m1c0) j1c0Var.C;
                    if (m1c0Var2 != null && (owner = m1c0Var2.j) != null && (userId = owner.b) != null) {
                        l = Long.valueOf(userId.b);
                    }
                    wxqVar.getClass();
                    UiTracker uiTracker = UiTracker.a;
                    new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, valueOf, valueOf2, null, str2, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedCoownersEvent(MobileOfficialAppsFeedStat$TypeFeedCoownersEvent.EventType.COOWNERS_SETUP_INVITATIONS_BUTTON_CLICK, l), 2)).q();
                    maz.c(xwk.d().e(), j1c0Var.itemView.getContext(), m1c0Var.o, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 4:
                return ChannelMsgSendConfig.a((ChannelMsgSendConfig) obj, ((e.b) ((com.vk.channels.impl.post_settings.e) obj2)).b, false, false, false, false, null, null, null, null, false, false, false, false, null, 32766);
            case 5:
                PostingState.Editing editing = (PostingState.Editing) obj;
                ((qkc0) obj2).d.getClass();
                PostingSettings postingSettings = editing.d;
                PostEditableData postEditableData = editing.i;
                PostingContext postingContext = editing.c;
                boolean z7 = postingContext.c;
                ?? r4 = fkq0.b(postingContext.b.b) && postingSettings.f;
                boolean z8 = postingSettings.m;
                ?? r1 = !(editing.h instanceof PostEditingReason.EditExistingPost) || postEditableData.z;
                ?? r3 = x19.G(postEditableData.i) && postEditableData.A;
                if ((r1 == false && r3 == false) || (!z7 && (r4 == false || !z8))) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 6:
                oqc0 oqc0Var = (oqc0) obj2;
                vcc0 vcc0Var = (vcc0) obj;
                String id = HintId.POSTING_FROM_NEWSFEED_CHANGE_OWNER_ONBOARDING.getId();
                Hint p = pla.e().b().p(id);
                ?? r32 = vcc0Var.b() && p != null && pla.e().b().a(id);
                String str3 = p != null ? p.c : null;
                oqc0Var.T(new pqc0.c(vcc0.a(vcc0Var, null, null, (r32 != true || str3 == null || drm0.N(str3)) ? false : true, str3, r32 != false ? id : null, 7)));
                return s3q0.a;
            case 7:
                isc0.b bVar = (isc0.b) obj2;
                isc0.b.a(bVar, new e550(isc0.this, 13));
                return s3q0.a;
            case 8:
                Object[] objArr = (Object[]) obj;
                boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                it80 it80Var = (it80) objArr[2];
                boolean booleanValue3 = ((Boolean) objArr[3]).booleanValue();
                boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                boolean booleanValue5 = ((Boolean) objArr[5]).booleanValue();
                boolean booleanValue6 = ((Boolean) objArr[6]).booleanValue();
                AudioDevice audioDevice = (AudioDevice) objArr[7];
                ybx0 ybx0Var = (ybx0) objArr[8];
                com.vk.voip.ui.sessionrooms.f fVar = (com.vk.voip.ui.sessionrooms.f) objArr[9];
                klx0.a aVar = (klx0.a) objArr[10];
                ((i9d0) obj2).getClass();
                k9d0.b bVar2 = new k9d0.b(booleanValue2, it80Var.a() ? new k9d0.a.b(booleanValue4, (b69) it80Var.a) : booleanValue4 ? k9d0.a.c.a : k9d0.a.C3171a.a);
                boolean z9 = booleanValue6 || OKVoipEngine.b.getMediaOptionsForCurrentUser().getAudioState() != MediaOptionState.MUTED_PERMANENT;
                k9d0.e eVar = new k9d0.e(z9, booleanValue6);
                if (booleanValue5) {
                    z = false;
                } else {
                    z = false;
                    if (OKVoipEngine.b.getMediaOptionsForCurrentUser().getVideoState() == MediaOptionState.MUTED_PERMANENT) {
                        z2 = false;
                        k9d0.c cVar = new k9d0.c(z2, booleanValue5);
                        boolean z10 = !booleanValue;
                        boolean z11 = (booleanValue3 || booleanValue2) ? z : true;
                        k9d0.d dVar = new k9d0.d(((z11 && z9 && z2) || booleanValue2) ? z : true, booleanValue4, z11);
                        k9d0.f fVar2 = new k9d0.f(audioDevice != AudioDevice.SPEAKER_PHONE ? true : z, (!booleanValue5 || audioDevice == AudioDevice.WIRED_HEADSET || audioDevice == AudioDevice.BLUETOOTH) ? z : true);
                        k9d0.g gVar = new k9d0.g(ybx0Var.a, ybx0Var.b, ybx0Var.c, ybx0Var.d, ybx0Var.e);
                        boolean z12 = fVar.d;
                        return new k9d0(z10, bVar2, cVar, eVar, dVar, fVar2, gVar, !z12, z12, new k9d0.h(aVar.b));
                    }
                }
                z2 = true;
                k9d0.c cVar2 = new k9d0.c(z2, booleanValue5);
                boolean z102 = !booleanValue;
                if (booleanValue3) {
                }
                k9d0.d dVar2 = new k9d0.d(((z11 && z9 && z2) || booleanValue2) ? z : true, booleanValue4, z11);
                k9d0.f fVar22 = new k9d0.f(audioDevice != AudioDevice.SPEAKER_PHONE ? true : z, (!booleanValue5 || audioDevice == AudioDevice.WIRED_HEADSET || audioDevice == AudioDevice.BLUETOOTH) ? z : true);
                k9d0.g gVar2 = new k9d0.g(ybx0Var.a, ybx0Var.b, ybx0Var.c, ybx0Var.d, ybx0Var.e);
                boolean z122 = fVar.d;
                return new k9d0(z102, bVar2, cVar2, eVar, dVar2, fVar22, gVar2, !z122, z122, new k9d0.h(aVar.b));
            case 9:
                c0e0 c0e0Var = (c0e0) obj2;
                int i4 = c0e0.m1;
                if (!(((g0e0) obj) instanceof g0e0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0e0Var.Qn(true);
                c0e0Var.hide();
                c0e0Var.i1 = true;
                return s3q0.a;
            case 10:
                com.vk.reefton.trackers.e eVar2 = (com.vk.reefton.trackers.e) obj2;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.i) {
                    ReefEvent.i iVar = (ReefEvent.i) reefEvent;
                    ArrayList<pnf0> arrayList2 = eVar2.c;
                    if (arrayList2.size() >= eVar2.b) {
                        arrayList2.remove(0);
                    }
                    arrayList2.add(iVar.b);
                }
                return s3q0.a;
            case 11:
                ((lq40) ((x8c) obj2).b).F((List) obj);
                return s3q0.a;
            case 12:
                ((tdu) obj).n(((Number) ((c1h) obj2).q.getValue()).floatValue());
                return s3q0.a;
            case 13:
                ((wzs) obj2).invoke((String) obj, SearchInputMethod.Keyboard);
                return s3q0.a;
            case 14:
                ftt.b bVar3 = (ftt.b) obj2;
                return new z6i0(bVar3.a, bVar3.b, bVar3.c, false);
            case 15:
                bei0 bei0Var = (bei0) obj2;
                tny tnyVar = (tny) obj;
                zhf0 zhf0Var = (zhf0) bei0Var.k.getValue();
                if (zhf0Var == null) {
                    return null;
                }
                tny tnyVar2 = bei0Var.m;
                if (tnyVar2 != null) {
                    return gcd0.A(zhf0Var, tnyVar2, tnyVar);
                }
                xzw.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 16:
                clj0 clj0Var = (clj0) obj2;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                if (whr0Var != null) {
                    clj0Var.e.invoke(new fh8.e(clj0.d(whr0Var)));
                }
                return s3q0.a;
            case 17:
                ((enj0) obj2).b.a(djq0.b);
                return s3q0.a;
            case 18:
                ybk0 ybk0Var = (ybk0) obj2;
                if (((gmq) obj).equals(ybk0Var.C)) {
                    ybk0Var.c7();
                }
                return s3q0.a;
            case 19:
                L.i((Throwable) obj);
                kam0 kam0Var = ((l9m0) obj2).d;
                if (kam0Var != null && (gzsVar = kam0Var.c) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 20:
                yam0 yam0Var = (yam0) obj2;
                List list2 = (List) obj;
                List<vze0> list3 = list2;
                for (vze0 vze0Var : list3) {
                    if (vze0Var.a) {
                        yam0Var.d = vze0Var.b;
                        xam0 xam0Var = yam0Var.b;
                        xam0Var.i.submitList(list2);
                        ReactionView reactionView = xam0Var.h;
                        for (vze0 vze0Var2 : list3) {
                            if (vze0Var2.a) {
                                reactionView.setReaction(vze0Var2.b);
                                reactionView.postInvalidate();
                                return s3q0.a;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                UserId userId3 = (UserId) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 4) {
                            i2 = 0;
                        }
                    }
                    i0q0.j(new xw2(userId3, i2, z3 ? 1 : 0));
                    return s3q0.a;
                }
                i2 = 1;
                i0q0.j(new xw2(userId3, i2, z3 ? 1 : 0));
                return s3q0.a;
            case 22:
                s5n0 s5n0Var = (s5n0) obj2;
                g4l0 g4l0Var = (g4l0) obj;
                if ((g4l0Var instanceof s1l0) || (g4l0Var instanceof q1l0)) {
                    StickerStockItem H = s5n0Var.b.H(s5n0Var.d);
                    if (H == null) {
                        return s3q0.a;
                    }
                    s5n0Var.c.d(H.b);
                    s5n0Var.i.p(false);
                }
                return s3q0.a;
            case 23:
                ((etv0) obj).b(false);
                ((j58) obj2).performLongClick();
                return s3q0.a;
            case 24:
                ((kfp0) obj2).a();
                return CodecFeeder.FeedStatus.CONTINUE;
            case 25:
                int intValue2 = ((Integer) obj).intValue();
                VerticalizationPickerView.a aVar2 = ((VerticalizationPickerView) obj2).y;
                if (aVar2 != null) {
                    aVar2.c(intValue2);
                }
                return s3q0.a;
            case 26:
                ((pd) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 27:
                String str4 = (String) ((com.vk.video.ui.discovery.catalog.c) obj2).f.invoke();
                List list4 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((czs0) it.next()).a);
                }
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = new VideoDiscoveryCatalogRepository$Section("__discovery_catalog_local_offline_section_id__", str4, (String) null, com.vk.dto.video.a.a(arrayList3), false, (String) null, (List) null, PsExtractor.VIDEO_STREAM_MASK);
                return new sfs0(videoDiscoveryCatalogRepository$Section, Collections.singletonList(videoDiscoveryCatalogRepository$Section));
            case 28:
                ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj2).e.invoke((c.s0.e) obj);
                return s3q0.a;
            default:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C(c.b.b);
                return s3q0.a;
        }
    }

    public /* synthetic */ gda0(pd pdVar, abs0 abs0Var, Context context) {
        this.b = 26;
        this.c = pdVar;
    }

    public /* synthetic */ gda0(kwm0 kwm0Var, UserId userId) {
        this.b = 21;
        this.c = userId;
    }
}
