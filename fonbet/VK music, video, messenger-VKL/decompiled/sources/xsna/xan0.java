package xsna;

import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseQueueEventDto;
import com.vk.superapp.api.generated.GsonHolder;
import org.json.JSONObject;

/* compiled from: SuperAppQueueSubscriber.kt */
/* loaded from: classes5.dex */
public final class xan0<T> {
    public final qen0 a;
    public final qan0 b;
    public final ejf0 c;
    public final ujm0 d;
    public final jz70 e;
    public final z77 f;

    public xan0(qen0 qen0Var, qan0 qan0Var, ejf0 ejf0Var, ujm0 ujm0Var, xvc0 xvc0Var, jz70 jz70Var, z77 z77Var) {
        this.a = qen0Var;
        this.b = qan0Var;
        this.c = ejf0Var;
        this.d = ujm0Var;
        this.e = jz70Var;
        this.f = z77Var;
    }

    public final void a(long j, JSONObject jSONObject) {
        try {
            this.d.invoke((SuperAppShowcaseQueueEventDto) GsonHolder.a().fromJson(jSONObject.toString(), (Class) SuperAppShowcaseQueueEventDto.class));
        } catch (Throwable th) {
            fco0.c();
            if (th instanceof InterruptedException) {
                throw th;
            }
            i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + this.a.a, th));
        }
    }
}
