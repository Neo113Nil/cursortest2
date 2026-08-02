package xsna;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.browser.ui.VkImagesPreviewActivity;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j76 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j76(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sd90 sd90Var;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                FragmentActivity activity = ((Fragment) obj).getActivity();
                if (activity != null) {
                    int i3 = VkImagesPreviewActivity.g;
                    activity.startActivity(new Intent(activity, (Class<?>) VkImagesPreviewActivity.class).putParcelableArrayListExtra("images", new ArrayList<>(arrayList)).putExtra("startIndex", i2));
                }
                break;
            case 1:
                mdg mdgVar = (mdg) obj2;
                ListDataSet<cbg> listDataSet = mdgVar.K;
                ?? r0 = mdgVar.e;
                int size = listDataSet.d.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        cbg c = listDataSet.c(i4);
                        grj0 grj0Var = c != null ? c.a : null;
                        NewsComment newsComment = grj0Var instanceof NewsComment ? (NewsComment) grj0Var : null;
                        if (newsComment == null || newsComment.i != i2) {
                            i4++;
                        } else {
                            newsComment.u = false;
                            mdgVar.L7(newsComment);
                            r0.bm(i2);
                            r0.Rb(i4);
                            mdgVar.O7(newsComment);
                        }
                    }
                }
                if (!mdgVar.x7() && (sd90Var = mdgVar.Q) != null) {
                    sd90Var.i();
                }
                break;
            default:
                ((UIBlockProfile) obj2).E = i2;
                h03.b((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
