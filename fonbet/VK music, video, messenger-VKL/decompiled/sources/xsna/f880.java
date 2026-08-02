package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import androidx.compose.runtime.Recomposer;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import one.video.transform.TransformController;
import one.video.transform.TransformController.g;
import xsna.sw50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f880 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f880(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj2;
                if (!aVar.q) {
                    aVar.d = true;
                }
                return s3q0.a;
            case 1:
                yp80 yp80Var = (yp80) obj2;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 2:
                ((zak0) ((lv90) obj2).l1).setValue(new VkPeopleSearchParams());
                return s3q0.a;
            case 3:
                kga0 b = ((com.vk.photos.root.presentation.h) obj2).b();
                if (b != null) {
                    return b.getRecyclerView();
                }
                return null;
            case 4:
                xia0 xia0Var = (xia0) obj2;
                int i2 = ify.a;
                if (ify.e(ify.c)) {
                    EditText editText = xia0Var.g;
                    mhy.d(editText != null ? editText : null);
                }
                return Boolean.TRUE;
            case 5:
                ((da50) obj2).invoke();
                return s3q0.a;
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.f((y1c0) obj2)).a(fpf0.a(NewsFeedComponent.class))).X5();
            case 7:
                int i3 = PostSettingsFragment.Y;
                return Long.valueOf(((PostSettingsFragment) obj2).requireArguments().getLong("channel_id", 0L));
            case 8:
                y8c0 y8c0Var = (y8c0) obj2;
                return new uq60(y8c0Var.c, y8c0Var.y, y8c0Var.a().a.Y, y8c0Var.a().x);
            case 9:
                return bo8.d(((rbc0) obj2).a, "publish_suggest_id");
            case 10:
                ikc0 ikc0Var = (ikc0) obj2;
                sbc0 sbc0Var = ikc0Var.x;
                if ((sbc0Var == null ? null : sbc0Var).C) {
                    ikc0Var.hb(AttachType.TAKE_PHOTO);
                } else if ((sbc0Var == null ? null : sbc0Var).D) {
                    ikc0Var.hb(AttachType.PHOTO);
                } else if ((sbc0Var == null ? null : sbc0Var).F) {
                    ikc0Var.hb(AttachType.MUSIC);
                } else if ((sbc0Var == null ? null : sbc0Var).E) {
                    ikc0Var.hb(AttachType.VIDEO);
                } else if ((sbc0Var != null ? sbc0Var : null).G) {
                    ikc0Var.hb(AttachType.PLACE);
                }
                return s3q0.a;
            case 11:
                ((xww) obj2).c.invoke(Boolean.TRUE);
                return s3q0.a;
            case 12:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) obj2;
                int[] iArr = PrivacyEditFragment.W0;
                sw50.n c = rwi.d().c();
                ArrayList<UserProfile> arrayList = privacyEditFragment.L0.c;
                int size = arrayList == null ? 0 : arrayList.size();
                UserId[] userIdArr = new UserId[size];
                for (int i4 = 0; i4 < size; i4++) {
                    userIdArr[i4] = arrayList.get(i4).c;
                }
                c.b(privacyEditFragment, userIdArr, R.string.privacy_allowed_to, 101);
                return null;
            case 13:
                ((gzs) obj2).invoke();
                return Boolean.TRUE;
            case 14:
                return ((j1e0) obj2).g;
            case 15:
                f8e0 f8e0Var = (f8e0) obj2;
                if (f8e0Var.c != null) {
                    s3q0 s3q0Var = s3q0.a;
                }
                f8e0Var.dismiss();
                return s3q0.a;
            case 16:
                ((pbf0) obj2).v6(kci.d);
                return s3q0.a;
            case 17:
                ((Recomposer) obj2).I();
                return s3q0.a;
            case 18:
                gzs gzsVar = (gzs) ((zak0) ((com.vk.core.compose.component.cell.content.p0) obj2).e).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 19:
                dz20 dz20Var = (dz20) obj2;
                if (dz20Var != null) {
                    dz20Var.Qc("GoodsMultiPicker");
                }
                return s3q0.a;
            case 20:
                g2v.c().i().b(((SettingsListFragment) obj2).requireContext());
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr = SmartCropFragment.Q;
                Bundle requireArguments = ((SmartCropFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", SmartCropArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj = (SmartCropArguments) (parcelable2 instanceof SmartCropArguments ? parcelable2 : null);
                }
                return (SmartCropArguments) obj;
            case 22:
                return (SpeedView) ((ekk0) obj2).h.findViewById(R.id.speed_editor_view);
            case 23:
                return new sqj0(((StoryEditorExtDepsComponentImpl) obj2).b.O());
            case 24:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c(((e8m0) obj2).c)).a(fpf0.a(StoryEditorExtDepsComponent.class))).w0();
            case 25:
                return Integer.valueOf(((mc90) obj2).k());
            case 26:
                return ((TransformController) obj2).new g();
            case 27:
                return new v8r0((u8r0) obj2);
            case 28:
                ((com.vk.video.ad.b) obj2).f.c();
                return s3q0.a;
            default:
                return ((eos0) obj2).a.a(VideoGrowthType.GRAY_BUTTON);
        }
    }
}
