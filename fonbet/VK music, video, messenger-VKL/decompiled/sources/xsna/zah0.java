package xsna;

import com.vk.clips.design.view.seek.ClipsSeekBar;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zah0 implements ClipsSeekBar.a, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zah0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.a
    public void a(float f) {
        izs izsVar = (izs) this.b;
        if (((Boolean) ((wh50) this.c).getValue()).booleanValue()) {
            izsVar.invoke(Float.valueOf(f));
        }
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onWaitingVerificationCode$27((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }
}
