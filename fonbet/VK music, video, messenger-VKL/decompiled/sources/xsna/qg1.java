package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog.mvi.block.impl.LinksSmallListView;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.autoplay.b;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.a5r;
import xsna.bja0;
import xsna.ios;
import xsna.j2o0;
import xsna.rv9;
import xsna.uuf;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qg1(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ProfilesInfo profilesInfo;
        npf h;
        ExposedFunction invoke$lambda$31;
        fvk initialize$lambda$220$lambda$18;
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                int i2 = AlbumDetailsFragment.p0;
                xn50.a.c((AlbumDetailsFragment) obj2, new a.j.b.C1480a((String) obj));
                return s3q0.a;
            case 1:
                p0e0.a(((ExtendedCommunityProfile) obj2).a.c, "vk_call_confirm", (String) obj);
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(new rv9.i.b((a.C0919a) obj));
                return s3q0.a;
            case 3:
                ProfilesInfo profilesInfo2 = (ProfilesInfo) obj;
                DialogExt dialogExt = ((gpb) obj2).i;
                if (dialogExt != null && (profilesInfo = dialogExt.b) != null) {
                    profilesInfo.Hb(profilesInfo2);
                }
                return s3q0.a;
            case 4:
                a5r.g gVar = (a5r.g) obj2;
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                if (!(((a5r.g.a) gVar) instanceof a5r.g.a.C2526a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = ClipFeedListFragment.a2;
                clipFeedListFragment.Do().getFeature().a(((a5r.g.a.C2526a) gVar).a);
                return s3q0.a;
            case 5:
                return o1d.F((o1d) obj2, (pb) obj);
            case 6:
                ((izs) obj2).invoke(((ClipCoauthorListVS.Owner) obj).a);
                return s3q0.a;
            case 7:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                b.C1208b.a().e(((s2f) ((hwe) obj2).c.getValue()).a((SdkVideoFile) obj), null).B0().stop();
                return s3q0.a;
            case 8:
                ((d6f) obj2).c.a((a7f) obj);
                return s3q0.a;
            case 9:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i4 = ClipsWrapperFragment.Q0;
                ppf o = ((uuf.d) obj2).o();
                if (o != null && (h = o.h()) != null) {
                    xn50.a.c(clipsWrapperFragment, h);
                }
                return s3q0.a;
            case 10:
                ((gzs) obj2).invoke();
                ((jqp) obj).a.D = null;
                return s3q0.a;
            case 11:
                invoke$lambda$31 = HandleInvocationsFromAdViewer.invoke$lambda$31((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$31;
            case 12:
                com.vk.photo.editor.features.mlenhance.a aVar = (com.vk.photo.editor.features.mlenhance.a) obj2;
                aVar.b.removeView((View) obj);
                aVar.h = false;
                return s3q0.a;
            case 13:
                Activity activity = (Activity) obj2;
                p7y p7yVar = (p7y) obj;
                quv0 quv0Var = new quv0();
                quv0Var.a = activity.getString(R.string.vk_vkpay_touch_id_dialog_title);
                quv0Var.b = activity.getString(R.string.vk_vkpay_touch_id_dialog_subtitle);
                int i5 = 22;
                quv0Var.c = new l2k(p7yVar, i5);
                quv0Var.d = new m2j(p7yVar, i5);
                quv0Var.e = new qbj(p7yVar, 23);
                quv0Var.a((FragmentActivity) activity);
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new LinksSmallListView.b(((LinksSmallListView.d) obj).b));
                return s3q0.a;
            case 15:
                f840 f840Var = (f840) obj2;
                return new kx5(f840Var.a, (y400) obj, f840Var.j, f840Var.i);
            case 16:
                wk50 wk50Var = (wk50) obj;
                for (kj50 kj50Var : (kj50[]) obj2) {
                    m200.h.getClass();
                    wk50Var.N(wk50Var.c.b(), kj50Var);
                }
                return s3q0.a;
            case 17:
                Intent intent = (Intent) obj2;
                Context context = (Context) obj;
                if (com.vk.toggle.d.B().b) {
                    Toast.makeText(context, R.string.video_watch_later_toast, 0).show();
                } else {
                    String stringExtra = intent.getStringExtra("url");
                    c.a aVar2 = com.vk.pushes.receivers.c.b;
                    c.a.g(context, stringExtra, intent);
                }
                return s3q0.a;
            case 18:
                ((rhc0) obj2).c((Date) obj);
                return s3q0.a;
            case 19:
                return ((Regex) obj2).b((CharSequence) obj);
            case 20:
                initialize$lambda$220$lambda$18 = ServiceProvider.initialize$lambda$220$lambda$18((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$18;
            case 21:
                izs izsVar = (izs) obj2;
                j2o0.a aVar3 = (j2o0.a) obj;
                boolean z = aVar3.d;
                int i6 = aVar3.a;
                izsVar.invoke(z ? new c2o0(i6) : new a2o0(i6));
                return s3q0.a;
            case 22:
                rlq0 rlq0Var = (rlq0) obj2;
                rlq0Var.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FRIEND_OUT);
                rlq0Var.e((ExtendedUserProfile) obj, ios.c.a);
                return s3q0.a;
            default:
                try {
                    ((bja0.a) obj2).a(4331, ((acs0) obj).a);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                return s3q0.a;
        }
    }
}
