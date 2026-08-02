package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.voip.VoipCallSource;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.video.channel.aboutchannel.AboutChannelArguments;
import com.vk.video.channel.aboutchannel.AdditionalInfoDo;
import com.vk.video.channel.aboutchannel.AuthorsChannelInfoDo;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.aem0;
import xsna.asl0;
import xsna.atq0;
import xsna.bwq0;
import xsna.edl0;
import xsna.f6x0;
import xsna.f6x0.c;
import xsna.gy50;
import xsna.jy10;
import xsna.kkl0;
import xsna.mut0;
import xsna.w6t0;
import xsna.wuw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class svk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ svk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId c;
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        int i2 = 6;
        Object[] objArr = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return com.vk.clips.sdk.shared.item.static_ads.c.n((com.vk.clips.sdk.shared.item.static_ads.c) obj2, (ylj) obj);
            case 1:
                return new nfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) obj2).m);
            case 2:
                edl0 edl0Var = (edl0) obj2;
                return new edl0.b(edl0Var.j, (ViewGroup) obj, edl0Var.i);
            case 3:
                return jfl0.k((jfl0) obj2, (tx40) obj);
            case 4:
                return ((mol0) obj).m(uoi0.l((uoi0) obj2, false, null, 4194303));
            case 5:
                ((gpl0) obj2).e(kkl0.d.a);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(!((StoryCameraParams.a) obj2).h.contains((StoryCameraMode) obj));
            case 7:
                emh0 emh0Var = (emh0) obj2;
                a9m0 a9m0Var = (a9m0) obj;
                if (a9m0Var != null) {
                    emh0Var.invoke(a9m0Var);
                }
                return s3q0.a;
            case 8:
                hem0 hem0Var = (hem0) obj2;
                int i3 = hem0.y1;
                aem0.k kVar = new aem0.k((StoryPrivacyType) obj);
                hem0Var.getClass();
                xn50.a.c(hem0Var, kVar);
                return s3q0.a;
            case 9:
                int i4 = StreamInfoFragment.S;
                ((StreamInfoFragment) obj2).tn();
                return s3q0.a;
            case 10:
                ((rg50) obj2).C((int) (((tny) obj).a() & 4294967295L));
                return s3q0.a;
            case 11:
                sco0 sco0Var = (sco0) obj2;
                tdu tduVar = (tdu) obj;
                l5g l5gVar = (l5g) ((zak0) sco0Var.f).getValue();
                tduVar.b((!(l5gVar != null ? l5g.d(l5gVar.a, l5g.k) : false) || sco0Var.c()) ? 1.0f : 0.64f);
                return s3q0.a;
            case 12:
                int i5 = TypedDocumentsListFragment.e0;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = ((TypedDocumentsListFragment) obj2).T;
                if (vkRecyclerPaginatedView != null) {
                    vkRecyclerPaginatedView.fj(null, null);
                }
                return s3q0.a;
            case 13:
                fpq0 fpq0Var = ((ynq0) obj2).h;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.h(new atq0.f(Integer.valueOf(R.string.gift_delete_error), null, null, 14)));
                return s3q0.a;
            case 14:
                UserProfileFragment userProfileFragment = (UserProfileFragment) obj2;
                int i6 = UserProfileFragment.p0;
                UserId userId = ((asl0.a) obj).b;
                Bundle arguments = userProfileFragment.getArguments();
                if (arguments == null || (c = (UserId) arguments.getParcelable("id")) == null) {
                    c = userProfileFragment.ko().c();
                }
                return Boolean.valueOf(epx.f(userId, c));
            case 15:
                isq0 isq0Var = (isq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                es60 es60Var = isq0Var.f;
                return odq.c(es60Var.a, new xc3(wallWithCounters, null, es60Var.b, isq0Var.g, null, false, null)).l(new vtg0(new ehm0(wallWithCounters, 5), i2));
            case 16:
                Boolean bool = (Boolean) obj;
                u5p0 u5p0Var = ((stq0) obj2).e;
                (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.s.e.d(bool.booleanValue()));
                return s3q0.a;
            case 17:
                zvq0 zvq0Var = (zvq0) obj2;
                WallWithCounters wallWithCounters2 = (WallWithCounters) obj;
                zvq0Var.w(wallWithCounters2, false);
                zvq0Var.e(new bwq0.a.m(wallWithCounters2.m()));
                zvq0Var.e(new bwq0.a.f(wallWithCounters2.j()));
                return s3q0.a;
            case 18:
                w6t0 w6t0Var = (w6t0) obj;
                wlg wlgVar = (wlg) ((cys0) obj2).W.a;
                ?? r5 = wlgVar.g;
                m8t0 m8t0Var = wlgVar.f;
                if (w6t0Var instanceof w6t0.a) {
                    xas0 xas0Var = wlgVar.b;
                    w6t0.a aVar = (w6t0.a) w6t0Var;
                    long j = aVar.a;
                    String str = aVar.b;
                    String str2 = aVar.g;
                    AdditionalInfoDo additionalInfoDo = new AdditionalInfoDo(aVar.c, AdditionalInfoDo.AdditionalInfoType.SUBSCRIBERS_COUNT);
                    AdditionalInfoDo additionalInfoDo2 = new AdditionalInfoDo(aVar.d, AdditionalInfoDo.AdditionalInfoType.VIDEO_COUNT);
                    Long l = aVar.f;
                    new AboutChannelArguments(new AuthorsChannelInfoDo(j, str, rl3.I(new AdditionalInfoDo[]{additionalInfoDo, additionalInfoDo2, l != null ? new AdditionalInfoDo(l.longValue(), AdditionalInfoDo.AdditionalInfoType.VIEWERS_COUNT) : null, aVar.e != null ? new AdditionalInfoDo(r15.intValue(), AdditionalInfoDo.AdditionalInfoType.DATE_MS) : null}), str2));
                    xas0Var.getClass();
                } else if (w6t0Var.equals(w6t0.c.a)) {
                    if (((Boolean) r5.getValue()).booleanValue()) {
                        FragmentActivity fragmentActivity = m8t0Var.a.a;
                        ViewGroup viewGroup = (ViewGroup) fragmentActivity.getWindow().getDecorView();
                        ((zak0) m8t0Var.b).setValue(Boolean.TRUE);
                        ComposeView composeView = new ComposeView(fragmentActivity, null, 6);
                        composeView.setViewCompositionStrategy(mut0.a.a);
                        composeView.setContent(new jai(-311449990, new k77(m8t0Var, viewGroup, composeView, i2), true));
                        viewGroup.addView(composeView);
                    } else {
                        wx20.c(wlgVar.e, wlgVar.a, "PROFILE_MORE", 0, 0, 28);
                    }
                } else if (w6t0Var.equals(w6t0.b.a)) {
                    if (((Boolean) r5.getValue()).booleanValue()) {
                        ((zak0) m8t0Var.b).setValue(Boolean.FALSE);
                    } else {
                        wlgVar.e.d();
                    }
                    ik70 ik70Var = wlgVar.i;
                    if (ik70Var != null) {
                        ik70Var.dismiss();
                    }
                    wlgVar.i = null;
                } else {
                    if (!(w6t0Var instanceof w6t0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wlgVar.d.a().subscribe(new vlg(objArr == true ? 1 : 0, wlgVar, (w6t0.d) w6t0Var));
                }
                return s3q0.a;
            case 19:
                ((qwv0) obj2).d();
                return s3q0.a;
            case 20:
                ((zhw0) obj2).k.b(new eiw0((qtd0) obj, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES, MobileOfficialAppsCoreNavStat$EventScreen.CALLS)));
                return s3q0.a;
            case 21:
                f69 f69Var = ((mjw0) obj2).S0;
                jy10 jy10Var = (jy10) obj;
                if (jy10Var instanceof jy10.a) {
                    f69Var.a(new gy50.b(((jy10.a) jy10Var).a));
                } else {
                    if (!(jy10Var instanceof jy10.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((jy10.b) jy10Var).getClass();
                    f69Var.a(new gy50.l(null, null));
                }
                return s3q0.a;
            case 22:
                AvatarView avatarView = ((rdh0) obj2).b;
                avatarView.getClass();
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                avatarView.T0(ImageList.a.c(-1, -1, ""), null);
                L.i((Throwable) obj);
                return s3q0.a;
            case 23:
                ((nrw0) obj2).K.c(MainMenuBroadcastFeature.Option.STREAM);
                return s3q0.a;
            case 24:
                ((puw0) obj2).T((wuw0.b) obj);
                return s3q0.a;
            default:
                f6x0 f6x0Var = (f6x0) obj2;
                f6x0.c cVar3 = f6x0Var.f;
                if (cVar3 != null && (cVar = cVar3.c) != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = f6x0Var.e;
                f6x0.c cVar4 = f6x0Var.new c();
                p1Var.subscribe(cVar4);
                f6x0Var.f = cVar4;
                return s3q0.a;
        }
    }
}
