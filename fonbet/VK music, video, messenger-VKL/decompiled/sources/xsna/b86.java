package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.pox0;
import xsna.xgs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b86 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                u440 u440Var = (u440) this.c;
                String str = (String) obj;
                String str2 = (String) obj2;
                UserId userId = (UserId) obj3;
                y3p D7 = u440Var.D7();
                CommonUploadParams commonUploadParams = u440Var.d;
                D7.i(StoryEditorEvents.CHANGE_AUTHOR_LONGTAP);
                q3p q3pVar = u440Var.u;
                if (q3pVar != null) {
                    q3pVar.setSendButtonAvatar(str2);
                }
                nov novVar = null;
                if (fkq0.d(userId)) {
                    commonUploadParams.e = UserId.d;
                    q3p q3pVar2 = u440Var.u;
                    if (q3pVar2 != null) {
                        q3pVar2.setPrivacy(u440Var.o.r.b.o());
                    }
                } else {
                    commonUploadParams.e = fkq0.e(userId);
                    q3p q3pVar3 = u440Var.u;
                    if (q3pVar3 != null) {
                        q3pVar3.setPrivacy(null);
                    }
                }
                u440Var.I2(str, str2);
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = u440Var.s.getStickersState().a;
                int i = 0;
                while (true) {
                    if (i != copyOnWriteArrayList.size()) {
                        if (copyOnWriteArrayList.get(i) instanceof edm0) {
                            novVar = copyOnWriteArrayList.get(i);
                        } else {
                            i++;
                        }
                    }
                }
                edm0 edm0Var = (edm0) novVar;
                if (edm0Var != null) {
                    u440Var.M7(edm0Var);
                }
                u440Var.i.postDelayed(new zi2(u440Var, 1), 500L);
                return s3q0.a;
            case 1:
                yzs yzsVar = (yzs) this.c;
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(wzsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-366448666, intValue, -1, "com.vk.clips.design.compose.description.TrendingHashtagsList.<anonymous>.<anonymous>.<anonymous> (TrendingHashtagsList.kt:48)");
                    }
                    yzsVar.invoke(kai.c(-21628341, new cv4(wzsVar, 10), aVar), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) obj;
                ((com.vk.video.ui.discovery.minimizable.p) this.c).getClass();
                return (!(videoMinimizableState instanceof VideoMinimizableState.Expanded) || (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) || !epx.f((com.vk.video.ui.discovery.minimizable.b) obj2, b.a.a) || epx.f((com.vk.video.ui.discovery.minimizable.related_videos.h) obj3, h.d.a)) ? com.vk.libvideo.api.minimizable.a.d(videoMinimizableState) ? xgs0.a.a : xgs0.c.a : xgs0.b.a;
            default:
                pox0.e.a.C3525a c3525a = (pox0.e.a.C3525a) this.c;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(spg0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1622750740, intValue2, -1, "com.vk.community.design.compose.widget.matches.TeamA.<anonymous> (WidgetMatches.kt:88)");
                    }
                    mnx0.h(spg0Var, c3525a.b, 6, aVar2, intValue2 & 14);
                    mnx0.g(c3525a.a, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
