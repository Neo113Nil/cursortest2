package xsna;

import android.content.Context;
import android.media.MediaCodecInfo;
import androidx.media3.transformer.k;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerItem;
import com.vk.mediapicker.api.models.MediaPickerViewState;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediapicker.impl.presentation.mvi.g;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.mt10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hel implements k.b, ptk0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hel(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        tp10 tp10Var;
        MediaPickerViewState.Medias bVar;
        MediaPickerItem.ImageItem.SelectedState selectedState;
        Object obj;
        pt10 pt10Var = (pt10) this.b;
        mt10.a aVar = (mt10.a) this.c;
        MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) lm50Var;
        com.vk.mediapicker.impl.presentation.mvi.g gVar = pt10Var.c;
        if (gVar == null) {
            gVar = null;
        }
        Context context = gVar.a;
        MediaPickerMviState.Medias medias = mediaPickerMviState.g;
        List<AlbumEntry> list = mediaPickerMviState.d;
        int i = mediaPickerMviState.c;
        if (i != 0) {
            Iterator<AlbumEntry> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (it.next().b == i) {
                    break;
                } else {
                    i2++;
                }
            }
            List<AlbumEntry> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AlbumEntry) it2.next()).c);
            }
            tp10Var = new tp10(arrayList, i2);
        } else {
            tp10Var = new tp10(Collections.singletonList(context.getString(R.string.picker_all_photos_videos)), 0);
        }
        if (epx.f(medias, MediaPickerMviState.Medias.Error.b)) {
            bVar = MediaPickerViewState.Medias.a.a;
        } else if (epx.f(medias, MediaPickerMviState.Medias.Loading.b)) {
            bVar = MediaPickerViewState.Medias.c.a;
        } else {
            if (!(medias instanceof MediaPickerMviState.Medias.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaPickerMviState.Medias.Loaded loaded = (MediaPickerMviState.Medias.Loaded) medias;
            ArrayList arrayList2 = new ArrayList();
            boolean z = mediaPickerMviState.e;
            List<MediaStoreEntry> list3 = mediaPickerMviState.f;
            if (z) {
                arrayList2.add(MediaPickerItem.PartMediaPermissionWarningItem.b);
            }
            if (loaded.b) {
                arrayList2.add(new MediaPickerItem.CameraItem(list3.isEmpty()));
            }
            for (MediaStoreEntry mediaStoreEntry : loaded.c) {
                MediaPickerConfiguration.MultiSelectMode multiSelectMode = mediaPickerMviState.b;
                gk gkVar = gVar.b;
                StringBuilder sb = new StringBuilder();
                sb.append(context.getString(mediaStoreEntry instanceof MediaStoreVideoEntry ? R.string.accessibility_video : R.string.accessibility_photo));
                sb.append(", ");
                sb.append(context.getString(R.string.accessibility_file));
                sb.append(" ");
                com.vk.mediapicker.impl.presentation.mvi.g gVar2 = gVar;
                MediaPickerMviState mediaPickerMviState2 = mediaPickerMviState;
                sb.append(brm0.y(mediaStoreEntry.f().toString(), "file:///storage/emulated/0/", ""));
                if (mediaStoreEntry.e() != 0) {
                    sb.append(", ");
                    sb.append(context.getString(R.string.accessibility_file_created, gkVar.a(mediaStoreEntry.e())));
                } else if (mediaStoreEntry.d() > 31556926000L) {
                    sb.append(", ");
                    sb.append(context.getString(R.string.accessibility_file_modified, gkVar.a(mediaStoreEntry.d())));
                }
                String sb2 = sb.toString();
                int id = mediaStoreEntry.getId();
                if (multiSelectMode instanceof MediaPickerConfiguration.MultiSelectMode.Check) {
                    Iterator<T> it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (((MediaStoreEntry) obj).getId() == id) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    selectedState = obj != null ? MediaPickerItem.ImageItem.SelectedState.Checked.b : MediaPickerItem.ImageItem.SelectedState.NotSelected.b;
                } else if (multiSelectMode instanceof MediaPickerConfiguration.MultiSelectMode.Counter) {
                    Iterator<MediaStoreEntry> it4 = list3.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i3 = -1;
                            break;
                        } else if (it4.next().getId() == id) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    selectedState = i3 >= 0 ? new MediaPickerItem.ImageItem.SelectedState.Counted(i3 + 1) : MediaPickerItem.ImageItem.SelectedState.NotSelected.b;
                } else {
                    selectedState = MediaPickerItem.ImageItem.SelectedState.Disabled.b;
                }
                arrayList2.add(new MediaPickerItem.ImageItem(mediaStoreEntry, sb2, selectedState));
                gVar = gVar2;
                mediaPickerMviState = mediaPickerMviState2;
            }
            int i4 = g.a.$EnumSwitchMapping$0[loaded.e.ordinal()];
            bVar = new MediaPickerViewState.Medias.b(arrayList2, list3, i4 != 1 ? i4 != 2 ? MediaPickerViewState.Medias.Pagination.Loaded : MediaPickerViewState.Medias.Pagination.Error : MediaPickerViewState.Medias.Pagination.Loading);
        }
        aVar.bl(new MediaPickerViewState(tp10Var, bVar));
    }

    @Override // androidx.media3.transformer.k.b
    public int b(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.b;
        m6g m6gVar = (m6g) this.c;
        m6gVar.getClass();
        return hjp.h(mediaCodecInfo, str, m6gVar) ? 0 : Integer.MAX_VALUE;
    }
}
