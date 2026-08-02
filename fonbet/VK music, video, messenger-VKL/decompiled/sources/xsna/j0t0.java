package xsna;

import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;

/* compiled from: VideoOfflineSettingsRepository.kt */
/* loaded from: classes.dex */
public interface j0t0 {
    public static final a a = a.a;

    /* compiled from: VideoOfflineSettingsRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final j0t0 STUB = new C3090a();

        /* compiled from: VideoOfflineSettingsRepository.kt */
        /* renamed from: xsna.j0t0$a$a, reason: collision with other inner class name */
        public static final class C3090a implements j0t0 {
            public final QualityOptionTypeDo b = QualityOptionTypeDo.ALWAYS_ASK;

            @Override // xsna.j0t0
            public final QualityOptionTypeDo a() {
                return this.b;
            }
        }

        public final j0t0 getSTUB() {
            return STUB;
        }
    }

    QualityOptionTypeDo a();
}
