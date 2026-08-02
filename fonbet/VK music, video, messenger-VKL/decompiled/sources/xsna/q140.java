package xsna;

import android.os.Parcelable;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.im.engine.models.messages.MsgFromUser;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q140 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ q140(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2 = ((wpp) obj).c.get(Integer.valueOf(this.b));
        MsgFromUser msgFromUser = obj2 instanceof MsgFromUser ? (MsgFromUser) obj2 : null;
        Parcelable ac = msgFromUser != null ? msgFromUser.ac(this.c) : null;
        AttachWithTranscription attachWithTranscription = ac instanceof AttachWithTranscription ? (AttachWithTranscription) ac : null;
        return Boolean.valueOf((msgFromUser == null || attachWithTranscription == null || !attachWithTranscription.I5()) ? false : true);
    }
}
