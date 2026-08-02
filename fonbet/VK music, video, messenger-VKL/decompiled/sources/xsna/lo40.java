package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicMixTopshelfFragment.kt */
@b6l(c = "com.vk.catalog2.common.ui.holders.video.musicvideo.MusicMixTopshelfFragment$loadMixAndOpenFirstVideo$1", f = "MusicMixTopshelfFragment.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class lo40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UIBlockMusicMixTopshelf $block;
    int label;
    final /* synthetic */ ko40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo40(ko40 ko40Var, UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf, spj<? super lo40> spjVar) {
        super(2, spjVar);
        this.this$0 = ko40Var;
        this.$block = uIBlockMusicMixTopshelf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lo40(this.this$0, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lo40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        List<VideoFile> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        VideoFile videoFile = null;
        if (i == 0) {
            kotlin.a.a(obj);
            nxs0 nxs0Var = (nxs0) this.this$0.r.getValue();
            UIBlockMusicMixTopshelf.Item item = (UIBlockMusicMixTopshelf.Item) j5g.a0(this.$block.y);
            String str = item != null ? item.f : null;
            this.label = 1;
            a = nxs0Var.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        mxs0 mxs0Var = (mxs0) a;
        if (mxs0Var != null && (list = mxs0Var.a) != null) {
            videoFile = (VideoFile) j5g.a0(list);
        }
        if (videoFile != null) {
            this.this$0.un(this.$block, videoFile);
        } else {
            cvk.u(R.string.error_network, false);
        }
        return s3q0.a;
    }
}
