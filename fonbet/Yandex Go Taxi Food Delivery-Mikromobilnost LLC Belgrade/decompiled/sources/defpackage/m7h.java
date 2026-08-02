package defpackage;

import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes.dex */
public final class m7h implements qc7 {
    public static final Set b = j73.f0(new Integer[]{300, Integer.valueOf(IDialogId.DIALOG_PIN_WND_IDD_PASSWORD), 404, 405, 410, 414, Integer.valueOf(RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND)});

    @Override // defpackage.qc7
    public final Object a(oz50 oz50Var, iz50 iz50Var, lg70 lg70Var, ContinuationImpl continuationImpl) {
        return new oc7(oz50Var);
    }

    @Override // defpackage.qc7
    public final Object b(oz50 oz50Var, iz50 iz50Var, oz50 oz50Var2, lg70 lg70Var, ContinuationImpl continuationImpl) {
        int i = oz50Var2.a;
        if (i != 304 || oz50Var == null) {
            if (200 > i || i >= 300) {
                if (!b.contains(new Integer(i))) {
                    return pc7.b;
                }
            }
            return new pc7(oz50Var2);
        }
        zu50 zu50Var = oz50Var.d;
        zu50 zu50Var2 = oz50Var2.d;
        zu50Var.getClass();
        wu50 wu50Var = new wu50(zu50Var);
        for (Map.Entry entry : zu50Var2.a.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            wu50Var.a.put(str.toLowerCase(Locale.ROOT), new ArrayList(list));
        }
        return new pc7(new oz50(oz50Var2.a, oz50Var2.b, oz50Var2.c, wu50Var.b(), null, oz50Var2.f));
    }
}
