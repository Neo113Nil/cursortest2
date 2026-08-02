package xsna;

import android.os.Parcelable;
import androidx.preference.Preference;
import com.vk.superapp.api.dto.menu.QueueParams;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class a5l implements Preference.c {
    @Override // androidx.preference.Preference.c
    public final boolean eh(Preference preference) {
        io.reactivex.rxjava3.disposables.c cVar = k720.A;
        if (cVar != null) {
            cVar.dispose();
        }
        k720.A = null;
        io.reactivex.rxjava3.disposables.c cVar2 = k720.C;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = k720.D;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        wmi0.a.c("key_supper_app_menu_cache_serialization");
        k720 k720Var = k720.a;
        io.reactivex.rxjava3.subjects.d<QueueParams> dVar = k720.T;
        Parcelable.Creator<QueueParams> creator = QueueParams.CREATOR;
        dVar.onNext(QueueParams.a.a());
        k720.H();
        ((ke80) k720.q.getValue()).drop();
        k720.X(null);
        k720.Y(null);
        pro0.f(new y620(false, 0));
        k720.M.onNext(s3q0.a);
        cvk.w("Кеш СуперАпп меню сброшен", false);
        return true;
    }
}
