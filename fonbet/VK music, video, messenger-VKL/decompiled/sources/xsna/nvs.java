package xsna;

import androidx.appcompat.app.AppCompatActivity;

/* compiled from: FullScreenBannerManager.kt */
/* loaded from: classes16.dex */
public interface nvs {
    public static final a s7 = a.a;

    default io.reactivex.rxjava3.core.q<Boolean> a() {
        return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
    }

    void b(AppCompatActivity appCompatActivity, String str);

    void cancel();

    /* compiled from: FullScreenBannerManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3420a b = new C3420a();

        public static C3420a a() {
            return b;
        }

        /* compiled from: FullScreenBannerManager.kt */
        /* renamed from: xsna.nvs$a$a, reason: collision with other inner class name */
        public static final class C3420a implements nvs {
            @Override // xsna.nvs
            public final io.reactivex.rxjava3.core.q<Boolean> a() {
                return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
            }

            @Override // xsna.nvs
            public final void cancel() {
            }

            @Override // xsna.nvs
            public final void b(AppCompatActivity appCompatActivity, String str) {
            }
        }
    }
}
