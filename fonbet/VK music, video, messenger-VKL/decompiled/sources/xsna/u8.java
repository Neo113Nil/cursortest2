package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.design.view.floatingbutton.model.FloatingButtonAnalyticsEvent;
import com.vk.core.serialize.Serializer;
import com.vk.core.snackbar.HideReason;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Middle$Size;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.msg.ChannelMsgPushInfoLoader;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a5r;
import xsna.bph0;
import xsna.c5v0;
import xsna.ca9;
import xsna.e8v0;
import xsna.m30;
import xsna.mwv;
import xsna.nc5;
import xsna.nwb;
import xsna.ryv;
import xsna.t8b;
import xsna.tlo0;
import xsna.uxd0;
import xsna.uyq;
import xsna.vte;
import xsna.xwb;
import xsna.xxd0;
import xsna.ygq;
import xsna.zte;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0256  */
    /* JADX WARN: Type inference failed for: r1v139, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r1v141, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r1v184, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s3q0 show$lambda$7;
        com.vk.core.view.components.cell.f b;
        com.vk.core.view.components.cell.f b2;
        Peer peer;
        Peer peer2;
        Peer peer3;
        Object obj2;
        List<PushMessage> list;
        String str;
        VKImageView vKImageView;
        int i = 6;
        View view = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 1;
        switch (this.b) {
            case 0:
                e9 e9Var = (e9) this.c;
                yks0 yks0Var = e9Var.b;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yks0Var.d(b.C1208b.a().e(e9Var.a, null));
                return s3q0.a;
            case 1:
                ph phVar = (ph) this.c;
                int intValue = ((Integer) obj).intValue();
                qcy<Object>[] qcyVarArr = ph.n1;
                phVar.getFeature().C(new bph0.c(intValue));
                return s3q0.a;
            case 2:
                m30.a aVar = (m30.a) this.c;
                izs<Integer, s3q0> izsVar = aVar.l;
                if (izsVar != null) {
                    r10 r10Var = aVar.n;
                    izsVar.invoke(Integer.valueOf((r10Var != null ? r10Var : null).d));
                }
                return s3q0.a;
            case 3:
                ((im1) this.c).d.invoke(EmptyList.b);
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 4:
                PhotosGetAlbums.a aVar2 = (PhotosGetAlbums.a) obj;
                g5g.D(aVar2.a, true, new po1((ro1) this.c, z2 ? 1 : 0));
                return aVar2;
            case 5:
                show$lambda$7 = AndroidFullscreenWebViewAdPlayer.show$lambda$7((AndroidFullscreenWebViewAdPlayer) this.c, (Throwable) obj);
                return show$lambda$7;
            case 6:
                ((AsrRecordStartFragment) this.c).P.a((pv3) ((it80) obj).a);
                return s3q0.a;
            case 7:
                hc5 hc5Var = (hc5) this.c;
                nc5 nc5Var = (nc5) obj;
                if (nc5Var instanceof nc5.a) {
                    wd3 wd3Var = hc5Var.j1;
                    if (wd3Var != null) {
                        wd3Var.invoke(((nc5.a) nc5Var).a);
                    }
                } else {
                    qcy<Object>[] qcyVarArr2 = hc5.m1;
                    if (!(nc5Var instanceof nc5.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hc5Var.dismiss();
                }
                return s3q0.a;
            case 8:
                ((BonusCatalogFragment) this.c).io();
                return s3q0.a;
            case 9:
                BotButton.Callback callback = (BotButton.Callback) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(callback.g.h()), "type");
                w9yVar.e(callback.h, "payload");
                w9yVar.c(Integer.valueOf(callback.i), TtmlNode.TAG_SPAN);
                w9yVar.b(Boolean.valueOf(callback.j), "inline");
                w9yVar.d(Long.valueOf(callback.k.b), "author");
                w9yVar.e(callback.l, "label");
                w9yVar.c(Integer.valueOf(callback.m.h()), "color_id");
                w9yVar.b(Boolean.valueOf(callback.n), "is_loading");
                return s3q0.a;
            case 10:
                ((bp8) this.c).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 11:
                ew8.F((io.reactivex.rxjava3.core.y) this.c);
                return s3q0.a;
            case 12:
                return ca9.c.a((ca9.c) obj, null, null, null, null, null, null, null, null, null, null, ((Boolean) this.c).booleanValue(), null, null, null, null, false, null, false, null, false, null, -67108865, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 13:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) this.c).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((UIBlock) obj).equals((UIBlock) this.c));
            case 15:
                noa noaVar = (noa) this.c;
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) obj;
                if (drm0.D(noaVar.j(), "multiline", false)) {
                    com.vk.core.view.components.cell.f.Companion.getClass();
                    b = new com.vk.core.view.components.cell.f("This is a long long long text that for several lines to check how padding works", 3, 0);
                } else {
                    b = epx.f(noaVar.j(), "none") ? null : f.b.b(com.vk.core.view.components.cell.f.Companion);
                }
                if (drm0.D(noaVar.i(), "multiline", false)) {
                    com.vk.core.view.components.cell.f.Companion.getClass();
                    b2 = new com.vk.core.view.components.cell.f("This is a long long long text that for several lines to check how padding works", 3, 0);
                } else {
                    b2 = epx.f(noaVar.i(), "none") ? null : f.b.b(com.vk.core.view.components.cell.f.Companion);
                }
                com.vk.core.view.components.cell.f b3 = epx.f((String) ((zak0) noaVar.m).getValue(), "none") ? null : f.b.b(com.vk.core.view.components.cell.f.Companion);
                VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size = (VkCellSkeleton$Middle$Size) noaVar.e.get((String) ((zak0) noaVar.q).getValue());
                if (vkCellSkeleton$Middle$Size == null) {
                    vkCellSkeleton$Middle$Size = VkCellSkeleton$Middle$Size.Medium;
                }
                vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(b, b2, b3, vkCellSkeleton$Middle$Size));
                vkCellSkeleton.setLeft((com.vk.core.view.components.cell.c) noaVar.h.get((String) ((zak0) noaVar.n).getValue()));
                return s3q0.a;
            case 16:
                mkm0 mkm0Var = ((gta) this.c).b;
                if (mkm0Var != null) {
                    mkm0Var.pause();
                }
                return s3q0.a;
            case 17:
                i9b i9bVar = (i9b) this.c;
                o9b o9bVar = i9bVar.d;
                zxd0 zxd0Var = (zxd0) obj;
                io.reactivex.rxjava3.subjects.d<xxd0> dVar2 = i9bVar.s;
                io.reactivex.rxjava3.subjects.f<uxd0> fVar = i9bVar.t;
                s8b s8bVar = i9bVar.c;
                h9k0 h9k0Var = i9bVar.i;
                Context context = i9bVar.f;
                long j = i9bVar.a;
                if (zxd0Var instanceof zxd0.m) {
                    i9bVar.j();
                } else if (zxd0Var instanceof zxd0.v) {
                    i9bVar.l.d(j);
                } else if (zxd0Var instanceof zxd0.d) {
                    a1w a1wVar = s8bVar.a;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    io.reactivex.rxjava3.internal.operators.single.c C = a1wVar.C(s8bVar, new pxa(Peer.a.b(j)));
                    asu0 asu0Var = asu0.a;
                    i9bVar.p.b(new io.reactivex.rxjava3.internal.operators.completable.p(C.q(asu0Var.c())).o(asu0Var.d()).subscribe(new ek5(i9bVar, i2)));
                } else if (zxd0Var instanceof zxd0.l) {
                    t8b t8bVar = (t8b) ((zxd0.l) zxd0Var).a;
                    if (t8bVar instanceof t8b.k) {
                        i9bVar.h(new a23(i9bVar, 2));
                    } else if (t8bVar instanceof t8b.m) {
                        i9bVar.h(new h3b(i9bVar));
                    } else if (t8bVar instanceof t8b.j) {
                        xxd0 P0 = dVar2.P0();
                        if (P0 instanceof xxd0.b) {
                            String obj3 = ((xxd0.b) P0).a.toString();
                            String b4 = o9bVar.b();
                            if (b4 != null) {
                                g2v.c().b().T(context, obj3, b4);
                            }
                        }
                    } else if (t8bVar instanceof t8b.a) {
                        i9bVar.h(new i3b(i9bVar, 1));
                    } else if (t8bVar instanceof t8b.u) {
                        i9bVar.h(new j3b(i9bVar, 1));
                    } else if (t8bVar instanceof t8b.f) {
                        i9bVar.i();
                    } else if (t8bVar instanceof t8b.r) {
                        String b5 = o9bVar.b();
                        if (b5 != null) {
                            kbj0.c(i9bVar.g, i9bVar.f, b5, false, null, "channel_profile", false, 104);
                        }
                    } else if (t8bVar instanceof t8b.h) {
                        i9bVar.j();
                    } else if (t8bVar instanceof t8b.x) {
                        Channel channel = i9bVar.v;
                        if (channel != null && (peer3 = channel.A) != null) {
                            g2v.c().b().d(peer3.b, context);
                        }
                    } else if (t8bVar instanceof t8b.o) {
                        i9bVar.h(new k3b(i9bVar, 1));
                    } else if (t8bVar instanceof t8b.p) {
                        i9bVar.h(new j9b(i9bVar, 0));
                    } else if (t8bVar instanceof t8b.c) {
                        i9bVar.j();
                    } else if (t8bVar instanceof t8b.n) {
                        i9bVar.h(new k9b(i9bVar, 0));
                    } else if (t8bVar instanceof t8b.l) {
                        i9bVar.h(new l9b(i9bVar, 0));
                    } else if (t8bVar instanceof t8b.g) {
                        i9bVar.i();
                    } else if (t8bVar instanceof t8b.e) {
                        i9bVar.m(s8bVar.b.d(j), null, new d9b(i9bVar, z3 ? 1 : 0));
                    } else if (t8bVar instanceof t8b.s) {
                        i9bVar.m(s8bVar.b.k(j), null, new xv(i9bVar, i2));
                    } else if (t8bVar instanceof t8b.b) {
                        i9bVar.h(new m9b(i9bVar, 0));
                    } else if (t8bVar instanceof t8b.v) {
                        i9bVar.h(new e3b(i9bVar));
                    } else if (t8bVar instanceof t8b.i) {
                        fVar.onNext(uxd0.a0.a);
                    } else if (t8bVar instanceof t8b.d) {
                        fVar.onNext(new uxd0.n(j));
                    } else if (t8bVar instanceof t8b.q) {
                        i9bVar.h(new f3b(i9bVar, 1));
                    } else if (t8bVar instanceof t8b.w) {
                        i9bVar.h(new g3b(i9bVar, 1));
                    } else {
                        if (!(t8bVar instanceof t8b.t)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Channel channel2 = i9bVar.v;
                        if ((channel2 != null ? channel2.z : null) == ChannelType.COMMUNITY_CHANNEL && channel2 != null && (peer2 = channel2.A) != null) {
                            h9k0Var.e(context.getString(R.string.vkim_channel_toggle_comments), new d7k0(R.string.vkim_channel_go_to_community_button, new mm1(i, i9bVar, new UserId(peer2.d))));
                        }
                    }
                } else if (zxd0Var instanceof zxd0.s.b) {
                    String b6 = o9bVar.b();
                    if (b6 != null) {
                        kbj0.c(i9bVar.g, i9bVar.f, b6, false, null, "channel_profile", false, 104);
                    }
                } else if (zxd0Var instanceof zxd0.b) {
                    fVar.onNext(new uxd0.b(0));
                } else if (zxd0Var instanceof zxd0.t) {
                    FragmentManager supportFragmentManager = ((AppCompatActivity) e3m.h(context)).getSupportFragmentManager();
                    qcb qcbVar = new qcb();
                    qcbVar.setArguments(yfb.b(new Pair("channel_id", Long.valueOf(j))));
                    qcbVar.Td(supportFragmentManager, "CHANNEL_SETTINGS_BOTTOM_SHEET");
                } else if (zxd0Var instanceof zxd0.u) {
                    Channel channel3 = i9bVar.v;
                    if ((channel3 != null ? channel3.z : null) == ChannelType.COMMUNITY_CHANNEL && channel3 != null && (peer = channel3.A) != null) {
                        h9k0Var.e(context.getString(R.string.vkim_channel_title_duplicates_community), new d7k0(R.string.vkim_channel_change_community_title, new defpackage.o(8, i9bVar, new UserId(peer.d))));
                    }
                } else if (zxd0Var instanceof zxd0.a) {
                    Channel channel4 = i9bVar.v;
                    if ((channel4 != null ? channel4.z : null) == ChannelType.COMMUNITY_CHANNEL) {
                        h9k0Var.e(context.getString(R.string.vkim_channel_avatar_duplicates_community), new d7k0(R.string.vkim_channel_change_community_photo, new h5(i9bVar, 22)));
                    }
                } else if (zxd0Var instanceof zxd0.n) {
                    qxb qxbVar = ((zxd0.n) zxd0Var).a;
                    if (qxbVar instanceof ChatProfileListItem.j) {
                        i9bVar.m.b(j, context);
                    } else if (qxbVar instanceof ChatProfileListItem.g) {
                        boolean z5 = ((ChatProfileListItem.g) qxbVar).f;
                        Channel channel5 = i9bVar.v;
                        if (channel5 != null) {
                            long j2 = channel5.b;
                            Peer peer4 = channel5.A;
                            mwv<mwv.a> mwvVar = i9bVar.n;
                            long j3 = peer4.d;
                            mwvVar.a(new ryv.c(j3, j2));
                            if (z5) {
                                q7v0 q7v0Var = i9bVar.w.a;
                                VkOnboardingCampaign e = q7v0Var.e("me:channel_profile_action_donut_android");
                                if (e != null) {
                                    q7v0Var.a(e, VkOnboardingType.Highlighter, e8v0.a.b);
                                }
                                xxd0 P02 = dVar2.P0();
                                xxd0.b bVar = P02 instanceof xxd0.b ? (xxd0.b) P02 : null;
                                if (bVar != null) {
                                    List<nwb> list2 = bVar.p;
                                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                    for (nwb nwbVar : list2) {
                                        if (nwbVar instanceof nwb.b) {
                                            ChatProfileListItem chatProfileListItem = ((nwb.b) nwbVar).b;
                                            if (chatProfileListItem instanceof ChatProfileListItem.g) {
                                                nwbVar = new nwb.b(new ChatProfileListItem.g(chatProfileListItem.b.toString(), false));
                                            }
                                        }
                                        arrayList.add(nwbVar);
                                    }
                                    dVar2.onNext(xxd0.b.a(bVar, null, null, arrayList, 4161535));
                                }
                            }
                            if (channel5.L && channel5.p) {
                                new ChannelDonutSupportFragment.a(new UserId(j3)).k(context);
                            } else {
                                new ChannelMonetizationFragment.a(new UserId(j3), new UserId(j2)).k(context);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 18:
                wdb wdbVar = (wdb) this.c;
                Pair pair = (Pair) obj;
                long longValue = ((Number) pair.d()).longValue();
                Integer num2 = (Integer) pair.g();
                int intValue2 = num2.intValue();
                ChannelMsgPushInfoLoader channelMsgPushInfoLoader = wdbVar.f;
                jp9 jp9Var = wdbVar.d;
                t140 b7 = channelMsgPushInfoLoader.b(longValue, intValue2, MsgIdType.LOCAL_ID);
                Msg msg = (Msg) b7.a.c.get(num2);
                if (msg != null) {
                    pya a = channelMsgPushInfoLoader.a(longValue);
                    Channel channel6 = a.a.b;
                    if (channel6 != null) {
                        UserId c = wdbVar.b.c();
                        if (!fkq0.c(c)) {
                            c = null;
                        }
                        Long valueOf = c != null ? Long.valueOf(c.b) : null;
                        if (!ad0.B(channel6.z)) {
                            z = channel6.Ab();
                        } else if (channel6.h - channel6.i > 0) {
                            z = true;
                        }
                        if (!z) {
                            L.G("ChannelUpdateMessagesNotificationsHandler", qlb0.a(longValue, "updateNotification: channel ", " has no unread messages, cancel notification"));
                            jp9Var.a(longValue, valueOf);
                        } else if (msg.D || msg.k) {
                            Long l = valueOf;
                            L.e("ChannelUpdateMessagesNotificationsHandler", h5s.c(msg.d, " is expired or hidden, removing notifications", new StringBuilder("updateNotification: message ")));
                            jp9Var.b(longValue, msg.d, l, true);
                        } else if (msg.i) {
                            ProfilesInfo b8 = a.b();
                            b8.Hb(b7.b());
                            ProfilesSimpleInfo Ob = b8.Ob();
                            try {
                                obj2 = v1b.b.a.f(channel6.b, valueOf).a();
                            } catch (Throwable unused) {
                                obj2 = null;
                            }
                            MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj2;
                            if ((messageNotificationInfo != null ? messageNotificationInfo.b : null) != null && (list = messageNotificationInfo.e) != null && !list.isEmpty()) {
                                h7b a2 = wdbVar.a.a(channel6, msg, Ob);
                                wdbVar.c.a(a2.a, a2.b, ad0.B(messageNotificationInfo.b.r) ? a2.c : a2.f, valueOf, a2.d, a2.h, a2.j, messageNotificationInfo);
                            }
                        } else {
                            L.l("ChannelUpdateMessagesNotificationsHandler", "updateNotification: failed, message is outgoing");
                        }
                    }
                }
                return s3q0.a;
            case 19:
                return wfb.a((wfb) obj, (vcb) this.c, 13);
            case 20:
                ChatFragment chatFragment = (ChatFragment) this.c;
                HideReason hideReason = (HideReason) obj;
                ChatFragment.d dVar3 = ChatFragment.w1;
                if (hideReason != HideReason.Manual) {
                    myb0 I0 = chatFragment.B0.I0();
                    long j4 = ChatFragment.y1;
                    I0.getClass();
                    tfx tfxVar = new tfx("stickers.markPopupAnimationInterrupterBlocked", new itj0(i2), new cr(27));
                    tfx.m(tfxVar, "peer_id", j4, 0L, 12);
                    I0.a.b(rsg0.w0(yfb.x(tfxVar)).subscribe());
                }
                return s3q0.a;
            case 21:
                ((usb) this.c).a.c();
                return s3q0.a;
            case 22:
                xwb xwbVar = (xwb) this.c;
                AvatarAction avatarAction = (AvatarAction) obj;
                if (xwb.c.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
                    xwbVar.b.b0();
                } else {
                    xwbVar.b.O(avatarAction);
                }
                return s3q0.a;
            case 23:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) this.c;
                sa80 sa80Var = (sa80) obj;
                if (epx.f(classifiedsCatalogRootVh.V, alj.a)) {
                    classifiedsCatalogRootVh.Y = sa80Var.a.b;
                }
                classifiedsCatalogRootVh.l0();
                AnimStartSearchView animStartSearchView = classifiedsCatalogRootVh.b0.g;
                if (animStartSearchView == null || (str = animStartSearchView.getQuery()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    classifiedsCatalogRootVh.o0(sa80Var.a);
                }
                return s3q0.a;
            case 24:
                UserId userId = (UserId) this.c;
                ClipCoauthorListState clipCoauthorListState = (ClipCoauthorListState) obj;
                List<ClipCoauthorListItem> list3 = clipCoauthorListState.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (ClipCoauthorListItem clipCoauthorListItem : list3) {
                    if (clipCoauthorListItem.b.b.equals(userId)) {
                        ClipCoauthorListItem.SubscribeState subscribeState = clipCoauthorListItem.d;
                        if (subscribeState instanceof ClipCoauthorListItem.SubscribeState.Visible) {
                            clipCoauthorListItem = ClipCoauthorListItem.a(clipCoauthorListItem, null, new ClipCoauthorListItem.SubscribeState.Visible(((ClipCoauthorListItem.SubscribeState.Visible) subscribeState).b, true), 59);
                        }
                    }
                    arrayList2.add(clipCoauthorListItem);
                }
                return ClipCoauthorListState.a(clipCoauthorListState, arrayList2);
            case 25:
                return ((rhd) ((vod) this.c).d.getValue()).d();
            case 26:
                d8e d8eVar = (d8e) this.c;
                uyq uyqVar = (uyq) obj;
                q7e q7eVar = d8eVar.g;
                if (uyqVar instanceof uyq.b) {
                    q7eVar.a.a(new a5r.b(((uyq.b) uyqVar).a));
                } else if (uyqVar instanceof uyq.c) {
                    uyq.c cVar2 = (uyq.c) uyqVar;
                    q7eVar.a.a(new a5r.c(cVar2.a, cVar2.b, cVar2.c));
                } else if (uyqVar instanceof uyq.e.a.C3856a) {
                    q7eVar.a.a(new a5r.e.a.C2525a(((uyq.e.a.C3856a) uyqVar).a));
                } else if (uyqVar instanceof uyq.e.a.b) {
                    uyq.e.a.b bVar2 = (uyq.e.a.b) uyqVar;
                    q7eVar.a.a(new a5r.e.a.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d));
                } else if (uyqVar instanceof uyq.e.b) {
                    uyq.e.b bVar3 = (uyq.e.b) uyqVar;
                    q7eVar.a.a(new a5r.e.b(bVar3.a, bVar3.b));
                } else if (epx.f(uyqVar, uyq.f.a)) {
                    q7eVar.a.a(a5r.f.a);
                } else if (uyqVar instanceof uyq.g.a.C3857a) {
                    q7eVar.a.a(new a5r.g.a.C2526a(((uyq.g.a.C3857a) uyqVar).a));
                } else if (uyqVar instanceof uyq.g.b) {
                    q7eVar.a.a(new a5r.g.b(((uyq.g.b) uyqVar).a));
                } else if (uyqVar instanceof uyq.h) {
                    uyq.h hVar = (uyq.h) uyqVar;
                    q7eVar.a.a(new a5r.i(hVar.b, hVar.a));
                } else if (uyqVar instanceof uyq.i) {
                    final Activity b9 = enj.b(d8eVar);
                    if (b9 != null) {
                        final bsr bsrVar = (bsr) d8eVar.r.getValue();
                        final xgq xgqVar = ((uyq.i) uyqVar).a;
                        bsrVar.a();
                        ygq ygqVar = xgqVar.b;
                        if (ygqVar instanceof ygq.b) {
                            String a3 = cqm0.a(((ygq.b) ygqVar).a);
                            if (a3 != null) {
                                final LottieAnimationView lottieAnimationView = new LottieAnimationView(b9);
                                w800<i700> j5 = q700.j(b9, a3);
                                j5.a(new r800() { // from class: xsna.zrr
                                    @Override // xsna.r800
                                    public final void onResult(Object obj4) {
                                        Throwable th = (Throwable) obj4;
                                        j60 j60Var = bsr.this.h;
                                        if (j60Var != null) {
                                            j60Var.invoke(th);
                                        }
                                    }
                                });
                                j5.b(new r800() { // from class: xsna.asr
                                    @Override // xsna.r800
                                    public final void onResult(Object obj4) {
                                        LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                                        lottieAnimationView2.setComposition((i700) obj4);
                                        lottieAnimationView2.m0();
                                    }
                                });
                                vKImageView = lottieAnimationView;
                                if (vKImageView != null) {
                                    vKImageView.setId(R.id.clips_floating_button);
                                    vKImageView.setLayoutParams(new FrameLayout.LayoutParams(ygqVar.getWidth(), ygqVar.getHeight()));
                                    f4m.m(8388691, vKImageView);
                                    f4m.s(ygqVar.a(), vKImageView);
                                    f4m.q(ygqVar.L(), vKImageView);
                                    vKImageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    view = vKImageView;
                                }
                                if (view != null) {
                                    view.setOnClickListener(new View.OnClickListener() { // from class: xsna.xrr
                                        /* JADX WARN: Type inference failed for: r1v13, types: [T, xsna.dw20] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            bsr bsrVar2 = bsr.this;
                                            bsrVar2.a();
                                            xgq xgqVar2 = xgqVar;
                                            zgq zgqVar = xgqVar2.c;
                                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                            c5v0.c.C2644c c2644c = new c5v0.c.C2644c(new vlw(zgqVar.a, null), new Size(-1, (int) (Math.min(iah0.f().widthPixels, dw20.e1) * 0.5625f)), false, 4);
                                            c5v0.b bVar4 = new c5v0.b(12, oq.d(tlo0.Companion, zgqVar.b), new tlo0.h(zgqVar.c));
                                            tlo0.h hVar2 = new tlo0.h(zgqVar.d.b);
                                            Activity activity = b9;
                                            ref$ObjectRef.element = new VkModal(VkModal.Mode.Card, new b.a.C0790b(c2644c, bVar4, null, new c5v0.a(new c5v0.a.C2643a(hVar2, new yrr(ref$ObjectRef, bsrVar2, xgqVar2, activity, zgqVar), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6), 52), null, false, 28).b(activity, null);
                                            lh3 lh3Var = bsrVar2.a;
                                            if (lh3Var != null) {
                                                lh3Var.b(xgqVar2.a, FloatingButtonAnalyticsEvent.BUTTON_CLICK);
                                            }
                                        }
                                    });
                                    int i3 = FloatingViewGesturesHelper.f;
                                    FloatingViewGesturesHelper.a.C0787a c0787a = new FloatingViewGesturesHelper.a.C0787a();
                                    c0787a.g = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
                                    c0787a.f = 0.75f;
                                    c0787a.d = new fh1(12, bsrVar, xgqVar);
                                    c0787a.a(view);
                                    bsrVar.i = view;
                                    bsrVar.b.addView(view);
                                    jzc jzcVar = bsrVar.d;
                                    fre freVar = bsrVar.j;
                                    jzcVar.a();
                                    gxp0 gxp0Var = (gxp0) jzcVar.b.b;
                                    jxi jxiVar = new jxi(freVar);
                                    jzcVar.a = jxiVar;
                                    gxp0Var.b(jxiVar);
                                    lh3 lh3Var = bsrVar.a;
                                    if (lh3Var != null) {
                                        lh3Var.b(xgqVar.a, FloatingButtonAnalyticsEvent.BUTTON_SHOW);
                                    }
                                }
                            }
                            vKImageView = null;
                            if (vKImageView != null) {
                            }
                            if (view != null) {
                            }
                        } else {
                            if (!(ygqVar instanceof ygq.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bsrVar.e.getClass();
                            String a4 = cqm0.a(((ygq.a) ygqVar).a);
                            if (a4 != null) {
                                VKImageView vKImageView2 = new VKImageView(b9, null, 6, 0);
                                vKImageView2.o0(a4, null);
                                vKImageView = vKImageView2;
                                if (vKImageView != null) {
                                }
                                if (view != null) {
                                }
                            }
                            vKImageView = null;
                            if (vKImageView != null) {
                            }
                            if (view != null) {
                            }
                        }
                    }
                } else if (uyqVar instanceof uyq.e.c) {
                    uyq.e.c cVar3 = (uyq.e.c) uyqVar;
                    q7eVar.a.a(new a5r.e.c(cVar3.a, cVar3.b));
                } else if (uyqVar instanceof uyq.j) {
                    uyq.j jVar = (uyq.j) uyqVar;
                    q7eVar.a.a(new a5r.j(jVar.b, jVar.a));
                } else if (epx.f(uyqVar, uyq.a.a)) {
                    q7eVar.a.a(a5r.a.a);
                } else {
                    if (!epx.f(uyqVar, uyq.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q7eVar.a.a(a5r.d.a);
                }
                return s3q0.a;
            case 27:
                xde xdeVar = (xde) this.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (List) obj) {
                    Pair pair2 = (Pair) obj4;
                    int i4 = emf.a;
                    boolean a5 = emf.a((ClipVideoFile) pair2.i(), (eed) pair2.j());
                    if (!xdeVar.b) {
                        a5 = !a5;
                    }
                    if (a5) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    arrayList4.add(new uee((ClipVideoFile) pair3.i(), xlf.b((eed) pair3.j()), null));
                }
                Iterator it2 = xdeVar.f.values().iterator();
                while (it2.hasNext()) {
                    ((eoe) it2.next()).h.onNext(arrayList4);
                }
                return s3q0.a;
            case 28:
                fhe fheVar = ((uhe) this.c).a;
                fheVar.getClass();
                io.reactivex.rxjava3.internal.operators.maybe.c0 n = new io.reactivex.rxjava3.internal.operators.maybe.p(new bhe(fheVar, z4 ? 1 : 0)).n(fheVar.b());
                asu0.a.getClass();
                return new io.reactivex.rxjava3.internal.operators.maybe.e0(n.k(asu0.i()), io.reactivex.rxjava3.core.x.i((Throwable) obj));
            default:
                ste steVar = (ste) this.c;
                L.i((Throwable) obj);
                steVar.k.b(zte.b.a);
                steVar.T(vte.a.b);
                return s3q0.a;
        }
    }

    public /* synthetic */ u8(ew8 ew8Var, io.reactivex.rxjava3.core.y yVar) {
        this.b = 11;
        this.c = yVar;
    }
}
