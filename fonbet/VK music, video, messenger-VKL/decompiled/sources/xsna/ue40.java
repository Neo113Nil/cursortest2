package xsna;

import android.content.Context;
import android.text.ClipboardManager;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.fave.MarketFavable;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.imageloader.ImageScreenSize;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.search.ui.api.SearchQuery;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e8v0;
import xsna.qs80;
import xsna.s3a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ue40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ue40(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Class<? extends FragmentImpl> x;
        switch (this.b) {
            case 0:
                we40 we40Var = (we40) this.c;
                UIBlockLink uIBlockLink = (UIBlockLink) this.d;
                te40 te40Var = we40Var.u;
                return (myc0.f(uIBlockLink.y.d) ? te40Var.c(uIBlockLink) : te40Var.a(uIBlockLink)).w();
            case 1:
                MusicFollowCuratorButtonVh musicFollowCuratorButtonVh = (MusicFollowCuratorButtonVh) this.c;
                UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = (UIBlockActionCuratorSubscription) this.d;
                musicFollowCuratorButtonVh.f = null;
                uIBlockActionCuratorSubscription.A = true;
                musicFollowCuratorButtonVh.b(true);
                return s3q0.a;
            case 2:
                one.video.player.tracks.c cVar = (one.video.player.tracks.c) this.c;
                ks80 ks80Var = (ks80) this.d;
                String str = (String) obj;
                lk3 lk3Var = new lk3();
                lk3 lk3Var2 = new lk3();
                if (cVar != null) {
                    cms0 cms0Var = (cms0) cVar.c;
                    lk3Var2.b("videoTrack.formatId", String.valueOf(cms0Var.a));
                    lk3Var2.b("videoTrack.sampleMimeType", String.valueOf(cms0Var.b));
                    lk3Var2.b("videoTrack.type", cVar.a.name());
                    lk3Var2.a(cms0Var.d, "videoTrack.bitrate");
                    lk3Var2.c(cms0Var.g, "videoTrack.frameRate");
                    lk3Var2.b("videoTrack.frameSize", cms0Var.b().name() + ':' + cms0Var.b().getWidth() + 'x' + cms0Var.b().getHeight());
                    lk3Var2.a((long) cms0Var.e, "videoTrack.width");
                    lk3Var2.a((long) cms0Var.f, "videoTrack.height");
                }
                lk3Var.g(lk3Var2.e());
                jk3 e = lk3Var.e();
                ohk0 f = ks80Var.f().f(str);
                if (f != null) {
                    f.j("onCurrentVideoTrackChanged", e);
                }
                return s3q0.a;
            case 3:
                return ((jz80) this.c).f.a((zqa) this.d);
            case 4:
                Context context = (Context) this.c;
                String str2 = ((s3a0) this.d).i;
                int i = s3a0.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i == 1) {
                    g2v.c().k().e(context, str2);
                } else if (i == 2) {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    if (clipboardManager != null) {
                        clipboardManager.setText(str2);
                    }
                    cvk.u(R.string.link_copied, false);
                }
                return s3q0.a;
            case 5:
                return PhotoEditorView.g((PhotoEditorView) this.c, (f5p) this.d, (Context) obj);
            case 6:
                zrh0 zrh0Var = (zrh0) this.c;
                vrh0 vrh0Var = (vrh0) this.d;
                SearchQuery searchQuery = (SearchQuery) obj;
                zrh0Var.e = searchQuery;
                vrh0Var.g(searchQuery);
                zrh0Var.e = null;
                return s3q0.a;
            case 7:
                MarketFavable marketFavable = (MarketFavable) this.c;
                l2e l2eVar = (l2e) this.d;
                gmq gmqVar = (gmq) obj;
                if (!gmqVar.equals(marketFavable)) {
                    throw new IllegalStateException();
                }
                l2eVar.invoke((MarketFavable) gmqVar);
                return s3q0.a;
            case 8:
                tdn0 tdn0Var = (tdn0) this.c;
                sdn0 sdn0Var = (sdn0) this.d;
                sdn0Var.p.b(sdn0Var.itemView.getContext(), tdn0Var.h.o.b, tdn0Var, null);
                return s3q0.a;
            case 9:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                ww50 ww50Var = (ww50) obj;
                FragmentImpl u = ww50Var.u();
                ref$ObjectRef.element = u instanceof SettingsListFragment ? new FragmentEntry(b68.d(), null, 2, null) : (u == null || (x = ww50Var.x(u)) == null) ? 0 : new FragmentEntry(x, null, 2, null);
                ref$ObjectRef2.element = u instanceof VKSuperAppBrowserFragment ? ((VKSuperAppBrowserFragment) u).Kn() : 0;
                if (!SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h()) {
                    i0q0.f(new b290(ww50Var, 27));
                }
                return s3q0.a;
            case 10:
                q7v0 q7v0Var = (q7v0) this.c;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.d;
                ((etv0) obj).b(false);
                q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 11:
                Context context2 = (Context) this.c;
                izs izsVar = (izs) this.d;
                VideoFile videoFile = (VideoFile) j5g.a0((List) obj);
                if (videoFile != null) {
                    net0.c(context2, videoFile, null, null, null, null, false, izsVar, null, null, false, false, false, false, 0L, false, null, null, false, null, false, null, null, 16777084);
                } else {
                    izsVar.invoke(new qs80.a(new IllegalStateException("Live videos is empty!")));
                }
                return s3q0.a;
            case 12:
                ((kzv0) this.c).j.z((mzv0) this.d);
                return s3q0.a;
            default:
                return ((Integer) obj).intValue() == ImageScreenSize.BIG.h() ? ((y4x0) this.c).b() : (String) this.d;
        }
    }
}
