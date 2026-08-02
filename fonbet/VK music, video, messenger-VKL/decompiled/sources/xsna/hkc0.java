package xsna;

import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.im.ui.components.dialogs_list.f;
import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import com.vk.music.mixsettings.MixSettingsEntity;
import java.util.Map;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.h8z0;
import xsna.mxy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hkc0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.b, ThreadStuckAnalyzer.a, Optional.Action, t8z0, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hkc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        ((fkz0) this.c).getClass();
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        switch (this.b) {
            case 9:
                ((VerificationController) this.c).lambda$onCompleteInternal$24((VerificationListener) obj);
                break;
            default:
                mxy0 mxy0Var = (mxy0) this.c;
                String str = (String) obj;
                mxy0.a aVar = mxy0Var.i;
                if (aVar.d == 0) {
                    aVar.d = 3;
                }
                tnf tnfVar = aVar.e;
                if (tnfVar != null) {
                    o8z0.g.removeCallbacks(tnfVar);
                    aVar.e = null;
                }
                giy0 giy0Var = mxy0Var.c.T;
                if (str == null) {
                    str = "Playable interactive failed to load";
                }
                giy0Var.c(999, 5501, str);
                mxy0Var.b();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((l850) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.o) ((z6u) this.c).invoke(obj);
            case 2:
                return (StoryBoxPrepared) ((mnd) this.c).invoke(obj);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            default:
                return (Boolean) ((wss0) this.c).invoke(obj);
            case 7:
                return (UGCChatSettingsModel) ((gwp0) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((l850) this.c).invoke(obj);
            case 10:
                return (Map) ((wss0) this.c).invoke(obj);
            case 11:
                return (MixSettingsEntity) ((wss0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer.a
    public void b(ThreadStuckAnalyzer.ThreadStuckException threadStuckException) {
        ThreadStuckAnalyzer threadStuckAnalyzer = (ThreadStuckAnalyzer) this.c;
        f100 f100Var = threadStuckAnalyzer.b;
        if (f100Var != null) {
            f100Var.e("ThreadWatchDog", threadStuckAnalyzer.j);
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        ((vtz) this.c).getClass();
        throw null;
    }

    public /* synthetic */ hkc0(vtz vtzVar, smm0 smm0Var) {
        this.b = 3;
        this.c = vtzVar;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        com.vk.im.ui.components.dialogs_list.f fVar = (com.vk.im.ui.components.dialogs_list.f) this.c;
        f.b bVar = (f.b) obj;
        Throwable th = (Throwable) obj2;
        if (th == null) {
            fVar.h(bVar);
        } else {
            fVar.g(th);
        }
    }
}
