package xsna;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadUsersData$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class mcf extends SuspendLambda implements wzs<yvj, spj<? super Triple<? extends zrl<? extends mbq0>, ? extends zrl<? extends UploadUserInfo>, ? extends zrl<? extends Group>>>, Object> {
    final /* synthetic */ boolean $loadUser;
    final /* synthetic */ UserId $pickedAuthor;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wcf this$0;

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadUsersData$2$selectedGroupRequest$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {435, 438}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Group>, Object> {
        final /* synthetic */ UserId $pickedAuthor;
        final /* synthetic */ zrl<mbq0> $userGroupsRequest;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ wcf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zrl<mbq0> zrlVar, UserId userId, wcf wcfVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$userGroupsRequest = zrlVar;
            this.$pickedAuthor = userId;
            this.this$0 = wcfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$userGroupsRequest, this.$pickedAuthor, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Group> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            if (r6 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
        
            if (r6 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zrl<mbq0> zrlVar = this.$userGroupsRequest;
                this.label = 1;
                obj = zrlVar.H(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return (Group) obj;
                }
                kotlin.a.a(obj);
            }
            Group group = ((mbq0) obj).b;
            if (group != null) {
                return group;
            }
            UserId userId = this.$pickedAuthor;
            if (userId == null || !fkq0.b(userId)) {
                userId = null;
            }
            if (userId == null) {
                return null;
            }
            agf agfVar = this.this$0.i;
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 2;
            obj = agfVar.b(userId, this);
        }
    }

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadUsersData$2$userGroupsRequest$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {422}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super mbq0>, Object> {
        final /* synthetic */ UserId $pickedAuthor;
        int label;
        final /* synthetic */ wcf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wcf wcfVar, UserId userId, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = wcfVar;
            this.$pickedAuthor = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$pickedAuthor, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super mbq0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            agf agfVar = this.this$0.i;
            UserId userId = this.$pickedAuthor;
            this.label = 1;
            Object a = agfVar.a(0, userId, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadUsersData$2$userInfoRequest$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {CommonGatewayClient.CODE_TOO_MANY_REQUESTS}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super UploadUserInfo>, Object> {
        final /* synthetic */ boolean $loadUser;
        int label;
        final /* synthetic */ wcf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, wcf wcfVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$loadUser = z;
            this.this$0 = wcfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$loadUser, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super UploadUserInfo> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!this.$loadUser) {
                    return null;
                }
                ukf ukfVar = this.this$0.h;
                this.label = 1;
                obj = ukfVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return (UploadUserInfo) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcf(wcf wcfVar, UserId userId, boolean z, spj<? super mcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$pickedAuthor = userId;
        this.$loadUser = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mcf mcfVar = new mcf(this.this$0, this.$pickedAuthor, this.$loadUser, spjVar);
        mcfVar.L$0 = obj;
        return mcfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Triple<? extends zrl<? extends mbq0>, ? extends zrl<? extends UploadUserInfo>, ? extends zrl<? extends Group>>> spjVar) {
        return ((mcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        asl b2 = myc0.b(yvjVar, null, null, new b(this.this$0, this.$pickedAuthor, null), 3);
        return new Triple(b2, myc0.b(yvjVar, null, null, new c(this.$loadUser, this.this$0, null), 3), myc0.b(yvjVar, null, null, new a(b2, this.$pickedAuthor, this.this$0, null), 3));
    }
}
