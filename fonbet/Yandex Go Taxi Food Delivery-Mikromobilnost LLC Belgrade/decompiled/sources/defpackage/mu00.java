package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientFactory;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final /* synthetic */ class mu00 implements tu00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OkHttpClient b;

    public /* synthetic */ mu00(OkHttpClient okHttpClient, int i) {
        this.a = i;
        this.b = okHttpClient;
    }

    @Override // defpackage.tu00
    public final OkHttpClient a(yd5 yd5Var) {
        OkHttpClient create$lambda$0;
        int i = this.a;
        OkHttpClient okHttpClient = this.b;
        switch (i) {
            case 0:
                return okHttpClient;
            default:
                create$lambda$0 = MapiClientFactory.create$lambda$0(okHttpClient, yd5Var);
                return create$lambda$0;
        }
    }
}
