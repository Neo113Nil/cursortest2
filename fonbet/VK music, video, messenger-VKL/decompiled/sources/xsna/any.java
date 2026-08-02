package xsna;

import com.vk.core.preference.Preference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class any implements wmy {
    @Override // xsna.wmy
    public final void a(xmy xmyVar, xmy xmyVar2) {
        String str;
        bny.a.getClass();
        ((cny) bny.f.getValue()).getClass();
        if (xmyVar == null || (str = xmyVar.getName()) == null) {
            str = "";
        }
        Preference.H("__launcher_icon_change__", "__from_launcher_name__", str);
        Preference.H("__launcher_icon_change__", "__to_launcher_name__", xmyVar2.getName());
    }
}
