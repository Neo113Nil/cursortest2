package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsSettingsIdsDto;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.banner.VkNotificationBanner;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsPublicationAgreementControllerImpl.kt */
/* loaded from: classes17.dex */
public final class yye implements wye {
    public static final String d = i5s.a(new StringBuilder("https://"), a0a.d, "/laclips");
    public static final String e = i5s.a(new StringBuilder("https://"), a0a.d, "/terms/clips");
    public static final String f = i5s.a(new StringBuilder("https://"), a0a.d, "/privacy/clips");
    public final ngj0 a;
    public io.reactivex.rxjava3.disposables.c b;
    public boolean c;

    public yye(ngj0 ngj0Var) {
        this.a = ngj0Var;
    }

    @Override // xsna.wye
    public final void a(Context context) {
        xwk.d().getBrowser().d(context, Uri.parse(d), true);
    }

    @Override // xsna.wye
    public final CharSequence b() {
        return xwk.d().a().d(y8g0.f(R.string.clips_publish_original_track_agreement, e), new LinksParserData(1, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
    }

    @Override // xsna.wye
    public final CharSequence c() {
        return xwk.d().a().d(y8g0.f(R.string.clips_publish_other_services_agreement, e, f), new LinksParserData(1, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
    }

    @Override // xsna.wye
    public final View d(Context context, r4 r4Var) {
        VkNotificationBanner vkNotificationBanner = new VkNotificationBanner(context, null, 6);
        tlo0.f h = tq.h(tlo0.Companion, R.string.clips_publish_other_services_title);
        VkBanner.e.a.b bVar = new VkBanner.e.a.b(new tlo0.f(R.string.clips_publish_other_services_description));
        tlo0.f fVar = new tlo0.f(R.string.clips_publish_other_services_btn_title);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        vkNotificationBanner.setMiddle(new VkBanner.e(h, null, bVar, new VkBanner.c(fVar, new jl4(4, r4Var, vkNotificationBanner), VkButton.Mode.Primary, appearance, VkButton.Size.Small, null, null, 992), null, null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE));
        return vkNotificationBanner;
    }

    @Override // xsna.wye
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.wye
    public final void e(o15 o15Var) {
        f(o15Var, null);
    }

    @Override // xsna.wye
    public final void f(izs izsVar, bze bzeVar) {
        if (this.c) {
            if (bzeVar != null) {
                bzeVar.invoke();
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        List l = e43.l("license_agreement_2022_agree", "ugc_sounds_agreement_2022_agree");
        ArrayList arrayList = new ArrayList();
        Iterator it = l.iterator();
        while (true) {
            ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto = null;
            if (!it.hasNext()) {
                this.b = rsg0.y0(yfb.x(mgj0.h(this.a, arrayList, null, 6)), null, null, 3).U(new ai3(new gl6(1, this, yye.class, "mapToClipUserSettingsResponse", "mapToClipUserSettingsResponse(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetUserSettingsResponseDto;)Lcom/vk/dto/shortvideo/ClipUserSettingsResponse;", 0, 4), 12)).subscribe(new mf1(new v63(this, izsVar, bzeVar, 3), 11), new nf1(new xye(0, bzeVar), 15));
                return;
            }
            String str = (String) it.next();
            ShortVideoGetUserSettingsSettingsIdsDto[] values = ShortVideoGetUserSettingsSettingsIdsDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto2 = values[i];
                if (epx.f(shortVideoGetUserSettingsSettingsIdsDto2.i(), str)) {
                    shortVideoGetUserSettingsSettingsIdsDto = shortVideoGetUserSettingsSettingsIdsDto2;
                    break;
                }
                i++;
            }
            if (shortVideoGetUserSettingsSettingsIdsDto != null) {
                arrayList.add(shortVideoGetUserSettingsSettingsIdsDto);
            }
        }
    }
}
