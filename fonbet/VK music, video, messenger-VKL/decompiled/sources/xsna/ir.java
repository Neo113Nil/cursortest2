package xsna;

import android.util.JsonReader;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.channels.dto.ChannelsCreateResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPricingInfoResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseGetCitiesResponseDto;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.groups.dto.GroupsGetVideoLivesResponseDto;
import com.vk.api.generated.market.dto.MarketGetCategoriesNewResponseDto;
import com.vk.api.generated.market.dto.MarketUserReviewsCommunitiesResponseObjectDto;
import com.vk.api.generated.narratives.dto.NarrativesCreateResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.by1;
import xsna.ihz;
import xsna.l8x;
import xsna.o5k;
import xsna.ql5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ir implements b03, f03, com.vk.mvi.binder.d, io.reactivex.rxjava3.functions.l, InternalIdsResolver.ParticipantPrivateStateModifier, o5k.a, ihz.a, ValueValidator, ListValidator, l8x.a {
    public final /* synthetic */ int b;

    public /* synthetic */ ir(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static String f(char c, float f, StringBuilder sb) {
        sb.append((Object) pco.c(f));
        sb.append(c);
        return sb.toString();
    }

    public static tg50 h(androidx.compose.runtime.a aVar) {
        tg50 tg50Var = new tg50();
        aVar.R(tg50Var);
        return tg50Var;
    }

    @Override // com.vk.mvi.binder.d
    public void a(gzs gzsVar) {
        gzsVar.invoke();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        dhw0 L = com.vk.voip.ui.c.b.L();
        Set<CallMemberId> set = L != null ? L.x : null;
        return set == null ? EmptySet.b : set;
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new kcq(ym5Var, n3y0Var);
    }

    @Override // xsna.o5k.a
    public Object d(JsonReader jsonReader) {
        ql5.a aVar = new ql5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "parameterKey":
                    aVar.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVar.d(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("variantId")) {
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null variantId");
                            }
                        } else if (nextName2.equals("rolloutId")) {
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null rolloutId");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str != null && str2 != null) {
                        aVar.a = new rl5(str, str2);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (str == null) {
                            sb.append(" rolloutId");
                        }
                        if (str2 == null) {
                            sb.append(" variantId");
                        }
                        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
                    }
                case "parameterValue":
                    aVar.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (AudioAudioDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioAudioDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (ChannelsCreateResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ChannelsCreateResponseDto.class).getType())).a();
            case 10:
                return (CommunitySubscriptionsGetPricingInfoResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsGetPricingInfoResponseDto.class).getType())).a();
            case 13:
                return (DatabaseGetCitiesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, DatabaseGetCitiesResponseDto.class).getType())).a();
            case 17:
                return (DonutGroupSettingsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGroupSettingsDto.class).getType())).a();
            case 19:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (MarketUserReviewsCommunitiesResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketUserReviewsCommunitiesResponseObjectDto.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (NarrativesCreateResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NarrativesCreateResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetVideoLivesResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCategoriesNewResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // ru.ok.android.externcalls.sdk.id.InternalIdsResolver.ParticipantPrivateStateModifier
    public void setInternalId(ConversationParticipant conversationParticipant, CallParticipant.ParticipantId participantId) {
        conversationParticipant.setInternalId(participantId);
    }

    public /* synthetic */ ir(by1.a aVar, boolean z, int i) {
        this.b = 14;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        boolean lambda$static$2;
        switch (this.b) {
            case 16:
                return list.size() >= 1;
            default:
                lambda$static$2 = JsonParsers.lambda$static$2(list);
                return lambda$static$2;
        }
    }
}
