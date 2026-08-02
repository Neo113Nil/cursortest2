package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.view.View;
import androidx.room.a;
import com.ironsource.adapters.unityads.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.photo.editor.chronicle.ChronicleLowMemoryException;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.p4p;

/* compiled from: SwipeToDismiss.kt */
/* loaded from: classes17.dex */
public final class pli implements com.vk.superapp.base.js.bridge.a, h5p, dc7, zgy0 {
    public static final jai c = new jai(-1202428765, new vji(1), false);
    public static final ryt0 d;
    public static fai e;
    public final /* synthetic */ int b;

    static {
        new jai(-1905731318, new rch(3), false);
        d = new ryt0();
    }

    public /* synthetic */ pli(int i) {
        this.b = i;
    }

    public static final long h(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final bkt0 i() {
        return new bkt0();
    }

    public static final boolean j(aeb aebVar) {
        return k(aebVar).b.i();
    }

    public static final vcb k(aeb aebVar) {
        return new vcb((int) xo9.j(aebVar.b.b, d370.c), (int) xo9.j(aebVar.b.b, d370.e), aebVar.c);
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final Long m(Collection collection) {
        wto0 wto0Var;
        if (collection == null || (wto0Var = (wto0) j5g.Z(collection)) == null) {
            return null;
        }
        return wto0Var.a();
    }

    public static final long n(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    public static String o(List list) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List b0 = drm0.b0((String) it.next(), new char[]{'_'}, 0, 6);
            if (b0.size() != 2) {
                b0 = null;
            }
            if (b0 != null) {
                jSONArray.put(b0.get(0));
                jSONArray2.put(b0.get(1));
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", jSONArray2);
        jSONObject.put(UnityAdsConstants.SOURCE_ID_KEY, jSONArray);
        return jSONObject.toString();
    }

    public static final androidx.room.coroutines.c p(a.C0084a c0084a, String str, int i) {
        return new androidx.room.coroutines.c(c0084a, str, i);
    }

    public static final androidx.room.coroutines.c q(a.C0084a c0084a) {
        return new androidx.room.coroutines.c(c0084a);
    }

    public static final void r(VkContextMenu vkContextMenu, View view, boolean z) {
        if (bwt0.F(view).height() < view.getMeasuredHeight()) {
            vkContextMenu.g();
        } else {
            vkContextMenu.j(z);
        }
    }

    public static final Long s(Collection collection) {
        Long l;
        if (collection != null) {
            Iterator it = collection.iterator();
            long j = 0;
            while (it.hasNext()) {
                Long a = ((wto0) it.next()).a();
                j += a != null ? a.longValue() : 0L;
            }
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        if (l != null && l.longValue() == 0) {
            return null;
        }
        return l;
    }

    public static final long t(long j) {
        return (((int) Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final ProductPrice v(MarketPriceDto marketPriceDto) {
        String n = marketPriceDto.n();
        Integer f = marketPriceDto.f();
        return new ProductPrice(n, f != null ? f.intValue() : 0, marketPriceDto.l(), marketPriceDto.j());
    }

    public static final long w(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final q630 x(te2 te2Var) {
        return new b1m(te2Var, a5x.a);
    }

    @Override // xsna.zgy0
    public SQLiteDatabase a() {
        return null;
    }

    @Override // xsna.dc7
    public uvf c() {
        return null;
    }

    @Override // xsna.dc7
    public uvf d() {
        return null;
    }

    @Override // xsna.dc7
    public boolean e(int i) {
        return false;
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        switch (this.b) {
            case 8:
                edr edrVar = (edr) g5pVar;
                if (ota0Var == null) {
                    return null;
                }
                aa00 aa00Var = edrVar.a;
                if ((aa00Var != null ? aa00Var.c : null) == null) {
                    return ota0Var;
                }
                try {
                    for (ota0 ota0Var2 : aa00Var.c) {
                        float f = edrVar.b / 100.0f;
                        if (!(ota0Var instanceof ld7)) {
                            throw new IllegalArgumentException("image is not BitmapWrapper");
                        }
                        if (!(ota0Var2 instanceof ld7)) {
                            throw new IllegalArgumentException("lut is not BitmapWrapper");
                        }
                        Bitmap a = zbc.a(((ld7) ota0Var).a);
                        PhotoEditorEngine.i(a, zbc.a(((ld7) ota0Var2).a), f);
                        ota0Var = new ld7(a);
                    }
                    return ota0Var;
                } catch (ChronicleLowMemoryException e2) {
                    throw new LowMemoryException(e2.getMessage(), 2);
                }
            default:
                q5l0 q5l0Var = (q5l0) g5pVar;
                if (ota0Var == null) {
                    return null;
                }
                if (q5l0Var.I()) {
                    return ota0Var;
                }
                lyk0 lyk0Var = alg.a;
                return alg.a(ota0Var, q5l0Var.a);
        }
    }

    @Override // xsna.dc7
    public uvf g(int i) {
        return null;
    }

    @Override // xsna.dc7
    public int u() {
        return 0;
    }

    @Override // xsna.dc7
    public void a(int i, uvf uvfVar) {
    }

    @Override // xsna.dc7
    public void clear() {
    }

    @Override // xsna.dc7
    public void b(int i, uvf uvfVar) {
    }
}
