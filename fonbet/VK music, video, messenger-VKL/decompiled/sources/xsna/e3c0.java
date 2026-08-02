package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.view.components.cell.VkCell;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vk.writebar.di.WritebarComponentImpl;
import com.vkontakte.android.task.di.components.VkAppMusicFragmentComponentImpl;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e3c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GetAssetFileName initialize$lambda$220$lambda$70;
        FlattenerRulesUseCase initialize$lambda$220$lambda$166;
        switch (this.b) {
            case 0:
                int i = PostFragment.S0;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 1:
                String[] strArr = PostViewFragment.T0;
                return new j2c0();
            case 2:
                initialize$lambda$220$lambda$70 = ServiceProvider.initialize$lambda$220$lambda$70();
                return initialize$lambda$220$lambda$70;
            case 3:
                initialize$lambda$220$lambda$166 = ServiceProvider.initialize$lambda$220$lambda$166();
                return initialize$lambda$220$lambda$166;
            case 4:
                return new ngj0();
            case 5:
                return new Regex("/clip([-0-9]+)_([0-9]+)");
            case 6:
                Context context = e43.a;
                return (Vibrator) (context != null ? context : null).getSystemService("vibrator");
            case 7:
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                permissionHelper.getClass();
                return Boolean.valueOf(PermissionHelper.b(context3, PermissionHelper.e));
            case 8:
                return s3q0.a;
            case 9:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 10:
                qcy<Object>[] qcyVarArr = VideoGrowthComponentImpl.k;
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                return (bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET) && bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_BTN)) ? VideoGrowthType.BOTTOM_SHEET_AND_BUTTON : bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_BTN) ? VideoGrowthType.GRAY_BUTTON : bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_CTA) ? VideoGrowthType.CTA_BANNER : VideoGrowthType.BOTTOM_SHEET;
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEARCH_FILTERS_DS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                fzv0 b = com.vk.toggle.d.C.b();
                if (b != null) {
                    return b;
                }
                fzv0.b.getClass();
                return fzv0.c;
            case 14:
                asu0.a.getClass();
                return asu0.s();
            case 15:
                qcy<Object>[] qcyVarArr2 = VkAppMusicFragmentComponentImpl.e;
                return new zk40();
            case 16:
                return VkCell.Right.e.Companion.serializer();
            case 17:
                mjw0.r(true);
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr3 = WritebarComponentImpl.a;
                return new sdi();
        }
    }

    public /* synthetic */ e3c0(mjw0 mjw0Var) {
        this.b = 17;
    }
}
