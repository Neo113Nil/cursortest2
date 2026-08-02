package defpackage;

import com.yandex.xplat.common.FileSystemError;
import java.io.File;
import kotlin.io.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final /* synthetic */ class obh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ obh(wwf wwfVar, String str, String str2, egz egzVar) {
        this.a = 0;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tyj0 tyj0Var;
        String str;
        String str2;
        int i = this.a;
        String str3 = this.c;
        String str4 = this.b;
        switch (i) {
            case 0:
                File file = new File(str4);
                File file2 = new File(str3);
                try {
                    if (!file.exists()) {
                        tyj0Var = new tyj0(null, new FileSystemError("File item is missing at path: '" + str4 + "'", null));
                    } else if (!file2.exists() || file2.delete()) {
                        FileSystemError a = wwf.a(str3);
                        if (a != null) {
                            tyj0Var = new tyj0(null, a);
                        } else {
                            if (!file.renameTo(file2)) {
                                if (!b.j(file, file2)) {
                                    tyj0Var = new tyj0(null, new FileSystemError("Received unexpected error when accessing file item at path: '" + str4 + "'", null));
                                } else if (!b.l(file)) {
                                    tyj0Var = new tyj0(null, new FileSystemError("Received unexpected error when accessing file item at path: '" + str4 + "'", null));
                                }
                            }
                            tyj0Var = new tyj0(zy11.a, null);
                        }
                    } else {
                        tyj0Var = new tyj0(null, new FileSystemError("Received unexpected error when accessing file item at path: '" + str3 + "'", null));
                    }
                    return tyj0Var;
                } catch (Throwable th) {
                    try {
                        b.l(file2);
                    } catch (Throwable unused) {
                    }
                    return new tyj0(null, new FileSystemError(oyr.p("Received unexpected error when accessing file item at path: '", str3, "'"), th));
                }
            case 1:
                str = "Unsupported section receiver: ";
                str2 = Extension.FIX_SPACE;
                break;
            default:
                str = "No tariff with class: ";
                str2 = " found in zone: ";
                break;
        }
        return b64.l(str, str4, str2, str3);
    }

    public /* synthetic */ obh(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
