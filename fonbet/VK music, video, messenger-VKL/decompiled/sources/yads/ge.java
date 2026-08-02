package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zrl;

/* loaded from: classes10.dex */
public final class ge extends SuspendLambda implements wzs {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ie e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, spj spjVar) {
        super(2, spjVar);
        this.e = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        ge geVar = new ge(this.e, spjVar);
        geVar.d = obj;
        return geVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ge geVar = new ge(this.e, (spj) obj2);
        geVar.d = (yvj) obj;
        return geVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (r5.equals(r2) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl b;
        zrl zrlVar;
        td tdVar;
        zrl zrlVar2;
        Object H;
        td tdVar2;
        vz0 vz0Var;
        String c;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        boolean z = true;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.d;
            asl b2 = myc0.b(yvjVar, null, null, new ee(this.e, null), 3);
            b = myc0.b(yvjVar, null, null, new fe(this.e, null), 3);
            asl b3 = myc0.b(yvjVar, null, null, new de(this.e, null), 3);
            this.d = b;
            this.b = b3;
            this.c = 1;
            Object J = b2.J(this);
            if (J != coroutineSingletons) {
                zrlVar = b3;
                obj = J;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tdVar2 = (td) this.b;
                tdVar = (td) this.d;
                kotlin.a.a(obj);
                String str2 = (String) obj;
                vz0Var = this.e.d;
                c = ((uh1) vz0Var.a).c("google_advertising_id_key");
                str = tdVar != null ? tdVar.a : null;
                if (c == null && str != null) {
                    ((uh1) vz0Var.a).a("google_advertising_id_key", str);
                }
                vz0 vz0Var2 = this.e.d;
                vz0Var2.getClass();
                boolean z2 = false;
                if (tdVar != null && (r5 = tdVar.a) != null) {
                    synchronized (vz0.b) {
                        String c2 = ((uh1) vz0Var2.a).c("google_advertising_id_key");
                        if (c2 != null) {
                        }
                        z = false;
                    }
                    z2 = z;
                }
                return new vd(tdVar, tdVar2, z2, str2);
            }
            tdVar = (td) this.b;
            zrlVar2 = (zrl) this.d;
            kotlin.a.a(obj);
            td tdVar3 = (td) obj;
            this.d = tdVar;
            this.b = tdVar3;
            this.c = 3;
            H = zrlVar2.H(this);
            if (H != coroutineSingletons) {
                tdVar2 = tdVar3;
                obj = H;
                String str22 = (String) obj;
                vz0Var = this.e.d;
                c = ((uh1) vz0Var.a).c("google_advertising_id_key");
                if (tdVar != null) {
                }
                if (c == null) {
                    ((uh1) vz0Var.a).a("google_advertising_id_key", str);
                }
                vz0 vz0Var22 = this.e.d;
                vz0Var22.getClass();
                boolean z22 = false;
                if (tdVar != null) {
                    synchronized (vz0.b) {
                    }
                }
                return new vd(tdVar, tdVar2, z22, str22);
            }
            return coroutineSingletons;
        }
        zrlVar = (zrl) this.b;
        b = (zrl) this.d;
        kotlin.a.a(obj);
        td tdVar4 = (td) obj;
        this.d = zrlVar;
        this.b = tdVar4;
        this.c = 2;
        Object H2 = b.H(this);
        if (H2 != coroutineSingletons) {
            zrl zrlVar3 = zrlVar;
            tdVar = tdVar4;
            obj = H2;
            zrlVar2 = zrlVar3;
            td tdVar32 = (td) obj;
            this.d = tdVar;
            this.b = tdVar32;
            this.c = 3;
            H = zrlVar2.H(this);
            if (H != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
