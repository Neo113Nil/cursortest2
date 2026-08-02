package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import xsna.lqc0;

/* compiled from: PostingAuthorSelectionFlowLauncher.kt */
/* loaded from: classes4.dex */
public final class bdc0 {
    public final PostingCreationEntryPoint a;
    public final UserId b;
    public final wcc0 c;
    public final sk3<a> d = new sk3<>();
    public vcc0 e;
    public kgc0 f;

    /* compiled from: PostingAuthorSelectionFlowLauncher.kt */
    public static abstract class a {
        public final tl50 a;

        /* compiled from: PostingAuthorSelectionFlowLauncher.kt */
        /* renamed from: xsna.bdc0$a$a, reason: collision with other inner class name */
        public static final class C2605a extends a {
            public final hc5 b;

            public C2605a(hc5 hc5Var) {
                super(hc5Var);
                this.b = hc5Var;
            }

            @Override // xsna.bdc0.a
            public final dw20 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2605a) && epx.f(this.b, ((C2605a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "AuthorSelection(sheet=" + this.b + ')';
            }
        }

        /* compiled from: PostingAuthorSelectionFlowLauncher.kt */
        public static final class b extends a {
            public final lqc0 b;

            public b(lqc0 lqc0Var) {
                super(lqc0Var);
                this.b = lqc0Var;
            }

            @Override // xsna.bdc0.a
            public final dw20 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PostingWithAuthor(sheet=" + this.b + ')';
            }
        }

        public a(tl50 tl50Var) {
            this.a = tl50Var;
        }

        public dw20 a() {
            return this.a;
        }
    }

    public bdc0(PostingCreationEntryPoint postingCreationEntryPoint, UserId userId, wcc0 wcc0Var) {
        this.a = postingCreationEntryPoint;
        this.b = userId;
        this.c = wcc0Var;
    }

    public final boolean a(FragmentActivity fragmentActivity) {
        sk3<a> sk3Var = this.d;
        if (sk3Var.size() <= 1) {
            while (!sk3Var.isEmpty()) {
                a m = sk3Var.m();
                if (m != null) {
                    m.a().dismiss();
                }
            }
            sk3Var.clear();
            sk3Var.clear();
            this.f = null;
            this.e = null;
            return true;
        }
        a m2 = sk3Var.m();
        if (m2 != null) {
            m2.a().dismiss();
        }
        a m3 = sk3Var.m();
        if (!(m3 instanceof a.b)) {
            return false;
        }
        ((a.b) m3).a().dismiss();
        kgc0 kgc0Var = this.f;
        if (kgc0Var == null) {
            return false;
        }
        b(fragmentActivity, kgc0Var);
        return true;
    }

    public final void b(Context context, kgc0 kgc0Var) {
        FragmentManager supportFragmentManager;
        this.f = kgc0Var;
        lqc0 lqc0Var = (lqc0) new lqc0.a(context, this.a, kgc0Var, this.b, this.e).a();
        y5 y5Var = new y5(this, 5);
        ye80 ye80Var = new ye80(this, 7);
        kb40 kb40Var = new kb40(this, 14);
        lqc0Var.k1 = y5Var;
        lqc0Var.l1 = ye80Var;
        lqc0Var.m1 = kb40Var;
        lqc0Var.i0 = new mqc0(lqc0Var);
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            throw new IllegalStateException("Context is not FragmentActivity");
        }
        this.d.addLast(new a.b(lqc0Var));
        lqc0Var.Td(supportFragmentManager, "posting_with_author_bottom_sheet_mvi");
    }
}
