package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ty1 extends i {
    private static final long serialVersionUID = 0;
    public transient c63 h;

    public ty1(Map map, py1 py1Var) {
        super(map);
        this.h = (c63) oh2.a(py1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.h = (c63) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f = map;
        this.g = 0;
        for (Collection collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.g = collection.size() + this.g;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.h);
        objectOutputStream.writeObject(this.f);
    }
}
