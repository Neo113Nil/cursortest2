package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonTreeReader.kt */
/* loaded from: classes8.dex */
public final class jby {
    public final af a;
    public final boolean b;
    public int c;

    public jby(q8y q8yVar, af afVar) {
        this.a = afVar;
        this.b = q8yVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0088 -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jby jbyVar, p9l p9lVar, BaseContinuationImpl baseContinuationImpl) {
        iby ibyVar;
        int i;
        byte g;
        LinkedHashMap linkedHashMap;
        af afVar;
        af afVar2 = jbyVar.a;
        if (baseContinuationImpl instanceof iby) {
            ibyVar = (iby) baseContinuationImpl;
            int i2 = ibyVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibyVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ibyVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ibyVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    g = afVar2.g((byte) 6);
                    if (afVar2.x() == 4) {
                        af.q(jbyVar.a, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    afVar = jbyVar.a;
                    if (afVar.c()) {
                    }
                    af afVar3 = jbyVar.a;
                    if (g == 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) ibyVar.L$3;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) ibyVar.L$2;
                jby jbyVar2 = (jby) ibyVar.L$1;
                p9l p9lVar2 = (p9l) ibyVar.L$0;
                kotlin.a.a(obj);
                iby ibyVar2 = ibyVar;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                p9lVar = p9lVar2;
                iby ibyVar3 = ibyVar2;
                linkedHashMap3.put(str, (JsonElement) obj);
                g = jbyVar2.a.f();
                if (g == 4) {
                    if (g != 7) {
                        af.q(jbyVar2.a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                    jbyVar = jbyVar2;
                    linkedHashMap = linkedHashMap3;
                    af afVar32 = jbyVar.a;
                    if (g == 6) {
                        afVar32.g((byte) 7);
                    } else if (g == 4) {
                        ne7.v(afVar32);
                        throw null;
                    }
                    return new JsonObject(linkedHashMap);
                }
                jbyVar = jbyVar2;
                linkedHashMap = linkedHashMap3;
                ibyVar = ibyVar3;
                afVar = jbyVar.a;
                if (afVar.c()) {
                    String l = jbyVar.b ? afVar.l() : afVar.j();
                    afVar.g((byte) 5);
                    s3q0 s3q0Var = s3q0.a;
                    ibyVar.L$0 = p9lVar;
                    ibyVar.L$1 = jbyVar;
                    ibyVar.L$2 = linkedHashMap;
                    ibyVar.L$3 = l;
                    ibyVar.label = 1;
                    CoroutineSingletons a = p9lVar.a(s3q0Var, ibyVar);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    jbyVar2 = jbyVar;
                    str = l;
                    obj = a;
                    ibyVar3 = ibyVar;
                    linkedHashMap3 = linkedHashMap4;
                    linkedHashMap3.put(str, (JsonElement) obj);
                    g = jbyVar2.a.f();
                    if (g == 4) {
                    }
                }
                af afVar322 = jbyVar.a;
                if (g == 6) {
                }
                return new JsonObject(linkedHashMap);
            }
        }
        ibyVar = new iby(jbyVar, baseContinuationImpl);
        Object obj2 = ibyVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ibyVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonElement b() {
        JsonElement jsonObject;
        Object obj;
        Object invoke;
        af afVar = this.a;
        byte x = afVar.x();
        if (x == 1) {
            return d(true);
        }
        if (x == 0) {
            return d(false);
        }
        if (x != 6) {
            if (x == 8) {
                return c();
            }
            af.q(afVar, "Cannot read Json element because of unexpected ".concat(jgz.w(x)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            hby hbyVar = new hby(this, null);
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = o9l.a;
            q9l q9lVar = new q9l();
            q9lVar.b = hbyVar;
            q9lVar.c = s3q0Var;
            q9lVar.d = q9lVar;
            CoroutineSingletons coroutineSingletons2 = o9l.a;
            q9lVar.e = coroutineSingletons2;
            while (true) {
                obj = q9lVar.e;
                spj<Object> spjVar = q9lVar.d;
                if (spjVar == null) {
                    break;
                }
                if (epx.f(coroutineSingletons2, obj)) {
                    try {
                        hby hbyVar2 = q9lVar.b;
                        Object obj2 = q9lVar.c;
                        if (hbyVar2 == 0) {
                            kotlin.coroutines.d context = spjVar.getContext();
                            Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(spjVar) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(spjVar, context);
                            ttp0.d(3, hbyVar2);
                            invoke = hbyVar2.invoke(q9lVar, obj2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                        } else {
                            ttp0.d(3, hbyVar2);
                            invoke = hbyVar2.invoke(q9lVar, obj2, spjVar);
                        }
                        if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            spjVar.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        spjVar.resumeWith(new Result.Failure(th));
                    }
                } else {
                    q9lVar.e = coroutineSingletons2;
                    spjVar.resumeWith(obj);
                }
            }
            kotlin.a.a(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte g = afVar.g((byte) 6);
            if (afVar.x() == 4) {
                af.q(afVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!afVar.c()) {
                    break;
                }
                String l = this.b ? afVar.l() : afVar.j();
                afVar.g((byte) 5);
                linkedHashMap.put(l, b());
                g = afVar.f();
                if (g != 4) {
                    if (g != 7) {
                        af.q(afVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g == 6) {
                afVar.g((byte) 7);
            } else if (g == 4) {
                ne7.v(afVar);
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        af afVar = this.a;
        byte f = afVar.f();
        if (afVar.x() == 4) {
            af.q(afVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (afVar.c()) {
            arrayList.add(b());
            f = afVar.f();
            if (f != 4) {
                boolean z = f == 9;
                int i = afVar.a;
                if (!z) {
                    af.q(afVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (f == 8) {
            afVar.g((byte) 9);
        } else if (f == 4) {
            ne7.u(afVar, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        boolean z2 = this.b;
        af afVar = this.a;
        String l = (z2 || !z) ? afVar.l() : afVar.j();
        return (z || !epx.f(l, "null")) ? new o9y(l, z, null) : JsonNull.INSTANCE;
    }
}
