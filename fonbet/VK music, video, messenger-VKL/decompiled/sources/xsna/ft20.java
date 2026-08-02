package xsna;

import android.graphics.Bitmap;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MlEnhanceTool.kt */
@b6l(c = "com.vk.photo.editor.features.mlenhance.MlEnhanceTool$startPhotoUpload$1", f = "MlEnhanceTool.kt", l = {Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ft20 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.mlenhance.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft20(com.vk.photo.editor.features.mlenhance.c cVar, spj<? super ft20> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ft20(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ft20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        ld7 ld7Var;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                i4p i4pVar = ((EditorState) this.this$0.c.d().b.b.getValue()).a;
                if (i4pVar == null) {
                    return s3q0.a;
                }
                Map<f5p, g5p> map = ((EditorState) this.this$0.c.d().b.b.getValue()).b;
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                Set<f5p> keySet = ((EditorState) this.this$0.c.d().b.b.getValue()).b.keySet();
                for (Map.Entry<f5p, g5p> entry : map.entrySet()) {
                    f5p key = entry.getKey();
                    g5p value = entry.getValue();
                    if (keySet.contains(key)) {
                        hashMap2.put(key, value);
                    } else {
                        hashMap3.put(key, value);
                    }
                }
                zdl i2 = this.this$0.c.i();
                Integer num = new Integer(2560);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = hashMap3;
                this.L$4 = null;
                this.label = 1;
                obj = i2.a(i4pVar, hashMap2, num, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hashMap = hashMap3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashMap = (HashMap) this.L$3;
                kotlin.a.a(obj);
            }
            ld7Var = obj instanceof ld7 ? (ld7) obj : null;
        } catch (LowMemoryException e) {
            n4p logger = this.this$0.c.getLogger();
            if (logger != null) {
                logger.a(e);
            }
            this.this$0.c.d().a(EditorMessage.b.a);
        } catch (Throwable th) {
            n4p logger2 = this.this$0.c.getLogger();
            if (logger2 != null) {
                logger2.a(th);
            }
            v3p v3pVar = this.this$0.c;
            v3pVar.o(3000L, v3pVar.x().getString(R.string.editor_render_error));
        }
        if (ld7Var != null && (bitmap = ld7Var.a) != null) {
            com.vk.photo.editor.features.mlenhance.c cVar = this.this$0;
            cVar.d.a(bitmap, new com.vk.photo.editor.features.mlenhance.d(cVar, hashMap, bitmap));
            return s3q0.a;
        }
        return s3q0.a;
    }
}
