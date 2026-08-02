package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.psn0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xs2 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xs2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oe7 oe7Var;
        ColorFilter porterDuffColorFilter;
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                lwz lwzVar = (lwz) this.c;
                break;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1130065512, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:110)");
                    }
                    v0rVar.n("аватар + имя + многострочный текст + вложение", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                lg90 lg90Var = (lg90) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1759512881, intValue2, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryLoadedItemView.<anonymous> (ImageGalleryEditModeCell.kt:213)");
                    }
                    if (booleanValue) {
                        aVar2.K(-1325233923);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long c = l5g.c(14, ylu0Var.j().a, 0.72f);
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(c), z42.a(3));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c), z42.b(3));
                        }
                        oe7Var = new oe7(c, 3, porterDuffColorFilter);
                        aVar2.j();
                    } else {
                        aVar2.K(1867561964);
                        aVar2.j();
                        oe7Var = null;
                    }
                    vjw.a(lg90Var, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, aVar2, 56, 60);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                wh50 wh50Var = (wh50) this.c;
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(colVar) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1824037545, intValue3, -1, "com.vk.design.demo.presentation.screens.ecomm.tile.MarketProductTileContent.Content.<anonymous>.<anonymous> (MarketProductTileContent.kt:63)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i = intValue3;
                        z = true;
                    } else {
                        i = intValue3;
                        z = false;
                    }
                    Object x = aVar3.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new uc10(0, wh50Var);
                        aVar3.R(x);
                    }
                    int i2 = ((i << 21) & 29360128) | 48;
                    colVar.c(z, (gzs) x, null, psn0.a.C3529a.a("Compose", aVar3), null, null, null, aVar3, i2, 116);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar3.x();
                    if (x2 == obj4) {
                        x2 = new koj(1, wh50Var);
                        aVar3.R(x2);
                    }
                    colVar.c(z2, (gzs) x2, null, psn0.a.C3529a.a("View", aVar3), null, null, null, aVar3, i2, 116);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                PreviewViewState.Size size = (PreviewViewState.Size) this.c;
                PreviewViewState.b bVar = (PreviewViewState.b) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.J(bVar) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2105208135, intValue4, -1, "com.vk.libvideo.design.compose.base.preview.PreviewView.<anonymous>.<anonymous> (PreviewView.kt:123)");
                    }
                    if (bVar != null) {
                        aVar4.K(-1143061413);
                        com.vk.libvideo.design.compose.base.preview.c.e(bVar, size, txj0.d(q630.a.a, 1.0f), aVar4, (intValue4 & 14) | 384);
                    } else {
                        aVar4.K(-1148954327);
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
