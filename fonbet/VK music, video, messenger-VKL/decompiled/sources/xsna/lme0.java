package xsna;

import com.google.zxing.client.result.ParsedResult;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public class lme0 extends com.vk.qrcode.c {
    public final a g;
    public QRTypes$SubType h;

    public lme0(ParsedResult parsedResult, boolean z) {
        super(parsedResult, z);
        this.g = new a(z);
        this.h = QRTypes$SubType.LINK_INNER;
    }

    @Override // xsna.q76
    public final yp80 m() {
        return this.g;
    }

    @Override // com.vk.qrcode.c, xsna.q76
    public final QRTypes$SubType o() {
        return this.h;
    }

    /* compiled from: QRTypes.kt */
    public static final class a implements yp80 {
        public final /* synthetic */ boolean c;

        public a(boolean z) {
            this.c = z;
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
            QRTypes$SubType qRTypes$SubType = z ? QRTypes$SubType.LINK_CHANNEL : QRTypes$SubType.LINK_GROUP_CHAT;
            lme0 lme0Var = lme0.this;
            lme0Var.h = qRTypes$SubType;
            QRStatsTracker qRStatsTracker = QRStatsTracker.a;
            QRStatsTracker.f(QRTypes$Type.LINK, qRTypes$SubType, false, lme0Var.r(), this.c);
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
        }
    }
}
