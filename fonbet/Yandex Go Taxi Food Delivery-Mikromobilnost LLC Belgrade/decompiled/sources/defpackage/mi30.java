package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.masstransit.router.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class mi30 implements l010, jms {
    public final /* synthetic */ b a;

    public mi30(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.l010
    public final void a(String str, String str2) {
        this.a.P(new dp30(null, new j140(null, new d4l0(str2, str))));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l010) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, b.class, "onVehicleClick", "onVehicleClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
