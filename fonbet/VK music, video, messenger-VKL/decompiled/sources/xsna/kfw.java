package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: ImageAnalysisBlockingAnalyzer.java */
/* loaded from: classes11.dex */
public final class kfw extends jfw {

    /* compiled from: ImageAnalysisBlockingAnalyzer.java */
    public class a implements o0t<Void> {
        public final /* synthetic */ alw b;

        public a(alw alwVar) {
            this.b = alwVar;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            this.b.close();
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }
    }

    @Override // xsna.jfw
    @Nullable
    public final alw a(@NonNull hlw hlwVar) {
        return hlwVar.b();
    }

    @Override // xsna.jfw
    public final void e(@NonNull alw alwVar) {
        r0t.a(b(alwVar), new a(alwVar), xo9.g());
    }

    @Override // xsna.jfw
    public final void c() {
    }
}
