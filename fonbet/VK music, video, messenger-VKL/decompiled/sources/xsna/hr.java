package xsna;

import android.util.Base64;
import android.util.JsonReader;
import androidx.media3.common.PlaybackException;
import com.mbridge.msdk.config.component.log.LogCpt;
import com.vk.api.generated.account.dto.AccountSetPrivacyResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsSettingsDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsSuspendResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseGetSchoolsResponseDto;
import com.vk.api.generated.donut.dto.DonutAddLevelResponseDto;
import com.vk.api.generated.fave.dto.FaveGetPagesResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetVideoLivesResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCommunityReviewCommentResponseDto;
import com.vk.api.generated.market.dto.MarketGetCategoriesNewResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesEditResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.superapp.core.api.models.VkGender;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.by1;
import xsna.ihz;
import xsna.o5k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hr implements f03, io.reactivex.rxjava3.functions.m, b03, o5k.a, ihz.a, ValueValidator, ListValidator, io.reactivex.rxjava3.functions.l, Function2, com.mbridge.msdk.tracker.f {
    public final /* synthetic */ int b;

    public /* synthetic */ hr(int i) {
        this.b = i;
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(com.mbridge.msdk.tracker.e eVar) {
        boolean a;
        a = LogCpt.a(eVar);
        return a;
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$1;
        lambda$create$1 = HandRecognitionFactory.lambda$create$1((Detection) obj, (Long) obj2);
        return lambda$create$1;
    }

    @Override // xsna.o5k.a
    public Object d(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("filename")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (nextName.equals("contents")) {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                if (bArr == null) {
                    throw new NullPointerException("Null contents");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && bArr != null) {
            return new al5(str, bArr);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" filename");
        }
        if (bArr == null) {
            sb.append(" contents");
        }
        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (AudioGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetResponseDto.class).getType())).a();
            case 13:
                return (DonutAddLevelResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutAddLevelResponseDto.class).getType())).a();
            case 16:
                return (FriendsGetBirthdaysResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsGetBirthdaysResponseDto.class).getType())).a();
            case 17:
                return (GroupsGetVideoLivesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetVideoLivesResponseDto.class).getType())).a();
            case 20:
                return (MarketGetCategoriesNewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetCategoriesNewResponseDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (NewsfeedGenericResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            case 26:
                return (PhotosPhotoUploadDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosPhotoUploadDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountSetPrivacyResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMiniappsCatalogDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsSettingsDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsSuspendResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DatabaseGetSchoolsResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FaveGetPagesResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCreateCommunityReviewCommentResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSendResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NarrativesEditResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
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

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof ok1) || (obj instanceof cl1);
    }

    public /* synthetic */ hr(sc scVar) {
        this.b = 14;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return VkGender.UNDEFINED;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ hr(by1.a aVar, PlaybackException playbackException) {
        this.b = 10;
    }
}
