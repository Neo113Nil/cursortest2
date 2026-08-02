package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.chat.restriction.impl.domain.WriteRestrictionAction;
import com.vk.log.L;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionActionController.kt */
@b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$loadUserStatus$1", f = "WriteRestrictionActionController.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p2y0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ o2y0 this$0;

    /* compiled from: WriteRestrictionActionController.kt */
    @b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$loadUserStatus$1$currentAction$1", f = "WriteRestrictionActionController.kt", l = {55}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super WriteRestrictionAction>, Object> {
        int label;
        final /* synthetic */ o2y0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2y0 o2y0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = o2y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super WriteRestrictionAction> spjVar) {
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
            o2y0 o2y0Var = this.this$0;
            v2y0 v2y0Var = o2y0Var.d;
            long j = o2y0Var.a;
            Peer peer = o2y0Var.b;
            this.label = 1;
            mjg mjgVar = v2y0Var.a;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Object k = myc0.k(hqu0.b(), new u2y0(v2y0Var, mjgVar.b(new aem(Peer.a.b(j), Source.ACTUAL, Collections.singletonList(peer))), null), this);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2y0(o2y0 o2y0Var, spj<? super p2y0> spjVar) {
        super(2, spjVar);
        this.this$0 = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p2y0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p2y0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                w2y0 w2y0Var = this.this$0.c;
                ShimmerFrameLayout shimmerFrameLayout = w2y0Var.a;
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.d();
                w2y0Var.b.setVisibility(8);
                w2y0Var.c.setVisibility(8);
                ovj b = hqu0.b();
                a aVar = new a(this.this$0, null);
                this.label = 1;
                obj = myc0.k(b, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            o2y0.a(this.this$0, (WriteRestrictionAction) obj);
        } catch (Throwable th) {
            L.i(th);
        }
        return s3q0.a;
    }
}
