package defpackage;

import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class l15 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ l15(String str, boolean z, boolean z2, Long l) {
        this.a = 2;
        this.w = str;
        this.b = z;
        this.c = z2;
        this.x = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [sq01] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, tq01] */
    /* JADX WARN: Type inference failed for: r5v4, types: [tq01] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                sq01 sq01Var = (sq01) obj3;
                Text text = (Text) obj2;
                Object obj4 = sq01Var.b.get(ItemType.MIDDLE_NAME);
                vqj0 vqj0Var = obj4 instanceof vqj0 ? (vqj0) obj4 : null;
                if (vqj0Var != null) {
                    sq01Var = sq01Var.e(new rqj0[]{vqj0.c(vqj0Var, null, this.b, text, null, false, 32743)});
                }
                Object obj5 = sq01Var.b.get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
                wqj0 wqj0Var = obj5 instanceof wqj0 ? (wqj0) obj5 : null;
                return wqj0Var == null ? sq01Var : sq01Var.e(wqj0.c(wqj0Var, z));
            case 1:
                bt5 bt5Var = (bt5) obj3;
                mka0 mka0Var = (mka0) obj;
                bt5Var.o = cvu0.x(mka0Var.a, "payment:", false);
                evv evvVar = new evv(mka0Var.a, bt5Var.a.c, this.b, bt5Var.b, (rg7) obj2, this.c);
                rwo rwoVar = bt5Var.g;
                iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Инициализация платежа", "initiated_payment");
                md51 g = bt5Var.e.a.f(evvVar, new rv10(22), NetworkServiceRetryingStrategy.retryOnce).g(new w04(12, bt5Var, mka0Var));
                ((y22) rwoVar).b(f, g);
                return g;
            default:
                String str = (String) obj3;
                boolean z2 = this.b;
                Long l = (Long) obj2;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("INSERT INTO chat_muting VALUES (?, ?, ?, ?)");
                try {
                    T0.g1(1, str);
                    T0.b(2, z2 ? 1L : 0L);
                    T0.b(3, z ? 1L : 0L);
                    T0.b(4, l.longValue());
                    T0.q();
                    long t = jx81.t(oll0Var);
                    T0.close();
                    return Long.valueOf(t);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ l15(Object obj, boolean z, Object obj2, boolean z2, int i) {
        this.a = i;
        this.w = obj;
        this.b = z;
        this.x = obj2;
        this.c = z2;
    }
}
