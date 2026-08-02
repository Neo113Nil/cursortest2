package xsna;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Size;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.profile.design.view.silentmodebanner.SilentModeBannerView;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.pushes.PushComponent$Companion$STUB$2$1;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kcc0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kcc0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AnalyticsDataSource initialize$lambda$220$lambda$43;
        switch (this.b) {
            case 0:
                return new fa60();
            case 1:
                ComFeatures comFeatures = ComFeatures.COM_NEW_POSTING_PRIVACY_UX;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 2:
                return new PushComponent$Companion$STUB$2$1();
            case 3:
                initialize$lambda$220$lambda$43 = ServiceProvider.initialize$lambda$220$lambda$43();
                return initialize$lambda$220$lambda$43;
            case 4:
                return "player is null on telemetry event";
            case 5:
                int i = SilentModeBannerView.o;
                return s3q0.a;
            case 6:
                return h5s.a("ov-stat-uploader-thread");
            case 7:
                int i2 = UserProfileHeaderView.G;
                return s3q0.a;
            case 8:
                return Boolean.valueOf(SakFeatures.Type.VKC_PHONE_REUSE_AUTH.h());
            case 9:
                return Boolean.valueOf(fxc0.B().J().L1());
            case 10:
                return new bsp(TextUtils.TruncateAt.values(), "android.text.TextUtils.TruncateAt");
            case 11:
                return VkCellSkeleton$Left$Main.Size.Companion.serializer();
            default:
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    return s3q0.a;
                }
                if (BuildInfo.s()) {
                    io.reactivex.rxjava3.core.a b2 = fsk.c.b(InAppReviewConditionKey.LOAD_3_USER_PROFILE_COVER, jgp.b);
                    int i3 = kwg0.a;
                    itg0.a(b, b2.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0()));
                }
                ikv0.a aVar = new ikv0.a(b);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(b.getString(R.string.user_profile_cover_changed), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                return s3q0.a;
        }
    }
}
