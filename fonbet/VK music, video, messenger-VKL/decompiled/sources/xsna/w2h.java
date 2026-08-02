package xsna;

import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityExt.kt */
/* loaded from: classes5.dex */
public final class w2h {
    public static final boolean a(ExtendedCommunityProfile extendedCommunityProfile) {
        return extendedCommunityProfile.a0 >= 3 && !extendedCommunityProfile.g();
    }

    public static final boolean b(ExtendedCommunityProfile extendedCommunityProfile) {
        return extendedCommunityProfile.a0 >= 2 && !extendedCommunityProfile.g();
    }

    public static final boolean c(ExtendedCommunityProfile extendedCommunityProfile) {
        Deactivation deactivation = extendedCommunityProfile.q;
        if ((deactivation != null ? deactivation.getType() : null) == Deactivation.Type.GEO_BLOCKED) {
            return true;
        }
        Deactivation deactivation2 = extendedCommunityProfile.q;
        return (deactivation2 != null ? deactivation2.getType() : null) == Deactivation.Type.BANNED;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 java.util.List<com.vk.dto.group.GroupContentTabSetting>, still in use, count: 1, list:
          (r3v1 java.util.List<com.vk.dto.group.GroupContentTabSetting>) from 0x0013: MOVE (r3v2 java.util.List<com.vk.dto.group.GroupContentTabSetting>) = (r3v1 java.util.List<com.vk.dto.group.GroupContentTabSetting>) (LINE:20)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.simplifyMoveInsns(CodeShrinkVisitor.java:289)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.processForceInlineInsns(RegionMakerVisitor.java:43)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:29)
        */
    public static final boolean d(com.vkontakte.android.api.ExtendedCommunityProfile r3) {
        /*
            int r0 = r3.d0
            r1 = 0
            if (r0 <= 0) goto L3b
            java.util.List<com.vk.dto.group.GroupContentTabSetting> r3 = r3.U2
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L3b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L3b
        L13:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L23
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            return r1
        L23:
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            com.vk.dto.group.GroupContentTabSetting r0 = (com.vk.dto.group.GroupContentTabSetting) r0
            com.vk.dto.group.GroupContentTabType r0 = r0.b
            com.vk.dto.group.GroupContentTabType r2 = com.vk.dto.group.GroupContentTabType.WALL
            if (r0 != r2) goto L27
            r3 = 1
            return r3
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.w2h.d(com.vkontakte.android.api.ExtendedCommunityProfile):boolean");
    }

    public static final boolean e(ExtendedCommunityProfile extendedCommunityProfile) {
        return extendedCommunityProfile.g0 && !epx.f(extendedCommunityProfile.a.c, o25.a().o().a) && (extendedCommunityProfile.Y == 2 || extendedCommunityProfile.d0 > 0);
    }
}
