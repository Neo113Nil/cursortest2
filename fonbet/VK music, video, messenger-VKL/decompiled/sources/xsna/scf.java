package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mjf;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$updatePrivacySetting$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {471}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class scf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.p $task;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scf(wcf wcfVar, mjf.a.p pVar, spj<? super scf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new scf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((scf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClipsUploadState.Loaded loaded;
        Object g;
        PrivacySetting privacySetting;
        ConditionalFeature conditionalFeature;
        oap bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            loaded = (ClipsUploadState.Loaded) this.this$0.b.getCurrentState();
            PrivacySetting privacySetting2 = new PrivacySetting();
            privacySetting2.e = this.this$0.l.b(this.$task.b);
            uwe uweVar = this.this$0.l;
            this.L$0 = loaded;
            this.L$1 = privacySetting2;
            this.label = 1;
            g = uwe.g(uweVar, privacySetting2, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
            privacySetting = privacySetting2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            privacySetting = (PrivacySetting) this.L$1;
            loaded = (ClipsUploadState.Loaded) this.L$0;
            kotlin.a.a(obj);
            g = obj;
        }
        ClipsUploadPrivacyData clipsUploadPrivacyData = new ClipsUploadPrivacyData(this.$task.b, privacySetting.zb(), (String) g);
        oap<Group, UploadUserInfo> a = hif.a(loaded);
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        boolean h = kff.h(a, clipsUploadPrivacyData);
        ConditionalFeature.State b = kff.b(hif.a(loaded), clipsUploadPrivacyData);
        wcf wcfVar = this.this$0;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal.e;
        CoauthorsData coauthorsData = clipsUploadAuthorRelatedData.d.b;
        if (b != ConditionalFeature.State.SHOWN) {
            coauthorsData = null;
        }
        CoauthorsData coauthorsData2 = coauthorsData;
        if (coauthorsData2 == null) {
            coauthorsData2 = new CoauthorsData(EmptyList.b);
        }
        ConditionalFeature conditionalFeature2 = new ConditionalFeature(coauthorsData2, b);
        wcf wcfVar2 = this.this$0;
        PostingVisibilityMode postingVisibilityMode = this.$task.b;
        wcfVar2.getClass();
        boolean z = clipsUploadAuthorRelatedData2.j.d() != null;
        Group b2 = hif.b(loaded, loaded.f);
        if (b2 != null) {
            bVar = new oap.a(b2);
        } else {
            UploadUserInfo uploadUserInfo = loaded.d;
            if (uploadUserInfo == null) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Something went wrong: selected id isn't present in state"));
                conditionalFeature = new ConditionalFeature(null, ConditionalFeature.State.HIDDEN);
                wcfVar.e(new ugf.g.k(clipsUploadPrivacyData, h, conditionalFeature2, conditionalFeature));
                return s3q0.a;
            }
            bVar = new oap.b(uploadUserInfo);
        }
        Pair c = kff.c(postingVisibilityMode, b2, bVar, z, clipsUploadDataInternal.f);
        ConditionalFeature.State state = (ConditionalFeature.State) c.i();
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = (EasyPromoteUnavalabilityReason) c.j();
        EasyPromoteData easyPromoteData = clipsUploadAuthorRelatedData2.k.b;
        conditionalFeature = new ConditionalFeature(easyPromoteData != null ? EasyPromoteData.a(easyPromoteData, 0, 0, false, easyPromoteUnavalabilityReason, 7) : null, state);
        wcfVar.e(new ugf.g.k(clipsUploadPrivacyData, h, conditionalFeature2, conditionalFeature));
        return s3q0.a;
    }
}
