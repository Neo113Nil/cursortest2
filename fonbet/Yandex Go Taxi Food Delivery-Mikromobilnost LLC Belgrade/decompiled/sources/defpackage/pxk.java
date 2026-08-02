package defpackage;

import android.content.Context;
import com.ybsdk.feature.divkit.internal.extensions.AbsCoordinatesExtensionHandler;
import com.ybsdk.feature.divkit.internal.extensions.ShimmerDivKitHandler;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final class pxk {
    public static final ivk a = new ivk(3);

    static {
        x4c x4cVar = hxk.b;
    }

    public static ujk a(Context context, kac kacVar, boolean z, int i) {
        if ((i & 2) != 0) {
            kacVar = new kac(context, 6, false);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        tjk tjkVar = new tjk(kacVar);
        tjkVar.e = new qlk(context, z);
        tjkVar.g = a;
        tjkVar.x = true;
        tjkVar.q = false;
        tjkVar.h = new dzj(context, 1);
        tjkVar.i = b.i(new Pair("display", new dzj(context, 2)), new Pair("YSTextCond", new sjk(context)));
        tjkVar.b(new gky0());
        tjkVar.b(new s4f0());
        tjkVar.b(new nnj());
        tjkVar.b(new ShimmerDivKitHandler());
        tjkVar.b(new pif());
        tjkVar.b(new AbsCoordinatesExtensionHandler());
        tjkVar.b(new j5s0());
        tjkVar.b(new fv60());
        tjkVar.b(new alm0());
        tjkVar.b(new mpn());
        tjkVar.b(new amf());
        return tjkVar.a();
    }
}
