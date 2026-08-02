package xsna;

import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.api.autotest.attachment.AutoTestAttachmentUsage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GalvitaUiDtoAdapter.kt */
/* loaded from: classes4.dex */
public final class b6t extends o5t<v64<? extends Attachment>> {
    public final y5t c;
    public final e6y0 d = new e6y0();
    public m680 e;
    public m680 f;
    public s6o g;

    /* compiled from: GalvitaUiDtoAdapter.kt */
    public static final class a extends d6t {
        public final de6<?> c;

        public a(de6<?> de6Var) {
            super(de6Var.b, de6Var.c);
            this.c = de6Var;
        }
    }

    public b6t(h170 h170Var) {
        this.c = new y5t(h170Var);
    }

    @Override // xsna.o5t
    public final float a(int i) {
        this.c.b(i, this.d);
        return r1.a / r1.b;
    }

    @Override // xsna.o5t
    public final int b(int i) {
        return this.c.c(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.o5t
    public final void c(d6t d6tVar, int i) {
        T t = (T) j5g.b0(i, this.a);
        if (t != 0 && (d6tVar instanceof a)) {
            m680 m680Var = this.e;
            m680 m680Var2 = this.f;
            s6o s6oVar = this.g;
            de6<?> de6Var = ((a) d6tVar).c;
            if (s6oVar != null) {
                de6Var.d(s6oVar);
            }
            de6Var.d = t.a();
            de6Var.e = t;
            de6Var.f = m680Var;
            de6Var.c(t);
            if (de6Var instanceof xna0) {
                ((xna0) de6Var).a(m680Var2);
            }
            mnh0.u(d6tVar.a, AutoTestAttachmentUsage.GRID, t.a(), 1119, null);
        }
    }

    @Override // xsna.o5t
    public final d6t d(GalvitaLayout galvitaLayout, int i) {
        de6 f = this.c.f(i, galvitaLayout);
        if (f != null) {
            return new a(f);
        }
        throw new IllegalArgumentException(lhg.a(i, "Incorrect view type: "));
    }

    @Override // xsna.o5t
    public final void e(List<? extends v64<? extends Attachment>> list) {
        ArrayList arrayList = this.c.c;
        arrayList.clear();
        List<? extends v64<? extends Attachment>> list2 = list;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        super.e(list);
    }
}
