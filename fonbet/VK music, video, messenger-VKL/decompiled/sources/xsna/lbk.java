package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: CreationContextStatProvider.kt */
/* loaded from: classes.dex */
public interface lbk {
    void a(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, int i, boolean z);

    MobileOfficialAppsClipsStat$ClipsCreateContext b();

    kbk getContext();

    void i();

    void j(kbk kbkVar);

    default void c(ArrayList arrayList) {
    }

    default void d(List<String> list) {
    }

    default void e(String str) {
    }

    default void f(LinkedHashMap linkedHashMap) {
    }

    default void g(String str) {
    }
}
