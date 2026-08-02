package xsna;

import android.graphics.LinearGradient;
import com.google.android.gms.internal.measurement.zzox;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.t2g0;
import xsna.w1g0;

/* compiled from: FilterButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class jcr implements kbf0, q701 {
    public static final jai b;
    public static final jcr c;
    public static final /* synthetic */ jcr d;

    static {
        new jai(-1336546615, new rce(1), false);
        new jai(882740027, new hci(0), false);
        b = new jai(-154319010, new ici(0), false);
        c = new jcr();
        d = new jcr();
    }

    public static final LinearGradient a(long j, long j2, List list, List list2, int i) {
        oc2.b(list, list2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = f870.H(((l5g) list.get(i2)).a);
        }
        return new LinearGradient(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, iArr, oc2.a(list2, list), kd2.a(i));
    }

    public static final UserProfile b(UserId userId, HashMap hashMap, HashMap hashMap2) {
        Group group;
        if (userId.b > 0) {
            if (hashMap != null) {
                return (UserProfile) hashMap.get(userId);
            }
            return null;
        }
        if (hashMap2 == null || (group = (Group) hashMap2.get(fkq0.e(userId))) == null) {
            return null;
        }
        return new UserProfile(group);
    }

    public static q630 c(q630 q630Var, float f) {
        float f2 = 0;
        if (pco.a(f, f2) > 0) {
            pco.a(f, f2);
        }
        return rdu.a(q630Var, new tg7(f, f, 0, true));
    }

    public static String d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((vgp0) it.next()).a.g.n;
            if (io20.p(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (io20.l(str2)) {
                z = true;
            } else if (io20.n(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static final zhf0 e(zhf0 zhf0Var, long j, float f) {
        int i = (int) (j >> 32);
        float intBitsToFloat = (((Float.intBitsToFloat(i) / 2.0f) + zhf0Var.a) * f) - (Float.intBitsToFloat(i) / 2.0f);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = (Float.intBitsToFloat(i2) / 2.0f) + ((zhf0Var.c - (Float.intBitsToFloat(i2) / 2.0f)) * f);
        return new zhf0(intBitsToFloat, (((Float.intBitsToFloat(i) / 2.0f) + zhf0Var.b) * f) - (Float.intBitsToFloat(i) / 2.0f), intBitsToFloat2, (Float.intBitsToFloat(i2) / 2.0f) + ((zhf0Var.d - (Float.intBitsToFloat(i2) / 2.0f)) * f));
    }

    public static final qes f(zhf0 zhf0Var, double d2, float f, float f2) {
        double d3 = zhf0Var.c - zhf0Var.a;
        double d4 = zhf0Var.d - zhf0Var.b;
        double d5 = f2;
        double d6 = d3 - d5;
        double d7 = d6 / d2;
        double d8 = d3 / d2;
        if (d8 > d4) {
            d3 = d4 * d2;
            d6 = d3 - d5;
            d7 = d6 / d2;
        } else {
            d4 = d8;
        }
        double d9 = f;
        return new qes(d4 / d9, d3 / d9, d7 / d9, d6 / d9);
    }

    public static final float g(ImageLink imageLink, ImageCropArea imageCropArea) {
        if (imageCropArea == null) {
            return 1.0f;
        }
        float width = imageLink.getWidth();
        float f = imageCropArea.f;
        float height = imageLink.getHeight();
        float f2 = imageCropArea.g;
        return width / height < f / f2 ? i(width, f) : i(height, f2);
    }

    public static w1g0 h(t2g0 t2g0Var) {
        if (t2g0Var instanceof s2g0) {
            return new iwh();
        }
        if (t2g0Var.equals(t2g0.e.a)) {
            return w1g0.l.b;
        }
        if (t2g0Var.equals(t2g0.b.a)) {
            return w1g0.d.b;
        }
        if (t2g0Var.equals(t2g0.f.a)) {
            return w1g0.m.b;
        }
        if (t2g0Var instanceof z2g0) {
            return w1g0.o.b.b;
        }
        if (t2g0Var instanceof t2g0.d) {
            return new w1g0.k(((t2g0.d) t2g0Var).a);
        }
        if (t2g0Var instanceof x2g0) {
            return w1g0.o.a.b;
        }
        if (t2g0Var instanceof y2g0) {
            return new w1g0.o.c(((y2g0) t2g0Var).a);
        }
        if (t2g0Var instanceof t2g0.c) {
            t2g0.c cVar = (t2g0.c) t2g0Var;
            Integer num = cVar.b;
            return new w1g0.e(cVar.c, cVar.a, num);
        }
        if (t2g0Var instanceof w2g0) {
            return new w1g0.n.c(((w2g0) t2g0Var).a);
        }
        if (t2g0Var instanceof v2g0) {
            return new w1g0.n.b(((v2g0) t2g0Var).a);
        }
        if (t2g0Var instanceof u2g0) {
            return new w1g0.n.a(((u2g0) t2g0Var).a);
        }
        return null;
    }

    public static final float i(float f, float f2) {
        float f3 = f / f2;
        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
            return 1.0f;
        }
        return f3;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzox.zzf());
    }
}
