package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.id1;

/* compiled from: AlbumChooseInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.store.AlbumChooseInlineActor$trySetAlbums$1$1", f = "AlbumChooseInlineActor.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class wd1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Integer $videoId;
    int label;
    final /* synthetic */ td1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd1(Integer num, td1 td1Var, spj<? super wd1> spjVar) {
        super(2, spjVar);
        this.$videoId = num;
        this.this$0 = td1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wd1(this.$videoId, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wd1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wd1 wd1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$videoId != null) {
                td1 td1Var = this.this$0;
                cn1 cn1Var = td1Var.e;
                List<VideoAlbumResultData> list = td1.q(td1Var, (AlbumChooseState) td1Var.b.getCurrentState()).b;
                sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.this$0.b;
                List<VideoAlbumData> list2 = ((AlbumChooseState) sj50Var.getCurrentState()).b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    VideoAlbumData videoAlbumData = (VideoAlbumData) obj2;
                    List<Integer> list3 = ((AlbumChooseState) sj50Var.getCurrentState()).c;
                    if (list3 != null ? list3.contains(Integer.valueOf(videoAlbumData.b)) : false) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    VideoAlbumData videoAlbumData2 = (VideoAlbumData) it.next();
                    arrayList2.add(new VideoAlbumResultData(videoAlbumData2.b, videoAlbumData2.c));
                }
                VideoFileOld videoFileOld = new VideoFileOld();
                Integer num = this.$videoId;
                td1 td1Var2 = this.this$0;
                videoFileOld.c = num.intValue();
                videoFileOld.b = ((AlbumChooseArguments.NoInitialAlbums) td1Var2.c).f;
                s3q0 s3q0Var = s3q0.a;
                this.label = 1;
                wd1Var = this;
                if (cn1Var.g(list, arrayList2, videoFileOld, null, wd1Var) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                td1 td1Var3 = wd1Var.this$0;
                td1Var3.c(new id1.a(td1.q(td1Var3, (AlbumChooseState) td1Var3.b.getCurrentState())));
                return s3q0.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        wd1Var = this;
        td1 td1Var32 = wd1Var.this$0;
        td1Var32.c(new id1.a(td1.q(td1Var32, (AlbumChooseState) td1Var32.b.getCurrentState())));
        return s3q0.a;
    }
}
