package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import org.webrtc.RTCStats;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsExtensionsKt;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class khc0 implements pcs, io.reactivex.rxjava3.functions.l, i7f0, Preference.c, r2m, io.reactivex.rxjava3.core.d, zuq0, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ khc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zuq0
    public void B(com.vk.profile.user.impl.ui.f fVar) {
        UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
        int i = UserProfileFragment.p0;
        userProfileFragment.getFeature().B(fVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((gqg) this.c).invoke(obj, obj2);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        int i = SettingsGeneralFragment.z0;
        FragmentActivity activity = settingsGeneralFragment.getActivity();
        jx2 jx2Var = new jx2(new xo4(q6r0.f().y(), 100), new g2j0(activity, activity));
        jx2Var.g = activity;
        jx2Var.a();
        return true;
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        StaticAdsItemViewEvent staticAdsItemViewEvent;
        l340 l340Var = (l340) this.c;
        if (cVar instanceof c.b) {
            staticAdsItemViewEvent = twk0.b;
        } else if (cVar instanceof c.a) {
            staticAdsItemViewEvent = swk0.b;
        } else if (cVar instanceof c.C0669c) {
            staticAdsItemViewEvent = new uwk0(((c.C0669c) cVar).a);
        } else {
            if (!(cVar instanceof c.e) && !(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            staticAdsItemViewEvent = null;
        }
        if (staticAdsItemViewEvent != null) {
            l340Var.a(staticAdsItemViewEvent);
        }
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return RTCStatsExtensionsKt.b((String) this.c, (RTCStats) obj, qcyVar);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        rhc0 rhc0Var = (rhc0) this.c;
        if (str.hashCode() == -300393027 && str.equals("request_donut_teaser")) {
            if (rhc0Var.b.isAdded()) {
                rhc0Var.b.getChildFragmentManager().f("request_donut_teaser");
            }
            if (bundle.containsKey("result_donut_teaser")) {
                xn50.a.c(rhc0Var.c, new PostingAction.Editing.DonutTeaserTextChanged(bundle.getString("result_donut_teaser")));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        switch (this.b) {
            case 5:
                StereoRoomManagerAdaptersKt.cancelPromotionRequest$lambda$0((StereoRoomManager) this.c, bVar);
                return;
            default:
                ((ktz) this.c).getClass();
                throw null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((q8i0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ khc0(ktz ktzVar, smm0 smm0Var) {
        this.b = 7;
        this.c = ktzVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.o) ((d2y) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((q8i0) this.c).invoke(obj);
            case 8:
                return (Result) ((kdw) this.c).invoke(obj);
            case 11:
                return (ncq0) ((cd10) this.c).invoke(obj);
            case 12:
                return (AboutVideoItem.s) ((cd10) this.c).invoke(obj);
            case 14:
                return (MixSettingsEntity) ((l8b0) this.c).invoke(obj);
            default:
                return (VoipActionsFeatureState.d) ((scw0) this.c).invoke(obj);
        }
    }
}
