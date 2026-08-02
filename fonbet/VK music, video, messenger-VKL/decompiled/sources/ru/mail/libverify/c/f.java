package ru.mail.libverify.c;

import android.net.Network;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import ru.mail.libverify.api.VerifyRoute;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.FileLog;
import xsna.oa01;

/* loaded from: classes9.dex */
public final class f {
    private final ru.mail.libverify.e.g a;
    private final ru.mail.libverify.l.d b;
    private final TreeSet c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ru.mail.libverify.e.b.values().length];
            try {
                iArr[ru.mail.libverify.e.b.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.mail.libverify.e.b.RESEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.mail.libverify.e.b.VKLOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[VerifyRoute.values().length];
            try {
                iArr2[VerifyRoute.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerifyRoute.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerifyRoute.CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VerifyRoute.CALLUI.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VerifyRoute.CALLIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VerifyRoute.VKCLogin.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public f(ru.mail.libverify.e.g gVar, ru.mail.libverify.l.d dVar) {
        TreeSet b;
        this.a = gVar;
        this.b = dVar;
        if (dVar == null) {
            b = oa01.b(VerifyApiRequest.VerifyChecks.SMS, VerifyApiRequest.VerifyChecks.PUSH);
        } else {
            b = oa01.b(new VerifyApiRequest.VerifyChecks[0]);
            if (dVar.h()) {
                b.add(VerifyApiRequest.VerifyChecks.SMS);
            }
            if (dVar.g()) {
                b.add(VerifyApiRequest.VerifyChecks.PUSH);
            }
        }
        this.c = b;
    }

    public final f a(ru.mail.libverify.n.g gVar, String str) {
        ru.mail.libverify.l.d dVar = this.b;
        if ((dVar == null || dVar.a()) && ((ru.mail.libverify.n.h) gVar).a(str)) {
            this.c.add(VerifyApiRequest.VerifyChecks.CALL);
        }
        return this;
    }

    public final f b() {
        ru.mail.libverify.l.d dVar = this.b;
        if (dVar != null && dVar.e()) {
            this.c.add(VerifyApiRequest.VerifyChecks.MESSENGER);
        }
        return this;
    }

    public final f c() {
        ru.mail.libverify.l.d dVar = this.b;
        if (dVar == null || dVar.f()) {
            Network network = ru.mail.libverify.j0.g.a().get();
            FileLog.d("VerifyChecksBuilder", "Result of cellular request: %s", network);
            if (network != null) {
                this.c.add(VerifyApiRequest.VerifyChecks.MOBILEID);
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VerifyApiRequest.VerifyChecks[] d() {
        VerifyApiRequest.VerifyChecks[] verifyChecksArr;
        VerifyApiRequest.VerifyChecks verifyChecks;
        VerifyApiRequest.VerifyChecks verifyChecks2;
        ru.mail.libverify.e.g gVar = this.a;
        if (gVar != null) {
            VerifyRoute g = gVar.g();
            int i = a.a[gVar.e().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        verifyChecksArr = new VerifyApiRequest.VerifyChecks[]{VerifyApiRequest.VerifyChecks.VKC};
                    } else if (g != null) {
                        switch (a.b[g.ordinal()]) {
                            case 1:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.SMS;
                                break;
                            case 2:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.PUSH;
                                break;
                            case 3:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.CALL;
                                break;
                            case 4:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.CALLUI;
                                break;
                            case 5:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.CALLIN;
                                break;
                            case 6:
                                verifyChecks2 = VerifyApiRequest.VerifyChecks.VKC;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        verifyChecksArr = new VerifyApiRequest.VerifyChecks[]{verifyChecks2};
                    }
                }
            } else {
                if (g == null) {
                    throw new IllegalStateException("Route must not be null.");
                }
                switch (a.b[g.ordinal()]) {
                    case 1:
                        verifyChecks = VerifyApiRequest.VerifyChecks.SMS;
                        break;
                    case 2:
                        verifyChecks = VerifyApiRequest.VerifyChecks.PUSH;
                        break;
                    case 3:
                        verifyChecks = VerifyApiRequest.VerifyChecks.CALL;
                        break;
                    case 4:
                        verifyChecks = VerifyApiRequest.VerifyChecks.CALLUI;
                        break;
                    case 5:
                        verifyChecks = VerifyApiRequest.VerifyChecks.CALLIN;
                        break;
                    case 6:
                        verifyChecks = VerifyApiRequest.VerifyChecks.VKC;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                verifyChecksArr = new VerifyApiRequest.VerifyChecks[]{verifyChecks};
            }
            return verifyChecksArr != null ? (VerifyApiRequest.VerifyChecks[]) this.c.toArray(new VerifyApiRequest.VerifyChecks[0]) : verifyChecksArr;
        }
        verifyChecksArr = null;
        if (verifyChecksArr != null) {
        }
    }

    public final f a(w wVar) {
        Boolean c;
        if (wVar.v()) {
            this.c.add(VerifyApiRequest.VerifyChecks.CALLUI);
        }
        ru.mail.libverify.l.d dVar = this.b;
        if (dVar != null && (c = dVar.c()) != null) {
            if (c.booleanValue()) {
                this.c.add(VerifyApiRequest.VerifyChecks.CALLUI);
                return this;
            }
            this.c.remove(VerifyApiRequest.VerifyChecks.CALLUI);
        }
        return this;
    }

    public final f a() {
        ru.mail.libverify.l.d dVar = this.b;
        if (dVar != null && dVar.b()) {
            this.c.add(VerifyApiRequest.VerifyChecks.CALLIN);
        }
        return this;
    }
}
