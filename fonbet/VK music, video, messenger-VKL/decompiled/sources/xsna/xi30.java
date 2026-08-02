package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.MsgFooterBannerConfig;
import com.vk.toggle.features.VasFeatures;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.kbl0;

/* compiled from: MsgFooterBannerRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class xi30 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();

    public final MsgFooterBannerConfig a(String str) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        String s = Preference.s(kbl0.a.b().a, (str.length() <= 0 || drm0.N(str)) ? "stickers_msg_footer_banner_config" : "stickers_msg_footer_banner_config_".concat(str), "");
        if (s.length() == 0) {
            return new MsgFooterBannerConfig(null, null, null, null, null, 31, null);
        }
        try {
            Serializer.c<MsgFooterBannerConfig> cVar = MsgFooterBannerConfig.CREATOR;
            return MsgFooterBannerConfig.a.a(new JSONObject(s));
        } catch (Throwable unused) {
            return new MsgFooterBannerConfig(null, null, null, null, null, 31, null);
        }
    }

    public final void b() {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        if (currentTimeMillis - Preference.m(-1L, kbl0.a.b().a, "stickers_last_msg_footer_banner_config_update_time") < 3600000) {
            return;
        }
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_CATALOG;
        vasFeatures.getClass();
        this.a.b(rsg0.w0(yfb.x(com.vk.toggle.b.A.a(vasFeatures) ? new tfx("gifts.getMessagesConversationCardConfigsAlias", new wr(19), new xr(18)) : new tfx("gifts.getMessagesConversationCardConfigs", new u11(20), new v11(14)))).l(new ox0(new b4r(16), 28)).m(asu0.a.c()).subscribe(new rkz(new gmj(this, 26), 5), new bqs(new wik(this, 25), 8)));
    }
}
