package xsna;

import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.dto.common.id.UserId;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl$uploadNewCover$2", f = "ClipEditSdkRepositoryImpl.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class vtc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $pathUri;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wtc this$0;

    /* compiled from: ClipEditSdkRepositoryImpl.kt */
    public static final class a {
        public final /* synthetic */ lq9 a;

        public a(lq9 lq9Var) {
            this.a = lq9Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtc(wtc wtcVar, String str, spj<? super vtc> spjVar) {
        super(2, spjVar);
        this.this$0 = wtcVar;
        this.$pathUri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vtc(this.this$0, this.$pathUri, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vtc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wtc wtcVar = this.this$0;
            String str = this.$pathUri;
            this.L$0 = wtcVar;
            this.L$1 = str;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            zrc zrcVar = wtcVar.g;
            ClipEditSdkItem clipEditSdkItem = wtcVar.b;
            File a2 = zrcVar.b.a(zrcVar.a, str != null ? jeq0.g(str) : null);
            if (a2 == null) {
                a2 = new File(str);
            }
            msc mscVar = wtcVar.a;
            UserId userId = clipEditSdkItem.c;
            UserId userId2 = clipEditSdkItem.c;
            mscVar.a(a2, fkq0.b(userId) ? new ClipUploaderData.Author.VkGroup(fkq0.a(userId2)) : new ClipUploaderData.Author.VkUser(userId2), Integer.parseInt(clipEditSdkItem.b), new a(lq9Var));
            if (lq9Var.n() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
