package xsna;

import kotlin.collections.EmptyList;
import xsna.ztp;

/* compiled from: EqualizerController.kt */
@ozl
/* loaded from: classes3.dex */
public interface otp {
    public static final a a = a.a;

    void a(int i);

    void b(ztp ztpVar);

    boolean c();

    ztp d();

    ztp.g e();

    void f(String str);

    void g(String str);

    void h(boolean z);

    void i(short s, short s2);

    boolean isEnabled();

    ntp j();

    ztp.g k();

    void release(int i);

    void setEnabled(boolean z);

    /* compiled from: EqualizerController.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final otp STUB = new C3471a();

        public final otp getSTUB() {
            return STUB;
        }

        /* compiled from: EqualizerController.kt */
        /* renamed from: xsna.otp$a$a, reason: collision with other inner class name */
        public static final class C3471a implements otp {
            public final ztp.j b = ztp.j.d;
            public final ztp.g c = new ztp.g(EmptyList.b);
            public final ntp d = new ntp(0, 0, new i06[0]);
            public boolean e;

            @Override // xsna.otp
            public final boolean c() {
                return false;
            }

            @Override // xsna.otp
            public final ztp d() {
                return this.b;
            }

            @Override // xsna.otp
            public final ztp.g e() {
                return new ztp.g(EmptyList.b);
            }

            @Override // xsna.otp
            public final boolean isEnabled() {
                return this.e;
            }

            @Override // xsna.otp
            public final ntp j() {
                return this.d;
            }

            @Override // xsna.otp
            public final ztp.g k() {
                return this.c;
            }

            @Override // xsna.otp
            public final void setEnabled(boolean z) {
                this.e = z;
            }

            @Override // xsna.otp
            public final void a(int i) {
            }

            @Override // xsna.otp
            public final void b(ztp ztpVar) {
            }

            @Override // xsna.otp
            public final void f(String str) {
            }

            @Override // xsna.otp
            public final void g(String str) {
            }

            @Override // xsna.otp
            public final void h(boolean z) {
            }

            @Override // xsna.otp
            public final void release(int i) {
            }

            @Override // xsna.otp
            public final void i(short s, short s2) {
            }
        }
    }
}
