package xsna;

import android.media.MediaFormat;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.group.Group;
import com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment;
import com.vk.media.MediaUtils;
import com.vk.music.playlist.display.domain.e;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jb5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jb5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [T, com.vk.media.MediaUtils$AudioConfig] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mb5.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 1:
                BookingRecordCompletedScreenFragment bookingRecordCompletedScreenFragment = (BookingRecordCompletedScreenFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = BookingRecordCompletedScreenFragment.Q;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-919547758, intValue, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment.onCreateView.<anonymous>.<anonymous> (BookingRecordCompletedScreenFragment.kt:65)");
                    }
                    nzw nzwVar = bookingRecordCompletedScreenFragment.P;
                    qcy<Object> qcyVar = BookingRecordCompletedScreenFragment.Q[0];
                    mu7 mu7Var = (mu7) nzwVar.getValue();
                    boolean y = aVar.y(bookingRecordCompletedScreenFragment);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        BookingRecordCompletedScreenFragment.b bVar = new BookingRecordCompletedScreenFragment.b(1, bookingRecordCompletedScreenFragment, BookingRecordCompletedScreenFragment.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/onlinebooking/impl/completed/pesentation/mvi2/BookingRecordCompletedScreenEvent;)V", 0);
                        aVar.R(bVar);
                        x = bVar;
                    }
                    fu7.a(mu7Var, (izs) ((fcy) x), null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ClipSearchRootVh clipSearchRootVh = (ClipSearchRootVh) obj3;
                String str = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                if (clipSearchRootVh.D.r instanceof vyh0) {
                    clipSearchRootVh.v = str;
                    clipSearchRootVh.w = null;
                    clipSearchRootVh.q.O(str, searchInputMethod);
                    CatalogConfiguration catalogConfiguration = clipSearchRootVh.m.b.s;
                    if ((catalogConfiguration instanceof vbd ? (vbd) catalogConfiguration : null) != null) {
                        drm0.N(str);
                    }
                }
                break;
            case 3:
                int i2 = ClipsReportFragment.V;
                cvk.u(R.string.report_send_success, true);
                ((ClipsReportFragment) obj3).finish();
                break;
            case 4:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) obj3).c.invoke(new a.d((Group) obj, (String) obj2));
                break;
            case 5:
                break;
            case 6:
                ((com.vk.music.playlist.display.domain.b) obj3).T(new e.i((String) obj, (DownloadingState) obj2));
                break;
            case 7:
                dlv0 dlv0Var = (dlv0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1747173450, intValue2, -1, "com.vk.draftslist.impl.ui.view.DraftsListScreen.<anonymous>.<anonymous> (DraftsListScreen.kt:43)");
                    }
                    zkv0.d(dlv0Var, null, cdi.d, aVar2, 384, 2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 8:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                MediaFormat mediaFormat = (MediaFormat) obj2;
                if (mediaFormat != null) {
                    String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : null;
                    if (string != null) {
                        p490.k(mediaFormat);
                        Long valueOf = mediaFormat.containsKey("durationUs") ? Long.valueOf(mediaFormat.getLong("durationUs")) : null;
                        long longValue = valueOf != null ? valueOf.longValue() : 0L;
                        Integer n = p490.n(BadConnectionSignaling.KEY_BAD_NET_BITRATE, mediaFormat);
                        int intValue3 = n != null ? n.intValue() : 0;
                        Integer n2 = p490.n("sample-rate", mediaFormat);
                        int intValue4 = n2 != null ? n2.intValue() : 0;
                        Integer n3 = p490.n("channel-count", mediaFormat);
                        ref$ObjectRef.element = new MediaUtils.AudioConfig(longValue, intValue3, intValue4, string, n3 != null ? n3.intValue() : 0);
                        break;
                    }
                }
                break;
            case 9:
                break;
            case 10:
                b78 b78Var = (b78) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1137718092, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.MusicStandaloneBottomPlayer.<anonymous>.<anonymous> (MusicStandaloneBottomPlayer.kt:121)");
                    }
                    n750.e(b78Var, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr2 = OnboardingPromoFragment.Q;
                ((OnboardingPromoFragment) obj3).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jb5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
