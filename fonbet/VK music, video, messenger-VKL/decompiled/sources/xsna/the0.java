package xsna;

import com.vkontakte.android.VKApplication;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: PushExperimentsRepository.kt */
/* loaded from: classes11.dex */
public final class the0 {
    public final bpn0 a;
    public final bpn0 b = new bpn0(new dia(this, 8));
    public final bpn0 c = new bpn0(new eia(this, 6));

    public the0(VKApplication vKApplication) {
        this.a = new bpn0(new cia(vKApplication, 10));
    }

    public static void a(gzs gzsVar, File file) {
        try {
            if (((Boolean) gzsVar.invoke()).booleanValue()) {
                com.vk.core.files.a.c(file);
            } else {
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
            }
        } catch (Throwable unused) {
        }
    }
}
