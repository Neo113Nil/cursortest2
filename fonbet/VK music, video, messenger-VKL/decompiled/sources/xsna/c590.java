package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;
import xsna.x590;

/* compiled from: OwnerMapper.kt */
/* loaded from: classes17.dex */
public final class c590 {
    public final int a;

    public c590(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x590 a(g590 g590Var) {
        x590.a aVar;
        x590.a cVar;
        ImageUrl b;
        int size;
        tlo0 d;
        ImageUrl b2;
        List<SdkCoOwnerItem> list = g590Var.a;
        SdkOwner sdkOwner = g590Var.b;
        String str = null;
        SdkImages sdkImages = sdkOwner != null ? sdkOwner.k : null;
        String str2 = (sdkImages == null || (b2 = sdkImages.b(iah0.a((float) 16))) == null) ? null : b2.b;
        x590.b c3975b = str2 == null ? x590.b.a.a : new x590.b.C3975b(str2);
        boolean z = c3975b instanceof x590.b.C3975b;
        SdkVerifyInfo sdkVerifyInfo = sdkOwner != null ? sdkOwner.j : null;
        boolean z2 = false;
        boolean z3 = sdkVerifyInfo != null && sdkVerifyInfo.b;
        boolean z4 = sdkVerifyInfo != null && sdkVerifyInfo.g;
        if ((z3 || z4) && !z) {
            z2 = true;
        }
        x590.d bVar = g590Var.e ? x590.d.a.a : z2 ? new x590.d.b(sdkVerifyInfo) : x590.d.a.a;
        if (list.isEmpty()) {
            e590 e590Var = g590Var.d;
            if (e590Var == null) {
                throw new NoWhenBranchMatchedException();
            }
            SdkImages sdkImages2 = e590Var.a;
            if (sdkImages2 != null && (b = sdkImages2.b(this.a)) != null) {
                str = b.b;
            }
            if (str != null) {
                cVar = new x590.a.c(sdkOwner, str);
                String str3 = g590Var.c;
                size = list.size();
                if (size != 0) {
                    d = oq.d(tlo0.Companion, str3);
                } else if (size != 1) {
                    tlo0.a aVar2 = tlo0.Companion;
                    Object[] objArr = {str3, Integer.valueOf(list.size())};
                    aVar2.getClass();
                    d = tlo0.a.c(R.string.clips_coauthors_more_than_one_co_text, objArr);
                } else {
                    tlo0.a aVar3 = tlo0.Companion;
                    String str4 = ((SdkCoOwnerItem) j5g.Y(list)).c.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    aVar3.getClass();
                    d = tlo0.a.c(R.string.clips_coauthors_one_coauthor_text, str3, str4);
                }
                tlo0 tlo0Var = d;
                String str5 = g590Var.f;
                return new x590(cVar, tlo0Var, c3975b, bVar, str5 != null ? x590.c.a.a : new x590.c.b(str5, g590Var.g, g590Var.h, g590Var.i), g590Var.e);
            }
            aVar = x590.a.b.a;
        } else {
            aVar = new x590.a.C3974a(sdkOwner, list);
        }
        cVar = aVar;
        String str32 = g590Var.c;
        size = list.size();
        if (size != 0) {
        }
        tlo0 tlo0Var2 = d;
        String str52 = g590Var.f;
        return new x590(cVar, tlo0Var2, c3975b, bVar, str52 != null ? x590.c.a.a : new x590.c.b(str52, g590Var.g, g590Var.h, g590Var.i), g590Var.e);
    }
}
