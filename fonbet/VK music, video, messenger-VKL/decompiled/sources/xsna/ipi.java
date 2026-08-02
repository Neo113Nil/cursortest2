package xsna;

/* compiled from: ColorSource.kt */
/* loaded from: classes17.dex */
public interface ipi {

    /* compiled from: ColorSource.kt */
    public static final class a {
        public static final C3070a a = new C3070a();

        /* compiled from: ColorSource.kt */
        /* renamed from: xsna.ipi$a$a, reason: collision with other inner class name */
        public static final class C3070a implements ipi {
            @Override // xsna.ipi
            public final long a(int i, androidx.compose.runtime.a aVar) {
                aVar.K(-1546476612);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1546476612, i, -1, "com.vk.core.view.model.ComposeColorSource.Companion.Unspecified.<no name provided>.asComposeColor (ColorSource.kt:58)");
                }
                long j = l5g.k;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return j;
            }
        }

        public static b8g a(int i) {
            return new b8g(i);
        }
    }

    long a(int i, androidx.compose.runtime.a aVar);
}
