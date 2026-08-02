package xsna;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.log.L;
import com.vk.photos.root.selectalbum.domain.h;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import java.util.List;
import java.util.Optional;
import kotlin.collections.EmptyList;
import xsna.lew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g2h0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g2h0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) obj;
                return new zho0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 1:
                return h.c.a;
            case 2:
                return new e6l0((ViewGroup) obj);
            case 3:
                return Integer.valueOf(((k9l0) obj).a.size());
            case 4:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_question");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 5:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 6:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 7:
                cvk.w("Error", false);
                return s3q0.a;
            case 8:
                Optional optional = (Optional) obj;
                VideoFile videoFile = optional != null ? (VideoFile) optional.orElse(null) : null;
                return videoFile == null ? io.reactivex.rxjava3.core.q.T(EmptyList.b) : new ftp(videoFile).f;
            case 9:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).h;
            case 10:
                Msg msg = (Msg) obj;
                if (msg.Nb() && (msg instanceof MsgFromUser)) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 11:
                return s3q0.a;
            case 12:
                return s3q0.a;
            case 13:
                return new lew0.b.a((jew0) obj);
            case 14:
                L.i((Throwable) obj);
                return s3q0.a;
            case 15:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 16:
                int i = VoipSelectEffectInCallFragment.Q;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            default:
                return s3q0.a;
        }
    }
}
