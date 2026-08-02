package xsna;

import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$AutoRepostToStoryWithLikes;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$Products;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$PublishOnlyFromGroups;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupVkTicketDto;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadInitial$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {183, 201, 203, 204, 205, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 224, 249}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class zbf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.o $task;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$21;
    Object L$22;
    Object L$23;
    Object L$24;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ wcf this$0;

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadInitial$2$areLinksAvailableForUser$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ UserId $pickedAuthor;
        int label;
        final /* synthetic */ wcf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wcf wcfVar, UserId userId, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = wcfVar;
            this.$pickedAuthor = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$pickedAuthor, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!this.this$0.m.p()) {
                    z = false;
                    return Boolean.valueOf(z);
                }
                ukf ukfVar = this.this$0.h;
                UserId userId = this.$pickedAuthor;
                if (userId == null || !fkq0.b(userId)) {
                    userId = null;
                }
                this.label = 1;
                obj = ukfVar.b(userId, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            z = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: ClipsUploadAsyncLoadExecutor.kt */
    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadInitial$2$canAttachProductForUser$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {198}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
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
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
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
            ukf ukfVar = this.this$0.h;
            UserId userId = this.$pickedAuthor;
            if (userId == null || !fkq0.b(userId)) {
                userId = null;
            }
            this.label = 1;
            Object c = ukfVar.c(userId, this);
            return c == coroutineSingletons ? coroutineSingletons : c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbf(wcf wcfVar, mjf.a.o oVar, spj<? super zbf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zbf zbfVar = new zbf(this.this$0, this.$task, spjVar);
        zbfVar.L$0 = obj;
        return zbfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zbf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0276, code lost:
    
        if (r6 != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01eb, code lost:
    
        if (r3 == r2) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UserId userId;
        Object d;
        Object J;
        zrl zrlVar;
        zrl zrlVar2;
        zrl zrlVar3;
        zrl zrlVar4;
        Object obj2;
        Object H;
        zrl zrlVar5;
        boolean z;
        UploadUserInfo uploadUserInfo;
        Object H2;
        Object H3;
        UploadUserInfo uploadUserInfo2;
        Group group;
        zrl zrlVar6;
        ConditionalFeature<ClipsLinkAttachment> conditionalFeature;
        Object v;
        oap oapVar;
        Parcelable parcelable;
        UploadUserInfo uploadUserInfo3;
        Group group2;
        mbq0 mbq0Var;
        ClipInvolvementActionButton a2;
        boolean z2;
        Object d2;
        ConditionalFeature conditionalFeature2;
        mbq0 mbq0Var2;
        HideableFeature hideableFeature;
        oap oapVar2;
        Group group3;
        ConditionalFeature.State state;
        ConditionalFeature.State state2;
        yvj yvjVar;
        Object t;
        ConditionalFeature conditionalFeature3;
        HideableFeature hideableFeature2;
        ConditionalFeature conditionalFeature4;
        UploadUserInfo uploadUserInfo4;
        ClipInvolvementActionButton clipInvolvementActionButton;
        boolean z3;
        DisableableSwitch disableableSwitch;
        ConditionalFeature conditionalFeature5;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData;
        Group group4;
        ConditionalFeature conditionalFeature6;
        List list;
        wcf wcfVar;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2;
        Group group5;
        wcf wcfVar2;
        UserId userId2;
        ClipInvolvementActionButton<?> clipInvolvementActionButton2;
        GroupVkTicketDto groupVkTicketDto;
        yvj yvjVar2 = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.a.a(obj);
                this.this$0.t.init();
                mjf.a.o oVar = this.$task;
                userId = oVar.c;
                wcf wcfVar3 = this.this$0;
                boolean z4 = !oVar.b.f.contains(ClipUploadScreenFeature$PublishOnlyFromGroups.b);
                this.L$0 = yvjVar2;
                this.L$1 = userId;
                this.label = 1;
                wcfVar3.getClass();
                d = zvj.d(new mcf(wcfVar3, userId, z4, null), this);
                break;
            case 1:
                UserId userId3 = (UserId) this.L$1;
                kotlin.a.a(obj);
                userId = userId3;
                d = obj;
                Triple triple = (Triple) d;
                zrl zrlVar7 = (zrl) triple.d();
                zrl zrlVar8 = (zrl) triple.g();
                zrl zrlVar9 = (zrl) triple.h();
                asl b2 = myc0.b(yvjVar2, null, null, new a(this.this$0, userId, null), 3);
                asl b3 = myc0.b(yvjVar2, null, null, new b(this.this$0, userId, null), 3);
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = zrlVar7;
                this.L$3 = zrlVar8;
                this.L$4 = zrlVar9;
                this.L$5 = b2;
                this.label = 2;
                J = b3.J(this);
                if (J != coroutineSingletons) {
                    zrlVar = zrlVar9;
                    zrlVar2 = b2;
                    zrlVar3 = zrlVar7;
                    zrlVar4 = zrlVar8;
                    boolean booleanValue = ((Boolean) J).booleanValue();
                    this.L$0 = yvjVar2;
                    obj2 = null;
                    this.L$1 = null;
                    this.L$2 = zrlVar3;
                    this.L$3 = null;
                    this.L$4 = zrlVar;
                    this.L$5 = zrlVar2;
                    this.Z$0 = booleanValue;
                    this.label = 3;
                    H = zrlVar4.H(this);
                    if (H != coroutineSingletons) {
                        zrlVar5 = zrlVar2;
                        z = booleanValue;
                        uploadUserInfo = (UploadUserInfo) H;
                        this.L$0 = yvjVar2;
                        this.L$1 = obj2;
                        this.L$2 = zrlVar3;
                        this.L$3 = obj2;
                        this.L$4 = obj2;
                        this.L$5 = zrlVar5;
                        this.L$6 = uploadUserInfo;
                        this.Z$0 = z;
                        this.label = 4;
                        H2 = zrlVar.H(this);
                        break;
                    }
                }
                return coroutineSingletons;
            case 2:
                zrlVar2 = (zrl) this.L$5;
                zrl zrlVar10 = (zrl) this.L$4;
                zrl zrlVar11 = (zrl) this.L$3;
                zrl zrlVar12 = (zrl) this.L$2;
                kotlin.a.a(obj);
                zrlVar3 = zrlVar12;
                zrlVar4 = zrlVar11;
                zrlVar = zrlVar10;
                J = obj;
                boolean booleanValue2 = ((Boolean) J).booleanValue();
                this.L$0 = yvjVar2;
                obj2 = null;
                this.L$1 = null;
                this.L$2 = zrlVar3;
                this.L$3 = null;
                this.L$4 = zrlVar;
                this.L$5 = zrlVar2;
                this.Z$0 = booleanValue2;
                this.label = 3;
                H = zrlVar4.H(this);
                if (H != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                z = this.Z$0;
                zrl zrlVar13 = (zrl) this.L$5;
                zrl zrlVar14 = (zrl) this.L$4;
                zrl zrlVar15 = (zrl) this.L$2;
                kotlin.a.a(obj);
                zrlVar3 = zrlVar15;
                obj2 = null;
                zrlVar = zrlVar14;
                zrlVar5 = zrlVar13;
                H = obj;
                uploadUserInfo = (UploadUserInfo) H;
                this.L$0 = yvjVar2;
                this.L$1 = obj2;
                this.L$2 = zrlVar3;
                this.L$3 = obj2;
                this.L$4 = obj2;
                this.L$5 = zrlVar5;
                this.L$6 = uploadUserInfo;
                this.Z$0 = z;
                this.label = 4;
                H2 = zrlVar.H(this);
                break;
            case 4:
                z = this.Z$0;
                uploadUserInfo = (UploadUserInfo) this.L$6;
                zrlVar5 = (zrl) this.L$5;
                zrl zrlVar16 = (zrl) this.L$2;
                kotlin.a.a(obj);
                zrlVar3 = zrlVar16;
                H2 = obj;
                Group group6 = (Group) H2;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = zrlVar5;
                this.L$6 = uploadUserInfo;
                this.L$7 = group6;
                this.Z$0 = z;
                this.label = 5;
                H3 = zrlVar3.H(this);
                if (H3 != coroutineSingletons) {
                    uploadUserInfo2 = uploadUserInfo;
                    group = group6;
                    zrlVar6 = zrlVar5;
                    mbq0 mbq0Var3 = (mbq0) H3;
                    this.this$0.getClass();
                    oap aVar = group == null ? new oap.a(group) : uploadUserInfo2 == null ? new oap.a(j5g.Y(mbq0Var3.a)) : new oap.b(uploadUserInfo2);
                    conditionalFeature = this.$task.b.e.b;
                    ClipsLinkAttachment clipsLinkAttachment = conditionalFeature.b;
                    wcf wcfVar4 = this.this$0;
                    this.L$0 = yvjVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = uploadUserInfo2;
                    this.L$7 = group;
                    this.L$8 = mbq0Var3;
                    this.L$9 = aVar;
                    this.L$10 = conditionalFeature;
                    this.L$11 = clipsLinkAttachment;
                    this.Z$0 = z;
                    this.label = 6;
                    v = wcf.v(wcfVar4, zrlVar6, this);
                    if (v != coroutineSingletons) {
                        oapVar = aVar;
                        parcelable = clipsLinkAttachment;
                        uploadUserInfo3 = uploadUserInfo2;
                        group2 = group;
                        mbq0Var = mbq0Var3;
                        conditionalFeature.getClass();
                        ConditionalFeature conditionalFeature7 = new ConditionalFeature(parcelable, (ConditionalFeature.State) v);
                        HideableFeature hideableFeature3 = new HideableFeature(this.$task.b.e.f.b, kff.d(oapVar, this.this$0.u));
                        a2 = kff.a(oapVar, this.this$0.u);
                        z2 = this.this$0.q.b().e;
                        wcf wcfVar5 = this.this$0;
                        this.L$0 = yvjVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = uploadUserInfo3;
                        this.L$7 = group2;
                        this.L$8 = mbq0Var;
                        this.L$9 = oapVar;
                        this.L$10 = conditionalFeature7;
                        this.L$11 = hideableFeature3;
                        this.L$12 = a2;
                        this.Z$0 = z;
                        this.Z$1 = z2;
                        this.label = 7;
                        wcfVar5.getClass();
                        d2 = zvj.d(new rbf(wcfVar5, oapVar, z2, null), this);
                        if (d2 != coroutineSingletons) {
                            conditionalFeature2 = conditionalFeature7;
                            mbq0Var2 = mbq0Var;
                            hideableFeature = hideableFeature3;
                            oapVar2 = oapVar;
                            group3 = group2;
                            ConditionalFeature conditionalFeature8 = (ConditionalFeature) d2;
                            CoauthorsData coauthorsData = this.$task.b.e.d.b;
                            T t2 = conditionalFeature8.b;
                            ConditionalFeature conditionalFeature9 = new ConditionalFeature(coauthorsData, kff.b(oapVar2, (ClipsUploadPrivacyData) t2));
                            ClipsUploadPrivacyData clipsUploadPrivacyData = (ClipsUploadPrivacyData) t2;
                            boolean z5 = z;
                            boolean z6 = z2;
                            DisableableSwitch a3 = DisableableSwitch.a(this.$task.b.e.i, false, kff.h(oapVar2, clipsUploadPrivacyData), 1);
                            wcf wcfVar6 = this.this$0;
                            ClipsUploadDataInternal clipsUploadDataInternal = this.$task.b;
                            wcfVar6.getClass();
                            ClipInvolvementActionButton clipInvolvementActionButton3 = a2;
                            Pair c = kff.c(clipsUploadPrivacyData.b, (Group) oapVar2.a(), oapVar2, clipsUploadDataInternal.e.j.d() == null, clipsUploadDataInternal.f);
                            ConditionalFeature.State state3 = (ConditionalFeature.State) c.i();
                            EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = (EasyPromoteUnavalabilityReason) c.j();
                            EasyPromoteSettings b4 = wcfVar6.q.b();
                            HideableFeature hideableFeature4 = hideableFeature;
                            ConditionalFeature conditionalFeature10 = new ConditionalFeature(new EasyPromoteData(b4.b, b4.c, b4.e, easyPromoteUnavalabilityReason), state3);
                            wcf wcfVar7 = this.this$0;
                            mjf.a.o oVar2 = this.$task;
                            wcfVar7.getClass();
                            if (!(oapVar2 instanceof oap.b)) {
                                PostingVisibilityMode postingVisibilityMode = clipsUploadPrivacyData.b;
                                if (postingVisibilityMode != PostingVisibilityMode.ALL && postingVisibilityMode != PostingVisibilityMode.FRIENDS && wcfVar7.u.contains(ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b)) {
                                    state = ConditionalFeature.State.DISABLED;
                                    state2 = state;
                                    mjf.a.o oVar3 = this.$task;
                                    ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = oVar3.b.e;
                                    wcf wcfVar8 = this.this$0;
                                    this.L$0 = yvjVar2;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = uploadUserInfo3;
                                    this.L$7 = group3;
                                    this.L$8 = mbq0Var2;
                                    this.L$9 = oapVar2;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.L$13 = null;
                                    this.L$14 = null;
                                    this.L$15 = null;
                                    this.L$16 = conditionalFeature10;
                                    this.L$17 = state2;
                                    this.L$18 = clipsUploadAuthorRelatedData3;
                                    this.L$19 = conditionalFeature2;
                                    this.L$20 = conditionalFeature8;
                                    this.L$21 = conditionalFeature9;
                                    this.L$22 = hideableFeature4;
                                    this.L$23 = clipInvolvementActionButton3;
                                    yvjVar = yvjVar2;
                                    this.L$24 = a3;
                                    this.Z$0 = z5;
                                    this.Z$1 = z6;
                                    this.label = 8;
                                    t = wcf.t(wcfVar8, oVar3, z6, this);
                                    coroutineSingletons = coroutineSingletons;
                                    if (t != coroutineSingletons) {
                                        conditionalFeature3 = conditionalFeature10;
                                        hideableFeature2 = hideableFeature4;
                                        conditionalFeature4 = conditionalFeature8;
                                        uploadUserInfo4 = uploadUserInfo3;
                                        clipInvolvementActionButton = clipInvolvementActionButton3;
                                        z3 = z5;
                                        disableableSwitch = a3;
                                        conditionalFeature5 = conditionalFeature9;
                                        clipsUploadAuthorRelatedData = clipsUploadAuthorRelatedData3;
                                        group4 = group3;
                                        conditionalFeature6 = conditionalFeature2;
                                        ConditionalNumber conditionalNumber = (ConditionalNumber) t;
                                        boolean f = kff.f(this.this$0.m, oapVar2);
                                        boolean g = kff.g(oapVar2);
                                        ConditionalFeature a4 = ConditionalFeature.a(this.$task.b.e.q, null, state2, 1);
                                        mhd mhdVar = this.this$0.m;
                                        ClipsUploadAuthorRelatedData a5 = ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, conditionalFeature6, conditionalFeature4, conditionalFeature5, null, hideableFeature2, clipInvolvementActionButton, null, disableableSwitch, conditionalNumber, conditionalFeature3, f, false, false, g, a4, kff.e(oapVar2), group4 == null && (groupVkTicketDto = group4.R) != null && groupVkTicketDto.d(), 13384);
                                        ClipsUploadStaticData clipsUploadStaticData = this.$task.b.d;
                                        mhd mhdVar2 = this.this$0.m;
                                        HideableFeature<ProductsData> hideableFeature5 = clipsUploadStaticData.l;
                                        this.this$0.e(new ugf.f.c(ClipsUploadDataInternal.a(this.$task.b, null, null, ClipsUploadStaticData.a(clipsUploadStaticData, null, null, false, false, null, null, null, null, null, HideableFeature.a(hideableFeature5, null, !hideableFeature5.c && z3, 1), false, false, false, false, 31743), a5, 19), uploadUserInfo4, mbq0Var2.a, mbq0Var2.d, mbq0Var2.c, group4));
                                        zvj.e(yvjVar);
                                        this.this$0.a(new mjf.e.b(this.$task.b));
                                        wcf wcfVar9 = this.this$0;
                                        list = this.$task.b.c.x;
                                        if (list == null) {
                                            list = EmptyList.b;
                                        }
                                        wcfVar9.a(new mjf.a.i(list));
                                        this.this$0.a(mjf.a.q.b);
                                        this.this$0.a(mjf.a.h.b);
                                        this.this$0.a(mjf.a.l.b);
                                        this.this$0.a(mjf.a.g.b);
                                        this.this$0.a(mjf.a.f.b);
                                        this.this$0.a(mjf.a.k.b);
                                        wcfVar = this.this$0;
                                        clipsUploadAuthorRelatedData2 = this.$task.b.e;
                                        wcfVar.getClass();
                                        group5 = (Group) oapVar2.a();
                                        if (group5 != null && (userId2 = group5.c) != null) {
                                            wcfVar.a(new mjf.a.m(userId2));
                                            clipInvolvementActionButton2 = clipsUploadAuthorRelatedData2.f.b;
                                            if (clipInvolvementActionButton2 != null) {
                                                wcfVar.a(new mjf.a.r(userId2, clipInvolvementActionButton2));
                                            }
                                        }
                                        wcfVar2 = this.this$0;
                                        wcfVar2.getClass();
                                        wcfVar2.a(mjf.a.j.b);
                                        wcfVar2.a(mjf.a.b.b);
                                        if (wcfVar2.u.contains(ClipUploadScreenFeature$Products.b)) {
                                            wcfVar2.a(mjf.a.d.b);
                                        }
                                        return s3q0.a;
                                    }
                                }
                            } else {
                                if (!(oapVar2 instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            state = oVar2.b.e.q.c;
                            state2 = state;
                            mjf.a.o oVar32 = this.$task;
                            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData32 = oVar32.b.e;
                            wcf wcfVar82 = this.this$0;
                            this.L$0 = yvjVar2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = uploadUserInfo3;
                            this.L$7 = group3;
                            this.L$8 = mbq0Var2;
                            this.L$9 = oapVar2;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.L$12 = null;
                            this.L$13 = null;
                            this.L$14 = null;
                            this.L$15 = null;
                            this.L$16 = conditionalFeature10;
                            this.L$17 = state2;
                            this.L$18 = clipsUploadAuthorRelatedData32;
                            this.L$19 = conditionalFeature2;
                            this.L$20 = conditionalFeature8;
                            this.L$21 = conditionalFeature9;
                            this.L$22 = hideableFeature4;
                            this.L$23 = clipInvolvementActionButton3;
                            yvjVar = yvjVar2;
                            this.L$24 = a3;
                            this.Z$0 = z5;
                            this.Z$1 = z6;
                            this.label = 8;
                            t = wcf.t(wcfVar82, oVar32, z6, this);
                            coroutineSingletons = coroutineSingletons;
                            if (t != coroutineSingletons) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                z = this.Z$0;
                Group group7 = (Group) this.L$7;
                UploadUserInfo uploadUserInfo5 = (UploadUserInfo) this.L$6;
                zrlVar6 = (zrl) this.L$5;
                kotlin.a.a(obj);
                H3 = obj;
                group = group7;
                uploadUserInfo2 = uploadUserInfo5;
                mbq0 mbq0Var32 = (mbq0) H3;
                this.this$0.getClass();
                if (group == null) {
                }
                conditionalFeature = this.$task.b.e.b;
                ClipsLinkAttachment clipsLinkAttachment2 = conditionalFeature.b;
                wcf wcfVar42 = this.this$0;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = uploadUserInfo2;
                this.L$7 = group;
                this.L$8 = mbq0Var32;
                this.L$9 = aVar;
                this.L$10 = conditionalFeature;
                this.L$11 = clipsLinkAttachment2;
                this.Z$0 = z;
                this.label = 6;
                v = wcf.v(wcfVar42, zrlVar6, this);
                if (v != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                z = this.Z$0;
                parcelable = (Parcelable) this.L$11;
                conditionalFeature = (ConditionalFeature) this.L$10;
                oap oapVar3 = (oap) this.L$9;
                mbq0 mbq0Var4 = (mbq0) this.L$8;
                Group group8 = (Group) this.L$7;
                UploadUserInfo uploadUserInfo6 = (UploadUserInfo) this.L$6;
                kotlin.a.a(obj);
                uploadUserInfo3 = uploadUserInfo6;
                group2 = group8;
                mbq0Var = mbq0Var4;
                oapVar = oapVar3;
                v = obj;
                conditionalFeature.getClass();
                ConditionalFeature conditionalFeature72 = new ConditionalFeature(parcelable, (ConditionalFeature.State) v);
                HideableFeature hideableFeature32 = new HideableFeature(this.$task.b.e.f.b, kff.d(oapVar, this.this$0.u));
                a2 = kff.a(oapVar, this.this$0.u);
                z2 = this.this$0.q.b().e;
                wcf wcfVar52 = this.this$0;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = uploadUserInfo3;
                this.L$7 = group2;
                this.L$8 = mbq0Var;
                this.L$9 = oapVar;
                this.L$10 = conditionalFeature72;
                this.L$11 = hideableFeature32;
                this.L$12 = a2;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 7;
                wcfVar52.getClass();
                d2 = zvj.d(new rbf(wcfVar52, oapVar, z2, null), this);
                if (d2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                boolean z7 = this.Z$1;
                boolean z8 = this.Z$0;
                ClipInvolvementActionButton clipInvolvementActionButton4 = (ClipInvolvementActionButton) this.L$12;
                HideableFeature hideableFeature6 = (HideableFeature) this.L$11;
                ConditionalFeature conditionalFeature11 = (ConditionalFeature) this.L$10;
                oap oapVar4 = (oap) this.L$9;
                mbq0 mbq0Var5 = (mbq0) this.L$8;
                Group group9 = (Group) this.L$7;
                UploadUserInfo uploadUserInfo7 = (UploadUserInfo) this.L$6;
                kotlin.a.a(obj);
                conditionalFeature2 = conditionalFeature11;
                group3 = group9;
                uploadUserInfo3 = uploadUserInfo7;
                d2 = obj;
                oapVar2 = oapVar4;
                hideableFeature = hideableFeature6;
                z2 = z7;
                z = z8;
                a2 = clipInvolvementActionButton4;
                mbq0Var2 = mbq0Var5;
                ConditionalFeature conditionalFeature82 = (ConditionalFeature) d2;
                CoauthorsData coauthorsData2 = this.$task.b.e.d.b;
                T t22 = conditionalFeature82.b;
                ConditionalFeature conditionalFeature92 = new ConditionalFeature(coauthorsData2, kff.b(oapVar2, (ClipsUploadPrivacyData) t22));
                ClipsUploadPrivacyData clipsUploadPrivacyData2 = (ClipsUploadPrivacyData) t22;
                boolean z52 = z;
                boolean z62 = z2;
                DisableableSwitch a32 = DisableableSwitch.a(this.$task.b.e.i, false, kff.h(oapVar2, clipsUploadPrivacyData2), 1);
                wcf wcfVar62 = this.this$0;
                ClipsUploadDataInternal clipsUploadDataInternal2 = this.$task.b;
                wcfVar62.getClass();
                ClipInvolvementActionButton clipInvolvementActionButton32 = a2;
                Pair c2 = kff.c(clipsUploadPrivacyData2.b, (Group) oapVar2.a(), oapVar2, clipsUploadDataInternal2.e.j.d() == null, clipsUploadDataInternal2.f);
                ConditionalFeature.State state32 = (ConditionalFeature.State) c2.i();
                EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason2 = (EasyPromoteUnavalabilityReason) c2.j();
                EasyPromoteSettings b42 = wcfVar62.q.b();
                HideableFeature hideableFeature42 = hideableFeature;
                ConditionalFeature conditionalFeature102 = new ConditionalFeature(new EasyPromoteData(b42.b, b42.c, b42.e, easyPromoteUnavalabilityReason2), state32);
                wcf wcfVar72 = this.this$0;
                mjf.a.o oVar22 = this.$task;
                wcfVar72.getClass();
                if (!(oapVar2 instanceof oap.b)) {
                }
                state = oVar22.b.e.q.c;
                state2 = state;
                mjf.a.o oVar322 = this.$task;
                ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData322 = oVar322.b.e;
                wcf wcfVar822 = this.this$0;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = uploadUserInfo3;
                this.L$7 = group3;
                this.L$8 = mbq0Var2;
                this.L$9 = oapVar2;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.L$16 = conditionalFeature102;
                this.L$17 = state2;
                this.L$18 = clipsUploadAuthorRelatedData322;
                this.L$19 = conditionalFeature2;
                this.L$20 = conditionalFeature82;
                this.L$21 = conditionalFeature92;
                this.L$22 = hideableFeature42;
                this.L$23 = clipInvolvementActionButton32;
                yvjVar = yvjVar2;
                this.L$24 = a32;
                this.Z$0 = z52;
                this.Z$1 = z62;
                this.label = 8;
                t = wcf.t(wcfVar822, oVar322, z62, this);
                coroutineSingletons = coroutineSingletons;
                if (t != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                boolean z9 = this.Z$0;
                DisableableSwitch disableableSwitch2 = (DisableableSwitch) this.L$24;
                ClipInvolvementActionButton clipInvolvementActionButton5 = (ClipInvolvementActionButton) this.L$23;
                HideableFeature hideableFeature7 = (HideableFeature) this.L$22;
                ConditionalFeature conditionalFeature12 = (ConditionalFeature) this.L$21;
                ConditionalFeature conditionalFeature13 = (ConditionalFeature) this.L$20;
                ConditionalFeature conditionalFeature14 = (ConditionalFeature) this.L$19;
                ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData4 = (ClipsUploadAuthorRelatedData) this.L$18;
                state2 = (ConditionalFeature.State) this.L$17;
                ConditionalFeature conditionalFeature15 = (ConditionalFeature) this.L$16;
                oapVar2 = (oap) this.L$9;
                mbq0Var2 = (mbq0) this.L$8;
                Group group10 = (Group) this.L$7;
                UploadUserInfo uploadUserInfo8 = (UploadUserInfo) this.L$6;
                kotlin.a.a(obj);
                yvjVar = yvjVar2;
                disableableSwitch = disableableSwitch2;
                clipInvolvementActionButton = clipInvolvementActionButton5;
                hideableFeature2 = hideableFeature7;
                conditionalFeature5 = conditionalFeature12;
                conditionalFeature4 = conditionalFeature13;
                conditionalFeature3 = conditionalFeature15;
                z3 = z9;
                t = obj;
                uploadUserInfo4 = uploadUserInfo8;
                conditionalFeature6 = conditionalFeature14;
                clipsUploadAuthorRelatedData = clipsUploadAuthorRelatedData4;
                group4 = group10;
                ConditionalNumber conditionalNumber2 = (ConditionalNumber) t;
                boolean f2 = kff.f(this.this$0.m, oapVar2);
                boolean g2 = kff.g(oapVar2);
                ConditionalFeature a42 = ConditionalFeature.a(this.$task.b.e.q, null, state2, 1);
                mhd mhdVar3 = this.this$0.m;
                if (group4 == null) {
                    break;
                }
                ClipsUploadAuthorRelatedData a52 = ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, conditionalFeature6, conditionalFeature4, conditionalFeature5, null, hideableFeature2, clipInvolvementActionButton, null, disableableSwitch, conditionalNumber2, conditionalFeature3, f2, false, false, g2, a42, kff.e(oapVar2), group4 == null && (groupVkTicketDto = group4.R) != null && groupVkTicketDto.d(), 13384);
                ClipsUploadStaticData clipsUploadStaticData2 = this.$task.b.d;
                mhd mhdVar22 = this.this$0.m;
                HideableFeature<ProductsData> hideableFeature52 = clipsUploadStaticData2.l;
                this.this$0.e(new ugf.f.c(ClipsUploadDataInternal.a(this.$task.b, null, null, ClipsUploadStaticData.a(clipsUploadStaticData2, null, null, false, false, null, null, null, null, null, HideableFeature.a(hideableFeature52, null, !hideableFeature52.c && z3, 1), false, false, false, false, 31743), a52, 19), uploadUserInfo4, mbq0Var2.a, mbq0Var2.d, mbq0Var2.c, group4));
                zvj.e(yvjVar);
                this.this$0.a(new mjf.e.b(this.$task.b));
                wcf wcfVar92 = this.this$0;
                list = this.$task.b.c.x;
                if (list == null) {
                }
                wcfVar92.a(new mjf.a.i(list));
                this.this$0.a(mjf.a.q.b);
                this.this$0.a(mjf.a.h.b);
                this.this$0.a(mjf.a.l.b);
                this.this$0.a(mjf.a.g.b);
                this.this$0.a(mjf.a.f.b);
                this.this$0.a(mjf.a.k.b);
                wcfVar = this.this$0;
                clipsUploadAuthorRelatedData2 = this.$task.b.e;
                wcfVar.getClass();
                group5 = (Group) oapVar2.a();
                if (group5 != null) {
                    wcfVar.a(new mjf.a.m(userId2));
                    clipInvolvementActionButton2 = clipsUploadAuthorRelatedData2.f.b;
                    if (clipInvolvementActionButton2 != null) {
                    }
                    break;
                }
                wcfVar2 = this.this$0;
                wcfVar2.getClass();
                wcfVar2.a(mjf.a.j.b);
                wcfVar2.a(mjf.a.b.b);
                if (wcfVar2.u.contains(ClipUploadScreenFeature$Products.b)) {
                }
                return s3q0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
