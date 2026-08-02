package com.yandex.passport.sloth;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.web.BridgeMethod;
import com.yandex.passport.sloth.command.JsCommandException;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothVariant$BiometricVerification;
import com.yandex.passport.sloth.url.SlothUrlChecker$Status;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.iqn;
import defpackage.jl40;
import defpackage.kqn;
import defpackage.tje;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zcx;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class b1 implements com.yandex.passport.sloth.ui.b1 {
    public final com.yandex.passport.sloth.data.c0 a;
    public final /* synthetic */ c1 b;

    public b1(c1 c1Var) {
        this.b = c1Var;
        this.a = c1Var.a.getVariant();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x040c, code lost:
    
        if (defpackage.jl40.l(com.yandex.passport.common.url.b.h(r19), "/profile") != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x041b, code lost:
    
        if (defpackage.jl40.l(android.net.Uri.parse(r19).getPath(), "/am/finish") != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02f0, code lost:
    
        if (defpackage.jl40.l(r3.toString(), r6) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x045a, code lost:
    
        if (r6.equals(com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks.OK) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x048d, code lost:
    
        r2 = r5.a(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x048a, code lost:
    
        if (r6.equals("success") == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0374, code lost:
    
        if (defpackage.jl40.l(r5.toString(), r6) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b0, code lost:
    
        if (defpackage.jl40.l(android.net.Uri.parse(r19).getPath(), "/am/finish") != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03e5, code lost:
    
        if (defpackage.jl40.l(android.net.Uri.parse(r19).getPath(), "/am/finish") != false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04ce  */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.passport.sloth.url.p a(String str) {
        boolean z;
        ?? arrayList;
        boolean z2;
        SlothUrlChecker$Status slothUrlChecker$Status;
        int i;
        boolean z3;
        String i2;
        com.yandex.passport.sloth.url.p a;
        Long l;
        c1 c1Var = this.b;
        com.yandex.passport.sloth.url.j jVar = c1Var.w;
        com.yandex.passport.internal.sloth.f fVar = jVar.b;
        SlothParams slothParams = jVar.a;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "process(url=" + ((Object) com.yandex.passport.common.url.b.l(str)) + ')', 8);
        }
        String c = fVar.c(slothParams.getEnvironment(), null);
        com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
        String a2 = variant instanceof com.yandex.passport.sloth.data.n ? ((com.yandex.passport.internal.network.l) fVar.a).a(((com.yandex.passport.sloth.data.n) slothParams.getVariant()).a, slothParams.getEnvironment()) : variant instanceof com.yandex.passport.sloth.data.i ? fVar.a(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.i) slothParams.getVariant()).b) : variant instanceof com.yandex.passport.sloth.data.q ? fVar.e(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.q) slothParams.getVariant()).b) : variant instanceof SlothVariant$BiometricVerification ? fVar.g(slothParams.getEnvironment()) : variant instanceof com.yandex.passport.sloth.data.v ? fVar.f(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.v) slothParams.getVariant()).c) : c;
        com.yandex.passport.sloth.data.c0 variant2 = slothParams.getVariant();
        com.yandex.passport.sloth.data.a0 a0Var = variant2 instanceof com.yandex.passport.sloth.data.a0 ? (com.yandex.passport.sloth.data.a0) variant2 : null;
        long longValue = (a0Var == null || (l = a0Var.w) == null) ? 0L : l.longValue();
        com.yandex.passport.sloth.url.h hVar = jVar.c;
        com.yandex.passport.sloth.data.c0 variant3 = slothParams.getVariant();
        Environment environment = slothParams.getEnvironment();
        com.yandex.passport.internal.sloth.n nVar = hVar.b;
        com.yandex.passport.internal.ui.common.web.b bVar = nVar.b;
        if (bVar.b(str)) {
            slothUrlChecker$Status = SlothUrlChecker$Status.EXTERNAL;
        } else {
            if (!bVar.c(str)) {
                z = true;
                if (variant3 instanceof com.yandex.passport.sloth.data.r) {
                    slothUrlChecker$Status = SlothUrlChecker$Status.ALLOWED;
                } else {
                    hVar.a.getClass();
                    if (variant3 instanceof com.yandex.passport.sloth.data.n) {
                        String str2 = com.yandex.passport.common.url.b.j(str) + "://" + com.yandex.passport.common.url.b.g(str) + com.yandex.passport.common.url.b.h(str);
                        if (str2.equals("https://passport-test.yandex.ru/auth") || str2.equals("https://passport.yandex.ru/auth")) {
                            slothUrlChecker$Status = SlothUrlChecker$Status.REDIRECT_COMMAND;
                        }
                    }
                    if (com.yandex.passport.common.url.b.j(str).toLowerCase(Locale.US).equals(Constants.SCHEME)) {
                        if (!com.yandex.passport.common.url.b.g(str).equalsIgnoreCase(com.yandex.passport.common.url.b.g(a2)) && !com.yandex.passport.common.url.b.g(str).equalsIgnoreCase(com.yandex.passport.common.url.b.g(c)) && !com.yandex.passport.common.url.b.g(str).equalsIgnoreCase("webauth-ext.yandex.net") && !com.yandex.passport.common.url.b.g(str).equalsIgnoreCase("passport.toloka.ai")) {
                            String str3 = ((com.yandex.passport.internal.network.l) bVar.c).l(environment, longValue).a;
                            if (!com.yandex.passport.common.url.b.g(str).equals(com.yandex.passport.common.url.b.g(str3)) || !jl40.l(com.yandex.passport.common.url.b.h(str), com.yandex.passport.common.url.b.h(str3))) {
                                SharedPreferences b = nVar.a.a.b(environment);
                                if (b == null) {
                                    arrayList = EmptyList.a;
                                } else {
                                    Map<String, ?> all = b.getAll();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                                        String key = entry.getKey();
                                        if (cvu0.x(key, "location_webam_host_", false) || cvu0.x(key, "location_webam_yandex_host_", false) || cvu0.x(key, "location_webam_id_yandex_host_", false)) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    Iterator it = linkedHashMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Object value = ((Map.Entry) it.next()).getValue();
                                        String str4 = value instanceof String ? (String) value : null;
                                        if (str4 != null) {
                                            arrayList.add(str4);
                                        }
                                    }
                                }
                                if (!arrayList.contains(com.yandex.passport.common.url.b.g(str))) {
                                    z2 = !bVar.a(com.yandex.passport.common.url.b.g(str).toLowerCase(Locale.US));
                                }
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    slothUrlChecker$Status = z2 ? SlothUrlChecker$Status.BLOCKED : SlothUrlChecker$Status.ALLOWED;
                }
                i = com.yandex.passport.sloth.url.i.a[slothUrlChecker$Status.ordinal()];
                z3 = z;
                if (i != z3) {
                    com.yandex.passport.sloth.data.c0 variant4 = slothParams.getVariant();
                    if (variant4 instanceof com.yandex.passport.sloth.data.n) {
                        Uri build = Uri.parse(a2).buildUpon().appendPath("auth").appendPath("finish").build();
                        Uri build2 = Uri.parse(fVar.c(slothParams.getEnvironment(), null)).buildUpon().appendPath("finish").build();
                        String str5 = com.yandex.passport.common.url.b.j(str) + "://" + com.yandex.passport.common.url.b.g(str) + com.yandex.passport.common.url.b.h(str);
                        if (!jl40.l(build.toString(), str5)) {
                        }
                        l lVar = jVar.e;
                        k0 k0Var = jVar.d;
                        i2 = com.yandex.passport.common.url.b.i(str, ACSPConstants.STATUS);
                        if (i2 != null) {
                            int hashCode = i2.hashCode();
                            if (hashCode != -1867169789) {
                                if (hashCode != -1367724422) {
                                    if (hashCode != 3548) {
                                        if (hashCode == 96784904 && i2.equals("error")) {
                                            a = lVar.a(str);
                                        }
                                    }
                                } else if (i2.equals("cancel")) {
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "WebAm cancel", 8);
                                    }
                                    jVar.f.a(o0.c);
                                    a = com.yandex.passport.sloth.url.k.b;
                                }
                            }
                        }
                        a = !(slothParams.getVariant() instanceof com.yandex.passport.sloth.data.n) ? ((String) com.yandex.passport.common.url.b.f(str, Collections.singleton("error")).get("error")) != null ? lVar.a(str) : ((String) com.yandex.passport.common.url.b.f(str, Collections.singleton("access_token")).get("access_token")) != null ? k0Var.a(str) : new com.yandex.passport.sloth.url.o("") : jl40.l(com.yandex.passport.common.url.b.h(str), "/profile") ? k0Var.a(str) : new com.yandex.passport.sloth.url.o("");
                    } else if (variant4 instanceof com.yandex.passport.sloth.data.i) {
                        Uri build3 = Uri.parse(fVar.c(slothParams.getEnvironment(), null)).buildUpon().appendPath("finish").build();
                        Uri build4 = Uri.parse(com.yandex.passport.common.url.b.j(a2) + "://" + com.yandex.passport.common.url.b.g(a2)).buildUpon().appendPath("am").appendPath("finish").build();
                        String str6 = com.yandex.passport.common.url.b.j(str) + "://" + com.yandex.passport.common.url.b.g(str) + com.yandex.passport.common.url.b.h(str);
                        if (!jl40.l(build3.toString(), str6)) {
                        }
                        l lVar2 = jVar.e;
                        k0 k0Var2 = jVar.d;
                        i2 = com.yandex.passport.common.url.b.i(str, ACSPConstants.STATUS);
                        if (i2 != null) {
                        }
                        if (!(slothParams.getVariant() instanceof com.yandex.passport.sloth.data.n)) {
                        }
                    } else if (variant4 instanceof com.yandex.passport.sloth.data.s) {
                        if (jl40.l(Uri.parse(str).getHost(), Uri.parse(fVar.c(slothParams.getEnvironment(), Long.valueOf(((com.yandex.passport.sloth.data.s) variant4).b))).getHost())) {
                        }
                        a = com.yandex.passport.sloth.url.k.a;
                    } else if (variant4 instanceof com.yandex.passport.sloth.data.v) {
                        if (jl40.l(Uri.parse(str).getHost(), Uri.parse(fVar.f(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.v) variant4).c)).getHost())) {
                        }
                        a = com.yandex.passport.sloth.url.k.a;
                    } else if (com.yandex.passport.common.url.b.j(str).equals(com.yandex.passport.common.url.b.j(a2))) {
                        if (com.yandex.passport.common.url.b.g(str).equals(com.yandex.passport.common.url.b.g(a2))) {
                        }
                    }
                } else if (i == 2) {
                    a = new com.yandex.passport.sloth.url.n(str);
                } else if (i == 3) {
                    a = com.yandex.passport.sloth.url.l.a;
                } else if (i == 4) {
                    a = new com.yandex.passport.sloth.url.m(str, false);
                } else {
                    if (i != 5) {
                        w511.b();
                        return null;
                    }
                    a = new com.yandex.passport.sloth.url.m(str, z3);
                }
                c1Var.B.a(new n0(SlothMetricaEvent$Event.CHECK_URL, kotlin.collections.b.i(new Pair("url", w0.a(str)), new Pair(TarifficatorScenarioActivity.RESULT_KEY, a.toString()))));
                return a;
            }
            slothUrlChecker$Status = SlothUrlChecker$Status.EXTERNAL_AND_CANCEL;
        }
        z = true;
        i = com.yandex.passport.sloth.url.i.a[slothUrlChecker$Status.ordinal()];
        z3 = z;
        if (i != z3) {
        }
        c1Var.B.a(new n0(SlothMetricaEvent$Event.CHECK_URL, kotlin.collections.b.i(new Pair("url", w0.a(str)), new Pair(TarifficatorScenarioActivity.RESULT_KEY, a.toString()))));
        return a;
    }

    public final kotlinx.coroutines.flow.n0 b() {
        return this.b.c.c;
    }

    public final boolean c() {
        SlothParams slothParams = this.b.a;
        com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
        return variant instanceof com.yandex.passport.sloth.data.g ? ((com.yandex.passport.sloth.data.g) slothParams.getVariant()).c().isNoReturnToHost() : variant instanceof com.yandex.passport.sloth.data.b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        Object kqnVar;
        Object obj;
        com.yandex.passport.sloth.command.i iVar;
        BridgeMethod bridgeMethod;
        com.yandex.passport.sloth.command.f fVar = this.b.b;
        z0 z0Var = fVar.c;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, unr0.l(')', "executeJsCommand(commandPayload: ", str), 8);
        }
        com.yandex.passport.sloth.command.k kVar = fVar.a;
        kVar.getClass();
        try {
            zcx zcxVar = kVar.a;
            zcxVar.getClass();
            iVar = (com.yandex.passport.sloth.command.i) zcxVar.b(com.yandex.passport.sloth.command.i.Companion.serializer(), str);
            BridgeMethod[] values = BridgeMethod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bridgeMethod = null;
                    break;
                }
                bridgeMethod = values[i];
                if (jl40.l(bridgeMethod.getMethodName(), iVar.b)) {
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Command parse error", e);
            }
            kqnVar = new kqn(new JsCommandException(Depends.NOT_AVAILABLE, "", com.yandex.passport.sloth.command.d.b));
        }
        if (bridgeMethod == null) {
            obj = new kqn(new JsCommandException(iVar.b, iVar.c, com.yandex.passport.sloth.command.d.c));
            if (!(obj instanceof iqn)) {
                com.yandex.passport.sloth.command.c cVar3 = (com.yandex.passport.sloth.command.c) ((iqn) obj).a;
                if (!jl40.l(cVar3.a.getMethodName(), BridgeMethod.GetEbsAgeConfirmState.getMethodName())) {
                    z0Var.a(new n0(SlothMetricaEvent$Event.MESSAGE_RECEIVED, g8e.z(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, cVar3.a.getMethodName())));
                }
                Object b = fVar.b(cVar3, continuationImpl);
                return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : (String) b;
            }
            if (!(obj instanceof kqn)) {
                w511.b();
                return null;
            }
            JsCommandException jsCommandException = (JsCommandException) ((kqn) obj).a;
            z0Var.a(new n0("Failed to parse bridge message: " + jsCommandException, 3));
            String methodName = jsCommandException.getMethodName();
            String requestId = jsCommandException.getRequestId();
            com.yandex.passport.sloth.command.e error = jsCommandException.getError();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", error.a);
            return fVar.a(methodName, requestId, jSONObject.toString());
        }
        kqnVar = new iqn(kVar.a(bridgeMethod, iVar));
        obj = kqnVar;
        if (!(obj instanceof iqn)) {
        }
    }

    public final void e() {
        c1 c1Var = this.b;
        tje.N(c1Var.x, null, null, new SlothSession$interactor$1$restartSloth$1(c1Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (r9 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0155, code lost:
    
        if (r9 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0157, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0158, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r9 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        if (r9 == r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r9 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.passport.sloth.ui.z0 z0Var, ContinuationImpl continuationImpl) {
        Object a;
        c1 c1Var = this.b;
        c1Var.B.a(new n0(SlothMetricaEvent$Event.UI_EVENT, g8e.z("ui_event", z0Var.toString())));
        com.yandex.passport.sloth.ui.a1 a1Var = c1Var.z;
        SlothParams slothParams = a1Var.c;
        z0 z0Var2 = a1Var.a;
        v vVar = a1Var.b;
        boolean equals = z0Var.equals(com.yandex.passport.sloth.ui.v0.b);
        zy11 zy11Var = zy11.a;
        if (equals) {
            boolean ignoreBackToNativeFallback = slothParams.getCommonWebProperties().getIgnoreBackToNativeFallback();
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCrash " + ignoreBackToNativeFallback, 8);
            }
            if (ignoreBackToNativeFallback) {
                a = vVar.b(new o(true, ignoreBackToNativeFallback), continuationImpl);
            } else {
                z0Var2.a(new n0("crash", 7));
                a = vVar.d(b.a, continuationImpl);
            }
        } else if (z0Var.equals(com.yandex.passport.sloth.ui.v0.a)) {
            a = vVar.c(x.a, continuationImpl);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (a != coroutineSingletons) {
                a = zy11Var;
            }
        } else if (z0Var instanceof com.yandex.passport.sloth.ui.x0) {
            a = a1Var.a(((com.yandex.passport.sloth.ui.x0) z0Var).a, continuationImpl);
        } else if (z0Var instanceof com.yandex.passport.sloth.ui.y0) {
            boolean ignoreBackToNativeFallback2 = slothParams.getCommonWebProperties().getIgnoreBackToNativeFallback();
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFailedCurrentAuth " + ignoreBackToNativeFallback2, 8);
            }
            if (!ignoreBackToNativeFallback2) {
                z0Var2.a(new n0("webam", 7));
            }
            a = vVar.b(new o(false, ignoreBackToNativeFallback2), continuationImpl);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (a != coroutineSingletons2) {
                a = zy11Var;
            }
        } else {
            if (!(z0Var instanceof com.yandex.passport.sloth.ui.w0)) {
                w511.b();
                return null;
            }
            StringBuilder sb = new StringBuilder("errorCode=");
            com.yandex.passport.sloth.ui.w0 w0Var = (com.yandex.passport.sloth.ui.w0) z0Var;
            sb.append(w0Var.a);
            sb.append(" url=");
            sb.append((Object) com.yandex.passport.common.url.b.l(w0Var.b));
            Throwable th = new Throwable(sb.toString());
            com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) z0Var2.a;
            if (mVar.a()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Log.getStackTraceString(th));
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, message);
                mVar.a.a("show_unknown_error", linkedHashMap);
            }
            a = a1Var.a(false, continuationImpl);
        }
    }
}
