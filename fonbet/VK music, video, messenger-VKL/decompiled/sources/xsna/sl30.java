package xsna;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.video.ui.edit.privacy.PrivacyEditVideoWatchFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.lh80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sl30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zl20) obj2).invoke(obj);
                break;
            case 1:
                ((h5b) obj2).invoke(obj);
                break;
            case 2:
                ((zl20) obj2).invoke(obj);
                break;
            case 3:
                ((zl20) obj2).invoke(obj);
                break;
            case 4:
                ((zl20) obj2).invoke(obj);
                break;
            case 5:
                ((fh4) obj2).invoke(obj);
                break;
            case 6:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                ((zl20) obj2).invoke(obj);
                break;
            case 7:
                ((o770) obj2).invoke(obj);
                break;
            case 8:
                yq70 yq70Var = (yq70) obj2;
                yq70Var.c.onNext(yq70Var.c(obj));
                break;
            case 9:
                ((lh80.a) obj2).invoke(obj);
                break;
            case 10:
                ((br80) obj2).invoke(obj);
                break;
            case 11:
                ((zl20) obj2).invoke(obj);
                break;
            case 12:
                ((zl20) obj2).invoke(obj);
                break;
            case 13:
                ((zl20) obj2).invoke(obj);
                break;
            case 14:
                ((h1) obj2).invoke(obj);
                break;
            case 15:
                ((s6x) obj2).invoke(obj);
                break;
            case 16:
                ((zl20) obj2).invoke(obj);
                break;
            case 17:
                ((zl20) obj2).invoke(obj);
                break;
            case 18:
                qcy<Object>[] qcyVarArr2 = PrivacyEditVideoWatchFragment.a1;
                ((s6x) obj2).invoke(obj);
                break;
            case 19:
                ((zl20) obj2).invoke(obj);
                break;
            case 20:
                ((nk0) obj2).invoke(obj);
                break;
            case 21:
                int i2 = SDKInviteDialog.X;
                ((rtg0) obj2).invoke(obj);
                break;
            case 22:
                ((fd5) obj2).invoke(obj);
                break;
            case 23:
                ((nk0) obj2).invoke(obj);
                break;
            case 24:
                ((fd5) obj2).invoke(obj);
                break;
            case 25:
                ((ikj0) obj2).invoke(obj);
                break;
            case 26:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) obj2;
                WeakReference<vrl0> weakReference = bVar.f0;
                ArrayList arrayList = (ArrayList) obj;
                cmf0 cmf0Var = cmf0.a;
                if (arrayList == null) {
                    cmf0Var.c(bVar.getContext(), bVar.l0, R.string.story_loading_error);
                    bVar.finish();
                    break;
                } else {
                    TextView textView = bVar.e0;
                    ImageView imageView = bVar.c0;
                    TextView textView2 = bVar.W;
                    StoryAvatarView storyAvatarView = bVar.V;
                    FrameLayout frameLayout = bVar.T;
                    VKImageView vKImageView = bVar.a0;
                    if (weakReference.get() != null) {
                        weakReference.get().g();
                    }
                    if (!arrayList.isEmpty() && ((StoriesContainer) arrayList.get(0)).Eb()) {
                        if (!((StoriesContainer) arrayList.get(0)).g.get(0).k && !((StoriesContainer) arrayList.get(0)).g.get(0).p) {
                            bVar.v = arrayList;
                            bVar.S.notifyDataSetChanged();
                            frameLayout.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new c8z(bVar, 1)).setDuration(225L).start();
                            break;
                        } else {
                            StoriesContainer storiesContainer = (StoriesContainer) arrayList.get(0);
                            StoryOwner storyOwner = storiesContainer.b;
                            AvatarBorderType avatarBorderType = (storyOwner == null || !storyOwner.Lb()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON;
                            StoryOwner storyOwner2 = storiesContainer.b;
                            storyAvatarView.s1(storyOwner2 != null ? storyOwner2.Bb() : null, avatarBorderType);
                            StoryOwner storyOwner3 = storiesContainer.b;
                            textView2.setText(storyOwner3 != null ? storyOwner3.Db() : null);
                            vKImageView.setVisibility(0);
                            bVar.b0.setVisibility(0);
                            bVar.U.setVisibility(8);
                            if (storiesContainer.g.get(0).k) {
                                imageView.setImageResource(R.drawable.ic_story_expired_72);
                                textView.setText(R.string.story_expired);
                            } else {
                                imageView.setImageResource(R.drawable.ic_story_access_denied_72);
                                textView.setText(R.string.story_private_error);
                            }
                            vKImageView.setPostprocessor(z8m0.e);
                            vKImageView.O0(storiesContainer.g.get(0).Cb(false), ImageScreenSize.BIG);
                            olm0 olm0Var = new olm0(bVar, storiesContainer);
                            storyAvatarView.setOnClickListener(olm0Var);
                            textView2.setOnClickListener(olm0Var);
                            frameLayout.setOnTouchListener(bVar.N);
                            break;
                        }
                    } else {
                        cmf0Var.c(bVar.getContext(), bVar.l0, R.string.story_deleted);
                        bVar.finish();
                        break;
                    }
                }
                break;
            case 27:
                ((izs) obj2).invoke(obj);
                break;
            case 28:
                ((rtg0) obj2).invoke(obj);
                break;
            default:
                ((l4k0) obj2).invoke(obj);
                break;
        }
    }
}
