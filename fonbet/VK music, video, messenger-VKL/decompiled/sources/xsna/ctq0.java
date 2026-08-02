package xsna;

import android.graphics.Color;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.profile.core.cover.ProfileCover;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.ui.g;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: UserProfileOldHeaderFactoryDelegate.kt */
/* loaded from: classes5.dex */
public final class ctq0 {
    public final htq0 a;
    public final dvq0 b;
    public final ouq0 c;

    public ctq0(htq0 htq0Var, dvq0 dvq0Var, ouq0 ouq0Var) {
        this.a = htq0Var;
        this.b = dvq0Var;
        this.c = ouq0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|(1:3)(1:151)|4|(1:6)|7|(1:150)(1:11)|12|(1:147)(1:17)|(37:19|(1:21)(1:145)|22|(7:127|(1:129)|130|(2:133|131)|134|135|(3:137|(3:140|(1:142)(1:143)|138)|144))(0)|26|27|(1:126)(6:31|(4:33|(2:36|34)|37|38)(1:125)|(1:40)|41|(4:44|(2:46|47)(2:49|50)|48|42)|51)|52|(1:124)(1:56)|57|(1:123)(1:64)|65|(1:122)(1:69)|70|71|72|(1:74)(1:118)|75|(1:77)(1:117)|78|79|(1:81)|82|(14:84|(3:86|(1:88)(1:91)|89)|92|(1:94)(1:114)|95|96|(1:98)(1:110)|99|100|(1:102)|103|(1:105)|106|107)|115|92|(0)(0)|95|96|(0)(0)|99|100|(0)|103|(0)|106|107)|146|27|(1:29)|126|52|(1:54)|124|57|(1:59)|123|65|(1:67)|122|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|82|(0)|115|92|(0)(0)|95|96|(0)(0)|99|100|(0)|103|(0)|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ef, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0173, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x019f, code lost:
    
        r6 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if ((r0 != null ? r0.getReason() : null) == com.vk.dto.user.deactivation.Deactivation.Reason.Blacklisted) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:72:0x0163, B:74:0x016e, B:75:0x0176, B:77:0x018a, B:78:0x0190), top: B:71:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:72:0x0163, B:74:0x016e, B:75:0x0176, B:77:0x018a, B:78:0x0190), top: B:71:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d7 A[Catch: all -> 0x01dc, TryCatch #1 {all -> 0x01dc, blocks: (B:96:0x01ce, B:98:0x01d7, B:99:0x01df), top: B:95:0x01ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g.a a(ExtendedUserProfile extendedUserProfile) {
        boolean z;
        xtd0 xtd0Var;
        boolean z2;
        int i;
        Object failure;
        ProfileCover.a aVar;
        Object failure2;
        List<ytd0> list;
        Iterable iterable;
        UserId userId = extendedUserProfile.a.c;
        dvq0 dvq0Var = this.b;
        boolean a = dvq0Var.a(userId);
        boolean e = extendedUserProfile.A1 ? bwd0.e(extendedUserProfile) : true;
        UserProfile userProfile = extendedUserProfile.a;
        String str = userProfile.e;
        String str2 = userProfile.q;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        htq0 htq0Var = this.a;
        boolean z3 = !((htq0Var.h.invoke().booleanValue() && !htq0Var.m) || htq0Var.e);
        boolean z4 = (a || dvq0Var.d(extendedUserProfile) || !e) ? false : true;
        if (a) {
            xtd0 xtd0Var2 = extendedUserProfile.N1;
            List<ytd0> list2 = xtd0Var2 != null ? xtd0Var2.a : null;
            if (list2 == null || list2.isEmpty()) {
                Iterable iterable2 = extendedUserProfile.M1;
                if (iterable2 == null) {
                    iterable2 = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    g5g.y(((xtd0) it.next()).a, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (e43.l(ProfileAction.Type.PROFILE_QUESTION.h(), ProfileAction.Type.OPEN_APP.h()).contains(((ytd0) it2.next()).b)) {
                        }
                    }
                }
            }
            z = true;
            xtd0Var = extendedUserProfile.N1;
            if (xtd0Var != null || (list = xtd0Var.a) == null) {
                z2 = a;
                i = 0;
            } else {
                List<ytd0> list3 = list;
                ArrayList arrayList2 = extendedUserProfile.M1;
                if (arrayList2 != null) {
                    z2 = a;
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((xtd0) it3.next()).a);
                    }
                    iterable = c5g.v(arrayList3);
                } else {
                    z2 = a;
                    iterable = null;
                }
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                Iterator it4 = j5g.u0(iterable, list3).iterator();
                i = 0;
                while (it4.hasNext()) {
                    Integer num = ((ytd0) it4.next()).g;
                    i += num != null ? num.intValue() : 0;
                }
            }
            g.a.b bVar = new g.a.b(z, this.c.b() + i);
            boolean z5 = !z2 || extendedUserProfile.g();
            g.a.C1728a c1728a = new g.a.C1728a(z2 && !extendedUserProfile.a.A && !dvq0Var.d(extendedUserProfile) && e, !extendedUserProfile.j1 || extendedUserProfile.I1);
            StringBuilder sb = new StringBuilder("#FF");
            String str4 = extendedUserProfile.n;
            sb.append(str4 == null ? drm0.U(str4, "#") : null);
            int parseColor = Color.parseColor(sb.toString());
            StringBuilder sb2 = new StringBuilder("#00");
            String str5 = extendedUserProfile.n;
            sb2.append(str5 == null ? drm0.U(str5, "#") : null);
            failure = new ProfileCover.a(parseColor, Color.parseColor(sb2.toString()));
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            aVar = (ProfileCover.a) failure;
            if (aVar != null) {
                if (dvq0Var.d(extendedUserProfile)) {
                    Deactivation deactivation = extendedUserProfile.q;
                }
                Photo photo = extendedUserProfile.A;
                hea0 hea0Var = photo != null ? new hea0(photo) : null;
                StringBuilder sb3 = new StringBuilder("#FF");
                String str6 = extendedUserProfile.n;
                sb3.append(str6 != null ? drm0.U(str6, "#") : null);
                failure2 = Integer.valueOf(Color.parseColor(sb3.toString()));
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                if (!dvq0Var.d(extendedUserProfile)) {
                    failure2 = null;
                }
                return new g.a(str, str3, z3, z5, z4, bVar, c1728a, new ProfileCover(extendedUserProfile.e(), aVar, (Integer) failure2, hea0Var), htq0Var.i, htq0Var.m);
            }
            aVar = null;
            Photo photo2 = extendedUserProfile.A;
            if (photo2 != null) {
            }
            StringBuilder sb32 = new StringBuilder("#FF");
            String str62 = extendedUserProfile.n;
            sb32.append(str62 != null ? drm0.U(str62, "#") : null);
            failure2 = Integer.valueOf(Color.parseColor(sb32.toString()));
            if (failure2 instanceof Result.Failure) {
            }
            if (!dvq0Var.d(extendedUserProfile)) {
            }
            return new g.a(str, str3, z3, z5, z4, bVar, c1728a, new ProfileCover(extendedUserProfile.e(), aVar, (Integer) failure2, hea0Var), htq0Var.i, htq0Var.m);
        }
        z = false;
        xtd0Var = extendedUserProfile.N1;
        if (xtd0Var != null) {
        }
        z2 = a;
        i = 0;
        g.a.b bVar2 = new g.a.b(z, this.c.b() + i);
        if (z2) {
        }
        g.a.C1728a c1728a2 = new g.a.C1728a(z2 && !extendedUserProfile.a.A && !dvq0Var.d(extendedUserProfile) && e, !extendedUserProfile.j1 || extendedUserProfile.I1);
        StringBuilder sb4 = new StringBuilder("#FF");
        String str42 = extendedUserProfile.n;
        sb4.append(str42 == null ? drm0.U(str42, "#") : null);
        int parseColor2 = Color.parseColor(sb4.toString());
        StringBuilder sb22 = new StringBuilder("#00");
        String str52 = extendedUserProfile.n;
        sb22.append(str52 == null ? drm0.U(str52, "#") : null);
        failure = new ProfileCover.a(parseColor2, Color.parseColor(sb22.toString()));
        if (failure instanceof Result.Failure) {
        }
        aVar = (ProfileCover.a) failure;
        if (aVar != null) {
        }
        aVar = null;
        Photo photo22 = extendedUserProfile.A;
        if (photo22 != null) {
        }
        StringBuilder sb322 = new StringBuilder("#FF");
        String str622 = extendedUserProfile.n;
        sb322.append(str622 != null ? drm0.U(str622, "#") : null);
        failure2 = Integer.valueOf(Color.parseColor(sb322.toString()));
        if (failure2 instanceof Result.Failure) {
        }
        if (!dvq0Var.d(extendedUserProfile)) {
        }
        return new g.a(str, str3, z3, z5, z4, bVar2, c1728a2, new ProfileCover(extendedUserProfile.e(), aVar, (Integer) failure2, hea0Var), htq0Var.i, htq0Var.m);
    }
}
