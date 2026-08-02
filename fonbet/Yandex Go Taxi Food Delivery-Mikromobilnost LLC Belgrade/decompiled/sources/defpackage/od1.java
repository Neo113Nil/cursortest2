package defpackage;

import com.yandex.mapkit.GeoObject;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final /* synthetic */ class od1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ GeoObject c;

    public /* synthetic */ od1(String str, GeoObject geoObject, int i) {
        this.a = i;
        this.b = str;
        this.c = geoObject;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        GeoObject geoObject = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return b.i(new Pair("type", "onAdvertPinHidden"), new Pair("geoObject", rsq0.d(str, geoObject)));
            case 1:
                return b.i(new Pair("type", "onAdvertPinTapped"), new Pair("geoObject", rsq0.d(str, geoObject)));
            default:
                return b.i(new Pair("type", "onAdvertPinShown"), new Pair("geoObject", rsq0.d(str, geoObject)));
        }
    }
}
