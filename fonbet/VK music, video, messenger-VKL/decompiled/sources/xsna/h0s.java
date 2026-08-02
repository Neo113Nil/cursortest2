package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.FolderType;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: FolderTypeObserverImpl.kt */
/* loaded from: classes18.dex */
public final class h0s implements g0s {
    public final io.reactivex.rxjava3.core.w a = asu0.a.c();

    @Override // xsna.g0s
    public final io.reactivex.rxjava3.core.q<Boolean> a(FolderType folderType) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a = i2w.a().l.a();
        io.reactivex.rxjava3.core.w wVar = this.a;
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(a.a0(wVar).r0(wVar), new np1(new c4r(1), 17)), new ox0(new bp7(12, this, folderType), 17)).o0(i2w.a().C(this, new jqm(Source.CACHE)).l(new ft0(new srg(folderType, 14), 23)));
        o0.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        da daVar = new da(new b1a(18, this, folderType), 28);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return yVar.E(daVar, lVar, kVar, kVar);
    }
}
