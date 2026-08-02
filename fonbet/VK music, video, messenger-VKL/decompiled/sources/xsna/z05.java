package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z05 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z05(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        mno0 mno0Var;
        mno0 mno0Var2;
        VideoMetaViewState.c cVar;
        q630.a aVar;
        a.C0011a.C0012a c0012a;
        int i2;
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        switch (this.b) {
            case 0:
                f15 f15Var = (f15) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-615557124, intValue, -1, "com.vk.music.playlist.display.audiobook.presentation.AudiobookListContent.Component.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudiobookListContent.kt:92)");
                    }
                    f15Var.d(f15Var.h.getValue().booleanValue(), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                VideoMetaViewState.a aVar3 = (VideoMetaViewState.a) this.c;
                lzj0 lzj0Var = (lzj0) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? aVar4.J(lzj0Var) : aVar4.y(lzj0Var) ? 4 : 2;
                }
                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-416090546, intValue2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.AboutVideoView.<anonymous>.<anonymous> (VideoMetaView.kt:150)");
                    }
                    VideoMetaViewState.c cVar2 = aVar3.b;
                    mno0 mno0Var3 = aVar3.g;
                    mno0 mno0Var4 = aVar3.f;
                    VideoMetaViewState.c cVar3 = aVar3.h;
                    q630.a aVar5 = q630.a.a;
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (cVar2 != null) {
                        aVar4.K(-477778713);
                        us2 c = cVar2.a.c(aVar4);
                        kbe kbeVar = cVar2.a().c;
                        boolean J = aVar4.J(aVar3);
                        Object x = aVar4.x();
                        if (J || x == c0012a2) {
                            x = new efr0(aVar3, 4);
                            aVar4.R(x);
                        }
                        mno0Var2 = mno0Var4;
                        mno0Var = mno0Var3;
                        cVar = cVar3;
                        aVar = aVar5;
                        c0012a = c0012a2;
                        i2 = -483457324;
                        i = intValue2;
                        yyn.a(c, egi0.b(aVar5, false, (izs) x), kbeVar, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 0, 248);
                    } else {
                        i = intValue2;
                        mno0Var = mno0Var3;
                        mno0Var2 = mno0Var4;
                        cVar = cVar3;
                        aVar = aVar5;
                        c0012a = c0012a2;
                        i2 = -483457324;
                        aVar4.K(-483457324);
                    }
                    aVar4.j();
                    if (aVar3.d != null) {
                        aVar4.K(-477381882);
                        com.vk.libvideo.design.compose.base.datacontent.presets.b.g(lzj0Var, null, aVar4, i & 14);
                        i3 = 0;
                        com.vk.libvideo.design.compose.base.datacontent.presets.b.b(aVar3, null, aVar4, 0);
                    } else {
                        i3 = 0;
                        aVar4.K(i2);
                    }
                    aVar4.j();
                    if (mno0Var2 != null) {
                        aVar4.K(-477254472);
                        com.vk.libvideo.design.compose.base.datacontent.presets.b.g(lzj0Var, null, aVar4, i & 14);
                        String a = mno0Var2.a(i3, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            i5 = -1;
                            androidx.compose.runtime.b.f(1040687336, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            i5 = -1;
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getText().p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, i3, i5, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        yqv0.c(a, null, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.s0, aVar4, 100663296, 48, 5882);
                        aVar4 = aVar4;
                    } else {
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        aVar4.K(i2);
                    }
                    aVar4.j();
                    if (mno0Var != null) {
                        aVar4.K(-476872707);
                        com.vk.libvideo.design.compose.base.datacontent.presets.b.g(lzj0Var, null, aVar4, i & 14);
                        String a2 = mno0Var.a(0, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = -1;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                        } else {
                            i4 = -1;
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getText().p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, i4, str);
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar6 = aVar4;
                        yqv0.c(a2, null, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.s0, aVar6, 100663296, 48, 5882);
                        aVar4 = aVar6;
                    } else {
                        aVar4.K(i2);
                    }
                    aVar4.j();
                    VideoMetaViewState.c cVar4 = cVar;
                    if (cVar4 != null) {
                        aVar4.K(-476489888);
                        com.vk.libvideo.design.compose.base.datacontent.presets.b.g(lzj0Var, null, aVar4, i & 14);
                        us2 c2 = cVar4.a.c(aVar4);
                        kbe kbeVar2 = cVar4.a().c;
                        boolean J2 = aVar4.J(aVar3);
                        Object x2 = aVar4.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new qjl0(aVar3, 14);
                            aVar4.R(x2);
                        }
                        yyn.a(c2, egi0.b(aVar, false, (izs) x2), kbeVar2, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 0, 248);
                    } else {
                        aVar4.K(i2);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}
