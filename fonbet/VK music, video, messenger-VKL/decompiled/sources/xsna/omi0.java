package xsna;

import io.jsonwebtoken.JwtParser;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MapBuilder.kt */
/* loaded from: classes8.dex */
public final class omi0 implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public omi0(Map<?, ?> map) {
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(lhg.a(readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(uqi.a("Illegal size value: ", readInt, JwtParser.SEPARATOR_CHAR));
        }
        MapBuilder mapBuilder = new MapBuilder(readInt);
        for (int i = 0; i < readInt; i++) {
            mapBuilder.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = mapBuilder.h();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public omi0() {
        this(jgp.b);
    }
}
