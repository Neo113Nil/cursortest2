package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.zcs0;

/* compiled from: VideoSearchParamsDelegate.kt */
@ozl
/* loaded from: classes5.dex */
public final class wet0 {
    public final izs<set0, s3q0> a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final boolean d;
    public final izs<Boolean, s3q0> e;
    public final izs<Boolean, s3q0> f;
    public final set0 g;
    public final boolean h;
    public final Object i;
    public dw20 j;

    /* JADX WARN: Multi-variable type inference failed */
    public wet0(izs<? super set0, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, boolean z, izs<? super Boolean, s3q0> izsVar2, izs<? super Boolean, s3q0> izsVar3, set0 set0Var, boolean z2) {
        this.a = izsVar;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = z;
        this.e = izsVar2;
        this.f = izsVar3;
        this.g = set0Var;
        this.h = z2;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new e3c0(12));
    }

    public static void a(String str, StringBuilder sb) {
        if (sb.length() == 0) {
            sb.append(brm0.o(str));
        } else {
            sb.append(", ");
            sb.append(brm0.t(str));
        }
    }

    public final void b() {
        set0 set0Var = this.g;
        set0Var.reset();
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        izs<Boolean, s3q0> izsVar = this.e;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(set0Var.I()));
        }
    }

    public final void c(boolean z) {
        if (z) {
            e();
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (this.d) {
            b();
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        izs<Boolean, s3q0> izsVar = this.e;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(this.g.I()));
            s3q0 s3q0Var3 = s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.tet0] */
    public final void d(Context context) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ?? r0 = this.i;
        boolean booleanValue = ((Boolean) r0.getValue()).booleanValue();
        boolean z = this.h;
        final bth0 tet0Var = booleanValue ? new tet0(h, z, new nuz(z)) : new bth0(h, z, new nuz(z));
        tet0Var.z2(this.g);
        this.j = (((Boolean) r0.getValue()).booleanValue() ? new zcs0.a(h, new ycs0()) : new dw20.b(h, null)).D0(tet0Var, false).v0(R.string.video_catalog_filters).t().G(R.string.video_catalog_filters_clear).H(new n3b0(tet0Var, 24)).i0(R.string.video_catalog_filters_show_results, new hz20() { // from class: xsna.vet0
            @Override // xsna.hz20
            public final void a(int i) {
                wet0 wet0Var = wet0.this;
                set0 set0Var = wet0Var.g;
                set0Var.R(((ner) tet0Var).getActualFilter());
                izs<Boolean, s3q0> izsVar = wet0Var.f;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(set0Var.I()));
                }
                wet0Var.e();
                wet0Var.a.invoke(set0Var);
                dw20 dw20Var = wet0Var.j;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                wet0Var.j = null;
            }
        }).I(true).c(new cpo(false, 0, 5)).I0(null);
    }

    public final void e() {
        set0 set0Var = this.g;
        if (set0Var.I()) {
            b();
            return;
        }
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        izs<Boolean, s3q0> izsVar = this.e;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(set0Var.I()));
        }
    }

    public final String f(Context context) {
        StringBuilder sb = new StringBuilder();
        set0 set0Var = this.g;
        if (set0Var.I()) {
            return null;
        }
        sb.setLength(0);
        if (set0Var.e() != 2) {
            a(context.getResources().getStringArray(R.array.video_search_sort)[set0Var.e()], sb);
        }
        if (set0Var.getDuration() > 0) {
            a(context.getString(R.string.video_long), sb);
        } else if (set0Var.getDuration() < 0) {
            a(context.getString(R.string.video_short), sb);
        }
        if (set0Var.B() != 0) {
            a(context.getResources().getStringArray(R.array.video_search_date)[set0Var.B()], sb);
        }
        if (set0Var.d()) {
            a(context.getString(R.string.video_high_quality), sb);
        }
        if (set0Var.v()) {
            a(context.getString(R.string.video_filters_live_video), sb);
        }
        if (set0Var.p()) {
            a(context.getString(R.string.video_filters_authors), sb);
        }
        if (set0Var.j() != null) {
            a(enj.j(R.array.video_search_content, context)[set0Var.getContentType()], sb);
        }
        return sb.toString();
    }

    public /* synthetic */ wet0(izs izsVar, i2u i2uVar, jw3 jw3Var, whe wheVar, VideoSearchFiltersImpl videoSearchFiltersImpl, boolean z, int i) {
        this(izsVar, (i & 2) != 0 ? null : i2uVar, (i & 4) != 0 ? null : jw3Var, (i & 8) != 0, (i & 16) != 0 ? null : wheVar, null, (i & 64) != 0 ? new VideoSearchFiltersImpl() : videoSearchFiltersImpl, (i & 128) != 0 ? false : z);
    }
}
