package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.Message;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bv90;
import xsna.bz2;
import xsna.woi0;
import xsna.zno;

/* compiled from: EventHubApiServiceImpl.kt */
/* loaded from: classes3.dex */
public final class lzp implements izp {
    public final qzp a;
    public final wzp b;
    public final bv90 c;
    public final long d;
    public volatile o7i e;
    public final cy2 g;
    public final gx2 h;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final a i = new a();

    /* compiled from: EventHubApiServiceImpl.kt */
    public static final class a implements xoi0 {
        public a() {
        }

        @Override // xsna.xoi0
        public final void a(woi0 woi0Var) {
            if (woi0Var instanceof woi0.a) {
                lzp.this.e = p7i.a();
                lzp.this.c.c(new VKApiExecutionException(-1, "", false, "Connection lost", null, null, null, null, 0, null, null, null, 4080));
            } else if (!(woi0Var instanceof woi0.b)) {
                if (!(woi0Var instanceof woi0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                o7i o7iVar = lzp.this.e;
                if (o7iVar != null) {
                    o7iVar.i0(s3q0.a);
                }
                lzp.this.e = null;
            }
        }

        @Override // xsna.xoi0
        public final void b(byte b, Throwable th, Long l) {
            bv90 bv90Var = lzp.this.c;
            if (b == 2) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Send failed";
                }
                VKApiExecutionException vKApiExecutionException = new VKApiExecutionException(-1, "", false, message, null, null, null, null, 0, null, null, th, 2032);
                if (l != null) {
                    bv90Var.b(l.longValue(), vKApiExecutionException);
                } else {
                    bv90Var.c(vKApiExecutionException);
                }
            }
        }
    }

    public lzp(qzp qzpVar, wzp wzpVar, bv90 bv90Var, long j, long j2) {
        this.a = qzpVar;
        this.b = wzpVar;
        this.c = bv90Var;
        this.d = j;
        this.g = new cy2(bv90Var);
        this.h = new gx2(j2, new g4g(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(lzp lzpVar, xy2 xy2Var, Map map, ContinuationImpl continuationImpl) {
        nzp nzpVar;
        int i;
        Message message;
        long j;
        xy2 xy2Var2;
        bv90.a remove;
        bv90.a remove2;
        qzp qzpVar = lzpVar.a;
        bv90 bv90Var = lzpVar.c;
        if (continuationImpl instanceof nzp) {
            nzpVar = (nzp) continuationImpl;
            int i2 = nzpVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzpVar.label = i2 - Integer.MIN_VALUE;
                Object obj = nzpVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nzpVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    JSONObject jSONObject = new JSONObject(xy2Var.getParamsMap());
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    JSONObject put = new JSONObject().put("action", "execute_api_method").put("payload", new JSONObject().put("method", xy2Var.b()).put("params", jSONObject).put("v", xy2Var.d()));
                    AtomicLong atomicLong = Message.e;
                    Message.b a2 = Message.a.a((byte) 2, put);
                    long j2 = a2.a().getLong("id");
                    o7i a3 = p7i.a();
                    bv90Var.a.put(Long.valueOf(j2), new bv90.a(a3, xy2Var));
                    try {
                        try {
                            Objects.toString(a2);
                            qzpVar.e(a2);
                            nzpVar.L$0 = xy2Var;
                            nzpVar.L$1 = null;
                            nzpVar.L$2 = a2;
                            nzpVar.L$3 = null;
                            nzpVar.J$0 = j2;
                            nzpVar.label = 1;
                            Object c = lzpVar.c(a3, a2, xy2Var, nzpVar);
                            if (c == obj2) {
                                return obj2;
                            }
                            obj = c;
                            xy2Var2 = xy2Var;
                            message = a2;
                            j = j2;
                        } catch (Throwable th) {
                            th = th;
                            message = a2;
                            j = j2;
                            remove = bv90Var.a.remove(Long.valueOf(j));
                            if (remove != null) {
                                remove.a.b(null);
                            }
                            qzpVar.f(message);
                            throw th;
                        }
                    } catch (Exception e) {
                        Objects.toString(a2);
                        String b = xy2Var.b();
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = "Send failed";
                        }
                        throw new VKApiExecutionException(-1, b, false, message2, null, null, null, xy2Var.getParamsMap(), 0, null, null, e, 1904);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = nzpVar.J$0;
                    message = (Message) nzpVar.L$2;
                    xy2Var2 = (xy2) nzpVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        remove = bv90Var.a.remove(Long.valueOf(j));
                        if (remove != null) {
                        }
                        qzpVar.f(message);
                        throw th;
                    }
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Objects.toString(jSONObject2);
                Objects.toString(message);
                Object e2 = xy2Var2.a().e(new wwx(jSONObject2));
                remove2 = bv90Var.a.remove(Long.valueOf(j));
                if (remove2 != null) {
                    remove2.a.b(null);
                }
                qzpVar.f(message);
                return e2;
            }
        }
        nzpVar = new nzp(lzpVar, continuationImpl);
        Object obj3 = nzpVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nzpVar.label;
        if (i != 0) {
        }
        JSONObject jSONObject22 = (JSONObject) obj3;
        Objects.toString(jSONObject22);
        Objects.toString(message);
        Object e22 = xy2Var2.a().e(new wwx(jSONObject22));
        remove2 = bv90Var.a.remove(Long.valueOf(j));
        if (remove2 != null) {
        }
        qzpVar.f(message);
        return e22;
    }

    @Override // xsna.izp
    public final Object a(xy2 xy2Var, Map map, bz2.a aVar) {
        if (this.f.compareAndSet(false, true)) {
            cy2 cy2Var = this.g;
            wzp wzpVar = this.b;
            wzpVar.b(cy2Var);
            wzpVar.c(this.i);
        }
        return this.h.b(xy2Var.b(), new mzp(this, xy2Var, map, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o7i o7iVar, Message.b bVar, xy2 xy2Var, ContinuationImpl continuationImpl) {
        jzp jzpVar;
        int i;
        Message message;
        xy2 xy2Var2;
        TimeoutCancellationException timeoutCancellationException;
        long f;
        kzp kzpVar;
        xy2 xy2Var3;
        if (continuationImpl instanceof jzp) {
            jzpVar = (jzp) continuationImpl;
            int i2 = jzpVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jzpVar.label = i2 - Integer.MIN_VALUE;
                Object obj = jzpVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jzpVar.label;
                long j = this.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    try {
                        zno.a aVar = zno.c;
                        f = eoo.f(j, DurationUnit.MILLISECONDS);
                        kzpVar = new kzp(o7iVar, null);
                        jzpVar.L$0 = null;
                        message = bVar;
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        message = bVar;
                    }
                    try {
                        jzpVar.L$1 = message;
                        xy2Var2 = xy2Var;
                        try {
                            jzpVar.L$2 = xy2Var2;
                            jzpVar.label = 1;
                            obj = oxo0.b(qsl.e(f), kzpVar, jzpVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            xy2Var3 = xy2Var2;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            timeoutCancellationException = e;
                            Objects.toString(message);
                            throw new VKApiExecutionException(-1, xy2Var2.b(), false, qlb0.a(j, "Request timed out after ", UcumUtils.UCUM_MILLISECODS), null, null, null, xy2Var2.getParamsMap(), 0, null, null, timeoutCancellationException, 1904);
                        }
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        xy2Var2 = xy2Var;
                        timeoutCancellationException = e;
                        Objects.toString(message);
                        throw new VKApiExecutionException(-1, xy2Var2.b(), false, qlb0.a(j, "Request timed out after ", UcumUtils.UCUM_MILLISECODS), null, null, null, xy2Var2.getParamsMap(), 0, null, null, timeoutCancellationException, 1904);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xy2Var3 = (xy2) jzpVar.L$2;
                    message = (Message) jzpVar.L$1;
                    try {
                        kotlin.a.a(obj);
                    } catch (TimeoutCancellationException e4) {
                        timeoutCancellationException = e4;
                        xy2Var2 = xy2Var3;
                        Objects.toString(message);
                        throw new VKApiExecutionException(-1, xy2Var2.b(), false, qlb0.a(j, "Request timed out after ", UcumUtils.UCUM_MILLISECODS), null, null, null, xy2Var2.getParamsMap(), 0, null, null, timeoutCancellationException, 1904);
                    }
                }
                return (JSONObject) obj;
            }
        }
        jzpVar = new jzp(this, continuationImpl);
        Object obj2 = jzpVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jzpVar.label;
        long j2 = this.d;
        if (i != 0) {
        }
        return (JSONObject) obj2;
    }

    @Override // xsna.izp
    public final boolean isConnected() {
        return this.a.b() == ConnectionState.CONNECTED;
    }
}
