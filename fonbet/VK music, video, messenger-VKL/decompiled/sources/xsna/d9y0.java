package xsna;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: BaseProxy.java */
/* loaded from: classes12.dex */
public class d9y0 implements IInterface {
    public final IBinder a;

    public d9y0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
