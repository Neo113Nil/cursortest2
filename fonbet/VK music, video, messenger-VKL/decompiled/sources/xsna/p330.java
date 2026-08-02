package xsna;

import com.vk.ml.b;
import java.util.LinkedList;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p330 implements izs {
    public final /* synthetic */ com.vk.ml.b b;
    public final /* synthetic */ LinkedList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ izs e;

    public /* synthetic */ p330(com.vk.ml.b bVar, LinkedList linkedList, int i, izs izsVar) {
        this.b = bVar;
        this.c = linkedList;
        this.d = i;
        this.e = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        EmptyList emptyList = EmptyList.b;
        com.vk.ml.b bVar = this.b;
        LinkedList<b.a> linkedList = this.c;
        int i = this.d;
        izs<? super Throwable, s3q0> izsVar = this.e;
        bVar.b(linkedList, emptyList, i, izsVar);
        izsVar.invoke((Throwable) obj);
        return s3q0.a;
    }
}
