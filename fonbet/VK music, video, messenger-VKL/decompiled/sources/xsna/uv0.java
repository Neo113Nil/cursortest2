package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.gson.GsonBuilder;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.common.api.generated.GsonHolder;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.impl.ctabutton.di.ProductTileCtaButtonComponentImpl;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponentImpl;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import com.vk.permission.PermissionHelper;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MiniAppAttachment;
import java.util.concurrent.ExecutorService;
import xsna.vxi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class uv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        String str = null;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                return new vzt0();
            case 1:
                int i = AnimatedGiftView.g;
                return s3q0.a;
            case 2:
                return new float[9];
            case 3:
                return new xf40();
            case 4:
                return com.vk.movika.sdk.base.model.n.a(0.5f);
            case 5:
                return new dz60();
            case 6:
                return new SpannableStringBuilder();
            case 7:
                return new a390();
            case 8:
                return new vxi.c();
            case 9:
                return new asg0();
            case 10:
                Context context = e43.a;
                return (context != null ? context : null).getString(R.string.clip_description_collapse);
            case 11:
                return new j2c0();
            case 12:
                bpn0 bpn0Var = DownloadService.p;
                return Boolean.valueOf(MusicFeatures.FG_SERVICE_TIMEOUT.h());
            case 13:
                return s3q0.a;
            case 14:
                return new gmv0();
            case 15:
                return new egg();
            case 16:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(true)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 17:
                qcy<Object>[] qcyVarArr2 = ImCommonCommandsFactoryComponentImpl.b;
                return new njg();
            case 18:
                return n8y.b;
            case 19:
                return Boolean.valueOf(fxc0.B().J().g1());
            case 20:
                return s3q0.a;
            case 21:
                return Preference.f("review_offer_config_storage");
            case 22:
                Serializer.c<MiniAppAttachment> cVar = MiniAppAttachment.CREATOR;
                Context context2 = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.attach_mini_app_square_image_size, context2 != null ? context2 : null));
            case 23:
                return new zy40();
            case 24:
                return new re60();
            case 25:
                return new la60();
            case 26:
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING));
            case 27:
                dhr0.a.getClass();
                return new brj0(1, 0, dhr0.t.b(R.drawable.vk_icon_user_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_open_profile, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 28:
                qcy<Object>[] qcyVarArr3 = ProductTileCtaButtonComponentImpl.f;
                return new jsd0();
            default:
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                permissionHelper.getClass();
                if (PermissionHelper.q(context3)) {
                    b = e8r.a.b(r3, PrivateSubdir.STICKERS.h(), true);
                    str = b.a.getAbsolutePath();
                }
                asu0.a.getClass();
                return new zse0(str, asu0.n(), (ExecutorService) asu0.W.getValue(), (io.reactivex.rxjava3.core.w) asu0.V.getValue());
        }
    }
}
