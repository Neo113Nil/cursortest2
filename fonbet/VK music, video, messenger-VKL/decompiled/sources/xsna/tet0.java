package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jgr;
import xsna.lgr;

/* compiled from: VideoSearchFiltersModalPageContentComposeView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class tet0 extends td implements ner {
    public static final /* synthetic */ int y = 0;
    public final boolean l;
    public final wh50<set0> m;
    public final wh50<nuz> n;
    public final List o;
    public final List p;
    public final f1m q;
    public final f1m r;
    public final f1m s;
    public final f1m t;
    public final f1m u;
    public final f1m v;
    public final f1m w;
    public final f1m x;

    /* compiled from: VideoSearchFiltersModalPageContentComposeView.kt */
    @b6l(c = "com.vk.search.tool.view.VideoSearchFiltersModalPageContentComposeView$Content$2$1", f = "VideoSearchFiltersModalPageContentComposeView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return tet0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            tet0 tet0Var = tet0.this;
            int i = tet0.y;
            tet0Var.B();
            return s3q0.a;
        }
    }

    public tet0(Activity activity, boolean z, nuz nuzVar) {
        super(activity, null, 6, 0);
        this.l = z;
        this.m = androidx.compose.runtime.k.b(new VideoSearchFiltersImpl());
        this.n = androidx.compose.runtime.k.b(nuzVar);
        this.o = rl3.s0(activity.getResources().getIntArray(R.array.video_duration_sec));
        this.p = rl3.s0(activity.getResources().getIntArray(R.array.video_upload_date_sec));
        this.q = bbk0.b(new ew3(26, nuzVar, this));
        this.r = bbk0.b(new d5(24, nuzVar, this));
        this.s = bbk0.b(new xm6(17, nuzVar, this));
        this.t = bbk0.b(new pyr0(this, 7));
        this.u = bbk0.b(new xq1(16, nuzVar, this));
        this.v = bbk0.b(new lqs0(this, 4));
        this.w = bbk0.b(new x2j0(this, 15));
        this.x = bbk0.b(new h6m0(this, 18));
    }

    public final void A(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1333578539);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1333578539, i2, -1, "com.vk.search.tool.view.VideoSearchFiltersModalPageContentComposeView.Theme (VideoSearchFiltersModalPageContentComposeView.kt:93)");
            }
            Integer b = gpo0.b((Context) M.r(AndroidCompositionLocals_androidKt.b));
            if (b != null) {
                M.K(-190607232);
                TypedValue typedValue = krv0.a;
                int intValue = b.intValue();
                dhr0 dhr0Var = krv0.b;
                aVar2 = M;
                rrv0.e(epx.f(dhr0Var != null ? Boolean.valueOf(dhr0Var.O(intValue)) : null, Boolean.TRUE), null, null, null, null, null, jaiVar, aVar2, (i2 << 18) & 3670016, 62);
                jaiVar2 = jaiVar;
                aVar2.j();
            } else {
                jaiVar2 = jaiVar;
                M.K(-190433477);
                rrv0.d(null, null, null, null, jaiVar2, M, (i2 << 12) & 57344, 15);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o7c(this, jaiVar2, i, 6);
        }
    }

    public final void B() {
        zak0 zak0Var = (zak0) this.n;
        nuz nuzVar = (nuz) zak0Var.getValue();
        zak0 zak0Var2 = (zak0) this.m;
        int duration = ((set0) zak0Var2.getValue()).getDuration();
        boolean z = this.l;
        boolean z2 = (duration == 2 || ((set0) zak0Var2.getValue()).d() || z) ? false : true;
        boolean z3 = ((set0) zak0Var2.getValue()).getDuration() == 0;
        boolean z4 = ((set0) zak0Var2.getValue()).getContentType() != 2;
        if (z2 == ((ecr) nuzVar.a.a.get(2)).isEnabled() && z3 == ((ecr) nuzVar.a.a.get(3)).isEnabled() && z4 == ((ecr) nuzVar.c.a.get(2)).isEnabled()) {
            return;
        }
        nuz nuzVar2 = new nuz(z);
        ((nuz) zak0Var.getValue()).getClass();
        nuzVar2.e = ((nuz) zak0Var.getValue()).e;
        jgr jgrVar = nuzVar2.a;
        ArrayList arrayList = jgrVar.a;
        arrayList.set(2, new jgr.b(((ecr) arrayList.get(2)).a(), z2));
        ArrayList arrayList2 = jgrVar.a;
        arrayList2.set(3, new jgr.c(((ecr) arrayList2.get(3)).a(), z3));
        ArrayList arrayList3 = nuzVar2.c.a;
        arrayList3.set(2, new lgr.b(((ecr) arrayList3.get(2)).a(), z4));
        zak0Var.setValue(nuzVar2);
    }

    @Override // xsna.ner
    public set0 getActualFilter() {
        return (set0) ((zak0) this.m).getValue();
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-186143786);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-186143786, i2, -1, "com.vk.search.tool.view.VideoSearchFiltersModalPageContentComposeView.Content (VideoSearchFiltersModalPageContentComposeView.kt:122)");
            }
            A(((i2 << 3) & 112) | 70, M, kai.c(-1332376204, new jd4(this, 17), M));
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new a(null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yg7(this, i, 15);
        }
    }

    @Override // xsna.ner
    public final void reset() {
        zak0 zak0Var = (zak0) this.m;
        VideoSearchFiltersImpl copy = ((set0) zak0Var.getValue()).copy();
        copy.reset();
        zak0Var.setValue(copy);
    }

    public final void z(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1247808397);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1247808397, i2, -1, "com.vk.search.tool.view.VideoSearchFiltersModalPageContentComposeView.Spinners (VideoSearchFiltersModalPageContentComposeView.kt:164)");
            }
            String N = d370.N(R.string.video_catalog_filters_sort, 0, M);
            String N2 = d370.N(((Number) this.q.getValue()).intValue(), 0, M);
            zak0 zak0Var = (zak0) this.n;
            ArrayList arrayList = ((nuz) zak0Var.getValue()).b.a;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new hij0(this, 18);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4 || M.y(this);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new xk6(this, 14);
                M.R(x2);
            }
            f1m f1mVar = this.w;
            ret0.b(N, N2, arrayList, izsVar, (wzs) x2, !((Boolean) f1mVar.getValue()).booleanValue(), M, 0);
            String N3 = d370.N(R.string.video_filters_type_content, 0, M);
            String N4 = d370.N(((Number) this.r.getValue()).intValue(), 0, M);
            ArrayList arrayList2 = ((nuz) zak0Var.getValue()).a.a;
            boolean z3 = i3 == 4 || M.y(this);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new xim0(this, 11);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            boolean z4 = i3 == 4 || M.y(this);
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new dr0(this, 11);
                M.R(x4);
            }
            ret0.b(N3, N4, arrayList2, izsVar2, (wzs) x4, !((Boolean) f1mVar.getValue()).booleanValue(), M, 0);
            String N5 = d370.N(R.string.video_catalog_filters_length, 0, M);
            String N6 = d370.N(((Number) this.s.getValue()).intValue(), 0, M);
            ArrayList arrayList3 = ((nuz) zak0Var.getValue()).c.a;
            boolean z5 = i3 == 4 || M.y(this);
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new f6m0(this, 16);
                M.R(x5);
            }
            izs izsVar3 = (izs) x5;
            boolean z6 = i3 == 4 || M.y(this);
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new cd4(this, 12);
                M.R(x6);
            }
            ret0.b(N5, N6, arrayList3, izsVar3, (wzs) x6, ((Boolean) this.t.getValue()).booleanValue(), M, 0);
            String N7 = d370.N(R.string.video_catalog_filters_date, 0, M);
            String N8 = d370.N(((Number) this.u.getValue()).intValue(), 0, M);
            ArrayList arrayList4 = ((nuz) zak0Var.getValue()).d.a;
            boolean z7 = i3 == 4 || M.y(this);
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new qjg0(this, 19);
                M.R(x7);
            }
            izs izsVar4 = (izs) x7;
            boolean z8 = i3 == 4 || M.y(this);
            Object x8 = M.x();
            if (z8 || x8 == c0012a) {
                x8 = new fd4(this, 10);
                M.R(x8);
            }
            ret0.b(N7, N8, arrayList4, izsVar4, (wzs) x8, !((Boolean) f1mVar.getValue()).booleanValue(), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.n(this, i, 10);
        }
    }

    @Override // xsna.ner
    public final void z2(set0 set0Var) {
        zak0 zak0Var = (zak0) this.m;
        VideoSearchFiltersImpl copy = ((set0) zak0Var.getValue()).copy();
        copy.R(set0Var);
        zak0Var.setValue(copy);
    }
}
