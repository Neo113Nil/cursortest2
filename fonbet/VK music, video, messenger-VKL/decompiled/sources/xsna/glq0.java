package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qn60;

/* compiled from: UserPhotoChangedEditorAction.kt */
/* loaded from: classes4.dex */
public final class glq0 implements qn60.b {
    public final UserId a;
    public final Image b;
    public final pn60 c;

    /* compiled from: UserPhotoChangedEditorAction.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Object, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            Owner s;
            EntryHeader header;
            SourcePhoto sourcePhoto;
            List<Owner> list;
            UserId userId = ((glq0) this.receiver).a;
            boolean z = false;
            z = false;
            z = false;
            z = false;
            z = false;
            if ((obj instanceof wsx0) && (header = ((wsx0) obj).getHeader()) != null && (sourcePhoto = header.b) != null && (list = sourcePhoto.b) != null) {
                List<Owner> list2 = list;
                if (list2 instanceof RandomAccess) {
                    List<Owner> list3 = list2;
                    int size = list3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        if (epx.f(list3.get(i).b, userId)) {
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((Owner) it.next()).b, userId)) {
                            z = true;
                        }
                    }
                }
            }
            return Boolean.valueOf(((obj instanceof l490) && (s = ((l490) obj).s()) != null && epx.f(s.b, userId)) ? true : z);
        }
    }

    /* compiled from: UserPhotoChangedEditorAction.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Object, List<? extends ol60>, List<? extends ol60>> {
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
        @Override // xsna.wzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends ol60> invoke(Object obj, List<? extends ol60> list) {
            boolean z;
            String str;
            EntryHeader header;
            SourcePhoto sourcePhoto;
            List<Owner> list2;
            String str2;
            String str3;
            List<? extends ol60> list3 = list;
            glq0 glq0Var = (glq0) this.receiver;
            Image image = glq0Var.b;
            UserId userId = glq0Var.a;
            int a = y8g0.a(R.dimen.newsfeed_post_avatar_size);
            String str4 = "";
            boolean z2 = true;
            if (!(obj instanceof wsx0) || (header = ((wsx0) obj).getHeader()) == null || (sourcePhoto = header.b) == null || (list2 = sourcePhoto.b) == null) {
                z = false;
            } else {
                List<Owner> list4 = list2;
                if (list4 instanceof RandomAccess) {
                    List<Owner> list5 = list4;
                    int size = list5.size();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        Owner owner = list5.get(i);
                        if (epx.f(owner.b, userId)) {
                            owner.g = image;
                            ImageSize Cb = image.Cb(a, true, false);
                            if (Cb == null || (str3 = Cb.d.d) == null) {
                                str3 = "";
                            }
                            owner.e = str3;
                            z = true;
                        }
                    }
                } else {
                    z = false;
                    for (Owner owner2 : list4) {
                        if (epx.f(owner2.b, userId)) {
                            owner2.g = image;
                            ImageSize Cb2 = image.Cb(a, true, false);
                            if (Cb2 == null || (str2 = Cb2.d.d) == null) {
                                str2 = "";
                            }
                            owner2.e = str2;
                            z = true;
                        }
                    }
                }
            }
            if (obj instanceof l490) {
                Owner s = ((l490) obj).s();
                if (s != null) {
                    if (epx.f(s.b, userId)) {
                        s.g = image;
                        ImageSize Cb3 = image.Cb(a, true, false);
                        if (Cb3 != null && (str = Cb3.d.d) != null) {
                            str4 = str;
                        }
                        s.e = str4;
                        if (z2) {
                            return pn60.c(glq0Var.c, obj, null, null, 14);
                        }
                    }
                }
                return list3;
            }
            z2 = z;
            if (z2) {
            }
            return list3;
        }
    }

    public glq0(UserId userId, Image image, pn60 pn60Var) {
        this.a = userId;
        this.b = image;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        aVar.m(new a(1, this, glq0.class, "shouldInvalidate", "shouldInvalidate(Ljava/lang/Object;)Z", 0), new b(2, this, glq0.class, "replaceUiDtos", "replaceUiDtos(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", 0));
    }
}
