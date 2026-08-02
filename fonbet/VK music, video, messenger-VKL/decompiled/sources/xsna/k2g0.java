package xsna;

import com.facebook.soloader.MinElf;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.core.picker.PickingImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.i2g0;
import xsna.o0r0;

/* compiled from: RepliesRouter.kt */
/* loaded from: classes18.dex */
public final class k2g0 {
    public final FragmentImpl a;
    public final bja0 b;
    public final o0r0 c;
    public final Object d;
    public final ImageViewer e;

    /* compiled from: RepliesRouter.kt */
    public static final class a extends ImageViewer.b {
        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.ControlsOptions u() {
            return ImageViewer.ControlsOptions.a(super.u(), false, null, false, 252);
        }
    }

    public k2g0(FragmentImpl fragmentImpl, bja0 bja0Var, o0r0 o0r0Var, eig0<w1g0> eig0Var, ImageViewer imageViewer) {
        this.a = fragmentImpl;
        this.b = bja0Var;
        this.c = o0r0Var;
        this.d = eig0Var;
        this.e = imageViewer;
    }

    public final void a(i2g0 i2g0Var) {
        boolean z = i2g0Var instanceof i2g0.c;
        FragmentImpl fragmentImpl = this.a;
        if (z) {
            PickingImpl.a a2 = this.b.a(fragmentImpl.requireContext());
            GroupPickerInfo groupPickerInfo = a2.b;
            groupPickerInfo.k = 1;
            groupPickerInfo.j = R.string.review_reply_author;
            i2g0.c cVar = (i2g0.c) i2g0Var;
            groupPickerInfo.h = fkq0.a(cVar.a);
            groupPickerInfo.g = cVar.b;
            groupPickerInfo.b = true;
            a2.a(4332, fragmentImpl);
            return;
        }
        if (i2g0Var instanceof i2g0.a) {
            ListBuilder listBuilder = ((i2g0.a) i2g0Var).b;
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = listBuilder.iterator();
            while (it.hasNext()) {
                t10 a3 = cig0.a((ReplyAction) it.next());
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            new v70(arrayList, new mm1(28, this, i2g0Var), null).a(fragmentImpl.requireContext());
            return;
        }
        if (i2g0Var instanceof i2g0.d) {
            this.c.m(fragmentImpl.requireContext(), ((i2g0.d) i2g0Var).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        } else if (i2g0Var instanceof i2g0.b) {
            i2g0.b bVar = (i2g0.b) i2g0Var;
            ImageViewer.b(this.e, bVar.b, bVar.a, fragmentImpl.requireContext(), new a(), false, null, 496);
        }
    }
}
