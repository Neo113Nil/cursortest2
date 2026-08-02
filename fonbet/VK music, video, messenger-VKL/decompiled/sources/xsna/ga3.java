package xsna;

import android.media.MediaExtractor;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ga3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ga3(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM app_values WHERE storage_name = ?");
                try {
                    V0.D3(1, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                ((MediaExtractor) obj).setDataSource(this.c);
                return s3q0.a;
            case 2:
                return NotificationsNotificationSettingRedesignDto.a((NotificationsNotificationSettingRedesignDto) obj, og70.a(this.c), null, null, 247);
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_options_tag");
                qgi0.h(tgi0Var, this.c);
                return s3q0.a;
        }
    }
}
