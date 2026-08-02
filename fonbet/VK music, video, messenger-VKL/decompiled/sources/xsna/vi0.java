package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.channelrestrictions.ChannelRestrictionsComponent$Companion$STUB$2$1;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.sdk.parcer.api.MyTargetComponent;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.viewer.vk.ClipsViewerEventsComponentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.hints.HintId;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.toggle.Features;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import xsna.k840;
import xsna.ll60;
import xsna.vxi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vi0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vi0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String _init_$lambda$0;
        int i = 0;
        switch (this.b) {
            case 0:
                return 100;
            case 1:
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                return new uyy();
            case 2:
                Serializer.c<BadgeImage> cVar = BadgeImage.CREATOR;
                return e43.a(40, 48, 64, 80, 96, 128, 144, Integer.valueOf(PsExtractor.AUDIO_STREAM), 256, 512);
            case 3:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 4:
                return Integer.valueOf(iah0.a(12));
            case 5:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.d.a(k840.a.i.c()));
            case 6:
                return new ChannelRestrictionsComponent$Companion$STUB$2$1.b();
            case 7:
                return s3q0.a;
            case 8:
                int i2 = ClipEndOverlayAdWrapperView.m;
                return com.vk.toggle.d.K0.b();
            case 9:
                return ((MyTargetComponent) ((k7m) m7m.f(h0f.b)).mo408a(fpf0.a(MyTargetComponent.class))).ta();
            case 10:
                qcy<Object>[] qcyVarArr2 = ClipsViewerEventsComponentImpl.b;
                return new d1q();
            case 11:
                return new thg();
            case 12:
                return new s290();
            case 13:
                return new vxi.b();
            case 14:
                int i3 = CoverCropActivity.w;
                return androidx.compose.runtime.k.b(0);
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                int i4 = EntriesListFragment.m0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 18:
                _init_$lambda$0 = EventMetaParamsConfig._init_$lambda$0();
                return _init_$lambda$0;
            case 19:
                int i5 = FiltersView.x;
                return s3q0.a;
            case 20:
                return new hcp();
            case 21:
                Features.Type type = Features.Type.FEATURE_SEARCH_GLOBAL_CATALOG_VIDEO;
                type.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(type));
            case 22:
                return com.vk.stat.scheme.w.a();
            case 23:
                int i6 = ImportContactsFragment.Q;
                return new aa70();
            case 24:
                return new fzx(0);
            case 25:
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                qcy<Object>[] qcyVarArr3 = NewsfeedFragment.J0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 28:
                return new dl60(HintId.FEED_GROUP_LIKE_ONBOARDING.getId(), e43.l(445, 446, 447, 449, 448), new nhi(6), new kl60(i), new sux(8), new ll60.a(), new ll60.b());
            default:
                dhr0.a.getClass();
                return new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_minus_square_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_cancel_friends_request, null, false, false, null, 0, null, null, null, null, null, 131058);
        }
    }
}
