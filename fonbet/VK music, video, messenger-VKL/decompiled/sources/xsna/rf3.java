package xsna;

import android.net.Uri;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.audio.dto.AudioGetDownloadHistoryResponseDto;
import com.vk.api.generated.auth.dto.AuthRefreshTrustedHashesResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsGetResponseDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationsExtendedResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetUnreadCountersResponseDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import xsna.by1;
import xsna.eda;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rf3 implements f03, b03, io.reactivex.rxjava3.functions.m, ihz.a, ValueValidator, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, eda.a {
    public final /* synthetic */ int b;

    public /* synthetic */ rf3(int i) {
        this.b = i;
    }

    public static int a(zo10 zo10Var, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(zo10Var.N(j));
        return i + i2;
    }

    public static Uri c(String str, StringBuilder sb) {
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return (io.reactivex.rxjava3.core.q) obj;
            case 11:
                return s3q0.a;
            case 14:
                return yal0.b((StoreGetStickersKeywordsResponseDto) obj);
            case 25:
                return (zrb0) obj;
            default:
                return ((GetStoriesResponse) obj).c;
        }
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return rsg0.y0(new bda(wbaVar, list, str, null, 24), null, null, 3);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 2:
                return (AudioGetDownloadHistoryResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetDownloadHistoryResponseDto.class).getType())).a();
            case 3:
                return (AuthRefreshTrustedHashesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthRefreshTrustedHashesResponseDto.class).getType())).a();
            case 4:
                return (BoardGetTopicsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BoardGetTopicsExtendedResponseDto.class).getType())).a();
            case 6:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 22:
                return (NotificationsGetUnreadCountersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsGetUnreadCountersResponseDto.class).getType())).a();
            case 23:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (StickersImageConfigDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StickersImageConfigDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMiniappsCatalogDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GiftsGetResponseDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSearchConversationsExtendedResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseUploadServerDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
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

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ rf3(Object obj, int i) {
        this.b = i;
    }

    public /* synthetic */ rf3(by1.a aVar, int i) {
        this.b = 7;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        list.add((Result) obj2);
        return list;
    }
}
