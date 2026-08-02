package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.internal.entities.TechCallInfoMessage;

/* loaded from: classes15.dex */
public final class e9y extends icy0 {
    public final /* synthetic */ int e;
    public final Resources f;
    public final kw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9y(String[] strArr, Resources resources, kw kwVar, boolean z, int i) {
        super(false, strArr, resources, z);
        this.e = i;
        switch (i) {
            case 1:
                super(true, strArr, resources, z);
                this.f = resources;
                this.g = kwVar;
                break;
            default:
                this.f = resources;
                this.g = kwVar;
                break;
        }
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object n(TechCallInfoMessage techCallInfoMessage) {
        int i = this.e;
        kw kwVar = this.g;
        Resources resources = this.f;
        switch (i) {
            case 0:
                CallInfo callInfo = techCallInfoMessage.callInfo;
                int i2 = callInfo.callStatus;
                if (i2 == 1) {
                    return resources.getString(oyh0.call_accepted, kwVar.b(callInfo.duration));
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return resources.getString(oyh0.call_declined);
                    }
                    if (i2 == 4) {
                        return resources.getString(oyh0.call_failed);
                    }
                    if (i2 != 5) {
                        return resources.getString(oyh0.tech_message_audio_call);
                    }
                }
                return resources.getString(oyh0.call_missed);
            default:
                CallInfo callInfo2 = techCallInfoMessage.callInfo;
                int i3 = callInfo2.callStatus;
                if (i3 == 1) {
                    return resources.getString(oyh0.call_accepted, kwVar.b(callInfo2.duration));
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return resources.getString(oyh0.call_declined);
                    }
                    if (i3 == 4) {
                        return resources.getString(oyh0.call_failed);
                    }
                    if (i3 != 5) {
                        return resources.getString(oyh0.tech_message_audio_call);
                    }
                }
                return resources.getString(oyh0.call_canceled_for_caller_text);
        }
    }
}
