package xsna;

import java.io.ObjectInputStream;
import xsna.dx90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bx90 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ bx90(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ObjectInputStream objectInputStream = (ObjectInputStream) obj;
                return new dx90.a(objectInputStream.readInt() == 1 ? "" : objectInputStream.readUTF(), objectInputStream.readUTF(), objectInputStream.readUTF());
            default:
                return ((Object) ((zk10) obj).b().get(1)) + ":<HIDE>";
        }
    }
}
