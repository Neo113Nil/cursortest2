package xsna;

import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;

/* compiled from: EasyPromoteSettingsRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class lwo implements kwo {
    public final io.reactivex.rxjava3.subjects.f<EasyPromoteSettings> a = new io.reactivex.rxjava3.subjects.f<>();
    public EasyPromoteSettings b;

    @Override // xsna.kwo
    public final void a(EasyPromoteSettings easyPromoteSettings) {
        this.b = easyPromoteSettings;
        this.a.onNext(easyPromoteSettings);
    }

    @Override // xsna.kwo
    public final EasyPromoteSettings b() {
        EasyPromoteSettings easyPromoteSettings = this.b;
        return easyPromoteSettings == null ? new EasyPromoteSettings(7, 450, null, false) : easyPromoteSettings;
    }
}
