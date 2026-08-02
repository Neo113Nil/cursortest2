package defpackage;

import defpackage.eoh;
import defpackage.flf0;
import defpackage.glf0;
import defpackage.hlf0;
import defpackage.m83;
import defpackage.m9;
import defpackage.md51;
import defpackage.tls;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class m9 extends ymx {
    public static final AtomicInteger f = new AtomicInteger(0);
    public final ArrayList c;
    public final gsj0 d;
    public boolean e;

    public m9(yh6 yh6Var) {
        super(yh6Var);
        this.c = new ArrayList();
        f.getAndIncrement();
        this.d = new gsj0();
    }

    @Override // defpackage.ymx
    public final y4r0 i(yh6 yh6Var, final tls tlsVar, final tls tlsVar2) {
        this.e = true;
        final eoh eohVar = new eoh(yh6Var);
        this.d.c(new Runnable() { // from class: com.yandex.xplat.common.a
            @Override // java.lang.Runnable
            public final void run() {
                tls tlsVar3 = tlsVar;
                eoh eohVar2 = eohVar;
                m9 m9Var = m9.this;
                if (m9Var.d.isDone()) {
                    try {
                        hlf0 hlf0Var = (hlf0) m9Var.d.get();
                        if (hlf0Var instanceof glf0) {
                            ((md51) tlsVar3.invoke(((glf0) hlf0Var).a)).a(new AbstractPromise$addFlatteningHandler$1$1(1, eohVar2, eoh.class, "resolve", "resolve(Ljava/lang/Object;)V", 0), new AbstractPromise$addFlatteningHandler$1$2(1, eohVar2, eoh.class, "reject", "reject(Lcom/yandex/xplat/common/YSError;)V", 0));
                            return;
                        }
                        if (!(hlf0Var instanceof flf0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tls tlsVar4 = tlsVar2;
                        if (tlsVar4 != null) {
                            ((md51) tlsVar4.invoke(((flf0) hlf0Var).a)).a(new AbstractPromise$addFlatteningHandler$1$3(1, eohVar2, eoh.class, "resolve", "resolve(Ljava/lang/Object;)V", 0), new AbstractPromise$addFlatteningHandler$1$4(1, eohVar2, eoh.class, "reject", "reject(Lcom/yandex/xplat/common/YSError;)V", 0));
                        } else {
                            eohVar2.a(((flf0) hlf0Var).a);
                        }
                    } catch (Throwable th) {
                        eohVar2.a(m83.a(th));
                    }
                }
            }
        }, yh6Var);
        ArrayList arrayList = this.c;
        y4r0 y4r0Var = eohVar.a;
        arrayList.add(y4r0Var);
        return y4r0Var;
    }

    @Override // defpackage.ymx
    public final y4r0 k(yh6 yh6Var, tls tlsVar, tls tlsVar2) {
        this.e = true;
        eoh eohVar = new eoh(yh6Var);
        this.d.c(new l9(this, eohVar, tlsVar, tlsVar2, 0), yh6Var);
        ArrayList arrayList = this.c;
        y4r0 y4r0Var = eohVar.a;
        arrayList.add(y4r0Var);
        return y4r0Var;
    }

    @Override // defpackage.ymx
    public final boolean m() {
        return this.d.isDone();
    }
}
