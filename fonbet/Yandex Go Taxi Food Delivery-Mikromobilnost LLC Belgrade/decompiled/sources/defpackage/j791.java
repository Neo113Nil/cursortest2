package defpackage;

import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class j791 extends n791 {
    public j791() {
        this.a.add(zzbk.BITWISE_AND);
        this.a.add(zzbk.BITWISE_LEFT_SHIFT);
        this.a.add(zzbk.BITWISE_NOT);
        this.a.add(zzbk.BITWISE_OR);
        this.a.add(zzbk.BITWISE_RIGHT_SHIFT);
        this.a.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(zzbk.BITWISE_XOR);
    }

    @Override // defpackage.n791
    public final r691 a(String str, cr71 cr71Var, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        switch (cwa1.i(str).ordinal()) {
            case 4:
                return new n591(Double.valueOf(cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_AND, 2, arrayList, 0)).zzd().doubleValue()) & cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue())));
            case 5:
                return new n591(Double.valueOf(cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).zzd().doubleValue()) << ((int) (cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                return new n591(Double.valueOf(~cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_NOT, 1, arrayList, 0)).zzd().doubleValue())));
            case 7:
                return new n591(Double.valueOf(cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_OR, 2, arrayList, 0)).zzd().doubleValue()) | cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue())));
            case 8:
                return new n591(Double.valueOf(cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).zzd().doubleValue()) >> ((int) (cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                return new n591(Double.valueOf((cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).zzd().doubleValue()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) >>> ((int) (cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                return new n591(Double.valueOf(cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.BITWISE_XOR, 2, arrayList, 0)).zzd().doubleValue()) ^ cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
