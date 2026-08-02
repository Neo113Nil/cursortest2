package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerProgressbarFragment;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingMediaPickerPagerAdapter.kt */
/* loaded from: classes4.dex */
public final class ahc0 extends k1q0 {
    public final List<MediaPickerState.Tab> s;
    public final com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a t;
    public final FragmentManager u;
    public float v;
    public int w;
    public gvz x;
    public Integer y;

    /* compiled from: PostingMediaPickerPagerAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerState.Tab.values().length];
            try {
                iArr[MediaPickerState.Tab.LocalAlbum.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerState.Tab.PhotoVk.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerState.Tab.VideoVk.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ahc0(ViewPager2 viewPager2, PostingFragment postingFragment, mbs mbsVar, List list, com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a aVar, FragmentManager fragmentManager) {
        super(postingFragment, viewPager2, mbsVar, fragmentManager);
        this.s = list;
        this.t = aVar;
        this.u = fragmentManager;
        for (Fragment fragment : fragmentManager.c.f()) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                int i = arguments.getInt("posting_media_picker_tab_position", -1);
                Integer valueOf = i == -1 ? null : Integer.valueOf(i);
                if (valueOf != null) {
                    G0(fragment, valueOf.intValue());
                }
            }
        }
    }

    public final void J0(float f, int i) {
        this.v = f;
        this.w = i;
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            z1h0 F0 = F0(i2);
            z1h0 H = this.u.H("current_media_picker_fragment");
            if (H != null) {
                F0 = H;
            }
            if (F0 != null && (F0 instanceof bhc0)) {
                ((bhc0) F0).tb(f, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.s.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.s.get(i).a((UserId) this.t.a.invoke());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(mds mdsVar, int i, List list) {
        super.onBindViewHolder(mdsVar, i, list);
        Integer num = this.y;
        if (num != null) {
            int intValue = num.intValue();
            gvz gvzVar = this.x;
            if (gvzVar == null) {
                return;
            }
            Fragment F0 = F0(i);
            if (intValue == i) {
                boolean z = F0 instanceof LocalMediaPickerFragmentOld;
                if (z || (F0 instanceof LocalMediaPickerFragment)) {
                    this.x = null;
                    this.y = null;
                    if (F0 instanceof LocalMediaPickerFragment) {
                        LocalMediaPickerFragment localMediaPickerFragment = (LocalMediaPickerFragment) F0;
                        if (localMediaPickerFragment.getView() != null) {
                            localMediaPickerFragment.fo(gvzVar);
                            return;
                        } else {
                            localMediaPickerFragment.c0 = gvzVar;
                            return;
                        }
                    }
                    if (z) {
                        LocalMediaPickerFragmentOld localMediaPickerFragmentOld = (LocalMediaPickerFragmentOld) F0;
                        if (localMediaPickerFragmentOld.getView() != null) {
                            localMediaPickerFragmentOld.eo(gvzVar);
                        } else {
                            localMediaPickerFragmentOld.b0 = gvzVar;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.scs
    public final boolean y0(long j) {
        UserId userId = (UserId) this.t.a.invoke();
        List<MediaPickerState.Tab> list = this.s;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((MediaPickerState.Tab) it.next()).a(userId) == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.scs
    public final Fragment z0(int i) {
        FragmentImpl a2;
        MediaPickerState.Tab tab = (MediaPickerState.Tab) j5g.b0(i, this.s);
        int i2 = tab == null ? -1 : a.$EnumSwitchMapping$0[tab.ordinal()];
        com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.a aVar = this.t;
        if (i2 == 1) {
            a2 = aVar.a();
        } else if (i2 == 2) {
            UserId userId = (UserId) aVar.a.invoke();
            a2 = userId == null ? new MediaPickerProgressbarFragment.a(MediaPickerProgressbarFragment.class, null, null).f() : new VkPhotoPickerFragment.a(userId, VkPhotoPickerFragment.class).f();
        } else if (i2 != 3) {
            a2 = aVar.a();
        } else {
            UserId userId2 = (UserId) aVar.a.invoke();
            if (userId2 == null) {
                a2 = new MediaPickerProgressbarFragment.a(MediaPickerProgressbarFragment.class, null, null).f();
            } else {
                VkVideoPickerFragment.a aVar2 = new VkVideoPickerFragment.a(VkVideoPickerFragment.class, null, null);
                Bundle bundle = aVar2.j;
                bundle.putParcelable("user_id_video", userId2);
                bundle.putInt("playlist_id_key", -1);
                a2 = aVar2.f();
            }
        }
        Bundle arguments = a2.getArguments();
        if (arguments != null) {
            arguments.putInt("posting_media_picker_tab_position", i);
        }
        J0(this.v, this.w);
        G0(a2, i);
        return a2;
    }
}
