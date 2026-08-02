package xsna;

import com.vk.lists.ListDataSet;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AnimationCommentHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class jn2 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.vk.core.fragments.FragmentImpl, xsna.d9c0] */
    @Override // xsna.gzs
    public final Object invoke() {
        jdo jdoVar;
        switch (this.b) {
            case 0:
                return (Boolean) ((mcy) this.receiver).get();
            case 1:
                return Boolean.valueOf(((g950) this.receiver).c());
            case 2:
                return ((kca) this.receiver).e;
            case 3:
                zvd0 zvd0Var = (zvd0) this.receiver;
                int i = zvd0.r;
                if (!((pxo0) zvd0Var.p.getValue()).a() && (jdoVar = zvd0Var.q) != null) {
                    zvd0Var.m.invoke(jdoVar);
                }
                return s3q0.a;
            case 4:
                ((uzh0) this.receiver).p();
                return s3q0.a;
            default:
                v5t0 v5t0Var = ((gcs0) this.receiver).o0;
                ListDataSet<u1c0> listDataSet = v5t0Var.G;
                Iterator<u1c0> it = listDataSet.d.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        u1c0 next = it.next();
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (next.c != 1120) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    listDataSet.A(valueOf.intValue());
                }
                v5t0Var.b.le();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(Object obj, int i) {
        super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, zvd0.class, "onDraftDeleteConfirmed", "onDraftDeleteConfirmed()V", 0);
                break;
            default:
                break;
        }
    }
}
