package defpackage;

import com.yandex.go.taxi.order.cancel.a;
import com.yandex.go.taxi.order.details.v2.domain.a11y.d;
import java.util.Set;
import java.util.function.BiFunction;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final /* synthetic */ class pw7 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return (l8x) ((a) obj3).invoke(obj, obj2);
            case 1:
                mxe mxeVar = (mxe) obj;
                mxe mxeVar2 = (mxe) obj2;
                ((kxe) obj3).getClass();
                return Boolean.valueOf(mxeVar == mxeVar2);
            case 2:
                return (DriveState) ((a6n) obj3).invoke(obj, obj2);
            case 3:
                ((bns) obj3).invoke(obj, (Throwable) obj2);
                return zy11.a;
            case 4:
                ((gs10) obj3).getClass();
                return Boolean.valueOf(((jv10) obj).a == ((jv10) obj2).a);
            case 5:
                return (sva0) ((eye) obj3).invoke(obj, obj2);
            case 6:
                return (sva0) ((wzr) obj3).invoke(obj, obj2);
            case 7:
                return (sva0) ((sc20) obj3).invoke(obj, obj2);
            case 8:
                return (sva0) ((g990) obj3).invoke(obj, obj2);
            case 9:
                return (sva0) ((ot6) obj3).invoke(obj, obj2);
            case 10:
                return (sva0) ((ot6) obj3).invoke(obj, obj2);
            case 11:
                return (sva0) ((ot6) obj3).invoke(obj, obj2);
            case 12:
                return (sva0) ((g990) obj3).invoke(obj, obj2);
            case 13:
                return (l8x) ((d) obj3).invoke(obj, obj2);
            case 14:
                return (Set) ((jiz0) obj3).invoke(obj, obj2);
            case 15:
                return (Set) ((i7a0) obj3).invoke(obj, obj2);
            case 16:
                return (Set) ((qpm0) obj3).invoke(obj, obj2);
            case 17:
                return (Set) ((qpm0) obj3).invoke(obj, obj2);
            case 18:
                return (Set) ((jiz0) obj3).invoke(obj, obj2);
            default:
                return (Boolean) ((wls) obj3).invoke(obj, obj2);
        }
    }
}
