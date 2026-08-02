package xsna;

import com.vk.api.generated.assets.dto.AssetsItemDto;
import com.vk.log.L;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.gbu0;
import xsna.m6v0;

/* compiled from: VkAssetManagerImpl.kt */
@b6l(c = "com.vk.asset.manager.impl.VkAssetManagerImpl$loadAsset$2", f = "VkAssetManagerImpl.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class hbu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $assetId;
    final /* synthetic */ gbu0.a $error;
    final /* synthetic */ gbu0.b $success;
    int label;
    final /* synthetic */ ibu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbu0(String str, gbu0.a aVar, ibu0 ibu0Var, gbu0.b bVar, spj<? super hbu0> spjVar) {
        super(2, spjVar);
        this.$assetId = str;
        this.$error = aVar;
        this.this$0 = ibu0Var;
        this.$success = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hbu0(this.$assetId, this.$error, this.this$0, this.$success, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hbu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m6v0.a aVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                iz2 A = yfb.A(new sdy().i(Collections.singletonList(this.$assetId)));
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ibu0 ibu0Var = this.this$0;
            String str = this.$assetId;
            gbu0.b bVar = this.$success;
            Iterator it = ((List) obj).iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (epx.f(((AssetsItemDto) obj2).d(), str)) {
                    break;
                }
            }
            AssetsItemDto assetsItemDto = (AssetsItemDto) obj2;
            if (assetsItemDto != null) {
                ibu0Var.getClass();
                aVar = new m6v0.a(assetsItemDto.d(), assetsItemDto.getUrl());
            }
            if (aVar != null) {
                ibu0Var.a.put(str, aVar);
            }
            ((aos0) bVar).a(aVar);
        } catch (Throwable th) {
            L.i(th);
            ((ewc) ((xx40) this.$error).c).invoke(yns0.g);
        }
        return s3q0.a;
    }
}
