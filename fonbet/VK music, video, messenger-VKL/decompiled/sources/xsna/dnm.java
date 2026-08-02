package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;
import com.vk.im.engine.models.InfoBar;
import java.util.HashMap;

/* compiled from: DialogsCommonStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class dnm {
    public final tgl0 a;
    public final DialogWeightDb b;

    public dnm(tgl0 tgl0Var, DialogWeightDb dialogWeightDb) {
        this.a = tgl0Var;
        this.b = dialogWeightDb;
    }

    public final Boolean a() {
        return this.a.I0().k().c("dialogs_delete_for_all_flag");
    }

    public final InfoBar b() {
        byte[] b = this.a.I0().k().b("dialogs_list_info_bar");
        if (b == null) {
            return null;
        }
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        return (InfoBar) Serializer.b.a(b, InfoBar.class.getClassLoader());
    }

    public final boolean c() {
        return this.a.I0().k().getBoolean("dialogs_list_info_bar_hidden_locally", false);
    }

    public final void d(InfoBar infoBar) {
        tgl0 tgl0Var = this.a;
        if (infoBar == null) {
            tgl0Var.I0().k().delete("dialogs_list_info_bar");
            return;
        }
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        tgl0Var.I0().k().k(Serializer.b.e(infoBar), "dialogs_list_info_bar");
    }

    public final void e(boolean z) {
        this.a.I0().k().putBoolean("dialogs_list_info_bar_hidden_locally", z);
    }
}
