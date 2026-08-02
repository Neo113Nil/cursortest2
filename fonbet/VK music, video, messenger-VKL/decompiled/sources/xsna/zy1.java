package xsna;

import xsna.frz;

/* compiled from: AnchorCalculator.kt */
/* loaded from: classes3.dex */
public interface zy1<Data extends frz, Anchor> {
    default boolean D(Anchor anchor) {
        return false;
    }

    Anchor n(Data data);
}
