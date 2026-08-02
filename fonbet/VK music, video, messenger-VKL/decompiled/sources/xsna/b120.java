package xsna;

import android.os.SystemClock;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.dto.photo.Photo;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.xn50;

/* compiled from: MediaViewer.kt */
/* loaded from: classes4.dex */
public final class b120 implements p.c {
    public final /* synthetic */ x020 b;

    public b120(x020 x020Var) {
        this.b = x020Var;
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void Bi(com.vk.attachpicker.screen.p pVar, MediaStoreEntry mediaStoreEntry) {
        ActionsAvailabilityState.Availability W;
        x020 x020Var = this.b;
        if (x020Var.g) {
            Photo photo = (Photo) x020Var.h.get(Integer.valueOf(mediaStoreEntry.getId()));
            if (photo == null) {
                return;
            }
            PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection toggleVkPhotoItemSelection = new PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection(new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(photo)), SystemClock.elapsedRealtime());
            PostingFragment postingFragment = x020Var.a;
            efc0 feature = postingFragment.getFeature();
            if (feature == null || (W = efc0.W(feature)) == null) {
                return;
            }
            if (W instanceof ActionsAvailabilityState.Availability.Available) {
                xn50.a.c(postingFragment, toggleVkPhotoItemSelection);
                return;
            }
            if (!(W instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) W).b;
            if (postingUserMessage != null) {
                com.vk.core.simplescreen.a aVar = x020Var.e;
                xn50.a.c(postingFragment, new PostingAction.ShowMessage(postingUserMessage, toggleVkPhotoItemSelection, 0, 0, 0, 0, aVar != null ? aVar.getWindow() : null, 60, null));
                return;
            }
            return;
        }
        PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection a = x020.a(mediaStoreEntry);
        PostingFragment postingFragment2 = x020Var.a;
        efc0 feature2 = postingFragment2.getFeature();
        if (feature2 != null) {
            PostingState postingState = (PostingState) feature2.g.c;
            ActionsAvailabilityState.Availability e0 = mediaStoreEntry instanceof MediaStoreVideoEntry ? efc0.e0(postingState) : mediaStoreEntry instanceof MediaStoreImageEntry ? efc0.V(postingState) : ActionsAvailabilityState.Availability.Available.b;
            if (e0 == null) {
                return;
            }
            if (e0 instanceof ActionsAvailabilityState.Availability.Available) {
                xn50.a.c(postingFragment2, a);
                return;
            }
            if (!(e0 instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingUserMessage postingUserMessage2 = ((ActionsAvailabilityState.Availability.NotAvailable) e0).b;
            if (postingUserMessage2 != null) {
                com.vk.core.simplescreen.a aVar2 = x020Var.e;
                xn50.a.c(postingFragment2, new PostingAction.ShowMessage(postingUserMessage2, a, 0, 0, 0, 0, aVar2 != null ? aVar2.getWindow() : null, 60, null));
            }
        }
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void N7(MediaStoreEntry mediaStoreEntry) {
        LocalMediaEntry video;
        x020 x020Var = this.b;
        if (x020Var.g) {
            Photo photo = (Photo) x020Var.h.get(Integer.valueOf(mediaStoreEntry.getId()));
            if (photo == null) {
                return;
            }
            efc0 feature = x020Var.a.getFeature();
            x020Var.b(new PostingAction.MediaPicker.Selection.AddVkPhotoItemSelection(new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(photo)), SystemClock.elapsedRealtime()), feature != null ? efc0.W(feature) : null);
            return;
        }
        efc0 feature2 = x020Var.a.getFeature();
        if (feature2 != null) {
            PostingState postingState = (PostingState) feature2.g.c;
            r2 = mediaStoreEntry instanceof MediaStoreVideoEntry ? efc0.e0(postingState) : mediaStoreEntry instanceof MediaStoreImageEntry ? efc0.V(postingState) : ActionsAvailabilityState.Availability.Available.b;
        }
        if (mediaStoreEntry instanceof MediaStoreImageEntry) {
            video = new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry);
        } else {
            if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            video = new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry);
        }
        x020Var.b(new PostingAction.MediaPicker.Selection.AddLocalMediaItemSelection(new MediaPickerSelectedItem.LocalMedia(video), SystemClock.elapsedRealtime()), r2);
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void ig(com.vk.attachpicker.screen.a aVar, MediaStoreEntry mediaStoreEntry) {
        ActionsAvailabilityState.Availability Z;
        x020 x020Var = this.b;
        if (x020Var.g) {
            Photo photo = (Photo) x020Var.h.get(Integer.valueOf(mediaStoreEntry.getId()));
            if (photo == null) {
                return;
            }
            PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection toggleVkPhotoItemSelection = new PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection(new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(photo)), SystemClock.elapsedRealtime());
            PostingFragment postingFragment = x020Var.a;
            efc0 feature = postingFragment.getFeature();
            if (feature == null || (Z = efc0.Z(feature, photo)) == null) {
                return;
            }
            if (Z instanceof ActionsAvailabilityState.Availability.Available) {
                xn50.a.c(postingFragment, toggleVkPhotoItemSelection);
                return;
            }
            if (!(Z instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) Z).b;
            if (postingUserMessage != null) {
                com.vk.core.simplescreen.a aVar2 = x020Var.e;
                xn50.a.c(postingFragment, new PostingAction.ShowMessage(postingUserMessage, toggleVkPhotoItemSelection, 0, 0, 0, 0, aVar2 != null ? aVar2.getWindow() : null, 60, null));
                return;
            }
            return;
        }
        PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection a = x020.a(mediaStoreEntry);
        PostingFragment postingFragment2 = x020Var.a;
        efc0 feature2 = postingFragment2.getFeature();
        if (feature2 != null) {
            PostingState postingState = (PostingState) feature2.g.c;
            ActionsAvailabilityState.Availability g0 = mediaStoreEntry instanceof MediaStoreVideoEntry ? efc0.g0(postingState) : mediaStoreEntry instanceof MediaStoreImageEntry ? efc0.X(((MediaStoreImageEntry) mediaStoreEntry).k, postingState) : ActionsAvailabilityState.Availability.Available.b;
            if (g0 == null) {
                return;
            }
            if (g0 instanceof ActionsAvailabilityState.Availability.Available) {
                xn50.a.c(postingFragment2, a);
                return;
            }
            if (!(g0 instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingUserMessage postingUserMessage2 = ((ActionsAvailabilityState.Availability.NotAvailable) g0).b;
            if (postingUserMessage2 != null) {
                com.vk.core.simplescreen.a aVar3 = x020Var.e;
                xn50.a.c(postingFragment2, new PostingAction.ShowMessage(postingUserMessage2, a, 0, 0, 0, 0, aVar3 != null ? aVar3.getWindow() : null, 60, null));
            }
        }
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final a.c k9(int i) {
        return this.b.i;
    }

    @Override // com.vk.attachpicker.screen.p.c
    public final void zc(int i, int i2) {
    }
}
