package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.factory.ConversationFactoryCreator;
import ru.ok.android.webrtc.rotation.RotationProvider;

/* compiled from: ConversationFactoryCreator.kt */
/* loaded from: classes7.dex */
public final class prj implements RotationProvider {
    public final /* synthetic */ ConversationFactoryCreator a;
    public final /* synthetic */ zzz b;

    public prj(ConversationFactoryCreator conversationFactoryCreator, zzz zzzVar) {
        this.a = conversationFactoryCreator;
        this.b = zzzVar;
    }

    @Override // ru.ok.android.webrtc.rotation.RotationProvider
    public final float currentRotation() {
        return !((Boolean) this.a.b.invoke()).booleanValue() ? this.b.c() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
