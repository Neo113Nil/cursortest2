package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ListItemSelectorBottomSheet.kt */
/* loaded from: classes3.dex */
public abstract class qfz<T extends Serializer.StreamParcelable> extends com.google.android.material.bottomsheet.c {
    public static final a A = new a();
    public ArrayList<T> y;
    public ju z;

    /* compiled from: ListItemSelectorBottomSheet.kt */
    public static final class a {
    }

    public abstract a920 Fn();

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.y = arguments != null ? arguments.getParcelableArrayList("ListItemSelectorBottomSheet_ITEMS") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext());
        recyclerView.setId(R.id.ui_test_artist_selector_recycler_view);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, true);
        linearLayoutManager.L(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(Fn());
        float f = 8;
        recyclerView.setPadding(iah0.a(f), iah0.a(8.0f), iah0.a(f), iah0.a(8.0f));
        return recyclerView;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkBottomSheetTheme;
    }
}
