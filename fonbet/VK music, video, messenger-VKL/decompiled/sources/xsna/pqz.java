package xsna;

import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import xsna.tj50;
import xsna.uv40;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pqz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pqz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                return ((tmd) obj).a;
            case 1:
                return k4g0.a((k4g0) obj, false, !r10.l, 2047);
            case 2:
                qgi0.r((tgi0) obj, "congratulationsImage");
                return s3q0.a;
            case 3:
                return new MediaPickerMviState(null, 0, null, false, null, MediaPickerMviState.Medias.Error.b, 31, null);
            case 4:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 5:
                return new t140(i);
            case 6:
                qgi0.r((tgi0) obj, "downloads_settings_by_network_setting");
                return s3q0.a;
            case 7:
                return new uv40.b(((tj50.a) obj).a(new svz(10), ao8.d));
            case 8:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 9:
                LinkedHashMap linkedHashMap = nx50.Q0;
                return Boolean.TRUE;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 11:
                return drm0.U(drm0.p0((String) obj).toString(), "at ");
            case 12:
                return (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c) obj;
            case 13:
                ArrayList arrayList = w3a0.a;
                w3a0.c(new PhoneValidationPendingEvent.Error((VkPhoneValidationErrorReason) obj));
                return s3q0.a;
            case 14:
                Throwable th = (Throwable) obj;
                L.i(th);
                if (!(th instanceof IllegalStateException)) {
                    cvk.u(R.string.common_network_error, false);
                }
                return s3q0.a;
            case 15:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Can not remove draft", (Throwable) obj));
                return s3q0.a;
            case 16:
                return ((PostingState.Editing) obj).i.x;
            case 17:
                qgi0.r((tgi0) obj, "PrivacyVideoForDonutsBackButton");
                return s3q0.a;
            case 18:
                int i2 = ProfileFabView.r;
                return s3q0.a;
            case 19:
                return Float.valueOf(((hfk) obj).getX0());
            case 20:
                return Boolean.valueOf(((thg0) obj).g);
            case 21:
                return s3q0.a;
            case 22:
                return Boolean.valueOf(((View) obj) instanceof Toolbar);
            case 23:
                View view = (View) obj;
                int i3 = yhi0.f1;
                view.requestFocus();
                mhy.j(view);
                return s3q0.a;
            case 24:
                return new ywi0.d(((tj50.a) obj).a(new i0r(20), ao8.d));
            case 25:
                return s3q0.a;
            case 26:
                cvk.u(R.string.live_general_error_description, false);
                return s3q0.a;
            case 27:
                return kd7.c((Bitmap) obj);
            case 28:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_info");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            default:
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get cached replies", (Throwable) obj));
                return s3q0.a;
        }
    }
}
