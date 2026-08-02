package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import java.util.function.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class er00 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ er00(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                return (CameraPosition) tlsVar.invoke((CameraPosition) obj);
            case 1:
                return (CameraPosition) tlsVar.invoke((CameraPosition) obj);
            default:
                return (g050) tlsVar.invoke(obj);
        }
    }
}
