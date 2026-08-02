package xsna;

import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.core.ApiUris;

/* compiled from: GetAuthDataUseCase.kt */
/* loaded from: classes5.dex */
public final class wpt {
    public final zzp a;
    public final y55 b;
    public final CrashReporterRepository c;

    public wpt(zzp zzpVar, y55 y55Var, CrashReporterRepository crashReporterRepository) {
        this.a = zzpVar;
        this.b = y55Var;
        this.c = crashReporterRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) throws IllegalStateException {
        tpt tptVar;
        Object obj;
        int i;
        Object obj2;
        String str3;
        wpt wptVar;
        String str4;
        if (continuationImpl instanceof tpt) {
            tptVar = (tpt) continuationImpl;
            int i2 = tptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tptVar.label = i2 - Integer.MIN_VALUE;
                obj = tptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    tptVar.L$0 = this;
                    tptVar.L$1 = str;
                    tptVar.L$2 = str2;
                    tptVar.label = 1;
                    Object a = this.b.a.a(str, tptVar);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        str3 = str2;
                        wptVar = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str5 = (String) tptVar.L$0;
                        kotlin.a.a(obj);
                        return str5;
                    }
                    str = (String) tptVar.L$1;
                    wptVar = (wpt) tptVar.L$0;
                    kotlin.a.a(obj);
                    String u = brm0.u(Base64.encode(((String) obj).getBytes(emb.b), 0));
                    y55 y55Var = wptVar.b;
                    tptVar.L$0 = u;
                    tptVar.L$1 = null;
                    tptVar.label = 3;
                    v55 v55Var = y55Var.a;
                    Object edit = v55Var.a.edit(new x55(v55Var, str, u), tptVar);
                    if (edit != coroutineSingletons) {
                        edit = s3q0.a;
                    }
                    if (edit != coroutineSingletons) {
                        edit = s3q0.a;
                    }
                    return edit == coroutineSingletons ? coroutineSingletons : u;
                }
                String str6 = (String) tptVar.L$2;
                str = (String) tptVar.L$1;
                wpt wptVar2 = (wpt) tptVar.L$0;
                kotlin.a.a(obj);
                str3 = str6;
                wptVar = wptVar2;
                obj2 = obj;
                str4 = (String) obj2;
                if (str4 == null && !drm0.N(str4)) {
                    return str4;
                }
                String uuid = UUID.randomUUID().toString();
                tptVar.L$0 = wptVar;
                tptVar.L$1 = str;
                tptVar.L$2 = null;
                tptVar.label = 2;
                obj = wptVar.c(uuid, str, str3, tptVar);
            }
        }
        tptVar = new tpt(this, continuationImpl);
        obj = tptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tptVar.label;
        if (i != 0) {
        }
        str4 = (String) obj2;
        if (str4 == null) {
        }
        String uuid2 = UUID.randomUUID().toString();
        tptVar.L$0 = wptVar;
        tptVar.L$1 = str;
        tptVar.L$2 = null;
        tptVar.label = 2;
        obj = wptVar.c(uuid2, str, str3, tptVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(1:26))(4:37|(1:39)|(1:41)|34)|27|(1:29)|30|(1:32)(2:35|36)))|44|6|7|(0)(0)|27|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        r10 = new kotlin.Result.Failure(r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a7, B:32:0x0094), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [xsna.wpt] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [xsna.wpt] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, xsna.wpt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        upt uptVar;
        int i;
        String str2;
        String str3;
        ?? r9;
        String str4;
        if (continuationImpl instanceof upt) {
            uptVar = (upt) continuationImpl;
            int i2 = uptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uptVar.label = i2 - Integer.MIN_VALUE;
                Object obj = uptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    uptVar.L$0 = this;
                    uptVar.L$1 = str;
                    uptVar.label = 1;
                    String h = ((b25) ((bpn0) this.a.a).getValue()).h();
                    if (drm0.N(h)) {
                        h = new Result.Failure(new IllegalStateException("Access token is empty"));
                    }
                    if (h != coroutineSingletons) {
                        str2 = h;
                        str3 = str;
                        r9 = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r92 = (wpt) uptVar.L$0;
                    kotlin.a.a(obj);
                    str = r92;
                    Object failure = (String) obj;
                    ?? r93 = str;
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        r93.c.nonFatalReport(a, IssueKey.PLAIN_TOKEN);
                    }
                    return new y25("plain", (String) (failure instanceof Result.Failure ? "" : failure));
                }
                String str5 = (String) uptVar.L$1;
                wpt wptVar = (wpt) uptVar.L$0;
                kotlin.a.a(obj);
                ?? d = ((Result) obj).d();
                str3 = str5;
                r9 = wptVar;
                str2 = d;
                if (str2 instanceof Result.Failure) {
                    str2 = "";
                }
                str4 = str2;
                if (str4.length() == 0) {
                    r9.a.getClass();
                    return new y25("vk", str4);
                }
                r9.a.getClass();
                uptVar.L$0 = r9;
                uptVar.L$1 = null;
                uptVar.label = 2;
                obj = r9.a(str3, "vk", uptVar);
                str = r9;
            }
        }
        uptVar = new upt(this, continuationImpl);
        Object obj2 = uptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uptVar.label;
        if (i != 0) {
        }
        if (str2 instanceof Result.Failure) {
        }
        str4 = str2;
        if (str4.length() == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) throws IllegalStateException {
        vpt vptVar;
        int i;
        if (continuationImpl instanceof vpt) {
            vptVar = (vpt) continuationImpl;
            int i2 = vptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vptVar.label = i2 - Integer.MIN_VALUE;
                Object obj = vptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    vptVar.L$0 = str;
                    vptVar.L$1 = str2;
                    vptVar.L$2 = str3;
                    vptVar.label = 1;
                    int hashCode = str3.hashCode();
                    y55 y55Var = this.b;
                    if (hashCode == 3548) {
                        if (str3.equals(ApiUris.SCHEME_OK)) {
                            o1i0 o1i0Var = y55Var.b;
                            o1i0Var.getClass();
                            lq9 lq9Var = new lq9(1, s7s0.c(vptVar));
                            lq9Var.o();
                            w65.d.getClass();
                            yye0.a(o1i0Var.a, "secrets", new q5o(lq9Var, o1i0Var));
                            obj = lq9Var.n();
                            if (obj == coroutineSingletons) {
                            }
                        }
                        o1i0 o1i0Var2 = y55Var.b;
                        o1i0Var2.getClass();
                        lq9 lq9Var2 = new lq9(1, s7s0.c(vptVar));
                        lq9Var2.o();
                        w65.d.getClass();
                        yye0.a(o1i0Var2.a, "secrets", new c0a(lq9Var2, o1i0Var2));
                        obj = lq9Var2.n();
                        if (obj == coroutineSingletons) {
                        }
                    } else if (hashCode == 3765) {
                        if (str3.equals("vk")) {
                            o1i0 o1i0Var3 = y55Var.b;
                            o1i0Var3.getClass();
                            lq9 lq9Var3 = new lq9(1, s7s0.c(vptVar));
                            lq9Var3.o();
                            w65.d.getClass();
                            yye0.a(o1i0Var3.a, "secrets", new n1i0(lq9Var3, o1i0Var3));
                            obj = lq9Var3.n();
                            if (obj == coroutineSingletons) {
                            }
                        }
                        o1i0 o1i0Var22 = y55Var.b;
                        o1i0Var22.getClass();
                        lq9 lq9Var22 = new lq9(1, s7s0.c(vptVar));
                        lq9Var22.o();
                        w65.d.getClass();
                        yye0.a(o1i0Var22.a, "secrets", new c0a(lq9Var22, o1i0Var22));
                        obj = lq9Var22.n();
                        if (obj == coroutineSingletons) {
                        }
                    } else if (hashCode == 120483) {
                        if (str3.equals("zen")) {
                            o1i0 o1i0Var4 = y55Var.b;
                            o1i0Var4.getClass();
                            lq9 lq9Var4 = new lq9(1, s7s0.c(vptVar));
                            lq9Var4.o();
                            w65.d.getClass();
                            yye0.a(o1i0Var4.a, "secrets", new q5w(lq9Var4, o1i0Var4));
                            obj = lq9Var4.n();
                            if (obj == coroutineSingletons) {
                            }
                        }
                        o1i0 o1i0Var222 = y55Var.b;
                        o1i0Var222.getClass();
                        lq9 lq9Var222 = new lq9(1, s7s0.c(vptVar));
                        lq9Var222.o();
                        w65.d.getClass();
                        yye0.a(o1i0Var222.a, "secrets", new c0a(lq9Var222, o1i0Var222));
                        obj = lq9Var222.n();
                        if (obj == coroutineSingletons) {
                        }
                    } else if (hashCode != 3343799) {
                        if (hashCode == 1555586174 && str3.equals("rustore")) {
                            o1i0 o1i0Var5 = y55Var.b;
                            o1i0Var5.getClass();
                            lq9 lq9Var5 = new lq9(1, s7s0.c(vptVar));
                            lq9Var5.o();
                            w65.d.getClass();
                            yye0.a(o1i0Var5.a, "secrets", new utb(lq9Var5, o1i0Var5));
                            obj = lq9Var5.n();
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        o1i0 o1i0Var2222 = y55Var.b;
                        o1i0Var2222.getClass();
                        lq9 lq9Var2222 = new lq9(1, s7s0.c(vptVar));
                        lq9Var2222.o();
                        w65.d.getClass();
                        yye0.a(o1i0Var2222.a, "secrets", new c0a(lq9Var2222, o1i0Var2222));
                        obj = lq9Var2222.n();
                        if (obj == coroutineSingletons) {
                        }
                    } else {
                        if (str3.equals("mail")) {
                            o1i0 o1i0Var6 = y55Var.b;
                            o1i0Var6.getClass();
                            lq9 lq9Var6 = new lq9(1, s7s0.c(vptVar));
                            lq9Var6.o();
                            w65.d.getClass();
                            yye0.a(o1i0Var6.a, "secrets", new cra(lq9Var6, o1i0Var6));
                            obj = lq9Var6.n();
                            if (obj == coroutineSingletons) {
                            }
                        }
                        o1i0 o1i0Var22222 = y55Var.b;
                        o1i0Var22222.getClass();
                        lq9 lq9Var22222 = new lq9(1, s7s0.c(vptVar));
                        lq9Var22222.o();
                        w65.d.getClass();
                        yye0.a(o1i0Var22222.a, "secrets", new c0a(lq9Var22222, o1i0Var22222));
                        obj = lq9Var22222.n();
                        if (obj == coroutineSingletons) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) vptVar.L$2;
                    str2 = (String) vptVar.L$1;
                    str = (String) vptVar.L$0;
                    kotlin.a.a(obj);
                }
                Map<String, Object> k = pn00.k(new Pair("uuid", str), new Pair(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str2), new Pair(IronSourceConstants.EVENTS_PROVIDER, str3), new Pair("version", "v3"));
                return Jwts.builder().addClaims(k).setHeaderParams(pn00.k(new Pair(JwsHeader.ALGORITHM, "HS256"), new Pair(Header.TYPE, Header.JWT_TYPE))).signWith(SignatureAlgorithm.HS256, ((String) obj).getBytes(emb.b)).compact();
            }
        }
        vptVar = new vpt(this, continuationImpl);
        Object obj2 = vptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vptVar.label;
        if (i != 0) {
        }
        Map<String, Object> k2 = pn00.k(new Pair("uuid", str), new Pair(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str2), new Pair(IronSourceConstants.EVENTS_PROVIDER, str3), new Pair("version", "v3"));
        return Jwts.builder().addClaims(k2).setHeaderParams(pn00.k(new Pair(JwsHeader.ALGORITHM, "HS256"), new Pair(Header.TYPE, Header.JWT_TYPE))).signWith(SignatureAlgorithm.HS256, ((String) obj2).getBytes(emb.b)).compact();
    }
}
