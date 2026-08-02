package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.log.L;
import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ap9;
import xsna.au5;
import xsna.b26;
import xsna.dya;
import xsna.eu4;
import xsna.gkj;
import xsna.ikv0;
import xsna.nab;
import xsna.nv3;
import xsna.tj50;
import xsna.wbu0;
import xsna.x3b;
import xsna.xij;
import xsna.y6d;
import xsna.yg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class za implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v26, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.lists.c cVar;
        an9 state;
        gkj.d dVar;
        UserId userId;
        int i = this.b;
        int i2 = 3;
        int i3 = 12;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i4 = 1;
        int i5 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) obj3;
                int i6 = AbsFriendsAndFollowersTabFragment.X;
                absFriendsAndFollowersTabFragment.fo().h.setText(j03.g(absFriendsAndFollowersTabFragment.mo2getContext(), (Throwable) obj, R.string.error));
                return s3q0.a;
            case 1:
                int i7 = ym0.k1;
                ((View) obj3).setEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 2:
                wbu0.a aVar = (wbu0.a) obj;
                x65 x65Var = (x65) ((iq0) obj3).c.invoke();
                if (x65Var != null) {
                    x65Var.vf(aVar);
                }
                return s3q0.a;
            case 3:
                ((gg1) obj3).C(new a.m((m7a0) obj));
                return s3q0.a;
            case 4:
                ((com.vk.photos.root.albumdetails.presentation.c) obj3).r.submitList(Collections.singletonList(new yxj0(((Boolean) obj).booleanValue())));
                return s3q0.a;
            case 5:
                ((ov3) obj3).a(new wv3(((nv3.d) obj).a));
                return s3q0.a;
            case 6:
                wt4 wt4Var = (wt4) obj3;
                int i8 = wt4.k1;
                if (!(((eu4) obj) instanceof eu4.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wt4Var.hide();
                return s3q0.a;
            case 7:
                final f15 f15Var = (f15) obj3;
                nvy nvyVar = (nvy) obj;
                PlaylistScreenContentType playlistScreenContentType = PlaylistScreenContentType.SPACER;
                nvy.g(nvyVar, null, playlistScreenContentType, lbi.a, 1);
                nvy.g(nvyVar, null, PlaylistScreenContentType.SUMMARY, new jai(1320364734, new ze4(f15Var, i4), true), 1);
                nvy.g(nvyVar, null, playlistScreenContentType, lbi.b, 1);
                nvy.g(nvyVar, null, PlaylistScreenContentType.LIST_HEADER, new jai(-615557124, new z05(f15Var, i5), true), 1);
                final n05 value = f15Var.g.getValue();
                nvyVar.e(value.a.size(), new g15(1, value, n05.class, "itemKey", "itemKey(I)Ljava/lang/Object;", 0, 0), new v7(8), new jai(-1091783928, new zzs() { // from class: xsna.c15
                    @Override // xsna.zzs
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int intValue = ((Integer) obj5).intValue();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj6;
                        int intValue2 = ((Integer) obj7).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar2.o(intValue) ? 32 : 16;
                        }
                        if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1091783928, intValue2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.playlistItems.<anonymous> (AudiobookListContent.kt:298)");
                            }
                            f15.this.c((hlb) value.a.get(intValue), aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, true));
                nvy.g(nvyVar, null, PlaylistScreenContentType.LIST_FOOTER, new jai(-1583518053, new b15(f15Var, i5), true), 1);
                return s3q0.a;
            case 8:
                return new au5.a(((tj50.a) obj).a(new sm0((xt5) obj3), sd9.d));
            case 9:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj3;
                g4l0 g4l0Var = (g4l0) obj;
                int i9 = BonusCatalogFragment.f0;
                if (((g4l0Var instanceof s1l0) || (g4l0Var instanceof q1l0) || (g4l0Var instanceof r1l0)) && (cVar = bonusCatalogFragment.W) != null) {
                    cVar.p(false);
                }
                return s3q0.a;
            case 10:
                u76 u76Var = ((u48) obj3).m;
                if (u76Var != null) {
                    u76Var.C1();
                }
                return s3q0.a;
            case 11:
                xg8 xg8Var = (xg8) obj3;
                yg8.a aVar2 = yg8.a.a;
                if (xg8Var.k) {
                    xg8Var.i.onNext(aVar2);
                }
                return s3q0.a;
            case 12:
                ((com.vk.voip.call_effects.a) obj3).f.onNext(CallEffectsDependency.DynamicLibsState.ERROR);
                return s3q0.a;
            case 13:
                int i10 = CallParticipantsFragment.W;
                ((CallParticipantsFragment) obj3).tn();
                return s3q0.a;
            case 14:
                ((m99) obj3).r();
                return s3q0.a;
            case 15:
                bi9 bi9Var = (bi9) obj3;
                Throwable th = (Throwable) obj;
                bi9Var.d = false;
                CameraUIView cameraUIView = bi9Var.b;
                bm9 presenter = cameraUIView.getPresenter();
                if (presenter != null && (state = presenter.getState()) != null && state.g()) {
                    VkScreenSpinner vkScreenSpinner = cameraUIView.D0;
                    if (vkScreenSpinner != null) {
                        vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Error);
                    }
                    VkScreenSpinner vkScreenSpinner2 = cameraUIView.D0;
                    if (vkScreenSpinner2 != null) {
                        vkScreenSpinner2.setOnCancelListener(null);
                    }
                    cameraUIView.postDelayed(new vb(cameraUIView, i2), 1000L);
                }
                if (th != null) {
                    L.i(th);
                }
                return s3q0.a;
            case 16:
                bp9 bp9Var = (bp9) obj3;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                Contact.LastSeenStatus lastSeenStatus = m0c.a;
                Object obj4 = jgq0.a;
                OnlineInfo a = jgq0.a(usersUserFullDto.U1());
                if (a == null) {
                    a = VisibleStatus.f;
                }
                boolean b = m0c.b(a);
                Serializer.c<? extends Serializer.StreamParcelable> cVar2 = CallsUserId.CREATOR;
                CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(usersUserFullDto.s1());
                fow0 fow0Var = bp9Var.c;
                boolean b2 = fow0Var.b(vkUserId);
                if (!epx.f(usersUserFullDto.o(), Boolean.FALSE) && (!b || !b2)) {
                    fow0Var.a(vkUserId, true);
                    return ap9.a.a;
                }
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                Peer b3 = Peer.a.b(usersUserFullDto.s1().b);
                String K0 = usersUserFullDto.K0();
                String str = K0 == null ? "" : K0;
                String S0 = usersUserFullDto.S0();
                String str2 = S0 == null ? "" : S0;
                boolean z = usersUserFullDto.L2() == BaseSexDto.FEMALE;
                UsersCanNotCallReasonDto p = usersUserFullDto.p();
                if (p == null) {
                    p = UsersCanNotCallReasonDto.PRIVACY_SETTINGS;
                }
                return new ap9.b(new gp9(b3, str, str2, z, p));
            case 17:
                tw9 tw9Var = (tw9) obj3;
                qw9 qw9Var = (qw9) obj;
                if (qw9Var != null && (dVar = tw9Var.a) != null) {
                    gkj gkjVar = gkj.this;
                    sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = gkjVar.b;
                    Iterator it = j5g.u0(((mkj) sj50Var.getCurrentState()).d, ((mkj) sj50Var.getCurrentState()).c).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            hpd0 hpd0Var = (hpd0) next;
                            if (hpd0Var.a == qw9Var.a && (userId = qw9Var.b) != null && Math.abs(hpd0Var.b.b) == Math.abs(userId.b)) {
                                obj2 = next;
                            }
                        }
                    }
                    hpd0 hpd0Var2 = (hpd0) obj2;
                    if (hpd0Var2 != null) {
                        gkjVar.p(qw9Var.c == 0 ? new xij.g(hpd0Var2) : new xij.a(hpd0Var2));
                    }
                }
                return s3q0.a;
            case 18:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, (SuspendLambda) obj3, 3));
            case 19:
                prf prfVar = ((kea) obj3).H;
                if (prfVar != null) {
                    prfVar.invoke();
                }
                return s3q0.a;
            case 20:
                ((yxa) obj3).i.b(dya.a.a);
                L.i((Throwable) obj);
                return s3q0.a;
            case 21:
                ((b2b) obj3).e.d(R.string.vkim_error_unknown);
                return s3q0.a;
            case 22:
                ((ikv0) obj).a();
                ((e4b) obj3).b.invoke(x3b.h.b);
                return s3q0.a;
            case 23:
                nab nabVar = (nab) obj;
                oab oabVar = ((iab) obj3).k1;
                if (oabVar != null) {
                    if (!(nabVar instanceof nab.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = oabVar.a;
                    ikv0.a aVar3 = new ikv0.a(context);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) (objArr3 == true ? 1 : 0), i3);
                    aVar3.u = new ikv0.d(context.getString(R.string.vkim_channels_reaction_quantity_selector_paid_reactions_disabled), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                    aVar3.n();
                }
                return s3q0.a;
            case 24:
                qmb qmbVar = qmb.this;
                qmbVar.l.stop(32);
                b26.this.g(b26.a.CHAT_AUDIO_PLAYER, true, 0L);
                return s3q0.a;
            case 25:
                return new b6p((ViewGroup) obj, (com.vk.im.ui.components.chat_profile.a) obj3);
            case 26:
                tsu tsuVar = ((azb) obj3).k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    if (!hg1.d(xybVar.t)) {
                        int i11 = 19;
                        xybVar.t = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xybVar.l.b(xybVar, new wrm(xybVar.q.a.f, false, xyb.D)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new i22(new v9(xybVar, i11), 7)), new oa4(xybVar, i4)).subscribe(new uyb(new zj(10)), new da(new r6(xybVar, i11), 11));
                    }
                }
                return s3q0.a;
            case 27:
                m7e m7eVar = ClipFeedSideControlsView.r;
                ((ClipFeedSideControlsView) obj3).getControlsUseCases().d.b();
                return s3q0.a;
            case 28:
                ((i1d) obj3).b.a(new f5d(((Integer) obj).intValue()));
                return s3q0.a;
            default:
                ((com.vk.clips.sdk.shared.item.clip.b) obj3).e.getClass();
                return new y6d.c(((tj50.a) obj).a(new ot(i3), ao8.d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za(wzs wzsVar) {
        this.b = 18;
        this.c = (SuspendLambda) wzsVar;
    }
}
