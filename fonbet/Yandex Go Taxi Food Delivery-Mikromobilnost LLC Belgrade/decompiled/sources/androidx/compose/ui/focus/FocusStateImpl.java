package androidx.compose.ui.focus;

import defpackage.ivr;
import defpackage.jvr;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "Livr;", "", CA20Status.STATUS_USER_DESCRIPTION_A, "ActiveParent", "Captured", CA20Status.STATUS_USER_DESCRIPTION_I, "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusStateImpl implements ivr {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active;
    public static final FocusStateImpl ActiveParent;
    public static final FocusStateImpl Captured;
    public static final FocusStateImpl Inactive;

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl(CA20Status.STATUS_USER_DESCRIPTION_A, 0);
        Active = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        ActiveParent = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        Captured = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl(CA20Status.STATUS_USER_DESCRIPTION_I, 3);
        Inactive = focusStateImpl4;
        FocusStateImpl[] focusStateImplArr = {focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
        $VALUES = focusStateImplArr;
        $ENTRIES = kotlin.enums.a.a(focusStateImplArr);
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    public final boolean a() {
        int i = jvr.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        w511.b();
        return false;
    }

    public final boolean b() {
        int i = jvr.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        w511.b();
        return false;
    }
}
