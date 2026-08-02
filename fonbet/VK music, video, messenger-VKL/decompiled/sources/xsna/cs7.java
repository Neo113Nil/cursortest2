package xsna;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import xsna.b78;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cs7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cs7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0262, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c3, code lost:
    
        if (r3 == androidx.compose.runtime.a.C0011a.a) goto L75;
     */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GZIPInputStream gZIPInputStream;
        int read;
        Object obj4;
        switch (this.b) {
            case 0:
                es7 es7Var = (es7) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1228876951, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingNotificationCellImpl.NotificationPicker.<anonymous> (BookingNotificationCell.kt:104)");
                    }
                    es7Var.c(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                oam oamVar = (oam) this.c;
                String str = (String) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                File u = up2.u(Uri.parse(str));
                String str2 = null;
                str2 = null;
                str2 = null;
                GZIPInputStream gZIPInputStream2 = null;
                str2 = null;
                if (!drm0.N(str) && u != null) {
                    oamVar.getClass();
                    byte[] p = nbr.p(u);
                    if (sni.p(p)) {
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr = new byte[1024];
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p);
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                        } catch (IOException unused) {
                            gZIPInputStream = null;
                            break;
                        } catch (Throwable th) {
                            th = th;
                        }
                        while (true) {
                            try {
                                read = gZIPInputStream.read(bArr);
                            } catch (IOException unused2) {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                gZIPInputStream2 = gZIPInputStream;
                                if (gZIPInputStream2 != null) {
                                    try {
                                        gZIPInputStream2.close();
                                    } catch (Exception unused3) {
                                        throw th;
                                    }
                                }
                                byteArrayInputStream.close();
                                throw th;
                            }
                            if (read != -1) {
                                sb.append(new String(bArr, 0, read, emb.b));
                            } else {
                                str2 = sb.toString();
                                try {
                                    gZIPInputStream.close();
                                    byteArrayInputStream.close();
                                } catch (Exception unused4) {
                                }
                            }
                        }
                    } else {
                        str2 = new String(p, emb.b);
                    }
                }
                return (str2 == null || drm0.N(str2)) ? new ColorDrawable(0) : new SvgDrawable(str2, cn70.b(intValue2), cn70.b(intValue3), SvgDrawable.Mode.TILED);
            case 2:
                az20 az20Var = (az20) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1243354342, intValue4, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.ComposeModals.<anonymous> (ModalCardScreenContent.kt:183)");
                    }
                    qy20 h = az20Var.h(aVar2);
                    xy20 g = az20Var.g(aVar2);
                    jai e = az20Var.e(aVar2);
                    ty20 f = az20Var.f(aVar2);
                    boolean i = az20Var.i();
                    boolean J = aVar2.J(az20Var);
                    Object x = aVar2.x();
                    if (!J) {
                        obj4 = x;
                        break;
                    }
                    Object m2jVar = new m2j(az20Var, 28);
                    aVar2.R(m2jVar);
                    obj4 = m2jVar;
                    e5v0.a((gzs) obj4, null, h, g, e, f, i, true, null, aVar2, 12582912, 258);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                b78.i iVar = (b78.i) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar3.l(booleanValue) ? 4 : 2;
                }
                if (aVar3.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(207868890, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.RadioButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:665)");
                    }
                    q630.a aVar4 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar3.K(-720678421);
                        q630 E = ahn.E(aVar4, "deleteFromMyMusicBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                        }
                        lg90 a = pg90.a(R.drawable.vk_icon_done_24, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N = d370.N(R.string.music_talkback_player_remove_radio_from_favorite, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J2 = aVar3.J(iVar);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new x9l0(iVar, 17);
                            aVar3.R(x2);
                        }
                        nzu0.c((gzs) x2, a, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar3, 3136, 2000);
                        aVar3.j();
                    } else {
                        aVar3.K(-719945705);
                        q630 E2 = ahn.E(aVar4, "addToMyMusicBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                        }
                        lg90 b = or.b(aVar3, -1058716730, R.drawable.vk_icon_add_24, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N2 = d370.N(R.string.music_talkback_player_add_radio_to_favorite, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().a;
                        boolean J3 = aVar3.J(iVar);
                        Object x3 = aVar3.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new lqs0(iVar, 6);
                            aVar3.R(x3);
                        }
                        nzu0.c((gzs) x3, b, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar3, 3136, 2000);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
