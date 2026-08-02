package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xxk implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Character.isDigit(((Character) obj).charValue());
            default:
                int i = ((u1c0) obj).c;
                return i == 93 || i == 248 || i == 314;
        }
    }
}
