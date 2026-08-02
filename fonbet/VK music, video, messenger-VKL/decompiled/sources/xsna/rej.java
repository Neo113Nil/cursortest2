package xsna;

import android.app.Application;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.oxc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rej implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rej(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (com.vk.im.ui.fragments.DialogsFragment.c.a() == false) goto L53;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        b.d i;
        Integer b;
        boolean z = true;
        char c = 1;
        switch (this.b) {
            case 0:
                oxc0.a aVar = (oxc0.a) obj;
                aVar.getClass();
                com.vk.contacts.f fVar = com.vk.contacts.f.a;
                aVar.a = null;
                com.vk.contacts.f fVar2 = com.vk.contacts.f.a;
                aVar.b = com.vk.contacts.f.b();
                ArrayList arrayList = aVar.c;
                oxc0.b.a aVar2 = new oxc0.b.a();
                com.vk.contacts.f fVar3 = com.vk.contacts.f.a;
                aVar2.b = "sync_hq_photos";
                com.vk.contacts.f fVar4 = com.vk.contacts.f.a;
                aVar2.a = "sync_hq_photos";
                arrayList.add(aVar2.a());
                ArrayList arrayList2 = aVar.c;
                oxc0.b.a aVar3 = new oxc0.b.a();
                aVar3.a = (String) new Pair("sync_all", "key_sync_option").i();
                aVar3.b = (String) new Pair("sync_all", "key_sync_option").j();
                aVar3.c = new za3(c == true ? 1 : 0);
                arrayList2.add(aVar3.a());
                ArrayList arrayList3 = aVar.c;
                oxc0.b.a aVar4 = new oxc0.b.a();
                aVar4.a = (String) new Pair("key_sync_option", "key_in_app_permission_granted").i();
                aVar4.b = (String) new Pair("key_sync_option", "key_in_app_permission_granted").j();
                aVar4.c = new sej(0);
                arrayList3.add(aVar4.a());
                return aVar;
            case 1:
                c63 c63Var = c63.a;
                c63.a(new edx((gzs) obj));
                return s3q0.a;
            case 2:
                a1w a1wVar = q1w.a;
                if ((a1wVar != null ? a1wVar : null).r().n0) {
                    boolean z2 = DialogsFragment.u0;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                mgn0 mgn0Var = wgn0.a;
                if (mgn0Var == null) {
                    mgn0Var = null;
                }
                Application application = mgn0Var.a;
                try {
                    SakFeatures.a aVar5 = SakFeatures.b;
                    aVar5.getClass();
                    if (SakFeatures.c == null) {
                        aVar5 = null;
                    }
                    ToggleManager toggleManager = aVar5 != null ? SakFeatures.c : null;
                    int intValue = (toggleManager == null || (i = toggleManager.i(SakFeatures.Type.SAK_COROUTINES_MIGRATION)) == null || (b = i.b()) == null) ? 0 : b.intValue();
                    File file = new File(application.getFilesDir(), "sak_use_coroutine_executors");
                    if (intValue > 0) {
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            for (File file2 : listFiles) {
                                file2.delete();
                            }
                        }
                        new File(file, String.valueOf(intValue)).createNewFile();
                    } else if (file.exists()) {
                        nbr.l(file);
                    }
                } catch (Exception e) {
                    par0.a.getClass();
                    par0.c("SakExecutorConfigRepository: persistConfig was failed", e);
                }
                return s3q0.a;
            default:
                return ToggleManager.DevicePerformanceClass.UNKNOWN;
        }
    }
}
