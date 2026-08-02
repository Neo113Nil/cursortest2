package yads;

import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.emb;
import xsna.myc0;
import xsna.nbr;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wgl;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class yf1 extends SuspendLambda implements wzs {
    public ui50 b;
    public Object c;
    public String d;
    public int e;
    public final /* synthetic */ ag1 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf1(ag1 ag1Var, String str, spj spjVar) {
        super(2, spjVar);
        this.f = ag1Var;
        this.g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new yf1(this.f, this.g, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new yf1(this.f, this.g, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(6:6|7|8|9|10|11)(2:16|17))(1:18))(3:29|(1:31)|22)|19|20|(4:23|9|10|11)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        r5.c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        throw r7;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ui50 ui50Var;
        String str;
        ag1 ag1Var;
        ui50 ui50Var2;
        String str2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.e;
        try {
            if (r1 == 0) {
                kotlin.a.a(obj);
                ag1 ag1Var2 = this.f;
                ui50 ui50Var3 = ag1Var2.d;
                String str3 = this.g;
                this.b = ui50Var3;
                this.c = ag1Var2;
                this.d = str3;
                this.e = 1;
                if (ui50Var3.b(this) != coroutineSingletons) {
                    ui50Var = ui50Var3;
                    str = str3;
                    ag1Var = ag1Var2;
                }
                return coroutineSingletons;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.c;
                ui50Var2 = this.b;
                try {
                    kotlin.a.a(obj);
                    File file = (File) obj;
                    File file2 = new File(file, "light_bundle_script.js");
                    File file3 = new File(file, "light_bundle_script.js.tmp");
                    nbr.w(file3, str2, emb.b);
                    obj2 = Boolean.valueOf(file3.renameTo(file2));
                } catch (Exception unused) {
                    obj2 = s3q0.a;
                    ui50Var2.c(null);
                    return obj2;
                }
                ui50Var2.c(null);
                return obj2;
            }
            str = this.d;
            ag1Var = (ag1) this.c;
            ui50Var = this.b;
            kotlin.a.a(obj);
            this.b = ui50Var;
            this.c = str;
            this.d = null;
            this.e = 2;
            ag1Var.getClass();
            bdn bdnVar = bdn.a;
            obj = myc0.k(wgl.c, new uf1(ag1Var, null), this);
            if (obj != coroutineSingletons) {
                str2 = str;
                ui50Var2 = ui50Var;
                File file4 = (File) obj;
                File file22 = new File(file4, "light_bundle_script.js");
                File file32 = new File(file4, "light_bundle_script.js.tmp");
                nbr.w(file32, str2, emb.b);
                obj2 = Boolean.valueOf(file32.renameTo(file22));
                ui50Var2.c(null);
                return obj2;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            th = th;
            ui50Var = r1;
        }
    }
}
