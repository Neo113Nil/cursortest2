package defpackage;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.AuthorityKeyIdentifier;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.KeyIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions._Cryptographic_Gost_Useful_DefinitionsValues;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public abstract class ku61 {
    public static final String a = new OID(_Cryptographic_Gost_Useful_DefinitionsValues.id_CryptoPro_extensions_certificate_and_crl_matching_technique).toString();

    public static String a(byte[] bArr) {
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(bArr);
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        AuthorityKeyIdentifier authorityKeyIdentifier = new AuthorityKeyIdentifier();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            authorityKeyIdentifier.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            KeyIdentifier keyIdentifier = authorityKeyIdentifier.keyIdentifier;
            if (keyIdentifier != null) {
                return Array.toHexLowString(keyIdentifier.value);
            }
            return null;
        } catch (Asn1Exception | IOException | ClassCastException unused) {
            return null;
        }
    }
}
