package xsna;

import java.io.ObjectInputStream;
import java.util.List;
import xsna.dx90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class epy implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ epy(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.core.q.O((List) obj);
            case 1:
                ObjectInputStream objectInputStream = (ObjectInputStream) obj;
                int readInt = objectInputStream.readInt();
                return new dx90.c(objectInputStream.readLong(), readInt == 1 ? "" : objectInputStream.readUTF(), readInt != 1 ? objectInputStream.readUTF() : "", objectInputStream.readUTF(), objectInputStream.readUTF(), objectInputStream.readUTF(), objectInputStream.readUTF());
            default:
                return so.a(((zk10) obj).b().get(1), "\"", "\":\"<HIDE>\"");
        }
    }
}
