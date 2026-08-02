package xsna;

import android.view.ViewGroup;
import androidx.media3.exoplayer.source.j;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.im.ui.components.viewcontrollers.msg_list.OverscrollBehavior;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class yj0 implements io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.a0, j7j, g0u0, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yj0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.g0u0
    public void a() {
        OverscrollBehavior overscrollBehavior = (OverscrollBehavior) this.b;
        ViewGroup viewGroup = (ViewGroup) this.c;
        if (overscrollBehavior.b) {
            viewGroup.invalidate();
        }
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        j.a aVar = (j.a) this.b;
        ((androidx.media3.exoplayer.source.j) obj).x(aVar.a, aVar.b, (pr10) this.c);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.kb0.a((yads.ye) this.b, (yads.in1) this.c, (yads.af) obj);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        AdaptersKt.changeStateCompletable$lambda$0((CallsAudioManager) this.b, (CallsAudioManager.State) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        eml emlVar = (eml) this.b;
        pdo pdoVar = (pdo) this.c;
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        s53 s53Var = new s53(emlVar, pdoVar, yVar);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(s53Var);
    }
}
