package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gwd0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gwd0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                int i = ProfileFabView.r;
                return s3q0.a;
            case 1:
                dnp0 dnp0Var = new dnp0();
                dnp0Var.g(0);
                dnp0Var.c(new biq());
                dnp0Var.c(new wra());
                dnp0Var.e(250L);
                return dnp0Var;
            case 2:
                return s3q0.a;
            case 3:
                return new bfj0();
            case 4:
                return new Handler(Looper.getMainLooper());
            case 5:
                return k840.a.g().b();
            case 6:
                qcy<Object>[] qcyVarArr = StickyPlayerComponent.c;
                return new ny40(0);
            case 7:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 8:
                return new ncm0();
            case 9:
                return new p4r();
            case 10:
                qcy<Object>[] qcyVarArr2 = UserProfileComponentImpl.m;
                return new n1r0();
            case 11:
                return Float.valueOf(x5r0.a(12, 1));
            case 12:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.im_light_theme_blue));
            case 13:
                return Boolean.valueOf(fxc0.B().J().V0());
            case 14:
                return Boolean.valueOf(com.vk.toggle.b.A.a(VideoFeatures.VIDEO_D2D_CLIPS_DISCOVERY));
            case 15:
                return new mjt0();
            case 16:
                return new bsp(TextUtils.TruncateAt.values(), "android.text.TextUtils.TruncateAt");
            case 17:
                return s3q0.a;
            case 18:
                return com.vk.voip.ui.c.T0;
            default:
                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                return e43.l(AppFields.HAS_VK_CONNECT, AppFields.IS_VKUI_INTERNAL, AppFields.WEBVIEW_URL, AppFields.SCREEN_ORIENTATION, AppFields.MOBILE_CONTROLS_TYPE, AppFields.SPLASH_SCREEN, AppFields.BACKGROUND_LOADER_COLOR, AppFields.PLACEHOLDER_INFO, AppFields.HIDE_TABBAR, AppFields.TRACK_CODE, AppFields.AUTHOR_OWNER_ID, AppFields.PRELOAD_AD_TYPES, AppFields.AD_CONFIG, AppFields.CAN_CACHE, AppFields.ICON_75, AppFields.ICON_139, AppFields.ICON_150, AppFields.ICON_278, AppFields.ICON_576, AppFields.NEED_SHOW_UNVERIFIED_SCREEN, AppFields.IS_INSTALL_SCREEN, AppFields.IS_INSTALLED);
        }
    }
}
