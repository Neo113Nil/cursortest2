package xsna;

import android.content.Context;
import com.vk.search.params.api.domain.model.SearchLocation;
import kotlin.LazyThreadSafetyMode;
import xsna.jyz;

/* compiled from: SearchLocationParameterInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class dwh0 implements cwh0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new f84(18));

    @Override // xsna.cwh0
    public final j6a a(izs izsVar) {
        return new j6a(izsVar, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cwh0
    public final sh90 b(Context context, String str, SearchLocation searchLocation) {
        jyz.a aVar;
        if (((Boolean) this.a.getValue()).booleanValue()) {
            jyz.b bVar = new jyz.b(context, false);
            bVar.i = searchLocation;
            bVar.h = str;
            aVar = bVar;
        } else {
            jyz.a aVar2 = new jyz.a(context);
            aVar2.f = searchLocation;
            aVar2.e = str;
            aVar = aVar2;
        }
        return new sh90(aVar);
    }
}
