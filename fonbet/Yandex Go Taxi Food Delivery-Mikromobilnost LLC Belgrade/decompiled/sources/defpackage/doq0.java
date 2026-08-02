package defpackage;

import com.yandex.android.beacon.SendBeaconDb;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class doq0 implements foq0, jms {
    public static final doq0 a = new doq0();

    public final boolean equals(Object obj) {
        if ((obj instanceof foq0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, 0, SendBeaconDb.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
