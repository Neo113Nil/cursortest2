package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.VideoUrl;
import java.util.List;
import one.video.cast.activity.ExpandedControlsActivity;
import ru.ok.android.onelog.OneLogItem;
import xsna.lvf0;

/* compiled from: ChromeCastManager.kt */
/* loaded from: classes8.dex */
public final class ybc extends lvf0.a {
    public final /* synthetic */ lvf0 a;
    public final /* synthetic */ xbc b;

    public ybc(lvf0 lvf0Var, xbc xbcVar) {
        this.a = lvf0Var;
        this.b = xbcVar;
    }

    @Override // xsna.lvf0.a
    public final void e() {
        this.a.y(this);
        gbr0 gbr0Var = this.b.c;
        List<VideoUrl> list = zhr0.a;
        Context context = gbr0Var.a;
        context.startActivity(new Intent(context, (Class<?>) ExpandedControlsActivity.class));
        OneLogItem.builder().setCollector("ok.mobile.apps.video").setType(1).setOperation("cast_ready").setCount(1).setTime(0L).log();
    }
}
