package xsna;

import com.vk.music.mixsettings.MixSettingsEntity;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.p4v0;

/* compiled from: VkMixDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.mix.delegates.VkMixDelegateKt$handleStartPlayVkMix$1", f = "VkMixDelegate.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class f4v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ String $blockId;
    final /* synthetic */ String $entityId;
    final /* synthetic */ String $mixId;
    final /* synthetic */ String $mixOptions;
    final /* synthetic */ String $sectionId;
    final /* synthetic */ com.vk.catalog.mvi.block.music.impl.artists.mix.a $this_handleStartPlayVkMix;
    final /* synthetic */ String $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4v0(com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, spj<? super f4v0> spjVar) {
        super(2, spjVar);
        this.$this_handleStartPlayVkMix = aVar;
        this.$mixId = str;
        this.$mixOptions = str2;
        this.$blockId = str3;
        this.$sectionId = str4;
        this.$title = str5;
        this.$actionId = str6;
        this.$entityId = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f4v0(this.$this_handleStartPlayVkMix, this.$mixId, this.$mixOptions, this.$blockId, this.$sectionId, this.$title, this.$actionId, this.$entityId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f4v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            q4v0 q4v0Var = this.$this_handleStartPlayVkMix.c;
            String str = this.$mixId;
            String str2 = this.$mixOptions;
            this.label = 1;
            b = q4v0Var.b(str, str2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar = this.$this_handleStartPlayVkMix;
        String str3 = this.$blockId;
        String str4 = this.$sectionId;
        String str5 = this.$mixId;
        String str6 = this.$title;
        String str7 = this.$actionId;
        String str8 = this.$entityId;
        if (!(b instanceof Result.Failure)) {
            g4v0.a(aVar, str3, str4, str5, str6, str7, str8, (MixSettingsEntity) b);
        }
        String str9 = this.$mixOptions;
        String str10 = this.$title;
        com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar2 = this.$this_handleStartPlayVkMix;
        String str11 = this.$blockId;
        String str12 = this.$sectionId;
        String str13 = this.$mixId;
        String str14 = this.$actionId;
        String str15 = this.$entityId;
        if (Result.a(b) != null) {
            g4v0.a(aVar2, str11, str12, str13, str10, str14, str15, p4v0.a.a(str9, str10));
        }
        return s3q0.a;
    }
}
