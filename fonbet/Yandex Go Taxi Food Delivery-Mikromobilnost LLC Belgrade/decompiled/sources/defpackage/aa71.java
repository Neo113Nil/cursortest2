package defpackage;

import android.media.Spatializer;

/* loaded from: classes7.dex */
public final /* synthetic */ class aa71 implements ag71 {
    public final /* synthetic */ ba71 a;

    public /* synthetic */ aa71(ba71 ba71Var) {
        this.a = ba71Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r1.equals("audio/ac4") == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:17:0x0056, B:19:0x005a, B:21:0x005e, B:34:0x0062, B:36:0x0066, B:38:0x006a, B:40:0x006e, B:42:0x0078, B:44:0x0084, B:48:0x0092), top: B:3:0x0007 }] */
    @Override // defpackage.ag71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z;
        kzo kzoVar;
        boolean isAvailable;
        boolean isEnabled;
        ba71 ba71Var = this.a;
        qd81 qd81Var = (qd81) obj;
        synchronized (ba71Var.c) {
            try {
                z = true;
                if (ba71Var.f.e0 && !ba71Var.e) {
                    char c = 2;
                    if (qd81Var.R > 2) {
                        String str = qd81Var.E;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (rf71.a >= 32) {
                                        kzo kzoVar2 = ba71Var.g;
                                        if (kzoVar2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (rf71.a >= 32 && (kzoVar = ba71Var.g) != null && kzoVar.b) {
                                        isAvailable = ((Spatializer) kzoVar.c).isAvailable();
                                        if (isAvailable) {
                                            isEnabled = ((Spatializer) ba71Var.g.c).isEnabled();
                                            if (isEnabled && ba71Var.g.g(ba71Var.h, qd81Var)) {
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    break;
                            }
                        }
                        if (rf71.a >= 32) {
                            isAvailable = ((Spatializer) kzoVar.c).isAvailable();
                            if (isAvailable) {
                            }
                        }
                        z = false;
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
