package xsna;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: KnetExperiment.kt */
/* loaded from: classes.dex */
public final class yjy {
    public static ap a;
    public static eky b;
    public static je5 c;
    public static ox4 d;
    public static final ReentrantLock e = new ReentrantLock(true);

    public static jjy a() {
        ReentrantLock reentrantLock = e;
        reentrantLock.lockInterruptibly();
        try {
            jjy jjyVar = null;
            eky ekyVar = null;
            if (a == null) {
                return null;
            }
            ox4 ox4Var = d;
            if (ox4Var == null) {
                ox4Var = null;
            }
            if (((Boolean) ox4Var.invoke()).booleanValue()) {
                return null;
            }
            ap apVar = a;
            if (apVar == null) {
                apVar = null;
            }
            boolean booleanValue = ((Boolean) apVar.invoke()).booleanValue();
            if (booleanValue) {
                eky ekyVar2 = b;
                if (ekyVar2 != null) {
                    ekyVar = ekyVar2;
                }
                jjyVar = (jjy) ekyVar.invoke();
            } else if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            return jjyVar;
        } finally {
            reentrantLock.unlock();
        }
    }
}
