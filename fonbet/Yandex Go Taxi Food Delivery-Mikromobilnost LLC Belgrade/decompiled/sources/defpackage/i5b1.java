package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import androidx.compose.runtime.f;
import androidx.compose.runtime.h;
import androidx.compose.runtime.internal.a;
import com.yandex.messaging.internal.images.b;
import java.io.File;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public abstract class i5b1 {
    public static final void a(f530 f530Var, h hVar, dms dmsVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-714464401);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(dmsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.i(null, x4c.Q);
                btsVar.o0(Q);
            }
            androidx.compose.foundation.text.contextmenu.provider.a c = c(dmsVar, btsVar, (i2 >> 6) & 14);
            sb2.b(hVar.a(c), wwg.S(274270255, true, new rb0(f530Var, (oz40) Q, aVar, c, 8), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(f530Var, hVar, dmsVar, aVar, i, 6);
        }
    }

    public static final Object b(x920 x920Var, String str) {
        if (x920Var.c(str)) {
            return x920Var.a(str);
        }
        return null;
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.a c(dms dmsVar, fid fidVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((bts) fidVar).k(dmsVar)) || (i & 6) == 4;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z || Q == o430Var) {
            Q = new androidx.compose.foundation.text.contextmenu.provider.a(dmsVar);
            btsVar.o0(Q);
        }
        androidx.compose.foundation.text.contextmenu.provider.a aVar = (androidx.compose.foundation.text.contextmenu.provider.a) Q;
        boolean k = btsVar.k(aVar);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new j24(15, aVar);
            btsVar.o0(Q2);
        }
        zpn.a(aVar, (tls) Q2, btsVar);
        return aVar;
    }

    public static File d(Context context, String str) {
        File file = null;
        try {
            file = context.getExternalCacheDir();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
        }
        if (file == null || Environment.isExternalStorageRemovable() || !"mounted".equals(Environment.getExternalStorageState())) {
            file = context.getCacheDir();
        }
        return new File(new File(file, "messenger_profile_images"), Uri.encode(str));
    }

    public static aiv e(Context context, wff0 wff0Var, h020 h020Var, b bVar, OkHttpClient okHttpClient, vmr0 vmr0Var, String str) {
        biv bivVar = new biv();
        w3i w3iVar = new w3i(context, bivVar, vmr0Var, d(context, str));
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(1);
        Context applicationContext = context.getApplicationContext();
        arrayList.add(bVar);
        arrayList.add(h020Var);
        arrayList.add(new n0z0());
        arrayList.add(new kes0(okHttpClient));
        arrayList.add(new bfs0(context));
        h5b1.a = new zhv();
        boolean z = false;
        xav xavVar = (xav) new yhv(applicationContext, new abe(applicationContext, z, z), arrayList, arrayList2, w3iVar, bivVar).get();
        wff0Var.a(new fn3(7, xavVar));
        SharedPreferences sharedPreferences = context.getSharedPreferences("messenger_ImageManager_prefs", 0);
        if (sharedPreferences.getInt("PREFS_CACHE_VERSION", 0) != 1) {
            xavVar.g();
            sharedPreferences.edit().putInt("PREFS_CACHE_VERSION", 1).apply();
        }
        return new aiv(xavVar, new jiu(17));
    }
}
