package xsna;

import android.app.Activity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: AddVideoByLink.kt */
/* loaded from: classes17.dex */
public final class hp0 {
    public final Activity a;
    public final UserId b;
    public final String c;
    public final int d;
    public final WeakReference<Activity> e;
    public final ner0 f;

    public hp0(Activity activity, UserId userId, String str, int i) {
        this.a = activity;
        this.b = userId;
        this.c = str;
        this.d = i;
        this.e = new WeakReference<>(activity);
        ner0 ner0Var = new ner0(activity);
        ner0Var.setMessage(activity.getString(R.string.loading));
        ner0Var.show();
        this.f = ner0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        UiTracker uiTracker = UiTracker.a;
        int i = 2;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.READY_FOR_UPLOAD, null, i, 0 == true ? 1 : 0), 2)).q();
        int i2 = 0;
        int i3 = 1;
        new io.reactivex.rxjava3.internal.operators.observable.s0(new bp0(this, i2)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new defpackage.i0(new n40(this, i3), i3), new cp0(new p40(this, i), i2));
    }
}
