package xsna;

import android.content.Context;

/* compiled from: MusicKidsModeManager.kt */
/* loaded from: classes3.dex */
public interface xl40 {
    public static final a a = a.a;

    void a(Context context);

    ttk0<Boolean> isEnabled();

    /* compiled from: MusicKidsModeManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xl40 STUB = new C4015a();

        public final xl40 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicKidsModeManager.kt */
        /* renamed from: xsna.xl40$a$a, reason: collision with other inner class name */
        public static final class C4015a implements xl40 {
            public final bpn0 b = new bpn0(new la0(16));

            public C4015a() {
                new bpn0(new zq3(21));
            }

            @Override // xsna.xl40
            public final ttk0<Boolean> isEnabled() {
                return (ttk0) this.b.getValue();
            }

            @Override // xsna.xl40
            public final void a(Context context) {
            }
        }
    }
}
