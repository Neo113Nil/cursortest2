package xsna;

import android.util.SparseArray;
import com.vk.core.preference.Preference;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class aef implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ aef(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
                SparseArray sparseArray = new SparseArray();
                com.vk.clips.upload.vk.impl.uploader.c.e.b(new zdf(sparseArray, 0));
                zik0.e(sparseArray, com.vk.clips.upload.vk.impl.uploader.c.d);
                return com.vk.clips.upload.vk.impl.uploader.c.e(com.vk.clips.upload.vk.impl.uploader.c.f(sparseArray, com.vk.clips.upload.vk.impl.uploader.c.c.clone()));
            case 1:
                Random random = txz.c;
                try {
                    String string = Preference.l().getString("pref_last_known_location_json", "");
                    if (string != null) {
                        return string.length() > 0 ? new JSONObject(string) : txz.c("2");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } catch (Exception unused) {
                    return txz.c("2");
                }
            default:
                return Thread.currentThread();
        }
    }
}
