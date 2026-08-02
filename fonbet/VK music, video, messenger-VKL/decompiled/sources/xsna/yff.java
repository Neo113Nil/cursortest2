package xsna;

import android.util.Size;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DraftsUi;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.utils.resulter.ActivityResultType;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadFragmentImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$openPreview$1", f = "ClipsUploadFragmentImpl.kt", l = {731}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class yff extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ClipsUploadState.Loaded $state;
    int label;
    final /* synthetic */ ClipsUploadFragmentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff(ClipsUploadFragmentImpl clipsUploadFragmentImpl, ClipsUploadState.Loaded loaded, spj<? super yff> spjVar) {
        super(2, spjVar);
        this.this$0 = clipsUploadFragmentImpl;
        this.$state = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yff(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((yff) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ClipsUploadFragmentImpl clipsUploadFragmentImpl = this.this$0;
            String str = ClipsUploadFragmentImpl.a0;
            mud e = clipsUploadFragmentImpl.fo().e();
            this.label = 1;
            obj = e.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        String str2 = ((ClipsDraftVk) obj).b.b;
        ClipsEncoderParameters clipsEncoderParameters = this.$state.b.b;
        Timeline timeline = clipsEncoderParameters.b;
        List<ISerializableStickerSDK> list = clipsEncoderParameters.h;
        ClipEditorSizeParams clipEditorSizeParams = this.$state.b.b.d;
        ClipPreviewInputParams clipPreviewInputParams = new ClipPreviewInputParams(timeline, list, new Size(clipEditorSizeParams.b, clipEditorSizeParams.c), str2, false, this.$state.b.f.contains(ClipUploadScreenFeature$DraftsUi.b), 16, null);
        ClipsUploadFragmentImpl clipsUploadFragmentImpl2 = this.this$0;
        String str3 = ClipsUploadFragmentImpl.a0;
        clipsUploadFragmentImpl2.fo().k().f().a(this.this$0.requireContext(), clipPreviewInputParams, ActivityResultType.Preview.ordinal());
        return s3q0.a;
    }
}
