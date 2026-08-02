package com.yandex.go.navigator.gas_stations.providers;

import android.content.Context;
import com.yandex.go.navigator.gas_stations.providers.a;
import com.yandex.runtime.image.ImageProvider;
import defpackage.i3y;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuj0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final zuj0 c;
    public final b d;
    public final i3y e;
    public final i3y f;

    public a(Context context, tt2 tt2Var, zuj0 zuj0Var, b bVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = bVar;
        final int i = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: hc50
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        return ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, aVar.a)));
                    default:
                        return ImageProvider.fromBitmap(u8b1.g(tje.y(v2h0.ic_point_blue, aVar.a)));
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.a.a(new sls(this) { // from class: hc50
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        return ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, aVar.a)));
                    default:
                        return ImageProvider.fromBitmap(u8b1.g(tje.y(v2h0.ic_point_blue, aVar.a)));
                }
            }
        });
    }

    public final Object a(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        this.b.getClass();
        return tje.k0(uyj.a, new NavigatorGasStationImageProvider$createGasStationImageProvider$2(z, this, str2, str, null), continuationImpl);
    }
}
