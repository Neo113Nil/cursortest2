package xsna;

import java.util.List;

/* compiled from: NewsfeedItemModifier.kt */
/* loaded from: classes4.dex */
public interface wm60 {
    default boolean a(wm60 wm60Var) {
        return true;
    }

    default wm60 b(wm60 wm60Var) {
        return (wm60Var == null || !a(wm60Var)) ? this : new aag(wm60Var, this);
    }

    List<u1c0> c(List<? extends u1c0> list, i170 i170Var);
}
