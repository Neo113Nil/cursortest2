package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerPageLoadType;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$LocalAlbumsChanged;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$ReloadLocalAlbums;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$SelectAlbum;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.a;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.efc0;
import xsna.fmc0;

/* compiled from: MediaPickerFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class st10 {
    public final efc0.a a;
    public final ibc0 b;
    public final ur10 c;
    public final qj1 d;
    public final xci0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public final xq10 g;

    public st10(efc0.a aVar, ibc0 ibc0Var) {
        this.a = aVar;
        this.b = ibc0Var;
        ur10 ur10Var = new ur10();
        this.c = ur10Var;
        this.d = new qj1(aVar, ur10Var);
        this.e = new xci0(aVar, ibc0Var);
        this.g = new xq10();
    }

    public static ArrayList d(List list) {
        Parcelable video;
        List<MediaStoreEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MediaStoreEntry mediaStoreEntry : list2) {
            if (mediaStoreEntry instanceof MediaStoreImageEntry) {
                video = new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry);
            } else {
                if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                    throw new NoWhenBranchMatchedException();
                }
                video = new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry);
            }
            arrayList.add(video);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(PostingState postingState, PostingAction.MediaPicker mediaPicker) {
        ActionsAvailabilityState.Availability b;
        ActionsAvailabilityState.Availability g0;
        cvz cvzVar;
        Uri uri;
        Uri uri2;
        Object obj;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        qj1 qj1Var = this.d;
        ur10 ur10Var = this.c;
        efc0.a aVar = this.a;
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        if (mediaPicker instanceof PostingAction.MediaPicker.LoadLocalMediaPage) {
            MediaPickerPageLoadType mediaPickerPageLoadType = ((PostingAction.MediaPicker.LoadLocalMediaPage) mediaPicker).b;
            MediaPickerState z6 = postingState.z6();
            List<LocalAlbum> list = z6.c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((LocalAlbum) obj).b == z6.d) {
                            break;
                        }
                    }
                }
                LocalAlbum localAlbum = (LocalAlbum) obj;
                if (localAlbum == null) {
                    return;
                }
                int i5 = localAlbum.b;
                boolean contains = e43.l(MediaPickerPageLoadType.Reload, MediaPickerPageLoadType.InitialLoad).contains(mediaPickerPageLoadType);
                if (z6.b instanceof a.c) {
                    return;
                }
                int size = contains ? 0 : z6.f.size();
                int i6 = size == 0 ? 17 : 100;
                aVar.a(new e.b.d(localAlbum, size, i6, mediaPickerPageLoadType));
                efc0 efc0Var = aVar.a;
                ((dvz) ur10Var.b.getValue()).getClass();
                int i7 = size + i6;
                int i8 = localAlbum.c;
                if (i7 >= i8) {
                    i6 = i8 - size;
                }
                bpn0 bpn0Var = iz10.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                efc0Var.e.b(iz10.a(context).d(111, i5, size, i6).q(asu0.a.c()).subscribe(new rt10(new mjs(this, contains, localAlbum, i4), i3), new vl0(new hxl(this, 19), 29)));
                if (contains) {
                    io.reactivex.rxjava3.disposables.c cVar = this.f;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    ((dvz) ur10Var.b.getValue()).getClass();
                    c3t c3tVar = new c3t(i5);
                    io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                    a3t a3tVar = new a3t(new y2t(ref$ObjectRef, bVar, c3tVar, fVar, 0), (Handler) c3tVar.b);
                    Context context2 = e43.a;
                    Context context3 = context2 != null ? context2 : null;
                    Iterator it2 = h020.c.iterator();
                    while (it2.hasNext()) {
                        context3.getContentResolver().registerContentObserver((Uri) it2.next(), true, a3tVar);
                    }
                    bVar.b(new io.reactivex.rxjava3.disposables.a(new xsb(a3tVar, 1)));
                    io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.c0(fVar, lVar, new lx6(bVar, 4)).subscribe(new skz(new u6(22, this, localAlbum), 3), new o7y(new wmc(com.vk.metrics.eventtracking.b.a, 5), i2));
                    efc0Var.e.b(subscribe);
                    this.f = subscribe;
                    return;
                }
                return;
            }
            return;
        }
        if (mediaPicker instanceof PostingAction$MediaPicker$Album$SelectAlbum) {
            PostingAction$MediaPicker$Album$SelectAlbum postingAction$MediaPicker$Album$SelectAlbum = (PostingAction$MediaPicker$Album$SelectAlbum) mediaPicker;
            efc0.a aVar2 = qj1Var.a;
            int i9 = postingState.z6().d;
            int i10 = postingAction$MediaPicker$Album$SelectAlbum.b;
            if (i9 == i10) {
                return;
            }
            aVar2.a(new e.b.a(i10));
            aVar2.d(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.Reload));
            aVar2.e(new fmc0.h.a(i10, postingAction$MediaPicker$Album$SelectAlbum.c));
            return;
        }
        if (mediaPicker instanceof PostingAction$MediaPicker$Album$LocalAlbumsChanged) {
            qj1Var.getClass();
            MediaPickerState z62 = postingState.z6();
            efc0.a aVar3 = qj1Var.a;
            List<LocalAlbum> list2 = ((PostingAction$MediaPicker$Album$LocalAlbumsChanged) mediaPicker).b;
            aVar3.a(new e.b.C1423b(list2));
            if (z62.c == null) {
                aVar3.d(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.InitialLoad));
                return;
            }
            List<LocalAlbum> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((LocalAlbum) it3.next()).b == z62.d) {
                        return;
                    }
                }
            }
            aVar3.d(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.Reload));
            return;
        }
        if (mediaPicker instanceof PostingAction$MediaPicker$Album$ReloadLocalAlbums) {
            qj1Var.getClass();
            if (epx.f(postingState.z6().i, Boolean.TRUE)) {
                io.reactivex.rxjava3.disposables.c cVar2 = qj1Var.c;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                ko1 ko1Var = (ko1) qj1Var.b.a.getValue();
                Context context4 = e43.a;
                String string = (context4 != null ? context4 : null).getString(R.string.media_picker_recent_media_album);
                ko1Var.getClass();
                io.reactivex.rxjava3.subjects.f fVar2 = new io.reactivex.rxjava3.subjects.f();
                io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
                bVar2.b(ko1Var.a(fVar2, string));
                jo1 jo1Var = new jo1(bVar2, ko1Var, fVar2, string, new Handler(Looper.getMainLooper()));
                Iterator it4 = h020.c.iterator();
                while (it4.hasNext()) {
                    ((ContentResolver) ko1Var.b.getValue()).registerContentObserver((Uri) it4.next(), true, jo1Var);
                }
                bVar2.b(new io.reactivex.rxjava3.disposables.f(new eo1(0, ko1Var, jo1Var)));
                io.reactivex.rxjava3.disposables.c subscribe2 = new io.reactivex.rxjava3.internal.operators.observable.c0(fVar2, lVar, new fo1(bVar2, i3)).subscribe(new vl0(new s6(qj1Var, i), i2), new ea(new pj1(com.vk.metrics.eventtracking.b.a, 0), i));
                qj1Var.a.a.e.b(subscribe2);
                qj1Var.c = subscribe2;
                return;
            }
            return;
        }
        if (!(mediaPicker instanceof PostingAction.MediaPicker.Selection.RemoveAttachFromSelected) && !(mediaPicker instanceof PostingAction.MediaPicker.Selection)) {
            if (mediaPicker instanceof PostingAction.MediaPicker.OpenCamera) {
                if (postingState instanceof PostingState.Editing) {
                    if (epx.f(((PostingState.Editing) postingState).f.j, Boolean.TRUE)) {
                        aVar.e(fmc0.j.f.a);
                        return;
                    } else {
                        aVar.e(new fmc0.c.a());
                        return;
                    }
                }
                return;
            }
            if (mediaPicker instanceof PostingAction.MediaPicker.CameraClosed) {
                PostingAction.MediaPicker.CameraClosed cameraClosed = (PostingAction.MediaPicker.CameraClosed) mediaPicker;
                if ((postingState instanceof PostingState.Editing) && (uri2 = cameraClosed.b) != null) {
                    ur10Var.getClass();
                    aVar.a.e.b(ur10.a(uri2).subscribe(new w00(new jjx(this, 5), 23)));
                    return;
                }
                return;
            }
            if (mediaPicker instanceof PostingAction.MediaPicker.SheetStateChanged) {
                PostingAction.MediaPicker.SheetStateChanged sheetStateChanged = (PostingAction.MediaPicker.SheetStateChanged) mediaPicker;
                if (postingState instanceof PostingState.Editing) {
                    aVar.a(new e.b.i(sheetStateChanged.b));
                    return;
                }
                return;
            }
            if (mediaPicker instanceof PostingAction.MediaPicker.SheetTransition) {
                PostingAction.MediaPicker.SheetTransition sheetTransition = (PostingAction.MediaPicker.SheetTransition) mediaPicker;
                if (postingState instanceof PostingState.Editing) {
                    aVar.a(new e.b.j(sheetTransition.b));
                    return;
                }
                return;
            }
            if (mediaPicker instanceof PostingAction.MediaPicker.OnSheetTransitionFinished) {
                MediaPickerState.SheetState sheetState = ((PostingAction.MediaPicker.OnSheetTransitionFinished) mediaPicker).b;
                if (postingState instanceof PostingState.Editing) {
                    aVar.a(new e.b.g(sheetState));
                    if (sheetState == MediaPickerState.SheetState.Hidden) {
                        aVar.e(fmc0.a.a);
                        aVar.a(e.c.a.b);
                        return;
                    }
                    return;
                }
                return;
            }
            if (mediaPicker instanceof PostingAction.MediaPicker.AddAttachFromUri) {
                PostingAction.MediaPicker.AddAttachFromUri addAttachFromUri = (PostingAction.MediaPicker.AddAttachFromUri) mediaPicker;
                if ((postingState instanceof PostingState.Editing) && (uri = addAttachFromUri.b) != null) {
                    if (addAttachFromUri.c) {
                        b(uri, ((PostingState.Editing) postingState).c.b.b);
                        return;
                    }
                    if (oeq0.e(uri)) {
                        ur10Var.getClass();
                        aVar.a.e.b(ur10.a(uri).subscribe(new pdw(new rh4(20, postingState, this), i2)));
                        return;
                    }
                    MediaPickerSelectedItem.LocalMedia c = c(uri);
                    if (c != null) {
                        e(((PostingState.Editing) postingState).c.b.b.b, c.b);
                        aVar.a(new e.b.h.c(c, true));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(mediaPicker instanceof PostingAction.MediaPicker.ReplaceAttachFromUri)) {
                if (!(mediaPicker instanceof PostingAction.MediaPicker.PageViewCreated)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.e(fmc0.h.c.a);
                return;
            }
            PostingAction.MediaPicker.ReplaceAttachFromUri replaceAttachFromUri = (PostingAction.MediaPicker.ReplaceAttachFromUri) mediaPicker;
            if (postingState instanceof PostingState.Editing) {
                Uri uri3 = replaceAttachFromUri.c;
                MediaStoreEntry mediaStoreEntry = replaceAttachFromUri.b;
                if (uri3 == null) {
                    return;
                }
                if (mediaStoreEntry instanceof MediaStoreImageEntry) {
                    cvzVar = new LocalPhotoAttachment(new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry));
                } else if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                    Serializer.c<LocalVideoAttachment> cVar3 = LocalVideoAttachment.CREATOR;
                    cvzVar = LocalVideoAttachment.a.a(new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry));
                } else {
                    cvzVar = null;
                }
                PostingState.Editing editing = (PostingState.Editing) postingState;
                PostingContext postingContext = editing.c;
                Iterator<T> it5 = editing.i.p.iterator();
                int i11 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    Object next = it5.next();
                    if (i11 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (epx.f(((PostingAttachment) next).nb(), cvzVar)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
                if (cvzVar != null) {
                    aVar.a(new e.b.h.c(new MediaPickerSelectedItem.LocalMedia(cvzVar.M3()), false));
                }
                if (cvzVar != null) {
                    if (uri3.equals(mediaStoreEntry != null ? mediaStoreEntry.f() : null)) {
                        aVar.a(new e.b.h.C1425b(new MediaPickerSelectedItem.LocalMedia(cvzVar.M3()), valueOf));
                        return;
                    }
                }
                if (replaceAttachFromUri.d) {
                    b(uri3, postingContext.b.b);
                    return;
                }
                if (oeq0.e(uri3)) {
                    ur10Var.getClass();
                    aVar.a.e.b(ur10.a(uri3).subscribe(new k2y(new dlb(postingState, this, valueOf, 6), i2)));
                    return;
                }
                MediaPickerSelectedItem.LocalMedia c2 = c(uri3);
                if (c2 != null) {
                    e(postingContext.b.b.b, c2.b);
                    aVar.a(new e.b.h.C1425b(c2, valueOf));
                    return;
                }
                return;
            }
            return;
        }
        xci0 xci0Var = this.e;
        PostingAction.MediaPicker.Selection selection = (PostingAction.MediaPicker.Selection) mediaPicker;
        efc0.a aVar4 = xci0Var.a;
        if (selection instanceof PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection) {
            PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection toggleLocalMediaItemSelection = (PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing2 = (PostingState.Editing) postingState;
                List<MediaPickerSelectedItem> list4 = editing2.f.e;
                MediaPickerSelectedItem.LocalMedia localMedia = toggleLocalMediaItemSelection.b;
                boolean contains2 = list4.contains(localMedia);
                if (contains2) {
                    MediaStoreEntry ba = localMedia.b.ba();
                    aVar4.a.getClass();
                    g0 = ba instanceof MediaStoreVideoEntry ? efc0.g0(postingState) : ba instanceof MediaStoreImageEntry ? efc0.X(((MediaStoreImageEntry) ba).k, postingState) : ActionsAvailabilityState.Availability.Available.b;
                } else {
                    MediaStoreEntry ba2 = localMedia.b.ba();
                    aVar4.a.getClass();
                    g0 = ba2 instanceof MediaStoreVideoEntry ? efc0.e0(postingState) : ba2 instanceof MediaStoreImageEntry ? efc0.V(postingState) : ActionsAvailabilityState.Availability.Available.b;
                }
                PostingAction.MediaPicker.Selection.ForceToggleLocalMediaItemSelection forceToggleLocalMediaItemSelection = new PostingAction.MediaPicker.Selection.ForceToggleLocalMediaItemSelection(localMedia, toggleLocalMediaItemSelection.c);
                if (g0 instanceof ActionsAvailabilityState.Availability.NotAvailable) {
                    PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) g0).b;
                    if (postingUserMessage != null) {
                        aVar4.d(new PostingAction.ShowMessage(postingUserMessage, forceToggleLocalMediaItemSelection, 0, 0, 0, 0, null, 60, null));
                        return;
                    }
                    return;
                }
                if (g0 instanceof ActionsAvailabilityState.Availability.Available) {
                    xci0Var.b(contains2, editing2, toggleLocalMediaItemSelection.b, toggleLocalMediaItemSelection.c);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.ForceToggleLocalMediaItemSelection) {
            PostingAction.MediaPicker.Selection.ForceToggleLocalMediaItemSelection forceToggleLocalMediaItemSelection2 = (PostingAction.MediaPicker.Selection.ForceToggleLocalMediaItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing3 = (PostingState.Editing) postingState;
                xci0Var.b(editing3.f.e.contains(forceToggleLocalMediaItemSelection2.b), editing3, forceToggleLocalMediaItemSelection2.b, forceToggleLocalMediaItemSelection2.c);
                return;
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection) {
            PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection toggleVkPhotoItemSelection = (PostingAction.MediaPicker.Selection.ToggleVkPhotoItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing4 = (PostingState.Editing) postingState;
                List<MediaPickerSelectedItem> list5 = editing4.f.e;
                MediaPickerSelectedItem.VkPhoto vkPhoto = toggleVkPhotoItemSelection.b;
                boolean contains3 = list5.contains(vkPhoto);
                ActionsAvailabilityState.Availability W = !contains3 ? efc0.W(aVar4.a) : efc0.Z(aVar4.a, vkPhoto.b.b);
                PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection forceToggleVkPhotoItemSelection = new PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection(vkPhoto, toggleVkPhotoItemSelection.c);
                if (W instanceof ActionsAvailabilityState.Availability.NotAvailable) {
                    PostingUserMessage postingUserMessage2 = ((ActionsAvailabilityState.Availability.NotAvailable) W).b;
                    if (postingUserMessage2 != null) {
                        aVar4.d(new PostingAction.ShowMessage(postingUserMessage2, forceToggleVkPhotoItemSelection, 0, 0, 0, 0, null, 60, null));
                        return;
                    }
                    return;
                }
                if (W instanceof ActionsAvailabilityState.Availability.Available) {
                    xci0Var.c(contains3, editing4, toggleVkPhotoItemSelection.b, toggleVkPhotoItemSelection.c);
                    s3q0 s3q0Var2 = s3q0.a;
                    return;
                }
                return;
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.AddVkPhotoItemSelection) {
            PostingAction.MediaPicker.Selection.AddVkPhotoItemSelection addVkPhotoItemSelection = (PostingAction.MediaPicker.Selection.AddVkPhotoItemSelection) selection;
            MediaPickerSelectedItem.VkPhoto vkPhoto2 = addVkPhotoItemSelection.b;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing5 = (PostingState.Editing) postingState;
                if (editing5.f.e.contains(vkPhoto2)) {
                    return;
                }
                ActionsAvailabilityState.Availability W2 = efc0.W(aVar4.a);
                PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection forceToggleVkPhotoItemSelection2 = new PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection(vkPhoto2, addVkPhotoItemSelection.c);
                if (W2 instanceof ActionsAvailabilityState.Availability.NotAvailable) {
                    PostingUserMessage postingUserMessage3 = ((ActionsAvailabilityState.Availability.NotAvailable) W2).b;
                    if (postingUserMessage3 != null) {
                        aVar4.d(new PostingAction.ShowMessage(postingUserMessage3, forceToggleVkPhotoItemSelection2, 0, 0, 0, 0, null, 60, null));
                        return;
                    }
                    return;
                }
                if (W2 instanceof ActionsAvailabilityState.Availability.Available) {
                    xci0Var.c(false, editing5, addVkPhotoItemSelection.b, addVkPhotoItemSelection.c);
                    s3q0 s3q0Var3 = s3q0.a;
                    return;
                }
                return;
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection) {
            PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection forceToggleVkPhotoItemSelection3 = (PostingAction.MediaPicker.Selection.ForceToggleVkPhotoItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing6 = (PostingState.Editing) postingState;
                xci0Var.c(editing6.f.e.contains(forceToggleVkPhotoItemSelection3.b), editing6, forceToggleVkPhotoItemSelection3.b, forceToggleVkPhotoItemSelection3.c);
                return;
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection) {
            PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection toggleVkVideoItemSelection = (PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                boolean contains4 = ((PostingState.Editing) postingState).f.e.contains(toggleVkVideoItemSelection.b);
                ActionsAvailabilityState.Availability f0 = !contains4 ? efc0.f0(aVar4.a) : aVar4.b();
                age0 age0Var = new age0(1, xci0Var, postingState, toggleVkVideoItemSelection, contains4);
                if (!(f0 instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                    if (f0 instanceof ActionsAvailabilityState.Availability.Available) {
                        age0Var.invoke();
                        return;
                    }
                    return;
                } else {
                    PostingUserMessage postingUserMessage4 = ((ActionsAvailabilityState.Availability.NotAvailable) f0).b;
                    if (postingUserMessage4 != null) {
                        xci0Var.a.d(new PostingAction.ShowMessage(postingUserMessage4, toggleVkVideoItemSelection, 0, 0, 0, 0, null, 60, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.AddLocalMediaItemSelection) {
            PostingAction.MediaPicker.Selection.AddLocalMediaItemSelection addLocalMediaItemSelection = (PostingAction.MediaPicker.Selection.AddLocalMediaItemSelection) selection;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing7 = (PostingState.Editing) postingState;
                List<MediaPickerSelectedItem> list6 = editing7.f.e;
                MediaPickerSelectedItem.LocalMedia localMedia2 = addLocalMediaItemSelection.b;
                if (list6.contains(localMedia2)) {
                    return;
                }
                aVar4.a(new e.b.h.c(localMedia2, true));
                PostEditableData postEditableData = editing7.i;
                PostingSettings postingSettings = editing7.d;
                List<PostingAttachment> list7 = postEditableData.p;
                int size2 = list6.size();
                int i12 = postingSettings.c;
                if (size2 >= i12 || list7.size() >= i12) {
                    aVar4.e(new fmc0.h.d(i12));
                    return;
                } else {
                    if (list6.contains(localMedia2)) {
                        return;
                    }
                    aVar4.d(new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.PHOTO, Long.valueOf(addLocalMediaItemSelection.c), null, 4, null));
                    return;
                }
            }
            return;
        }
        if (selection instanceof PostingAction.MediaPicker.Selection.RemoveAttach) {
            xci0Var.e(postingState, (PostingAction.MediaPicker.Selection.RemoveAttach) selection);
            return;
        }
        if (!(selection instanceof PostingAction.MediaPicker.Selection.RemoveFromSelected)) {
            if (!(selection instanceof PostingAction.MediaPicker.Selection.RemoveAttachFromSelected)) {
                if (selection instanceof PostingAction.MediaPicker.Selection.ForceRemoveFromSelected) {
                    xci0Var.d(postingState, ((PostingAction.MediaPicker.Selection.ForceRemoveFromSelected) selection).b);
                    return;
                } else {
                    if (!(selection instanceof PostingAction.MediaPicker.Selection.ForceRemoveAttachFromSelected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xci0Var.a(postingState, ((PostingAction.MediaPicker.Selection.ForceRemoveAttachFromSelected) selection).b);
                    return;
                }
            }
            Attachment attachment = ((PostingAction.MediaPicker.Selection.RemoveAttachFromSelected) selection).b;
            ActionsAvailabilityState.Availability X = attachment instanceof LocalPhotoAttachment ? efc0.X(((LocalPhotoAttachment) attachment).getUri(), (PostingState) aVar4.a.g.c) : attachment instanceof LocalVideoAttachment ? aVar4.b() : attachment instanceof PhotoAttachment ? efc0.Z(aVar4.a, ((PhotoAttachment) attachment).l) : attachment instanceof VideoAttachment ? aVar4.b() : ActionsAvailabilityState.Availability.Available.b;
            PostingAction.MediaPicker.Selection.ForceRemoveAttachFromSelected forceRemoveAttachFromSelected = new PostingAction.MediaPicker.Selection.ForceRemoveAttachFromSelected(attachment);
            if (X instanceof ActionsAvailabilityState.Availability.NotAvailable) {
                PostingUserMessage postingUserMessage5 = ((ActionsAvailabilityState.Availability.NotAvailable) X).b;
                if (postingUserMessage5 != null) {
                    aVar4.d(new PostingAction.ShowMessage(postingUserMessage5, forceRemoveAttachFromSelected, 0, 0, 0, 0, null, 60, null));
                    return;
                }
                return;
            }
            if (X instanceof ActionsAvailabilityState.Availability.Available) {
                xci0Var.a(postingState, attachment);
                s3q0 s3q0Var4 = s3q0.a;
                return;
            }
            return;
        }
        MediaPickerSelectedItem mediaPickerSelectedItem = ((PostingAction.MediaPicker.Selection.RemoveFromSelected) selection).b;
        if (postingState instanceof PostingState.Editing) {
            if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia) {
                LocalMediaEntry localMediaEntry = ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b;
                if (localMediaEntry instanceof LocalMediaEntry.Image) {
                    b = efc0.X(((LocalMediaEntry.Image) localMediaEntry).b.k, (PostingState) aVar4.a.g.c);
                } else {
                    if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = aVar4.b();
                }
            } else if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto) {
                b = efc0.Z(aVar4.a, ((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b.b);
            } else {
                if (!(mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo)) {
                    throw new NoWhenBranchMatchedException();
                }
                b = aVar4.b();
            }
            PostingAction.MediaPicker.Selection.ForceRemoveFromSelected forceRemoveFromSelected = new PostingAction.MediaPicker.Selection.ForceRemoveFromSelected(mediaPickerSelectedItem);
            if (b instanceof ActionsAvailabilityState.Availability.NotAvailable) {
                PostingUserMessage postingUserMessage6 = ((ActionsAvailabilityState.Availability.NotAvailable) b).b;
                if (postingUserMessage6 != null) {
                    aVar4.d(new PostingAction.ShowMessage(postingUserMessage6, forceRemoveFromSelected, 0, 0, 0, 0, null, 60, null));
                    return;
                }
                return;
            }
            if (b instanceof ActionsAvailabilityState.Availability.Available) {
                xci0Var.d(postingState, mediaPickerSelectedItem);
                s3q0 s3q0Var5 = s3q0.a;
            }
        }
    }

    public final void b(Uri uri, UserId userId) {
        MediaUtils.f d;
        String n = com.vk.core.files.a.n(uri);
        MediaPickerSelectedItem.LocalMedia localMedia = null;
        localMedia = null;
        if (n != null && n.length() != 0) {
            long I = com.vk.core.files.a.I(new File(n));
            Uri f = oeq0.f(uri, jeq0.g(n));
            if (oeq0.e(f)) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                d = MediaUtils.a.c(context, f, false);
            } else {
                d = MediaUtils.a.d(uri.toString());
            }
            if (d == null) {
                d = MediaUtils.a.d(drm0.U(uri.toString(), "file://"));
            }
            int i = (d != null ? d.f : 0) / 1000;
            int i2 = d != null ? d.a : 0;
            int i3 = d != null ? d.b : 0;
            VideoFileOld videoFileOld = new VideoFileOld();
            videoFileOld.q = (int) (System.currentTimeMillis() / 1000);
            videoFileOld.e = i;
            HashMap hashMap = new HashMap();
            VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
            String uri2 = f.toString();
            if (uri2 != null) {
                String str = myc0.f(uri2) ? uri2 : null;
                if (str != null) {
                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl, str);
                }
            }
            videoFileOld.f = new VideoUrlStorage(hashMap);
            String lastPathSegment = Uri.parse(n).getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            videoFileOld.l = lastPathSegment;
            videoFileOld.c = com.vk.upload.impl.a.d.getAndIncrement();
            videoFileOld.I = false;
            videoFileOld.B = false;
            videoFileOld.C = false;
            videoFileOld.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(f.toString(), i2, i3, null, (char) 0, false, 56, null)));
            videoFileOld.m0 = i2;
            videoFileOld.n0 = i3;
            int i4 = videoFileOld.c;
            gpt0 gpt0Var = gpt0.a;
            localMedia = new MediaPickerSelectedItem.LocalMedia(new LocalMediaEntry.Video(new MediaStoreVideoEntry(i4, f, videoFileOld.b0() * 1000, videoFileOld.m0, videoFileOld.n0, videoFileOld.b0() * 1000, I, videoFileOld.e)));
        }
        if (localMedia != null) {
            e(userId.b, localMedia.b);
            this.a.a(new e.b.h.c(localMedia, true));
        }
    }

    public final MediaPickerSelectedItem.LocalMedia c(Uri uri) {
        boolean z;
        try {
            String n = com.vk.core.files.a.n(uri);
            if (n != null && n.length() != 0) {
                File file = new File(n);
                try {
                    z = file.exists();
                } catch (SecurityException unused) {
                    z = false;
                }
                if (z) {
                    this.g.getClass();
                    return xq10.a(uri, file);
                }
            }
            return null;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            return null;
        }
    }

    public final void e(long j, LocalMediaEntry localMediaEntry) {
        if (!(localMediaEntry instanceof LocalMediaEntry.Image)) {
            if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                throw new NoWhenBranchMatchedException();
            }
            this.b.u().C(kbc0.f((LocalMediaEntry.Video) localMediaEntry, j));
        } else {
            LocalMediaEntry.Image image = (LocalMediaEntry.Image) localMediaEntry;
            PostingAttachmentInfo e = kbc0.e(image, j);
            MediaStoreImageEntry mediaStoreImageEntry = image.b;
            this.a.d(new PostingAction.Stats.SendAttachPhoto(e, mediaStoreImageEntry.m, mediaStoreImageEntry.n, mediaStoreImageEntry.k));
        }
    }
}
