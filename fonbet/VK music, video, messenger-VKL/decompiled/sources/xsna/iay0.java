package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.messaging.RemoteMessage;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.rustore.sdk.pushclient.u.a$d;
import ru.rustore.sdk.pushclient.u.a$e;
import xsna.l1z0;

/* loaded from: classes9.dex */
public final class iay0 {
    public static final nm8 d = w0b.a(-2, BufferOverflow.SUSPEND, null, 4);
    public final el20 a;
    public final s9y0 b;
    public final Logger c;

    public iay0(el20 el20Var, s9y0 s9y0Var, Logger logger) {
        this.a = el20Var;
        this.b = s9y0Var;
        this.c = logger.createLogger("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RemoteMessage remoteMessage, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.u.a$b a_b;
        int i;
        iay0 iay0Var;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.u.a$b) {
            a_b = (ru.rustore.sdk.pushclient.u.a$b) continuationImpl;
            int i2 = a_b.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_b.d = i2 - Integer.MIN_VALUE;
                Object obj = a_b.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_b.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l1z0.a aVar = new l1z0.a(remoteMessage);
                    Logger.DefaultImpls.info$default(this.c, "Trying to send new push message event to channel", null, 2, null);
                    a_b.a = this;
                    a_b.d = 1;
                    if (d.t(aVar, a_b) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iay0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iay0Var = a_b.a;
                    kotlin.a.a(obj);
                }
                Logger.DefaultImpls.info$default(iay0Var.c, "Event with new push message has been sent to channel", null, 2, null);
                iay0Var.a.a();
                return s3q0.a;
            }
        }
        a_b = new ru.rustore.sdk.pushclient.u.a$b(this, continuationImpl);
        Object obj2 = a_b.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_b.d;
        if (i != 0) {
        }
        Logger.DefaultImpls.info$default(iay0Var.c, "Event with new push message has been sent to channel", null, 2, null);
        iay0Var.a.a();
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.u.a$c a_c;
        int i;
        iay0 iay0Var;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.u.a$c) {
            a_c = (ru.rustore.sdk.pushclient.u.a$c) continuationImpl;
            int i2 = a_c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_c.d = i2 - Integer.MIN_VALUE;
                Object obj = a_c.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_c.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l1z0.b bVar = new l1z0.b(str);
                    Logger.DefaultImpls.info$default(this.c, "Trying to send new push token event to channel", null, 2, null);
                    a_c.a = this;
                    a_c.d = 1;
                    if (d.t(bVar, a_c) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iay0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iay0Var = a_c.a;
                    kotlin.a.a(obj);
                }
                Logger.DefaultImpls.info$default(iay0Var.c, "Event with new push token has been sent to channel", null, 2, null);
                iay0Var.a.a();
                return s3q0.a;
            }
        }
        a_c = new ru.rustore.sdk.pushclient.u.a$c(this, continuationImpl);
        Object obj2 = a_c.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_c.d;
        if (i != 0) {
        }
        Logger.DefaultImpls.info$default(iay0Var.c, "Event with new push token has been sent to channel", null, 2, null);
        iay0Var.a.a();
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        a$e a_e;
        int i;
        iay0 iay0Var;
        if (continuationImpl instanceof a$e) {
            a_e = (a$e) continuationImpl;
            int i2 = a_e.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_e.d = i2 - Integer.MIN_VALUE;
                Object obj = a_e.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_e.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l1z0.d dVar = new l1z0.d(list);
                    Logger.DefaultImpls.info$default(this.c, "Trying to send error message event to channel", null, 2, null);
                    a_e.a = this;
                    a_e.d = 1;
                    if (d.t(dVar, a_e) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iay0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iay0Var = a_e.a;
                    kotlin.a.a(obj);
                }
                Logger.DefaultImpls.info$default(iay0Var.c, "Event with error message has been sent to channel", null, 2, null);
                iay0Var.a.a();
                return s3q0.a;
            }
        }
        a_e = new a$e(this, continuationImpl);
        Object obj2 = a_e.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_e.d;
        if (i != 0) {
        }
        Logger.DefaultImpls.info$default(iay0Var.c, "Event with error message has been sent to channel", null, 2, null);
        iay0Var.a.a();
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r4.b(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.u.a$a a_a;
        int i;
        iay0 iay0Var;
        String str;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.u.a$a) {
            a_a = (ru.rustore.sdk.pushclient.u.a$a) continuationImpl;
            int i2 = a_a.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_a.e = i2 - Integer.MIN_VALUE;
                Object obj = a_a.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_a.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.c, "Checking for undelivered push tokens", null, 2, null);
                    a_a.a = this;
                    a_a.e = 1;
                    obj = this.b.a(a_a);
                    if (obj != coroutineSingletons) {
                        iay0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    iay0 iay0Var2 = a_a.a;
                    kotlin.a.a(obj);
                    iay0Var = iay0Var2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    str = a_a.b;
                    iay0Var = a_a.a;
                    kotlin.a.a(obj);
                    String str2 = (String) obj;
                    if (str == null || drm0.N(str) || str.equals(str2)) {
                        return s3q0.a;
                    }
                    Logger.DefaultImpls.info$default(iay0Var.c, "Found undelivered token, sending it to service", null, 2, null);
                    a_a.a = null;
                    a_a.b = null;
                    a_a.e = 3;
                }
                str = (String) obj;
                s9y0 s9y0Var = iay0Var.b;
                a_a.a = iay0Var;
                a_a.b = str;
                a_a.e = 2;
                obj = s9y0Var.f(a_a);
            }
        }
        a_a = new ru.rustore.sdk.pushclient.u.a$a(this, continuationImpl);
        Object obj2 = a_a.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_a.e;
        if (i != 0) {
        }
        str = (String) obj2;
        s9y0 s9y0Var2 = iay0Var.b;
        a_a.a = iay0Var;
        a_a.b = str;
        a_a.e = 2;
        obj2 = s9y0Var2.f(a_a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        a$d a_d;
        int i;
        iay0 iay0Var;
        if (continuationImpl instanceof a$d) {
            a_d = (a$d) continuationImpl;
            int i2 = a_d.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_d.d = i2 - Integer.MIN_VALUE;
                Object obj = a_d.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_d.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l1z0.c cVar = l1z0.c.a;
                    Logger.DefaultImpls.info$default(this.c, "Trying to send on delete messages event to channel", null, 2, null);
                    a_d.a = this;
                    a_d.d = 1;
                    if (d.t(cVar, a_d) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iay0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iay0Var = a_d.a;
                    kotlin.a.a(obj);
                }
                Logger.DefaultImpls.info$default(iay0Var.c, "Event with on delete messages has been sent to channel", null, 2, null);
                iay0Var.a.a();
                return s3q0.a;
            }
        }
        a_d = new a$d(this, continuationImpl);
        Object obj2 = a_d.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_d.d;
        if (i != 0) {
        }
        Logger.DefaultImpls.info$default(iay0Var.c, "Event with on delete messages has been sent to channel", null, 2, null);
        iay0Var.a.a();
        return s3q0.a;
    }
}
