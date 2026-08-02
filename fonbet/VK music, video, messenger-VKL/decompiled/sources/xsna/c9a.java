package xsna;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c9a implements izs {
    public final /* synthetic */ d9a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ c9a(d9a d9aVar, long j, boolean z) {
        this.b = d9aVar;
        this.c = j;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Good good = (Good) obj;
        this.b.getClass();
        if (good.b == this.c) {
            boolean z = good.J;
            boolean z2 = this.d;
            if (z != z2) {
                Parcel obtain = Parcel.obtain();
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    Serializer.g gVar = new Serializer.g(obtain);
                    gVar.i0(good);
                    obtain.setDataPosition(0);
                    Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                    obtain.recycle();
                    Good good2 = (Good) G;
                    good2.J = z2;
                    return good2;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }
        return good;
    }
}
