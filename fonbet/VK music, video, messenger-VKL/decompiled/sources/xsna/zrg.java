package xsna;

import android.content.Context;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.e6h;

/* compiled from: CommunityAuthorHeaderButtonsMapper.kt */
/* loaded from: classes5.dex */
public final class zrg {
    public final Context a;

    public zrg(Context context) {
        this.a = context;
    }

    public static ProfileButtons.a b(ExtendedCommunityProfile extendedCommunityProfile) {
        ja9 ja9Var;
        int i;
        ProfileButtons.ButtonType buttonType;
        ProfileButtons.c cVar;
        if (!bwd0.b(extendedCommunityProfile) && (ja9Var = extendedCommunityProfile.X1) != null && (i = ja9Var.a) != -1) {
            switch (i) {
                case 0:
                    buttonType = ProfileButtons.ButtonType.Email;
                    break;
                case 1:
                    buttonType = ProfileButtons.ButtonType.Call;
                    break;
                case 2:
                    buttonType = ProfileButtons.ButtonType.VKCall;
                    break;
                case 3:
                    buttonType = ProfileButtons.ButtonType.OpenUrl;
                    break;
                case 4:
                    buttonType = ProfileButtons.ButtonType.OpenInternalUrl;
                    break;
                case 5:
                    buttonType = ProfileButtons.ButtonType.OpenApp;
                    break;
                case 6:
                    if (!extendedCommunityProfile.P2) {
                        buttonType = ProfileButtons.ButtonType.OpenInternalApp;
                        break;
                    } else {
                        buttonType = ProfileButtons.ButtonType.OpenBooking;
                        break;
                    }
                case 7:
                    buttonType = ProfileButtons.ButtonType.OpenBooking;
                    break;
            }
            String str = ja9Var.b;
            if (str != null) {
                if (drm0.N(str)) {
                    str = null;
                }
                if (str != null) {
                    cVar = new ProfileButtons.c.a(str);
                    return new ProfileButtons.a(buttonType, null, cVar, 2);
                }
            }
            cVar = ProfileButtons.c.b.a;
            return new ProfileButtons.a(buttonType, null, cVar, 2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProfileButtons a(ExtendedCommunityProfile extendedCommunityProfile, ProfileButtons.a aVar, e6h e6hVar) {
        ProfileButtons profileButtons;
        int i;
        ProfileButtons profileButtons2;
        ProfileButtons.a aVar2;
        int i2 = extendedCommunityProfile.a1;
        Context context = this.a;
        if (i2 != 4) {
            profileButtons = null;
        } else {
            profileButtons = new ProfileButtons(new ProfileButtons.a(ProfileButtons.ButtonType.JoinRequestSent, null, new ProfileButtons.c.a(context.getString(R.string.community_lego_join_request_sent)), 2), extendedCommunityProfile.e0 ? new ProfileButtons.a(ProfileButtons.ButtonType.Message, null, null, 6) : null, aVar != null ? aVar.a : null, 8);
        }
        if (profileButtons != null) {
            return profileButtons;
        }
        e6h.b bVar = e6h.b.a;
        if (!epx.f(e6hVar, bVar)) {
            if (bwd0.c(extendedCommunityProfile)) {
                i = R.string.community_lego_closed_subscribe;
            } else if (bwd0.f(extendedCommunityProfile)) {
                i = R.string.community_lego_private_join_request;
            }
            profileButtons2 = new ProfileButtons(new ProfileButtons.a(ProfileButtons.ButtonType.Subscribe, null, new ProfileButtons.c.a(context.getString(i)), 2), null, aVar != null ? aVar.a : null, 8);
            if (profileButtons2 == null) {
                return profileButtons2;
            }
            boolean z = bwd0.h(extendedCommunityProfile) && !epx.f(e6hVar, bVar);
            if (z) {
                aVar2 = new ProfileButtons.a(ProfileButtons.ButtonType.Subscribe, null, new ProfileButtons.c.a(context.getString(xa4.y(extendedCommunityProfile))), 2);
            } else {
                if (!extendedCommunityProfile.e0) {
                    if (aVar != null) {
                        return new ProfileButtons(aVar, null, null, 8);
                    }
                    return null;
                }
                aVar2 = new ProfileButtons.a(ProfileButtons.ButtonType.Message, null, null, 6);
            }
            return new ProfileButtons(aVar2, (z && extendedCommunityProfile.e0 && !bwd0.f(extendedCommunityProfile)) ? new ProfileButtons.a(ProfileButtons.ButtonType.Message, null, null, 6) : (!z || aVar == null) ? null : aVar, z ? aVar != null ? aVar.a : null : null, 8);
        }
        profileButtons2 = null;
        if (profileButtons2 == null) {
        }
    }
}
