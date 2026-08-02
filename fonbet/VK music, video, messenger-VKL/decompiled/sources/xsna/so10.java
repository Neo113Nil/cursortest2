package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsSettingsIdsDto;
import com.vk.clips.sdk.shared.api.deps.clips.ShortVideoUserSettings;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MaxSkipCountClosingAdInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class so10 implements ro10 {
    public final tgj0 a;
    public final rgj0 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public so10(tgj0 tgj0Var, rgj0 rgj0Var) {
        this.a = tgj0Var;
        this.b = rgj0Var;
    }

    @Override // xsna.ro10
    public final void a() {
        ShortVideoUserSettings shortVideoUserSettings = this.b.get();
        boolean compareAndSet = this.c.compareAndSet(false, true);
        if (shortVideoUserSettings == null && compareAndSet) {
            io.reactivex.rxjava3.internal.operators.single.d0 d0Var = this.a.get(Collections.singletonList(ShortVideoGetUserSettingsSettingsIdsDto.POST_AD_BANNER_INTERVAL));
            asu0 asu0Var = asu0.a;
            new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.o(d0Var.q(asu0Var.c()).m(asu0Var.d()), new kl6(new tcn(this, 18), 26)), new v71(this, 5)).subscribe();
        }
    }

    @Override // xsna.ro10
    public final int get() {
        ShortVideoUserSettings shortVideoUserSettings = this.b.get();
        return shortVideoUserSettings != null ? shortVideoUserSettings.b : ShortVideoUserSettings.c.b;
    }
}
