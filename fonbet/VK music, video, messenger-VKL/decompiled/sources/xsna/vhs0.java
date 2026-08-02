package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.esia.dto.EsiaCheckEsiaLinkResponseDto;
import com.vk.api.generated.esia.dto.EsiaEsiaUserInfoDto;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.log.L;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.voip.userid.CallsUserId;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.exo.offline.DownloadInfo;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.dis0;
import xsna.e6w0;
import xsna.i7h0;
import xsna.kr5;
import xsna.n3t0;
import xsna.oo80;
import xsna.tra0;
import xsna.wyv0;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vhs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vhs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.vk.voip.userid.CallsUserId$ContactId] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        je0 N0;
        kz20 kz20Var;
        DownloadInfo.State state;
        DownloadInfo.State state2;
        int i = this.b;
        StickerStockItem stickerStockItem = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((VideoDownloadServiceV2) obj2).o.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 1:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C(new c.y((com.vk.video.ui.discovery.catalog.a) obj));
                return s3q0.a;
            case 2:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                n3t0 n3t0Var = (n3t0) obj;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                if (n3t0Var instanceof n3t0.c) {
                    n3t0.c cVar = (n3t0.c) n3t0Var;
                    if (epx.f(cVar.a, videoMinimizableDiscoveryFragment.S0)) {
                        if (cVar.b) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper != null && (kz20Var = miniPlayerControllersWrapper.s) != null) {
                                e88 e88Var = kz20Var.a.get();
                                if (e88Var != null) {
                                    e88Var.dismiss();
                                    kz20Var.a.clear();
                                }
                                w6s0 w6s0Var = kz20Var.b.get();
                                if (w6s0Var != null) {
                                    gzs<s3q0> gzsVar = w6s0Var.c;
                                    if (gzsVar != null) {
                                        gzsVar.invoke();
                                    }
                                    w6s0Var.c = null;
                                    kz20Var.b.clear();
                                }
                                jgt0 jgt0Var = kz20Var.c.get();
                                if (jgt0Var != null) {
                                    gzs<s3q0> gzsVar2 = jgt0Var.f;
                                    if (gzsVar2 != null) {
                                        gzsVar2.invoke();
                                    }
                                    jgt0Var.f = null;
                                    kz20Var.c.clear();
                                }
                                androidx.appcompat.app.d dVar = kz20Var.d.get();
                                if (dVar != null) {
                                    dVar.dismiss();
                                    kz20Var.d.clear();
                                }
                            }
                            com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                            if (mVar != null) {
                                mVar.k(man.b);
                            }
                            tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                            (tts0Var != null ? tts0Var : null).a.b.setInteractionEnabled(false);
                        } else {
                            com.vk.video.ui.discovery.minimizable.m mVar2 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar2 != null) {
                                mVar2.k(mVar2.e());
                            }
                            tts0 tts0Var2 = videoMinimizableDiscoveryFragment.V;
                            (tts0Var2 != null ? tts0Var2 : null).a.b.setInteractionEnabled(true);
                        }
                    }
                } else if (n3t0Var instanceof n3t0.a) {
                    yg5 io2 = videoMinimizableDiscoveryFragment.io();
                    if (io2 != null && (N0 = io2.N0()) != null) {
                        ((ye0.a) N0).a(true);
                    }
                } else {
                    if (!(n3t0Var instanceof n3t0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.video.ui.discovery.minimizable.m mVar3 = videoMinimizableDiscoveryFragment.J0;
                    if (mVar3 != null) {
                        mVar3.k(mVar3.e());
                    }
                    tts0 tts0Var3 = videoMinimizableDiscoveryFragment.V;
                    (tts0Var3 != null ? tts0Var3 : null).a.b.setInteractionEnabled(true);
                }
                return s3q0.a;
            case 3:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj2;
                VideoFile videoFile = (VideoFile) obj;
                DownloadInfo x = videoOfflineFragment.I0.x(videoFile);
                boolean z = (x == null || (state2 = x.c) == null || state2 == DownloadInfo.State.STATE_COMPLETED) ? false : true;
                boolean z2 = (x == null || (state = x.c) == null || !w8o.d(state)) ? false : true;
                Object obj3 = dis0.t;
                videoOfflineFragment.a1 = dis0.a.b(videoFile, videoOfflineFragment.kn(), z, false, z2, 40);
                return s3q0.a;
            case 4:
                VideoUploadVh videoUploadVh = (VideoUploadVh) obj2;
                Pair pair = (Pair) obj;
                TextView textView = videoUploadVh.t;
                if (textView == null) {
                    textView = null;
                }
                textView.setVisibility(0);
                TextView textView2 = videoUploadVh.t;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText((CharSequence) pair.j());
                VKImageView vKImageView = videoUploadVh.q;
                (vKImageView != null ? vKImageView : null).setImageBitmap((Bitmap) pair.i());
                return s3q0.a;
            case 5:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 6:
                ((jwv0) obj2).d();
                return s3q0.a;
            case 7:
                wyv0 wyv0Var = (wyv0) obj2;
                EsiaCheckEsiaLinkResponseDto esiaCheckEsiaLinkResponseDto = (EsiaCheckEsiaLinkResponseDto) obj;
                com.vk.superapp.verification.account.d dVar2 = wyv0Var.e;
                com.vk.superapp.verification.account.c cVar2 = wyv0Var.d;
                if (dVar2 != null) {
                    dVar2.Gn();
                }
                boolean z3 = esiaCheckEsiaLinkResponseDto.e() == EsiaCheckEsiaLinkResponseDto.UserTypeDto.EDU;
                EsiaEsiaUserInfoDto d = esiaCheckEsiaLinkResponseDto.d();
                cVar2.getClass();
                String g0 = j5g.g0(rl3.I(new String[]{d.e(), d.f()}), " ", null, null, 0, null, 62);
                wdx0 wdx0Var = e370.f;
                String f = (wdx0Var != null ? wdx0Var : null).f();
                wyv0Var.h = new wyv0.a(null, g0, f == null ? "" : f, cVar2.d(esiaCheckEsiaLinkResponseDto.d(), esiaCheckEsiaLinkResponseDto.f()), false, z3);
                wyv0Var.h();
                return s3q0.a;
            case 8:
                m6w0 m6w0Var = (m6w0) obj2;
                icl0 icl0Var = (icl0) obj;
                if (icl0Var instanceof q7w0) {
                    q7w0 q7w0Var = (q7w0) icl0Var;
                    String str = q7w0Var.a;
                    boolean z4 = q7w0Var.b;
                    w6w0 w6w0Var = m6w0Var.f;
                    CharacterContext characterContext = w6w0Var.e;
                    CharacterContext characterContext2 = CharacterContext.MY_CHARACTER;
                    if (characterContext == characterContext2 || (characterContext == CharacterContext.UNKNOWN && epx.f(str, m6w0Var.i.Ab()))) {
                        UserId a = p8w0.a(m6w0Var.i);
                        m6w0Var.i = VmojiAvatar.zb(m6w0Var.i, a + '_' + str, str, false, 28);
                        w6w0Var.e = characterContext2;
                        m6w0Var.C(e6w0.m.b);
                    }
                    if (z4) {
                        t6g0 t6g0Var = t6g0.b;
                        Iterator it = t6g0.d().U().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? next = it.next();
                                if (((StickerStockItem) next).k) {
                                    stickerStockItem = next;
                                }
                            }
                        }
                        StickerStockItem stickerStockItem2 = stickerStockItem;
                        if (stickerStockItem2 != null) {
                            b6m.e().d(m6w0Var.h, stickerStockItem2.b, str);
                        }
                    }
                } else {
                    m6w0Var.C(e6w0.l.b);
                }
                return s3q0.a;
            case 9:
                return new f7w0((ViewGroup) obj, (b8w0) obj2);
            case 10:
                lcw0 lcw0Var = (lcw0) obj2;
                Context mo2getContext = lcw0Var.a.mo2getContext();
                if (mo2getContext != null) {
                    hzy hzyVar = new hzy(mo2getContext, new dck0(lcw0Var, 23));
                    com.vk.voip.ui.c.b.getClass();
                    hzyVar.a(((r6x0) com.vk.voip.ui.c.l0()).o());
                }
                lcw0Var.c.invoke();
                return s3q0.a;
            case 11:
                zhw0 zhw0Var = (zhw0) obj2;
                Contact contact = (Contact) obj;
                Serializer.c<? extends Serializer.StreamParcelable> cVar3 = CallsUserId.CREATOR;
                String str2 = contact.p;
                String str3 = str2 != null ? str2 : "";
                Long n = arm0.n(str3);
                CallsUserId.VkUserId contactId = n == null ? new CallsUserId.ContactId(str3) : new CallsUserId.VkUserId(new UserId(n.longValue()));
                int i3 = (int) contact.b;
                String str4 = contact.c;
                ImageList imageList = contact.h;
                zhw0Var.i.getClass();
                kr5.a aVar = new kr5.a(new g6o0(imageList));
                s3q0 s3q0Var = s3q0.a;
                return new t49(contactId, i3, str4, imageList, aVar.a());
            case 12:
                mjw0 mjw0Var = (mjw0) obj2;
                CallMemberId callMemberId = (CallMemberId) obj;
                OKVoipEngine.b.getClass();
                ConversationParticipant C = OKVoipEngine.C();
                ParticipantId externalId = C != null ? C.getExternalId() : null;
                CallMemberId E = externalId != null ? mnh0.E(externalId) : null;
                boolean f2 = epx.f(mjw0Var.P0.a(), E);
                if (E != null && !E.equals(callMemberId)) {
                    mjw0Var.W.f(E, f2);
                }
                return s3q0.a;
            case 13:
                ((rnw0) obj2).c();
                return s3q0.a;
            default:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) obj2;
                x49 x49Var = (x49) obj;
                if (x49Var instanceof whg) {
                    yhg yhgVar = voipScheduledCallsFragment.X;
                    (yhgVar != null ? yhgVar : null).a((whg) x49Var);
                } else if (x49Var instanceof f6h0) {
                    ((l6h0) voipScheduledCallsFragment.Z.getValue()).a((f6h0) x49Var);
                } else {
                    if (x49Var instanceof oo80) {
                        ro80 ro80Var = (ro80) voipScheduledCallsFragment.a0.getValue();
                        oo80 oo80Var = (oo80) x49Var;
                        Context context = ro80Var.a;
                        if (oo80Var instanceof oo80.b) {
                            ((oo80.b) oo80Var).getClass();
                            new no80(context, ro80Var.b);
                            throw null;
                        }
                        if (!(oo80Var instanceof oo80.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((oo80.a) oo80Var).getClass();
                        throw null;
                    }
                    int i4 = VoipScheduledCallsFragment.c0;
                    if (x49Var instanceof i7h0.a) {
                        voipScheduledCallsFragment.finish();
                    } else {
                        L.G("Unhandled event " + x49Var);
                    }
                }
                return s3q0.a;
        }
    }
}
