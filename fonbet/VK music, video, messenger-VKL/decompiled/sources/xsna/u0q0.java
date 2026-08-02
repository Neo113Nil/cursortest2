package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogPermission;
import java.util.HashSet;
import java.util.List;
import xsna.xyp0;

/* compiled from: UiTrackingAlertDialog.kt */
/* loaded from: classes17.dex */
public final class u0q0 implements m0q0 {
    public final SchemeStat$TypeDialogItem.DialogItem b;
    public final List<SchemeStat$TypeDialogPermission> c;
    public boolean e;
    public SchemeStat$EventItem g;
    public boolean h;
    public final Handler d = new Handler(Looper.getMainLooper());
    public SchemeStat$TypeDialogItem.DialogAction f = SchemeStat$TypeDialogItem.DialogAction.DISMISS;

    /* compiled from: UiTrackingAlertDialog.kt */
    public static final class a {
        public SchemeStat$TypeDialogItem.DialogItem a;
        public HashSet<SchemeStat$TypeDialogPermission> b;
        public u0q0 c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0q0(SchemeStat$TypeDialogItem.DialogItem dialogItem, List<? extends SchemeStat$TypeDialogPermission> list) {
        this.b = dialogItem;
        this.c = list;
    }

    public final void a() {
        b(SchemeStat$TypeDialogItem.DialogAction.DISMISS);
    }

    public final void b(SchemeStat$TypeDialogItem.DialogAction dialogAction) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f = dialogAction;
        UiTracker.i.g();
    }

    public final void c() {
        this.f = SchemeStat$TypeDialogItem.DialogAction.SHOW;
        this.d.post(new qc9(this, 10));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a(xyp0.a.a(this.g, this.b, this.f, this.c, null, this.h, 16));
    }
}
