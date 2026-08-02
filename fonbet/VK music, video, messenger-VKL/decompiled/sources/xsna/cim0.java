package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsRecomThemeDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import java.io.InputStream;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aig;
import xsna.cqw0;
import xsna.dw20;
import xsna.fxw0;
import xsna.itk0;
import xsna.pbt0;
import xsna.rhw0;
import xsna.tra0;
import xsna.tww0;
import xsna.yt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cim0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cim0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String b9yVar;
        String b9yVar2;
        View inflate;
        int i = this.b;
        int i2 = 29;
        JSONArray jSONArray = null;
        jSONArray = null;
        int i3 = 1;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.d) obj2).c.invoke(new i.b((StoryUserViewer) obj));
                return s3q0.a;
            case 1:
                mom0 mom0Var = (mom0) obj2;
                InputStream inputStream = (InputStream) obj;
                try {
                    RootResponseDto g = mom0Var.a.g(inputStream);
                    Object c = g.c();
                    Object invoke = c != null ? mom0Var.c.invoke(c) : null;
                    x9y a = g.a();
                    JSONObject jSONObject = (a == null || (b9yVar2 = a.toString()) == null) ? null : new JSONObject(b9yVar2);
                    l8y b = g.b();
                    if (b != null && (b9yVar = b.toString()) != null) {
                        jSONArray = new JSONArray(b9yVar);
                    }
                    per0 per0Var = new per0(invoke, jSONObject, jSONArray);
                    inputStream.close();
                    return per0Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(inputStream, th);
                        throw th2;
                    }
                }
            case 2:
                gzm0 gzm0Var = (gzm0) obj2;
                gzm0Var.b.jo(gzm0Var.b(true));
                return s3q0.a;
            case 3:
                r4n0.this.f.a.f(new vxf0());
                return s3q0.a;
            case 4:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 5:
                ryq0 ryq0Var = (ryq0) obj2;
                RecomSettingsRecomThemeDto recomSettingsRecomThemeDto = (RecomSettingsRecomThemeDto) obj;
                return !ryq0Var.h.contains(String.valueOf(recomSettingsRecomThemeDto.getId())) ? ghp.a : new ulp0(new i5g(recomSettingsRecomThemeDto.f()), new xd40(ryq0Var, i2));
            case 6:
                UsersDiscoverFragment usersDiscoverFragment = (UsersDiscoverFragment) obj2;
                int i4 = UsersDiscoverFragment.t0;
                if (obj instanceof UserDiscoverItem) {
                    UserDiscoverItem userDiscoverItem = (UserDiscoverItem) obj;
                    FragmentActivity activity = usersDiscoverFragment.getActivity();
                    if (activity != null) {
                        if (usersDiscoverFragment.getActivity() == null || (inflate = LayoutInflater.from(usersDiscoverFragment.getActivity()).inflate(R.layout.friend_request_message_modal, (ViewGroup) null)) == null) {
                            inflate = null;
                        } else {
                            VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.friend_request_message_photo);
                            TextView textView = (TextView) inflate.findViewById(R.id.friend_request_message_name);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.friend_request_message_text);
                            vKImageView.load(userDiscoverItem.h);
                            textView.setText(userDiscoverItem.e);
                            textView2.setText(userDiscoverItem.h0);
                        }
                        if (inflate != null) {
                            new dw20.b(activity, null).D0(inflate, false).q0(true).v0(R.string.friend_request_message_title).m(R.attr.vk_ui_background_content).c(new jgj(inflate, 0, 0, 62)).x(0).u(0).I0(null);
                        }
                    }
                }
                return s3q0.a;
            case 7:
                pvr0 pvr0Var = (pvr0) obj2;
                CallSettingsItem.TitleHeader titleHeader = pvr0Var.m;
                CallSettingsItem.TitleHeader.a aVar = titleHeader != null ? titleHeader.d : null;
                com.vk.movika.sdk.base.observable.a aVar2 = pvr0Var.n;
                if (aVar != null && aVar2 != null) {
                    if (!(aVar instanceof CallSettingsItem.TitleHeader.a.C2088a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.invoke(new j.b(((CallSettingsItem.TitleHeader.a.C2088a) aVar).a));
                }
                return s3q0.a;
            case 8:
                ((io.reactivex.rxjava3.core.r) obj2).onNext((Integer) obj);
                return s3q0.a;
            case 9:
                VideoEndView videoEndView = (VideoEndView) obj2;
                View view = (View) obj;
                int i5 = VideoEndView.z;
                Set<View> set = g6z.a;
                PlayButton playButton = videoEndView.d;
                VideoEndView.a aVar3 = videoEndView.j;
                if (aVar3 != null && !aVar3.a) {
                    z = true;
                }
                g6z.c(playButton, playButton, z, true, 48);
                videoEndView.b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType.LIKE);
                View.OnClickListener onClickListener = videoEndView.i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 10:
                yt ytVar = (yt) obj;
                kis0 kis0Var = (kis0) ((VideoItemListLargeVh) obj2).h0.getValue();
                lis0 lis0Var = kis0Var.b;
                boolean equals = ytVar.equals(yt.b.a);
                itk0 itk0Var = itk0.a.a;
                if (equals) {
                    kis0Var.b(CommonUxpollsStat$TypeUxpollsEvent.EventType.HIDE);
                    lis0Var.a(itk0Var);
                } else if (ytVar.equals(yt.a.a)) {
                    kis0Var.b(CommonUxpollsStat$TypeUxpollsEvent.EventType.UNDO_COMPLETE);
                    itk0.b bVar = kis0Var.e;
                    if (bVar != null) {
                        itk0Var = bVar;
                    }
                    lis0Var.a(itk0Var);
                } else if (ytVar instanceof yt.d) {
                    yt.d dVar = (yt.d) ytVar;
                    mis0 mis0Var = (mis0) kis0Var.f.getValue();
                    VideoFile videoFile = kis0Var.c;
                    String r = videoFile != null ? videoFile.r() : null;
                    String str = kis0Var.d;
                    itk0.b bVar2 = kis0Var.e;
                    mis0Var.b(r, str, bVar2 != null ? Integer.valueOf(bVar2.a) : null, dVar.a);
                    lis0Var.a(itk0Var);
                    lis0Var.b();
                } else {
                    if (!ytVar.equals(yt.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kis0Var.b(CommonUxpollsStat$TypeUxpollsEvent.EventType.COMPLETE);
                }
                return s3q0.a;
            case 11:
                pbt0.a aVar4 = (pbt0.a) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = aVar4.C;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                aVar4.C = cVar;
                return s3q0.a;
            case 12:
                yau0 yau0Var = (yau0) obj2;
                long appId = yau0Var.b.getAppId();
                vdx0 vdx0Var = e370.e;
                io.reactivex.rxjava3.core.q<Boolean> y = (vdx0Var != null ? vdx0Var : null).d().y(appId);
                eiy eiyVar = new eiy(new xau0(yau0Var, z ? 1 : 0), 28);
                y.getClass();
                yau0Var.f.b(new io.reactivex.rxjava3.internal.operators.observable.c0(y, eiyVar, io.reactivex.rxjava3.internal.functions.a.c).F(new lkz(new r0r0(yau0Var, 11), i2)).subscribe(new miq0(new j6l0(yau0Var, 23), i3), new wbs0(new p5e(yau0Var, 11), 2)));
                return s3q0.a;
            case 13:
                yzu0 yzu0Var = (yzu0) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof VKApiException) {
                    Toast.makeText(yzu0Var.b.getContext(), ((VKApiException) th3).getLocalizedMessage(), 0).show();
                }
                return s3q0.a;
            case 14:
                zhw0 zhw0Var = (zhw0) obj2;
                if (!((VoipCallServiceBannerHandler.b) obj).equals(VoipCallServiceBannerHandler.b.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zhw0Var.C(rhw0.a0.b);
                return s3q0.a;
            case 15:
                com.vk.voip.ui.actions.feature.c cVar3 = (com.vk.voip.ui.actions.feature.c) obj2;
                cVar3.d(cVar3.d.b().b);
                return s3q0.a;
            case 16:
                ((cqw0.a) obj2).l.invoke();
                return s3q0.a;
            case 17:
                fxw0.a aVar5 = (fxw0.a) obj;
                ScheduledWatchTogetherOption scheduledWatchTogetherOption = aVar5.u;
                tww0.v vVar = (tww0.v) ((tww0) obj2);
                if (vVar instanceof tww0.v.a) {
                    return fxw0.a.a(aVar5, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, ScheduledWatchTogetherOption.a(scheduledWatchTogetherOption, false), false, null, null, false, false, 33030143);
                }
                if (vVar instanceof tww0.v.b) {
                    return fxw0.a.a(aVar5, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, ScheduledWatchTogetherOption.a(scheduledWatchTogetherOption, true), false, null, null, false, false, 33030143);
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                ((VoipScheduledCallsFragment) obj2).T.a(aig.f.a);
                return s3q0.a;
            case 19:
                xkx0 xkx0Var = (xkx0) obj2;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = xkx0Var.p;
                Bundle bundle = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle != null) {
                    m63.m(bundle, authExternalFlowOutResponseDto.d());
                }
                tkx0 tkx0Var = (tkx0) xkx0Var.a;
                if (tkx0Var != null) {
                    tkx0Var.e();
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((Class) obj2).isAssignableFrom(((Attach) obj).getClass()));
            default:
                ((y0y0) obj2).c("button");
                return s3q0.a;
        }
    }

    public /* synthetic */ cim0(www0 www0Var, tww0 tww0Var) {
        this.b = 17;
        this.c = tww0Var;
    }
}
