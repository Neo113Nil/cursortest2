package xsna;

import com.vk.clips.sdk.models.SdkFriendsInfo;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import kotlin.collections.EmptySet;
import xsna.fz0;
import xsna.nz0;

/* compiled from: AdsItemOverlayDefaultRenderFactory.kt */
/* loaded from: classes17.dex */
public final class py0 implements bz0 {
    public final fz0 a;
    public final ix0 b;
    public final com.vk.clips.sdk.shared.item.common.error.a c;
    public final sw0 d;
    public final com.vk.clips.sdk.shared.item.common.restriction.a e;

    public py0(d11 d11Var, yof yofVar, boolean z) {
        fz0 fz0Var = new fz0();
        fz0Var.b = EmptySet.b;
        this.a = fz0Var;
        this.b = new ix0(d11Var, yofVar, z);
        this.c = new com.vk.clips.sdk.shared.item.common.error.a();
        this.d = new sw0();
        this.e = new com.vk.clips.sdk.shared.item.common.restriction.a();
    }

    @Override // xsna.bz0
    public final k390 a(nz0.a aVar) {
        SdkOwner sdkOwner;
        SdkOwner sdkOwner2;
        p390 p390Var = new p390(aVar);
        hw0 hw0Var = aVar.b;
        SdkClipVideoFile sdkClipVideoFile = hw0Var.a;
        String str = hw0Var.b;
        SdkVideoAdInfo X0 = sdkClipVideoFile.X0();
        String str2 = X0 != null ? X0.b : null;
        SdkVideoAdInfo X02 = sdkClipVideoFile.X0();
        String str3 = X02 != null ? X02.c : null;
        SdkVideoAdInfo X03 = sdkClipVideoFile.X0();
        String str4 = X03 != null ? X03.g : null;
        SdkVideoAdInfo X04 = sdkClipVideoFile.X0();
        String str5 = X04 != null ? X04.d : null;
        SdkVideoAdInfo X05 = sdkClipVideoFile.X0();
        SdkImages sdkImages = X05 != null ? X05.m : null;
        SdkVideoAdInfo X06 = sdkClipVideoFile.X0();
        tgg tggVar = new tgg(str2, null, str3, str4, str5, sdkImages, X06 != null ? X06.h : null);
        SdkVideoAdInfo X07 = sdkClipVideoFile.X0();
        String str6 = X07 != null ? X07.g : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = str6;
        SdkVideoAdInfo X08 = sdkClipVideoFile.X0();
        Integer num = (X08 == null || (sdkOwner2 = X08.f) == null) ? null : sdkOwner2.o;
        boolean U = sdkClipVideoFile.U();
        SdkVideoAdInfo X09 = sdkClipVideoFile.X0();
        SdkImages sdkImages2 = X09 != null ? X09.m : null;
        SdkVideoAdInfo X010 = sdkClipVideoFile.X0();
        SdkFriendsInfo sdkFriendsInfo = (X010 == null || (sdkOwner = X010.f) == null) ? null : sdkOwner.p;
        SdkVideoAdInfo X011 = sdkClipVideoFile.X0();
        b21 b21Var = new b21(str7, num, U, sdkImages2, sdkFriendsInfo, (X011 != null ? X011.h : null) == SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER);
        fz0 fz0Var = this.a;
        fz0Var.getClass();
        String str8 = p390Var.a.b;
        fz0.a aVar2 = fz0.a.MainOverlay;
        boolean a = fz0Var.a(aVar2, p390Var);
        fz0.a aVar3 = fz0.a.RestrictionOverlay;
        boolean a2 = fz0Var.a(aVar3, p390Var);
        fz0.a aVar4 = fz0.a.EndOverlay;
        boolean a3 = fz0Var.a(aVar4, p390Var);
        fz0.a aVar5 = fz0.a.ErrorOverlay;
        return new k390(new r390(a, a2, a3, fz0Var.a(aVar5, p390Var), str8, fz0Var.a(fz0.a.UnfocusedBlackout, p390Var)), this.b.a(new pf00(fz0Var.a(aVar2, p390Var), hw0Var, tggVar, b21Var, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k)), this.c.a(new iwp(fz0Var.a(aVar5, new p390(aVar)), str, aVar.g)), this.d.a(new ukp(fz0Var.a(aVar4, new p390(aVar)), hw0Var.b, tggVar, sdkClipVideoFile.m1(), sdkClipVideoFile.Y(), hw0Var.c, dgd.d(sdkClipVideoFile), sdkClipVideoFile.P(), sdkClipVideoFile.U(), sdkClipVideoFile.s(), sdkClipVideoFile.M0())), this.e.a(new bdg0(fz0Var.a(aVar3, new p390(aVar)), str, sdkClipVideoFile.O())));
    }
}
