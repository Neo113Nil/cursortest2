package xsna;

import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: OverlayImageMapper.kt */
/* loaded from: classes3.dex */
public final class s290 {

    /* compiled from: OverlayImageMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoOverlayView.VideoRestrictionSize.values().length];
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final com.vk.libvideo.design.view.overlay.a a(Image image) {
        return b(new oap.a(image));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (((com.vk.dto.common.Image) ((xsna.oap.a) r5).a) != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (((android.net.Uri) ((xsna.oap.b) r5).a) != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        return new com.vk.libvideo.design.view.overlay.a(r2, new xsna.ab(18, r5, r4));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vk.libvideo.design.view.overlay.a b(oap<Image, ? extends Uri> oapVar) {
        boolean z = true;
        if (!(oapVar instanceof oap.b)) {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
