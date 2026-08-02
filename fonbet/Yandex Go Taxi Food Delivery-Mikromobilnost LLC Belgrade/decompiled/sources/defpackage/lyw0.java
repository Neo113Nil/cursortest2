package defpackage;

import com.yandex.go.mainscreen.superapp.orders.presentation.ui.swipeable.SwipeableTrackingCardDeferButtonView;
import com.yandex.go.superapp.orders.card.OrderCardView;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final /* synthetic */ class lyw0 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lyw0(float f, float f2, qyw0 qyw0Var, float f3, float f4, float f5) {
        this.b = f;
        this.c = f2;
        this.z = qyw0Var;
        this.w = f3;
        this.x = f4;
        this.y = f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008a, code lost:
    
        if (r6 > r3) goto L15;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.y;
        float f2 = this.x;
        float f3 = this.w;
        float f4 = this.c;
        float f5 = this.b;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                qyw0 qyw0Var = (qyw0) obj2;
                float floatValue = ((Float) obj).floatValue();
                float b = g8e.b(f4, f5, floatValue, f5);
                OrderCardView orderCardView = qyw0Var.R;
                float f6 = 1.0f - floatValue;
                orderCardView.setAlpha(f3 * f6);
                orderCardView.setTranslationX(b);
                SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView = qyw0Var.W;
                if (xw31.n(qyw0Var.a.getContext())) {
                    break;
                } else {
                    float f7 = -f;
                    if (b < f7) {
                        b = f7;
                    }
                }
                f = b;
                SwipeableTrackingCardDeferButtonView.updateRevealProgressByTranslation$default(swipeableTrackingCardDeferButtonView, f, false, 2, null);
                swipeableTrackingCardDeferButtonView.setAlpha(f2 * f6);
                break;
            default:
                c1y c1yVar = (c1y) obj;
                qam.g0(c1yVar, ((d190) obj2).b, (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f5) << 32), (Float.floatToRawIntBits(f3 - (f5 * 2.0f)) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), i3r.a, 224);
                c1yVar.a();
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ lyw0(d190 d190Var, float f, float f2, float f3, float f4, float f5) {
        this.z = d190Var;
        this.b = f;
        this.c = f2;
        this.w = f3;
        this.x = f4;
        this.y = f5;
    }
}
