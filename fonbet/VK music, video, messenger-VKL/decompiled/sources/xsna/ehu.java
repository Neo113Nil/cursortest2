package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.wall.dto.WallGetSuggestedHashtagsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.im.engine.models.managed_groups.ManagedGroupsCounters;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.chu;
import xsna.is60;
import xsna.p1v;
import xsna.tj50;
import xsna.vn20;
import xsna.w9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ehu implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ehu(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        switch (this.b) {
            case 0:
                return chu.a.a;
            case 1:
                return new it80(GroupCallViewModel.h.get((CallMemberId) obj));
            case 2:
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 104) {
                    return io.reactivex.rxjava3.core.q.T(new GroupsGetBannedResponseDto(0, EmptyList.b, null, null, 12, null));
                }
                return io.reactivex.rxjava3.core.q.H(th);
            case 3:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
                qVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.j2(qVar);
            case 4:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67100671);
            case 5:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 6:
                ManagedGroupsCounters managedGroupsCounters = (ManagedGroupsCounters) obj;
                ManagedGroupsCounters.b bVar = managedGroupsCounters.a;
                qcy<Object>[] qcyVarArr = ManagedGroupsCounters.f;
                qcy<Object> qcyVar = qcyVarArr[0];
                Integer num = (Integer) bVar.a().a();
                int intValue = num != null ? num.intValue() : 0;
                ManagedGroupsCounters.b bVar2 = managedGroupsCounters.b;
                qcy<Object> qcyVar2 = qcyVarArr[1];
                Integer num2 = (Integer) bVar2.a().a();
                int intValue2 = num2 != null ? num2.intValue() : 0;
                ManagedGroupsCounters.b bVar3 = managedGroupsCounters.c;
                qcy<Object> qcyVar3 = qcyVarArr[2];
                Integer num3 = (Integer) bVar3.a().a();
                return new ei00(intValue, intValue2, num3 != null ? num3.intValue() : 0);
            case 7:
                return ((Artist) obj).c;
            case 8:
                k720.t.onNext((List) obj);
                return s3q0.a;
            case 9:
                ((zak0) vn20.h).setValue((vn20.b) obj);
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return xl30.a((xl30) obj, 0, -1, null, null, false, false, null, 149);
            case 12:
                return ((a.b.C1154b) obj).a.a;
            case 13:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 14:
                qgi0.r((tgi0) obj, "AudioTrackDeleteButton");
                return s3q0.a;
            case 15:
                if (sua.n((lu60) obj)) {
                    yk60 yk60Var = yk60.a;
                    yk60.m.set(false);
                    yk60.c();
                    ojl ojlVar = yk60.c;
                    io.reactivex.rxjava3.subjects.h hVar = ojlVar.b;
                    if (hVar != null) {
                        hVar.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar2 = ojlVar.b;
                    if (hVar2 != null) {
                        hVar2.onNext(p1v.b.a);
                    }
                    ojlVar.b = null;
                    cl60 cl60Var = yk60.d;
                    io.reactivex.rxjava3.subjects.h hVar3 = cl60Var.b;
                    if (hVar3 != null) {
                        hVar3.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar4 = cl60Var.b;
                    if (hVar4 != null) {
                        hVar4.onNext(p1v.b.a);
                    }
                    cl60Var.b = null;
                } else {
                    yk60 yk60Var2 = yk60.a;
                    yk60.m.set(false);
                    yk60.c();
                    ojl ojlVar2 = yk60.c;
                    io.reactivex.rxjava3.subjects.h hVar5 = ojlVar2.b;
                    if (hVar5 != null) {
                        hVar5.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar6 = ojlVar2.b;
                    if (hVar6 != null) {
                        hVar6.onNext(p1v.b.a);
                    }
                    ojlVar2.b = null;
                    cl60 cl60Var2 = yk60.d;
                    io.reactivex.rxjava3.subjects.h hVar7 = cl60Var2.b;
                    if (hVar7 != null) {
                        hVar7.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar8 = cl60Var2.b;
                    if (hVar8 != null) {
                        hVar8.onNext(p1v.b.a);
                    }
                    cl60Var2.b = null;
                    yk60.n.set(false);
                    yk60.l.set(false);
                    io.reactivex.rxjava3.disposables.c andSet = yk60.g.getAndSet(null);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    io.reactivex.rxjava3.subjects.h hVar9 = ojlVar2.a;
                    if (hVar9 != null) {
                        hVar9.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar10 = ojlVar2.a;
                    if (hVar10 != null) {
                        hVar10.onNext(p1v.b.a);
                    }
                    ojlVar2.a = null;
                    io.reactivex.rxjava3.subjects.h hVar11 = cl60Var2.a;
                    if (hVar11 != null) {
                        hVar11.onNext(p1v.b.a);
                    }
                    io.reactivex.rxjava3.subjects.h hVar12 = cl60Var2.a;
                    if (hVar12 != null) {
                        hVar12.onNext(p1v.b.a);
                    }
                    cl60Var2.a = null;
                    yk60.o.e();
                }
                return s3q0.a;
            case 16:
                xx60 xx60Var = (xx60) obj;
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                CharSequence charSequence = xx60Var.j;
                CharSequence charSequence2 = xx60Var.i;
                ur60 ur60Var = xx60Var.l;
                String str = xx60Var.c;
                String str2 = xx60Var.d;
                if (str == null || str.length() == 0) {
                    UserId userId = xx60Var.b;
                    if (userId == null) {
                        userId = UserId.d;
                    }
                    if (fkq0.b(userId)) {
                        str2 = y8g0.e(R.string.search_on_community_wall);
                    } else if (str2 == null || str2.length() == 0) {
                        str2 = y8g0.e(R.string.search);
                    }
                } else {
                    str2 = y8g0.f(R.string.search_on_wall, str);
                }
                is60.a a = js60.a(ur60Var);
                ListLoadingState listLoadingState = ur60Var.e;
                sq60 sq60Var = ur60Var.b;
                ListLoadingState listLoadingState2 = a.c;
                sq60 sq60Var2 = a.b;
                boolean z = ur60Var.f || (sq60Var.a.isEmpty() && (listLoadingState == ListLoadingState.RELOADING || listLoadingState == ListLoadingState.LOADING));
                boolean z2 = (ur60Var.g && !z) || (sq60Var2.a.isEmpty() && listLoadingState2 == ListLoadingState.ERROR);
                boolean z3 = sq60Var.a.isEmpty() && !z2 && !z && listLoadingState == ListLoadingState.IDLE;
                if (!z3) {
                    charSequence = y8g0.e(R.string.search_empty);
                } else if (charSequence2 != null && charSequence2.length() != 0) {
                    r4 = R.drawable.vk_icon_newsfeed_outline_56;
                    charSequence = charSequence2;
                } else if (charSequence == null || charSequence.length() == 0) {
                    charSequence = y8g0.e(R.string.search_empty);
                }
                return new wy60(str2, new is60.a(sq60Var2, listLoadingState2, z, z2), new bip(r4, charSequence, z3));
            case 17:
                qgi0.r((tgi0) obj, "NotificationsAppBarDots");
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                return ((oh70) obj).f;
            case 20:
                qgi0.r((tgi0) obj, "playlistTopBarMenuIcon");
                return s3q0.a;
            case 21:
                qgi0.r((tgi0) obj, "PostingSettingsRemovePollDialogTitle");
                return s3q0.a;
            case 22:
                qyg0 V0 = ((hyg0) obj).V0("SELECT peerId FROM popup_stickers_chat_settings WHERE animation_autoplay = ?");
                try {
                    V0.bindLong(1, 0);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(Long.valueOf(V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 23:
                return ((WallGetSuggestedHashtagsResponseDto) obj).d();
            case 24:
                int i = ProfileFriendsFragment.k0;
                return ((pno0) obj).d().toString();
            case 25:
                return s3q0.a;
            case 26:
                return new iig0((ViewGroup) obj, 0);
            case 27:
                oio.V1((oio) obj, l5g.c(14, l5g.b, 0.45f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 28:
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof cwr0) {
                    cwr0 cwr0Var = (cwr0) bwr0Var;
                    VideoFile videoFile = cwr0Var.a;
                    obj2 = new dwr0(videoFile != null ? k15.B(videoFile) : null, cwr0Var.b);
                } else if (bwr0Var instanceof fwr0) {
                    fwr0 fwr0Var = (fwr0) bwr0Var;
                    obj2 = new gwr0(fwr0Var.a, fwr0Var.b);
                } else if (!(bwr0Var instanceof hwr0) && !(bwr0Var instanceof jwr0)) {
                    if (bwr0Var instanceof kwr0) {
                        obj2 = new lwr0(((kwr0) bwr0Var).a);
                    } else if (bwr0Var instanceof mwr0) {
                        obj2 = new nwr0(((mwr0) bwr0Var).a);
                    } else if (bwr0Var instanceof rwr0) {
                        obj2 = new swr0(((rwr0) bwr0Var).a);
                    } else if (bwr0Var instanceof ywr0) {
                        obj2 = new zwr0(k15.B(((ywr0) bwr0Var).a));
                    } else if (bwr0Var instanceof axr0) {
                        obj2 = new bxr0(k15.B(((axr0) bwr0Var).a));
                    } else if (bwr0Var instanceof cxr0) {
                        obj2 = new dxr0(k15.B(((cxr0) bwr0Var).a));
                    } else if (bwr0Var instanceof fxr0) {
                        ((fxr0) bwr0Var).getClass();
                        obj2 = new gxr0();
                    } else if (bwr0Var instanceof hxr0) {
                        obj2 = new ixr0(k15.B(((hxr0) bwr0Var).a));
                    } else if (bwr0Var instanceof mxr0) {
                        mxr0 mxr0Var = (mxr0) bwr0Var;
                        obj2 = new nxr0(k15.B(mxr0Var.a), mxr0Var.b, mxr0Var.c, mxr0Var.d);
                    } else if (bwr0Var instanceof oxr0) {
                        oxr0 oxr0Var = (oxr0) bwr0Var;
                        obj2 = new pxr0(k15.B(oxr0Var.a), oxr0Var.b);
                    } else if (bwr0Var instanceof qxr0) {
                        obj2 = new rxr0(k15.B(((qxr0) bwr0Var).a));
                    } else if (bwr0Var instanceof sxr0) {
                        obj2 = new txr0(((sxr0) bwr0Var).a);
                    } else if (bwr0Var.equals(uxr0.a)) {
                        obj2 = vxr0.a;
                    } else if (bwr0Var instanceof wxr0) {
                        wxr0 wxr0Var = (wxr0) bwr0Var;
                        obj2 = new xxr0(k15.B(wxr0Var.a), wxr0Var.b, wxr0Var.c);
                    } else if (bwr0Var instanceof yxr0) {
                        obj2 = new zxr0(k15.B(((yxr0) bwr0Var).a));
                    } else if (bwr0Var.equals(ayr0.a)) {
                        obj2 = byr0.a;
                    } else if (bwr0Var instanceof dyr0) {
                        obj2 = new eyr0(k15.B(((dyr0) bwr0Var).a));
                    } else if (bwr0Var instanceof fyr0) {
                        obj2 = new gyr0(k15.B(((fyr0) bwr0Var).a));
                    } else if (!(bwr0Var instanceof hyr0) && !(bwr0Var instanceof iyr0) && !(bwr0Var instanceof ewr0) && !(bwr0Var instanceof owr0) && !(bwr0Var instanceof iwr0) && !(bwr0Var instanceof qwr0) && !(bwr0Var instanceof enc) && !(bwr0Var instanceof pwr0) && !(bwr0Var instanceof twr0) && !(bwr0Var instanceof uwr0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new it80(obj2);
            default:
                tj50.a aVar = (tj50.a) obj;
                oi40 oi40Var = new oi40(13);
                ao8 ao8Var = ao8.d;
                return new w9i0.d(aVar.a(oi40Var, ao8Var), aVar.a(new per(23), ao8Var), aVar.a(new viu(19), ao8Var), aVar.a(new e750(11), ao8Var));
        }
    }

    public /* synthetic */ ehu(js60 js60Var) {
        this.b = 16;
    }
}
