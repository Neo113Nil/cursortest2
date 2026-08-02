package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.core.view.mediapicker.adapter.SelectedPreviewsAdapter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectedImagesPreviewView.kt */
/* loaded from: classes17.dex */
public final class wai0 extends FrameLayout implements SelectedPreviewsAdapter.c, s48 {
    public final RecyclerView b;
    public final View c;
    public a d;
    public final SelectedPreviewsAdapter e;
    public final LinearLayoutManager f;

    /* compiled from: SelectedImagesPreviewView.kt */
    public interface a {
        void a();

        void b(uai0 uai0Var);
    }

    public wai0(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.ds_media_picker_preview_view, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.preview_images_recycler_view);
        this.b = recyclerView;
        this.c = findViewById(R.id.right_shadow);
        SelectedPreviewsAdapter selectedPreviewsAdapter = new SelectedPreviewsAdapter(this);
        this.e = selectedPreviewsAdapter;
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(selectedPreviewsAdapter);
        recyclerView.addItemDecoration(new ehk0(iah0.a(8)));
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.g gVar = itemAnimator instanceof androidx.recyclerview.widget.g ? (androidx.recyclerview.widget.g) itemAnimator : null;
        if (gVar != null) {
            gVar.g = false;
        }
        recyclerView.addOnScrollListener(new vai0(this));
        jjc.g(findViewById(R.id.next_action_button), new xc50(this, 17));
        f4m.j(this);
    }

    @Override // com.vk.core.view.mediapicker.adapter.SelectedPreviewsAdapter.c
    public final void b(uai0 uai0Var) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.b(uai0Var);
        }
    }

    public final void setAspectRatio(VkMediaPicker.CellAspectRation cellAspectRation) {
        SelectedPreviewsAdapter.PreviewAspectRation previewAspectRation;
        SelectedPreviewsAdapter selectedPreviewsAdapter = this.e;
        selectedPreviewsAdapter.getClass();
        int i = SelectedPreviewsAdapter.e.$EnumSwitchMapping$0[cellAspectRation.ordinal()];
        if (i == 1) {
            previewAspectRation = SelectedPreviewsAdapter.PreviewAspectRation.Square;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            previewAspectRation = SelectedPreviewsAdapter.PreviewAspectRation.Vertical;
        }
        selectedPreviewsAdapter.f = previewAspectRation;
    }

    public final void setPreviewCallback(a aVar) {
        this.d = aVar;
    }

    @Override // xsna.s48
    public void setSelectedItems(List<uai0> list) {
        SelectedPreviewsAdapter selectedPreviewsAdapter = this.e;
        int E0 = selectedPreviewsAdapter.E0();
        List<uai0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new SelectedPreviewsAdapter.b((uai0) it.next()));
        }
        selectedPreviewsAdapter.setItems(arrayList);
        this.b.scrollToPosition(Math.max(0, list.size() - 1));
        if (list.isEmpty()) {
            selectedPreviewsAdapter.notifyItemRangeRemoved(0, E0);
        }
        awt0.v(this, !list.isEmpty());
    }

    @Override // xsna.s48
    public wai0 getView() {
        return this;
    }
}
