package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import com.vk.biometrics.lock.impl.presentation.view.BiometricsPinLockActivity;
import java.util.ArrayList;
import xsna.vnv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y57 implements io.reactivex.rxjava3.core.a0 {
    public static String a(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static ArrayList b(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static vnv c(Parcel parcel) {
        vnv f = vnv.a.f(parcel.readStrongBinder());
        parcel.recycle();
        return f;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            return;
        }
        b.startActivity(new Intent(b, (Class<?>) BiometricsPinLockActivity.class).addFlags(537067520));
    }
}
