package defpackage;

import android.content.Context;
import android.view.View;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import yads.r0;

/* loaded from: classes7.dex */
public final class na81 {
    public final w040 a;

    public na81(fe81 fe81Var, v981 v981Var, d881 d881Var, vmn0 vmn0Var, lm71 lm71Var, st81 st81Var, hn71 hn71Var, vw81 vw81Var) {
        this.a = new w040(fe81Var, v981Var, d881Var, vmn0Var, lm71Var, st81Var, hn71Var, vw81Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015c, code lost:
    
        if (r5 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        if (r12.equals("adtune") == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, b391] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, b391] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0138 -> B:10:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, ArrayList arrayList, ContinuationImpl continuationImpl) {
        r0 r0Var;
        int i;
        Ref$ObjectRef z;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef;
        View view2;
        vmn0 vmn0Var;
        io71 io71Var;
        io71 io71Var2;
        if (continuationImpl instanceof r0) {
            r0Var = (r0) continuationImpl;
            int i2 = r0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r0Var.g;
                boolean z2 = false;
                if (i != 0) {
                    z = qv10.z(obj);
                    z.element = new b391(arrayList == null || arrayList.isEmpty());
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        ref$ObjectRef = z;
                        view2 = view;
                        if (!it.hasNext()) {
                        }
                    }
                    return z.element;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = r0Var.d;
                ref$ObjectRef = r0Var.c;
                View view3 = r0Var.b;
                b.b(obj);
                b391 b391Var = (b391) obj;
                if (b391Var != null) {
                    b391 b391Var2 = (b391) ref$ObjectRef.element;
                    boolean z3 = b391Var2.a || b391Var.a;
                    bk61 bk61Var = b391Var2.b;
                    if (bk61Var == null) {
                        bk61Var = b391Var.b;
                    }
                    ref$ObjectRef.element = new b391(z3, bk61Var);
                }
                view2 = view3;
                if (!it.hasNext()) {
                    xh71 xh71Var = (xh71) it.next();
                    w040 w040Var = this.a;
                    vmn0 vmn0Var2 = (vmn0) w040Var.d;
                    Context context = view2.getContext();
                    lm71 lm71Var = (lm71) w040Var.e;
                    st81 st81Var = (st81) w040Var.f;
                    gr81 gr81Var = new gr81((vmn0) lm71Var.b);
                    String a = xh71Var.a();
                    int hashCode = a.hashCode();
                    if (hashCode == -1422015845) {
                        vmn0Var = vmn0Var2;
                    } else {
                        if (hashCode == 94756344) {
                            if (a.equals("close")) {
                                io71Var = new cf71(vmn0Var2, st81Var, z2, 17);
                            }
                            io71Var = null;
                        } else {
                            if (hashCode == 629233382) {
                                if (a.equals(Constants.DEEPLINK)) {
                                    io71Var = new nx81(new k371((fe81) w040Var.a, (v981) w040Var.b, (d881) w040Var.c, vmn0Var2, (st81) w040Var.f, (hn71) w040Var.g, (vw81) w040Var.h));
                                }
                            } else if (hashCode == 1039116149 && a.equals("divkit_adtune")) {
                                vmn0Var = vmn0Var2;
                                io71Var = new s421(new ro81(st81Var, gr81Var), new ep81(), new pb81(context, (fe81) w040Var.a, (v981) w040Var.b), vmn0Var, 24);
                            }
                            io71Var = null;
                        }
                        if (!it.hasNext()) {
                            z = ref$ObjectRef;
                            return z.element;
                        }
                    }
                    if (io71Var == null) {
                        io71Var2 = null;
                    }
                    if (0 != 0) {
                        r0Var.b = view2;
                        r0Var.c = ref$ObjectRef;
                        r0Var.d = it;
                        r0Var.g = 1;
                        Object h = io71Var2.h(view2, xh71Var, r0Var);
                        if (h == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        view3 = view2;
                        obj = h;
                        b391 b391Var3 = (b391) obj;
                        if (b391Var3 != null) {
                        }
                        view2 = view3;
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        r0Var = new r0(this, continuationImpl);
        Object obj2 = r0Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r0Var.g;
        boolean z22 = false;
        if (i != 0) {
        }
    }
}
