package xsna;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import android.view.View;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.feature.music.ui.holder.MusicNavigationVh;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.i2h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h2h implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h2h(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                j2h j2hVar = (j2h) this.c;
                i2h.a aVar = (i2h.a) this.d;
                Context context = aVar.itemView.getContext();
                sdz sdzVar = ((i2h) aVar.m).h;
                try {
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    String str = j2hVar.d;
                    if (str != null) {
                        intent.putExtra("title", str);
                    }
                    String str2 = j2hVar.e;
                    if (str2 != null) {
                        intent.putExtra("eventLocation", str2);
                    }
                    String str3 = j2hVar.f;
                    if (str3 != null) {
                        intent.putExtra("description", sdzVar.m(str3).toString());
                    }
                    int i = j2hVar.b;
                    if (i > 0) {
                        intent.putExtra("beginTime", i * 1000);
                    }
                    int i2 = j2hVar.c;
                    if (i2 > 0) {
                        intent.putExtra("endTime", i2 * 1000);
                    } else {
                        intent.putExtra("allDay", true);
                    }
                    context.startActivity(intent);
                    break;
                } catch (Throwable th) {
                    L.i(th);
                    return;
                }
            case 1:
                ((MusicNavigationVh) this.c).b.c.a.z(R.id.music_navigation_image_big, (UIBlockActionSwitchSection) this.d);
                break;
            default:
                yads.ns1.a((yads.ns1) this.c, (yads.y90) this.d, view);
                break;
        }
    }
}
