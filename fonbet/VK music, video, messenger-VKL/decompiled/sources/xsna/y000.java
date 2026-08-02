package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoImageDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.libvideo.api.quality.QualitySettingsInterval;
import com.vk.libvideo.api.quality.QualitySettingsType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.ky6;
import xsna.us2;

/* compiled from: LogWrapper.java */
/* loaded from: classes13.dex */
public final class y000 {
    public static y000 a;
    public static final mb2 b = new mb2(1000);
    public static final mb2 c;
    public static final mb2 d;
    public static QualitySettingsType e;
    public static Integer f;

    static {
        new mb2(1007);
        c = new mb2(1008);
        d = new mb2(1002);
    }

    public static Set a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) it.next();
            g5g.y(e43.l(cVar.a, cVar.f), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            String path = file != null ? file.getPath() : null;
            if (path != null) {
                arrayList2.add(path);
            }
        }
        return j5g.S0(arrayList2);
    }

    public static QualitySettingsInterval b() {
        QualitySettingsType d2 = d();
        return emi.q(d2) ? QualitySettingsInterval.AUTO : emi.s(d2) ? QualitySettingsInterval.HIGH : emi.r(d2) ? QualitySettingsInterval.ECONOM : QualitySettingsInterval.OTHER;
    }

    public static Integer c() {
        return f;
    }

    public static QualitySettingsType d() {
        QualitySettingsType qualitySettingsType = e;
        if (qualitySettingsType != null) {
            return qualitySettingsType;
        }
        r6m.a.getClass();
        return hr80.F(r6m.h(1) ? Preference.f("video_quality_settings").getInt("video_wifi_key", QualitySettingsType.WIFI_AUTO.i()) : Preference.f("video_quality_settings").getInt("video_mobile_key", QualitySettingsType.MOBILE_AUTO.i()));
    }

    public static QualitySettingsType e() {
        return hr80.F(Preference.f("video_quality_settings").getInt("video_mobile_key", QualitySettingsType.MOBILE_AUTO.i()));
    }

    public static QualitySettingsType f() {
        return hr80.F(Preference.f("video_quality_settings").getInt("video_wifi_key", QualitySettingsType.WIFI_AUTO.i()));
    }

    public static final boolean g(us2 us2Var) {
        int length = us2Var.c.length();
        List<us2.d<? extends us2.a>> list = us2Var.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                us2.d<? extends us2.a> dVar = list.get(i);
                if ((dVar.a instanceof q8z) && zs2.c(0, length, dVar.b, dVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Image h(List list) {
        List<ShortVideoShortVideoImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ShortVideoShortVideoImageDto shortVideoShortVideoImageDto : list2) {
            String url = shortVideoShortVideoImageDto.getUrl();
            int width = shortVideoShortVideoImageDto.getWidth();
            int height = shortVideoShortVideoImageDto.getHeight();
            Boolean d2 = shortVideoShortVideoImageDto.d();
            Boolean bool = Boolean.TRUE;
            char c2 = 0;
            arrayList.add(new ImageSize(url, width, height, Boolean.valueOf(epx.f(shortVideoShortVideoImageDto.e(), bool)), c2, epx.f(d2, bool), 16, null));
        }
        return new Image(arrayList);
    }

    public static void j(int i) {
        f = Integer.valueOf(i);
        e = QualitySettingsType.OTHER;
    }

    public static void k(QualitySettingsType qualitySettingsType) {
        f = null;
        e = qualitySettingsType;
    }

    public static void m(QualitySettingsType qualitySettingsType) {
        int i = qualitySettingsType.i();
        if (qualitySettingsType == QualitySettingsType.WIFI_AUTO || qualitySettingsType == QualitySettingsType.WIFI_HIGH || qualitySettingsType == QualitySettingsType.WIFI_ECONOM) {
            qaj0.c(Preference.f("video_quality_settings"), "video_wifi_key", Integer.valueOf(i));
        } else if (qualitySettingsType == QualitySettingsType.MOBILE_AUTO || qualitySettingsType == QualitySettingsType.MOBILE_HIGH || qualitySettingsType == QualitySettingsType.MOBILE_ECONOM) {
            qaj0.c(Preference.f("video_quality_settings"), "video_mobile_key", Integer.valueOf(i));
        }
        f = null;
        e = null;
    }

    public void i() {
        j5t.a();
        if (j5t.d == 0) {
            return;
        }
        j5t.d = 0;
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putInt("gallery_bucket", 0);
        aVar.a();
    }

    public void l(boolean z) {
        throw null;
    }

    public Intent n(Context context) {
        return new Intent(context, (Class<?>) PhotoVideoAttachActivity.class);
    }
}
