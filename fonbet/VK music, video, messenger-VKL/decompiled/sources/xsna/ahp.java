package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.mui0;
import xsna.usi0;

/* compiled from: EmptyRepository.kt */
/* loaded from: classes6.dex */
public final class ahp implements mui0, sxi0 {
    @Override // xsna.mui0
    public final UserId a() {
        fhq0 c;
        UserId b;
        usi0.a i = i();
        return (i == null || (c = i.c()) == null || (b = c.b()) == null) ? UserId.d : b;
    }

    @Override // xsna.mui0
    public final boolean b() {
        return fkq0.c(a());
    }

    @Override // xsna.mui0
    public final void c() {
        L.p("EmptySessionsRepository.warmUp");
    }

    @Override // xsna.mui0
    public final ArrayList d() {
        return mui0.a.b(this);
    }

    @Override // xsna.mui0
    public final ArrayList e() {
        return mui0.a.a(this);
    }

    @Override // xsna.mui0
    public final void f(ayi0 ayi0Var) {
        L.p("EmptySessionsRepository.addSessionsObserver");
    }

    @Override // xsna.mui0
    public final List<usi0> g() {
        L.p("EmptySessionsRepository.getSessions");
        return EmptyList.b;
    }

    @Override // xsna.sxi0
    public final void h(usi0.a aVar) {
        L.p("EmptySessionsRepository.removeSession");
    }

    @Override // xsna.mui0
    public final usi0.a i() {
        return (usi0.a) j5g.a0(mui0.a.a(this));
    }

    @Override // xsna.sxi0
    public final void j(usi0.a aVar, usi0.a aVar2) {
        L.p("EmptySessionsRepository.updateSession");
    }

    @Override // xsna.mui0
    public final void k(ayi0 ayi0Var) {
        L.p("EmptySessionsRepository.removeSessionsObserver");
    }

    @Override // xsna.sxi0
    public final void l(usi0 usi0Var) {
        L.p("EmptySessionsRepository.addSession");
    }
}
