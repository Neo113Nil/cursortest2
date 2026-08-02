package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesGetScheduledCallsResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.design.view.message_snippet.MessageProductSnippet;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.ui.components.common.PinnedMsgAction;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.model.BackStack;
import com.vk.reefton.Reef;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.literx.sbjects.ReplaySubject;
import com.vk.stickers.settings.StickerSettingsFragment;
import com.vk.stickers.settings.b;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.d4k0;
import xsna.ikv0;
import xsna.kdk0;
import xsna.m140;
import xsna.q7h0;
import xsna.sud0;
import xsna.tj50;
import xsna.tlo0;
import xsna.uze0;
import xsna.whg;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r820 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r820(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ec, code lost:
    
        if (r1.f <= r1.g) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d2, code lost:
    
        if (r1.f <= r1.g) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ee, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02df, code lost:
    
        if (r1.f <= r1.g) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        f600 f600Var;
        int i = this.b;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                s820 s820Var = (s820) obj2;
                n1l0 n1l0Var = s820Var.q;
                if (n1l0Var != null && (f600Var = s820Var.m) != null) {
                    f600Var.e(n1l0Var);
                }
                irc0 irc0Var = s820Var.n;
                if (irc0Var != null) {
                    irc0Var.invoke();
                }
                return s3q0.a;
            case 1:
                int i3 = MessageProductSnippet.x;
                ((xa20) obj2).c.invoke();
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                o030 o030Var = new o030(1, (com.vk.newsfeed.impl.postmodal.reactions.tabs.all.a) obj2, com.vk.newsfeed.impl.postmodal.reactions.tabs.all.a.class, "mapStateToReactedUsers", "mapStateToReactedUsers(Lcom/vk/newsfeed/impl/postmodal/reactions/tabs/mvi/ModalPostReactionsTabState;)Ljava/util/List;", 0);
                ao8 ao8Var = ao8.d;
                return new b.d(aVar.a(o030Var, ao8Var), aVar.a(new uuz(7), ao8Var), aVar.a(p030.b, ao8Var));
            case 3:
                com.vk.im.ui.components.msg_list.a aVar2 = (com.vk.im.ui.components.msg_list.a) obj2;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                if (((Throwable) obj) instanceof NoNetworkConnectionException) {
                    Context context = aVar2.k;
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_no_connection_error);
                    ikv0.a aVar3 = new ikv0.a(context);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_20, valueOf, (Size) null, 12);
                    CharSequence a = tlo0.b.a(h, context);
                    aVar3.u = new ikv0.d(new ikv0.d.c(a != null ? a.toString() : null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar3.n();
                } else {
                    Context context2 = aVar2.k;
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_failed);
                    ikv0.a aVar4 = new ikv0.a(context2);
                    float f = 28;
                    aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, valueOf, new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar4.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context2).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar4.n();
                }
                return s3q0.a;
            case 4:
                View view = (View) obj;
                ym30 ym30Var = ((vm30) obj2).t0;
                if (ym30Var == null) {
                    return null;
                }
                ym30Var.f0(view);
                return s3q0.a;
            case 5:
                m140 m140Var = (m140) obj2;
                int i4 = m140.a.$EnumSwitchMapping$0[((PinnedMsgAction) obj).ordinal()];
                if (i4 == 1) {
                    com.vk.movika.sdk.base.asset.b bVar = m140Var.g;
                    if (bVar != null) {
                        ((MsgViewHeaderComponent) bVar.b).X0(true);
                    }
                } else if (i4 == 2) {
                    com.vk.movika.sdk.base.asset.b bVar2 = m140Var.g;
                    if (bVar2 != null) {
                        ((MsgViewHeaderComponent) bVar2.b).X0(false);
                    }
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.movika.sdk.base.asset.b bVar3 = m140Var.g;
                    if (bVar3 != null) {
                        MsgViewHeaderComponent msgViewHeaderComponent = (MsgViewHeaderComponent) bVar3.b;
                        int i5 = 29;
                        io.reactivex.rxjava3.internal.operators.single.n nVar = new io.reactivex.rxjava3.internal.operators.single.n(msgViewHeaderComponent.i.E(msgViewHeaderComponent, new dvm(msgViewHeaderComponent.j.f, true, null)), new pm1(new ap30(msgViewHeaderComponent, i2), i5));
                        int i6 = 5;
                        msgViewHeaderComponent.I0(new io.reactivex.rxjava3.internal.operators.single.j(nVar, new uu4(msgViewHeaderComponent, i6)).subscribe(new wmz(new foh(msgViewHeaderComponent, 3), i6), new k41(new u19(msgViewHeaderComponent, 5), i5)));
                    }
                }
                return s3q0.a;
            case 6:
                qu40 qu40Var = (qu40) obj2;
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(((MusicPickerState) obj).j);
                if (musicPickerList != null) {
                    qu40Var.getClass();
                    if (musicPickerList instanceof MusicPickerList.Tracks) {
                        MusicPickerList.Tracks tracks = (MusicPickerList.Tracks) musicPickerList;
                        break;
                    } else if (musicPickerList instanceof MusicPickerList.Playlists) {
                        MusicPickerList.Playlists playlists = (MusicPickerList.Playlists) musicPickerList;
                        break;
                    } else {
                        if (!(musicPickerList instanceof MusicPickerList.SelectedPlaylist)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MusicPickerList.SelectedPlaylist selectedPlaylist = (MusicPickerList.SelectedPlaylist) musicPickerList;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                sg60.this.j.b.f(new vxf0());
                return s3q0.a;
            case 8:
                return ((PagerGridListVh) obj2).h.c(((Integer) obj).intValue());
            case 9:
                yhg yhgVar = ((PastAsrListFragment) obj2).T;
                (yhgVar != null ? yhgVar : null).a(new whg.s(z ? 1 : 0));
                return s3q0.a;
            case 10:
                ((com.vk.video.ui.discovery.minimizable.related_videos.a) obj2).a.invoke(new com.vk.video.ui.discovery.minimizable.f((VideoAlbum) obj));
                return s3q0.a;
            case 11:
                dpb0 dpb0Var = (dpb0) obj2;
                PollEditorState pollEditorState = (PollEditorState) obj;
                if (!(pollEditorState instanceof PollEditorState.Editing)) {
                    return new BackStack(EmptyList.b);
                }
                fz5 fz5Var = dpb0Var.d;
                List<PollEditorScreen> list = ((PollEditorState.Editing) pollEditorState).j;
                fz5Var.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<PollEditorScreen> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return new BackStack(arrayList);
            case 12:
                PollsWebView pollsWebView = (PollsWebView) obj2;
                int i7 = PollsWebView.h;
                pollsWebView.g((com.vk.uxpolls.presentation.js.model.a) obj);
                pollsWebView.i();
                return s3q0.a;
            case 13:
                u04 u04Var = ((hdc0) obj2).b;
                if (u04Var != null) {
                    pla.e().b().b(HintId.FEED_COMPACT_ATTACHMENTS_ONBOARDING.getId());
                    ((hdc0) u04Var.c).b(false, true);
                }
                return s3q0.a;
            case 14:
                xn50.a.c(((rhc0) obj2).c, new PostingAction.Editing.SetPostponePublish((Date) obj));
                return s3q0.a;
            case 15:
                ((Boolean) obj).getClass();
                ((enc0) obj2).U.invoke(PostingAction.Hints.RemoveNextStepButtonHint.b);
                return s3q0.a;
            case 16:
                ((e5d0) obj2).Y0(true);
                return s3q0.a;
            case 17:
                sud0.b bVar4 = (sud0.b) obj2;
                Article article = (Article) bVar4.m;
                if (article != null) {
                    bVar4.o.invoke(article);
                }
                return s3q0.a;
            case 18:
                ((tze0) obj2).b.onNext(new uze0.c((eze0) obj));
                return s3q0.a;
            case 19:
                Reef reef = (Reef) obj2;
                vof0 vof0Var = (vof0) obj;
                qof0 qof0Var = reef.d;
                aof0 b = qof0Var.b();
                int i8 = reef.h;
                ReefRequestReason reefRequestReason = vof0Var.h;
                b.c("Reef Snapshot " + i8 + ": " + reefRequestReason);
                AtomicInteger atomicInteger = Reef.m;
                long j = vof0Var.c;
                int i9 = vof0Var.e;
                long j2 = vof0Var.g;
                long j3 = vof0Var.f;
                StringBuilder sb = new StringBuilder("Reef Snapshot: sequenceNumber=");
                sb.append(atomicInteger);
                sb.append("timestamp=");
                sb.append(j);
                sb.append("timezone=");
                sb.append(i9);
                sb.append("applicationStartTime=");
                sb.append(j2);
                tj0.d(sb, "bootElapsedTime=", j3, "reason=");
                sb.append(reefRequestReason);
                sb.append(", ");
                qof0Var.b().a(new StringBuilder(sb.toString()).toString());
                som0 som0Var = qof0.M;
                if (som0Var == null) {
                    qof0.N.getClass();
                    som0Var = new som0();
                    qof0.M = som0Var;
                }
                ((ReplaySubject) som0Var.b).onNext(vof0Var);
                return s3q0.a;
            case 20:
                ((b2e0) obj2).a();
                return s3q0.a;
            case 21:
                MessagesGetScheduledCallsResponseDto messagesGetScheduledCallsResponseDto = (MessagesGetScheduledCallsResponseDto) obj;
                ((q7h0) obj2).getClass();
                String g = messagesGetScheduledCallsResponseDto.g();
                if (g == null) {
                    g = "";
                }
                return new q7h0.a(messagesGetScheduledCallsResponseDto, epx.f(messagesGetScheduledCallsResponseDto.e(), Boolean.TRUE), g);
            case 22:
                jgh0 jgh0Var = (jgh0) obj2;
                float floatValue = ((Float) obj).floatValue();
                rg50 rg50Var = jgh0Var.a;
                wak0 wak0Var = (wak0) rg50Var;
                float intValue = wak0Var.getIntValue() + floatValue + jgh0Var.f;
                float f2 = swe0.f(intValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jgh0Var.f());
                Object[] objArr = intValue == f2 ? 1 : null;
                float intValue2 = f2 - wak0Var.getIntValue();
                int round = Math.round(intValue2);
                ((wak0) rg50Var).C(wak0Var.getIntValue() + round);
                jgh0Var.f = intValue2 - round;
                if (objArr == null) {
                    floatValue = intValue2;
                }
                return Float.valueOf(floatValue);
            case 23:
                return Boolean.valueOf(epx.f(((kym0) obj).b, (UserId) obj2));
            case 24:
                d4k0.k.a aVar5 = (d4k0.k.a) ((d4k0.k) obj2);
                return SmartCropState.a((SmartCropState) obj, null, null, null, aVar5.b, aVar5.c, false, null, false, false, null, 1999);
            case 25:
                odk0 odk0Var = (odk0) obj2;
                kdk0.d dVar = kdk0.d.b;
                odk0Var.getClass();
                xn50.a.c(odk0Var, dVar);
                return s3q0.a;
            case 26:
                s3l0 s3l0Var = (s3l0) obj2;
                Throwable th = (Throwable) obj;
                d790 d790Var = s3l0Var.d;
                s3l0Var.z(d790Var != null ? d790Var : null, true);
                h03.b(th);
                return s3q0.a;
            case 27:
                StickerSettingsFragment stickerSettingsFragment = (StickerSettingsFragment) obj2;
                com.vk.stickers.settings.b bVar5 = (com.vk.stickers.settings.b) obj;
                int i10 = StickerSettingsFragment.R;
                if (bVar5 instanceof b.a) {
                    stickerSettingsFragment.finish();
                } else {
                    xn50.a.c(stickerSettingsFragment, bVar5);
                }
                return s3q0.a;
            case 28:
                com.vk.stickers.keyboard.page.a aVar6 = (com.vk.stickers.keyboard.page.a) obj2;
                return new khy(aVar6.i, aVar6.m);
            default:
                ((wh50) obj2).setValue((zhf0) obj);
                return s3q0.a;
        }
    }
}
