package defpackage;

import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class k4v0 {
    public static i4v0 a(Action action, zzs zzsVar, u6r u6rVar) {
        switch (j4v0.a[action.ordinal()]) {
            case 1:
                i4v0 i4v0Var = i4v0.j;
                return sms.g(zzsVar, u6rVar.n, null, false, 12);
            case 2:
                return i4v0.j;
            case 3:
                return new i4v0("redirect", zzsVar, null, null, null, null, null, false, false, 508);
            case 4:
                i4v0 i4v0Var2 = i4v0.j;
                return sms.c(zzsVar);
            case 5:
                return i4v0.j;
            case 6:
                return new i4v0("pickup_by_photo", null, null, null, null, null, null, false, false, 508);
            default:
                w511.b();
                return null;
        }
    }
}
