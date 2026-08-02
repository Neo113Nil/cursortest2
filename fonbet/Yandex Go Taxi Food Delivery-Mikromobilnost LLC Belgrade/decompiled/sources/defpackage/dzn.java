package defpackage;

import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.encoder.j;
import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public final /* synthetic */ class dzn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fzn b;
    public final /* synthetic */ b c;

    public /* synthetic */ dzn(fzn fznVar, b bVar, int i) {
        this.a = i;
        this.b = fznVar;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        final fzn fznVar = this.b;
        switch (i) {
            case 0:
                bVar.b(fznVar.b);
                break;
            default:
                j jVar = fznVar.d;
                BufferProvider$State bufferProvider$State = fznVar.b;
                if (bufferProvider$State != BufferProvider$State.ACTIVE) {
                    if (bufferProvider$State != BufferProvider$State.INACTIVE) {
                        bVar.d(new IllegalStateException("Unknown state: " + fznVar.b));
                        break;
                    } else {
                        bVar.d(new IllegalStateException("BufferProvider is not active."));
                        break;
                    }
                } else {
                    final euy a = jVar.a();
                    ni91.h(a, bVar);
                    final int i2 = 0;
                    bVar.a(new Runnable() { // from class: ezn
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            euy euyVar = a;
                            fzn fznVar2 = fznVar;
                            switch (i3) {
                                case 0:
                                    fznVar2.getClass();
                                    if (!euyVar.cancel(true)) {
                                        d6z.y(null, euyVar.isDone());
                                        try {
                                            ((czn) euyVar.get()).a();
                                            break;
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            String str = fznVar2.d.a;
                                            e.toString();
                                            sgb1.g(5, str);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    fznVar2.c.remove(euyVar);
                                    break;
                            }
                        }
                    }, geb1.b());
                    fznVar.c.add(a);
                    final int i3 = 1;
                    a.c(new Runnable() { // from class: ezn
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            euy euyVar = a;
                            fzn fznVar2 = fznVar;
                            switch (i32) {
                                case 0:
                                    fznVar2.getClass();
                                    if (!euyVar.cancel(true)) {
                                        d6z.y(null, euyVar.isDone());
                                        try {
                                            ((czn) euyVar.get()).a();
                                            break;
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            String str = fznVar2.d.a;
                                            e.toString();
                                            sgb1.g(5, str);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    fznVar2.c.remove(euyVar);
                                    break;
                            }
                        }
                    }, jVar.i);
                    break;
                }
        }
    }
}
