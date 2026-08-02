package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.superapp.api.internal.oauthrequests.EmptyDataException;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.proto.PublisherConfiguration;
import xsna.c99;
import xsna.jhw0;
import xsna.l5v0;
import xsna.taw0;
import xsna.thy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6c0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ t6c0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return (Post) ((NewsEntry) obj);
            case 1:
                qgi0.r((tgi0) obj, "product_preview_market_header_icon");
                return s3q0.a;
            case 2:
                thy.b bVar = (thy.b) obj;
                bVar.a = RtpSenderHelper.AUDIO_BITRATE_MIN;
                Float valueOf = Float.valueOf(90.0f);
                bVar.a(300, valueOf).b = sb30.b;
                bVar.a(1500, valueOf);
                Float valueOf2 = Float.valueOf(180.0f);
                bVar.a(1800, valueOf2);
                bVar.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, valueOf2);
                Float valueOf3 = Float.valueOf(270.0f);
                bVar.a(3300, valueOf3);
                bVar.a(PublisherConfiguration.DEFAULT_MAX_DELAY_MS, valueOf3);
                Float valueOf4 = Float.valueOf(360.0f);
                bVar.a(4800, valueOf4);
                bVar.a(RtpSenderHelper.AUDIO_BITRATE_MIN, valueOf4);
                return s3q0.a;
            case 3:
                L.p("PushSubscriberNew", "Unsubscribed");
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<s3q0> sgi0Var = ngi0.e;
                s3q0 s3q0Var = s3q0.a;
                ((tgi0) obj).a(sgi0Var, s3q0Var);
                return s3q0Var;
            case 5:
                ((m99) obj).b(new c99.c0(false, "ShareLinkFromGroupCallTip"));
                return s3q0.a;
            case 6:
                return Boolean.TRUE;
            case 7:
                return new q6l0(R.layout.sticker_settings_separator_item, (ViewGroup) obj);
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return j5g.S0((List) obj);
            case 12:
                return EmptyList.b;
            case 13:
                return ((GroupsGetByIdObjectResponseDto) obj).d();
            case 14:
                return Boolean.valueOf(((it80) obj).a());
            case 15:
                return s3q0.a;
            case 16:
                if (drm0.N(((xbu0) obj).c())) {
                    throw new EmptyDataException("VkAuthModel: exchange token was received empty");
                }
                return s3q0.a;
            case 17:
                return new l5v0.a.d((ProfilesInfo) obj);
            case 18:
                return s3q0.a;
            case 19:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 20:
                RecommendationsBlockModel recommendationsBlockModel = (RecommendationsBlockModel) obj;
                return new taw0.a(recommendationsBlockModel.b, recommendationsBlockModel.c, recommendationsBlockModel.f, recommendationsBlockModel.e);
            case 21:
                return Boolean.valueOf(((jhw0.c) obj).b);
            case 22:
                return ((com.vk.voip.ui.sessionrooms.f) obj).a;
            default:
                xkg xkgVar = xkg.a;
                xkg.c.m((List) obj, true);
                return s3q0.a;
        }
    }
}
