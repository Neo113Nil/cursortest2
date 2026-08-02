package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import org.json.JSONObject;
import xsna.dd9;
import xsna.khw0;
import xsna.x9p;

/* compiled from: VoipBridge.kt */
/* loaded from: classes.dex */
public interface afw0 {
    public static final a a = a.a;

    usw0 P();

    khw0 a();

    fhw0 b();

    void c();

    x9p d();

    cd9 e();

    default boolean isCallActive() {
        return false;
    }

    boolean isHeadsetConnected();

    default boolean isIdle() {
        return true;
    }

    /* compiled from: VoipBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final afw0 STUB = new C2540a();

        public final afw0 getSTUB() {
            return STUB;
        }

        /* compiled from: VoipBridge.kt */
        /* renamed from: xsna.afw0$a$a, reason: collision with other inner class name */
        public static final class C2540a implements afw0 {
            public final b b = new b();
            public final C2541a c = new C2541a();
            public final d d = new d();
            public final c e = new c();

            /* compiled from: VoipBridge.kt */
            /* renamed from: xsna.afw0$a$a$c */
            public static final class c implements fhw0 {
                @Override // xsna.fhw0
                public final io.reactivex.rxjava3.core.a a() {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }

                @Override // xsna.fhw0
                public final boolean isInitialized() {
                    return true;
                }
            }

            @Override // xsna.afw0
            public final usw0 P() {
                return this.d;
            }

            @Override // xsna.afw0
            public final khw0 a() {
                return this.c;
            }

            @Override // xsna.afw0
            public final fhw0 b() {
                return this.e;
            }

            @Override // xsna.afw0
            public final x9p d() {
                return x9p.b.a.getSTUB();
            }

            @Override // xsna.afw0
            public final cd9 e() {
                return this.b;
            }

            @Override // xsna.afw0
            public final boolean isCallActive() {
                return false;
            }

            @Override // xsna.afw0
            public final boolean isHeadsetConnected() {
                return false;
            }

            @Override // xsna.afw0
            public final boolean isIdle() {
                return true;
            }

            /* compiled from: VoipBridge.kt */
            /* renamed from: xsna.afw0$a$a$a, reason: collision with other inner class name */
            public static final class C2541a implements khw0 {
                @Override // xsna.khw0
                public final void b() {
                }

                @Override // xsna.khw0
                public final void d(khw0.a aVar) {
                }

                @Override // xsna.khw0
                public final void a(UserId userId, OnlineInfo onlineInfo) {
                }

                @Override // xsna.khw0
                public final void c(String str, JSONObject jSONObject) {
                }
            }

            /* compiled from: VoipBridge.kt */
            /* renamed from: xsna.afw0$a$a$b */
            public static final class b implements cd9 {
                @Override // xsna.cd9
                public final io.reactivex.rxjava3.core.q b(ey0 ey0Var, eb ebVar) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.cd9
                public final io.reactivex.rxjava3.core.q<String> c() {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.cd9
                public final io.reactivex.rxjava3.core.q<dd9.a> d(UserId userId) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }

                @Override // xsna.cd9
                public final void a() {
                }
            }

            @Override // xsna.afw0
            public final void c() {
            }

            /* compiled from: VoipBridge.kt */
            /* renamed from: xsna.afw0$a$a$d */
            public static final class d implements usw0 {
                @Override // xsna.usw0
                public final boolean b(long j) {
                    return false;
                }

                @Override // xsna.usw0
                public final void a(long j, String str, xa4 xa4Var) {
                }
            }
        }
    }
}
