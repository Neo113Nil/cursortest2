package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.video.dto.VideoSearchExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.oauth.sber.VkSberBaseActivity;
import com.vk.oauth.sber.verification.VkSberVerificationActivity;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a9m0;
import xsna.bwq0;
import xsna.dis0;
import xsna.eo70;
import xsna.h7u0;
import xsna.ikv0;
import xsna.m5x0;
import xsna.svq0;
import xsna.v6t0;
import xsna.w6v0;
import xsna.wuw0;
import xsna.z5r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ptl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ptl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v103, types: [T, xsna.tny] */
    /* JADX WARN: Type inference failed for: r2v46, types: [T, com.vk.dto.user.SocialButtonType] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair;
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VkEmailForwardingConfig vkEmailForwardingConfig;
        Bundle bundle;
        String str6;
        Object obj2;
        Long n;
        Object obj3;
        int i = this.b;
        int i2 = 2;
        String str7 = "";
        int i3 = 1;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                d220 d220Var = (d220) obj4;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (List) obj) {
                    if (((Boolean) d220Var.invoke(obj5)).booleanValue()) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case 1:
                StoryAttachImageView storyAttachImageView = (StoryAttachImageView) obj4;
                int i4 = StoryAttachImageView.t;
                storyAttachImageView.setImageBitmap((Bitmap) obj);
                storyAttachImageView.n = false;
                storyAttachImageView.p.invoke();
                storyAttachImageView.p = new xs6(27);
                return s3q0.a;
            case 2:
                return Boolean.valueOf(epx.f((sht0) obj, (sht0) obj4));
            case 3:
                ((emh0) obj4).invoke(a9m0.b.b);
                return s3q0.a;
            case 4:
                return new StoryUserViewer((StoryUserProfile) obj, !((Set) obj4).contains(r1.c));
            case 5:
                otz otzVar = (otz) obj4;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"error load story " + otzVar.c()});
                }
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 6:
                ((xzm0) obj4).a.b(a0n0.a);
                ((ikv0) obj).a();
                return s3q0.a;
            case 7:
                ((nvn0) obj4).U((List) obj);
                return s3q0.a;
            case 8:
                zvq0 zvq0Var = (zvq0) obj4;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                zvq0Var.w(wallWithCounters, true);
                zvq0Var.e(new bwq0.a.m(wallWithCounters.m()));
                zvq0Var.e(new bwq0.a.k(wallWithCounters.k()));
                zvq0Var.e(new bwq0.a.f(wallWithCounters.j()));
                zvq0Var.c(new svq0.b.r(wallWithCounters.k(), wallWithCounters.l()));
                return s3q0.a;
            case 9:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj4).U;
                if (usersDiscoverListView != null) {
                    usersDiscoverListView.a();
                }
                return s3q0.a;
            case 10:
                w4r0 w4r0Var = (w4r0) obj4;
                m5r0 m5r0Var = w4r0Var.a;
                int i5 = 14;
                io.reactivex.rxjava3.internal.operators.maybe.x k = new io.reactivex.rxjava3.internal.operators.single.t(rsg0.w0(yfb.x(z5r0.a.a(m5r0Var.d, m5r0Var.a.c().b, Collections.singletonList(1355), null, "vk_video_init", null, m5r0Var.c, 980))), new gs00(new b8j0(m5r0Var, 11), i5)).k(asu0.a.d());
                wvq0 wvq0Var = new wvq0(new u2k0(w4r0Var, i5), i2);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.maybe.b0(new io.reactivex.rxjava3.internal.operators.maybe.b0(k, lVar, wvq0Var, lVar, kVar, kVar), lVar, lVar, new v4r0(new p5e(L.a, 9), 0), kVar, kVar));
            case 11:
                ((Float) obj).floatValue();
                VideoAutoPlaySeekBarView2.a aVar = VideoAutoPlaySeekBarView2.r;
                ((VideoAutoPlaySeekBarView2) obj4).invalidate();
                return s3q0.a;
            case 12:
                dis0 dis0Var = (dis0) obj4;
                VideoFile videoFile = dis0Var.h;
                if (videoFile == null) {
                    videoFile = null;
                }
                new q9o(videoFile.z2()).q();
                if (fxc0.B().J().a0()) {
                    VideoFile videoFile2 = dis0Var.h;
                    if (videoFile2 == null) {
                        videoFile2 = null;
                    }
                    int i6 = dis0.b.$EnumSwitchMapping$0[videoFile2.z2().ordinal()];
                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                        string = dis0Var.getContext().getString(R.string.video_not_downloadable_snack_description_v2);
                    } else if (i6 == 4) {
                        string = dis0Var.getContext().getString(R.string.technical_video_download_restriction_description);
                    } else {
                        if (i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = dis0Var.getContext().getString(R.string.processing_video_download_restriction_description);
                    }
                    pair = new Pair(string, Boolean.FALSE);
                } else {
                    pair = fxc0.B().J().F() ? new Pair(dis0Var.getContext().getString(R.string.video_not_downloadable_snack_description_v2), Boolean.FALSE) : new Pair(dis0Var.getContext().getString(R.string.video_not_downloadable_snack_description), Boolean.TRUE);
                }
                String str8 = (String) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                Activity b = enj.b(dis0Var);
                ikv0.a aVar2 = new ikv0.a(b != null ? new lpj(b, dis0Var.getContext().getTheme()) : dis0Var.getContext());
                if (booleanValue) {
                    aVar2.t = ikv0.c.b.a;
                }
                aVar2.u = new ikv0.d(str8, (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                return s3q0.a;
            case 13:
                v6t0 v6t0Var = (v6t0) obj;
                final wlg wlgVar = (wlg) ((cys0) obj4).W.a;
                FragmentActivity fragmentActivity = wlgVar.a;
                if (v6t0Var instanceof v6t0.b) {
                    final v6t0.b bVar = (v6t0.b) v6t0Var;
                    int i7 = h7u0.p;
                    h7u0.a c = h7u0.b.c(fragmentActivity);
                    c.g0(R.string.vk_video_profile_tell_about_yourself_error_title);
                    c.U(R.string.vk_video_profile_tell_about_yourself_something_wrong);
                    c.W(R.string.cancel, new tlg(wlgVar, 0));
                    c.c0(R.string.vk_video_profile_tell_about_yourself_error_retry, new DialogInterface.OnClickListener() { // from class: xsna.ulg
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            VideoProfileFragmentOld.d dVar = wlg.this.c;
                            dVar.invoke(a.e.b);
                            bVar.getClass();
                            dVar.invoke(new a.c());
                        }
                    });
                    c.a.n = new r86(wlgVar, i3);
                    wlgVar.h = c.m();
                } else if (v6t0Var.equals(v6t0.a.a)) {
                    int i8 = h7u0.p;
                    h7u0.a c2 = h7u0.b.c(fragmentActivity);
                    c2.g0(R.string.vk_video_profile_tell_about_yourself_cancel_are_you_sure);
                    c2.U(R.string.vk_video_profile_tell_about_yourself_cancel_desc);
                    c2.c0(R.string.vk_video_profile_tell_about_yourself_exit, new lv(wlgVar, i3));
                    c2.W(R.string.vk_video_profile_tell_about_yourself_cancel, new mv(wlgVar, i3));
                    c2.a.n = new j2f(wlgVar, i3);
                    wlgVar.h = c2.m();
                } else {
                    if (!v6t0Var.equals(v6t0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    androidx.appcompat.app.d dVar = wlgVar.h;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                    wlgVar.h = null;
                }
                return s3q0.a;
            case 14:
                VideoToolbarView videoToolbarView = (VideoToolbarView) obj4;
                etn etnVar = videoToolbarView.G;
                boolean z = videoToolbarView.C;
                VideoFile videoFile3 = videoToolbarView.E;
                dbs0 dbs0Var = etnVar.f(z, videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null) ? u0t0.a : t6t0.a;
                ebs0 ebs0Var = videoToolbarView.t;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var);
                }
                return s3q0.a;
            case 15:
                ((bpf0) obj4).a = (tny) obj;
                return s3q0.a;
            case 16:
                Intent intent = (Intent) obj;
                FragmentActivity activity = ((f0v0) obj4).getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                    activity.finish();
                }
                return s3q0.a;
            case 17:
                VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) obj;
                w6v0 w6v0Var = ((c7v0) obj4).g;
                if (w6v0Var == null) {
                    w6v0Var = null;
                }
                w6v0Var.getClass();
                switch (w6v0.a.$EnumSwitchMapping$1[verificationMethodTypes.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        com.vk.auth.main.b bVar2 = w6v0Var.d;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        eo70.c.a.b bVar3 = w6v0Var.E;
                        String str9 = (bVar3 == null || (str3 = bVar3.a) == null) ? "" : str3;
                        Context context = w6v0Var.b;
                        if (bVar3 == null || (str = bVar3.a) == null) {
                            str = "";
                        }
                        String a = VkPhoneFormatUtils.a(context, str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12);
                        eo70.c.a.b bVar4 = w6v0Var.E;
                        bVar2.J0(new VerificationScreenData.Phone(str9, a, (bVar4 == null || (str2 = bVar4.b) == null) ? "" : str2, true, null, false, true, false, null, null, null, null, 4016, null), verificationMethodTypes);
                        break;
                    case 10:
                        eo70.c.a.b bVar5 = w6v0Var.E;
                        if (bVar5 == null || (str4 = bVar5.a) == null) {
                            str4 = "";
                        }
                        if (bVar5 == null || (str5 = bVar5.a) == null) {
                            str5 = "";
                        }
                        String A = brm0.A(str5, "+", "");
                        boolean z2 = !drm0.N(A) && TextUtils.isDigitsOnly(A);
                        eo70.c.a.b bVar6 = w6v0Var.E;
                        if (bVar6 != null && (str6 = bVar6.b) != null) {
                            str7 = str6;
                        }
                        FullscreenPasswordData fullscreenPasswordData = new FullscreenPasswordData(str4, z2, str7, true, null, false, 48, null);
                        com.vk.auth.main.b bVar7 = w6v0Var.d;
                        if (bVar7 == null) {
                            bVar7 = null;
                        }
                        bVar7.b1(fullscreenPasswordData);
                        b.a aVar3 = b.a.a;
                        SchemeStatSak$RegistrationFieldItem h = VerificationStatFlow.AUTH.h();
                        try {
                            q55 q55Var = q55.a;
                            bundle = q55.c().a.K;
                        } catch (Throwable unused) {
                        }
                        if (bundle != null) {
                            vkEmailForwardingConfig = m63.d(bundle);
                            aVar3.getClass();
                            b.a.d(h, vkEmailForwardingConfig);
                            break;
                        }
                        vkEmailForwardingConfig = null;
                        aVar3.getClass();
                        b.a.d(h, vkEmailForwardingConfig);
                        break;
                    case 11:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 18:
                return qbv0.k((qbv0) obj4);
            case 19:
                Activity activity2 = (Activity) obj4;
                int i9 = VkSberVerificationActivity.o;
                String str10 = VkSberBaseActivity.n;
                activity2.startActivityForResult(VkSberBaseActivity.a.a(activity2, (String) obj), 114097);
                return s3q0.a;
            case 20:
                low0 low0Var = (low0) obj;
                ((Ref$ObjectRef) obj4).element = low0Var.k;
                return low0.a(low0Var, true, true, 2815);
            case 21:
                rdh0 rdh0Var = (rdh0) obj4;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                sew0 sew0Var = whr0Var != null ? whr0Var.b : null;
                AvatarView avatarView = rdh0Var.b;
                if (sew0Var == null) {
                    avatarView.getClass();
                    Serializer.c<ImageList> cVar = ImageList.CREATOR;
                    avatarView.T0(ImageList.a.c(-1, -1, ""), null);
                } else {
                    x59.a(avatarView, sew0Var);
                }
                return s3q0.a;
            case 22:
                ((nrw0) obj4).K.c(MainMenuBroadcastFeature.Option.RECORD);
                return s3q0.a;
            case 23:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((puw0) obj4).T(new wuw0.a(th));
                return s3q0.a;
            case 24:
                VideoSearchExtendedResponseDto videoSearchExtendedResponseDto = (VideoSearchExtendedResponseDto) obj;
                Integer valueOf = Integer.valueOf(videoSearchExtendedResponseDto.e().size());
                iid iidVar = (iid) ((u98) obj4).c;
                List<VideoVideoFullDto> e = videoSearchExtendedResponseDto.e();
                List<UsersUserDto> f = videoSearchExtendedResponseDto.f();
                List<GroupsGroupFullDto> d = videoSearchExtendedResponseDto.d();
                List<VideoVideoFullDto> list = e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (VideoVideoFullDto videoVideoFullDto : list) {
                    Pair b2 = iid.b(videoVideoFullDto);
                    List list2 = (List) b2.d();
                    String str11 = (String) b2.g();
                    UserId q = videoVideoFullDto.q();
                    if (q == null) {
                        q = UserId.d;
                    }
                    Iterator<T> it = f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((UsersUserDto) obj2).j(), q)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    UsersUserDto usersUserDto = (UsersUserDto) obj2;
                    String str12 = usersUserDto != null ? usersUserDto.f() + ' ' + usersUserDto.k() : null;
                    UserId e2 = fkq0.e(q);
                    if (str12 == null) {
                        Iterator<T> it2 = d.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (epx.f(((GroupsGroupFullDto) obj3).P0(), e2)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj3;
                        str12 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
                        if (str12 == null) {
                            str12 = "";
                        }
                    }
                    Pair pair2 = new Pair(q, str12);
                    UserId userId = (UserId) pair2.d();
                    String str13 = (String) pair2.g();
                    String X1 = videoVideoFullDto.X1();
                    long longValue = (X1 == null || (n = arm0.n(X1)) == null) ? 0L : n.longValue();
                    Integer s1 = videoVideoFullDto.s1();
                    int intValue = s1 != null ? s1.intValue() : 0;
                    String title = videoVideoFullDto.getTitle();
                    arrayList2.add(new p3x0(longValue, intValue, title == null ? "" : title, iidVar.a(videoVideoFullDto), userId, str13, iid.c(videoVideoFullDto), list2, str11));
                }
                return new u6x0(valueOf, arrayList2, videoSearchExtendedResponseDto.getCount());
            case 25:
                return Boolean.valueOf(((t4x0) obj4).a());
            case 26:
                g6x0 g6x0Var = ((f6x0) obj4).b;
                g6x0Var.b.C(new m5x0.d(g6x0Var.a));
                return s3q0.a;
            default:
                ((e1s0) obj4).invoke();
                return s3q0.a;
        }
    }
}
