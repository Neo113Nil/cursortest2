package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.m6w;

/* compiled from: ImItemListMviReducer.kt */
/* loaded from: classes2.dex */
public final class n6w implements bm50<o6w, m6w> {
    @Override // xsna.bm50
    public final o6w a(o6w o6wVar, m6w m6wVar) {
        o6w o6wVar2 = o6wVar;
        m6w m6wVar2 = m6wVar;
        if (m6wVar2 instanceof m6w.b) {
            return o6w.a(o6wVar2, ((m6w.b) m6wVar2).a, null, null, null, 0, 61);
        }
        if (m6wVar2 instanceof m6w.d) {
            return o6w.a(o6wVar2, null, ((m6w.d) m6wVar2).a, null, null, 0, 59);
        }
        if (m6wVar2 instanceof m6w.c) {
            return o6w.a(o6wVar2, null, null, ((m6w.c) m6wVar2).a, null, 0, 55);
        }
        if (m6wVar2 instanceof m6w.e) {
            return o6w.a(o6wVar2, null, null, null, ((m6w.e) m6wVar2).a, 0, 47);
        }
        if (m6wVar2 instanceof m6w.a) {
            return o6w.a(o6wVar2, null, null, null, null, o6wVar2.g + 1, 31);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(m6w m6wVar) {
        return true;
    }
}
