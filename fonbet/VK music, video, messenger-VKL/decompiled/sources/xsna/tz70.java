package xsna;

import android.graphics.Bitmap;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.entities.stat.TextStatInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.hfr;
import xsna.j3p;

/* compiled from: OldEditorEventsTracker.kt */
/* loaded from: classes18.dex */
public final class tz70 {
    public final j3p a = new j3p();
    public tj8 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.vk.dto.stories.entities.stat.StickersStatInfo] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.vk.dto.stories.entities.stat.StickersStatInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tam0 tam0Var, StoryUploadParams storyUploadParams) {
        l1m0 b;
        String str;
        grt0 j;
        Long l;
        mat0 d;
        int c;
        int b2;
        Bitmap bitmap;
        zcl0 zcl0Var;
        yaa0 yaa0Var = tam0Var.a;
        zcl0 zcl0Var2 = tam0Var.h;
        tj8 tj8Var = this.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        ArrayList arrayList = b.k;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator<nov> it = zcl0Var2.a.iterator();
        while (true) {
            int i = 0;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            nov next = it.next();
            if (next instanceof xlo0) {
                xlo0 xlo0Var = (xlo0) next;
                String obj = xlo0Var.l.toString();
                imo0 imo0Var = xlo0Var.k;
                String str2 = imo0Var.m;
                zcl0Var = zcl0Var2;
                int i2 = (int) (imo0Var.c / iah0.f().density);
                String hexString = Integer.toHexString(imo0Var.g);
                String str3 = imo0Var.n;
                if (str3 == null) {
                    str3 = "none";
                }
                arrayList2.add(new TextStatInfo(obj, str2, i2, hexString, str3, imo0.a(imo0Var.b)));
            } else {
                zcl0Var = zcl0Var2;
                if (next instanceof c8m0) {
                    c8m0 c8m0Var = (c8m0) next;
                    arrayList3.add(new StickersStatInfo(c8m0Var.q ? "photo_repost" : "photo", 0L, 0, String.valueOf(c8m0Var.r.j())));
                } else if (next instanceof ad7) {
                    ad7 ad7Var = (ad7) next;
                    WebStickerType webStickerType = ad7Var.l;
                    String str4 = ad7Var.m;
                    if (webStickerType == WebStickerType.STICKER) {
                        List c0 = drm0.c0(str4, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                        int size = c0.size();
                        if (size == 1) {
                            str = new StickersStatInfo("individual", cqm0.l(str4), 0, null, 8, null);
                        } else if (size == 2) {
                            long l2 = cqm0.l((String) c0.get(1));
                            try {
                                i = Integer.parseInt((String) c0.get(0));
                            } catch (Throwable unused) {
                            }
                            str = new StickersStatInfo("from_pack", l2, i, null, 8, null);
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    } else if (webStickerType == WebStickerType.EMOJI) {
                        arrayList4.add(str4);
                    }
                } else if (next instanceof g4m0) {
                    arrayList3.add(new StickersStatInfo("gif", cqm0.l(((g4m0) next).i), 0, null, 8, null));
                } else if (next instanceof v800) {
                    StickersStatInfo a = xdm0.a(((v800) next).j);
                    if (a != null) {
                        arrayList3.add(a);
                    }
                } else if (next instanceof t690) {
                    StickersStatInfo a2 = xdm0.a(((t690) next).l);
                    if (a2 != null) {
                        arrayList3.add(a2);
                    }
                } else if (aal0.h(next)) {
                    List<ClickableSticker> a3 = aal0.a(next);
                    if (a3 != null) {
                        Iterator it2 = a3.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((ClickableSticker) it2.next()).zb());
                        }
                    }
                } else if (next instanceof lba0) {
                    lba0 lba0Var = (lba0) next;
                    arrayList3.add(new StickersStatInfo(lba0Var.getFromSharing() ? "photo_repost" : "photo", 0L, 0, String.valueOf(lba0Var.getInfo().c.a.h())));
                } else if (next instanceof yjm0) {
                    arrayList3.add(new StickersStatInfo("time", 0L, 0, String.valueOf(((yjm0) next).h.c.i())));
                }
            }
            zcl0Var2 = zcl0Var;
        }
        zcl0 zcl0Var3 = zcl0Var2;
        storyUploadParams.h = new StoryStatContainer(arrayList2, arrayList3, arrayList, arrayList4, arrayList5, tam0Var.d);
        if (tam0Var.g()) {
            mat0 d2 = tam0Var.d();
            if (d2 != null) {
                storyUploadParams.m = Integer.valueOf(d2.a());
            }
            storyUploadParams.i = SignalingProtocol.MEDIA_OPTION_VIDEO.toLowerCase(Locale.ROOT);
        } else if (tam0Var.g && (j = zcl0Var3.j()) != null) {
            wds0 videoData = j.getVideoData();
            if (videoData != null) {
                long j2 = videoData.d;
                l = Long.valueOf(j2 != 0 ? j2 - videoData.c : videoData.b);
            } else {
                l = null;
            }
            if (l != null) {
                storyUploadParams.m = Integer.valueOf((int) l.longValue());
            }
        }
        if (tam0Var.f()) {
            storyUploadParams.H = yaa0Var != null ? yaa0Var.c : false;
            String str5 = storyUploadParams.i;
            Locale locale = Locale.ROOT;
            if (!epx.f(str5, "COLLAGE".toLowerCase(locale))) {
                storyUploadParams.i = "PHOTO".toLowerCase(locale);
            }
        }
        if (tam0Var.r != null) {
            storyUploadParams.i = "VIDEO_MESSAGE".toLowerCase(Locale.ROOT);
        }
        if (tam0Var.f()) {
            if (yaa0Var != null && (bitmap = yaa0Var.b) != null) {
                c = bitmap.getWidth();
                b2 = bitmap.getHeight();
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append('_');
                sb.append(b2);
                str = sb.toString();
            }
            if (str == null) {
                storyUploadParams.I = str;
                return;
            }
            return;
        }
        if (tam0Var.g() && (d = tam0Var.d()) != null) {
            c = d.c();
            b2 = d.b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            sb2.append('_');
            sb2.append(b2);
            str = sb2.toString();
        }
        if (str == null) {
        }
    }

    public final void b(boolean z) {
        l1m0 b;
        tj8 tj8Var = this.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        hfr.a aVar = new hfr.a(rli0.j(b.a, new gky(12)));
        while (aVar.hasNext()) {
            this.a.a("emoji", z);
        }
        s3q0 s3q0Var = s3q0.a;
        if (z) {
            return;
        }
        c(StoryPublishEvent.ADD_STICKER);
    }

    public final void c(StoryPublishEvent storyPublishEvent) {
        l1m0 b;
        tj8 tj8Var = this.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        tam0 tam0Var = b.h;
        StoryUploadParams storyUploadParams = b.i;
        CommonUploadParams commonUploadParams = b.j;
        a(tam0Var, storyUploadParams);
        nf9.b(nf9.b, storyPublishEvent, null, storyUploadParams, commonUploadParams, false, new w7u(tam0Var, 21), 64).e();
    }

    public final void d(boolean z) {
        l1m0 b;
        tj8 tj8Var = this.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        List A = rli0.A(rli0.t(b.a, new fo20(8)));
        if (!A.isEmpty()) {
            LinkedHashMap linkedHashMap = this.a.b;
            Object obj = linkedHashMap.get("sticker");
            if (obj == null) {
                obj = new j3p.b();
                linkedHashMap.put("sticker", obj);
            }
            j3p.b bVar = (j3p.b) obj;
            ArrayList<String> arrayList = bVar.c;
            arrayList.clear();
            arrayList.addAll(A);
            bVar.b = z;
        }
        if (z) {
            return;
        }
        c(StoryPublishEvent.ADD_STICKER);
    }

    public final void e(boolean z) {
        l1m0 b;
        tj8 tj8Var = this.b;
        if (tj8Var == null || (b = tj8Var.b()) == null) {
            return;
        }
        hfr.a aVar = new hfr.a(rli0.j(b.a, new bqt(14)));
        while (aVar.hasNext()) {
            this.a.a("text", z);
        }
        s3q0 s3q0Var = s3q0.a;
        if (z) {
            return;
        }
        c(StoryPublishEvent.ADD_TEXT);
    }
}
