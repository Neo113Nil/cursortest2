package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vk.posting.presentation.model.PickerAttachType;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.posting.presentation.video.VideoPickerFragment;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PickerTabRootAdapter.kt */
/* loaded from: classes5.dex */
public final class uia0 extends k1q0 {
    public final PickerRootParams s;
    public final oga0 t;

    public uia0(PickerRootFragment pickerRootFragment, ViewPager2 viewPager2, mbs mbsVar, FragmentManager fragmentManager, PickerRootParams pickerRootParams, oga0 oga0Var) {
        super(pickerRootFragment, viewPager2, mbsVar, fragmentManager);
        this.s = pickerRootParams;
        this.t = oga0Var;
    }

    public final FragmentImpl J0(PickerAttachType pickerAttachType, UserId userId, boolean z) {
        if (epx.f(pickerAttachType, PickerAttachType.Article.b)) {
            ArticlePickerFragment.a aVar = new ArticlePickerFragment.a(ArticlePickerFragment.class, null, null);
            Bundle bundle = aVar.j;
            bundle.putParcelable("user_id_article", userId);
            bundle.putBoolean("community_posting_key", z);
            return aVar.f();
        }
        if (epx.f(pickerAttachType, PickerAttachType.Album.b)) {
            AlbumPickerFragment.a aVar2 = new AlbumPickerFragment.a(AlbumPickerFragment.class, null, null);
            Bundle bundle2 = aVar2.j;
            bundle2.putParcelable("user_id_album", userId);
            bundle2.putBoolean("community_posting_key", z);
            return aVar2.f();
        }
        if (epx.f(pickerAttachType, PickerAttachType.PhotoVk.b)) {
            return this.t.k(userId, z).f();
        }
        if (pickerAttachType instanceof PickerAttachType.VideoVk) {
            return new VideoPickerFragment.a(userId, ((PickerAttachType.VideoVk) pickerAttachType).b, z, null, 8).f();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.s.c == null ? 1 : 2;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        PickerRootParams pickerRootParams = this.s;
        if (i == 0) {
            FragmentImpl J0 = J0(pickerRootParams.d, pickerRootParams.b, pickerRootParams.c != null);
            G0(J0, i);
            return J0;
        }
        if (i != 1) {
            throw new IllegalArgumentException();
        }
        FragmentImpl J02 = J0(pickerRootParams.d, pickerRootParams.c, true);
        G0(J02, i);
        return J02;
    }
}
