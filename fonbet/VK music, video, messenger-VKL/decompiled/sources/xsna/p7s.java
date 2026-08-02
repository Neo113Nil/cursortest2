package xsna;

import com.vk.instantjobs.services.a;

/* compiled from: ForegroundServiceDetector.kt */
/* loaded from: classes.dex */
public final class p7s {
    public final fd9 a;

    /* compiled from: ForegroundServiceDetector.kt */
    public final class a implements a.InterfaceC1189a {
        public a() {
        }

        @Override // com.vk.instantjobs.services.a.InterfaceC1189a
        public final void a(boolean z) {
            p7s.this.a.invoke(Boolean.valueOf(z));
        }
    }

    public p7s(fd9 fd9Var) {
        this.a = fd9Var;
        com.vk.instantjobs.services.a.b.add(new a());
    }
}
