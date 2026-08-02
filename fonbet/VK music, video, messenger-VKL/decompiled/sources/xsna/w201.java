package xsna;

import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.ironsource.C4498pe;
import java.util.Iterator;
import java.util.Objects;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class w201 extends BasePendingResult {
    public p201 a;
    public final boolean b;
    public final /* synthetic */ lvf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w201(lvf0 lvf0Var, boolean z) {
        super((com.google.android.gms.common.api.c) null);
        Objects.requireNonNull(lvf0Var);
        this.c = lvf0Var;
        this.b = z;
    }

    public abstract void a() throws zzap;

    public final nzz0 b() {
        if (this.a == null) {
            this.a = new p201(this);
        }
        return this.a;
    }

    public final void c() {
        if (!this.b) {
            lvf0 lvf0Var = this.c;
            Iterator it = lvf0Var.h.iterator();
            while (it.hasNext()) {
                ((lvf0.b) it.next()).f();
            }
            Iterator it2 = lvf0Var.i.iterator();
            while (it2.hasNext()) {
                ((lvf0.a) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.c.a) {
                a();
            }
        } catch (zzap unused) {
            setResult(new q201(this, new Status(C4498pe.g)));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return new q201(this, status);
    }
}
