package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCommunityReviewCommentResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesSaveCustomCoverResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSaveAnonLikeResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetKeyboardRecommendationResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetQuestionByIdResponseDto;
import com.vk.api.generated.wall.dto.WallCreateCommentResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.UUID;
import xsna.mzp0;
import xsna.rfb0;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wd10 implements b03, f03, tq70.b, io.reactivex.rxjava3.functions.l, mzp0.b {
    public final /* synthetic */ int b;

    public /* synthetic */ wd10(int i) {
        this.b = i;
    }

    public static com.mbridge.msdk.foundation.same.image.b b() {
        return com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d());
    }

    public static void c(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        com.mbridge.msdk.foundation.tools.q0.a(str, sb.toString());
    }

    @Override // xsna.mzp0.b
    public void a(mzp0.a aVar) {
        irk0 irk0Var = aVar.a;
        UUID uuid = aVar.b;
        new kzh0(aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.c, aVar.j, aVar.d, uuid, irk0Var).q();
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).b();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return j5g.D0(new nd3(3), (Collection) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (MarketCreateCommunityReviewCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketCreateCommunityReviewCommentResponseDto.class).getType())).a();
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 11:
            case 16:
            default:
                return (WallCreateCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallCreateCommentResponseDto.class).getType())).a();
            case 2:
                return (MessagesSendResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, MessagesSendResponseDto.class).getType())).a();
            case 7:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 9:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 10:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 12:
                return (ShortVideoSaveAnonLikeResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoSaveAnonLikeResponseDto.class).getType())).a();
            case 13:
                return (StickersGetKeyboardRecommendationResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersGetKeyboardRecommendationResponseDto.class).getType())).a();
            case 14:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 15:
                return (StoriesGetQuestionByIdResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetQuestionByIdResponseDto.class).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
            case 3:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NarrativesSaveCustomCoverResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseUploadServerDto.class).getType());
        }
    }

    public /* synthetic */ wd10(g250 g250Var) {
        this.b = 3;
    }
}
