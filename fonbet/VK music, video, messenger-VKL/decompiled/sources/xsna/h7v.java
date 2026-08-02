package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g6p0;
import xsna.r6v;

/* compiled from: HintsManager.kt */
/* loaded from: classes.dex */
public interface h7v extends s6v {

    /* compiled from: HintsManager.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void a(boolean z);
    }

    static /* synthetic */ void d(h7v h7vVar, View view, String str, izs izsVar, izs izsVar2, int i) {
        if ((i & 4) != 0) {
            izsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar2 = null;
        }
        h7vVar.h(view, str, izsVar, izsVar2, null);
    }

    static /* synthetic */ void f(h7v h7vVar, View view, String str, hgy hgyVar, int i) {
        if ((i & 4) != 0) {
            hgyVar = null;
        }
        h7vVar.e(view, str, hgyVar);
    }

    static /* synthetic */ void t(h7v h7vVar, View view, String str, izs izsVar, gzs gzsVar, int i) {
        if ((i & 4) != 0) {
            izsVar = null;
        }
        h7vVar.j(view, str, izsVar, null, gzsVar);
    }

    boolean a(String str);

    Hint b(String str);

    void c(String str, b bVar);

    void e(View view, String str, izs izsVar);

    List<Hint> g();

    void h(View view, String str, izs izsVar, izs izsVar2, h8n0 h8n0Var);

    void i(String str, b bVar);

    void j(View view, String str, izs<? super r6v.a, s3q0> izsVar, Rect rect, gzs<s3q0> gzsVar);

    void l(View view, String str, gzs<s3q0> gzsVar);

    default boolean m(HintId hintId) {
        return a(hintId.getId());
    }

    boolean n();

    boolean o();

    Hint p(String str);

    default void q(View view, HintId hintId) {
        l(view, hintId.getId(), null);
    }

    r6v.a r(String str, Rect rect);

    void s(Hint hint);

    void u();

    g6p0 v(String str);

    /* compiled from: HintsManager.kt */
    public static final class a {
        public static final da4 a = new da4(3);

        public final h7v getSTUB() {
            return new C2977a();
        }

        /* compiled from: HintsManager.kt */
        /* renamed from: xsna.h7v$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C2977a implements h7v, s6v {
            @Override // xsna.h7v
            public final boolean a(String str) {
                return false;
            }

            @Override // xsna.h7v
            public final Hint b(String str) {
                return null;
            }

            @Override // xsna.h7v
            public final List<Hint> g() {
                return EmptyList.b;
            }

            @Override // xsna.h7v
            public final boolean n() {
                return false;
            }

            @Override // xsna.h7v
            public final boolean o() {
                return false;
            }

            @Override // xsna.h7v
            public final Hint p(String str) {
                return null;
            }

            @Override // xsna.h7v
            public final r6v.a r(String str, Rect rect) {
                return new C2978a();
            }

            @Override // xsna.h7v
            public final g6p0 v(String str) {
                return g6p0.a.a.getSTUB();
            }

            /* compiled from: HintsManager.kt */
            /* renamed from: xsna.h7v$a$a$a, reason: collision with other inner class name */
            public static final class C2978a implements r6v.a {
                @Override // xsna.r6v
                public final dcn j(Activity activity) {
                    return null;
                }

                @Override // xsna.r6v.a
                public final r6v.a e() {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a l() {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a m() {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a a(DialogInterface.OnDismissListener onDismissListener) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a b(DialogInterface.OnShowListener onShowListener) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a c(int i) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a d(float f) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a f(Rect rect) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a g(int i) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a h(ykt0 ykt0Var) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a i(View.OnClickListener onClickListener) {
                    return this;
                }

                @Override // xsna.r6v.a
                public final r6v.a k(int i) {
                    return this;
                }
            }

            @Override // xsna.s6v
            public final void detach() {
            }

            @Override // xsna.h7v
            public final void u() {
            }

            @Override // xsna.s6v
            public final void k(Object obj) {
            }

            @Override // xsna.h7v
            public final void s(Hint hint) {
            }

            @Override // xsna.h7v
            public final void c(String str, b bVar) {
            }

            @Override // xsna.h7v
            public final void i(String str, b bVar) {
            }

            @Override // xsna.h7v
            public final void e(View view, String str, izs izsVar) {
            }

            @Override // xsna.h7v
            public final void l(View view, String str, gzs<s3q0> gzsVar) {
            }

            @Override // xsna.h7v
            public final void h(View view, String str, izs izsVar, izs izsVar2, h8n0 h8n0Var) {
            }

            @Override // xsna.h7v
            public final void j(View view, String str, izs<? super r6v.a, s3q0> izsVar, Rect rect, gzs<s3q0> gzsVar) {
            }
        }
    }
}
