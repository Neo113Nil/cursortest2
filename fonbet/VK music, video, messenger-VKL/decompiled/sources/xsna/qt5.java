package xsna;

import android.content.Context;
import android.content.Intent;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.api.ChannelFilter;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.PollFilterParams;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.tags.Tag;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.internal.longpoll.polling_tasks.socket.ChannelMasterServiceReporter;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.views.PollFilterBottomView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import xsna.c5v0;
import xsna.h8w;
import xsna.hfr;
import xsna.i3o;
import xsna.k840;
import xsna.l310;
import xsna.o410;
import xsna.oap;
import xsna.q2o;
import xsna.qvq;
import xsna.t1r;
import xsna.tlo0;
import xsna.ubg;
import xsna.us2;
import xsna.vyh;
import xsna.wk50;
import xsna.wy30;
import xsna.xjs;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qt5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qt5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c6, code lost:
    
        if (r2.Qb(r8) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e5, code lost:
    
        if (r2.Qb(r8) == false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v164, types: [xsna.kj50] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xsna.xnw0] */
    /* JADX WARN: Type inference failed for: r8v37, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object next;
        Object next2;
        Object next3;
        LinkedHashMap linkedHashMap;
        Map<Long, bdb> map;
        ArrayList arrayList;
        Boolean bool;
        bdb bdbVar;
        q2o.a aVar;
        ChannelMasterServiceReporter.ErrorSource errorSource;
        bdb bdbVar2;
        q2o.a aVar2;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar;
        ArrayList<UIBlock> Sb;
        boolean z;
        int i = this.b;
        int i2 = 12;
        boolean z2 = true;
        int i3 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i4 = rt5.r1;
                maz.c((maz) obj3, ((rt5) obj2).requireContext(), (String) obj, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 1:
                rp80 rp80Var = (rp80) obj3;
                f69 f69Var = (f69) obj2;
                if (((FragmentManager) obj).H("VoipEnableOwnMicAndVideoRequestedDialog") == null) {
                    boolean z3 = rp80Var.a;
                    final VoipEnableOwnMicAndVideoRequestedDialog voipEnableOwnMicAndVideoRequestedDialog = new VoipEnableOwnMicAndVideoRequestedDialog(z3, new zx0(f69Var, i2));
                    Context context = f69Var.a;
                    if (voipEnableOwnMicAndVideoRequestedDialog.c != null) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.i, new Object[]{"ModalBottomSheet is already shown!"});
                        }
                    } else {
                        VkModal.Mode mode = VkModal.Mode.Card;
                        gko gkoVar = new gko(z3 ? R.drawable.vk_icon_microphone_alt_28 : R.drawable.vk_icon_microphone_videocam_outline_28);
                        z7g z7gVar = new z7g(R.color.vk_sky_300);
                        int i5 = VoipEnableOwnMicAndVideoRequestedDialog.e;
                        final dw20 b = new VkModal(mode, new b.a.C0790b(new c5v0.c.b(gkoVar, z7gVar, new Size(i5, i5), 8), new c5v0.b(14, tq.h(tlo0.Companion, z3 ? R.string.voip_enable_own_mic_requested_dialog_title : R.string.voip_enable_own_mic_and_video_requested_dialog_title), null), null, new c5v0.a(z3 ? new c5v0.a.C2643a(new tlo0.f(R.string.voip_enable_own_mic_requested_dialog_mic_button), new fem0(voipEnableOwnMicAndVideoRequestedDialog, 17), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED) : new c5v0.a.C2643a(new tlo0.f(R.string.voip_enable_own_mic_and_video_requested_dialog_mic_and_video_button), new sgt0(voipEnableOwnMicAndVideoRequestedDialog, 9), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), z3 ? null : new c5v0.a.C2643a(new tlo0.f(R.string.voip_enable_own_mic_and_video_requested_dialog_mic_button), new mll0(voipEnableOwnMicAndVideoRequestedDialog, 21), null, VkButton.Mode.Secondary, null, false, 444), 4), 52), new rqs0(voipEnableOwnMicAndVideoRequestedDialog, 8), false, 20).b(context, "VoipEnableOwnMicAndVideoRequestedDialog");
                        voipEnableOwnMicAndVideoRequestedDialog.c = b;
                        String string = context.getString(z3 ? R.string.voip_enable_own_mic_requested_dialog_title : R.string.voip_enable_own_mic_and_video_requested_dialog_title);
                        com.vk.voip.ui.c.b.getClass();
                        AccessibilityEvents F = com.vk.voip.ui.c.F();
                        F.getClass();
                        F.d(new yk(0, F, string));
                        ?? r2 = new ys10() { // from class: xsna.xnw0
                            @Override // xsna.ys10
                            public final void a(MuteEvent muteEvent, boolean z4) {
                                MediaOptionState mediaOptionState = muteEvent.getChangedMediaOptionsState().get(MediaOption.AUDIO);
                                MediaOptionState mediaOptionState2 = muteEvent.getChangedMediaOptionsState().get(MediaOption.VIDEO);
                                MediaOptionState mediaOptionState3 = MediaOptionState.MUTED_PERMANENT;
                                boolean z5 = mediaOptionState == mediaOptionState3;
                                boolean z6 = mediaOptionState2 == mediaOptionState3;
                                boolean z7 = VoipEnableOwnMicAndVideoRequestedDialog.this.a;
                                dw20 dw20Var = b;
                                if (z7) {
                                    if (z5) {
                                        dw20Var.dismiss();
                                    }
                                } else if (z5 || z6) {
                                    dw20Var.dismiss();
                                }
                            }
                        };
                        OKVoipEngine.b.getClass();
                        OKVoipEngine.k.o.a.add(r2);
                        voipEnableOwnMicAndVideoRequestedDialog.d = r2;
                    }
                }
                return s3q0.a;
            case 2:
                ChannelsInfoMergeTask channelsInfoMergeTask = (ChannelsInfoMergeTask) obj3;
                final w2w w2wVar = (w2w) obj2;
                Boolean bool2 = channelsInfoMergeTask.f;
                Collection<eeb> collection = channelsInfoMergeTask.c;
                Collection<eeb> collection2 = collection;
                ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((eeb) it.next()).a.a));
                }
                Map<Long, bdb> d = w2wVar.I0().a().d(arrayList2);
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    eeb eebVar = (eeb) it2.next();
                    yta ytaVar = eebVar.a;
                    Msg msg = eebVar.b;
                    vcb vcbVar = ytaVar.d;
                    String str = ytaVar.b;
                    String str2 = ytaVar.c;
                    final long j = ytaVar.a;
                    q2o q2oVar = ytaVar.n;
                    mzq0 mzq0Var = ytaVar.e;
                    Boolean bool3 = mzq0Var.g;
                    ChannelNotificationsSettings channelNotificationsSettings = mzq0Var.a;
                    m7f0 m7f0Var = mzq0Var.b;
                    final Long l2 = ytaVar.h;
                    xgl0 I0 = w2wVar.I0();
                    Iterator it3 = it2;
                    int r = ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j();
                    Collection<eeb> collection3 = collection;
                    linkedHashMap2.put(Long.valueOf(j), Integer.valueOf(r));
                    bdb bdbVar3 = d.get(Long.valueOf(j));
                    if (bdbVar3 == null) {
                        ChannelsInfoMergeTask.q(w2wVar, ytaVar);
                        long j2 = ytaVar.a;
                        int i6 = msg != null ? msg.d : 0;
                        int i7 = m7f0Var.a;
                        int i8 = m7f0Var.b;
                        int i9 = ytaVar.i;
                        aeb a = deb.a(eebVar, w2wVar.getExperiments().n());
                        boolean z4 = mzq0Var.c;
                        boolean z5 = mzq0Var.d;
                        boolean z6 = mzq0Var.e;
                        ChannelActionInProgress channelActionInProgress = ChannelActionInProgress.NONE;
                        ChannelType.a aVar3 = ChannelType.Companion;
                        String str3 = ytaVar.f;
                        aVar3.getClass();
                        bdbVar = new bdb(j2, i6, i7, 0, i8, 0, i9, vcbVar, null, a, z4, z5, bool2 != null ? bool2.booleanValue() : false, z6, channelNotificationsSettings, null, r, 0, channelActionInProgress, null, ChannelType.a.a(str3), ytaVar.g, mzq0Var.f, ytaVar.j, ytaVar.k, ytaVar.l, str2, str, bool3, mzq0Var.h, ytaVar.m, mzq0Var.i, mzq0Var.j, q2oVar != null ? q2oVar.b : false, (q2oVar == null || (aVar2 = q2oVar.c) == null) ? 0 : aVar2.a);
                        bool = bool2;
                        linkedHashMap = linkedHashMap2;
                        map = d;
                        arrayList = arrayList3;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        map = d;
                        int i10 = bdbVar3.r;
                        arrayList = arrayList3;
                        boolean z7 = bdbVar3.n;
                        boolean q = w2wVar.getExperiments().q();
                        Long f = w2wVar.I0().system().f(j);
                        if (z7 || epx.f(bool2, Boolean.TRUE) || i10 < r || l2 == null || !q || f == null || l2.longValue() >= f.longValue()) {
                            if (i10 < r) {
                                ChannelsInfoMergeTask.q(w2wVar, ytaVar);
                            }
                            int i11 = eebVar.a.e.b.a;
                            int i12 = bdbVar3.d;
                            boolean z8 = i11 >= i12;
                            if (msg == null) {
                                z8 = true;
                            }
                            int i13 = bdbVar3.e;
                            int i14 = z8 ? m7f0Var.a : i13;
                            Integer num = channelsInfoMergeTask.d;
                            boolean z9 = i11 >= i12;
                            if (msg == null) {
                                z9 = true;
                            }
                            int i15 = bdbVar3.f;
                            if (z9) {
                                i15 = m7f0Var.b;
                            } else if (num != null && i13 < num.intValue()) {
                                i15--;
                            }
                            bool = bool2;
                            bdbVar = new bdb(ytaVar.a, msg != null ? msg.d : 0, m7f0Var.a, i14, m7f0Var.b, i15, ytaVar.i, vcbVar, null, deb.a(eebVar, w2wVar.getExperiments().n()), mzq0Var.c, mzq0Var.d, bool != null ? bool.booleanValue() : z7, mzq0Var.e, channelNotificationsSettings, bdbVar3.q, r, bdbVar3.s, bdbVar3.t, bdbVar3.u, bdbVar3.v, bdbVar3.w, mzq0Var.f, ytaVar.j, ytaVar.k, ytaVar.l, str2, str, bool3, mzq0Var.h, ytaVar.m, mzq0Var.i, mzq0Var.j, q2oVar != null ? q2oVar.b : false, (q2oVar == null || (aVar = q2oVar.c) == null) ? 0 : aVar.a);
                        } else {
                            int i16 = ChannelsInfoMergeTask.a.$EnumSwitchMapping$0[channelsInfoMergeTask.g.ordinal()];
                            if (i16 == 1) {
                                errorSource = ChannelMasterServiceReporter.ErrorSource.WEBSOCKET;
                            } else {
                                if (i16 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                errorSource = ChannelMasterServiceReporter.ErrorSource.API;
                            }
                            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.CHANNEL_UPDATE_OUTDATED, errorSource);
                            L.d(new gzs() { // from class: xsna.xfb
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    StringBuilder sb = new StringBuilder("Channel ");
                                    long j3 = j;
                                    sb.append(j3);
                                    sb.append(" update declined with version ");
                                    sb.append(l2);
                                    sb.append(", cached version ");
                                    sb.append(w2wVar.I0().system().f(j3));
                                    return sb.toString();
                                }
                            });
                            bool = bool2;
                            bdbVar2 = null;
                            ArrayList arrayList4 = arrayList;
                            if (bdbVar2 == null) {
                                arrayList4.add(bdbVar2);
                            }
                            it2 = it3;
                            arrayList3 = arrayList4;
                            collection = collection3;
                            d = map;
                            linkedHashMap2 = linkedHashMap;
                            bool2 = bool;
                        }
                    }
                    bdbVar2 = bdbVar;
                    ArrayList arrayList42 = arrayList;
                    if (bdbVar2 == null) {
                    }
                    it2 = it3;
                    arrayList3 = arrayList42;
                    collection = collection3;
                    d = map;
                    linkedHashMap2 = linkedHashMap;
                    bool2 = bool;
                }
                ArrayList arrayList5 = arrayList3;
                w2wVar.I0().a().a(arrayList5);
                new h8w(new h8w.a.C2980a(collection, linkedHashMap2)).o(w2wVar);
                if (channelsInfoMergeTask.e) {
                    jhb jhbVar = new jhb(w2wVar);
                    hfr.a aVar4 = new hfr.a(rli0.j(new i5g(arrayList5), new c2(9)));
                    if (aVar4.hasNext()) {
                        next = aVar4.next();
                        if (aVar4.hasNext()) {
                            vcb vcbVar2 = ((bdb) next).i;
                            do {
                                Object next4 = aVar4.next();
                                vcb vcbVar3 = ((bdb) next4).i;
                                vcbVar2.getClass();
                                if (vcbVar2.compareTo(vcbVar3) > 0) {
                                    next = next4;
                                    vcbVar2 = vcbVar3;
                                }
                            } while (aVar4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    bdb bdbVar4 = (bdb) next;
                    if (bdbVar4 != null) {
                        jhbVar.a(bdbVar4);
                    }
                    hfr.a aVar5 = new hfr.a(rli0.j(new i5g(arrayList5), new wq3(9)));
                    if (aVar5.hasNext()) {
                        next2 = aVar5.next();
                        if (aVar5.hasNext()) {
                            vcb vcbVar4 = ((bdb) next2).i;
                            do {
                                Object next5 = aVar5.next();
                                vcb vcbVar5 = ((bdb) next5).i;
                                vcbVar4.getClass();
                                if (vcbVar4.compareTo(vcbVar5) > 0) {
                                    next2 = next5;
                                    vcbVar4 = vcbVar5;
                                }
                            } while (aVar5.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    bdb bdbVar5 = (bdb) next2;
                    if (bdbVar5 != null) {
                        jhbVar.a(bdbVar5);
                    }
                    hfr.a aVar6 = new hfr.a(rli0.j(new i5g(arrayList5), new y40(10)));
                    if (aVar6.hasNext()) {
                        next3 = aVar6.next();
                        if (aVar6.hasNext()) {
                            vcb vcbVar6 = ((bdb) next3).i;
                            do {
                                Object next6 = aVar6.next();
                                vcb vcbVar7 = ((bdb) next6).i;
                                vcbVar6.getClass();
                                if (vcbVar6.compareTo(vcbVar7) > 0) {
                                    next3 = next6;
                                    vcbVar6 = vcbVar7;
                                }
                            } while (aVar6.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    bdb bdbVar6 = (bdb) next3;
                    if (bdbVar6 != null) {
                        jhbVar.a.I0().u(new ihb(ChannelFilter.SUGGESTED, bdbVar6, jhbVar, 0));
                    }
                }
                return arrayList5;
            case 3:
                jdo jdoVar = (jdo) obj3;
                atd atdVar = (atd) obj2;
                ClipsDraftPersistentStore clipsDraftPersistentStore = (ClipsDraftPersistentStore) obj;
                clipsDraftPersistentStore.getClass();
                ClipsDraftVk j3 = ClipsDraftPersistentStore.j();
                if (j3 != null && epx.f(j3.b.b, jdoVar.a)) {
                    atdVar.d.q(false);
                }
                ClipsDraftPersistentStore.r(clipsDraftPersistentStore, jdoVar.a, 6);
                ClipsDraftPersistentStore.s();
                atdVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                i50 i50Var = new i50(atdVar, i2);
                clipsDraftPersistentStore2.getClass();
                ClipsDraftPersistentStore.o(i50Var);
                return s3q0.a;
            case 4:
                izs izsVar = (izs) obj3;
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) obj2;
                if (((Boolean) obj).booleanValue()) {
                    izsVar.invoke(ClipsGridHeaderEntry.Author.a(author, !author.d));
                } else {
                    izsVar.invoke(author);
                }
                return s3q0.a;
            case 5:
                ubg.a aVar7 = (ubg.a) obj2;
                xbg xbgVar = ((ubg) obj3).r;
                if (xbgVar != null) {
                    aVar7.e(xbgVar.b);
                }
                return s3q0.a;
            case 6:
                s6h s6hVar = (s6h) obj3;
                oap.a aVar8 = (oap.a) obj2;
                l0y l0yVar = (l0y) obj;
                if (l0yVar != k0y.v && l0yVar.a) {
                    s6hVar.f(aVar8, true, null);
                }
                return s3q0.a;
            case 7:
                ((wk50.a) obj3).b(new e.q(false));
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) obj2).b.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 8:
                izs izsVar2 = (izs) obj2;
                int intValue = ((Integer) obj).intValue();
                us2.d dVar = (us2.d) j5g.a0(((us2) obj3).c(intValue, intValue, "clickable_tag"));
                if (dVar != null && epx.f(dVar.a, "reset_to_default")) {
                    izsVar2.invoke(i3o.e.b);
                }
                return s3q0.a;
            case 9:
                t1r.g((wk50.a) obj3, (qvq.i) obj2, (qih0) obj, true);
                return s3q0.a;
            case 10:
                ((xjs.a) obj3).m.invoke((RequestUserProfile) obj2);
                return s3q0.a;
            case 11:
                nbv nbvVar = (nbv) obj3;
                View view = (View) obj2;
                ((fhc0) nbvVar.f.getValue()).a().a(PostingMetricsCreationEntryPoint.FeedPlus);
                jbc0 jbc0Var = (jbc0) nbvVar.e.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ggc0 ggc0Var = nbvVar.c;
                if (ggc0Var != null) {
                    ggc0Var.b(PostingCreationEntryPoint.FeedPlus, new m84(13, view, nbvVar));
                }
                return s3q0.a;
            case 12:
                return ((izs) obj3).invoke((f0w) obj2);
            case 13:
                w410 w410Var = (w410) obj3;
                o410.a aVar9 = (o410.a) obj2;
                u60 u60Var = (u60) obj;
                if (u60Var instanceof ReplyAction) {
                    int ordinal = ((ReplyAction) u60Var).ordinal();
                    int i17 = aVar9.a;
                    int i18 = aVar9.b;
                    UserId userId = aVar9.c;
                    long j4 = aVar9.d;
                    MarketItemReviewsFragment.c cVar = w410Var.f;
                    if (ordinal == ReplyAction.REPLY_ACTION_REPLY.ordinal()) {
                        cVar.invoke(new l310.q.k.c(i17, i18, j4, userId));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_COPY_TEXT.ordinal()) {
                        cVar.invoke(new l310.q.k.a(i17, i18));
                    } else if (ordinal == ReplyAction.REPLY_ACTION_DELETE.ordinal()) {
                        cVar.invoke(new l310.q.k.b(i17, i18, j4));
                    }
                }
                return s3q0.a;
            case 14:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj3;
                Photo photo = (Photo) obj2;
                List list = (List) obj;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = fVar.t;
                if (eVar != null && (hVar = eVar.l) != null) {
                    List<Tag> list2 = list;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                    for (Tag tag : list2) {
                        fVar.r.getClass();
                        arrayList6.add(i0o0.a(tag));
                    }
                    hVar.c(photo, arrayList6, com.vk.newsfeed.posting.market_picker.presentation.base.view.f.g(photo));
                }
                return s3q0.a;
            case 15:
                Msg msg2 = (Msg) obj2;
                wy30.a aVar10 = (wy30.a) obj;
                aVar10.u = (String) obj3;
                wy30 wy30Var = wy30.a;
                wy30.m(msg2.c, msg2.b, aVar10, wy30.c);
                return s3q0.a;
            case 16:
                ((ArrayList) ((s140) obj3).c).add((Pair) obj2);
                return s3q0.a;
            case 17:
                m840 m840Var = (m840) obj2;
                lb50 lb50Var = new lb50(R.string.music_player_snack_bar_common_error, (MusicTrack) obj3);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(lb50Var);
                m840Var.d.b(MusicHapticEvent.ERROR);
                return s3q0.a;
            case 18:
                MusicTrack musicTrack = (MusicTrack) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (((nk40) obj3).c(uIBlockList) && ((Sb = uIBlockList.Sb()) == null || !Sb.isEmpty())) {
                    for (UIBlock uIBlock : Sb) {
                        if (uIBlock instanceof UIBlockMusicTrack) {
                            UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                            if (!epx.f(uIBlockMusicTrack.Rb().Fb(), musicTrack.Fb())) {
                                break;
                            }
                            z = true;
                        } else {
                            if (uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack) {
                                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                                if (!epx.f(uIBlockSearchHistoryTrack.Rb().Fb(), musicTrack.Fb())) {
                                    break;
                                }
                                z = true;
                            }
                            z = false;
                        }
                        if (z) {
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 19:
                ((fq60) obj3).d((Context) obj2, new yo60.g.c(R.string.error));
                return s3q0.a;
            case 20:
                c.a aVar11 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                return s3q0.a;
            case 21:
                ((com.vk.attachpicker.stat.data.b) obj3).i((hyg0) obj2, (x500) obj);
                return s3q0.a;
            case 22:
                PollResultsFragment pollResultsFragment = (PollResultsFragment) obj3;
                PollFilterParams pollFilterParams = (PollFilterParams) obj2;
                int i19 = PollResultsFragment.b0;
                pollFilterParams.getClass();
                PollFilterParams pollFilterParams2 = new PollFilterParams();
                pollFilterParams2.b = pollFilterParams.b;
                pollFilterParams2.c = pollFilterParams.c;
                pollFilterParams2.d = pollFilterParams.d;
                pollFilterParams2.e = pollFilterParams.e;
                pollResultsFragment.Y = pollFilterParams2;
                pollResultsFragment.ko((com.vk.dto.polls.a) obj);
                pollResultsFragment.no(PollFilterBottomView.Status.SUCCESS);
                return s3q0.a;
            case 23:
                h4c0 h4c0Var = (h4c0) obj3;
                l6z l6zVar = (l6z) obj2;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Like action successfully added to local repository."});
                }
                Object obj4 = l6zVar.a;
                h4c0Var.e.remove(Long.valueOf(obj4.hashCode()));
                ce60.b.getClass();
                p870.f().d(102, 100, (NewsEntry) obj4);
                if (l6zVar.b && (obj4 instanceof DeprecatedStatisticInterface)) {
                    com.vkontakte.android.data.b.o((DeprecatedStatisticInterface) obj4, "like_post");
                }
                return s3q0.a;
            case 24:
                izs izsVar3 = (izs) obj2;
                Throwable th = (Throwable) obj;
                hd60.a().S((Context) ((jmb) obj3).invoke());
                if (izsVar3 != null) {
                }
                return s3q0.a;
            case 25:
                ((pdf0) obj3).l.a((StickerStockItem) obj2);
                return s3q0.a;
            case 26:
                ((izs) obj3).invoke(((p6i0) obj2).m);
                return s3q0.a;
            case 27:
                uhj0 uhj0Var = (uhj0) obj3;
                com.vkontakte.android.actionlinks.a aVar12 = (com.vkontakte.android.actionlinks.a) obj2;
                uhj0Var.v.B0(aVar12);
                uhj0Var.u.remove(Integer.valueOf(aVar12.e.b));
                UserId userId2 = uhj0Var.e;
                long j5 = fkq0.b(userId2) ? -userId2.b : 0L;
                z20 z20Var = new z20("actionLinks.getByTag", i3);
                z20Var.K("tag", "live");
                if (j5 != 0) {
                    z20Var.D(j5, "group_id");
                }
                return rsg0.y0(z20Var, null, null, 3);
            case 28:
                ?? r8 = (FunctionReferenceImpl) obj2;
                ((ikv0) obj).a();
                ?? r1 = ((tjc) obj3).c;
                r5v0 r5v0Var2 = r1 instanceof kj50 ? r1 : null;
                if (r5v0Var2 != null) {
                    r8.invoke(r5v0Var2);
                }
                return s3q0.a;
            default:
                com.vk.attachpicker.adapter.a aVar13 = (com.vk.attachpicker.adapter.a) obj2;
                jba0 jba0Var = ((a5m0) obj3).m;
                if (jba0Var != null) {
                    jba0Var.a(aVar13);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qt5(tjc tjcVar, izs izsVar) {
        this.b = 28;
        this.c = tjcVar;
        this.d = (FunctionReferenceImpl) izsVar;
    }

    public /* synthetic */ qt5(t1r.t tVar, wk50.a aVar, qvq.i iVar) {
        this.b = 9;
        this.c = aVar;
        this.d = iVar;
    }

    public /* synthetic */ qt5(h4c0 h4c0Var, l6z l6zVar, mm1 mm1Var) {
        this.b = 23;
        this.c = h4c0Var;
        this.d = l6zVar;
    }
}
