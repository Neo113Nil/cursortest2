package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import xsna.ad20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zc20 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zc20(RecyclerView.e0 e0Var, Object obj, int i) {
        this.b = i;
        this.c = e0Var;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((ad20.a) this.c).m.A(((yc20) this.d).b);
                break;
            default:
                VkCommunityPickerActivity.b bVar = (VkCommunityPickerActivity.b) this.c;
                izs izsVar = (izs) this.d;
                AppsGroupsContainer appsGroupsContainer = bVar.p;
                if (appsGroupsContainer != null) {
                    izsVar.invoke(appsGroupsContainer);
                    break;
                }
                break;
        }
    }
}
