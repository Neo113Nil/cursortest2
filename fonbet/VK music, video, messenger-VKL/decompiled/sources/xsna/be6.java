package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.CameraUIView.d;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.ui.fave.FaveTagViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.im.design.view.pagination.DialogPinView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import xsna.bji0;
import xsna.nii0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class be6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ be6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Mask selectedMask;
        String str;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ce6 ce6Var = (ce6) obj;
                if (view != null) {
                    ce6Var.getClass();
                    break;
                }
                break;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) obj;
                MasksWrap masksWrap = cameraUIView.b0;
                if (masksWrap != null && (selectedMask = masksWrap.getSelectedMask()) != null) {
                    Context context = cameraUIView.getContext();
                    bm9 presenter = cameraUIView.getPresenter();
                    qg10 qg10Var = new qg10(context, selectedMask, (presenter != null ? presenter.c4() : null) == StoryCameraMode.CLIPS, cameraUIView.new d(selectedMask));
                    View inflate = LayoutInflater.from(qg10Var.c).inflate(R.layout.create_camera_mask_info_view, (ViewGroup) null, false);
                    Mask mask = qg10Var.e;
                    NotificationImage notificationImage = mask.l;
                    ((VKImageView) inflate.findViewById(R.id.mask_info_avatar)).load(notificationImage != null ? NotificationImage.Db(notificationImage, ImageScreenSize.SIZE_56DP.h()) : null);
                    ((VkText) inflate.findViewById(R.id.mask_info_title)).setText(mask.g);
                    boolean z = qg10Var.f;
                    if (z) {
                        Resources resources = qg10Var.c.getResources();
                        long j = mask.y;
                        ((VkText) inflate.findViewById(R.id.mask_info_subtitle)).setText(v1v.a(' ', enj.h(resources, R.plurals.clips_grid_create_counter, j, Long.valueOf(j)), mask.u ? qg10Var.c.getString(R.string.clips_camera_videos_with_effect) : qg10Var.c.getString(R.string.clips_camera_videos_with_mask)));
                        f4m.j(inflate.findViewById(R.id.mask_info_chevron));
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mask_info_items);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        av20<e520> S0 = qg10Var.S0();
                        S0.setItems(Collections.singletonList(qg10Var.j));
                        recyclerView.setAdapter(S0);
                    } else {
                        UserProfile userProfile = mask.b;
                        if (userProfile == null || (str = userProfile.e) == null) {
                            Group group = mask.c;
                            str = group != null ? group.d : null;
                        }
                        ((VkText) inflate.findViewById(R.id.mask_info_subtitle)).setText(mask.x + " · " + str);
                        View findViewById = inflate.findViewById(R.id.mask_info_container);
                        if (z) {
                            findViewById = null;
                        }
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new ne3(qg10Var, 7));
                        }
                        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.mask_info_items);
                        recyclerView2.getContext();
                        recyclerView2.setLayoutManager(new LinearLayoutManager());
                        av20<e520> S02 = qg10Var.S0();
                        S02.setItems(qg10Var.m);
                        recyclerView2.setAdapter(S02);
                    }
                    qg10Var.a0(new t61(28));
                    qxm0.r(inflate);
                    qg10Var.P0();
                    qg10Var.O0();
                    qg10Var.D0(inflate, false);
                    qg10Var.n = new WeakReference<>(qg10Var.I0(null));
                    nf9.b.k(StoryPublishEvent.OPEN_MASK_ACTIONS);
                    break;
                }
                break;
            case 2:
                hpg hpgVar = ((b3h) obj).e;
                if (hpgVar != null) {
                    hpgVar.onClick(view);
                    break;
                }
                break;
            case 3:
                gzs<s3q0> gzsVar = ((DialogPinView) obj).h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 4:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).d.invoke(a.e.b);
                break;
            case 5:
                dpp dppVar = (dpp) obj;
                otu0 un = dppVar.un();
                Context requireContext = dppVar.requireContext();
                SchemeStatSak$EventScreen u5 = dppVar.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                break;
            case 6:
                ((v1q) obj).l.a();
                break;
            case 7:
                FaveTagViewGroup faveTagViewGroup = (FaveTagViewGroup) obj;
                if (!(view instanceof FaveTagViewGroup.c)) {
                    int i2 = FaveTagViewGroup.q;
                    break;
                } else {
                    izs<? super FaveTag, s3q0> izsVar = faveTagViewGroup.b;
                    if (izsVar != null) {
                        izsVar.invoke(((FaveTagViewGroup.c) view).b);
                        break;
                    }
                }
                break;
            case 8:
                ykw ykwVar = (ykw) obj;
                x64 x64Var = ykwVar.q;
                if (x64Var != null) {
                    x64Var.c(ykwVar.c);
                    break;
                }
                break;
            case 9:
                ((cqc0) obj).X0(PostingVisibilityMode.ALL);
                break;
            case 10:
                ((bji0.a) obj).l.invoke(nii0.d.b);
                break;
            default:
                u6m0 u6m0Var = ((q6m0) obj).p;
                if (u6m0Var != null) {
                    u6m0Var.k();
                    break;
                }
                break;
        }
    }
}
