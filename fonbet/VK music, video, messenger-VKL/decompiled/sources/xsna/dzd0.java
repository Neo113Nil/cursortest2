package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.czd0;
import xsna.ikv0;

/* compiled from: ProfilePhotoTagsController.kt */
/* loaded from: classes3.dex */
public final class dzd0 {
    public final kyd0 a;
    public final ProfileMainPhotosFragment b;

    /* compiled from: ProfilePhotoTagsController.kt */
    public static final class a {
        public static void a(Context context) {
            c(context, y8g0.f(R.string.profile_photo_recognition_tag_added, ""));
        }

        public static void b(Context context) {
            c(context, y8g0.e(R.string.profile_photo_tag_deleted));
        }

        public static void c(Context context, String str) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
            aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
    }

    public dzd0(kyd0 kyd0Var, ProfileMainPhotosFragment profileMainPhotosFragment, e2s e2sVar) {
        this.a = kyd0Var;
        this.b = profileMainPhotosFragment;
    }

    public static void a(ProfilePhotoTag profilePhotoTag) {
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0Var.a(new zaa0(-9000, profilePhotoTag.b.c));
        ysg0Var.a(new czd0.a());
    }

    public static ArrayList b(wea0 wea0Var) {
        List<TagsSuggestions.Item> list;
        Object obj;
        Object obj2;
        Object obj3;
        List<TagsSuggestions.Item> list2;
        TagsSuggestions tagsSuggestions = wea0Var.b;
        int size = (tagsSuggestions == null || (list2 = tagsSuggestions.i) == null) ? 0 : list2.size();
        ArrayList arrayList = new ArrayList();
        UserId c = o25.a().c();
        if (tagsSuggestions != null && (list = tagsSuggestions.i) != null) {
            for (TagsSuggestions.Item item : list) {
                List<TagsSuggestions.Button> list3 = item.g;
                List<PhotoTag> list4 = item.f;
                Photo photo = item.e;
                Iterator<T> it = list3.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((TagsSuggestions.Button) obj2).c, "confirm")) {
                        break;
                    }
                }
                TagsSuggestions.Button button = (TagsSuggestions.Button) obj2;
                String str = button != null ? button.b : null;
                Iterator<T> it2 = item.g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (epx.f(((TagsSuggestions.Button) obj3).c, "decline")) {
                        break;
                    }
                }
                TagsSuggestions.Button button2 = (TagsSuggestions.Button) obj3;
                String str2 = button2 != null ? button2.b : null;
                Owner owner = wea0Var.c.get(photo.e);
                Iterator<T> it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (epx.f(((PhotoTag) next).c, c)) {
                        obj = next;
                        break;
                    }
                }
                PhotoTag photoTag = (PhotoTag) obj;
                photo.b = new ArrayList(list4);
                arrayList.add(new ProfilePhotoTag(item.e, owner, item.i, item.b, item.c, str, str2, size == 1, photoTag != null ? photoTag.e : 0L, photoTag != null ? photoTag.b : 0, false, item.h, 1024, null));
            }
        }
        return arrayList;
    }
}
