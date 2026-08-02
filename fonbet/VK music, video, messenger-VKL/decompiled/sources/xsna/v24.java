package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v24 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v24(int i, AttachMusicFragment attachMusicFragment) {
        this.b = 0;
        this.c = i;
        this.d = attachMusicFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                AttachMusicFragment attachMusicFragment = (AttachMusicFragment) obj2;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                int i3 = AttachMusicFragment.I0;
                if (i2 == 0) {
                    Iterator it = vkPaginationList.b.iterator();
                    int i4 = 0;
                    while (it.hasNext() && epx.f(((MusicTrack) it.next()).c, attachMusicFragment.b0)) {
                        i4++;
                    }
                    b34<T, VH> b34Var = attachMusicFragment.a0;
                    if (b34Var != 0) {
                        b34Var.W0(i4);
                    }
                }
                return vkPaginationList;
            case 1:
                Resources resources = (Resources) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap.getWidth() != i2) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
                }
                return new BitmapDrawable(resources, bitmap);
            default:
                WebApiApplication webApiApplication = (WebApiApplication) obj2;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return vdx0Var.d().V(i2, webApiApplication.b);
        }
    }

    public /* synthetic */ v24(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
