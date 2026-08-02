package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.lqc0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements lqc0 {
    public final i3y a;
    public final i3y b;
    public final tls c;
    public lqc0 e;
    public final rol0 d = new rol0(new ProxyPlaqueRepository$plaqueConfigFlow$1(this, null));
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public a(i3y i3yVar, i3y i3yVar2, tls tlsVar) {
        this.a = i3yVar;
        this.b = i3yVar2;
        this.c = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$performAction$1 proxyPlaqueRepository$performAction$1;
        int i;
        if (continuationImpl instanceof ProxyPlaqueRepository$performAction$1) {
            proxyPlaqueRepository$performAction$1 = (ProxyPlaqueRepository$performAction$1) continuationImpl;
            int i2 = proxyPlaqueRepository$performAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                proxyPlaqueRepository$performAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = proxyPlaqueRepository$performAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = proxyPlaqueRepository$performAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    proxyPlaqueRepository$performAction$1.L$0 = str;
                    proxyPlaqueRepository$performAction$1.label = 1;
                    obj = g(proxyPlaqueRepository$performAction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    str = (String) proxyPlaqueRepository$performAction$1.L$0;
                    kotlin.b.b(obj);
                }
                proxyPlaqueRepository$performAction$1.L$0 = null;
                proxyPlaqueRepository$performAction$1.label = 2;
                Object a = ((lqc0) obj).a(str, proxyPlaqueRepository$performAction$1);
                return a != obj2 ? obj2 : a;
            }
        }
        proxyPlaqueRepository$performAction$1 = new ProxyPlaqueRepository$performAction$1(this, continuationImpl);
        Object obj3 = proxyPlaqueRepository$performAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlaqueRepository$performAction$1.label;
        if (i != 0) {
        }
        proxyPlaqueRepository$performAction$1.L$0 = null;
        proxyPlaqueRepository$performAction$1.label = 2;
        Object a2 = ((lqc0) obj3).a(str, proxyPlaqueRepository$performAction$1);
        if (a2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (((defpackage.lqc0) r9).b(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$reportPlaqueSeen$1 proxyPlaqueRepository$reportPlaqueSeen$1;
        int i;
        if (continuationImpl instanceof ProxyPlaqueRepository$reportPlaqueSeen$1) {
            proxyPlaqueRepository$reportPlaqueSeen$1 = (ProxyPlaqueRepository$reportPlaqueSeen$1) continuationImpl;
            int i2 = proxyPlaqueRepository$reportPlaqueSeen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                proxyPlaqueRepository$reportPlaqueSeen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = proxyPlaqueRepository$reportPlaqueSeen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = proxyPlaqueRepository$reportPlaqueSeen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    proxyPlaqueRepository$reportPlaqueSeen$1.L$0 = str;
                    proxyPlaqueRepository$reportPlaqueSeen$1.L$1 = str2;
                    proxyPlaqueRepository$reportPlaqueSeen$1.label = 1;
                    obj = g(proxyPlaqueRepository$reportPlaqueSeen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str2 = (String) proxyPlaqueRepository$reportPlaqueSeen$1.L$1;
                    str = (String) proxyPlaqueRepository$reportPlaqueSeen$1.L$0;
                    kotlin.b.b(obj);
                }
                proxyPlaqueRepository$reportPlaqueSeen$1.L$0 = null;
                proxyPlaqueRepository$reportPlaqueSeen$1.L$1 = null;
                proxyPlaqueRepository$reportPlaqueSeen$1.label = 2;
            }
        }
        proxyPlaqueRepository$reportPlaqueSeen$1 = new ProxyPlaqueRepository$reportPlaqueSeen$1(this, continuationImpl);
        Object obj3 = proxyPlaqueRepository$reportPlaqueSeen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlaqueRepository$reportPlaqueSeen$1.label;
        if (i != 0) {
        }
        proxyPlaqueRepository$reportPlaqueSeen$1.L$0 = null;
        proxyPlaqueRepository$reportPlaqueSeen$1.L$1 = null;
        proxyPlaqueRepository$reportPlaqueSeen$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (((defpackage.lqc0) r9).c(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$reportPlaqueClicked$1 proxyPlaqueRepository$reportPlaqueClicked$1;
        int i;
        if (continuationImpl instanceof ProxyPlaqueRepository$reportPlaqueClicked$1) {
            proxyPlaqueRepository$reportPlaqueClicked$1 = (ProxyPlaqueRepository$reportPlaqueClicked$1) continuationImpl;
            int i2 = proxyPlaqueRepository$reportPlaqueClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                proxyPlaqueRepository$reportPlaqueClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = proxyPlaqueRepository$reportPlaqueClicked$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = proxyPlaqueRepository$reportPlaqueClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    proxyPlaqueRepository$reportPlaqueClicked$1.L$0 = str;
                    proxyPlaqueRepository$reportPlaqueClicked$1.L$1 = str2;
                    proxyPlaqueRepository$reportPlaqueClicked$1.label = 1;
                    obj = g(proxyPlaqueRepository$reportPlaqueClicked$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str2 = (String) proxyPlaqueRepository$reportPlaqueClicked$1.L$1;
                    str = (String) proxyPlaqueRepository$reportPlaqueClicked$1.L$0;
                    kotlin.b.b(obj);
                }
                proxyPlaqueRepository$reportPlaqueClicked$1.L$0 = null;
                proxyPlaqueRepository$reportPlaqueClicked$1.L$1 = null;
                proxyPlaqueRepository$reportPlaqueClicked$1.label = 2;
            }
        }
        proxyPlaqueRepository$reportPlaqueClicked$1 = new ProxyPlaqueRepository$reportPlaqueClicked$1(this, continuationImpl);
        Object obj3 = proxyPlaqueRepository$reportPlaqueClicked$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlaqueRepository$reportPlaqueClicked$1.label;
        if (i != 0) {
        }
        proxyPlaqueRepository$reportPlaqueClicked$1.L$0 = null;
        proxyPlaqueRepository$reportPlaqueClicked$1.L$1 = null;
        proxyPlaqueRepository$reportPlaqueClicked$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, int i2, ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$updatePlaqueConfiguration$1 proxyPlaqueRepository$updatePlaqueConfiguration$1;
        int i3;
        if (continuationImpl instanceof ProxyPlaqueRepository$updatePlaqueConfiguration$1) {
            proxyPlaqueRepository$updatePlaqueConfiguration$1 = (ProxyPlaqueRepository$updatePlaqueConfiguration$1) continuationImpl;
            int i4 = proxyPlaqueRepository$updatePlaqueConfiguration$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                proxyPlaqueRepository$updatePlaqueConfiguration$1.label = i4 - Integer.MIN_VALUE;
                Object obj = proxyPlaqueRepository$updatePlaqueConfiguration$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = proxyPlaqueRepository$updatePlaqueConfiguration$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    proxyPlaqueRepository$updatePlaqueConfiguration$1.I$0 = i;
                    proxyPlaqueRepository$updatePlaqueConfiguration$1.I$1 = i2;
                    proxyPlaqueRepository$updatePlaqueConfiguration$1.label = 1;
                    obj = g(proxyPlaqueRepository$updatePlaqueConfiguration$1);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = proxyPlaqueRepository$updatePlaqueConfiguration$1.I$1;
                    i = proxyPlaqueRepository$updatePlaqueConfiguration$1.I$0;
                    kotlin.b.b(obj);
                }
                proxyPlaqueRepository$updatePlaqueConfiguration$1.I$0 = i;
                proxyPlaqueRepository$updatePlaqueConfiguration$1.I$1 = i2;
                proxyPlaqueRepository$updatePlaqueConfiguration$1.label = 2;
                Object d = ((lqc0) obj).d(i, i2, proxyPlaqueRepository$updatePlaqueConfiguration$1);
                return d != obj2 ? obj2 : d;
            }
        }
        proxyPlaqueRepository$updatePlaqueConfiguration$1 = new ProxyPlaqueRepository$updatePlaqueConfiguration$1(this, continuationImpl);
        Object obj3 = proxyPlaqueRepository$updatePlaqueConfiguration$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = proxyPlaqueRepository$updatePlaqueConfiguration$1.label;
        if (i3 != 0) {
        }
        proxyPlaqueRepository$updatePlaqueConfiguration$1.I$0 = i;
        proxyPlaqueRepository$updatePlaqueConfiguration$1.I$1 = i2;
        proxyPlaqueRepository$updatePlaqueConfiguration$1.label = 2;
        Object d2 = ((lqc0) obj3).d(i, i2, proxyPlaqueRepository$updatePlaqueConfiguration$1);
        if (d2 != obj22) {
        }
    }

    @Override // defpackage.lqc0
    public final tpr e() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (((defpackage.lqc0) r8).f(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Map map, ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$updateTemplates$1 proxyPlaqueRepository$updateTemplates$1;
        int i;
        if (continuationImpl instanceof ProxyPlaqueRepository$updateTemplates$1) {
            proxyPlaqueRepository$updateTemplates$1 = (ProxyPlaqueRepository$updateTemplates$1) continuationImpl;
            int i2 = proxyPlaqueRepository$updateTemplates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                proxyPlaqueRepository$updateTemplates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = proxyPlaqueRepository$updateTemplates$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = proxyPlaqueRepository$updateTemplates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    proxyPlaqueRepository$updateTemplates$1.L$0 = map;
                    proxyPlaqueRepository$updateTemplates$1.label = 1;
                    obj = g(proxyPlaqueRepository$updateTemplates$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    map = (Map) proxyPlaqueRepository$updateTemplates$1.L$0;
                    kotlin.b.b(obj);
                }
                proxyPlaqueRepository$updateTemplates$1.L$0 = null;
                proxyPlaqueRepository$updateTemplates$1.label = 2;
            }
        }
        proxyPlaqueRepository$updateTemplates$1 = new ProxyPlaqueRepository$updateTemplates$1(this, continuationImpl);
        Object obj3 = proxyPlaqueRepository$updateTemplates$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlaqueRepository$updateTemplates$1.label;
        if (i != 0) {
        }
        proxyPlaqueRepository$updateTemplates$1.L$0 = null;
        proxyPlaqueRepository$updateTemplates$1.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x006f, B:15:0x0077, B:17:0x008a, B:23:0x0081), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x006f, B:15:0x0077, B:17:0x008a, B:23:0x0081), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:31:0x0057, B:33:0x005b), top: B:30:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ProxyPlaqueRepository$selectRepository$1 proxyPlaqueRepository$selectRepository$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        ?? r0;
        lqc0 lqc0Var;
        try {
            if (continuationImpl instanceof ProxyPlaqueRepository$selectRepository$1) {
                proxyPlaqueRepository$selectRepository$1 = (ProxyPlaqueRepository$selectRepository$1) continuationImpl;
                int i3 = proxyPlaqueRepository$selectRepository$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    proxyPlaqueRepository$selectRepository$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = proxyPlaqueRepository$selectRepository$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = proxyPlaqueRepository$selectRepository$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.f;
                        proxyPlaqueRepository$selectRepository$1.L$0 = aVar;
                        proxyPlaqueRepository$selectRepository$1.I$0 = 0;
                        proxyPlaqueRepository$selectRepository$1.label = 1;
                        if (aVar.a(proxyPlaqueRepository$selectRepository$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r0 = (g050) proxyPlaqueRepository$selectRepository$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            r0 = r0;
                            lqc0Var = !((Boolean) obj).booleanValue() ? (lqc0) this.a.getValue() : (lqc0) this.b.getValue();
                            this.e = lqc0Var;
                            aVar = r0;
                            aVar.d(null);
                            return lqc0Var;
                        } catch (Throwable th) {
                            th = th;
                            r0.d(null);
                            throw th;
                        }
                    }
                    i2 = proxyPlaqueRepository$selectRepository$1.I$0;
                    ?? r5 = (g050) proxyPlaqueRepository$selectRepository$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r5;
                    lqc0Var = this.e;
                    if (lqc0Var == null) {
                        tls tlsVar = this.c;
                        proxyPlaqueRepository$selectRepository$1.L$0 = aVar;
                        proxyPlaqueRepository$selectRepository$1.I$0 = i2;
                        proxyPlaqueRepository$selectRepository$1.I$1 = 0;
                        proxyPlaqueRepository$selectRepository$1.label = 2;
                        Object invoke = tlsVar.invoke(proxyPlaqueRepository$selectRepository$1);
                        if (invoke != coroutineSingletons) {
                            r0 = aVar;
                            obj = invoke;
                            lqc0Var = !((Boolean) obj).booleanValue() ? (lqc0) this.a.getValue() : (lqc0) this.b.getValue();
                            this.e = lqc0Var;
                            aVar = r0;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return lqc0Var;
                }
            }
            lqc0Var = this.e;
            if (lqc0Var == null) {
            }
            aVar.d(null);
            return lqc0Var;
        } catch (Throwable th2) {
            th = th2;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        proxyPlaqueRepository$selectRepository$1 = new ProxyPlaqueRepository$selectRepository$1(this, continuationImpl);
        Object obj2 = proxyPlaqueRepository$selectRepository$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlaqueRepository$selectRepository$1.label;
        if (i != 0) {
        }
    }
}
