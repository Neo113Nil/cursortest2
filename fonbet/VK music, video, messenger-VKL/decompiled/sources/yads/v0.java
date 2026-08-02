package yads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.spj;

/* loaded from: classes10.dex */
public final class v0 {
    public final p0 a;

    public v0(p0 p0Var) {
        this.a = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, yads.p01] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, yads.p01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x014a -> B:10:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016b -> B:20:0x016c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, List list, spj spjVar) {
        u0 u0Var;
        v0 v0Var;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef2;
        v0 v0Var2;
        View view2;
        o0 scVar;
        if (spjVar instanceof u0) {
            u0Var = (u0) spjVar;
            int i2 = u0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.h = i2 - Integer.MIN_VALUE;
                v0Var = this;
                Object obj = u0Var.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u0Var.h;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new p01(list == null || list.isEmpty(), null);
                    if (list != null) {
                        it = list.iterator();
                        ref$ObjectRef2 = ref$ObjectRef;
                        v0Var2 = v0Var;
                        view2 = view;
                        if (it.hasNext()) {
                        }
                    }
                    return ref$ObjectRef.element;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = u0Var.e;
                ref$ObjectRef2 = u0Var.d;
                View view3 = u0Var.c;
                v0Var2 = u0Var.b;
                kotlin.a.a(obj);
                boolean z = true;
                p01 p01Var = (p01) obj;
                if (p01Var != null) {
                    ref$ObjectRef2.element = new p01((((p01) ref$ObjectRef2.element).a || p01Var.a) ? z : false, p01Var.b);
                }
                view2 = view3;
                if (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    p0 p0Var = v0Var2.a;
                    Context context = view2.getContext();
                    m52 m52Var = p0Var.e;
                    l52 l52Var = new l52(m52Var.a, m52Var.b, p0Var.d);
                    String a = m0Var.a();
                    int hashCode = a.hashCode();
                    if (hashCode == -1422015845) {
                        if (a.equals("adtune")) {
                            scVar = new sc(new id(p0Var.g, l52Var), new za(context, p0Var.b, p0Var.a), p0Var.d);
                            if (scVar == null) {
                                scVar = null;
                            }
                            if (scVar == null) {
                                u0Var.b = v0Var2;
                                u0Var.c = view2;
                                u0Var.d = ref$ObjectRef2;
                                u0Var.e = it;
                                z = true;
                                u0Var.h = 1;
                                Object a2 = scVar.a(view2, m0Var, u0Var);
                                if (a2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                view3 = view2;
                                obj = a2;
                                p01 p01Var2 = (p01) obj;
                                if (p01Var2 != null) {
                                }
                                view2 = view3;
                            } else {
                                z = true;
                            }
                        }
                        scVar = null;
                        if (scVar == null) {
                        }
                        if (scVar == null) {
                        }
                    } else if (hashCode == -191501435) {
                        if (a.equals("feedback")) {
                            scVar = new iu0(new qu0(p0Var.a, p0Var.b, p0Var.d, p0Var.f, p0Var.g, new pu0()));
                            if (scVar == null) {
                            }
                            if (scVar == null) {
                            }
                        }
                        scVar = null;
                        if (scVar == null) {
                        }
                        if (scVar == null) {
                        }
                    } else if (hashCode == 94756344) {
                        if (a.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                            scVar = new aw(p0Var.d, p0Var.g);
                            if (scVar == null) {
                            }
                            if (scVar == null) {
                            }
                        }
                        scVar = null;
                        if (scVar == null) {
                        }
                        if (scVar == null) {
                        }
                    } else {
                        if (hashCode == 629233382 && a.equals("deeplink")) {
                            d4 d4Var = p0Var.a;
                            ov2 ov2Var = p0Var.b;
                            v9 v9Var = p0Var.c;
                            lv lvVar = p0Var.d;
                            v02 v02Var = p0Var.g;
                            n93 n93Var = p0Var.h;
                            scVar = new ya0(new db0(l52Var, v02Var, n93Var, new zh2(d4Var, ov2Var, v9Var, n93Var, lvVar)));
                            if (scVar == null) {
                            }
                            if (scVar == null) {
                            }
                        }
                        scVar = null;
                        if (scVar == null) {
                        }
                        if (scVar == null) {
                        }
                    }
                    if (it.hasNext()) {
                        ref$ObjectRef = ref$ObjectRef2;
                        return ref$ObjectRef.element;
                    }
                }
            }
        }
        v0Var = this;
        u0Var = new u0(v0Var, spjVar);
        Object obj2 = u0Var.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u0Var.h;
        if (i != 0) {
        }
    }
}
