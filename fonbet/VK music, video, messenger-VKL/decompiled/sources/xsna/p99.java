package xsna;

import android.view.View;
import com.vk.api.generated.users.dto.UsersSearchResponseDto;
import com.vk.design.demo.presentation.DesignDemoFragment;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.exceptions.RestrictedVideoFileException;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ca9;
import xsna.xn50;

/* compiled from: CallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class p99 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p99(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                m99 m99Var = (m99) this.receiver;
                if (m99Var.j().c instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, new ca9.a(th), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                DesignDemoFragment designDemoFragment = (DesignDemoFragment) this.receiver;
                designDemoFragment.getClass();
                xn50.a.c(designDemoFragment, (h3m) obj);
                return s3q0.a;
            case 3:
                shm shmVar = (shm) this.receiver;
                atk0 atk0Var = shmVar.k;
                h6n0 h6n0Var = atk0Var.c;
                atk0 a = atk0.a(atk0Var, null, h6n0.a(h6n0Var, m420.a(h6n0Var.a, true, 0, 11)), 3);
                shmVar.k = a;
                shmVar.n.onNext(a.c);
                shm.s.a((Throwable) obj);
                return s3q0.a;
            case 4:
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                y9n y9nVar = (y9n) this.receiver;
                int i = y9n.S;
                srl0 srl0Var = new srl0(y9nVar.getContext(), y9nVar.g.a);
                srl0Var.e = storiesContainer;
                if (!storiesContainer.Pb() && !fsk.B(storiesContainer)) {
                    z = true;
                }
                srl0Var.d = z;
                srl0Var.a();
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                UsersSearchResponseDto usersSearchResponseDto = (UsersSearchResponseDto) obj;
                h1r0 h1r0Var = (h1r0) this.receiver;
                h1r0Var.getClass();
                return new p2v0(usersSearchResponseDto.getCount(), h1r0Var.b(usersSearchResponseDto.d()));
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                View view = ((jcu) this.receiver).u;
                view.setAlpha(booleanValue ? 1.0f : 0.4f);
                view.setEnabled(booleanValue);
                return s3q0.a;
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                ((dv60) this.receiver).c((xh60) obj);
                return s3q0.a;
            case 10:
                ((hxd0) this.receiver).w6((ixd0) obj);
                return s3q0.a;
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                Throwable th2 = (Throwable) obj;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.receiver;
                VideoAutoPlay.a aVar = VideoAutoPlay.q0;
                videoAutoPlay.getClass();
                if (!(th2 instanceof RestrictedVideoFileException)) {
                    h84 h84Var = new h84(th2, videoAutoPlay, PlayerError.ERROR_SERVER, 5);
                    if (videoAutoPlay.G) {
                        videoAutoPlay.n.post(new q44(h84Var, 14));
                    } else {
                        h84Var.invoke();
                    }
                }
                return s3q0.a;
            default:
                return Integer.valueOf(((knw) this.receiver).c(((Number) obj).intValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p99(Object obj, int i) {
        super(1, obj, m99.class, "onInvalidateParticipantsError", "onInvalidateParticipantsError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, shm.class, "onRequestByActualError", "onRequestByActualError(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
            case 6:
            case 10:
            default:
                break;
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, jcu.class, "updateApplyButton", "updateApplyButton(Z)V", 0);
                break;
            case 8:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, dv60.class, "sendEvent", "sendEvent(Lcom/vk/mvi/MviEvent;)V", 0);
                break;
            case 11:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
