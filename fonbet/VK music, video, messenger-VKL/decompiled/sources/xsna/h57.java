package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.antispam.ChatSpamAction;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.PhotoStackView;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.ui.video2.PlayerState;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Parameters;
import com.vk.translate.impl.views.MessageTranslateActionsLayout;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.utils.Logger;
import xsna.cqc0;
import xsna.e57;
import xsna.e8v0;
import xsna.f0r;
import xsna.gm50;
import xsna.gwc;
import xsna.nbm;
import xsna.wk50;
import xsna.x6y;
import xsna.ybb;
import xsna.ye0;
import xsna.ys8;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h57 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h57(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Map<n2k0, CollageSlotView> slots;
        int i;
        je0 N0;
        DialogBackground X0;
        int i2 = this.b;
        int i3 = 6;
        int i4 = 8;
        int i5 = 12;
        int i6 = 5;
        int i7 = 3;
        int i8 = 1;
        int i9 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                l57 l57Var = (l57) obj3;
                w1p0 w1p0Var = (w1p0) obj;
                Cipher cipher = ((e57.c) obj2).b;
                if (cipher != null) {
                    wjk wjkVar = l57Var.h;
                    String str = w1p0Var.c;
                    wjkVar.getClass();
                    String encodeToString = Base64.encodeToString(cipher.doFinal(str.getBytes(emb.b)), 2);
                    String encodeToString2 = Base64.encodeToString(cipher.getIV(), 2);
                    d2p0 d2p0Var = l57Var.g;
                    d2p0Var.getClass();
                    io.reactivex.rxjava3.core.a.l(new g66(new q21(d2p0Var, encodeToString, encodeToString2, i6), i4)).q(new io.reactivex.rxjava3.internal.schedulers.f()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fa(l57Var, i8), new el6(new j57(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i9));
                }
                return s3q0.a;
            case 1:
                m68 m68Var = (m68) obj3;
                DocumentAttachment documentAttachment = (DocumentAttachment) obj2;
                m68Var.n.b(hg1.m(rsg0.y0(new ttn(documentAttachment.o, documentAttachment.k, documentAttachment.j), null, null, 3), ((View) obj).getContext(), 0L, false, 62).subscribe(new xn(new v5(m68Var, i5), i7), new gf0(new zj(i3), i6)));
                return s3q0.a;
            case 2:
                zbb zbbVar = (zbb) obj3;
                ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) obj;
                Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
                MsgFromChannel b = MsgFromChannel.a.b(0, "", MsgTextFormat.d, Collections.singletonList((AttachVideoMsg) obj2));
                com.vk.channels.impl.channel_screen.send_msg.a aVar = zbbVar.q;
                zbbVar.O(new ybb.f(b, channelMsgSendConfig, (aVar != null ? aVar : null).I()));
                return s3q0.a;
            case 3:
                gwc gwcVar = (gwc) obj3;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj2;
                gwcVar.k = null;
                int i10 = gwc.a.$EnumSwitchMapping$0[((HideReason) obj).ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    VideoFile A = k15.A(sdkVideoFile);
                    wjs0.a(new oxr0(A, true));
                    zfj0 zfj0Var = gwcVar.b;
                    l00 l00Var = new l00(gwcVar, 17);
                    zfj0Var.getClass();
                    Owner s = A.s();
                    if (s != null) {
                        dz2 x = yfb.x(((mgj0) zfj0Var.c.getValue()).i(s.b, A.r()));
                        ahn.D(x);
                        zfj0Var.b.b(rsg0.y0(x, null, null, 3).subscribe(new d750(new qyi0(A, i9), 14), new ox80(new rte(zfj0Var, l00Var, A, i3), 9)));
                    }
                } else if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 4:
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj3;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i11 = ClipsFavoriteFolderContentListFragment.W;
                bVar.c.setVisibility(8);
                bVar.f.setVisibility(0);
                bVar.g.setVisibility(8);
                bVar.h.setVisibility(8);
                gm50.a.a(clipsFavoriteFolderContentListFragment, ((ClipsFavoriteFolderContentListViewState.d) obj).a, new ka(clipsFavoriteFolderContentListFragment, 24));
                return s3q0.a;
            case 5:
                k3g k3gVar = (k3g) obj3;
                com.vk.movika.sdk.base.ui.k kVar = (com.vk.movika.sdk.base.ui.k) obj2;
                l1g l1gVar = k3gVar.u;
                if (l1gVar != null && (slots = l1gVar.getSlots()) != null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<n2k0, CollageSlotView> entry : slots.entrySet()) {
                        n2k0 key = entry.getKey();
                        CollageSlotView value = entry.getValue();
                        d2g springTransform = value.getSpringTransform();
                        if (springTransform != null) {
                            hashMap.put(key, springTransform);
                        } else {
                            value.p = true;
                        }
                        value.o = true;
                    }
                    if (hashMap.isEmpty()) {
                        kVar.invoke();
                    } else {
                        wzs<? super Map<n2k0, d2g>, ? super Boolean, s3q0> wzsVar = k3gVar.e;
                        if (wzsVar != null) {
                            wzsVar.invoke(hashMap, Boolean.FALSE);
                        }
                    }
                }
                return s3q0.a;
            case 6:
                qgi0.h((tgi0) obj, ((String) obj3) + ", " + ((String) obj2));
                return s3q0.a;
            case 7:
                dcl dclVar = (dcl) obj3;
                ys8.b bVar2 = (ys8.b) obj2;
                Subscription subscription = (Subscription) obj;
                dclVar.e = null;
                if (!subscription.w) {
                    bn40.h("BMSBM", "Can't use in-app(server)");
                    bVar2.onError(2);
                    return s3q0.a;
                }
                if (subscription.s) {
                    ys8.a.getClass();
                    if (!ys8.a.c.contains(subscription.z)) {
                        bn40.h("BMSBM", "Can't use in-app(already purchased)");
                        bVar2.onError(4);
                        return s3q0.a;
                    }
                }
                if (!subscription.s && dclVar.c) {
                    bn40.h("BMSBM", "Can't use in-app(upsell does not support buying subscription)");
                    bVar2.onError(4);
                    return s3q0.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(subscription.b, subscription);
                dclVar.b.h(linkedHashMap, new ccl(bVar2, dclVar));
                return s3q0.a;
            case 8:
                xam xamVar = (xam) obj3;
                List list = (List) obj2;
                nbm.a aVar2 = (nbm.a) obj;
                ListBuilder e = e43.e();
                if (aVar2.b) {
                    e.add(ChatSpamAction.ExitChatAndClearHistory.b);
                }
                if (aVar2.a) {
                    e.add(ChatSpamAction.Report.b);
                }
                ListBuilder g = e.g();
                xamVar.getClass();
                FragmentActivity fragmentActivity = xamVar.i;
                if (g.isEmpty()) {
                    edw edwVar = edw.a;
                    edw.d(R.string.vkim_msg_header_antispam_actions_failed, fragmentActivity, false);
                } else {
                    ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                    ListIterator listIterator = g.listIterator(0);
                    while (true) {
                        ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                        if (aVar3.hasNext()) {
                            ChatSpamAction chatSpamAction = (ChatSpamAction) aVar3.next();
                            if (epx.f(chatSpamAction, ChatSpamAction.ExitChatAndClearHistory.b)) {
                                i = R.string.vkim_msg_spam_dialog_exit_and_clear_chat_report;
                            } else {
                                if (!epx.f(chatSpamAction, ChatSpamAction.Report.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R.string.vkim_msg_spam_dialog_report;
                            }
                            arrayList.add(fragmentActivity.getString(i));
                        } else {
                            String g0 = arrayList.size() < 2 ? (String) j5g.a0(arrayList) : j5g.g0(arrayList, ". ", null, ".", 0, null, 58);
                            String str2 = g0 != null ? g0 : "";
                            edw edwVar2 = edw.a;
                            edw.j(fragmentActivity, str2);
                        }
                    }
                }
                if (list.contains(ChatSpamAction.ExitChatAndClearHistory.b)) {
                    xamVar.k.b().i(fragmentActivity);
                }
                return s3q0.a;
            case 9:
                ((etv0) obj).b(false);
                ((fwm) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 10:
                ((f0r.i) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 11:
                ((zps) obj3).h.invoke((UserProfile) obj, Integer.valueOf(((ekq0) obj2).getBindingAdapterPosition()));
                return s3q0.a;
            case 12:
                ipv ipvVar = (ipv) obj3;
                View view = (View) obj;
                ymy ymyVar = ((irv) obj2).o;
                ipvVar.invoke(view, ymyVar != null ? ymyVar : null);
                return s3q0.a;
            case 13:
                AuthResult authResult = (AuthResult) obj;
                x6y.e eVar = ((l2y) obj3).f.b;
                Boolean d = ((AuthByExchangeToken$Parameters) obj2).d();
                eVar.invoke(authResult, Boolean.valueOf(d != null ? d.booleanValue() : false));
                return s3q0.a;
            case 14:
                zrz zrzVar = (zrz) obj3;
                zrz.a aVar4 = (zrz.a) obj;
                zrzVar.j.b(new com.vk.catalog2.common.ui.holders.b(16, aVar4, obj2));
                zrzVar.n.onNext(new vfk(zrzVar, 20));
                return zrz.a.a(aVar4, zrzVar.f.b((frz) aVar4.a, obj2, zrzVar, aVar4.f), null, null, false, false, false, 62);
            case 15:
                kb20 kb20Var = (kb20) obj2;
                MessageTranslateActionsLayout.a aVar5 = ((MessageTranslateActionsLayout) obj3).b;
                if (aVar5 != null) {
                    ((com.vk.translate.impl.views.b) ((oyr) aVar5).c).a.a1(kb20Var);
                }
                return s3q0.a;
            case 16:
                gr20 gr20Var = (gr20) obj3;
                sqt0 sqt0Var = gr20Var.u;
                yg5 yg5Var = (yg5) obj2;
                mit0 mit0Var = (mit0) obj;
                j4t0 j4t0Var = mit0Var.b;
                drt0 drt0Var = mit0Var.c;
                if (j4t0Var.a.a == PlayerState.IDLE) {
                    if (x19.J(drt0Var.b) && yg5Var.v0() == null) {
                        yg5Var.G0(false);
                    }
                    ScreenState screenState = drt0Var.b;
                    if (x19.J(screenState) || screenState == ScreenState.MINI) {
                        com.vk.libvideo.autoplay.a aVar6 = drt0Var.a;
                        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                        b.C1208b.a().b(new xh5(yg5Var, aVar6, sqt0Var.getDisplayView(), null, null));
                    }
                }
                RepeatMode repeatMode = yg5Var.getConfig().b;
                com.vk.libvideo.autoplay.a aVar7 = drt0Var.a;
                ScreenState screenState2 = drt0Var.b;
                if (repeatMode != aVar7.b || yg5Var.getConfig().q != aVar7.q) {
                    yg5Var.a0(aVar7);
                }
                sqt0Var.setAdController(yg5Var.P0() ? yg5Var.N0() : null);
                d3b0 v0 = yg5Var.v0();
                sqt0Var.setPlayer(v0 != null ? v0.a() : null);
                com.vk.libvideo.api.ad.a aVar8 = mit0Var.b.e;
                if (aVar8 != null) {
                    boolean z = aVar8 instanceof a.AbstractC1195a;
                    yg5 yg5Var2 = gr20Var.s;
                    if (yg5Var2 != null && (N0 = yg5Var2.N0()) != null) {
                        ye0.a aVar9 = (ye0.a) N0;
                        ye0.a.C4096a f = aVar9.f();
                        if (z && f.b() && f.a && x19.J(screenState2)) {
                            f.a = false;
                            aVar9.h(new kzr0(false, true, x19.H(screenState2), gr20Var.e.o, false));
                        }
                    }
                }
                sqt0Var.i(mit0Var);
                return s3q0.a;
            case 17:
                izs izsVar = (izs) obj2;
                Integer num = (Integer) obj;
                ((u76) obj3).K2(num.intValue());
                if (izsVar != null) {
                    izsVar.invoke(num);
                }
                return s3q0.a;
            case 18:
                List<MusicTrack> list2 = (List) obj;
                ((Playlist) obj3).y = list2;
                return new io.reactivex.rxjava3.internal.operators.completable.m(new qgd(i9, (vh40) obj2, list2));
            case 19:
                fp7 fp7Var = (fp7) obj3;
                VKList vKList = (VKList) obj;
                fp7Var.a = vKList.size() + fp7Var.a;
                fp7Var.c = !vKList.isEmpty();
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    PhotoAttachment photoAttachment = (PhotoAttachment) it.next();
                    Iterator it2 = vKList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Photo photo = (Photo) it2.next();
                            if (photo.c == photoAttachment.f && epx.f(photo.e, photoAttachment.g)) {
                                vKList.remove(photo);
                            }
                        }
                    }
                }
                return vKList;
            case 20:
                int i12 = PastAsrListFragment.U;
                ((PastAsrListFragment) obj3).fo((a.d) obj, (PastAsrListFragment.b) obj2);
                return s3q0.a;
            case 21:
                cqc0 cqc0Var = (cqc0) obj3;
                List list3 = (List) obj2;
                cqc0.c cVar2 = (cqc0.c) obj;
                bwt0.p0(cVar2.e, false);
                bwt0.p0(cVar2.a(), true);
                bwt0.p0((ModalSettingsPrivacyOption) cVar2.A.getValue(), true);
                PhotoStackView photoStackView = (PhotoStackView) cVar2.a().findViewById(R.id.posting_visibility_counter_stack_images);
                List H0 = j5g.H0(list3, 3);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = H0.iterator();
                while (it3.hasNext()) {
                    ImageList imageList = ((ProfileFriendItem) it3.next()).e;
                    int i13 = cqc0Var.t;
                    Image Bb = imageList.Bb(i13, i13);
                    String str3 = Bb != null ? Bb.d : null;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                PhotoStackView.b bVar3 = PhotoStackView.M;
                photoStackView.r(-1, arrayList2);
                ((TextView) cVar2.a().findViewById(R.id.posting_visibility_counter_stack_count)).setText(enj.f(R.plurals.friends_quantity, list3.size(), cqc0Var.c));
                return s3q0.a;
            case 22:
                izs izsVar2 = (izs) obj3;
                faf0 faf0Var = (faf0) obj2;
                ((Boolean) obj).booleanValue();
                if (izsVar2 != null) {
                    izsVar2.invoke(faf0Var);
                }
                return s3q0.a;
            case 23:
                ((izs) obj3).invoke(obj);
                ((izs) obj2).invoke(obj);
                return s3q0.a;
            case 24:
                m2m0 m2m0Var = (m2m0) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                StoriesContainer storiesContainer = (StoriesContainer) m2m0Var.m;
                List<StoriesContainer> y0 = m2m0Var.n.y0();
                wvl0 wvl0Var = m2m0Var.r;
                ArrayList f2 = wvl0Var.f(storiesContainer, (ListDataSet.ArrayListImpl) y0);
                if (wvl0Var.e(storiesContainer.Ob(), f2) != null) {
                    StoryViewerRouter storyViewerRouter = m2m0Var.s;
                    Context context = m2m0Var.itemView.getContext();
                    bpn0 bpn0Var2 = enj.a;
                    storyViewerRouter.h(e3m.h(context), f2, storiesContainer.Ob(), null, (r42 & 16) != 0, m2m0Var.p, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, m2m0Var.q, null, (r42 & 512) != 0 ? null : null, new l2m0(viewGroup, m2m0Var), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                }
                return s3q0.a;
            case 25:
                h7v.f(pla.e().b(), (View) obj3, ((HintId) obj2).getId(), null, 12);
                return s3q0.a;
            case 26:
                com.vk.im.ui.components.theme_chooser.b bVar4 = (com.vk.im.ui.components.theme_chooser.b) obj3;
                List list4 = (List) obj2;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                DialogBackground dialogBackground = themeChooserState.d;
                if (themeChooserState.g.isEmpty() || !dialogBackground.d()) {
                    String str4 = themeChooserState.b;
                    List<DialogTheme> list5 = themeChooserState.f;
                    bVar4.getClass();
                    X0 = com.vk.im.ui.components.theme_chooser.b.X0(str4, list5, list4);
                } else {
                    X0 = dialogBackground;
                }
                ThemeChooserState a = ThemeChooserState.a(themeChooserState, null, null, null, X0, false, null, j5g.v0(DialogBackground.e, list4), null, 183);
                if (X0 != dialogBackground) {
                    bVar4.o.a(a);
                }
                return a;
            case 27:
                rlq0.h((ExtendedUserProfile) obj3, (rlq0) obj2, false);
                return s3q0.a;
            default:
                ((VideoItemListLargeVh) obj3).k(((DonutVideoUiModel.PreviewBadge) obj2).e, DonutVideoClickSource.PAYWALL);
                return s3q0.a;
        }
    }
}
