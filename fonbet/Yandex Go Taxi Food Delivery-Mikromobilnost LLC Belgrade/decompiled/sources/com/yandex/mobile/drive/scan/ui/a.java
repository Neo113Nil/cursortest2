package com.yandex.mobile.drive.scan.ui;

import com.yandex.mobile.drive.scan.tools.ScanReporter;
import defpackage.dn31;
import defpackage.e9e;
import defpackage.ike;
import defpackage.in31;
import defpackage.oyr;
import defpackage.tje;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class a implements e9e {
    public final ScanMeta a;
    public final /* synthetic */ b b;

    public a(b bVar, ScanMeta scanMeta) {
        this.b = bVar;
        this.a = scanMeta;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        String str;
        in31 in31Var = (in31) obj;
        if (in31Var instanceof dn31) {
            dn31 dn31Var = (dn31) in31Var;
            int i = dn31Var.c;
            boolean z = i != 0;
            b bVar = this.b;
            if (!z) {
                ike ikeVar = bVar.o;
                if (ikeVar != null) {
                    tje.N(ikeVar, null, null, new ScanPresenter$VideoSavedConsumer$accept$1(in31Var, bVar, null), 3);
                    return;
                }
                return;
            }
            ScanReporter scanReporter = bVar.m;
            String mode = this.a.getMode();
            switch (i) {
                case 0:
                    str = "ERROR_NONE";
                    break;
                case 1:
                    str = "ERROR_UNKNOWN";
                    break;
                case 2:
                    str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                    break;
                case 3:
                    str = "ERROR_INSUFFICIENT_STORAGE";
                    break;
                case 4:
                    str = "ERROR_SOURCE_INACTIVE";
                    break;
                case 5:
                    str = "ERROR_INVALID_OUTPUT_OPTIONS";
                    break;
                case 6:
                    str = "ERROR_ENCODING_FAILED";
                    break;
                case 7:
                    str = "ERROR_RECORDER_ERROR";
                    break;
                case 8:
                    str = "ERROR_NO_VALID_DATA";
                    break;
                case 9:
                    str = "ERROR_DURATION_LIMIT_REACHED";
                    break;
                case 10:
                    str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                    break;
                default:
                    str = oyr.j(i, "Unknown(", Extension.C_BRAKE);
                    break;
            }
            scanReporter.b(mode, str, dn31Var.d);
        }
    }
}
