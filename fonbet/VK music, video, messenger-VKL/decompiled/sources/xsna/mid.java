package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.chd;
import xsna.dhd;

/* compiled from: ClipsAuthorsSelectorPresenter.kt */
/* loaded from: classes14.dex */
public final class mid implements kid {
    public final pid a;
    public final rhd b;
    public final qhd c;
    public rhh0 d;
    public io.reactivex.rxjava3.disposables.c e;
    public qid f = new qid(0);

    public mid(pid pidVar, rhd rhdVar, qhd qhdVar) {
        this.a = pidVar;
        this.b = rhdVar;
        this.c = qhdVar;
    }

    @Override // xsna.kid
    public final void a() {
        this.b.a();
    }

    @Override // xsna.kid
    public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        qid qidVar = this.f;
        this.c.getClass();
        this.f = qid.a(qidVar, null, mobileOfficialAppsCoreNavStat$EventScreen, false, 1);
        io.reactivex.rxjava3.internal.operators.single.y l = this.b.g().l(new bl(new tm0(this, 24), 13));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.e = l.q(asu0.r()).m(asu0Var.d()).subscribe(new um0(new dsc(this, 3), 17), new wf1(new x7(this, 26), 13));
    }

    @Override // xsna.kid
    public final void c() {
        Object obj;
        chd chdVar;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.f.b;
        rhd rhdVar = this.b;
        if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
            rhdVar.b(mobileOfficialAppsCoreNavStat$EventScreen);
        }
        Iterator<T> it = this.f.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ghd) obj).b) {
                    break;
                }
            }
        }
        ghd ghdVar = (ghd) obj;
        if (ghdVar != null) {
            dhd dhdVar = ghdVar.a;
            UserId id = dhdVar.getId();
            if (id != null) {
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                com.vk.im.ui.fragments.b bVar = new com.vk.im.ui.fragments.b(id, 27);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(bVar);
            }
            if (dhdVar instanceof dhd.a) {
                chdVar = ((dhd.a) dhdVar).a;
            } else if (dhdVar instanceof dhd.c) {
                chdVar = ((dhd.c) dhdVar).a;
            } else {
                if (!(dhdVar instanceof dhd.b)) {
                    throw new IllegalStateException("value is not mapped");
                }
                chdVar = chd.c.a;
            }
            rhdVar.h(chdVar, false);
            rhh0 rhh0Var = this.d;
            if (rhh0Var != null) {
                rhh0Var.k();
            }
        }
    }

    @Override // xsna.kid
    public final void d(ghd ghdVar) {
        qid qidVar = this.f;
        List<ghd> list = qidVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dhd dhdVar = ((ghd) it.next()).a;
            arrayList.add(new ghd(dhdVar, epx.f(dhdVar.getId(), ghdVar.a.getId())));
        }
        qid a = qid.a(qidVar, arrayList, null, false, 6);
        this.f = a;
        this.a.setState(a);
    }

    @Override // xsna.kid
    public final void e(rhh0 rhh0Var) {
        this.d = rhh0Var;
    }

    @Override // xsna.kid
    public final rhh0 getCallback() {
        return this.d;
    }

    @Override // xsna.kid
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
