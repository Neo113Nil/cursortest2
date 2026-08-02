package xsna;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.VoipFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fss;
import xsna.gd60;

/* compiled from: NavigationActionHandler.kt */
/* loaded from: classes16.dex */
public final class mw50 implements lss<fss.b> {
    public final String a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final rfz c;
    public final mxv d;
    public final gd60 e;
    public final otl0 f;
    public final Context g;
    public final io.reactivex.rxjava3.disposables.b h;

    public mw50(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, rfz rfzVar, mxv mxvVar, gd60 gd60Var, otl0 otl0Var, Context context, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = str;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = rfzVar;
        this.d = mxvVar;
        this.e = gd60Var;
        this.f = otl0Var;
        this.g = context;
        this.h = bVar;
    }

    @Override // xsna.lss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(fss.b bVar) {
        String string;
        if (bVar instanceof fss.b.C2893b) {
            VoipFeatures voipFeatures = VoipFeatures.VOIP_MAX_ENTRY_POINTS;
            voipFeatures.getClass();
            if (com.vk.toggle.b.A.a(voipFeatures)) {
                this.d.j().k(this.g, ((fss.b.C2893b) bVar).a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST, this.b), MaxButtonVariants.ForInstalledOnly);
                return;
            } else {
                RequestUserProfile requestUserProfile = ((fss.b.C2893b) bVar).a;
                Context context = this.g;
                wx20.c(new kw50(this, requestUserProfile, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST, this.b), e43.l(new e520(0, R.drawable.vk_icon_phone_outline_28, 0, 1008, context.getString(R.string.friends_action_make_call_audio)), new e520(1, R.drawable.vk_icon_videocam_outline_28, 1, 1008, context.getString(R.string.friends_action_make_call_video)))), this.g, "friends_call_options", 0, 0, 28);
                return;
            }
        }
        if (!(bVar instanceof fss.b.a)) {
            if (bVar instanceof fss.b.c) {
                this.d.b().L(this.g, "", "friend_request", ((fss.b.c) bVar).a.c.b);
                return;
            }
            if (bVar instanceof fss.b.d) {
                c(((fss.b.d) bVar).a);
                return;
            } else {
                if (!(bVar instanceof fss.b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                RequestUserProfile requestUserProfile2 = ((fss.b.e) bVar).a;
                this.h.b(this.f.g(requestUserProfile2.c).subscribe(new tf1(new ab(16, this, requestUserProfile2), 29), new fs00(new uf1(27, this, requestUserProfile2), 6)));
                return;
            }
        }
        RequestUserProfile requestUserProfile3 = ((fss.b.a) bVar).a;
        try {
            String str = requestUserProfile3.r;
            String str2 = requestUserProfile3.r0;
            if (str2 != null && str2.length() != 0) {
                string = requestUserProfile3.r0;
                rwi.d().j().b(this.g, str, string);
            }
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            string = context2.getString(R.string.recommendations_invite_message, a0a.d);
            rwi.d().j().b(this.g, str, string);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    public final void c(RequestUserProfile requestUserProfile) {
        UserId userId = requestUserProfile.c;
        String str = requestUserProfile.J;
        String str2 = requestUserProfile.t0;
        this.e.g(this.g, userId, (r16 & 4) != 0 ? null : this.a, (r16 & 8) != 0 ? null : str, (r16 & 16) != 0 ? null : str2, new gd60.b(requestUserProfile.e, requestUserProfile.h, requestUserProfile.Y, requestUserProfile.T, null, null, 112));
    }
}
