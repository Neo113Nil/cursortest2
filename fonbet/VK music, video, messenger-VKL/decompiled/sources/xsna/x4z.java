package xsna;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import java.util.List;
import kotlin.Result;
import xsna.v1h0;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class x4z implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0047, code lost:
    
        if ((r4 instanceof android.os.Parcelable) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object failure;
        Throwable a;
        Parcelable parcelable;
        quk0<State> quk0Var;
        Bundle bundle;
        Object parcelable2;
        switch (this.b) {
            case 0:
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) obj;
                final z4z z4zVar = (z4z) this.c;
                Bundle arguments = z4zVar.c.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                Object obj2 = null;
                try {
                    bundle = (Bundle) wVar.a("state");
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (bundle != null) {
                    if (Build.VERSION.SDK_INT < 33) {
                        failure = bundle.getParcelable("state");
                        break;
                    } else {
                        parcelable2 = bundle.getParcelable("state", Parcelable.class);
                        failure = (Parcelable) parcelable2;
                    }
                    a = Result.a(failure);
                    if (a != null) {
                        try {
                            if (!(a instanceof Serializer.DeserializationError) && !(a instanceof BadParcelableException)) {
                                throw a;
                            }
                            L.i(a);
                            failure = null;
                        } catch (Throwable th2) {
                            failure = new Result.Failure(th2);
                        }
                    }
                    kotlin.a.a(failure);
                    parcelable = (Parcelable) failure;
                    if (parcelable != null && (quk0Var = z4zVar.e) != 0) {
                        obj2 = quk0Var.sf(parcelable);
                    }
                    g4z g4zVar = (g4z) z4zVar.d.invoke(arguments, obj2);
                    wVar.a.b.put("state", new v1h0.b() { // from class: xsna.w4z
                        @Override // xsna.v1h0.b
                        public final Bundle r() {
                            Bundle bundle2 = new Bundle();
                            quk0<State> quk0Var2 = z4z.this.e;
                            bundle2.putParcelable("state", quk0Var2 != 0 ? quk0Var2.vb() : null);
                            return bundle2;
                        }
                    });
                    return new xk50(g4zVar);
                }
                failure = null;
                a = Result.a(failure);
                if (a != null) {
                }
                kotlin.a.a(failure);
                parcelable = (Parcelable) failure;
                if (parcelable != null) {
                    obj2 = quk0Var.sf(parcelable);
                }
                g4z g4zVar2 = (g4z) z4zVar.d.invoke(arguments, obj2);
                wVar.a.b.put("state", new v1h0.b() { // from class: xsna.w4z
                    @Override // xsna.v1h0.b
                    public final Bundle r() {
                        Bundle bundle2 = new Bundle();
                        quk0<State> quk0Var2 = z4z.this.e;
                        bundle2.putParcelable("state", quk0Var2 != 0 ? quk0Var2.vb() : null);
                        return bundle2;
                    }
                });
                return new xk50(g4zVar2);
            default:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
        }
    }
}
