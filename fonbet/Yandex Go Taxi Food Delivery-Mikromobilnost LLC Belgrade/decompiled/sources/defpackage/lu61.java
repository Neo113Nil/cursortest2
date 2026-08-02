package defpackage;

import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax._Gost28147_89_EncryptionSyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_EncryptionSyntax._GostR3410_2012_EncryptionSyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax._GostR3410_EncryptionSyntaxValues;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public interface lu61 {
    public static final u2 c5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89).toString());
    public static final u2 d5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_cipher_gost_3412_2015_M_ctr_acpkm).toString());
    public static final u2 e5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_cipher_gost_3412_2015_K_ctr_acpkm).toString());
    public static final u2 f5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_cipher_gost_3412_2015_M_ctr_acpkm_omac).toString());
    public static final u2 g5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_cipher_gost_3412_2015_K_ctr_acpkm_omac).toString());
    public static final u2 h5 = new u2(new OID(_GostR3410_EncryptionSyntaxValues.id_Gost28147_89_None_KeyWrap).toString());
    public static final u2 i5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_wrap_gost_3412_2015_M_kexp15).toString());
    public static final u2 j5 = new u2(new OID(_Gost28147_89_EncryptionSyntaxValues.id_tc26_wrap_gost_3412_2015_K_kexp15).toString());
    public static final OID k5;
    public static final CryptParamsSpec l5;
    public static final OID m5;
    public static final OID n5;
    public static final OID o5;
    public static final boolean p5;

    static {
        OID oid = CryptParamsSpec.OID_Crypt_VerbaO;
        k5 = oid;
        l5 = CryptParamsSpec.getInstance(oid);
        m5 = new OID(_GostR3410_EncryptionSyntaxValues.id_GostR3410_2001_CryptoPro_ESDH);
        n5 = new OID(_GostR3410_2012_EncryptionSyntaxValues.id_tc26_agreement_gost_3410_2012_256);
        o5 = new OID(_GostR3410_2012_EncryptionSyntaxValues.id_tc26_agreement_gost_3410_2012_512);
        p5 = GetProperty.getBooleanProperty("use_enveloped_local_context", false);
    }
}
