package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.preference.Preference;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nw6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nw6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 0;
        int i3 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((pw6) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                BookingPreloaderFragment bookingPreloaderFragment = (BookingPreloaderFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(22948205, intValue, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment.onCreateView.<anonymous>.<anonymous> (BookingPreloaderFragment.kt:70)");
                    }
                    nzw nzwVar = bookingPreloaderFragment.Q;
                    qcy<Object> qcyVar = BookingPreloaderFragment.S[0];
                    us7 us7Var = (us7) nzwVar.getValue();
                    boolean y = aVar.y(bookingPreloaderFragment);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new s6(bookingPreloaderFragment, 12);
                        aVar.R(x);
                    }
                    rs7.a(us7Var, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                CatalogMviVh catalogMviVh = (CatalogMviVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1516440698, intValue2, -1, "com.vk.catalog2.common.ui.holders.CatalogMviVh.createView.<anonymous>.<anonymous> (CatalogMviVh.kt:73)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-769728075, new a86(catalogMviVh, i3), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                qrb qrbVar = (qrb) obj3;
                bwt0.o0(qrbVar.m, qrbVar.c.f(R.attr.vk_ui_text_accent));
                break;
            case 4:
                ((v8f) ((ClipFeedListFragment) obj3).b0.getValue()).b((View) obj, (m7f) obj2);
                break;
            case 5:
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                o2l.a.getClass();
                o2l.j("__dbg_video_ad_creative_type", charSequence);
                Preference findPreference = ((DebugDevSettingsFragment) obj3).findPreference("__dbg_video_ad_creative_type");
                int length = charSequence.length();
                while (true) {
                    if (i2 < length) {
                        int codePointAt = charSequence.codePointAt(i2);
                        if (Character.isWhitespace(codePointAt)) {
                            i2 += Character.charCount(codePointAt);
                        }
                    } else {
                        charSequence = "creativeType";
                    }
                }
                findPreference.I(charSequence);
                break;
            case 6:
                ((jis0) obj3).invoke((UxpollsGetResponseDto) obj, (Throwable) obj2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((t0o) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                j15 j15Var = (j15) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-337139921, intValue3, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioViewHolder.setupShimmers.<anonymous> (ProfileContentAudioViewHolder.kt:270)");
                    }
                    rrv0.d(null, null, null, null, kai.c(427246164, new u61(j15Var, 10), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 9:
                i5n0 i5n0Var = (i5n0) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                lvc0 lvc0Var = i5n0Var.i;
                isiVar.c = new ohz(isiVar.a(new ac0(sj50Var, lvc0Var)), isiVar.a(new yb0(sj50Var, lvc0Var)), isiVar.a(new xb0(sj50Var, lvc0Var)), isiVar.a(new zb0(lvc0Var, i5n0Var.f, sj50Var)), 1);
                break;
            case 10:
                m6p0 m6p0Var = (m6p0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1852185224, intValue4, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.TooltipTitleAlongIcon.Content.<anonymous> (PostingWithAuthorView.kt:349)");
                    }
                    pzu0.b(m6p0Var.a, null, null, m6p0Var.b, aVar4, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((grq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nw6(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
