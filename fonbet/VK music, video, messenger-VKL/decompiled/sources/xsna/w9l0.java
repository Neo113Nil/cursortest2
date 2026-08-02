package xsna;

import android.content.Intent;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.log.L;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.voip.VoipCallActivity;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.Iterator;
import java.util.List;
import xsna.h1o0;
import xsna.p4g;
import xsna.q55;
import xsna.u8r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w9l0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ w9l0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                grt0 grt0Var = (grt0) obj;
                int i = StickersDrawingViewGroup.j0;
                if (grt0Var.u) {
                    grt0Var.r();
                } else {
                    grt0Var.u();
                }
                return s3q0.a;
            case 1:
                int i2 = StoryMediaPickerFragment.d0;
                return s3q0.a;
            case 2:
                Throwable th = (Throwable) obj;
                if (!h03.a(th)) {
                    return io.reactivex.rxjava3.core.g.e(th);
                }
                com.vk.core.utils.newtork.b.a.getClass();
                return new io.reactivex.rxjava3.internal.operators.flowable.r(com.vk.core.utils.newtork.b.e.D0(BackpressureStrategy.LATEST), new ugm0(new x620(27), 1)).n(1L);
            case 3:
                return ((PayMethodData) obj).h();
            case 4:
                hy00 hy00Var = (hy00) obj;
                return new h1o0.a(Long.valueOf(hy00Var.a), hy00Var.c);
            case 5:
                qgi0.r((tgi0) obj, "ad_banner_label");
                return s3q0.a;
            case 6:
                return Long.valueOf(((UserStorageModel) obj).b);
            case 7:
                return new u8r0.a.b.C3793b((ke3) obj);
            case 8:
                L.i((Throwable) obj);
                return s3q0.a;
            case 9:
                return k15.B((VideoFile) obj);
            case 10:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto == null) {
                    return null;
                }
                new j2r0();
                return j2r0.a(usersUserFullDto);
            case 11:
                return ((kct0) obj).c;
            case 12:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, null, null, true, false, false, 7167);
            case 13:
                int i3 = VkLinkedText.j;
                return s3q0.a;
            case 14:
                VkPhoneValidationErrorReason vkPhoneValidationErrorReason = (VkPhoneValidationErrorReason) obj;
                q55 q55Var = q55.a;
                List y0 = j5g.y0(q55.b);
                q55.b bVar = new q55.b(par0.a);
                p4g.a aVar = p4g.a;
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    try {
                        ((s25) it.next()).v(vkPhoneValidationErrorReason);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th2) {
                        bVar.invoke(th2);
                    }
                }
                return s3q0.a;
            case 15:
                Throwable th3 = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th3);
                h03.b(th3);
                return s3q0.a;
            case 16:
                Intent intent = (Intent) obj;
                int i4 = VoipCallActivity.P;
                if (intent == null) {
                    com.vk.voip.ui.c.b.getClass();
                    rah0 rah0Var = com.vk.voip.ui.c.g;
                    if (rah0Var == null) {
                        rah0Var = null;
                    }
                    rah0Var.getClass();
                    L.G("ScreenCaptureManagerImpl", "Screen cast permission denied");
                    rah0Var.e(null);
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    rah0 rah0Var2 = com.vk.voip.ui.c.g;
                    (rah0Var2 != null ? rah0Var2 : null).e(intent);
                }
                return s3q0.a;
            case 17:
                return ((wj8) obj).a;
            default:
                int i5 = c2x0.o1;
                L.g("VoipShareQRCodeModalDialog", (Throwable) obj);
                return s3q0.a;
        }
    }
}
