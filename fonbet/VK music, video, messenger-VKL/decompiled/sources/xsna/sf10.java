package xsna;

import android.content.Context;
import android.view.View;
import com.vk.photo.editor.views.ToolButton;
import java.util.ArrayList;
import java.util.Set;
import xsna.d5p;
import xsna.p4p;

/* compiled from: MarkupTool.kt */
/* loaded from: classes4.dex */
public final class sf10 extends m3p<nf10> implements v0g, p290 {
    public final v3p c;
    public final Set<co00> d;
    public final bbp e;
    public final bpn0 f;

    /* compiled from: MarkupTool.kt */
    public static final class a implements d5p.a<nf10> {
        public final Set<co00> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<? extends co00> set) {
            this.a = set;
        }

        @Override // xsna.d5p.a
        public final d5p<nf10> a(v3p v3pVar) {
            return new sf10(v3pVar, this.a);
        }
    }

    /* compiled from: MarkupTool.kt */
    public static final class b implements tf10 {
        public b() {
        }

        @Override // xsna.tf10
        public final boolean a(co00 co00Var) {
            return sf10.this.d.contains(co00Var);
        }

        @Override // xsna.tf10
        public final void b(vlo vloVar) {
            sf10.this.c.s(new nf10(vloVar));
        }

        @Override // xsna.tf10
        public final bbp e() {
            return sf10.this.e;
        }
    }

    /* compiled from: MarkupTool.kt */
    public static final class c implements l290 {
        public final bbp a;

        public c(sf10 sf10Var) {
            this.a = sf10Var.e;
        }

        @Override // xsna.l290
        public final View a() {
            return null;
        }

        @Override // xsna.l290
        public final View b() {
            return this.a;
        }

        @Override // xsna.l290
        public final View c() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sf10(v3p v3pVar, Set<? extends co00> set) {
        this.c = v3pVar;
        this.d = set;
        bbp bbpVar = new bbp(v3pVar.x());
        bbpVar.setOnViewResized(new rlh(this, 21));
        this.e = bbpVar;
        this.f = new bpn0(new nuv(this, 6));
    }

    @Override // xsna.m3p
    public final void G(nf10 nf10Var) {
        this.e.b(nf10Var.a);
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final f5p getId() {
        return uf10.a;
    }

    @Override // xsna.d5p
    public final h5p<nf10> getRenderer() {
        return new po40();
    }

    @Override // xsna.m3p, xsna.d5p
    public final e5p i() {
        return (b) this.f.getValue();
    }

    @Override // xsna.m3p, xsna.d5p
    public final p4p j(p4p p4pVar) {
        ArrayList arrayList = p4pVar.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            q4p q4pVar = (q4p) obj;
            if (!(q4pVar instanceof p4p.a) || !j5g.P(this.d, ((p4p.a) q4pVar).a)) {
                arrayList2.add(obj);
            }
        }
        return new p4p(arrayList2);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        return null;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super nf10> spjVar) {
        return new nf10(new vlo((kif0) null, 3));
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        return new c(this);
    }

    @Override // xsna.d5p
    public final void k() {
    }

    @Override // xsna.d5p
    public final void p() {
    }
}
