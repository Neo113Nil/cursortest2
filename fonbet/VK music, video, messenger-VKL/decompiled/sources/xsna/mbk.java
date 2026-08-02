package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: CreationContextStatProviderImpl.kt */
/* loaded from: classes.dex */
public final class mbk implements lbk {
    public kbk a;

    @Override // xsna.lbk
    public final void a(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, int i, boolean z) {
        j(new kbk(creationEntryPoint, i, z));
    }

    @Override // xsna.lbk
    public final MobileOfficialAppsClipsStat$ClipsCreateContext b() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        kbk kbkVar = this.a;
        int c = kbkVar != null ? kbkVar.c() : -1;
        kbk kbkVar2 = this.a;
        if (kbkVar2 == null || (creationEntryPoint = kbkVar2.b()) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        return new MobileOfficialAppsClipsStat$ClipsCreateContext(c, creationEntryPoint);
    }

    @Override // xsna.lbk
    public final void c(ArrayList arrayList) {
        hti0.d().addAll(arrayList);
    }

    @Override // xsna.lbk
    public final void d(List<String> list) {
        hti0.c().addAll(list);
    }

    @Override // xsna.lbk
    public final void e(String str) {
        hti0.h(str);
    }

    @Override // xsna.lbk
    public final void f(LinkedHashMap linkedHashMap) {
        hti0.i(linkedHashMap);
    }

    @Override // xsna.lbk
    public final void g(String str) {
        hti0.g(str);
    }

    @Override // xsna.lbk
    public final kbk getContext() {
        return this.a;
    }

    @Override // xsna.lbk
    public final void i() {
        this.a = null;
    }

    @Override // xsna.lbk
    public final void j(kbk kbkVar) {
        this.a = kbkVar;
        ArrayList<String> arrayList = hti0.a;
        hti0.f(kbkVar.c());
    }
}
