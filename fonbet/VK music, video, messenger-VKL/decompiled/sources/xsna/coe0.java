package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: QrSelectorHelper.kt */
/* loaded from: classes.dex */
public final class coe0 implements w8i {
    public static boolean c;
    public static final coe0 b = new coe0();
    public static final Object d = msy.a(LazyThreadSafetyMode.NONE, new xb3(10));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean a() {
        List<com.vk.superapp.multiaccount.api.f> d2 = ((com.vk.superapp.multiaccount.api.d) d.getValue()).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            AccountProfileType b2 = ((com.vk.superapp.multiaccount.api.f) obj).a().b();
            b2.getClass();
            if (b2 == AccountProfileType.NORMAL) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }
}
