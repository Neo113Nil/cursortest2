package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.e530;
import defpackage.ey91;
import defpackage.gyu0;
import defpackage.ixv;
import defpackage.lqh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wz40;
import defpackage.zvd0;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {BuildConfig.API_LEVEL, 144, 182}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ gyu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(gyu0 gyu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gyu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.this$0, continuation);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1$1.L$0 = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x01bf, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00c8, code lost:
    
        if (r10 == r1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0056, code lost:
    
        if (r8 == r1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0253, code lost:
    
        if (r3 != r1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0255, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x00c8 -> B:29:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0253 -> B:7:0x0256). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        Object a;
        zvd0 zvd0Var;
        boolean z;
        f fVar2;
        PointerEventPass pointerEventPass;
        Object a2;
        Object obj2;
        zvd0 zvd0Var2;
        f fVar3;
        Object a3;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            b.b(obj);
            fVar = (f) this.L$0;
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = fVar;
            this.label = 1;
            a = z.a(fVar, true, pointerEventPass2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zvd0Var2 = (zvd0) this.L$1;
                    fVar3 = (f) this.L$0;
                    b.b(obj);
                    a3 = obj;
                    List list = ((tvd0) a3).a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj3 = null;
                            break;
                        }
                        obj3 = list.get(i3);
                        zvd0 zvd0Var3 = (zvd0) obj3;
                        if (!zvd0Var3.j() && ey91.e(zvd0Var3.a, zvd0Var2.a) && zvd0Var3.d) {
                            break;
                        }
                        i3++;
                    }
                    zvd0 zvd0Var4 = (zvd0) obj3;
                    if (zvd0Var4 != null) {
                        zvd0Var4.a();
                        PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                        this.L$0 = fVar3;
                        this.L$1 = zvd0Var2;
                        this.L$2 = null;
                        this.label = 3;
                        a3 = fVar3.a(pointerEventPass3, this);
                    }
                    return zy11.a;
                }
                pointerEventPass = (PointerEventPass) this.L$2;
                zvd0Var = (zvd0) this.L$1;
                fVar2 = (f) this.L$0;
                b.b(obj);
                a2 = obj;
                tvd0 tvd0Var = (tvd0) a2;
                List list2 = tvd0Var.a;
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i4);
                    zvd0 zvd0Var5 = (zvd0) obj2;
                    if (!zvd0Var5.j() && ey91.e(zvd0Var5.a, zvd0Var.a) && zvd0Var5.d) {
                        break;
                    }
                    i4++;
                }
                zvd0 zvd0Var6 = (zvd0) obj2;
                if (zvd0Var6 != null && zvd0Var6.b - zvd0Var.b < fVar2.g().f()) {
                    i2 = 2;
                    if (tvd0Var.c != 2) {
                        if (wu60.d(wu60.e(zvd0Var6.c, zvd0Var.c)) <= fVar2.g().b()) {
                            this.L$0 = fVar2;
                            this.L$1 = zvd0Var;
                            this.L$2 = pointerEventPass;
                            this.label = i2;
                            a2 = fVar2.a(pointerEventPass, this);
                        }
                        if (zvd0Var6 != null) {
                            gyu0 gyu0Var = this.this$0;
                            if (!gyu0Var.w) {
                                e530 node = gyu0Var.getNode();
                                wz40 wz40Var = null;
                                while (true) {
                                    if (node == null) {
                                        if (!gyu0Var.getNode().isAttached()) {
                                            ixv.b("visitChildren called on an unattached node");
                                        }
                                        wz40 wz40Var2 = new wz40(new e530[16]);
                                        e530 child$ui = gyu0Var.getNode().getChild$ui();
                                        if (child$ui == null) {
                                            qje.b(wz40Var2, gyu0Var.getNode());
                                        } else {
                                            wz40Var2.b(child$ui);
                                        }
                                        loop4: while (true) {
                                            int i5 = wz40Var2.c;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            e530 e530Var = (e530) wz40Var2.k(i5 - 1);
                                            if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                                                qje.b(wz40Var2, e530Var);
                                            } else {
                                                while (true) {
                                                    if (e530Var == null) {
                                                        break;
                                                    }
                                                    if ((e530Var.getKindSet$ui() & 1024) != 0) {
                                                        wz40 wz40Var3 = null;
                                                        while (e530Var != null) {
                                                            if (e530Var instanceof d) {
                                                                ((d) e530Var).L0(7);
                                                                break loop4;
                                                            }
                                                            if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                                                int i6 = 0;
                                                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            e530Var = e530Var2;
                                                                        } else {
                                                                            if (wz40Var3 == null) {
                                                                                wz40Var3 = new wz40(new e530[16]);
                                                                            }
                                                                            if (e530Var != null) {
                                                                                wz40Var3.b(e530Var);
                                                                                e530Var = null;
                                                                            }
                                                                            wz40Var3.b(e530Var2);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            e530Var = qje.c(wz40Var3);
                                                        }
                                                    } else {
                                                        e530Var = e530Var.getChild$ui();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (node instanceof d) {
                                            ((d) node).L0(7);
                                            break;
                                        }
                                        if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof lqh)) {
                                            int i7 = 0;
                                            for (e530 e530Var3 = ((lqh) node).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                                if ((e530Var3.getKindSet$ui() & 1024) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        node = e530Var3;
                                                    } else {
                                                        if (wz40Var == null) {
                                                            wz40Var = new wz40(new e530[16]);
                                                        }
                                                        if (node != null) {
                                                            wz40Var.b(node);
                                                            node = null;
                                                        }
                                                        wz40Var.b(e530Var3);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        node = qje.c(wz40Var);
                                    }
                                }
                            }
                            this.this$0.c.invoke();
                            zvd0Var6.a();
                            zvd0Var2 = zvd0Var;
                            fVar3 = fVar2;
                            PointerEventPass pointerEventPass32 = PointerEventPass.Initial;
                            this.L$0 = fVar3;
                            this.L$1 = zvd0Var2;
                            this.L$2 = null;
                            this.label = 3;
                            a3 = fVar3.a(pointerEventPass32, this);
                        }
                        return zy11.a;
                    }
                }
                zvd0Var6 = null;
                if (zvd0Var6 != null) {
                }
                return zy11.a;
            }
            fVar = (f) this.L$0;
            b.b(obj);
            a = obj;
        }
        zvd0Var = (zvd0) a;
        int i8 = zvd0Var.i;
        long j = zvd0Var.c;
        if (i8 == 3 || i8 == 4) {
            int i9 = (int) (j >> 32);
            if (Float.intBitsToFloat(i9) >= 0.0f && Float.intBitsToFloat(i9) < ((int) (fVar.y.C >> 32))) {
                int i10 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (Float.intBitsToFloat(i10) >= 0.0f && Float.intBitsToFloat(i10) < ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & fVar.y.C))) {
                    z = true;
                    PointerEventPass pointerEventPass4 = (!this.this$0.w || z) ? PointerEventPass.Initial : PointerEventPass.Main;
                    fVar2 = fVar;
                    pointerEventPass = pointerEventPass4;
                    this.L$0 = fVar2;
                    this.L$1 = zvd0Var;
                    this.L$2 = pointerEventPass;
                    this.label = i2;
                    a2 = fVar2.a(pointerEventPass, this);
                }
            }
            z = false;
            PointerEventPass pointerEventPass42 = (!this.this$0.w || z) ? PointerEventPass.Initial : PointerEventPass.Main;
            fVar2 = fVar;
            pointerEventPass = pointerEventPass42;
            this.L$0 = fVar2;
            this.L$1 = zvd0Var;
            this.L$2 = pointerEventPass;
            this.label = i2;
            a2 = fVar2.a(pointerEventPass, this);
        }
        return zy11.a;
    }
}
