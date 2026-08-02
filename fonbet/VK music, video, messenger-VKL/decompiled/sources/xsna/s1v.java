package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.voip.OKVoipEngine;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.serialization.KSerializer;

/* compiled from: HeifSniffer.java */
/* loaded from: classes12.dex */
public class s1v implements jp70 {
    public static final StackTraceElement[] b = new StackTraceElement[0];
    public static oti c;

    public static kq2 a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return new kq2(rte0.e, Float.valueOf(f), new sq2(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static kq2 c(kq2 kq2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((zak0) kq2Var.c).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((sq2) kq2Var.d).a;
        }
        return new kq2(kq2Var.b, Float.valueOf(f), new sq2(f2), kq2Var.e, kq2Var.f, kq2Var.g);
    }

    public static w6y0 d(w6y0 w6y0Var, boolean z, boolean z2, float f, int i) {
        if ((i & 1) != 0) {
            z = w6y0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = w6y0Var.b;
        }
        if ((i & 4) != 0) {
            f = w6y0Var.c;
        }
        return (z == w6y0Var.a && z2 == w6y0Var.b && f == w6y0Var.c) ? w6y0Var : new w6y0(f, z, z2);
    }

    public static String f(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockLink) {
            return ((UIBlockLink) uIBlock).y.e;
        }
        return null;
    }

    public static void g(int i, int i2, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i3 = i2 + 1;
        int i4 = i3 + i2;
        int[] iArr2 = new int[i4 * 256];
        int i5 = 1;
        for (int i6 = 1; i6 < 256; i6++) {
            for (int i7 = 0; i7 < i4; i7++) {
                iArr2[i3] = i6;
                i3++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i8 = 0;
        while (i8 < i) {
            int i9 = 0;
            while (i9 < height) {
                int i10 = width * i9;
                i9++;
                int i11 = (i9 * width) - i5;
                int i12 = i4 >> 1;
                int i13 = width + i12;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = -i12; i18 < i13; i18++) {
                    int i19 = i10 + i18;
                    if (i19 < i10) {
                        i19 = i10;
                    } else if (i19 > i11) {
                        i19 = i11;
                    }
                    int i20 = iArr[i19];
                    i14 += (i20 >> 16) & 255;
                    i15 += (i20 >> 8) & 255;
                    i16 += i20 & 255;
                    i17 += i20 >>> 24;
                    if (i18 >= i12) {
                        iArr3[i18 - i12] = (iArr2[i17] << 24) | (iArr2[i14] << 16) | (iArr2[i15] << 8) | iArr2[i16];
                        int i21 = (i18 - (i4 - 1)) + i10;
                        if (i21 < i10) {
                            i21 = i10;
                        } else if (i21 > i11) {
                            i21 = i11;
                        }
                        int i22 = iArr[i21];
                        i14 -= (i22 >> 16) & 255;
                        i15 -= (i22 >> 8) & 255;
                        i16 -= i22 & 255;
                        i17 -= i22 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i10, width);
                i5 = 1;
            }
            int i23 = 0;
            int i24 = 0;
            while (i24 < width) {
                int b2 = ir.b(height, 1, width, i24);
                int i25 = (i4 >> 1) * width;
                int i26 = (i4 - 1) * width;
                int i27 = i24 - i25;
                int i28 = i23;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                while (i27 <= b2 + i25) {
                    int i33 = iArr[i27 < i24 ? i24 : i27 > b2 ? b2 : i27];
                    i28 += (i33 >> 16) & 255;
                    i29 += (i33 >> 8) & 255;
                    i30 += i33 & 255;
                    i31 += i33 >>> 24;
                    if (i27 - i25 >= i24) {
                        iArr3[i32] = (iArr2[i31] << 24) | (iArr2[i28] << 16) | (iArr2[i29] << 8) | iArr2[i30];
                        i32++;
                        int i34 = i27 - i26;
                        if (i34 < i24) {
                            i34 = i24;
                        } else if (i34 > b2) {
                            i34 = b2;
                        }
                        int i35 = iArr[i34];
                        i28 -= (i35 >> 16) & 255;
                        i29 -= (i35 >> 8) & 255;
                        i30 -= i35 & 255;
                        i31 -= i35 >>> 24;
                    }
                    i27 += width;
                }
                int i36 = i24;
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[i36] = iArr3[i37];
                    i36 += width;
                }
                i24++;
                i23 = 0;
            }
            i8++;
            i5 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static xdw0 j() {
        OKVoipEngine.b.getClass();
        xdw0 a = OKVoipEngine.x().a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Unable to observe anonym queue, anonymInfo is null");
    }

    public static final void k() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1313663451, 0, -1, "com.vk.core.compose.component.defaults.<get-VkInputSelectDefaults> (InputSelectDefaults.kt:64)");
        }
        on20 on20Var = on20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static void l(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ol60) obj) instanceof z1c0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        z1c0 z1c0Var = obj instanceof z1c0 ? (z1c0) obj : null;
        NewsEntry newsEntry = z1c0Var != null ? z1c0Var.h.b : null;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            z1c0 z1c0Var2 = obj2 instanceof z1c0 ? (z1c0) obj2 : null;
            if (z1c0Var2 != null) {
                u1c0 u1c0Var = z1c0Var2.h;
                if (!epx.f(u1c0Var.b, newsEntry)) {
                    newsEntry = u1c0Var.b;
                    i++;
                }
                u1c0Var.h(i);
                if (u1c0Var instanceof lsi) {
                    ((lsi) u1c0Var).s.h(i);
                } else if (u1c0Var instanceof a160) {
                    Iterator<T> it2 = ((a160) u1c0Var).q.iterator();
                    while (it2.hasNext()) {
                        ((u1c0) it2.next()).h(i);
                    }
                }
            }
        }
    }

    public static final boolean m(MusicDto musicDto, MusicTrack musicTrack) {
        return epx.f(musicDto != null ? musicDto.b : null, musicTrack != null ? musicTrack.Ib() : null);
    }

    public static final KSerializer n(dcy dcyVar, ArrayList arrayList, gzs gzsVar) {
        KSerializer yk3Var;
        KSerializer epf0Var;
        if (epx.f(dcyVar, fpf0.a(Collection.class)) || epx.f(dcyVar, fpf0.a(List.class)) || epx.f(dcyVar, fpf0.a(List.class)) || epx.f(dcyVar, fpf0.a(ArrayList.class))) {
            yk3Var = new yk3((KSerializer) arrayList.get(0));
        } else if (epx.f(dcyVar, fpf0.a(HashSet.class))) {
            yk3Var = new zuu((KSerializer) arrayList.get(0));
        } else if (epx.f(dcyVar, fpf0.a(Set.class)) || epx.f(dcyVar, fpf0.a(Set.class)) || epx.f(dcyVar, fpf0.a(LinkedHashSet.class))) {
            yk3Var = new ldz((KSerializer) arrayList.get(0));
        } else if (epx.f(dcyVar, fpf0.a(HashMap.class))) {
            yk3Var = new xuu((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else if (epx.f(dcyVar, fpf0.a(Map.class)) || epx.f(dcyVar, fpf0.a(Map.class)) || epx.f(dcyVar, fpf0.a(LinkedHashMap.class))) {
            yk3Var = new jdz((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else {
            if (epx.f(dcyVar, fpf0.a(Map.Entry.class))) {
                epf0Var = new el00((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else if (epx.f(dcyVar, fpf0.a(Pair.class))) {
                epf0Var = new rg90((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else if (epx.f(dcyVar, fpf0.a(Triple.class))) {
                yk3Var = new zrp0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
            } else if (((pfc) dcyVar).a().isArray()) {
                epf0Var = new epf0((dcy) gzsVar.invoke(), (KSerializer) arrayList.get(0));
            } else {
                yk3Var = null;
            }
            yk3Var = epf0Var;
        }
        if (yk3Var != null) {
            return yk3Var;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return rta0.a(dcyVar, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final Matrix o(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    public static final KSerializer p(de deVar, vcy vcyVar) {
        KSerializer<Object> a = gni0.a(deVar, vcyVar, true);
        if (a != null) {
            return a;
        }
        fvr.w(fvr.q(vcyVar));
        throw null;
    }

    public static final KSerializer q(dcy dcyVar) {
        KSerializer a = rta0.a(dcyVar, new KSerializer[0]);
        return a == null ? (KSerializer) pbd0.a.get(dcyVar) : a;
    }

    public static final ArrayList r(de deVar, List list, boolean z) {
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(p(deVar, (vcy) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> a = gni0.a(deVar, (vcy) it2.next(), false);
            if (a == null) {
                return null;
            }
            arrayList2.add(a);
        }
        return arrayList2;
    }

    public static long s(String str) {
        int i;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(efz.a(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder b2 = ji.b(length, "endIndex > string.length: ", " > ");
            b2.append(str.length());
            throw new IllegalArgumentException(b2.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char charAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j += i;
            }
            i2++;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(tel telVar, boolean z) throws IOException {
        int i;
        xi90 xi90Var = new xi90(16);
        boolean z2 = true;
        while (true) {
            xi90Var.M(8);
            if (!telVar.peekFully(xi90Var.a, 0, 8, true)) {
                break;
            }
            long E = xi90Var.E();
            int p = xi90Var.p();
            if (E != 1) {
                i = 8;
            } else {
                if (!telVar.peekFully(xi90Var.a, 8, 8, true)) {
                    break;
                }
                E = xi90Var.I();
                i = 16;
            }
            long j = i;
            if (E < j) {
                break;
            }
            int i2 = (int) (E - j);
            if (z2) {
                if (p != 1718909296 || i2 < 8) {
                    break;
                }
                xi90Var.M(4);
                telVar.peekFully(xi90Var.a, 0, 4, false);
                if (xi90Var.p() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                telVar.b(i2 - 4, false);
                z2 = false;
            } else {
                if (p == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    telVar.b(i2, false);
                }
            }
        }
        return false;
    }

    public boolean b(long j) {
        return bwt0.c(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String e(UIBlock uIBlock) {
        return uIBlock instanceof dfp0 ? ((dfp0) uIBlock).r() : uIBlock.f;
    }

    @Override // xsna.jp70
    public Object h() {
        return new ArrayDeque();
    }

    public io.reactivex.rxjava3.core.x i(UserId userId, String str) {
        return rsg0.w0(new a0u(userId, str, "postponed", "photo_base,sex,first_name_dat,last_name_dat,video_files,first_name_gen,last_name_gen,can_write_private_message,can_message,can_post_donut,is_nft,trust_mark", false));
    }
}
