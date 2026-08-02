package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PrefetchedViewsRepository.kt */
/* loaded from: classes17.dex */
public final class l0d0 implements h4u0 {
    public io.reactivex.rxjava3.internal.operators.single.a a;

    /* compiled from: PrefetchedViewsRepository.kt */
    public final class a implements io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.disposables.c b;
        public boolean c;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.c) {
                return;
            }
            this.b.dispose();
            l0d0.this.a = null;
            this.c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c;
        }
    }

    /* compiled from: PrefetchedViewsRepository.kt */
    public static final class b {
        public final View a;

        public b(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a.equals(bVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + (Integer.hashCode(R.layout.clips_wrapper_fragment_content) * 31);
        }

        public final String toString() {
            return br.b(new StringBuilder("ResultContainer(layoutId=2131559411, view="), this.a, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.h4u0
    public final View a(cro0 cro0Var, ViewGroup viewGroup) {
        io.reactivex.rxjava3.internal.operators.single.a aVar = this.a;
        b bVar = aVar != null ? (b) aVar.r(4000L, TimeUnit.MILLISECONDS).c() : null;
        if (bVar == null) {
            return LayoutInflater.from(cro0Var).inflate(R.layout.clips_wrapper_fragment_content, viewGroup, false);
        }
        this.a = null;
        return bVar.a;
    }

    @Override // xsna.h4u0
    public final a b(cro0 cro0Var, FrameLayout frameLayout) {
        this.a = null;
        io.reactivex.rxjava3.internal.operators.single.a aVar = new io.reactivex.rxjava3.internal.operators.single.a(new io.reactivex.rxjava3.internal.operators.single.v(new mc6(this, cro0Var, frameLayout)).q(io.reactivex.rxjava3.schedulers.a.a()));
        this.a = aVar;
        return new a(aVar.subscribe());
    }
}
