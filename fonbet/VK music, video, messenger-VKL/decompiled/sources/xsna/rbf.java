package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oap;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$buildPrivacyData$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {398}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class rbf extends SuspendLambda implements wzs<yvj, spj<? super ConditionalFeature<ClipsUploadPrivacyData>>, Object> {
    final /* synthetic */ boolean $easyPromoteEnabled;
    final /* synthetic */ oap<Group, UploadUserInfo> $selectedAuthor;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ wcf this$0;

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$buildPrivacyData$2$privacyString$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {388}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
        final /* synthetic */ PrivacySetting $setting;
        int label;
        final /* synthetic */ wcf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wcf wcfVar, PrivacySetting privacySetting, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = wcfVar;
            this.$setting = privacySetting;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$setting, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            uwe uweVar = this.this$0.l;
            PrivacySetting privacySetting = this.$setting;
            this.label = 1;
            Object g = uwe.g(uweVar, privacySetting, this);
            return g == coroutineSingletons ? coroutineSingletons : g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rbf(wcf wcfVar, oap<? extends Group, UploadUserInfo> oapVar, boolean z, spj<? super rbf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$selectedAuthor = oapVar;
        this.$easyPromoteEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rbf rbfVar = new rbf(this.this$0, this.$selectedAuthor, this.$easyPromoteEnabled, spjVar);
        rbfVar.L$0 = obj;
        return rbfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ConditionalFeature<ClipsUploadPrivacyData>> spjVar) {
        return ((rbf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PostingVisibilityMode postingVisibilityMode;
        String str;
        UserId userId;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            PostingVisibilityMode a2 = this.this$0.l.a();
            PrivacySetting privacySetting = new PrivacySetting();
            privacySetting.e = this.this$0.l.b(a2);
            asl b = myc0.b(yvjVar, null, null, new a(this.this$0, privacySetting, null), 3);
            PrivacySetting privacySetting2 = new PrivacySetting();
            privacySetting2.e = this.this$0.l.b(a2);
            String zb = privacySetting2.zb();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = a2;
            this.L$6 = zb;
            this.label = 1;
            Object J = b.J(this);
            if (J == coroutineSingletons) {
                return coroutineSingletons;
            }
            postingVisibilityMode = a2;
            obj = J;
            str = zb;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$6;
            postingVisibilityMode = (PostingVisibilityMode) this.L$5;
            kotlin.a.a(obj);
        }
        ClipsUploadPrivacyData clipsUploadPrivacyData = new ClipsUploadPrivacyData(postingVisibilityMode, str, (String) obj);
        oap<Group, UploadUserInfo> oapVar = this.$selectedAuthor;
        if (oapVar instanceof oap.b) {
            userId = ((UploadUserInfo) ((oap.b) oapVar).a).b;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((Group) ((oap.a) oapVar).a).c;
        }
        return new ConditionalFeature(clipsUploadPrivacyData, fkq0.b(userId) ? ConditionalFeature.State.HIDDEN : this.$easyPromoteEnabled ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN);
    }
}
