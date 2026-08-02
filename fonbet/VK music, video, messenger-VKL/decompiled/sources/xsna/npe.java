package xsna;

import android.content.SharedPreferences;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class npe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ npe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ClipsPersistentStore clipsPersistentStore = (ClipsPersistentStore) this.c;
                List<ClipsPersistentStore.PersistedUpload> list = (List) obj;
                synchronized (clipsPersistentStore) {
                    for (ClipsPersistentStore.PersistedUpload persistedUpload : list) {
                        clipsPersistentStore.a.put(persistedUpload.Bb(), persistedUpload);
                    }
                }
                return s3q0.a;
            case 1:
                x660 x660Var = (x660) this.c;
                List list2 = (List) obj;
                Boolean bool = (Boolean) j5g.b0(0, list2);
                Boolean bool2 = (Boolean) j5g.b0(1, list2);
                if (epx.f(bool, Boolean.TRUE) && epx.f(bool2, Boolean.FALSE)) {
                    synchronized (x660Var) {
                        synchronized (x660Var) {
                        }
                        synchronized (x660Var) {
                            synchronized (x660Var) {
                            }
                        }
                        ((SharedPreferences) x660Var.h.getValue()).edit().clear().apply();
                    }
                    synchronized (x660Var) {
                    }
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((gy90) obj).a((String[]) this.c));
        }
    }
}
