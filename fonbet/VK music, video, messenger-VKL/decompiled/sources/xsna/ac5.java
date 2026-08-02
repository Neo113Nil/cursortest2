package xsna;

import android.content.DialogInterface;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import xsna.nzl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ac5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ac5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                ((com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) obj).eo().b(g75.b);
                break;
            case 1:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                k6s0 Y4 = ((BottomSheetCommentsFragment) obj).Ro().Y4();
                if (Y4 != null) {
                    Y4.e();
                    break;
                }
                break;
            default:
                gzs gzsVar = (gzs) obj;
                int i2 = VkFastLoginView.v;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
