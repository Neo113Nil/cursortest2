package defpackage;

import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.audio.d;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class eh3 implements dq60 {
    public final /* synthetic */ fzn a;
    public final /* synthetic */ d b;

    public eh3(d dVar, fzn fznVar) {
        this.b = dVar;
        this.a = fznVar;
    }

    @Override // defpackage.dq60
    public final void a(Object obj) {
        BufferProvider$State bufferProvider$State = (BufferProvider$State) obj;
        Objects.requireNonNull(bufferProvider$State);
        d dVar = this.b;
        if (dVar.l == this.a) {
            Objects.toString(dVar.h);
            bufferProvider$State.toString();
            sgb1.g(3, "AudioSource");
            if (dVar.h != bufferProvider$State) {
                dVar.h = bufferProvider$State;
                dVar.f();
            }
        }
    }

    @Override // defpackage.dq60
    public final void onError(Throwable th) {
        d dVar = this.b;
        if (dVar.l == this.a) {
            Executor executor = dVar.j;
            o8g0 o8g0Var = dVar.k;
            if (executor == null || o8g0Var == null) {
                return;
            }
            executor.execute(new hc(29, o8g0Var, th));
        }
    }
}
