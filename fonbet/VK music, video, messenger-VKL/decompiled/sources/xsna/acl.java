package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;
import xsna.ogo;

/* compiled from: Button.kt */
@b6l(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {551, 560}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class acl extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<pco, sq2> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ vax $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ bcl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acl(if2<pco, sq2> if2Var, float f, boolean z, bcl bclVar, vax vaxVar, spj<? super acl> spjVar) {
        super(2, spjVar);
        this.$animatable = if2Var;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = bclVar;
        this.$interaction = vaxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new acl(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((acl) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        if (r11 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        if ((r11 instanceof xsna.pvr) != false) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!pco.b(((pco) ((zak0) this.$animatable.e).getValue()).b, this.$target)) {
                if (this.$enabled) {
                    float f = ((pco) ((zak0) this.$animatable.e).getValue()).b;
                    dtp0<pco> dtp0Var = null;
                    vax bVar = pco.b(f, this.this$0.b) ? new o2d0.b(0L) : pco.b(f, this.this$0.d) ? new lgv() : pco.b(f, this.this$0.e) ? new pvr() : null;
                    if2<pco, sq2> if2Var = this.$animatable;
                    float f2 = this.$target;
                    vax vaxVar = this.$interaction;
                    this.label = 2;
                    dtp0<pco> dtp0Var2 = fbp.b;
                    dtp0<pco> dtp0Var3 = fbp.a;
                    if (vaxVar != null) {
                        if ((vaxVar instanceof o2d0.b) || (vaxVar instanceof ogo.b) || (vaxVar instanceof lgv) || (vaxVar instanceof pvr)) {
                            dtp0Var = dtp0Var3;
                        }
                    } else if (bVar != null) {
                        if (!(bVar instanceof o2d0.b) && !(bVar instanceof ogo.b)) {
                            if (bVar instanceof lgv) {
                                dtp0Var = fbp.c;
                            }
                        }
                        dtp0Var = dtp0Var2;
                    }
                    dtp0<pco> dtp0Var4 = dtp0Var;
                    if (dtp0Var4 != null) {
                        e = if2.c(if2Var, new pco(f2), dtp0Var4, null, this, 12);
                        if (e != obj2) {
                            e = s3q0.a;
                        }
                    } else {
                        e = if2Var.e(new pco(f2), this);
                        if (e != obj2) {
                            e = s3q0.a;
                        }
                    }
                } else {
                    if2<pco, sq2> if2Var2 = this.$animatable;
                    pco pcoVar = new pco(this.$target);
                    this.label = 1;
                    if (if2Var2.e(pcoVar, this) == obj2) {
                    }
                }
                return obj2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
