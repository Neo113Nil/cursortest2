package defpackage;

import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final /* synthetic */ class c6d implements gms {
    @Override // defpackage.gms
    public final Object c(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, bts btsVar, Integer num) {
        int i;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        yje yjeVar = (yje) obj2;
        zls zlsVar = (zls) obj3;
        sls slsVar = (sls) obj4;
        int intValue = num.intValue();
        d6d d6dVar = d6d.a;
        int i2 = intValue & 6;
        c530 c530Var = c530.a;
        if (i2 == 0) {
            i = (btsVar.k(c530Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= btsVar.k(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= btsVar.a(booleanValue) ? 256 : 128;
        }
        if ((intValue & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i |= btsVar.k(yjeVar) ? 2048 : 1024;
        }
        if ((intValue & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i |= btsVar.e(zlsVar) ? 16384 : 8192;
        }
        if ((intValue & ImageMetadata.EDGE_MODE) == 0) {
            i |= btsVar.e(slsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i & 1, (599187 & i) != 599186)) {
            bke.c(str, booleanValue, yjeVar, c530Var, zlsVar, slsVar, btsVar, (i & ImageMetadata.JPEG_GPS_COORDINATES) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
