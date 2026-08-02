package defpackage;

import com.yandex.go.design.compose.badge.BadgeSize;

/* loaded from: classes12.dex */
public final class hya implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BadgeSize b;
    public final /* synthetic */ String c;

    public /* synthetic */ hya(BadgeSize badgeSize, String str, int i) {
        this.a = i;
        this.b = badgeSize;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
    @Override // defpackage.zls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        int i;
        ety0 ety0Var;
        float f2;
        int i2;
        ety0 ety0Var2;
        float f3;
        int i3;
        ety0 ety0Var3;
        int i4 = this.a;
        zy11 zy11Var = zy11.a;
        BadgeSize badgeSize = this.b;
        c530 c530Var = c530.a;
        switch (i4) {
            case 0:
                yl4 yl4Var = (yl4) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(yl4Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    tx4 e = xya1.e(btsVar);
                    int i5 = eya.a[badgeSize.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            f = 0.5f;
                            f530 f4 = sm91.f(c530Var, 0.0f, f, 1);
                            i = fya.a[((BadgeSize) yl4Var.a.getValue()).ordinal()];
                            if (i != 1) {
                                ety0Var = e.i.b;
                            } else if (i == 2) {
                                ety0Var = e.h.b;
                            } else if (i == 3) {
                                ety0Var = e.g.c;
                            } else {
                                w511.b();
                            }
                            jeb1.f(this.c, f4, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var, btsVar, 0, 48, 14204);
                            break;
                        } else if (i5 != 3) {
                            w511.b();
                            break;
                        }
                    }
                    f = 0.0f;
                    f530 f42 = sm91.f(c530Var, 0.0f, f, 1);
                    i = fya.a[((BadgeSize) yl4Var.a.getValue()).ordinal()];
                    if (i != 1) {
                    }
                    jeb1.f(this.c, f42, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var, btsVar, 0, 48, 14204);
                }
            case 1:
                yl4 yl4Var2 = (yl4) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(yl4Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    tx4 e2 = xya1.e(btsVar2);
                    int i6 = jed.a[badgeSize.ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            f2 = 0.5f;
                            f530 f5 = sm91.f(c530Var, 0.0f, f2, 1);
                            i2 = ked.a[((BadgeSize) yl4Var2.a.getValue()).ordinal()];
                            if (i2 != 1) {
                                ety0Var2 = e2.i.b;
                            } else if (i2 == 2) {
                                ety0Var2 = e2.h.b;
                            } else if (i2 == 3) {
                                ety0Var2 = e2.g.c;
                            } else {
                                w511.b();
                            }
                            jeb1.f(this.c, f5, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var2, btsVar2, 0, 48, 14204);
                            break;
                        } else if (i6 != 3) {
                            w511.b();
                            break;
                        }
                    }
                    f2 = 0.0f;
                    f530 f52 = sm91.f(c530Var, 0.0f, f2, 1);
                    i2 = ked.a[((BadgeSize) yl4Var2.a.getValue()).ordinal()];
                    if (i2 != 1) {
                    }
                    jeb1.f(this.c, f52, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var2, btsVar2, 0, 48, 14204);
                }
            default:
                yl4 yl4Var3 = (yl4) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(yl4Var3) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    tx4 e3 = xya1.e(btsVar3);
                    int i7 = oij0.a[badgeSize.ordinal()];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            f3 = 0.5f;
                            f530 f6 = sm91.f(c530Var, 0.0f, f3, 1);
                            i3 = pij0.a[((BadgeSize) yl4Var3.a.getValue()).ordinal()];
                            if (i3 != 1) {
                                ety0Var3 = e3.i.b;
                            } else if (i3 == 2) {
                                ety0Var3 = e3.h.b;
                            } else if (i3 == 3) {
                                ety0Var3 = e3.g.c;
                            } else {
                                w511.b();
                            }
                            jeb1.f(this.c, f6, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var3, btsVar3, 0, 48, 14204);
                            break;
                        } else if (i7 != 3) {
                            w511.b();
                            break;
                        }
                    }
                    f3 = 0.0f;
                    f530 f62 = sm91.f(c530Var, 0.0f, f3, 1);
                    i3 = pij0.a[((BadgeSize) yl4Var3.a.getValue()).ordinal()];
                    if (i3 != 1) {
                    }
                    jeb1.f(this.c, f62, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, ety0Var3, btsVar3, 0, 48, 14204);
                }
        }
        return zy11Var;
    }
}
