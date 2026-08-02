package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.video.VideoPinnedSectionOfflineException;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import java.io.IOException;

/* compiled from: CarIconConstraints.java */
/* loaded from: classes11.dex */
public final class qs9 implements a5a {

    @NonNull
    public static final qs9 c = new qs9(new int[]{1, 2});
    public Object b;

    public /* synthetic */ qs9(Object obj) {
        this.b = obj;
    }

    @Override // xsna.a5a
    public void a() {
        boolean z;
        VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.b;
        if (BuildInfo.s()) {
            String str = videoCatalogRootVh.a0.q;
            if (str != null) {
                UIBlockList uIBlockList = videoCatalogRootVh.c0;
                if (epx.f(uIBlockList != null ? uIBlockList.b : null, str)) {
                    z = true;
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d() && z) {
                        videoCatalogRootVh.D0 = videoCatalogRootVh.y0.r;
                        videoCatalogRootVh.rg(new VideoPinnedSectionOfflineException());
                        return;
                    }
                }
            }
            z = false;
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
            }
        }
    }

    public void b(@Nullable CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int h = icon.h();
        for (int i : (int[]) this.b) {
            if (h == i) {
                if (h != 4 || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(icon.i().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
            }
        }
        throw new IllegalArgumentException(lhg.a(h, "Custom icon type is not allowed: "));
    }

    @Override // xsna.a5a
    public boolean c() {
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            return false;
        }
        ((VideoCatalogRootVh) this.b).rg(new IOException());
        return true;
    }
}
