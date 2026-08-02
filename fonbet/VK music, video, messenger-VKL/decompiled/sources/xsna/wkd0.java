package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.tkd0;
import xsna.xld0;

/* compiled from: ProductCardGalleryActor.kt */
/* loaded from: classes18.dex */
public final class wkd0 extends al50<nmd0, ejd0.d, on50, smd0, xld0, tkd0> {
    public final sj50<nmd0, on50, smd0, xld0, tkd0> c;

    /* compiled from: ProductCardGalleryActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductGalleryItem.Type.values().length];
            try {
                iArr[ProductGalleryItem.Type.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductGalleryItem.Type.Photo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wkd0(sj50<nmd0, on50, smd0, xld0, tkd0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        VideoFile videoFile;
        ejd0.d dVar = (ejd0.d) lj50Var;
        if (dVar instanceof ejd0.d.C2818d) {
            return;
        }
        if (!(dVar instanceof ejd0.d.c)) {
            if (dVar instanceof ejd0.d.b) {
                e(new xld0.b(((ejd0.d.b) dVar).b));
                return;
            } else {
                if (!(dVar instanceof ejd0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(new xld0.a(((ejd0.d.a) dVar).b));
                return;
            }
        }
        ejd0.d.c cVar = (ejd0.d.c) dVar;
        int i = a.$EnumSwitchMapping$0[cVar.b.ordinal()];
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (i == 1) {
            cld0 cld0Var = ((nmd0) sj50Var.getCurrentState()).i;
            if (cld0Var == null || (videoFile = (VideoFile) j5g.a0(cld0Var.b)) == null) {
                return;
            }
            c(new tkd0.c.b(videoFile));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = cVar.c;
        cld0 cld0Var2 = ((nmd0) sj50Var.getCurrentState()).i;
        if (cld0Var2 == null) {
            return;
        }
        c(new tkd0.c.a(cld0Var2.a, i2 - cld0Var2.b.size()));
    }
}
