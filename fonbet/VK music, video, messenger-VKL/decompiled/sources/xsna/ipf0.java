package xsna;

import com.vk.di.component.DiUnscopedComponent;

/* compiled from: ReflectionUnscopedStubFactory.kt */
/* loaded from: classes18.dex */
public final class ipf0 implements c7m {
    public final a a;

    /* compiled from: ReflectionUnscopedStubFactory.kt */
    public static final class a implements b7m<DiUnscopedComponent> {
        public final dcy<? extends a7m> a;
        public DiUnscopedComponent b;

        public a(dcy<? extends a7m> dcyVar) {
            this.a = dcyVar;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return b();
        }

        public final DiUnscopedComponent b() {
            dcy<? extends a7m> dcyVar = this.a;
            DiUnscopedComponent diUnscopedComponent = this.b;
            if (diUnscopedComponent != null) {
                if (diUnscopedComponent != null) {
                    return diUnscopedComponent;
                }
                return null;
            }
            try {
                DiUnscopedComponent diUnscopedComponent2 = (DiUnscopedComponent) dy2.e(dcyVar);
                this.b = diUnscopedComponent2;
                if (diUnscopedComponent2 != null) {
                    return diUnscopedComponent2;
                }
                return null;
            } catch (Throwable th) {
                throw new IllegalStateException(dcyVar + " has no registered factories and lacks STUB field, " + th);
            }
        }
    }

    public ipf0(rfc rfcVar) {
        this.a = new a(rfcVar);
    }

    @Override // xsna.c7m
    public final a7m a(e7m e7mVar, l9i l9iVar) {
        return this.a.b();
    }
}
