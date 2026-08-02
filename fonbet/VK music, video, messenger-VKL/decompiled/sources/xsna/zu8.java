package xsna;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: CLKey.java */
/* loaded from: classes11.dex */
public final class zu8 extends xu8 {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // xsna.xu8, xsna.yu8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu8) || Objects.equals(i(), ((zu8) obj).i())) {
            return super.equals(obj);
        }
        return false;
    }
}
