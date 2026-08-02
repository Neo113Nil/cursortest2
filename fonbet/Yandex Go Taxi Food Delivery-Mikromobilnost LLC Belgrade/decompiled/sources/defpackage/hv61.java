package defpackage;

import java.util.Date;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilderImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class hv61 extends sw61 {
    public final CertificateChainEvidenceBuilderImpl E;

    public hv61(List list, String str) {
        super(list, str);
        JCPLogger.finer("Initializing CAdES-C attribute table generator.");
        this.E = new CertificateChainEvidenceBuilderImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: AdESException -> 0x0109, TryCatch #0 {AdESException -> 0x0109, blocks: (B:3:0x0013, B:5:0x0020, B:9:0x0030, B:11:0x0053, B:13:0x005f, B:16:0x006c, B:17:0x0071, B:19:0x007e, B:22:0x008b, B:24:0x0097, B:25:0x00ab, B:27:0x00b3, B:28:0x00d7, B:32:0x00c2, B:33:0x009b, B:34:0x006f), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[Catch: AdESException -> 0x0109, TryCatch #0 {AdESException -> 0x0109, blocks: (B:3:0x0013, B:5:0x0020, B:9:0x0030, B:11:0x0053, B:13:0x005f, B:16:0x006c, B:17:0x0071, B:19:0x007e, B:22:0x008b, B:24:0x0097, B:25:0x00ab, B:27:0x00b3, B:28:0x00d7, B:32:0x00c2, B:33:0x009b, B:34:0x006f), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[Catch: AdESException -> 0x0109, TryCatch #0 {AdESException -> 0x0109, blocks: (B:3:0x0013, B:5:0x0020, B:9:0x0030, B:11:0x0053, B:13:0x005f, B:16:0x006c, B:17:0x0071, B:19:0x007e, B:22:0x008b, B:24:0x0097, B:25:0x00ab, B:27:0x00b3, B:28:0x00d7, B:32:0x00c2, B:33:0x009b, B:34:0x006f), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[Catch: AdESException -> 0x0109, TryCatch #0 {AdESException -> 0x0109, blocks: (B:3:0x0013, B:5:0x0020, B:9:0x0030, B:11:0x0053, B:13:0x005f, B:16:0x006c, B:17:0x0071, B:19:0x007e, B:22:0x008b, B:24:0x0097, B:25:0x00ab, B:27:0x00b3, B:28:0x00d7, B:32:0x00c2, B:33:0x009b, B:34:0x006f), top: B:2:0x0013 }] */
    @Override // defpackage.sw61, defpackage.i87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xc3 b(Map map) {
        boolean z;
        CertificateItem.CertificateRole certificateRole;
        u2 u2Var;
        vc3 e;
        vc3 vc3Var;
        CertificateChainEvidenceBuilderImpl certificateChainEvidenceBuilderImpl = this.E;
        JCPLogger.fine("Creating CAdES-C attribute table...");
        c2 g = super.b(map).g();
        try {
            Integer c = c();
            Integer num = CAdESParameters.CAdES_X_Long_Type_1;
            if (!c.equals(num) && !c().equals(CAdESParameters.CAdES_A)) {
                z = false;
                certificateChainEvidenceBuilderImpl.setSignerMustHaveOcspEvidence(z);
                certificateChainEvidenceBuilderImpl.setProvider(this.b);
                certificateChainEvidenceBuilderImpl.setCertificateValues(this.y);
                certificateChainEvidenceBuilderImpl.setCRLs(this.z);
                certificateChainEvidenceBuilderImpl.setOptions(this.D);
                if (!c().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP) && !c().equals(AdESParameters.TSA_CAdESC_TIME_STAMP) && !c().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
                    certificateRole = CertificateItem.CertificateRole.Signer;
                    certificateChainEvidenceBuilderImpl.setCertificateRole(certificateRole);
                    if (!c().equals(num) && !c().equals(CAdESParameters.CAdES_A)) {
                        if (c().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
                            certificateChainEvidenceBuilderImpl.setIgnoreEvidenceTime(true);
                        }
                        u2Var = b490.K3;
                        if (map.containsKey(u2Var)) {
                            JCPLogger.fine("Prepare evidence builder...");
                            certificateChainEvidenceBuilderImpl.build(this.x);
                            vc3 f = f();
                            e = e();
                            vc3Var = f;
                        } else {
                            vc3Var = (vc3) map.get(b490.L3);
                            e = (vc3) map.get(u2Var);
                        }
                        JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
                        g.a(vc3Var);
                        JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
                        g.a(e);
                        return new xc3(g);
                    }
                    JCPLogger.fine("Prepare CadES-C-timestamp...");
                    certificateChainEvidenceBuilderImpl.setInternalDate((Date) this.B.c.b);
                    u2Var = b490.K3;
                    if (map.containsKey(u2Var)) {
                    }
                    JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
                    g.a(vc3Var);
                    JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
                    g.a(e);
                    return new xc3(g);
                }
                certificateRole = CertificateItem.CertificateRole.TSPSigner;
                certificateChainEvidenceBuilderImpl.setCertificateRole(certificateRole);
                if (!c().equals(num)) {
                    if (c().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
                    }
                    u2Var = b490.K3;
                    if (map.containsKey(u2Var)) {
                    }
                    JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
                    g.a(vc3Var);
                    JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
                    g.a(e);
                    return new xc3(g);
                }
                JCPLogger.fine("Prepare CadES-C-timestamp...");
                certificateChainEvidenceBuilderImpl.setInternalDate((Date) this.B.c.b);
                u2Var = b490.K3;
                if (map.containsKey(u2Var)) {
                }
                JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
                g.a(vc3Var);
                JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
                g.a(e);
                return new xc3(g);
            }
            z = true;
            certificateChainEvidenceBuilderImpl.setSignerMustHaveOcspEvidence(z);
            certificateChainEvidenceBuilderImpl.setProvider(this.b);
            certificateChainEvidenceBuilderImpl.setCertificateValues(this.y);
            certificateChainEvidenceBuilderImpl.setCRLs(this.z);
            certificateChainEvidenceBuilderImpl.setOptions(this.D);
            if (!c().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP)) {
                certificateRole = CertificateItem.CertificateRole.Signer;
                certificateChainEvidenceBuilderImpl.setCertificateRole(certificateRole);
                if (!c().equals(num)) {
                }
                JCPLogger.fine("Prepare CadES-C-timestamp...");
                certificateChainEvidenceBuilderImpl.setInternalDate((Date) this.B.c.b);
                u2Var = b490.K3;
                if (map.containsKey(u2Var)) {
                }
                JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
                g.a(vc3Var);
                JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
                g.a(e);
                return new xc3(g);
            }
            certificateRole = CertificateItem.CertificateRole.TSPSigner;
            certificateChainEvidenceBuilderImpl.setCertificateRole(certificateRole);
            if (!c().equals(num)) {
            }
            JCPLogger.fine("Prepare CadES-C-timestamp...");
            certificateChainEvidenceBuilderImpl.setInternalDate((Date) this.B.c.b);
            u2Var = b490.K3;
            if (map.containsKey(u2Var)) {
            }
            JCPLogger.fine("Add unsigned attribute complete-revocation-references: " + vc3Var.a.a);
            g.a(vc3Var);
            JCPLogger.fine("Add unsigned attribute complete-certificate-references: " + e.a.a);
            g.a(e);
            return new xc3(g);
        } catch (AdESException e2) {
            throw new CAdESCMSAttributeTableGenerationException(e2.getMessage(), e2, e2.getErrorCode());
        }
    }

    @Override // defpackage.sw61
    public abstract Integer c();

    public final vc3 e() {
        JCPLogger.fine("Creating complete-certificate-references...");
        List completeCertificateReferences = this.E.getCompleteCertificateReferences();
        cr80[] cr80VarArr = (cr80[]) completeCertificateReferences.toArray(new cr80[completeCertificateReferences.size()]);
        c2 c2Var = new c2();
        c2Var.a(new jqf(cr80VarArr));
        vc3 vc3Var = new vc3(b490.K3, new rd4(c2Var, false));
        JCPLogger.fine("Created unsigned attribute complete-certificate-references: ", vc3Var.a.a);
        return vc3Var;
    }

    public final vc3 f() {
        JCPLogger.fine("Creating completed-revocation-references...");
        List completeRevocationReferences = this.E.getCompleteRevocationReferences();
        tbf[] tbfVarArr = (tbf[]) completeRevocationReferences.toArray(new tbf[completeRevocationReferences.size()]);
        bzc bzcVar = new bzc();
        bzcVar.a = new jqf(tbfVarArr);
        vc3 vc3Var = new vc3(b490.L3, new rd4(bzcVar));
        JCPLogger.fine("Created unsigned attribute complete-revocation-references: ", vc3Var.a.a);
        return vc3Var;
    }
}
