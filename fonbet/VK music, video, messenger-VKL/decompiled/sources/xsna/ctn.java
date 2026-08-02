package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ctn implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ctn(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((wzs) obj3).invoke((Doc2DocItem.Banner.Action) obj2, ((AboutVideoItem.l) obj).e);
                break;
            case 1:
                VkTooltip.a aVar = (VkTooltip.a) obj2;
                Rect rect = (Rect) obj;
                gzs<s3q0> gzsVar = ((d5p0) obj3).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                aVar.a(rect);
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj3;
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) obj;
                int i2 = LegoStickersBottomSheetDialog.d0;
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                int height = viewGroup.getHeight() + iArr[1];
                int[] iArr2 = new int[2];
                ((View) obj2).getLocationInWindow(iArr2);
                int i3 = height - iArr2[1];
                if (i3 < 0) {
                    i3 = 0;
                }
                viewGroup.setClipToPadding(false);
                int i4 = i3 - legoStickersBottomSheetDialog.Q;
                f4m.v(i4 >= 0 ? i4 : 0, viewGroup);
                break;
        }
        return s3q0.a;
    }
}
