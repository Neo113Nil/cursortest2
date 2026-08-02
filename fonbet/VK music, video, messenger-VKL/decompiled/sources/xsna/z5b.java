package xsna;

import android.content.Context;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.media.MediaUtils;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vkontakte.android.NetworkStateReceiver;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c0e;
import xsna.e8v0;
import xsna.ext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z5b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z5b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object hs1Var;
        String str;
        switch (this.b) {
            case 0:
                j6b j6bVar = (j6b) this.c;
                a6b a6bVar = (a6b) this.d;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.e;
                ((etv0) obj).b(false);
                j6bVar.invoke();
                a6bVar.a.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 1:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new zzd((c0e) this.c, (MediaUtils.d) this.e, (c0e.a) obj, (c0e.b) this.d));
            case 2:
                Context context = (Context) this.c;
                ynh ynhVar = (ynh) this.d;
                v1h v1hVar = (v1h) this.e;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                if (extendedCommunityProfile.H == null || !(!r5.isEmpty())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new wr9(context.getString(R.string.group_contacts), Integer.valueOf(extendedCommunityProfile.H.size()), null, null, 28));
                Iterator<ExtendedUserProfile.Contact> it = extendedCommunityProfile.H.iterator();
                while (it.hasNext()) {
                    ExtendedUserProfile.Contact next = it.next();
                    StringBuilder sb = new StringBuilder();
                    UserProfile userProfile = next.b;
                    if (userProfile != null) {
                        if (userProfile.q == null || !(!drm0.N(r11))) {
                            str = "id" + next.b.c;
                        } else {
                            str = next.b.q;
                        }
                        sb.append("https://" + a0a.d + '/' + str);
                    }
                    if (next.d != null && (!drm0.N(r11))) {
                        if (!drm0.N(sb)) {
                            sb.append("\n");
                        }
                        sb.append(next.d);
                    }
                    if (next.e != null && (!drm0.N(r11))) {
                        if (!drm0.N(sb)) {
                            sb.append("\n");
                        }
                        sb.append(next.e);
                    }
                    UserProfile userProfile2 = next.b;
                    String str2 = userProfile2 != null ? userProfile2.e : next.c;
                    if (drm0.N(sb) && str2 != null && (!drm0.N(str2))) {
                        sb.append(str2);
                    }
                    String str3 = next.c;
                    UserProfile userProfile3 = next.b;
                    String str4 = userProfile3 != null ? userProfile3.h : null;
                    String str5 = next.d;
                    String str6 = next.e;
                    String sb2 = sb.toString();
                    UserId userId = extendedCommunityProfile.a.c;
                    if (next.b != null) {
                        hs1Var = new yl3(ynhVar, context, next, 2);
                    } else {
                        if (next.d == null || !(!drm0.N(r6))) {
                            String str7 = next.e;
                            hs1Var = (str7 == null || !(drm0.N(str7) ^ true)) ? null : new hs1(context, next, v1hVar);
                        } else {
                            hs1Var = new rw(context, next, v1hVar, 7);
                        }
                    }
                    arrayList.add(new y7j(str2, str3, str5, str6, str4, R.drawable.vk_icon_mention_24, hs1Var != null ? new mo3(hs1Var, 4) : null, sb2, userId, "contact", "group_info"));
                }
                return arrayList;
            case 3:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new com.vk.catalog.mvi.block.impl.e((HeaderView.c) this.c, (String) this.d, (String) this.e, null), 3));
            case 4:
                String str8 = (String) this.c;
                Context context2 = (Context) this.d;
                yp80 yp80Var = (yp80) this.e;
                rwi.d().m().a(context2, (ExtendedUserProfile) ((ptk) obj).a, epx.f(str8, "story"));
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 5:
                j6 j6Var = (j6) this.c;
                yid0 yid0Var = (yid0) this.d;
                Context context3 = (Context) this.e;
                j6Var.invoke();
                yid0Var.k(1, context3);
                return s3q0.a;
            default:
                pcu0 pcu0Var = (pcu0) this.c;
                AuthResult authResult = (AuthResult) this.d;
                xbu0 xbu0Var = (xbu0) this.e;
                AuthResult a = AuthResult.a(authResult, null, null, null, null, System.currentTimeMillis(), null, null, 8355839);
                ext.b bVar = new ext.b();
                m6r0 m6r0Var = new m6r0();
                m6r0Var.G(xbu0Var.a);
                m6r0Var.f(m6r0.i, xbu0Var.g);
                m6r0Var.f(m6r0.k, xbu0Var.c);
                bVar.d = xbu0Var.d;
                m6r0Var.C(authResult.b);
                m6r0Var.E(authResult.c);
                m6r0Var.D(authResult.f);
                m6r0Var.F(authResult.q);
                bVar.a = m6r0Var;
                pcu0Var.q(a, bVar);
                NetworkStateReceiver a2 = NetworkStateReceiver.a();
                a2.c = 5;
                a2.b = false;
                NetworkStateReceiver.h.dispose();
                if (!NetworkStateReceiver.a().b) {
                    NetworkStateReceiver.d(false);
                }
                return io.reactivex.rxjava3.core.q.T(xbu0Var);
        }
    }
}
