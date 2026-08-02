package xsna;

import com.vk.superapp.core.api.models.SendOtpInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SuspiciousAuthRepository.kt */
/* loaded from: classes15.dex */
public final class bln0 implements com.vk.auth.suspicious_auth.b {
    public final AtomicReference<SendOtpInfo> a = new AtomicReference<>(null);

    @Override // com.vk.auth.suspicious_auth.b
    public final void a(SendOtpInfo sendOtpInfo) {
        this.a.set(sendOtpInfo);
    }

    @Override // com.vk.auth.suspicious_auth.b
    public final SendOtpInfo b() {
        return this.a.get();
    }
}
