package xsna;

import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: VkStepsStore.kt */
/* loaded from: classes11.dex */
public final class xmv0 {
    public static final /* synthetic */ qcy<Object>[] b;
    public final tw8 a = new tw8("VkStepsStore", "vk_steps_monthly_steps");

    /* compiled from: VkStepsStore.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkStepsStoreSyncReason.values().length];
            try {
                iArr[VkStepsStoreSyncReason.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStepsStoreSyncReason.SAVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStepsStoreSyncReason.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(xmv0.class, "monthlyStepsPref", "getMonthlyStepsPref()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    public static final ArrayList a(xmv0 xmv0Var, List list) {
        xmv0Var.getClass();
        qvo0.a.getClass();
        long d = qvo0.d();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long g = ((m0l0) obj).g();
            if (d <= g && g <= currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        return myc0.k(dgn0.f().getIo(), new ymv0(this, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        zmv0 zmv0Var;
        int i;
        if (continuationImpl instanceof zmv0) {
            zmv0Var = (zmv0) continuationImpl;
            int i2 = zmv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zmv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zmv0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zmv0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zmv0Var.label = 1;
                    obj = b(zmv0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(((List) obj).isEmpty());
            }
        }
        zmv0Var = new zmv0(this, continuationImpl);
        Object obj3 = zmv0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zmv0Var.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((List) obj3).isEmpty());
    }

    public final Object d(VkStepsStoreSyncReason vkStepsStoreSyncReason, List list, ContinuationImpl continuationImpl) {
        int i = a.$EnumSwitchMapping$0[vkStepsStoreSyncReason.ordinal()];
        if (i == 1) {
            Object e = e(list, continuationImpl);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
        if (i != 2) {
            if (i == 3) {
                return s3q0.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        Object k = myc0.k(dgn0.f().getIo(), new anv0(this, list, null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (k != coroutineSingletons) {
            k = s3q0.a;
        }
        return k == coroutineSingletons ? k : s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0051, code lost:
    
        if (r4 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[EDGE_INSN: B:45:0x00ec->B:46:0x00ec BREAK  A[LOOP:0: B:18:0x0067->B:38:0x0067], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        bnv0 bnv0Var;
        int i;
        List list2;
        Object b2;
        Ref$BooleanRef ref$BooleanRef;
        Iterator it;
        Object obj;
        if (continuationImpl instanceof bnv0) {
            bnv0Var = (bnv0) continuationImpl;
            int i2 = bnv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bnv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bnv0Var.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bnv0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    list2 = list;
                    bnv0Var.L$0 = list2;
                    bnv0Var.label = 1;
                    b2 = b(bnv0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    }
                    List list3 = (List) bnv0Var.L$0;
                    kotlin.a.a(obj2);
                    b2 = obj2;
                    list2 = list3;
                }
                ArrayList arrayList = new ArrayList((Collection) b2);
                ref$BooleanRef = new Ref$BooleanRef();
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    m0l0 m0l0Var = (m0l0) it.next();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        qvo0 qvo0Var = qvo0.a;
                        long g = ((m0l0) obj).g();
                        qvo0Var.getClass();
                        if (qvo0.e(g) == qvo0.e(m0l0Var.g())) {
                            break;
                        }
                    }
                    m0l0 m0l0Var2 = (m0l0) obj;
                    if (!epx.d(m0l0Var2 != null ? new Float(m0l0Var2.c()) : null, m0l0Var.c()) || m0l0Var2.f() != m0l0Var.f()) {
                        if (m0l0Var2 != null) {
                            arrayList.set(arrayList.indexOf(m0l0Var2), m0l0.a(m0l0Var2, m0l0Var.f(), m0l0Var.c(), m0l0Var.e(), m0l0Var.d(), null, 100));
                        } else {
                            arrayList.add(m0l0Var);
                        }
                        ref$BooleanRef.element = true;
                    }
                }
                if (ref$BooleanRef.element) {
                    return s3q0.a;
                }
                bnv0Var.L$0 = null;
                bnv0Var.label = 2;
                Object k = myc0.k(dgn0.f().getIo(), new anv0(this, arrayList, null), bnv0Var);
                if (k != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    k = s3q0.a;
                }
            }
        }
        bnv0Var = new bnv0(this, continuationImpl);
        Object obj22 = bnv0Var.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bnv0Var.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList((Collection) b2);
        ref$BooleanRef = new Ref$BooleanRef();
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (ref$BooleanRef.element) {
        }
    }
}
