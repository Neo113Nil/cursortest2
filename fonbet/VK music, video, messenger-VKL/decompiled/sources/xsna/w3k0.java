package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.libvideo.videobottomsheet.api.a;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.k88;

/* compiled from: SmallVideoFormatter.kt */
/* loaded from: classes.dex */
public final class w3k0 {
    public static final Object h = msy.a(LazyThreadSafetyMode.NONE, new pb8(5));
    public static final String i = ".*/video/?.*/added";
    public final VideoBottomSheetComponent a;
    public final com.vk.video.kidsprofile.restricteduseractions.a b;
    public final boolean c = fxc0.B().J().F1();
    public final boolean d = fxc0.B().J().j0();
    public final boolean e = fxc0.B().J().B0();
    public final Boolean f = Boolean.TRUE;
    public final boolean g = true;

    /* compiled from: SmallVideoFormatter.kt */
    public static final class a {
    }

    public w3k0(VideoBottomSheetComponent videoBottomSheetComponent, com.vk.video.kidsprofile.restricteduseractions.a aVar) {
        this.a = videoBottomSheetComponent;
        this.b = aVar;
    }

    public static String b(Context context, VideoFile videoFile) {
        if (videoFile.L8() < 0) {
            return null;
        }
        long L8 = videoFile.L8();
        DecimalFormat decimalFormat = z8s.a;
        return z8s.e((int) L8, context).toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final String a(Context context, VideoFile videoFile, String str) {
        Owner s = videoFile.s();
        boolean f = qr.f(s != null ? s.getUid() : null);
        boolean f2 = new Regex(i).f(str);
        List list = (List) h.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).f(str)) {
                    break;
                }
            }
        }
        if (!f2 || !epx.f(this.f, Boolean.FALSE) || f) {
            return (this.e && videoFile.z0() && videoFile.Na() > 0) ? pvo0.i(false, (int) videoFile.Na(), false, false) : (!this.d || videoFile.k1() <= 0) ? pls0.b(context, videoFile).toString() : pls0.d(context, videoFile);
        }
        return String.valueOf(b(context, videoFile));
    }

    public final boolean c(VideoFile videoFile, String str, UserId userId) {
        a.c cVar = new a.c(0, null, userId, videoFile.x8(), drm0.D(str, "history", false), str);
        a.InterfaceC1255a Mc = this.a.Mc(Collections.singletonList(new k88.a(userId, new azt(26))));
        this.b.getClass();
        return fxc0.B().c(videoFile) && !fxc0.B().f0(Mc.a(new a.InterfaceC1255a.C1256a(videoFile, cVar, null), null, new q69(xg5.a())));
    }

    public final boolean d(VideoFile videoFile) {
        if (this.d && videoFile.k1() > 0) {
            return true;
        }
        if (fxc0.B().c(videoFile) && videoFile.L8() == 0) {
            return true;
        }
        return this.e && videoFile.v() && videoFile.q0() && videoFile.Na() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e(CatalogViewStyle catalogViewStyle, String str) {
        boolean z;
        boolean z2 = (catalogViewStyle instanceof VideoCatalogViewStyle) && ((VideoCatalogViewStyle) catalogViewStyle).Ab();
        List list = (List) h.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).f(str)) {
                    break;
                }
            }
        }
        if (!new Regex(i).f(str)) {
            z = false;
            boolean z3 = this.g;
            return !(z3 || z2) || (!z3 && z);
        }
        z = true;
        boolean z32 = this.g;
        if (z32) {
        }
    }
}
