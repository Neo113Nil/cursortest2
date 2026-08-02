package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoEditResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.lgj0;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl$updateClip$2", f = "ClipEditSdkRepositoryImpl.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class utc extends SuspendLambda implements wzs<yvj, spj<? super VideoVideoFullDto>, Object> {
    final /* synthetic */ String $attachedVideoId;
    final /* synthetic */ List<UserId> $coauthors;
    final /* synthetic */ String $description;
    final /* synthetic */ SdkClipOrdData $ord;
    int label;
    final /* synthetic */ wtc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utc(wtc wtcVar, SdkClipOrdData sdkClipOrdData, String str, List<UserId> list, String str2, spj<? super utc> spjVar) {
        super(2, spjVar);
        this.this$0 = wtcVar;
        this.$ord = sdkClipOrdData;
        this.$description = str;
        this.$coauthors = list;
        this.$attachedVideoId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new utc(this.this$0, this.$ord, this.$description, this.$coauthors, this.$attachedVideoId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super VideoVideoFullDto> spjVar) {
        return ((utc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wtc wtcVar = this.this$0;
            gof gofVar = wtcVar.c;
            ogj0 ogj0Var = wtcVar.h;
            ClipEditSdkItem clipEditSdkItem = wtcVar.b;
            UserId userId = clipEditSdkItem.c;
            int parseInt = Integer.parseInt(clipEditSdkItem.b);
            wtc wtcVar2 = this.this$0;
            SdkClipOrdData sdkClipOrdData = this.$ord;
            wtcVar2.getClass();
            xy2 b = lgj0.a.b(ogj0Var, userId, parseInt, this.$description, null, null, null, null, sdkClipOrdData == null ? null : com.vk.movika.sdk.android.defaultplayer.interactive.c.b("is_ads", true).put("advertisers", new JSONArray().put(new JSONObject().put("er_id", sdkClipOrdData.d).put("ord_pred_id", sdkClipOrdData.c))).toString(), this.$coauthors, this.$attachedVideoId, 25592);
            this.label = 1;
            a = gofVar.a(b, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = obj;
        }
        return ((ShortVideoEditResponseDto) a).d();
    }
}
