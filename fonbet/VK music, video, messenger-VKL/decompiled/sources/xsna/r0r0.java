package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.discover.Direction;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UserDiscoverState;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.libvideo.api.Subscription;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.superapp.api.dto.restore.VkRestoreConfirmInstantResult;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedAudioSnackBarManager;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.hint.a;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c5v0;
import xsna.dmw0;
import xsna.fxw0;
import xsna.gy50;
import xsna.jy10;
import xsna.l9s0;
import xsna.ncw0;
import xsna.p4x0;
import xsna.srw0;
import xsna.tav;
import xsna.tlw0;
import xsna.tww0;
import xsna.xcw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class r0r0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0r0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Conversation conversation;
        DebugManager debugManager;
        MediaDumpManager mediaDumpManager;
        Bundle b;
        int i = 3;
        boolean z = false;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) this.c).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager != null) {
                        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
                        int i2 = userDiscoverState.f;
                        int i3 = i2 + 1;
                        UserDiscoverSmoothScroller.ScrollType scrollType = UserDiscoverSmoothScroller.ScrollType.ButtonDecline;
                        Direction.a aVar = Direction.Companion;
                        uhq0 uhq0Var = usersDiscoverLayoutManager.c;
                        if ((uhq0Var != null ? uhq0Var.b(i2) : true) && userDiscoverState.a(i3, usersDiscoverLayoutManager.getItemCount())) {
                            userDiscoverState.g = i3;
                            UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(scrollType, usersDiscoverLayoutManager);
                            userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
                            usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                        }
                    }
                }
                return s3q0.a;
            case 1:
                ((RequestUserProfile) obj).v = ((kym0) this.c).a.value;
                return s3q0.a;
            case 2:
                d9r0 d9r0Var = (d9r0) this.c;
                ke3 ke3Var = (ke3) obj;
                int i4 = ke3Var.c;
                String str = ke3Var.d;
                if (str != null) {
                    VkTopBar vkTopBar = d9r0Var.a.d;
                    (vkTopBar != null ? vkTopBar : null).setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
                }
                return s3q0.a;
            case 3:
                svr0 svr0Var = (svr0) this.c;
                mkr0 mkr0Var = svr0Var.m;
                r6q0 r6q0Var = svr0Var.n;
                mkr0Var.B((r6q0Var != null ? r6q0Var : null).b, false);
                return s3q0.a;
            case 4:
                ((VideoAuthorView) this.c).i = (etv0) obj;
                return s3q0.a;
            case 5:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.c;
                View view = (View) obj;
                int i5 = VideoCatalogRootVh.M0;
                if (videoCatalogRootVh.k0().b()) {
                    l9s0.a.a(view.getContext(), null);
                } else {
                    b25 k0 = videoCatalogRootVh.k0();
                    view.getContext();
                    k0.getClass();
                }
                return s3q0.a;
            case 6:
                ((xbs0) this.c).z7((Throwable) obj);
                return s3q0.a;
            case 7:
                VideoDiscoveryRelatedAudioSnackBarManager videoDiscoveryRelatedAudioSnackBarManager = (VideoDiscoveryRelatedAudioSnackBarManager) this.c;
                videoDiscoveryRelatedAudioSnackBarManager.b = null;
                videoDiscoveryRelatedAudioSnackBarManager.c = null;
                return s3q0.a;
            case 8:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                Pair pair = (Pair) obj;
                UserId userId = (UserId) pair.d();
                Subscription subscription = (Subscription) pair.g();
                gVar.J.b(new VideoMinimizableDiscoverySideEffect.i0(subscription));
                gVar.C(new c.a1.f(userId, subscription instanceof Subscription.Subscribed));
                if (subscription instanceof Subscription.a) {
                    gVar.g.a(userId);
                }
                return s3q0.a;
            case 9:
                ((cys0) this.c).i0.a((f8t0) obj);
                return s3q0.a;
            case 10:
                dw20 dw20Var = ((dat0) this.c).b;
                if (dw20Var != null) {
                    String str2 = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
            case 11:
                ((yau0) this.c).i.setLoading(false);
                return s3q0.a;
            case 12:
                ((reu0) this.c).d(true, false);
                return s3q0.a;
            case 13:
                a3v0 a3v0Var = (a3v0) this.c;
                VkLoginConfirmationStatusType vkLoginConfirmationStatusType = ((VkRestoreConfirmInstantResult) obj) == VkRestoreConfirmInstantResult.SUCCESS ? VkLoginConfirmationStatusType.SUCCESS_ALLOW : VkLoginConfirmationStatusType.ALREADY_CONFIRMED;
                v2v0 v2v0Var = (v2v0) a3v0Var.a;
                if (v2v0Var != null) {
                    v2v0Var.oa(vkLoginConfirmationStatusType);
                }
                return s3q0.a;
            case 14:
                ((c5v0.a.C2643a) this.c).b.invoke();
                return s3q0.a;
            case 15:
                wyv0 wyv0Var = (wyv0) this.c;
                com.vk.superapp.verification.account.d dVar = wyv0Var.e;
                if (dVar != null) {
                    dVar.I = true;
                }
                wyv0Var.n(wyv0Var.m().a());
                return s3q0.a;
            case 16:
                lcw0 lcw0Var = (lcw0) this.c;
                xcw0 xcw0Var = (xcw0) obj;
                lcw0Var.i.getClass();
                Object bVar = xcw0Var instanceof xcw0.d ? new ncw0.b(((xcw0.d) xcw0Var).a) : xcw0Var instanceof xcw0.b ? new ncw0.a() : xcw0Var instanceof xcw0.c0 ? ncw0.j.a : xcw0Var instanceof xcw0.p ? ncw0.f.a : xcw0Var instanceof xcw0.q ? ncw0.g.a : xcw0Var instanceof xcw0.o ? ncw0.e.a : xcw0Var instanceof xcw0.b0 ? ncw0.k.a : xcw0Var instanceof xcw0.f0 ? ncw0.m.a : xcw0Var instanceof xcw0.l0 ? new ncw0.o(((xcw0.l0) xcw0Var).a) : xcw0Var instanceof xcw0.u ? ncw0.h.a : xcw0Var instanceof xcw0.j ? new ncw0.c(((xcw0.j) xcw0Var).a) : xcw0Var instanceof xcw0.k ? new ncw0.d(((xcw0.k) xcw0Var).a) : xcw0Var instanceof xcw0.m0 ? new ncw0.p(((xcw0.m0) xcw0Var).a) : xcw0Var instanceof xcw0.z ? new ncw0.i(((xcw0.z) xcw0Var).a) : xcw0Var instanceof xcw0.d0 ? new ncw0.l(((xcw0.d0) xcw0Var).a) : xcw0Var instanceof xcw0.h0 ? new ncw0.n(((xcw0.h0) xcw0Var).a) : null;
                if (bVar != null) {
                    F f = lcw0Var.e;
                    f.getClass();
                    if (bVar instanceof ncw0.b) {
                        if (((ncw0.b) bVar).a) {
                            com.vk.voip.ui.c.b.getClass();
                            rah0 rah0Var = com.vk.voip.ui.c.g;
                            rah0 rah0Var2 = rah0Var != null ? rah0Var : null;
                            rah0Var2.getClass();
                            dcj dcjVar = new dcj(rah0Var2, z, z2 ? 1 : 0);
                            if (i0q0.b()) {
                                dcjVar.invoke();
                            } else {
                                rah0Var2.d.d().c(new d2g0(1, dcjVar));
                            }
                        } else {
                            com.vk.voip.ui.c.b.getClass();
                            rah0 rah0Var3 = com.vk.voip.ui.c.g;
                            (rah0Var3 != null ? rah0Var3 : null).d();
                        }
                    } else if (bVar instanceof ncw0.a) {
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.A(false);
                    } else if (bVar instanceof ncw0.j) {
                        f.c.d(f.a.invoke());
                    } else if (bVar instanceof ncw0.f) {
                        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                        jy10.a aVar2 = new jy10.a(MediaOption.AUDIO);
                        cVar.getClass();
                        com.vk.voip.ui.c.y.onNext(aVar2);
                    } else if (bVar instanceof ncw0.g) {
                        com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
                        jy10.a aVar3 = new jy10.a(MediaOption.VIDEO);
                        cVar2.getClass();
                        com.vk.voip.ui.c.y.onNext(aVar3);
                    } else if (bVar instanceof ncw0.e) {
                        com.vk.voip.ui.c cVar3 = com.vk.voip.ui.c.b;
                        xp80 xp80Var = xp80.a;
                        cVar3.getClass();
                        com.vk.voip.ui.c.S0(xp80Var);
                    } else if (bVar instanceof ncw0.k) {
                        com.vk.voip.ui.c.b.getClass();
                        nav navVar = com.vk.voip.ui.c.S;
                        (navVar != null ? navVar : null).a.a(tav.e.a);
                    } else if (bVar instanceof ncw0.m) {
                        com.vk.voip.ui.c.b.getClass();
                        mnh0 mnh0Var = com.vk.voip.ui.c.s0.l;
                        mnh0Var.getClass();
                        if (BuildInfo.m() && o25.a().i().c) {
                            cvk.u(R.string.settings_archive_started, false);
                            asu0.a.getClass();
                            asu0.n().submit(new qax(mnh0Var));
                        } else if (!L.a()) {
                            cvk.u(R.string.settings_upload_debug_disabled, false);
                        }
                    } else if (bVar instanceof ncw0.c) {
                        f.d.h(((ncw0.c) bVar).a);
                    } else if (bVar instanceof ncw0.d) {
                        wot wotVar = f.e;
                        boolean z3 = ((ncw0.d) bVar).a;
                        if (((Boolean) wotVar.c.invoke()).booleanValue()) {
                            f18 f18Var = wotVar.e.a;
                            qcy<Object> qcyVar = cpt.b[0];
                            f18Var.b(z3);
                        }
                    } else if (bVar instanceof ncw0.p) {
                        ncw0.p pVar = (ncw0.p) bVar;
                        com.vk.voip.ui.c.b.getClass();
                        kcx0 k02 = com.vk.voip.ui.c.k0();
                        boolean z4 = pVar.a;
                        ConversationFeatureManager g = k02.c.g();
                        if (g != null) {
                            if (z4) {
                                ConversationFeatureManager.enableFeatureForAll$default(g, CallFeature.MOVIE_SHARE, null, null, 6, null);
                            } else {
                                ConversationFeatureManager.enableFeatureForRoles$default(g, CallFeature.MOVIE_SHARE, rl3.y0(new CallParticipant.Role[]{CallParticipant.Role.CREATOR, CallParticipant.Role.ADMIN}), null, null, 12, null);
                            }
                        }
                        if (!pVar.a) {
                            f.h.b(new srw0.b.C3687b(srw0.d.a.a, new Pair(MediaOption.MOVIE_SHARING, MediaOptionState.MUTED_PERMANENT)));
                        }
                    } else if (bVar instanceof ncw0.h) {
                        com.vk.voip.ui.c cVar4 = com.vk.voip.ui.c.b;
                        gy50.g gVar2 = gy50.g.a;
                        cVar4.getClass();
                        com.vk.voip.ui.c.S0(gVar2);
                    } else if (bVar instanceof ncw0.i) {
                        com.vk.voip.ui.c cVar5 = com.vk.voip.ui.c.b;
                        boolean z5 = ((ncw0.i) bVar).a;
                        cVar5.getClass();
                        com.vk.voip.ui.c.E(z5);
                    } else if (bVar instanceof ncw0.l) {
                        Map f2 = on00.f(new Pair(MediaOption.SCREEN_SHARING, ((ncw0.l) bVar).a ? MediaOptionState.UNMUTED : MediaOptionState.MUTED_PERMANENT));
                        com.vk.voip.ui.c.b.getClass();
                        com.vk.voip.ui.c.b0().f(f2);
                        f.h.b(new srw0.b.C3687b(srw0.d.a.a, f2));
                    } else if (bVar instanceof ncw0.n) {
                        com.vk.voip.ui.actions.feature.c cVar6 = f.f;
                        boolean z6 = ((ncw0.n) bVar).a;
                        rd9 rd9Var = cVar6.a;
                        com.vk.voip.ui.c.b.getClass();
                        String str3 = com.vk.voip.ui.c.T0.b;
                        Boolean valueOf = Boolean.valueOf(z6);
                        rd9Var.getClass();
                        tfx tfxVar = new tfx("calls.updateCallSettings", new ir(7), new jr(6));
                        tfx.o(tfxVar, "call_id", str3, 0, 0, 12);
                        tfxVar.j(SignalingProtocol.KEY_SHOW_CHAT_HISTORY, valueOf.booleanValue());
                        cVar6.h.b(io.reactivex.rxjava3.kotlin.c.f(7, new io.reactivex.rxjava3.internal.operators.observable.c2(rsg0.y0(yfb.x(tfxVar), null, null, 3), new p5w(new tml0(9), 27)), null, null, null));
                    } else {
                        if (!(bVar instanceof ncw0.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MediaDumpManager.Source source = ((ncw0.o) bVar).a;
                        com.vk.voip.ui.c.b.getClass();
                        p4x0 p4x0Var = com.vk.voip.ui.c.G;
                        io.reactivex.rxjava3.subjects.d<p4x0.b> dVar2 = p4x0Var.b;
                        p4x0.b P0 = dVar2.P0();
                        if (P0 != null) {
                            if (P0.c) {
                                p4x0.b P02 = dVar2.P0();
                                if (P02 != null && P02.c) {
                                    OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                                    if ((oKVoipEngine != null ? oKVoipEngine : null) != null && (conversation = OKVoipEngine.E.getConversation()) != null && (debugManager = conversation.getDebugManager()) != null && (mediaDumpManager = debugManager.getMediaDumpManager()) != null) {
                                        mediaDumpManager.cancelAudioDumpRecord();
                                    }
                                }
                            } else {
                                p4x0Var.f(p4x0.b(source));
                            }
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 17:
                ((tfw0) this.c).h.a((UserId) obj);
                OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
                if (oKVoipEngine2.w()) {
                    if (oKVoipEngine2.w()) {
                        dfs dfsVar = OKVoipEngine.i;
                        if (dfsVar != null) {
                            dfsVar.d(null);
                        }
                        oKVoipEngine2.u(null);
                    }
                    ConversationFactory conversationFactory = OKVoipEngine.x;
                    if (conversationFactory != null) {
                        conversationFactory.reset();
                    }
                }
                return s3q0.a;
            case 18:
                mjw0 mjw0Var = (mjw0) this.c;
                uj8 uj8Var = (uj8) ((it80) obj).a;
                if (uj8Var != null) {
                    com.vk.voip.ui.hint.a aVar4 = mjw0Var.W;
                    aVar4.getClass();
                    qvw0 qvw0Var = uj8Var.b;
                    if (a.EnumC2056a.BroadcastStarted.h() >= aVar4.a()) {
                        String id = qvw0Var.getId();
                        com.vk.voip.ui.c.b.getClass();
                        CallMemberId a = com.vk.voip.ui.c.r.a();
                        if (!epx.f(id, a != null ? a.b : null)) {
                            VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                            io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e((voipDataProvider != null ? voipDataProvider : null).o(qvw0Var.getId()), new e0w0(uj8Var, i), new evh0(11, aVar4, uj8Var));
                            pgn pgnVar = aVar4.h;
                            qcy<Object> qcyVar2 = com.vk.voip.ui.hint.a.m[1];
                            pgnVar.b(e);
                        }
                    }
                }
                return s3q0.a;
            case 19:
                ekw0 ekw0Var = (ekw0) this.c;
                ikv0 ikv0Var = ekw0Var.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                ekw0Var.c = null;
                return s3q0.a;
            case 20:
                ylw0 ylw0Var = (ylw0) this.c;
                dmw0 dmw0Var = (dmw0) obj;
                int i6 = ylw0.x1;
                if (dmw0Var instanceof dmw0.b) {
                    b = yfb.b(new Pair("result_key_change_name", ((dmw0.b) dmw0Var).b));
                } else if (dmw0Var instanceof dmw0.c) {
                    b = yfb.b(new Pair("result_key_change_name", ((dmw0.c) dmw0Var).b));
                } else {
                    if (!(dmw0Var instanceof dmw0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = yfb.b(new Pair("result_key_change_name", ((dmw0.a) dmw0Var).b));
                }
                xn50.a.c(ylw0Var, tlw0.c.a.b);
                ylw0Var.getParentFragmentManager().k0(b, dmw0Var.a());
                return s3q0.a;
            default:
                fxw0.a aVar5 = (fxw0.a) obj;
                tww0.a aVar6 = (tww0.a) ((tww0) this.c);
                if (aVar6 instanceof tww0.a.C3777a) {
                    return fxw0.a.a(aVar5, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33546239);
                }
                if (aVar6 instanceof tww0.a.b) {
                    return fxw0.a.a(aVar5, null, null, 0L, 0L, null, null, null, null, false, false, true, false, false, null, null, null, null, false, null, null, false, false, 33546239);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ r0r0(www0 www0Var, tww0 tww0Var) {
        this.b = 21;
        this.c = tww0Var;
    }
}
