package xsna;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoResizer;
import xsna.x0a;

/* compiled from: CatalogAnimationDialogCallbackFactory.kt */
/* loaded from: classes16.dex */
public final class y0a implements io2 {
    public final /* synthetic */ yg5 b;
    public final /* synthetic */ x0a c;
    public final /* synthetic */ VideoFile d;
    public final /* synthetic */ UIBlock e;

    public y0a(yg5 yg5Var, x0a x0aVar, VideoFile videoFile, UIBlock uIBlock) {
        this.b = yg5Var;
        this.c = x0aVar;
        this.d = videoFile;
        this.e = uIBlock;
    }

    @Override // xsna.io2
    public final void C() {
        yg5 yg5Var = this.b;
        if (yg5Var == null || !a()) {
            return;
        }
        yg5Var.O();
        yg5Var.D();
    }

    @Override // xsna.io2
    public final boolean G() {
        return false;
    }

    @Override // xsna.io2
    public final boolean M() {
        return a();
    }

    public final boolean a() {
        UIBlock uIBlock = this.e;
        if (uIBlock == null) {
            return false;
        }
        CatalogDataType catalogDataType = uIBlock.e;
        CatalogViewType catalogViewType = uIBlock.d;
        if (catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && catalogViewType == CatalogViewType.LIST) {
            return false;
        }
        switch (x0a.a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                yg5 yg5Var = this.b;
                return yg5Var != null && yg5Var.p0() && yg5Var.A().T3();
        }
    }

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    @Override // xsna.io2
    public final Rect g0() {
        VideoFile videoFile = this.d;
        x0a x0aVar = this.c;
        View a = x0a.a(x0aVar, videoFile);
        if (a == null) {
            return new Rect();
        }
        a.getGlobalVisibleRect(x0aVar.c);
        return x0aVar.c;
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.CROP;
    }

    @Override // xsna.io2
    public final float i0() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.io2
    public final Rect t0() {
        VideoFile videoFile = this.d;
        x0a x0aVar = this.c;
        View a = x0a.a(x0aVar, videoFile);
        if (a == null) {
            return new Rect();
        }
        a.getLocationOnScreen(x0aVar.d);
        int[] iArr = x0aVar.d;
        int i = iArr[0];
        return new Rect(i, iArr[1], a.getWidth() + i, a.getHeight() + x0aVar.d[1]);
    }

    @Override // xsna.io2
    public final void D0() {
    }

    @Override // xsna.io2
    public final void J() {
    }

    @Override // xsna.io2
    public final void e0() {
    }
}
