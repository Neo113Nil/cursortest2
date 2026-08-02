package xsna;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.m680;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sz7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mqv a;
        Integer num;
        String f;
        int i;
        switch (this.b) {
            case 0:
                o.a aVar = (o.a) this.c;
                i7k0 i7k0Var = (i7k0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(i7k0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(488203589, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuView.<anonymous>.<anonymous> (BookingStartScreen.kt:173)");
                    }
                    q630 E = ahn.E(q630.a.a, "cancel_record_snackbar_content");
                    BookingActionResult bookingActionResult = aVar.l;
                    if (bookingActionResult == null) {
                        aVar2.K(1314009900);
                        aVar2.j();
                        a = null;
                    } else {
                        aVar2.K(1012218741);
                        a = bookingActionResult.a(aVar2);
                        aVar2.j();
                    }
                    String message = i7k0Var.getMessage();
                    BookingActionResult bookingActionResult2 = aVar.l;
                    if (bookingActionResult2 == null || (i = BookingActionResult.b.$EnumSwitchMapping$0[bookingActionResult2.ordinal()]) == 1) {
                        num = null;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num = Integer.valueOf(R.string.booking_service_cancellation_failure_description);
                    }
                    if (num == null) {
                        aVar2.K(1314192924);
                        aVar2.j();
                        f = null;
                    } else {
                        f = l4.f(aVar2, 1314192925, num, aVar2, 0);
                    }
                    okv0.b(wlb0.m(message, f, null, aVar2, 4), E, a, null, null, aVar2, 48, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                ((com.vk.voip.ui.groupcalls.grid.a) this.c).T4((View) obj);
                return s3q0.a;
            case 2:
                m680 m680Var = (m680) this.c;
                int intValue2 = ((Integer) obj).intValue();
                List list = (List) obj2;
                Activity activity = (Activity) obj3;
                ImageViewer d = myc0.d();
                m680.a b = m680Var.b();
                NewsEntry newsEntry = m680Var.i;
                String Bb = newsEntry instanceof Post ? ((Post) newsEntry).Bb() : null;
                s1c0 s1c0Var = m680Var.l;
                return ImageViewer.f(d, intValue2, list, activity, b, null, null, null, true, Bb, s1c0Var != null ? s1c0Var.H : true, 880);
            case 3:
                bue0 bue0Var = (bue0) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(q630Var) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1672274944, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlaybackQueueItem.Content.<anonymous>.<anonymous> (RadioPlaybackQueueItem.kt:79)");
                    }
                    if (((Boolean) ((zak0) bue0Var.b).getValue()).booleanValue()) {
                        aVar3.K(1417237181);
                        p6b0.a(p6b0.a, ((Boolean) ((zak0) bue0Var.c).getValue()).booleanValue(), ahn.E(q630.a.a, "playingIndicator").g(q630Var), aVar3, 6);
                    } else {
                        aVar3.K(1413780898);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-676940116, intValue4, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsClips.<anonymous> (SettingsScreen.kt:116)");
                    }
                    float f2 = 12;
                    n3j0.a(0, aVar4, izsVar, s200.H(q630.a.a, f2, 6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                ((ktv0) this.c).c((Path) obj, ((mxj0) obj2).a);
                return s3q0.a;
        }
    }
}
