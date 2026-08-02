package defpackage;

import android.content.Context;
import androidx.core.app.s0;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.order.external.tracking.c;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.startup.launch.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class mj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3y b;

    public /* synthetic */ mj(h3y h3yVar, int i) {
        this.a = i;
        this.b = h3yVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        h3y h3yVar = this.b;
        switch (i) {
            case 0:
                return (e) h3yVar.get();
            case 1:
                return (f) h3yVar.get();
            case 2:
                return (OkHttpClient) h3yVar.get();
            case 3:
                return (a) h3yVar.get();
            case 4:
                return (c) h3yVar.get();
            case 5:
                return (hqo) h3yVar.get();
            case 6:
                return (b) h3yVar.get();
            case 7:
                return (OkHttpClient) h3yVar.get();
            case 8:
                return ((kb20) h3yVar.get()).b();
            case 9:
                return (g) h3yVar.get();
            case 10:
                return (m) h3yVar.get();
            case 11:
                return (ajr) h3yVar.get();
            case 12:
                return (rgf0) h3yVar.get();
            default:
                return new s0((Context) h3yVar.get());
        }
    }
}
