package xsna;

import android.os.SystemClock;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ocz0;
import xsna.xod;

/* compiled from: MyTargetDisplayItemsFactory.kt */
/* loaded from: classes4.dex */
public final class rp50 {
    public final ds50 a;
    public final q5w b;
    public final ad0 c;
    public final vua0 d;
    public final qq50 e;
    public final skd f;
    public final nr2 g;
    public final ht50 h;

    public rp50(ds50 ds50Var, q5w q5wVar, ad0 ad0Var, vua0 vua0Var, qq50 qq50Var, skd skdVar, yq50 yq50Var, nr2 nr2Var, ht50 ht50Var) {
        this.a = ds50Var;
        this.b = q5wVar;
        this.c = ad0Var;
        this.d = vua0Var;
        this.e = qq50Var;
        this.f = skdVar;
        this.g = nr2Var;
        this.h = ht50Var;
    }

    public final iko0 a(MyTargetNativeAdEntry myTargetNativeAdEntry, s1c0 s1c0Var) {
        List list;
        wjz0 content;
        iko0 iko0Var = new iko0(myTargetNativeAdEntry, myTargetNativeAdEntry, 372, true, false, new s1q(3, 0, 52), false, null);
        boolean z = s1c0Var.J;
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (gjxVar == null || (content = gjxVar.getContent()) == null || content.a.c == null) {
            list = EmptyList.b;
        } else {
            ej90 ej90Var = myTargetNativeAdEntry.w;
            list = Collections.singletonList(new zq50(ej90Var != null ? rte0.h(ej90Var, z) : null, myTargetNativeAdEntry));
        }
        iko0Var.h = (ol60) j5g.a0(list);
        return iko0Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final u1c0 b(MyTargetNativeAdEntry myTargetNativeAdEntry, h170 h170Var) {
        boolean z = myTargetNativeAdEntry.D;
        boolean z2 = ((Boolean) h170Var.l.getValue()).booleanValue() && myTargetNativeAdEntry.q != null;
        String str = myTargetNativeAdEntry.C;
        if (str == null || drm0.N(str) || z2 || z) {
            return null;
        }
        u1c0 u1c0Var = new u1c0(myTargetNativeAdEntry, myTargetNativeAdEntry, ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION);
        u1c0Var.h = (ol60) j5g.a0(this.g.P(myTargetNativeAdEntry));
        return u1c0Var;
    }

    public final u1c0 c(MyTargetNativeAdEntry myTargetNativeAdEntry, s1c0 s1c0Var) {
        u1c0 u1c0Var = new u1c0(302, myTargetNativeAdEntry);
        u1c0Var.h = (ol60) j5g.a0(this.b.a(0, new Triple(myTargetNativeAdEntry, myTargetNativeAdEntry, s1c0Var)));
        return u1c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0238 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.vk.dto.common.VideoFileOld] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VideoAttachment d(MyTargetNativeAdEntry myTargetNativeAdEntry, String str) {
        ClipVideoFile clipVideoFile;
        wjz0 content;
        lhz0 lhz0Var;
        kbz0 kbz0Var;
        l0n d;
        List list;
        ArrayList arrayList;
        kbz0 kbz0Var2;
        l0n d2;
        gjx gjxVar = myTargetNativeAdEntry != null ? myTargetNativeAdEntry.B : null;
        if (gjxVar != null && (content = gjxVar.getContent()) != null && (lhz0Var = content.g) != null) {
            kbz0 kbz0Var3 = lhz0Var.b;
            ocz0.d dVar = lhz0Var.a;
            ArrayList arrayList2 = lhz0Var.c;
            if (myTargetNativeAdEntry.D) {
                VideoUrlStorage a = ht50.a(arrayList2);
                if (a != null) {
                    clipVideoFile = new ClipVideoFile();
                    clipVideoFile.c = 0;
                    UserId userId = UserId.d;
                    clipVideoFile.b = userId;
                    clipVideoFile.d = userId;
                    clipVideoFile.P0 = dVar.U;
                    clipVideoFile.b0 = true;
                    clipVideoFile.z = true;
                    wjz0 content2 = gjxVar.getContent();
                    String str2 = content2 != null ? content2.a.r : null;
                    wjz0 content3 = gjxVar.getContent();
                    String str3 = (content3 == null || (d2 = content3.d()) == null) ? null : d2.c;
                    wjz0 content4 = gjxVar.getContent();
                    String str4 = content4 != null ? content4.a.h : null;
                    wjz0 content5 = gjxVar.getContent();
                    String str5 = content5 != null ? content5.a.f : null;
                    VideoAdsType videoAdsType = VideoAdsType.MY_TARGET_VIDEO;
                    wjz0 content6 = gjxVar.getContent();
                    Image e = (content6 == null || (kbz0Var2 = content6.d) == null) ? null : up50.e(kbz0Var2);
                    egz0 c = gjxVar.c();
                    if (c == null || (arrayList = c.b) == null) {
                        list = EmptyList.b;
                    } else {
                        list = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ajx ajxVar = (ajx) it.next();
                            list.add(new AdsChoicesOptions(ajxVar.b(), ajxVar.getType(), ajxVar.getTitle(), null, Boolean.valueOf(ajxVar.a()), null, null, 104, null));
                        }
                    }
                    clipVideoFile.c0 = new VideoAdInfo(str2, str3, str4, userId, null, str5, videoAdsType, false, null, null, "", e, new AdsChoices(null, null, null, null, list, 15, null));
                    clipVideoFile.A0 = SystemClock.elapsedRealtime();
                    clipVideoFile.e = (int) dVar.D;
                    clipVideoFile.I0 = kbz0Var3 != null ? up50.e(kbz0Var3) : Image.d;
                    clipVideoFile.f = a;
                    wjz0 content7 = gjxVar.getContent();
                    clipVideoFile.m = content7 != null ? content7.a.c : null;
                    ibr0 ibr0Var = this.h.a;
                    wjz0 content8 = gjxVar.getContent();
                    clipVideoFile.U1 = xod.a.a(ibr0Var, content8 != null ? content8.a.c : null, null, false, 14);
                    wjz0 content9 = gjxVar.getContent();
                    String n = content9 != null ? content9.a.n() : "";
                    wjz0 content10 = gjxVar.getContent();
                    clipVideoFile.Y = new ActionLink(0, "", "", "", new ActionLinkSnippet(n, "", "", content10 != null ? content10.a.n() : "", SnippetTarget.UNKNOWN, 0, 0, null, null, null, null, null, null, null, null, 30720, null), null, null, null);
                }
            } else {
                VideoUrlStorage a2 = ht50.a(arrayList2);
                if (a2 != null) {
                    ?? videoFileOld = new VideoFileOld();
                    videoFileOld.c = 0;
                    UserId userId2 = UserId.d;
                    videoFileOld.b = userId2;
                    videoFileOld.d = userId2;
                    videoFileOld.P0 = dVar.U;
                    videoFileOld.b0 = true;
                    videoFileOld.z = true;
                    wjz0 content11 = gjxVar.getContent();
                    String str6 = content11 != null ? content11.a.f : null;
                    wjz0 content12 = gjxVar.getContent();
                    String str7 = (content12 == null || (d = content12.d()) == null) ? null : d.c;
                    wjz0 content13 = gjxVar.getContent();
                    String str8 = content13 != null ? content13.a.h : null;
                    wjz0 content14 = gjxVar.getContent();
                    String str9 = content14 != null ? content14.a.r : null;
                    VideoAdsType videoAdsType2 = VideoAdsType.MY_TARGET_VIDEO;
                    wjz0 content15 = gjxVar.getContent();
                    videoFileOld.c0 = new VideoAdInfo(str6, str7, str8, userId2, null, str9, videoAdsType2, false, null, null, "", (content15 == null || (kbz0Var = content15.d) == null) ? null : up50.e(kbz0Var), null);
                    videoFileOld.A0 = SystemClock.elapsedRealtime();
                    videoFileOld.e = (int) dVar.D;
                    videoFileOld.I0 = kbz0Var3 != null ? up50.e(kbz0Var3) : Image.d;
                    videoFileOld.f = a2;
                    clipVideoFile = videoFileOld;
                }
                clipVideoFile = null;
            }
            if (clipVideoFile != null) {
                return null;
            }
            VideoAttachment videoAttachment = new VideoAttachment(clipVideoFile);
            videoAttachment.Lb(str, null, null);
            return videoAttachment;
        }
        clipVideoFile = null;
        if (clipVideoFile != null) {
        }
    }
}
