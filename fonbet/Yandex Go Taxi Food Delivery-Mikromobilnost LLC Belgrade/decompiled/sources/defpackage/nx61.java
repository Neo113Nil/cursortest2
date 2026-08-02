package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilderImpl;
import ru.CryptoPro.AdES.evidence.RevocationValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.EnhancedTSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.CAdESType;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedInternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.ExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampEnhancementProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPAttributeDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TimeStampData;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class nx61 extends hv61 {
    public m8z0 F;
    public TimeStampData G;

    public nx61(List list, String str) {
        super(list, str);
        this.F = null;
        this.G = null;
        JCPLogger.finer("Initializing CAdES-X Long Type 1 attribute table generator.");
    }

    @Override // defpackage.hv61, defpackage.sw61, defpackage.i87
    public xc3 b(Map map) {
        vc3 h;
        vc3 k;
        vc3 l;
        CertificateChainEvidenceBuilderImpl certificateChainEvidenceBuilderImpl = this.E;
        JCPLogger.fine("Creating CAdES-X Long Type 1 attribute table...");
        xc3 b = super.b(map);
        c2 g = b.g();
        try {
            Integer c = c();
            Integer num = CAdESParameters.CAdES_X_Long_Type_1;
            boolean equals = c.equals(num);
            ArrayList arrayList = this.C;
            if (equals || c().equals(CAdESParameters.CAdES_A)) {
                JCPLogger.fine("Prepare CAdES-X Long Type 1 attributes...");
                byte[] bArr = (byte[]) map.get("encryptedDigest");
                u2 u2Var = b490.P3;
                if (map.containsKey(u2Var)) {
                    this.F = (m8z0) map.get("FreshestValidInternalTimeStamp");
                    h = (vc3) map.get(u2Var);
                    this.G = (TimeStampData) map.get("ExternalTimeStamp");
                } else {
                    vc3 g2 = g(this.B);
                    StringBuilder sb = new StringBuilder("Removing of old attribute signature-timestamp: ");
                    u2 u2Var2 = b490.J3;
                    sb.append(u2Var2);
                    JCPLogger.fine(sb.toString());
                    xc3 e = b.e(u2Var2);
                    c2 g3 = e.g();
                    JCPLogger.fine("Add enhanced attribute signature-timestamp: " + u2Var2);
                    g3.a(g2);
                    h = h(bArr, new vc3[]{g2, e.c(b490.K3), e.c(b490.L3)});
                    g = g3;
                }
                boolean contains = arrayList.contains(num);
                HashSet hashSet = this.y;
                if (!contains) {
                    boolean isTimeStampEnhanced = CAdESType.isTimeStampEnhanced(this.G.getTimeStampToken());
                    JCPLogger.fine("Validating CAdES-C-timestamp, is enhanced = " + isTimeStampEnhanced);
                    TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
                    TSPTimeStampValidationProcess enhancedExternalTimeStampValidationProcessImpl = isTimeStampEnhanced ? new EnhancedExternalTimeStampValidationProcessImpl(this.G.getTspData(), this.G.getTimeStampToken()) : new ExternalTimeStampValidationProcessImpl(this.G.getTspData(), this.G.getTimeStampToken());
                    enhancedExternalTimeStampValidationProcessImpl.setCertificateValues(hashSet);
                    enhancedExternalTimeStampValidationProcessImpl.setCRLs(this.z);
                    enhancedExternalTimeStampValidationProcessImpl.setOptions(this.D);
                    enhancedExternalTimeStampValidationProcessImpl.setExternalDate(i());
                    tSPTimeStampValidatorImpl.validate(enhancedExternalTimeStampValidationProcessImpl);
                    JCPLogger.fine("cAdES-C-timestamp validated.");
                }
                if (!arrayList.contains(num)) {
                    JCPLogger.fine("Validating enhanced internal timestamp...");
                    TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl2 = new TSPTimeStampValidatorImpl();
                    TSPSignatureDataImpl tSPSignatureDataImpl = new TSPSignatureDataImpl(bArr);
                    tSPSignatureDataImpl.setProvider(this.b);
                    Date date = (Date) this.G.getTimeStampToken().c.b;
                    EnhancedInternalTimeStampValidationProcessImpl enhancedInternalTimeStampValidationProcessImpl = new EnhancedInternalTimeStampValidationProcessImpl(tSPSignatureDataImpl, this.F);
                    enhancedInternalTimeStampValidationProcessImpl.setCertificateValues(hashSet);
                    enhancedInternalTimeStampValidationProcessImpl.setExternalDate(date);
                    enhancedInternalTimeStampValidationProcessImpl.setOptions(this.D);
                    tSPTimeStampValidatorImpl2.validate((TSPTimeStampValidationProcess) enhancedInternalTimeStampValidationProcessImpl);
                    JCPLogger.fine("Enhanced internal timestamp validated.");
                }
                JCPLogger.fine("Add unsigned attribute CAdES-C-timestamp: " + h.a.a);
                g.a(h);
            }
            u2 u2Var3 = b490.M3;
            if (map.containsKey(u2Var3)) {
                k = (vc3) map.get(u2Var3);
                l = (vc3) map.get(b490.O3);
            } else {
                k = k();
                l = l();
            }
            JCPLogger.fine("Add unsigned attribute certificate-values: ", k.a.a);
            g.a(k);
            JCPLogger.fine("Add unsigned attribute revocation-values: ", l.a.a);
            g.a(l);
            if ((c().equals(num) || c().equals(CAdESParameters.CAdES_A)) && !arrayList.contains(num)) {
                JCPLogger.fine("Validating signer certificate chain on external date...");
                Date date2 = (Date) this.G.getTimeStampToken().c.b;
                Date date3 = (Date) this.F.c.b;
                ComplexCertificateChainValidatorImpl complexCertificateChainValidatorImpl = new ComplexCertificateChainValidatorImpl();
                complexCertificateChainValidatorImpl.setValidationDate(date2);
                complexCertificateChainValidatorImpl.setProvider(this.b);
                complexCertificateChainValidatorImpl.setSignerMustHaveOcspEvidence(true);
                complexCertificateChainValidatorImpl.setCertificateRole(CertificateItem.CertificateRole.Signer);
                complexCertificateChainValidatorImpl.setCompleteCertificateReferences(Collections.singletonList(certificateChainEvidenceBuilderImpl.getSignerCertificateReference()));
                complexCertificateChainValidatorImpl.setCompleteCertificateReferences(certificateChainEvidenceBuilderImpl.getCompleteCertificateReferences());
                complexCertificateChainValidatorImpl.setCompleteRevocationReferences(certificateChainEvidenceBuilderImpl.getCompleteRevocationReferences());
                complexCertificateChainValidatorImpl.setRevocationValues(certificateChainEvidenceBuilderImpl.getRevocationValues());
                complexCertificateChainValidatorImpl.validate(this.x, (List) null);
                JCPLogger.fine("Validating revocation evidences on internal and external dates...");
                RevocationValidatorImpl revocationValidatorImpl = new RevocationValidatorImpl();
                revocationValidatorImpl.setProvider(this.b);
                revocationValidatorImpl.setValidationDate(date2);
                revocationValidatorImpl.setInternalDate(date3);
                revocationValidatorImpl.setExternalDate(date2);
                revocationValidatorImpl.setCompleteCertificateReferences(Collections.singletonList(certificateChainEvidenceBuilderImpl.getSignerCertificateReference()));
                revocationValidatorImpl.setCompleteCertificateReferences(certificateChainEvidenceBuilderImpl.getCompleteCertificateReferences());
                revocationValidatorImpl.setCompleteRevocationReferences(certificateChainEvidenceBuilderImpl.getCompleteRevocationReferences());
                revocationValidatorImpl.setCertificateValues(new HashSet(certificateChainEvidenceBuilderImpl.getCertificateValues()));
                revocationValidatorImpl.setRevocationValues(certificateChainEvidenceBuilderImpl.getRevocationValues());
                revocationValidatorImpl.setOptions(this.D);
                revocationValidatorImpl.validate((Object) null);
                JCPLogger.fine("Validation of signer certificate chain and revocation evidences completed.");
            }
            return new xc3(g);
        } catch (IOException e2) {
            throw new CMSAttributeTableGenerationException(e2.getMessage(), e2);
        } catch (CertificateEncodingException e3) {
            throw new CMSAttributeTableGenerationException(e3.getMessage(), e3);
        } catch (AdESException e4) {
            throw new CAdESCMSAttributeTableGenerationException(e4.getMessage(), e4, e4.getErrorCode());
        }
    }

    @Override // defpackage.hv61, defpackage.sw61
    public Integer c() {
        return CAdESParameters.CAdES_X_Long_Type_1;
    }

    @Override // defpackage.sw61
    public final m8z0 d() {
        return this.F;
    }

    public final vc3 g(m8z0 m8z0Var) {
        JCPLogger.fine("Enhancement of internal signature-timestamp...");
        EnhancedTSPTimeStampImpl enhancedTSPTimeStampImpl = new EnhancedTSPTimeStampImpl();
        try {
            InternalTimeStampEnhancementProcessImpl internalTimeStampEnhancementProcessImpl = new InternalTimeStampEnhancementProcessImpl(m8z0Var);
            internalTimeStampEnhancementProcessImpl.setProvider(this.b);
            internalTimeStampEnhancementProcessImpl.setCertificateValues(this.y);
            internalTimeStampEnhancementProcessImpl.setCRLs(this.z);
            internalTimeStampEnhancementProcessImpl.setOptions(this.D);
            this.F = enhancedTSPTimeStampImpl.enhance(internalTimeStampEnhancementProcessImpl);
            JCPLogger.fine("Creating a sorted list of internal timestamps...");
            vc3 createTimeStampAttribute = CAdESUtility.createTimeStampAttribute(b490.J3, this.F);
            JCPLogger.fine("Created unsigned attribute signature-timestamp: " + createTimeStampAttribute.a.a);
            return createTimeStampAttribute;
        } catch (AdESException e) {
            throw new CAdESException(e, e.getErrorCode());
        }
    }

    public final vc3 h(byte[] bArr, vc3[] vc3VarArr) {
        JCPLogger.fine("Retrieving cAdES-C-timestamp (external)...");
        TSPAttributeDataImpl tSPAttributeDataImpl = new TSPAttributeDataImpl(bArr, vc3VarArr);
        TSPTimeStampImpl tSPTimeStampImpl = new TSPTimeStampImpl();
        tSPTimeStampImpl.setDigestAlgorithm(this.c);
        tSPTimeStampImpl.setProvider(this.b);
        tSPTimeStampImpl.retrieve(this.a, tSPAttributeDataImpl);
        this.G = new TimeStampData(tSPTimeStampImpl.get(), tSPAttributeDataImpl);
        JCPLogger.fine("Creating cAdES-C-timestamp (external)...");
        vc3 createTimeStampAttribute = CAdESUtility.createTimeStampAttribute(b490.P3, this.G.getTimeStampToken());
        JCPLogger.fine("Created unsigned attribute CAdES-C-timestamp: " + createTimeStampAttribute.a.a);
        return createTimeStampAttribute;
    }

    public Date i() {
        return null;
    }

    public TimeStampData j() {
        return this.G;
    }

    public final vc3 k() {
        JCPLogger.fine("Creating certificate-values...");
        c2 c2Var = new c2();
        Iterator it = this.E.getCertificateValues().iterator();
        while (it.hasNext()) {
            c2Var.a(new j2(new ByteArrayInputStream(((X509Certificate) it.next()).getEncoded())).n());
        }
        c2 c2Var2 = new c2();
        c2Var2.a(new jqf(c2Var));
        vc3 vc3Var = new vc3(b490.M3, new rd4(c2Var2, false));
        JCPLogger.fine("Created unsigned attribute certificate-values: " + vc3Var.a.a);
        return vc3Var;
    }

    public final vc3 l() {
        JCPLogger.fine("Creating revocation-values...");
        v2k0 revocationValues = this.E.getRevocationValues();
        vc3 vc3Var = new vc3(b490.O3, revocationValues != null ? new lqf(revocationValues) : new lqf(new jqf()));
        JCPLogger.fine("Created unsigned attribute revocation-values: " + vc3Var.a.a);
        return vc3Var;
    }
}
