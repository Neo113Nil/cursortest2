package xsna;

import android.view.View;
import com.my.target.common.MyTargetActivity;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.ui.holders.channel.CatalogChannelViewHolder;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n14 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n14(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AttachDocumentsFragment.R0;
                j34 io2 = ((AttachDocumentsFragment) obj).io();
                if (io2 != null) {
                    io2.V2(null);
                    break;
                }
                break;
            case 1:
                gdb gdbVar = ((CatalogChannelViewHolder) obj).b;
                UIBlockChannel uIBlockChannel = gdbVar.e;
                if (uIBlockChannel != null) {
                    gdbVar.b.j(new b3a(uIBlockChannel.y, uIBlockChannel.z));
                    gdbVar.c.a(new cfp0(uIBlockChannel, null));
                    break;
                }
                break;
            case 2:
                yfg yfgVar = ((ngg) obj).F;
                if (yfgVar != null) {
                    yfgVar.e.invoke((String) view.getTag(), yfgVar);
                    break;
                }
                break;
            case 3:
                ((xlu) obj).getPresenter().a();
                break;
            case 4:
                Object obj2 = ((vl90) obj).o;
                ((tl90) (obj2 != null ? obj2 : null)).c();
                break;
            case 5:
                ((obh) obj).invoke();
                break;
            case 6:
                ((SearchEntityPersonAnswerVh) obj).a(view.getContext());
                break;
            case 7:
                ((nhj0) obj).b.invoke();
                break;
            case 8:
                ebs0 ebs0Var = ((VideoToolbarView) obj).t;
                if (ebs0Var != null) {
                    ebs0Var.bk(ngt0.a);
                    break;
                }
                break;
            case 9:
                mxy0 mxy0Var = (mxy0) obj;
                izy0 izy0Var = mxy0Var.d;
                if (izy0Var != null) {
                    izy0Var.h();
                }
                suy0 suy0Var = mxy0Var.e;
                if (suy0Var != null) {
                    suy0Var.d();
                }
                WeakReference weakReference = jpy0.this.b;
                MyTargetActivity myTargetActivity = weakReference != null ? (MyTargetActivity) weakReference.get() : null;
                if (myTargetActivity != null) {
                    myTargetActivity.finish();
                    break;
                }
                break;
            default:
                ((mbz0) obj).c();
                break;
        }
    }
}
