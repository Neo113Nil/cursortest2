package xsna;

import android.util.Size;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPaymentLinkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.api.generated.questions.dto.QuestionsDeleteFromAuthorResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.api.generated.store.dto.StoreStockItemDiscountsDto;
import com.vk.api.generated.stories.dto.StoriesGetTopHashtagsResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import xsna.q1d0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ck70 implements f03, b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, q1d0.e {
    public final /* synthetic */ int b;

    public /* synthetic */ ck70(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, NewsEntry newsEntry, char c) {
        sb.append(newsEntry);
        sb.append(c);
        return sb.toString();
    }

    public static void b(q630.a aVar, float f, androidx.compose.runtime.a aVar2, int i) {
        f9t.e(txj0.h(aVar, f), aVar2, i);
        aVar2.j();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Map map;
        switch (this.b) {
            case 2:
                return ((CommunitySubscriptionsGetPaymentLinkResponseDto) obj).d();
            case 8:
                map = RemoteSettingsImplV2.settingsSource_delegate$lambda$0$0((Throwable) obj);
                return map;
            default:
                return ((StoreGetStickersKeywordsResponseDto) obj).f();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (PhotosPhotoUploadDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosPhotoUploadDto.class).getType())).a();
            case 7:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.q1d0.e
    public Size f() {
        return null;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, QuestionsDeleteFromAuthorResponseDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreStockItemDiscountsDto.class).getType());
            case 11:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetTopHashtagsResponseDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    public /* synthetic */ ck70(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VKList) obj2;
    }
}
