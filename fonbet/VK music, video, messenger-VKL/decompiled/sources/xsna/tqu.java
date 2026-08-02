package xsna;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.vk.search.params.api.VkGroupsSearchParams;
import java.util.Iterator;

/* compiled from: GroupsSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class tqu implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ vqu b;

    public tqu(vqu vquVar) {
        this.b = vquVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        VkGroupsSearchParams.SortType sortType;
        vqu vquVar = this.b;
        if (vquVar.getBlockChanges()) {
            return;
        }
        VkGroupsSearchParams searchParams = vquVar.getSearchParams();
        VkGroupsSearchParams.SortType.Companion.getClass();
        Iterator<E> it = VkGroupsSearchParams.SortType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                sortType = VkGroupsSearchParams.n;
                break;
            } else {
                sortType = (VkGroupsSearchParams.SortType) it.next();
                if (i == sortType.i()) {
                    break;
                }
            }
        }
        searchParams.d = sortType;
        Spinner spinner = vquVar.l;
        if (spinner != null) {
            spinner.setSelected(true);
        }
        vquVar.i();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
