package xsna;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.profile.community.creationonboarding.api.data.GroupCreationOnboardingHighlight;
import io.jsonwebtoken.JwtParser;

/* compiled from: CommunityCreationOnboardingStateStorageImpl.kt */
/* loaded from: classes5.dex */
public final class i0h implements h0h {
    public final bpn0 a = new bpn0(new wb1(5));

    public static String i(UserId userId, String str) {
        return userId.b + JwtParser.SEPARATOR_CHAR + str;
    }

    @Override // xsna.h0h
    public final void a(UserId userId, String str) {
        String i = i(userId, "creation.onboarding.active_screen");
        String string = h().getString(i, null);
        SharedPreferences.Editor edit = h().edit();
        if (!epx.f(string, str)) {
            edit.putString(i, str);
            edit.putBoolean(i(userId, NativeAdContent.ViewTag.AD_TITLE), false);
            edit.putBoolean(i(userId, "creation.onboarding.completed"), false);
        }
        edit.apply();
    }

    @Override // xsna.h0h
    public final boolean b(UserId userId, GroupCreationOnboardingTooltip.Type type) {
        return h().getBoolean(i(userId, type.name()), false);
    }

    @Override // xsna.h0h
    public final void c(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight) {
        SharedPreferences.Editor edit = h().edit();
        edit.putBoolean(i(userId, groupCreationOnboardingHighlight.name()), true);
        edit.apply();
    }

    @Override // xsna.h0h
    public final boolean d(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight) {
        return h().getBoolean(i(userId, groupCreationOnboardingHighlight.name()), false);
    }

    @Override // xsna.h0h
    public final void e(UserId userId) {
        SharedPreferences.Editor edit = h().edit();
        edit.putBoolean(i(userId, "creation.onboarding.completed"), true);
        edit.apply();
    }

    @Override // xsna.h0h
    public final void f(UserId userId, GroupCreationOnboardingTooltip.Type type) {
        SharedPreferences.Editor edit = h().edit();
        edit.putBoolean(i(userId, type.name()), true);
        edit.apply();
    }

    @Override // xsna.h0h
    public final boolean g(UserId userId) {
        return h().getBoolean(i(userId, "creation.onboarding.completed"), false);
    }

    public final SharedPreferences h() {
        return (SharedPreferences) this.a.getValue();
    }
}
