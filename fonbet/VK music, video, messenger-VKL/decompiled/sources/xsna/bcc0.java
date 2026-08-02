package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingAttachGalleryPresenter.kt */
/* loaded from: classes15.dex */
public final class bcc0 implements b.c {
    public final /* synthetic */ dcc0 a;

    public bcc0(dcc0 dcc0Var) {
        this.a = dcc0Var;
    }

    @Override // com.vk.attachpicker.b.c
    public final void a(int i, MediaStoreEntry mediaStoreEntry) {
        dcc0 dcc0Var = this.a;
        int i2 = dcc0Var.f;
        com.vk.attachpicker.c cVar = dcc0Var.c;
        if (cVar.e.size() + i2 > dcc0Var.g) {
            cVar.c(mediaStoreEntry);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            cvk.w(context.getString(R.string.attachments_limit, Integer.valueOf(dcc0Var.g)), false);
            return;
        }
        if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
            dcc0Var.e().e();
        } else if (mediaStoreEntry instanceof MediaStoreImageEntry) {
            dcc0Var.e().b();
        }
    }

    @Override // com.vk.attachpicker.b.c
    public final void b(int i, List<Integer> list) {
        RecyclerView recyclerView;
        int K0;
        PostingAttachGalleryFragment.a aVar;
        dcc0 dcc0Var = this.a;
        if (i == 0 && (aVar = dcc0Var.b.d0) != null) {
            aVar.d(false);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            com.vk.attachpicker.fragment.gallery.a aVar2 = dcc0Var.b.U;
            if (aVar2 != null && (K0 = aVar2.K0(intValue)) != -1) {
                aVar2.notifyItemChanged(K0, Boolean.TRUE);
            }
        }
        PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var.b;
        boolean z = i > 0;
        ViewGroup viewGroup = postingAttachGalleryFragment.a0;
        if (viewGroup != null) {
            bwt0.p0(viewGroup, z);
        }
        RecyclerPaginatedView recyclerPaginatedView = postingAttachGalleryFragment.g0;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView.setClipToPadding(false);
            int a = z ? e3m.a(R.dimen.picker_attach_btn_height, recyclerView.getContext()) : cn70.b(0);
            if (recyclerView.getPaddingBottom() != a) {
                awt0.x(recyclerView, 0, 0, 0, a, 7);
            }
        }
        PostingAttachGalleryFragment postingAttachGalleryFragment2 = dcc0Var.b;
        Integer valueOf = i == 0 ? null : Integer.valueOf(i);
        VkButton vkButton = postingAttachGalleryFragment2.b0;
        if (vkButton != null) {
            vkButton.setCount(valueOf);
        }
    }

    @Override // com.vk.attachpicker.b.c
    public final boolean c(MediaStoreEntry mediaStoreEntry) {
        return true;
    }

    @Override // com.vk.attachpicker.b.c
    public final void d(MediaStoreEntry mediaStoreEntry) {
    }
}
