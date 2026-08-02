package xsna;

import com.vk.clips.sdk.shared.feed.model.DataLoadState;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.n0x;

/* compiled from: BannerCompanionRepository.kt */
/* loaded from: classes17.dex */
public final class s16 {
    public final io.reactivex.rxjava3.subjects.f<a> a = new io.reactivex.rxjava3.subjects.f<>();
    public final ConcurrentHashMap<String, t16> b = new ConcurrentHashMap<>();

    /* compiled from: BannerCompanionRepository.kt */
    public interface a {

        /* compiled from: BannerCompanionRepository.kt */
        /* renamed from: xsna.s16$a$a, reason: collision with other inner class name */
        public static final class C3647a implements a {
            public static final C3647a a = new C3647a();
            public static final String b = "";

            @Override // xsna.s16.a
            public final String F() {
                return b;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3647a);
            }

            public final int hashCode() {
                return 997006793;
            }

            public final String toString() {
                return "ClearStorage";
            }
        }

        /* compiled from: BannerCompanionRepository.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            @Override // xsna.s16.a
            public final String F() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RemoveBanner(uniqueKey="), this.a, ')');
            }
        }

        /* compiled from: BannerCompanionRepository.kt */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            @Override // xsna.s16.a
            public final String F() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RestoreBanner(uniqueKey="), this.a, ')');
            }
        }

        /* compiled from: BannerCompanionRepository.kt */
        public static final class d implements a {
            public final String a;

            public d(String str) {
                this.a = str;
            }

            @Override // xsna.s16.a
            public final String F() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SaveBanner(uniqueKey="), this.a, ')');
            }
        }

        String F();
    }

    public final boolean a(String str) {
        return this.b.containsKey(str);
    }

    public final t16 b(String str, boolean z, List<String> list, String str2, n0x n0xVar) {
        ConcurrentHashMap<String, t16> concurrentHashMap = this.b;
        if (concurrentHashMap.containsKey(str)) {
            this.a.onNext(new a.c(str));
        }
        t16 t16Var = concurrentHashMap.get(str);
        if (t16Var == null) {
            return new t16(z && (n0xVar instanceof n0x.a), DataLoadState.POSITION_NOT_REACHED, list, str2);
        }
        return t16Var;
    }
}
