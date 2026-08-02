package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.qr60;

/* compiled from: NewsfeedListPagingReducer.kt */
/* loaded from: classes4.dex */
public final class pr60 implements bm50<ur60, qr60.a> {
    public final s1v a;
    public final ryp0 b = new ryp0();

    public pr60(s1v s1vVar, rr60 rr60Var) {
        this.a = s1vVar;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(qr60.a aVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.bm50
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ur60 a(ur60 ur60Var, qr60.a aVar) {
        qtc0 qtc0Var = ur60Var.c;
        if (!rr60.a(ur60Var, aVar)) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return ur60Var;
            }
            L.u(l, L.LogType.d, new Object[]{"Skipping " + aVar});
            return ur60Var;
        }
        boolean z = aVar instanceof qr60.a.g;
        s1v s1vVar = this.a;
        if (z) {
            qr60.a.g gVar = (qr60.a.g) aVar;
            List<ol60> list = gVar.a;
            s1vVar.getClass();
            s1v.l(list);
            return ur60.a(ur60Var, sq60.a(ur60Var.b, gVar.a, null, gVar.b, gVar.d, gVar.e, gVar.f, gVar.g, 2), null, gVar.c, ListLoadingState.IDLE, false, false, 2);
        }
        if (aVar instanceof qr60.a.f) {
            qr60.a.f fVar = (qr60.a.f) aVar;
            List<ol60> list2 = fVar.a;
            s1vVar.getClass();
            s1v.l(list2);
            return ur60.a(ur60Var, sq60.a(ur60Var.b, fVar.a, null, fVar.b, false, false, null, null, 2), null, fVar.c, ListLoadingState.IDLE, false, false, 2);
        }
        if (aVar instanceof qr60.a.e) {
            return ur60.a(ur60Var, null, null, null, ((qr60.a.e) aVar).a, false, false, 55);
        }
        if (aVar instanceof qr60.a.d) {
            return ur60.a(ur60Var, null, null, null, null, ((qr60.a.d) aVar).a, false, 15);
        }
        if (aVar instanceof qr60.a.b) {
            return ur60.a(ur60Var, sq60.a(ur60Var.b, EmptyList.b, null, d9x.a, false, false, null, null, 2), null, null, null, false, true, 14);
        }
        boolean z2 = aVar instanceof qr60.a.c;
        ryp0 ryp0Var = this.b;
        if (!z2) {
            if (aVar instanceof qr60.a.C3569a) {
                Map<Pair<Long, Integer>, Activity> map = ((qr60.a.C3569a) aVar).a;
                if (map.isEmpty()) {
                    return ur60Var;
                }
                LinkedHashMap n = pn00.n(qtc0Var.a, map);
                return ur60.a(ur60Var, sq60.a(ur60Var.b, null, ryp0Var.a(n), null, false, false, null, null, 253), new qtc0(n), null, null, false, false, 60);
            }
            if (!(aVar instanceof qr60.a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMap = ((qr60.a.h) aVar).a;
            sq60 a = sq60.a(ur60Var.b, null, ryp0Var.a(linkedHashMap), null, false, false, null, null, 253);
            qtc0Var.getClass();
            return ur60.a(ur60Var, a, new qtc0(linkedHashMap), null, null, false, false, 60);
        }
        qr60.a.c cVar = (qr60.a.c) aVar;
        Map<Pair<Long, Integer>, Activity> map2 = cVar.d;
        ArrayList arrayList = cVar.a;
        if (map2 != null) {
            qtc0Var = new qtc0(pn00.n(qtc0Var.a, map2));
        }
        s1vVar.getClass();
        s1v.l(arrayList);
        sq60 sq60Var = ur60Var.b;
        ArrayList a2 = ryp0Var.a(qtc0Var.a);
        og50 og50Var = cVar.b;
        boolean z3 = cVar.c;
        sq60Var.getClass();
        return ur60.a(ur60Var, new sq60(arrayList, a2, og50Var, false, z3, false, null, null), qtc0Var, null, null, false, false, 60);
    }
}
