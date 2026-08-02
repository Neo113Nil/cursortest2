package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sbe0;

/* compiled from: CoverDelegate.kt */
/* loaded from: classes7.dex */
public final class k2k {

    /* compiled from: CoverDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoverChooseResult.Error.ErrorType.values().length];
            try {
                iArr[CoverChooseResult.Error.ErrorType.LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoverChooseResult.Error.ErrorType.DRAW_ON_CANVAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoverChooseResult.Error.ErrorType.SAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CoverDelegate.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.CoverDelegateKt$updateCoverPreview$1", f = "CoverDelegate.kt", l = {60}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gce0 $this_updateCoverPreview;
        final /* synthetic */ PublishState.Upload $uploadBlock;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gce0 gce0Var, PublishState.Upload upload, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_updateCoverPreview = gce0Var;
            this.$uploadBlock = upload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_updateCoverPreview, this.$uploadBlock, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ice0 ice0Var = this.$this_updateCoverPreview.e;
                Uri uri = this.$uploadBlock.b;
                this.label = 1;
                j = ice0Var.j(uri, this);
                if (j == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                j = ((Result) obj).d();
            }
            gce0 gce0Var = this.$this_updateCoverPreview;
            if (!(j instanceof Result.Failure)) {
                rdi.y(gce0Var, new l2k((Bitmap) j, 0));
            }
            gce0 gce0Var2 = this.$this_updateCoverPreview;
            Throwable a = Result.a(j);
            if (a != null) {
                rdi.y(gce0Var2, new d7l0(10));
                gce0Var2.c(sbe0.l.a);
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            return s3q0.a;
        }
    }

    public static final CoverDo a(PublishState publishState, VideoInfoDo videoInfoDo, VideoFile videoFile) {
        TimelineThumbs B0;
        List<String> list;
        Image image;
        ArrayList arrayList;
        String h;
        PublishState.Block block = publishState.b;
        String str = null;
        str = null;
        str = null;
        if (block instanceof PublishState.Upload) {
            return new CoverDo.Preview(videoInfoDo != null ? videoInfoDo.g : null);
        }
        if (!(block instanceof PublishState.Edit)) {
            throw new NoWhenBranchMatchedException();
        }
        if (videoFile != null && (image = videoFile.getImage()) != null && (arrayList = image.b) != null && (h = ixj0.h(arrayList)) != null) {
            str = h;
        } else if (videoFile != null && (B0 = videoFile.B0()) != null && (list = B0.i) != null) {
            str = (String) j5g.a0(list);
        }
        return new CoverDo.Remote(str);
    }

    public static CoverDo b(PublishState publishState) {
        VideoInfoDo videoInfoDo = publishState.c;
        PublishState.Block block = publishState.b;
        PublishState.Edit edit = block instanceof PublishState.Edit ? (PublishState.Edit) block : null;
        return a(publishState, videoInfoDo, edit != null ? edit.b : null);
    }

    public static final void c(gce0 gce0Var) {
        PublishState.Upload o;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = gce0Var.b;
        VideoInfoDo videoInfoDo = ((PublishState) sj50Var.getCurrentState()).c;
        if ((videoInfoDo != null ? videoInfoDo.g : null) == null && (o = ((PublishState) sj50Var.getCurrentState()).o()) != null) {
            g3q.a(gce0Var, new b(gce0Var, o, null));
        }
    }
}
