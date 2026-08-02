package xsna;

import android.text.format.DateUtils;
import com.vk.core.preference.Preference;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w0v implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        k720 k720Var = k720.a;
        return Boolean.valueOf(DateUtils.isToday(Preference.m(0L, "menu_items", (String) k720.e.getValue())));
    }
}
