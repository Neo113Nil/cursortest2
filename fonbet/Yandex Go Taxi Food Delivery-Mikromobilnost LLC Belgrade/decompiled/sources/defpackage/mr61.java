package defpackage;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.CAdESSignerBESImpl;
import ru.CryptoPro.CAdES.CAdESSignerTImpl;
import ru.CryptoPro.CAdES.CAdESType;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class mr61 extends CAdESSignerBESImpl implements InternalTimeStampCAdESSignerParameters {
    public Date C;
    public Date D;

    public mr61(acs0 acs0Var, Integer num) {
        super(acs0Var, num, false);
        this.C = null;
        this.D = null;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public void addCountersigner(acs0 acs0Var) {
        throw new CAdESException("Unsupported method.", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final CAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num, xc3 xc3Var) {
        JCPLogger.fine("%%% Enhancing signer ([signature/archive]-timestamp -> enhanced [signature/archive] timestamp)... %%%");
        try {
            checkIfCanEnhance(num);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(list);
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set);
            if (!num.equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP) && !num.equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP) && !num.equals(AdESParameters.TSA_CAdESC_TIME_STAMP)) {
                throw new CAdESException("The timestamp must be enhanced to the type enhanced signature-timestamp or enhanced CAdES-C-timestamp (in case of archive signature) or enhanced archive-timestamp only.", IAdESException.ecSignatureUnsupported);
            }
            X509Certificate a = a(list, unmodifiableSet);
            String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(str2, str, a.getPublicKey());
            if (checkAndGetDigestAlgorithm == null) {
                throw new CAdESException(g8e.o("Digest algorithm has not been found or is not supported by provider ", str), IAdESException.ecInternal);
            }
            JCPLogger.fine("Enhancing digest algorithm: ".concat(checkAndGetDigestAlgorithm));
            try {
                List<X509Certificate> build = build(a, str, null);
                JCPLogger.fine("Initiating attribute table (" + CAdESType.getSignatureTypeName(getSignatureType()) + " -> enhanced " + CAdESType.getSignatureTypeName(num) + ")...");
                sw61 j = j(build, str, checkAndGetDigestAlgorithm, str3, num, xc3Var, null, null, null, null);
                JCPLogger.fine("Generating attributes...");
                xc3 b = j.b(k());
                JCPLogger.fine("Replacing attributes...");
                CAdESSigner.replaceUnsignedAttributes(this, b);
                CAdESSignerTImpl l = l(j);
                JCPLogger.fine("%%% Signer has been enhanced %%%");
                return l;
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
            } catch (CAdESCMSAttributeTableGenerationException e2) {
                throw new CAdESException(e2, e2.getErrorCode());
            }
        } catch (AdESException e3) {
            throw new CAdESException(e3, e3.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getInternalDate() {
        return this.C;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getPkupValidationDate() {
        return getInternalDate();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public final sw61 j(List list, String str, String str2, String str3, Integer num, xc3 xc3Var, List list2, byte[] bArr, ncc nccVar, ncc nccVar2) {
        hv61 hv61Var;
        sw61 j = super.j(list, str, str2, str3, num, xc3Var, null, null, null, null);
        if (num.equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP)) {
            hv61Var = (ar61) j;
        } else if (num.equals(AdESParameters.TSA_CAdESC_TIME_STAMP)) {
            hv61Var = (tx61) j;
        } else {
            if (!num.equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
                return j;
            }
            hv61Var = (xq61) j;
        }
        hv61Var.E.setInternalDate(this.C);
        return j;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public Map k() {
        return Collections.EMPTY_MAP;
    }

    @Override // ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    public final void setContent(byte[] bArr) {
        JCPLogger.subEnter();
        this.C = CAdESSigner.b(bArr);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    public final void setExternalDate(Date date) {
        this.D = date;
    }
}
