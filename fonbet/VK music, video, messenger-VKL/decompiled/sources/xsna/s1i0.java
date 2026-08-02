package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.bea;
import xsna.el50;
import xsna.ln50;

/* compiled from: SectionBlockOperations.kt */
/* loaded from: classes16.dex */
public final class s1i0 implements b2a {
    public final eea a;
    public final CatalogBlockData b;
    public final LinkedHashSet c = new LinkedHashSet();

    /* compiled from: SectionBlockOperations.kt */
    public static final class a implements on50 {
        public final BlockId a;
        public final on50 b;

        public a(BlockId blockId, on50 on50Var) {
            this.a = blockId;
            this.b = on50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SectionMviTaskId(blockId=" + this.a + ", blockTask=" + this.b + ')';
        }
    }

    public s1i0(eea eeaVar, CatalogBlockData catalogBlockData) {
        this.a = eeaVar;
        this.b = catalogBlockData;
    }

    @Override // xsna.b2a
    public final void a(t0a t0aVar) {
        this.a.e.a(t0aVar);
    }

    @Override // xsna.b2a
    public final void b() {
        yoz.c(this.a);
    }

    @Override // xsna.b2a
    public final void c() {
        yoz.b(this.a, ((CatalogBlockState) this.b.b.getValue()).w().getId());
    }

    @Override // xsna.b2a
    public final void e(on50 on50Var, ln50<on50> ln50Var, izs<? super dwj, ? extends bwj> izsVar) {
        a aVar = new a(getCurrentState().w(), on50Var);
        fo6 fo6Var = new fo6(24, izsVar, this);
        eea eeaVar = this.a;
        eeaVar.getClass();
        el50.a.a(eeaVar, aVar, ln50Var, fo6Var);
    }

    @Override // xsna.b2a
    public final void f(List<String> list) {
        eea eeaVar = this.a;
        yoz.e(eeaVar, new zoz(eeaVar, list, null));
    }

    @Override // xsna.b2a
    public final void g(String str, izs izsVar, v1a v1aVar) {
        String id = getCurrentState().w().getId();
        cqz cqzVar = new cqz(id, str);
        eea eeaVar = this.a;
        eeaVar.f(eeaVar, cqzVar, ln50.a.b, new g22(izsVar, new xoz(eeaVar, id, str, v1aVar, null)));
    }

    @Override // xsna.b2a
    public final CatalogBlockState getCurrentState() {
        return (CatalogBlockState) this.b.b.getValue();
    }

    @Override // xsna.b2a
    public final void h(com.vk.libvideo.b bVar) {
        CatalogBlockState catalogBlockState = (CatalogBlockState) bVar.invoke(getCurrentState());
        if (catalogBlockState != null) {
            utk0 utk0Var = this.b.b;
            utk0Var.getClass();
            utk0Var.i(null, catalogBlockState);
        }
    }

    @Override // xsna.b2a
    public final void i(BlockId.Simple simple, List list) {
        eea eeaVar = this.a;
        yoz.e(eeaVar, new apz(eeaVar, simple, list, null));
    }

    @Override // xsna.b2a
    public final void j() {
        LinkedHashSet linkedHashSet = this.c;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((jn50) it.next()).a();
        }
        linkedHashSet.clear();
    }

    @Override // xsna.b2a
    public final void k(String str) {
        eea eeaVar = this.a;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = eeaVar.b;
        List<CatalogBlockData> list = ((CatalogSectionState) sj50Var.getCurrentState()).d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String id = ((CatalogBlockState) ((CatalogBlockData) it.next()).b.getValue()).w().getId();
            CatalogBlockData catalogBlockData = this.b;
            if (epx.f(id, catalogBlockData.g().w().getId())) {
                el50.a.a(eeaVar, new f730(((CatalogSectionState) sj50Var.getCurrentState()).c), ln50.a.b, new go6(eeaVar, str, catalogBlockData, 2));
                return;
            }
        }
    }

    @Override // xsna.b2a
    public final void l(r1a r1aVar) {
        eea eeaVar = this.a;
        String str = ((CatalogSectionState) eeaVar.b.getCurrentState()).c;
        eeaVar.c(new bea.a(r1aVar));
    }
}
