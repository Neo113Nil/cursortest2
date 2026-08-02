package xsna;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.dto.photo.Photo;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import xsna.dt1;
import xsna.n1k0;
import xsna.q630;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m00 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                o00 o00Var = (o00) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-308636787, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ActionEntryPointCellLeftContent.Content.<anonymous> (ActionEntryPointCellLeftContent.kt:48)");
                    }
                    o00Var.b(8, aVar, null, o00Var.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                ((Boolean) obj2).getClass();
                basePhotoListFragment.f0.invoke(new PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection(new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto((Photo) obj)), SystemClock.elapsedRealtime()));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                gx9.a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-379067539, intValue2, -1, "com.vk.catalog.mvi.section.ui.view.reorder.DraggableItem.<anonymous> (DragAndDropReorder.kt:105)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((k150) this.c).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = postponedPostsFragment.c0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 6:
                n1k0.a aVar3 = (n1k0.a) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1529942235, intValue3, -1, "com.vk.video.ui.discovery.minimizable.recycler.SlidingBlockDelegate.ViewHolder.<anonymous>.<anonymous> (SlidingBlockDelegate.kt:58)");
                    }
                    aVar3.h6((r1k0.b) ((zak0) aVar3.m).getValue(), (izs) ((zak0) aVar3.n).getValue(), s200.E(q630.a.a, 16, 8), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                ViewPagerVh viewPagerVh = (ViewPagerVh) this.c;
                Integer num = (Integer) obj;
                num.getClass();
                View view = (View) obj2;
                viewPagerVh.j.invoke(num, view);
                viewPagerVh.d(view);
                return s3q0.a;
            default:
                return new h9x((((dt1.b) this.c).a(0, (int) (((q9x) obj).a >> 32), (LayoutDirection) obj2) << 32) | (0 & 4294967295L));
        }
    }

    public /* synthetic */ m00(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
