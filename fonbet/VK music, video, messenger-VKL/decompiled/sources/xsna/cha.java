package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vk.catalog2.common.dto.ui.UIBlockSportMatch;

/* compiled from: SportsMatchesCurrentAdapter.kt */
/* loaded from: classes16.dex */
public final class cha extends Fragment {
    public UIBlockSportMatch h;
    public b5a i;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bha bhaVar = new bha(layoutInflater.getContext());
        UIBlockSportMatch uIBlockSportMatch = this.h;
        if (uIBlockSportMatch != null) {
            bhaVar.setUiData(uIBlockSportMatch);
        }
        b5a b5aVar = this.i;
        if (b5aVar != null) {
            bhaVar.setCatalogEventsBus(b5aVar);
        }
        return bhaVar;
    }
}
