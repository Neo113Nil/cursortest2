package defpackage;

import java.util.Date;
import java.util.List;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public final class fr61 extends mr61 {
    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final void addCountersigner(acs0 acs0Var) {
        throw new CAdESException("Unsupported method", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final CAdESSigner enhance(String str, String str2, List list, String str3, Integer num, xc3 xc3Var) {
        throw new CAdESException("Unsupported method", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getBuildingDate() {
        return this.D;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getExternalDate() {
        return this.C;
    }

    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getInternalDate() {
        return null;
    }

    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getPkupValidationDate() {
        return this.C;
    }

    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final Integer getSignatureType() {
        return AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getValidationDate() {
        return this.D;
    }
}
