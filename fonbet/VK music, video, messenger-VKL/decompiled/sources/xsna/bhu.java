package xsna;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;

/* compiled from: GroupButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class bhu implements q701, gn60 {
    public static final jai b = new jai(-708985825, new adi(0), false);
    public static final jai c = new jai(-1898355446, new bdi(0), false);
    public static final /* synthetic */ bhu d = new bhu();

    public static int a(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    public static final bsp b(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        yrp yrpVar = new yrp(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) rl3.S(i2, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            yrpVar.j(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) rl3.S(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = yrpVar.d;
                    List<Annotation>[] listArr = yrpVar.f;
                    List<Annotation> list = listArr[i4];
                    if (list == null) {
                        list = new ArrayList<>(1);
                        listArr[yrpVar.d] = list;
                    }
                    list.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        bsp bspVar = new bsp(enumArr, str);
        bspVar.b = yrpVar;
        return bspVar;
    }

    public static final CharSequence c(int i, CharSequence charSequence) {
        if (i == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString(uqm0.f(i));
        dhr0.a.getClass();
        spannableString.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_secondary, dhr0.s())), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static final ArrayList d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CarouselItem carouselItem = (CarouselItem) it.next();
            carouselItem.getClass();
            arrayList.add(new CarouselItem(carouselItem));
        }
        return arrayList;
    }

    public static final boolean e(StickerPackPreview stickerPackPreview) {
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        return (stickerPackPrice != null ? stickerPackPrice.d : null) != null && stickerPackPrice.d.intValue() > 0;
    }

    public static final boolean f(StickerPackPreview stickerPackPreview) {
        Integer num;
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        return (stickerPackPrice == null || (num = stickerPackPrice.c) == null || num.intValue() != 0) ? false : true;
    }

    public static final boolean g(StickerPackPreview stickerPackPreview) {
        return (stickerPackPreview.m || stickerPackPreview.b == 10101) ? false : true;
    }

    public static void h(final long j, final String str, w2w w2wVar) {
        w2wVar.I0().u(new izs() { // from class: xsna.sfm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                hpm e = ((xgl0) obj).b().e();
                long j2 = j;
                com.vk.im.engine.models.dialogs.b c2 = e.c(j2);
                InfoBar infoBar = c2 != null ? c2.w : null;
                if (epx.f(infoBar != null ? infoBar.b : null, str)) {
                    e.p(j2, false);
                }
                return s3q0.a;
            }
        });
    }

    public static void i(long j, String str, w2w w2wVar) {
        w2wVar.I0().u(new sta(j, str, 2));
    }

    public static final ZonedDateTime j(long j) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), TimeZone.getDefault().toZoneId());
    }

    public static ufx l(String str, String str2, String str3) {
        ufx ufxVar = new ufx("utils.checkUserName", new qmk0(3), new wcl0(2));
        if (str != null) {
            ufx.n(ufxVar, "first_name", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "last_name", str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "full_name", str3, 0, 12);
        }
        return ufxVar;
    }

    public List k(int i, Pair pair, wm60 wm60Var) {
        Object obj;
        boolean z;
        List list = (List) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioAttachment) it.next()).f);
        }
        int size = arrayList.size();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!((MusicTrack) obj).B()) {
                break;
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        if (musicTrack == null) {
            musicTrack = (MusicTrack) j5g.Y(arrayList);
        }
        MusicTrack musicTrack2 = musicTrack;
        w780 r = d02.r(size, musicTrack2);
        String str = r.a;
        String str2 = r.b;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (!((MusicTrack) it3.next()).B()) {
                    if (!arrayList.isEmpty()) {
                        z = false;
                    }
                }
            }
        }
        z = true;
        boolean z2 = z;
        Thumb Jb = musicTrack2.Jb();
        if (str == null) {
            str = "";
        }
        return Collections.singletonList(new k880(arrayList, musicTrack2, size, str, str2 == null ? "" : str2, Jb, z2, booleanValue, false, ((AudioAttachment) j5g.Y(list)).h, ((AudioAttachment) j5g.Y(list)).i));
    }

    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return k(0, pair, bp5Var);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzC());
    }
}
