package xsna;

import android.app.Application;
import android.content.Context;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.api.SessionSubscriber;
import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zti0;

/* compiled from: FirebaseSessions.kt */
/* loaded from: classes.dex */
public final class fkr {
    public final vhr a;
    public final cyi0 b;

    /* compiled from: FirebaseSessions.kt */
    @b6l(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kotlin.coroutines.d $backgroundDispatcher;
        final /* synthetic */ cui0 $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, cui0 cui0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$backgroundDispatcher = dVar;
            this.$lifecycleServiceBinder = cui0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return fkr.this.new a(this.$backgroundDispatcher, this.$lifecycleServiceBinder, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (r6.b(r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0027, code lost:
        
            if (r6 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean booleanValue;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
                this.label = 1;
                obj = aVar.b(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    cyi0 cyi0Var = fkr.this.b;
                    Boolean c = cyi0Var.a.c();
                    if (c != null) {
                        booleanValue = c.booleanValue();
                    } else {
                        Boolean c2 = cyi0Var.b.c();
                        booleanValue = c2 != null ? c2.booleanValue() : true;
                    }
                    if (booleanValue) {
                        kotlin.coroutines.d dVar = this.$backgroundDispatcher;
                        zti0 zti0Var = new zti0(dVar);
                        this.$lifecycleServiceBinder.a(new Messenger(new zti0.a(dVar)), zti0Var.d);
                        txi0.b.getClass();
                        txi0.d = zti0Var;
                        if (txi0.c) {
                            txi0.c = false;
                            zti0Var.b(1);
                        }
                        vhr vhrVar = fkr.this.a;
                        io.reactivex.rxjava3.functions.l ekrVar = new io.reactivex.rxjava3.functions.l() { // from class: xsna.ekr
                            @Override // io.reactivex.rxjava3.functions.l
                            public Object apply(Object obj2) {
                                return s3q0.a;
                            }
                        };
                        vhrVar.a();
                        vhrVar.j.add(ekrVar);
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            Collection values = ((Map) obj).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).a()) {
                        cyi0 cyi0Var2 = fkr.this.b;
                        this.label = 2;
                    }
                }
            }
            return s3q0.a;
        }
    }

    public fkr(vhr vhrVar, cyi0 cyi0Var, @wv5 kotlin.coroutines.d dVar, cui0 cui0Var) {
        this.a = vhrVar;
        this.b = cyi0Var;
        vhrVar.a();
        Context applicationContext = vhrVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(txi0.b);
            myc0.h(zvj.a(dVar), null, null, new a(dVar, cui0Var, null), 3);
        } else {
            Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + JwtParser.SEPARATOR_CHAR);
        }
    }
}
