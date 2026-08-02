package xsna;

import android.content.Context;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.sst0;

/* compiled from: CommunityProfileVideoItemMapper.kt */
/* loaded from: classes5.dex */
public final class tuh {
    public final a2o a;
    public final bpn0 b = new bpn0(new f4(10));

    public tuh(a2o a2oVar) {
        this.a = a2oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sst0.b a(List list, VideoFile videoFile) {
        sst0.b.c cVar;
        Integer j2;
        sst0.b.C3688b c3688b;
        Context context;
        Object obj;
        sst0.b.a aVar;
        VideoRestriction O = videoFile.O();
        if (O != null) {
            RestrictionButton restrictionButton = O.e;
            if (epx.f(restrictionButton != null ? restrictionButton.b : null, RestrictionButton.Action.DONAT.h())) {
                String str = O.c;
                VideoRestriction O2 = videoFile.O();
                Image image = (O2 == null || !O2.d) ? null : videoFile.getImage();
                if (restrictionButton == null) {
                    aVar = null;
                } else {
                    String str2 = restrictionButton.c;
                    aVar = new sst0.b.a(str2, ((Boolean) this.b.getValue()).booleanValue() ? this.a.parse(str2) : null, restrictionButton.d);
                }
                cVar = new sst0.b.c(str, image, aVar);
                j2 = videoFile.j2();
                if (j2 != null) {
                    int intValue = j2.intValue();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((DonutLevelDto) obj).getId() == intValue) {
                            break;
                        }
                    }
                    DonutLevelDto donutLevelDto = (DonutLevelDto) obj;
                    if (donutLevelDto != null) {
                        c3688b = new sst0.b.C3688b(donutLevelDto.getTitle(), donutLevelDto.f());
                        context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        return new sst0.b(videoFile, cVar, c3688b, c3688b != null ? new sst0.b.d(context.getString(R.string.donut_video_icon_hint_accessibility)) : null, 16);
                    }
                }
                c3688b = null;
                context = e43.a;
                if (context == null) {
                }
                return new sst0.b(videoFile, cVar, c3688b, c3688b != null ? new sst0.b.d(context.getString(R.string.donut_video_icon_hint_accessibility)) : null, 16);
            }
        }
        cVar = null;
        j2 = videoFile.j2();
        if (j2 != null) {
        }
        c3688b = null;
        context = e43.a;
        if (context == null) {
        }
        return new sst0.b(videoFile, cVar, c3688b, c3688b != null ? new sst0.b.d(context.getString(R.string.donut_video_icon_hint_accessibility)) : null, 16);
    }
}
