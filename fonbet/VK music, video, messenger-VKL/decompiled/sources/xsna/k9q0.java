package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.location.Location;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.ByteString;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.auth.dto.AuthValidateAccountSupportedWaysDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsSubRecomThemeDto;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.superapp.api.dto.auth.AuthSupportedWay;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: Composer.kt */
@vby
/* loaded from: classes11.dex */
public final class k9q0 implements yho, gn60, id60, i2n0 {
    public static final jai b = new jai(-2093604808, new vbi(1), false);
    public static final k9q0 c = new k9q0();

    public k9q0(int i) {
        switch (i) {
            case 19:
                break;
            default:
                new ArrayList();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static final rc7 d(Bitmap bitmap) {
        return new rc7(new aa2(bitmap));
    }

    public static final Object f(w2w w2wVar, Object obj, xl6 xl6Var) throws Exception {
        if (xl6Var.a() != null) {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (!epx.f(threadGroup != null ? threadGroup.getName() : null, sv1.n(xl6Var))) {
                return w2wVar.J0(obj, xl6Var).await();
            }
        }
        return w2wVar.b1(obj, xl6Var);
    }

    public static mm50 g(gzs gzsVar, wb0 wb0Var) {
        return sm50.a(new rn8(new rcw(1, gzsVar)), wb0Var, new un8(), hug0.b, 16);
    }

    public static final MutableBoundingBox h(MutableBoundingBox mutableBoundingBox, BoundingBox boundingBox, float f, float f2) {
        if (mutableBoundingBox == null) {
            return h(new MutableBoundingBox(boundingBox), boundingBox, f, f2);
        }
        long j = boundingBox.d;
        if (!Coordinate.g(j)) {
            throw new IllegalStateException("use valid center for enlarge logic!");
        }
        float f3 = 2;
        float a0 = (f2 * f3) + boundingBox.a0();
        float F = (f * f3) + boundingBox.F();
        float f4 = a0 / 2.0f;
        float f5 = Coordinate.f(l370.s(j, f4, du9.d));
        float f6 = F / 2.0f;
        float e = Coordinate.e(l370.s(j, f6, du9.a));
        float f7 = Coordinate.f(l370.s(j, f4, du9.b));
        float e2 = Coordinate.e(l370.s(j, f6, du9.c));
        mutableBoundingBox.g = gqr.a(e, f5);
        mutableBoundingBox.h = gqr.a(e2, f7);
        return mutableBoundingBox;
    }

    public static String i(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    @Nullable
    public static View j(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final VideoAttachment l(Post post) {
        Object obj;
        Iterator<T> it = post.z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EntryAttachment) obj).b instanceof VideoAttachment) {
                break;
            }
        }
        EntryAttachment entryAttachment = (EntryAttachment) obj;
        Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        if (videoAttachment == null || !videoAttachment.C2()) {
            videoAttachment = null;
        }
        if (videoAttachment != null) {
            return videoAttachment;
        }
        Post post2 = post.D;
        if (post2 != null) {
            return l(post2);
        }
        return null;
    }

    @NonNull
    @SuppressLint({"BanUncheckedReflection"})
    public static Set m() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final CnvMsgId n(Msg msg) {
        return new CnvMsgId(msg.c, msg.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserId o(NewsEntry newsEntry) {
        Owner s;
        UserId userId;
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        return (l490Var == null || (s = l490Var.s()) == null || (userId = s.b) == null) ? UserId.d : userId;
    }

    public static final boolean p(w2w w2wVar) {
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        return Q0.Ab(Peer.Type.GROUP);
    }

    public static final boolean q(Size size) {
        return size != null && size.getWidth() > 0 && size.getHeight() > 0;
    }

    public static final ArrayList r(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((List) it.next()).iterator());
        }
        ArrayList arrayList2 = new ArrayList();
        loop1: while (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Iterator) it2.next()).hasNext()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = (Iterator) it3.next();
                        if (it4.hasNext()) {
                            arrayList2.add(it4.next());
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public static final String s(RecomSettingsSubRecomThemeDto recomSettingsSubRecomThemeDto) {
        return j5g.g0(recomSettingsSubRecomThemeDto.e(), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62);
    }

    public static final void t(androidx.compose.runtime.a aVar, izs izsVar) {
        aVar.b(s3q0.a, new qe1(izsVar));
    }

    public static final List u(List list) {
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        if (list.size() == 1) {
            return list;
        }
        list.toString();
        List O0 = j5g.O0(new LinkedHashSet(list));
        List list2 = O0;
        ArrayList arrayList = new ArrayList(list2);
        int size = list2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int size2 = O0.size();
            for (int i3 = i2; i3 < size2; i3++) {
                ClipsVideoItemLocation clipsVideoItemLocation = (ClipsVideoItemLocation) O0.get(i);
                ClipsVideoItemLocation clipsVideoItemLocation2 = (ClipsVideoItemLocation) O0.get(i3);
                Location location = new Location("VIDEO_META");
                location.setLongitude(clipsVideoItemLocation.c);
                location.setLatitude(clipsVideoItemLocation.b);
                Location location2 = new Location("VIDEO_META");
                location2.setLongitude(clipsVideoItemLocation2.c);
                location2.setLatitude(clipsVideoItemLocation2.b);
                float distanceTo = location.distanceTo(location2);
                clipsVideoItemLocation.toString();
                clipsVideoItemLocation2.toString();
                if (distanceTo < 100) {
                    arrayList.remove(clipsVideoItemLocation2);
                }
            }
            i = i2;
        }
        arrayList.toString();
        return j5g.O0(arrayList);
    }

    public static final ArrayList v(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<GeoLocation> list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (GeoLocation geoLocation : list2) {
                if (!linkedHashSet.contains(Integer.valueOf(geoLocation.b))) {
                    linkedHashSet.add(Integer.valueOf(geoLocation.b));
                    arrayList2.add(geoLocation);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public static final void w(androidx.compose.runtime.a aVar, Object obj, wzs wzsVar) {
        if (aVar.L() || !epx.f(aVar.x(), obj)) {
            aVar.R(obj);
            aVar.b(obj, wzsVar);
        }
    }

    public static final Pair y(int i, int i2, boolean z) {
        return z ? new Pair(Integer.valueOf(i2), Integer.valueOf(i)) : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final AuthValidateAccountSupportedWaysDto z(AuthSupportedWay authSupportedWay) {
        for (AuthValidateAccountSupportedWaysDto authValidateAccountSupportedWaysDto : AuthValidateAccountSupportedWaysDto.values()) {
            if (epx.f(authSupportedWay.h(), authValidateAccountSupportedWaysDto.i())) {
                return authValidateAccountSupportedWaysDto;
            }
        }
        return null;
    }

    public List A(Post post) {
        SourcePhoto sourcePhoto;
        List<Owner> list;
        ArrayList arrayList;
        HeaderTitle headerTitle;
        List<Text> list2;
        EntryHeader entryHeader = post.y;
        if (entryHeader == null || (sourcePhoto = entryHeader.b) == null || (list = sourcePhoto.b) == null) {
            throw new IllegalArgumentException("This NewsEntry doesn't have photo sources");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("There must be at least two co-owners");
        }
        EntryHeader entryHeader2 = post.y;
        if (entryHeader2 == null || (headerTitle = entryHeader2.c) == null || (list2 = headerTitle.c) == null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = ((Owner) it.next()).c;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = ((Text) it2.next()).b;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        String str3 = (String) arrayList.get(0);
        String str4 = arrayList.size() == 2 ? (String) arrayList.get(1) : null;
        int size = arrayList.size() - 1;
        Owner owner = list.get(0);
        Owner owner2 = list.get(1);
        EntryHeader entryHeader3 = post.y;
        return Collections.singletonList(new n1c0(str3, str4, owner, owner2, size, entryHeader3 != null ? entryHeader3.h : null));
    }

    @Override // xsna.i2n0
    public boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return A((Post) pair);
    }

    @Override // xsna.i2n0
    public void e(boolean z) {
    }

    @Override // xsna.i2n0
    public void onError(Throwable th) {
    }

    @Override // xsna.id60
    public void a(UserId userId, boolean z) {
    }
}
