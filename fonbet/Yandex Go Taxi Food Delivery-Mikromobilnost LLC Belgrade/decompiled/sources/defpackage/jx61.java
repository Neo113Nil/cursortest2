package defpackage;

import java.util.Date;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.external.decode.EnhancedArchiveTimeStampCAdESSignerParameters;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class jx61 extends xx61 implements EnhancedArchiveTimeStampCAdESSignerParameters {
    public jx61(acs0 acs0Var) {
        super(acs0Var, AdESParameters.TSA_ARCHIVE_TIME_STAMP);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getBuildingDate() {
        return this.F;
    }

    @Override // defpackage.xx61, ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final Integer getSignatureType() {
        return AdESParameters.TSA_ARCHIVE_TIME_STAMP;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getValidationDate() {
        return this.G;
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedArchiveTimeStampCAdESSignerParameters
    public final void setNeedValidateChain(boolean z) {
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedArchiveTimeStampCAdESSignerParameters
    public final void setTailBuildingDate(Date date) {
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public final void verify(Set set, Set set2) {
        JCPLogger.subEnter();
        super.verify(set, set2);
        JCPLogger.subExit();
    }
}
