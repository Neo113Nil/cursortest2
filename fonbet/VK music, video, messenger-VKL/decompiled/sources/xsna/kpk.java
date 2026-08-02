package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.masks.Mask;
import com.vk.dto.photo.Photo;
import com.vk.upload.impl.UploadNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* compiled from: CustomVirtualBackgroundStorage.kt */
/* loaded from: classes7.dex */
public final class kpk {
    public final Context a;
    public final UserId b;
    public final fpk c = new fpk(qw70.f);
    public final ReentrantLock d = new ReentrantLock();
    public ArrayList e = new ArrayList();
    public final io.reactivex.rxjava3.subjects.d<List<Mask>> f = io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);

    /* compiled from: CustomVirtualBackgroundStorage.kt */
    public static abstract class a {

        /* compiled from: CustomVirtualBackgroundStorage.kt */
        /* renamed from: xsna.kpk$a$a, reason: collision with other inner class name */
        public static final class C3195a extends a {
            public final Throwable a;

            public C3195a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: CustomVirtualBackgroundStorage.kt */
        public static final class b extends a {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: CustomVirtualBackgroundStorage.kt */
        public static final class c extends a {
            public final Mask a;

            public c(Mask mask) {
                this.a = mask;
            }
        }
    }

    /* compiled from: CustomVirtualBackgroundStorage.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kpk(Context context, UserId userId) {
        this.a = context;
        this.b = userId;
    }

    public final ArrayList a(List list) {
        Iterator it;
        Integer num;
        Integer num2;
        char c;
        Mask mask;
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Photo) it2.next()).c));
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Photo photo = (Photo) it3.next();
            int i = photo.c;
            fpk fpkVar = this.c;
            SharedPreferences sharedPreferences = fpkVar.b;
            if (sharedPreferences.contains(fpk.b(i))) {
                num2 = Integer.valueOf(sharedPreferences.getInt(fpk.b(i), 0));
                it = it3;
            } else {
                Set S0 = j5g.S0(arrayList2);
                k9x k9xVar = fpkVar.a;
                int i2 = k9xVar.b;
                int i3 = k9xVar.c;
                int i4 = sharedPreferences.getInt("last_appointed_id", i2) + 1;
                int i5 = (i3 - i2) + 1;
                int i6 = 0;
                while (i6 < i5) {
                    if (i4 > i3) {
                        i4 = i2;
                    }
                    boolean contains = sharedPreferences.contains(fpk.a(i4));
                    it = it3;
                    boolean contains2 = S0.contains(Integer.valueOf(sharedPreferences.getInt(fpk.a(i4), 0)));
                    if (!contains || !contains2) {
                        num = Integer.valueOf(i4);
                        break;
                    }
                    i4++;
                    i6++;
                    it3 = it;
                }
                it = it3;
                num = null;
                if (num != null) {
                    int intValue = num.intValue();
                    sharedPreferences.edit().putInt("last_appointed_id", intValue).putInt(fpk.b(i), intValue).putInt(fpk.a(intValue), i).apply();
                    num2 = num;
                } else {
                    num2 = null;
                }
            }
            if (num2 == null) {
                break;
            }
            int intValue2 = num2.intValue();
            String str = photo.t;
            if (str == null) {
                c = '\n';
                mask = null;
            } else {
                ArrayList arrayList3 = photo.y.b;
                c = '\n';
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Image image = ((ImageSize) it4.next()).d;
                    arrayList4.add(new NotificationImage.ImageInfo(image.b, image.c, image.d));
                }
                mask = new Mask(null, null, intValue2, this.b, false, null, 0, 0L, 0L, str, new NotificationImage(arrayList4), false, 0, 0, null, null, null, true, false, true, true, false, null, 0L, 8388608, null);
            }
            if (mask != null) {
                arrayList.add(mask);
            }
            it3 = it;
        }
        return arrayList;
    }
}
