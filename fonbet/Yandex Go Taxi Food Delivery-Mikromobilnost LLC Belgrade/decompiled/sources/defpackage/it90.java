package defpackage;

import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import java.util.Map;

/* loaded from: classes2.dex */
public final class it90 implements i4j0 {
    public final ped0 a;

    public it90(ped0 ped0Var) {
        this.a = ped0Var;
    }

    @Override // defpackage.w8o
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.pcj
    public final void reportDiagnosticEvent(String str, Map map) {
        this.a.b(new tbd0(PlusPayEvent$Type.DIAGNOSTIC, str, map, (Throwable) null));
    }

    @Override // defpackage.w8o
    public final void reportError(String str, String str2, Throwable th) {
        this.a.b(new tbd0(PlusPayEvent$Type.ERROR, str, str2, th));
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, String str2) {
        this.a.b(new tbd0(PlusPayEvent$Type.CLIENT, str, str2, (Throwable) null));
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, String str2) {
        this.a.b(new tbd0(PlusPayEvent$Type.LOG, str, str2, (Throwable) null));
    }

    @Override // defpackage.rgo
    public final void reportEvent(String str, Map map) {
        this.a.b(new tbd0(PlusPayEvent$Type.CLIENT, str, map, (Throwable) null));
    }

    @Override // defpackage.b3u0
    public final void reportStatboxEvent(String str, Map map) {
        this.a.b(new tbd0(PlusPayEvent$Type.LOG, str, map, (Throwable) null));
    }
}
