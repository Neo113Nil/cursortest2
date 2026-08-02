package defpackage;

import com.yandex.div2.DivActionSetStoredValue$Scope;

/* loaded from: classes11.dex */
public final class a9k {
    public static DivActionSetStoredValue$Scope a(String str) {
        String str2;
        String str3;
        DivActionSetStoredValue$Scope divActionSetStoredValue$Scope = DivActionSetStoredValue$Scope.GLOBAL;
        str2 = divActionSetStoredValue$Scope.value;
        if (jl40.l(str, str2)) {
            return divActionSetStoredValue$Scope;
        }
        DivActionSetStoredValue$Scope divActionSetStoredValue$Scope2 = DivActionSetStoredValue$Scope.CARD;
        str3 = divActionSetStoredValue$Scope2.value;
        if (jl40.l(str, str3)) {
            return divActionSetStoredValue$Scope2;
        }
        return null;
    }
}
