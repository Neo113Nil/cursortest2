package xsna;

import com.google.android.gms.internal.play_billing.zzgr;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.vk.core.utils.newtork.d;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b4q implements b9i, io.reactivex.rxjava3.functions.l {
    public static int a(int i, int i2, int i3) {
        return zzgr.zzz(i) + i2 + i3;
    }

    public static String b(UserId userId, String str) {
        return str + userId;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (d.a) ((com.vk.core.utils.newtork.d) obj);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return ExecutorsRegistrar.c.get();
    }
}
