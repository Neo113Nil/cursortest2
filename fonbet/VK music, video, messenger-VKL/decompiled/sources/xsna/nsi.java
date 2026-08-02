package xsna;

import android.os.Parcel;
import android.util.Base64;
import com.vk.log.L;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nsi implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nsi(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r8 == null) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.b) {
            case 0:
                List<q93> list = (List) this.c;
                tw8 tw8Var = (tw8) this.d;
                for (q93 q93Var : list) {
                    if (!q93Var.c) {
                        fwk fwkVar = (fwk) tw8Var.b;
                        fwkVar.getClass();
                        String str = q93Var.a;
                        boolean z = false;
                        Parcel parcel = null;
                        try {
                            try {
                                parcel = Parcel.obtain();
                                parcel.writeParcelable(q93Var.b, 0);
                                L.e("AppStateCache", "PUT store: " + str + " - " + parcel.dataSize() + " bytes");
                                z = fwkVar.h(str, Base64.encodeToString(parcel.marshall(), 0));
                            } catch (Exception e) {
                                LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
                                com.vk.core.util.state.a.a("PUT store: can't put uid=" + str + ", error=" + e);
                                break;
                            }
                            parcel.recycle();
                            q93Var.c = z;
                        } catch (Throwable th) {
                            if (parcel != null) {
                                parcel.recycle();
                            }
                            throw th;
                        }
                    }
                }
                return;
            default:
                ((com.my.tracker.obfuscated.w2) this.c).a((Runnable) this.d);
                return;
        }
    }
}
