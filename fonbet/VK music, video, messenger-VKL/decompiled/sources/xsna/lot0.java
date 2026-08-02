package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.mot0;

/* compiled from: VideoUploadNavigator.kt */
/* loaded from: classes3.dex */
public final class lot0 implements av20.b<mot0.b> {
    public final /* synthetic */ UserId a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public lot0(UserId userId, int i, String str) {
        this.a = userId;
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        mot0.b bVar = (mot0.b) obj;
        dw20 dw20Var = mot0.a.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventSubtype eventSubtype = null;
        Object[] objArr = 0;
        mot0.a.b = null;
        Activity h = e3m.h(view.getContext());
        if (h != null) {
            int i2 = bVar.i();
            UserId userId = this.a;
            int i3 = this.b;
            String str = this.c;
            if (i2 == R.id.record) {
                fxc0.B().Y().c(h, UploadVideoAction.RECORD, userId, i3, str);
            } else if (i2 == R.id.select) {
                fxc0.B().Y().c(h, UploadVideoAction.SELECT, userId, i3, str);
            } else if (i2 == R.id.link) {
                fxc0.B().i0(h, userId, i3);
            }
            int i4 = bVar.i();
            MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType eventType = i4 == R.id.record ? MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.CREATE_VIDEO : i4 == R.id.select ? MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.CHOOSE_FILE : i4 == R.id.link ? MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.ADD_FROM_LINK : null;
            if (eventType != null) {
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(eventType, eventSubtype, 2, objArr == true ? 1 : 0), 2)).q();
            }
        }
    }
}
