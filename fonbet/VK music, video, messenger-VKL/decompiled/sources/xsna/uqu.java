package xsna;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.vk.search.params.api.VkGroupsSearchParams;
import java.util.Iterator;

/* compiled from: GroupsSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class uqu implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ vqu b;

    public uqu(vqu vquVar) {
        this.b = vquVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        VkGroupsSearchParams.CommunityType communityType;
        vqu vquVar = this.b;
        if (vquVar.getBlockChanges()) {
            return;
        }
        VkGroupsSearchParams searchParams = vquVar.getSearchParams();
        VkGroupsSearchParams.CommunityType.Companion.getClass();
        Iterator<E> it = VkGroupsSearchParams.CommunityType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                communityType = VkGroupsSearchParams.m;
                break;
            } else {
                communityType = (VkGroupsSearchParams.CommunityType) it.next();
                if (i == communityType.i()) {
                    break;
                }
            }
        }
        searchParams.c = communityType;
        Spinner spinner = vquVar.k;
        if (spinner != null) {
            VkGroupsSearchParams.CommunityType communityType2 = vquVar.getSearchParams().c;
            VkGroupsSearchParams.CommunityType communityType3 = VkGroupsSearchParams.m;
            spinner.setSelected(communityType2 != VkGroupsSearchParams.m);
        }
        vquVar.o();
        vquVar.i();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
