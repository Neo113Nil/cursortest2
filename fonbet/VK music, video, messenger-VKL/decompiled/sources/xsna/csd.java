package xsna;

import android.content.ContentValues;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.impl.exception.ClipsDraftsException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$setActiveDraft$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class csd extends SuspendLambda implements wzs<lud, spj<? super otd>, Object> {
    final /* synthetic */ String $draftId;
    final /* synthetic */ boolean $isActive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csd(String str, boolean z, spj<? super csd> spjVar) {
        super(2, spjVar);
        this.$draftId = str;
        this.$isActive = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        csd csdVar = new csd(this.$draftId, this.$isActive, spjVar);
        csdVar.L$0 = obj;
        return csdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super otd> spjVar) {
        return ((csd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        final String str = this.$draftId;
        final boolean z = this.$isActive;
        final gyg0 gyg0Var = ludVar.a;
        gyg0Var.getClass();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        try {
            fl3.k(gyg0Var.getWritableDatabase(), new izs() { // from class: xsna.fyg0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    String[] m;
                    String str2;
                    gyg0 gyg0Var2 = gyg0.this;
                    String[] o = gyg0Var2.o(str);
                    if (o == 0) {
                        return null;
                    }
                    boolean z2 = z;
                    if (z2 && (m = gyg0Var2.m()) != null && (str2 = m[0]) != null) {
                        if (str2 != null) {
                            ContentValues c = gyg0.c(m);
                            c.put("is_active", Boolean.FALSE);
                            gyg0Var2.r(str2, c, true);
                        }
                        gyg0Var2.d.f(new ddo(str2, false));
                    }
                    String str3 = o[0];
                    if (str3 != 0) {
                        ContentValues c2 = gyg0.c(o);
                        c2.put("is_active", Boolean.valueOf(z2));
                        gyg0Var2.r(str3, c2, true);
                    }
                    ref$ObjectRef.element = o[1];
                    return s3q0.a;
                }
            });
            gyg0Var.d.f(new ddo(str, z));
        } catch (Throwable th) {
            gyg0Var.b.g(th, new Object[0]);
        }
        String str2 = (String) ref$ObjectRef.element;
        if (str2 == null) {
            ludVar.c.c(new ClipsDraftsException("attempt to set active non-existent draft with id=".concat(str)));
            return null;
        }
        ClipsDraft a = ludVar.a(str2);
        otd D = a != null ? vua0.D(a) : null;
        if (z) {
            ludVar.d = D;
            return D;
        }
        otd otdVar = ludVar.d;
        if (str.equals(otdVar != null ? otdVar.a.a : null)) {
            ludVar.d = null;
        }
        return D;
    }
}
