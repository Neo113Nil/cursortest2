package xsna;

import android.content.Context;
import com.vk.auth.main.LibverifyFactorsForKazakhstan;
import com.vk.auth.main.LibverifyListener;
import com.vk.auth.main.LibverifyVerificationSource;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import java.util.List;

/* compiled from: LibverifyControllerProvider.kt */
/* loaded from: classes15.dex */
public interface d3z {
    int a();

    void b(String str);

    void c(e7 e7Var);

    void d(String str, String str2, boolean z, List<? extends LibverifyValidationType> list, LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan, boolean z2);

    void e();

    LibverifyVerificationSource f();

    void g();

    boolean h(String str);

    void i(LibverifyListener libverifyListener);

    void j(String str);

    void k(Context context, boolean z);

    String l();

    void m();

    void n();

    void o();

    void onCancel();
}
