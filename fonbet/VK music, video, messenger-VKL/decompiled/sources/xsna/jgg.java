package xsna;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: CommentsTooltips.kt */
/* loaded from: classes4.dex */
public final class jgg {
    public static void a(View view, String str, gzs gzsVar, ViewGroup viewGroup) {
        new RectF().set((RectF) gzsVar.invoke());
        hl60 hl60Var = hl60.a;
        if (hl60.a(str)) {
            return;
        }
        hl60.a.e(view.getContext(), view, str, false, new z90(21), gzsVar, new a(), null, viewGroup);
    }

    public static /* synthetic */ void b(jgg jggVar, View view, String str) {
        hgg hggVar = new hgg(view, 0);
        jggVar.getClass();
        a(view, str, hggVar, null);
    }

    public static void c(View view, String str, gzs gzsVar, ViewGroup viewGroup) {
        new RectF().set((RectF) gzsVar.invoke());
        hl60 hl60Var = hl60.a;
        if (hl60.a(str)) {
            return;
        }
        hl60.a.e(view.getContext(), view, str, true, new lt0(21), gzsVar, new b(), null, viewGroup);
    }

    public static /* synthetic */ void d(jgg jggVar, View view, String str) {
        igg iggVar = new igg(view, 0);
        jggVar.getClass();
        c(view, str, iggVar, null);
    }

    /* compiled from: CommentsTooltips.kt */
    public static final class a implements x6v {
        @Override // xsna.x6v
        public final void b(String str) {
            jjc.b();
        }

        @Override // xsna.x6v
        public final void onClick() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.x6v
        public final void a(View view, String str) {
        }
    }

    /* compiled from: CommentsTooltips.kt */
    public static final class b implements x6v {
        @Override // xsna.x6v
        public final void b(String str) {
            hl60 hl60Var = hl60.a;
            hl60.g.add(str);
        }

        @Override // xsna.x6v
        public final void onClick() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.x6v
        public final void a(View view, String str) {
        }
    }
}
