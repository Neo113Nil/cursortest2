package xsna;

import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.api.generated.wall.dto.WallPostResponseDto;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.AudioDevice;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.a7f0;
import xsna.abw0;
import xsna.cwb0;
import xsna.hg1;
import xsna.j1x0;
import xsna.jew0;
import xsna.k9d0;
import xsna.lew0;
import xsna.tj50;
import xsna.tlo0;
import xsna.y1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ixu0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ixu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SharingReason sharingReason;
        tlo0.g c;
        int i = this.b;
        y1x0.a aVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((vjv0) obj).setArea((com.vk.core.view.components.skeleton.a) obj2);
                return s3q0.a;
            case 1:
                ((bqu0) obj2).show();
                return s3q0.a;
            case 2:
                return new abw0.a(((tj50.a) obj).a(new uaw0(1, ((vaw0) obj2).d, saw0.class, "toViewState", "toViewState(Lcom/vk/vmoji/character/recommendations/mvi/VmojiRecommendationsState$Content;)Lcom/vk/vmoji/character/recommendations/mvi/VmojiRecommendationsViewState$RecommendationsData;", 0), ao8.d));
            case 3:
                lcw0 lcw0Var = (lcw0) obj2;
                bzb0.d((bzb0) lcw0Var.j.getValue(), new cwb0.a1(R.string.voip_broadcast_record_finish_submit_dialog_title, null, R.string.voip_broadcast_record_finish_submit_description, null, R.string.voip_broadcast_finish_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new hbj0(lcw0Var, 29), null, null, 28);
                return s3q0.a;
            case 4:
                lew0 lew0Var = (lew0) obj2;
                LinkedList<lew0.a> linkedList = lew0Var.g;
                List list = (List) obj;
                lew0.b bVar = (lew0.b) j5g.Y(list);
                lew0.b bVar2 = (lew0.b) j5g.i0(list);
                if (bVar2 instanceof lew0.b.c) {
                    boolean z = (!(bVar instanceof lew0.b.c) || bVar2 == null) ? ((bVar instanceof lew0.b.a) && (((lew0.b.a) bVar).a instanceof jew0.b)) || (bVar instanceof lew0.b.C3264b) : !epx.f(((lew0.b.c) bVar).a.a, ((lew0.b.c) bVar2).a.a);
                    eew0 eew0Var = ((lew0.b.c) bVar2).a;
                    String str = eew0Var.c;
                    if (z) {
                        linkedList.add(new lew0.a(eew0Var.a, eew0Var.b, new StringBuilder(drm0.t0(str).toString())));
                    } else {
                        linkedList.getLast().c.append(str);
                    }
                    if (linkedList.size() > lew0Var.b) {
                        int size = (linkedList.size() * 2) / 3;
                        for (int i2 = 0; i2 < size; i2++) {
                            linkedList.removeFirst();
                        }
                    }
                    int i3 = lew0Var.a;
                    int i4 = (i3 * 2) / 3;
                    Iterator<lew0.a> it = linkedList.iterator();
                    while (it.hasNext()) {
                        lew0.a next = it.next();
                        if (next.c.length() > i3) {
                            next.c.delete(0, i4);
                        }
                    }
                    kew0 kew0Var = lew0Var.c;
                    io.reactivex.rxjava3.disposables.c cVar = kew0Var.b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kew0Var.b = io.reactivex.rxjava3.kotlin.c.g(io.reactivex.rxjava3.core.a.r(5000L, timeUnit), null, new pvh0(kew0Var, 24), 1);
                    io.reactivex.rxjava3.disposables.c cVar2 = kew0Var.c;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    kew0Var.c = io.reactivex.rxjava3.kotlin.c.g(io.reactivex.rxjava3.core.a.r(10000L, timeUnit), null, new wrl0(kew0Var, 27), 1);
                    lew0Var.a();
                } else if (bVar2 instanceof lew0.b.a) {
                    if (((lew0.b.a) bVar2).a instanceof jew0.a) {
                        linkedList.clear();
                        lew0Var.e.onNext(lew0.b.C3264b.a);
                        lew0Var.a();
                    }
                } else if (!(bVar2 instanceof lew0.b.C3264b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 5:
                ((mjw0) obj2).z();
                return s3q0.a;
            case 6:
                n1x0 n1x0Var = (n1x0) obj2;
                Pair pair = (Pair) obj;
                ProfilesInfo profilesInfo = (ProfilesInfo) pair.d();
                CallsStartResponseDto callsStartResponseDto = (CallsStartResponseDto) pair.g();
                qtd0 Bb = profilesInfo.Bb(n1x0Var.f);
                if (Bb == null) {
                    return s3q0.a;
                }
                boolean ib = Bb.ib();
                Contact.LastSeenStatus lastSeenStatus = m0c.a;
                boolean b = m0c.b(Bb.mb());
                if (!ib && b) {
                    sharingReason = SharingReason.PrivacyAndExpiration;
                    c = n1x0.U(Bb);
                } else if (!ib) {
                    sharingReason = SharingReason.Privacy;
                    c = n1x0.U(Bb);
                } else {
                    if (!b) {
                        L.G("Can't patch init sharing, cause there are no reason for sharing");
                        if (aVar != null) {
                            n1x0Var.T(aVar);
                        }
                        return s3q0.a;
                    }
                    sharingReason = SharingReason.Expiration;
                    String d6 = Bb.d6(UserNameCase.NOM);
                    if (Bb.B2() == UserSex.FEMALE) {
                        tlo0.Companion.getClass();
                        c = tlo0.a.c(R.string.voip_share_link_pager_bottom_sheet_user_female_expired_title, d6);
                    } else {
                        tlo0.Companion.getClass();
                        c = tlo0.a.c(R.string.voip_share_link_pager_bottom_sheet_user_expired_title, d6);
                    }
                }
                SharingReason sharingReason2 = sharingReason;
                tlo0.g gVar = c;
                String d = callsStartResponseDto.d();
                com.vk.voip.ui.share.link.pager.view.b bVar3 = new com.vk.voip.ui.share.link.pager.view.b(d != null ? new CallId(d) : CallId.e, callsStartResponseDto.e(), VoipShareLinkPagerState.TypeControl.SINGLE_SHARE, new vg20(), new j6e0(24));
                hg1.x4 x4Var = new hg1.x4();
                io.reactivex.rxjava3.subjects.f<com.vk.voip.ui.share.link.pager.view.a> fVar = bVar3.h;
                fVar.getClass();
                a7f0.a.e(n1x0Var, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, x4Var).U(new hg1.w4()), null, new csk0(8, n1x0Var, sharingReason2), null, null, 13);
                n1x0Var = n1x0Var;
                n1x0Var.k.a(bVar3.k);
                n1x0Var.h.b(new j1x0.b.c(sharingReason2));
                aVar = new y1x0.a(gVar, bVar3, sharingReason2, Bb);
                if (aVar != null) {
                }
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((u4x0) obj2).e);
            case 8:
                Post post = (Post) obj2;
                post.l.Ab(1073741824L, false);
                int d2 = ((WallPostResponseDto) obj).d();
                xuo0.a.getClass();
                return Post.Nb(post, null, null, d2, null, (int) xuo0.c(), null, null, null, null, -69);
            default:
                Object[] objArr = (Object[]) obj;
                boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                it80 it80Var = (it80) objArr[2];
                boolean booleanValue3 = ((Boolean) objArr[3]).booleanValue();
                boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                boolean booleanValue5 = ((Boolean) objArr[5]).booleanValue();
                boolean booleanValue6 = ((Boolean) objArr[6]).booleanValue();
                AudioDevice audioDevice = (AudioDevice) objArr[7];
                ((ilx0) obj2).getClass();
                k9d0.b bVar4 = new k9d0.b(booleanValue2, it80Var.a() ? new k9d0.a.b(booleanValue4, (b69) it80Var.a) : booleanValue4 ? k9d0.a.c.a : k9d0.a.C3171a.a);
                boolean z2 = booleanValue6 || OKVoipEngine.b.getMediaOptionsForCurrentUser().getAudioState() != MediaOptionState.MUTED_PERMANENT;
                k9d0.e eVar = new k9d0.e(z2, booleanValue6);
                boolean z3 = booleanValue5 || OKVoipEngine.b.getMediaOptionsForCurrentUser().getVideoState() != MediaOptionState.MUTED_PERMANENT;
                k9d0.c cVar3 = new k9d0.c(z3, booleanValue5);
                boolean z4 = !booleanValue;
                boolean z5 = booleanValue3 && !booleanValue2;
                return new jlx0(z4, bVar4, cVar3, eVar, new k9d0.d(((!z5 && z2 && z3) || booleanValue2) ? false : true, booleanValue4, z5), new k9d0.f(audioDevice == AudioDevice.SPEAKER_PHONE, (audioDevice == AudioDevice.WIRED_HEADSET || audioDevice == AudioDevice.BLUETOOTH) ? false : true));
        }
    }
}
