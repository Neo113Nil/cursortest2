package androidx.sqlite.driver;

import defpackage.evu0;
import defpackage.hkw0;
import defpackage.jl40;
import defpackage.okw0;
import defpackage.oll0;
import defpackage.pkw0;
import defpackage.ull0;
import defpackage.vez0;
import defpackage.x4c;
import java.util.Locale;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;

/* loaded from: classes.dex */
public final class a implements oll0 {
    public final hkw0 a;

    public a(hkw0 hkw0Var) {
        this.a = hkw0Var;
    }

    @Override // defpackage.oll0
    public final boolean A() {
        return this.a.A();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b8, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c4, code lost:
    
        r4 = androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation.END;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c1, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.oll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ull0 T0(String str) {
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation;
        int i;
        hkw0 hkw0Var = this.a;
        x4c x4cVar = null;
        if (!hkw0Var.isOpen()) {
            vez0.Y(21, "connection is closed");
            throw null;
        }
        String upperCase = evu0.k0(str).toString().toUpperCase(Locale.ROOT);
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (jl40.q(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = evu0.G(upperCase, '*', i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = evu0.G(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new okw0(hkw0Var, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!evu0.y(upperCase, "EXCLUSIVE", false)) {
                        if (!evu0.y(upperCase, "IMMEDIATE", false)) {
                            supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_DEFERRED;
                            break;
                        } else {
                            supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_IMMEDIATE;
                            break;
                        }
                    } else {
                        supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_EXCLUSIVE;
                        break;
                    }
                }
                supportSQLiteStatement$Companion$TransactionOperation = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !evu0.y(upperCase, " TO ", false)) {
                    supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.ROLLBACK;
                    break;
                }
                supportSQLiteStatement$Companion$TransactionOperation = null;
                break;
            default:
                supportSQLiteStatement$Companion$TransactionOperation = null;
                break;
        }
        if (supportSQLiteStatement$Companion$TransactionOperation != null) {
            return new c(hkw0Var, str, supportSQLiteStatement$Companion$TransactionOperation);
        }
        if (substring.equals(VsidGenerator.PLELOADER_SERVICE_CODE) && evu0.y(evu0.d0(upperCase.toLowerCase(Locale.ROOT), "journal_mode", ""), "=", false)) {
            x4cVar = x4c.U;
        }
        if (x4cVar != null) {
            return new okw0(hkw0Var, str, new pkw0(hkw0Var, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals(VsidGenerator.PLELOADER_SERVICE_CODE) : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new okw0(hkw0Var, str) : new pkw0(hkw0Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
