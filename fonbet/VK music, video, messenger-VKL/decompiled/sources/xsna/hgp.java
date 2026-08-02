package xsna;

import android.view.View;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: EmptyMainEduVc.kt */
/* loaded from: classes2.dex */
public final class hgp extends eyy {
    public final a e;
    public final Object f;

    /* compiled from: EmptyMainEduVc.kt */
    public interface a {
    }

    /* compiled from: EmptyMainEduVc.kt */
    public static final class b implements izs<msm, s3q0> {
        public final WeakReference<hgp> b;

        public b(hgp hgpVar) {
            this.b = new WeakReference<>(hgpVar);
        }

        @Override // xsna.izs
        public final s3q0 invoke(msm msmVar) {
            a aVar;
            xtm xtmVar;
            hgp hgpVar = this.b.get();
            if (hgpVar != null && (aVar = hgpVar.e) != null && (xtmVar = vtm.this.F) != null) {
                xtmVar.k();
            }
            return s3q0.a;
        }
    }

    public hgp(View view, a aVar) {
        super(R.id.dialogs_empty_all_edu, view);
        this.e = aVar;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new ozf(this, 23));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eyy
    public final void b(View view) {
        new sur0(view).V5(EmptyList.b, false, true, (b) this.f.getValue());
    }

    public final void c(boolean z) {
        if (z) {
            a();
            View view = this.d;
            (view != null ? view : null).setVisibility(0);
        } else if (this.c) {
            View view2 = this.d;
            f4m.j(view2 != null ? view2 : null);
        }
    }
}
