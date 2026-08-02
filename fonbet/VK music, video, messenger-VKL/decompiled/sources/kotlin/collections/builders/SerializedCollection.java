package kotlin.collections.builders;

import io.jsonwebtoken.JwtParser;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.uqi;

/* compiled from: ListBuilder.kt */
/* loaded from: classes8.dex */
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public SerializedCollection() {
        this(0, EmptyList.b);
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection<?> g;
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(uqi.a("Unsupported flags value: ", readByte, JwtParser.SEPARATOR_CHAR));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(uqi.a("Illegal size value: ", readInt, JwtParser.SEPARATOR_CHAR));
        }
        int i2 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(readInt);
            while (i2 < readInt) {
                listBuilder.add(objectInput.readObject());
                i2++;
            }
            g = listBuilder.g();
        } else {
            if (i != 1) {
                throw new InvalidObjectException(uqi.a("Unsupported collection type tag: ", i, JwtParser.SEPARATOR_CHAR));
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(readInt));
            while (i2 < readInt) {
                setBuilder.add(objectInput.readObject());
                i2++;
            }
            g = setBuilder.d();
        }
        this.collection = g;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public SerializedCollection(int i, Collection collection) {
        this.collection = collection;
        this.tag = i;
    }
}
