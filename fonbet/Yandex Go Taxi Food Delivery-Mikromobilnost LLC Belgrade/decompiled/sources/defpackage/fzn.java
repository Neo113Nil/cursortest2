package defpackage;

import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.encoder.j;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes10.dex */
public final class fzn implements syn, gq60 {
    public final LinkedHashMap a = new LinkedHashMap();
    public BufferProvider$State b = BufferProvider$State.INACTIVE;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ j d;

    public fzn(j jVar) {
        this.d = jVar;
    }

    @Override // defpackage.gq60
    public final void a(dq60 dq60Var) {
        this.d.i.execute(new wqj(26, this, dq60Var));
    }

    @Override // defpackage.gq60
    public final void b(Executor executor, dq60 dq60Var) {
        this.d.i.execute(new p7h(11, this, dq60Var, executor));
    }

    @Override // defpackage.gq60
    public final euy c() {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.d.i.execute(new dzn(this, bVar, 0));
            bVar.a = "fetchData";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return gl7Var;
    }

    public final void d(boolean z) {
        BufferProvider$State bufferProvider$State = z ? BufferProvider$State.ACTIVE : BufferProvider$State.INACTIVE;
        if (this.b == bufferProvider$State) {
            return;
        }
        this.b = bufferProvider$State;
        if (bufferProvider$State == BufferProvider$State.INACTIVE) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((euy) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new wqj(24, entry, bufferProvider$State));
            } catch (RejectedExecutionException e) {
                sgb1.e(this.d.a, "Unable to post to the supplied executor.", e);
            }
        }
    }
}
