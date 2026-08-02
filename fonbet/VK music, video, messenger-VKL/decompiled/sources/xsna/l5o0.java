package xsna;

import com.vk.api.external.exceptions.NonSecretMethodCallException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ApiNotImplementedException;
import com.vk.im.engine.exceptions.ImEngineIdOutOfBounds;
import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.exceptions.InvalidCredentialsException;
import com.vk.im.engine.exceptions.attach.AttachUploadCancelledException;
import com.vk.im.engine.exceptions.chat.ChatNotExistsException;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.r380;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5o0 implements Callable {
    public final /* synthetic */ q5o0 b;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ mla e;

    public /* synthetic */ l5o0(q5o0 q5o0Var, gzs gzsVar, e1w e1wVar, mla mlaVar) {
        this.b = q5o0Var;
        this.c = gzsVar;
        this.d = e1wVar;
        this.e = mlaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ed, code lost:
    
        if ((r6 instanceof java.lang.NullPointerException) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f1, code lost:
    
        if ((r6 instanceof java.lang.ClassCastException) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f5, code lost:
    
        if ((r6 instanceof java.util.NoSuchElementException) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f9, code lost:
    
        if ((r6 instanceof java.util.ConcurrentModificationException) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fd, code lost:
    
        if ((r6 instanceof java.lang.IndexOutOfBoundsException) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0201, code lost:
    
        if ((r6 instanceof com.vk.core.serialize.Serializer.DeserializationError) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0204, code lost:
    
        r5 = new java.lang.String[]{"Extension with name", "SQL logic error", "syntax error", "Unable to convert BLOB"};
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0212, code lost:
    
        if ((r6 instanceof android.database.sqlite.SQLiteException) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0215, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0217, code lost:
    
        if (r11 >= 4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0219, code lost:
    
        r12 = r5[r11];
        r13 = r6.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        if (r13 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0225, code lost:
    
        if (xsna.drm0.D(r13, r12, true) != true) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0228, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022b, code lost:
    
        r5 = new java.lang.String[]{"attempt to re-open an already-closed object", "the connection pool has been closed"};
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0235, code lost:
    
        if ((r6 instanceof java.lang.IllegalStateException) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
    
        if (r15 >= 2) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023a, code lost:
    
        r11 = r5[r15];
        r12 = r6.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0240, code lost:
    
        if (r12 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0246, code lost:
    
        if (xsna.drm0.D(r12, r11, true) != true) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0249, code lost:
    
        r15 = r15 + 1;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        int i;
        NonSecretMethodCallException nonSecretMethodCallException;
        final q5o0 q5o0Var = this.b;
        gzs gzsVar = this.c;
        final Object obj = this.d;
        mla mlaVar = this.e;
        q5o0Var.b.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            q5o0Var.d.debug(new m5o0(obj, 0));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException("Command is cancelled");
            }
            if (((Boolean) q5o0Var.a.getConfig().K.invoke()).booleanValue()) {
                Thread.sleep(100 + qz9.b(currentTimeMillis).o(0L, 1000L));
            }
            q5o0Var.d();
            Object invoke = gzsVar.invoke();
            q5o0Var.d.e(new gzs() { // from class: xsna.n5o0
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("succeed '");
                    sb.append(obj);
                    sb.append("' (");
                    q5o0Var.b.getClass();
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms)");
                    return sb.toString();
                }
            });
            return invoke;
        } catch (ImTaskExecutionException e) {
            q5o0Var.d.debug(new j49("failed '" + obj.getClass().getName() + '\'', e.getCause(), mlaVar));
            throw e;
        } catch (Throwable th) {
            Throwable j = q5o0.j(th);
            String name = obj.getClass().getName();
            String str = "failed '" + obj.getClass().getName() + '\'';
            nr2.L(j, mlaVar.b());
            sxp sxpVar = null;
            if (sv1.t(j) || x19.K(j) || x19.F(j)) {
                q5o0Var.d.debug(new j49(str, j, mlaVar));
            } else if (x19.L(j)) {
                vx2.a.getClass();
                List<h7r0> value = vx2.b().i().e.getValue();
                ArrayList arrayList = new ArrayList(c5g.u(value, 10));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h7r0) it.next()).e.b));
                }
                Long l = (Long) j5g.a0(arrayList);
                UserCredentials W0 = q5o0Var.a.W0();
                Long valueOf = W0 != null ? Long.valueOf(W0.g()) : null;
                q5o0Var.a.getConfig().g.a(new IllegalStateException(epx.f(l, valueOf) ? "Unauthorized request was executed for user " + l : "IMUser " + valueOf + " differs from ApiUser " + l + ", all users: " + arrayList, j));
                for (Throwable th2 = j; th2 != null; th2 = th2.getCause()) {
                    if (th2.getClass().equals(NonSecretMethodCallException.class)) {
                        nonSecretMethodCallException = (NonSecretMethodCallException) th2;
                        break;
                    }
                    if (th2.equals(th2.getCause())) {
                        break;
                    }
                }
                nonSecretMethodCallException = null;
                if (nonSecretMethodCallException != null) {
                    q5o0Var.g(name, nonSecretMethodCallException);
                }
            } else if (!(j instanceof AttachUploadCancelledException) && !(j instanceof ChatNotExistsException) && !(j instanceof ApiNotImplementedException) && !(j instanceof InvalidCredentialsException) && !(j instanceof ApiArgNotFoundException) && !(j instanceof ApiAccessDeniedException)) {
                q5o0Var.g(name, j);
                q5o0Var.a.getConfig().g.a(j);
            }
            if (q5o0Var.a.getExperiments().k()) {
                if (!x19.L(j)) {
                    Throwable th3 = j;
                    while (true) {
                        if (th3 == null) {
                            i = 0;
                            break;
                        }
                        if (th3 instanceof IllegalStateException) {
                            i = 0;
                            if (brm0.w(((IllegalStateException) th3).getMessage(), "Unable to load publicsuffixes.gz resource from the classpath.", false)) {
                                break;
                            }
                        } else {
                            i = 0;
                        }
                        if (th3.equals(th3.getCause())) {
                            break;
                        }
                        th3 = th3.getCause();
                    }
                }
                i0q0.f(new gqh0(j, 7));
            }
            bso0 x = rsr.x(new nla(mlaVar), j);
            if (nlp.a(j, Serializer.DeserializationError.class)) {
                sxpVar = new y580(x, 10);
            } else if (nlp.a(j, ImEngineIdOutOfBounds.class)) {
                sxpVar = new y580(x, 10);
            } else if (nlp.b(j)) {
                sxpVar = new y580(x, 2);
            } else if (nlp.a(j, ImEngineUnrecoverableException.class)) {
                sxpVar = new y580(x, 10);
            } else {
                VKApiExecutionException vKApiExecutionException = j instanceof VKApiExecutionException ? (VKApiExecutionException) j : null;
                if (vKApiExecutionException != null && vKApiExecutionException.Q()) {
                    sxpVar = r380.a.a((VKApiExecutionException) j);
                } else if (nlp.c(j)) {
                    sxpVar = new y580(x, 10);
                } else if (j instanceof ChatNotExistsException) {
                    Throwable cause = j.getCause();
                    sxpVar = r380.a.a(cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null);
                }
            }
            if (sxpVar != null) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("TaskExecutor.trackErrorIfCritical");
                aVar.c("logMsg", str);
                aVar.a(sxpVar, "failedEvent");
                aVar.a(j, "th");
                bVar.k(aVar.e());
                q5o0Var.a.e1(mlaVar, sxpVar);
            }
            if (sv1.t(j) || x19.K(j) || x19.F(j)) {
                throw th;
            }
            throw new ImTaskExecutionException(j);
        }
    }
}
