package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import xsna.us2;

/* compiled from: UserProfilePromoBirthdayHiddenViewHolder.kt */
/* loaded from: classes5.dex */
public final class ttq0 extends dri<UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip> {
    public static final a t = new a();
    public final zuq0 n;
    public final rg50 o;
    public final rg50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;

    /* compiled from: UserProfilePromoBirthdayHiddenViewHolder.kt */
    public static final class a extends eri<ttq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new ttq0(composeView, zuq0Var);
        }
    }

    /* compiled from: UserProfilePromoBirthdayHiddenViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.values().length];
            try {
                iArr[UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.SendGift.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.Wishes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.Ideas.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.ScheduledGift.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ttq0(ComposeView composeView, zuq0 zuq0Var) {
        super(composeView);
        this.n = zuq0Var;
        this.o = androidx.compose.runtime.i.a(0);
        this.p = androidx.compose.runtime.i.a(0);
        this.q = androidx.compose.runtime.k.b(UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.Wishes);
        this.r = androidx.compose.runtime.k.b(null);
        this.s = androidx.compose.runtime.k.b(MergeMode.Default);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip birthdayHiddenTooltip = (UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip) obj;
        ((wak0) this.o).C(birthdayHiddenTooltip.d);
        ((wak0) this.p).C(birthdayHiddenTooltip.e);
        ((zak0) this.q).setValue(birthdayHiddenTooltip.f);
        ((zak0) this.r).setValue(birthdayHiddenTooltip.g);
        ((zak0) this.s).setValue(birthdayHiddenTooltip.b);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1415516514);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1415516514, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfilePromoBirthdayHiddenViewHolder.Content (UserProfilePromoBirthdayHiddenViewHolder.kt:51)");
            }
            VasFeatures vasFeatures = VasFeatures.VAS_SCHEDULED_GIFTS;
            vasFeatures.getClass();
            boolean a2 = com.vk.toggle.b.A.a(vasFeatures);
            uog0 O = znk0.O((MergeMode) ((zak0) this.s).getValue());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(null, O, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-655741546, new wzg(this, a2, 1), M), M, 1572864, 57);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zu3(this, i, 16);
        }
    }

    public final us2 s6(int i, String str) {
        us2.b bVar = new us2.b();
        int m = bVar.m(new hik0(f870.c(krv0.m(i, this.itemView.getContext())), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
        try {
            bVar.g(str);
            s3q0 s3q0Var = s3q0.a;
            bVar.k(m);
            return bVar.n();
        } catch (Throwable th) {
            bVar.k(m);
            throw th;
        }
    }

    public final void t6(ExtendedUserProfile extendedUserProfile) {
        UserId userId;
        UserProfile userProfile = extendedUserProfile.a;
        if (userProfile == null || (userId = userProfile.c) == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.set(i, extendedUserProfile.t - 1, extendedUserProfile.s, 10, 0, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar.before(calendar2)) {
            calendar.set(1, i + 1);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        g2v.d().a().n(this.itemView.getContext(), null, pn00.k(new Pair("ref", "profile_birthday"), new Pair("recipient_ids", String.valueOf(userId.b)), new Pair("date", simpleDateFormat.format(calendar.getTime()))));
    }
}
