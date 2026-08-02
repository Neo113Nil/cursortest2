package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vkontakte.android.attachments.AudioAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zww implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zww(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                axw axwVar = (axw) this.c;
                UserId userId = (UserId) obj;
                com.vk.toggle.b.A.f(String.valueOf(userId.b));
                ((VkClientMultiAccountComponent) axwVar.c().a(fpf0.a(VkClientMultiAccountComponent.class))).Vc().a(userId);
                return s3q0.a;
            case 1:
                ((p870) ((ek40) this.c).b.getValue()).e(120, new AudioAttachment(((fa50) obj).a));
                return s3q0.a;
            default:
                return Boolean.valueOf(((tsx) ((o260) this.c).y.getValue()).a((String) obj));
        }
    }
}
