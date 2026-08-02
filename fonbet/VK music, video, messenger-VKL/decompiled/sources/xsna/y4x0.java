package xsna;

import androidx.core.graphics.drawable.IconCompat;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.LinkedHashMap;

/* compiled from: VoipViewModelOpponentAvatarDelegate.kt */
/* loaded from: classes11.dex */
public final class y4x0 {
    public final xdf a;
    public io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public final io.reactivex.rxjava3.subjects.d<a> c;
    public final io.reactivex.rxjava3.internal.operators.observable.m1 d;
    public final io.reactivex.rxjava3.subjects.f<Object> e;
    public final LinkedHashMap f;
    public IconCompat g;

    /* compiled from: VoipViewModelOpponentAvatarDelegate.kt */
    public interface a {

        /* compiled from: VoipViewModelOpponentAvatarDelegate.kt */
        /* renamed from: xsna.y4x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C4076a implements a {
            public final long a;

            public C4076a(long j) {
                this.a = j;
            }

            public final long a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4076a) && this.a == ((C4076a) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Chat(dialogId="));
            }
        }

        /* compiled from: VoipViewModelOpponentAvatarDelegate.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1701568789;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: VoipViewModelOpponentAvatarDelegate.kt */
        /* loaded from: classes7.dex */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final String a() {
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
                return ho8.a(new StringBuilder("Url(url="), this.a, ')');
            }
        }
    }

    public y4x0(w0f w0fVar, xdf xdfVar) {
        this.a = xdfVar;
        io.reactivex.rxjava3.subjects.d<a> O0 = io.reactivex.rxjava3.subjects.d.O0(a.b.a);
        this.c = O0;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        final s56 s56Var = new s56(this, 3);
        this.d = yVar.s0(new io.reactivex.rxjava3.functions.l() { // from class: xsna.w4x0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (io.reactivex.rxjava3.core.t) s56.this.invoke(obj);
            }
        }).a0(asu0.a.d());
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        this.f = new LinkedHashMap();
    }

    public final kr5 a() {
        kr5 d;
        kr5 d2;
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        ue40 ue40Var = new ue40(13, this, (dhw0Var == null || (d2 = dhw0Var.d()) == null) ? null : d2.b(0));
        dhw0 dhw0Var2 = com.vk.voip.ui.c.O;
        return (dhw0Var2 == null || (d = dhw0Var2.d()) == null) ? new kr5((AvatarBorderType) null, (h2z) null, ue40Var, 7) : kr5.a(d, null, ue40Var, 7);
    }

    public final String b() {
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        Long valueOf = dhw0Var != null ? Long.valueOf(dhw0Var.g()) : null;
        if (valueOf != null) {
            return (String) this.f.get(Long.valueOf(valueOf.longValue()));
        }
        return null;
    }

    public final void c(a aVar) {
        L.e("VVMOpponentAvatarDelegate", "Update peer icon with  " + aVar);
        this.c.onNext(aVar);
    }
}
