package xsna;

import android.content.Context;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.voip.VoipCallActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContentPositionApplier.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class mij extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mij(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qij.a((qij) this.receiver);
                break;
            case 1:
                vrt vrtVar = (vrt) this.receiver;
                Context mo2getContext = vrtVar.e.mo2getContext();
                if (mo2getContext != null) {
                    vrtVar.e(mo2getContext);
                }
                break;
            case 2:
                kvt kvtVar = (kvt) this.receiver;
                zrp zrpVar = kvt.o;
                kvtVar.k();
                break;
            case 3:
                ((com.vk.photo.editor.features.mlenhance.c) this.receiver).H();
                break;
            case 4:
                break;
            case 5:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                com.vk.registration.funnels.b.l();
                break;
            case 6:
                com.vk.registration.funnels.b bVar = (com.vk.registration.funnels.b) this.receiver;
                bVar.getClass();
                com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER, null, null, null, 30);
                break;
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i = VoipCallActivity.P;
                voipCallActivity.getClass();
                rq4.a.getClass();
                rq4.a(true);
                gau.c().d(voipCallActivity);
                voipCallActivity.Y1();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mij(Object obj, int i) {
        super(0, obj, qij.class, "updateAllConsiderResumeFlag", "updateAllConsiderResumeFlag()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, vrt.class, "onPermissionGranted", "onPermissionGranted()V", 0);
                break;
            case 5:
                super(0, obj, com.vk.registration.funnels.b.class, "onChooseEnterByMailPass", "onChooseEnterByMailPass()V", 0);
                break;
            case 6:
                super(0, obj, com.vk.registration.funnels.b.class, "onProceedToPhoneRevalidationOpened", "onProceedToPhoneRevalidationOpened()V", 0);
                break;
            default:
                break;
        }
    }
}
