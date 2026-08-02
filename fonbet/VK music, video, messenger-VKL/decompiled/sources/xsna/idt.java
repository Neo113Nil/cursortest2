package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jdt;

/* compiled from: GamesCatalogReducer.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class idt extends FunctionReferenceImpl implements izs<jet, jdt.e> {
    @Override // xsna.izs
    public final jdt.e invoke(jet jetVar) {
        ((gdt) this.receiver).getClass();
        v7t v7tVar = jetVar.f;
        jdt.d dVar = new jdt.d(v7tVar.b, v7tVar.c, v7tVar.d, v7tVar.f, v7tVar.g, v7tVar.h);
        List list = v7tVar.a;
        if (list == null) {
            list = EmptyList.b;
        }
        return new jdt.e(dVar, new jdt.b(list));
    }
}
