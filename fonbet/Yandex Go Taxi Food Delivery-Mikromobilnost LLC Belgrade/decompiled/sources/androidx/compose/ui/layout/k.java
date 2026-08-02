package androidx.compose.ui.layout;

import defpackage.aa10;
import defpackage.tls;
import defpackage.yuw;
import java.util.Map;

/* loaded from: classes.dex */
public interface k extends yuw {
    aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2);

    default aa10 w(int i, int i2, Map map, tls tlsVar) {
        return E(i, i2, map, null, tlsVar);
    }
}
