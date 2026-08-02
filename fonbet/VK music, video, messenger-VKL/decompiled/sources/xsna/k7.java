package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.CameraInternal;
import androidx.media3.exoplayer.offline.d;
import androidx.preference.Preference;
import com.vk.attachpicker.screen.p;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.ajf0;
import xsna.dy8;
import xsna.snw;
import xsna.ub9;
import xsna.yqh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ub9.c, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.b, ajf0.a, Preference.c, Toolbar.h, dy8.a, p.d {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.dy8.a
    public void a(long j, long j2, long j3) {
        d.a aVar = ((pmr) this.c).e;
        if (aVar == null) {
            return;
        }
        aVar.b(j, j2, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((yqh.a) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((qg3) this.c).invoke(obj, obj2);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ugz ugzVar;
        vo9 vo9Var = (vo9) this.c;
        fl9 fl9Var = vo9Var.a;
        synchronized (fl9Var.a) {
            try {
                if (fl9Var.b.isEmpty()) {
                    ugzVar = fl9Var.d;
                    if (ugzVar == null) {
                        ugzVar = snw.c.c;
                    }
                } else {
                    ugz ugzVar2 = fl9Var.d;
                    if (ugzVar2 == null) {
                        ugzVar2 = ub9.a(new e8(fl9Var, 6));
                        fl9Var.d = ugzVar2;
                    }
                    fl9Var.c.addAll(fl9Var.b.values());
                    for (CameraInternal cameraInternal : fl9Var.b.values()) {
                        cameraInternal.release().addListener(new ue9(1, fl9Var, cameraInternal), xo9.g());
                    }
                    fl9Var.b.clear();
                    ugzVar = ugzVar2;
                }
            } finally {
            }
        }
        ugzVar.addListener(new vr2(2, vo9Var, aVar), vo9Var.d);
        return "CameraX shutdownInternal";
    }

    @Override // xsna.ajf0.a
    public hfz c(int i) {
        return u1j.Q4((u1j) this.c, i);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        new WebViewFragment.c("chrome://crash").l(debugDevSettingsFragment);
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 14:
                ((cfm) obj).D(menuItem);
                break;
            default:
                PollViewerFragment pollViewerFragment = (PollViewerFragment) obj;
                int i2 = PollViewerFragment.d0;
                if (menuItem.getItemId() == R.id.edit) {
                    PollAttachment pollAttachment = pollViewerFragment.S;
                    if (pollAttachment != null) {
                        int i3 = PollEditorFragment.a.m;
                        PollEditorFragment.a.C1520a.b(pollAttachment, pollViewerFragment.W).g(10009, pollViewerFragment);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                return ((Boolean) ((yx0) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((pf) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((gky) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.logic.interactor.i) this.c).invoke(obj);
            case 1:
            case 4:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 22:
            case 23:
            default:
                return (io.reactivex.rxjava3.core.t) ((gky) this.c).invoke(obj);
            case 2:
                return (Integer) ((tb4) this.c).invoke(obj);
            case 3:
                return (Boolean) ((nk) this.c).invoke(obj);
            case 5:
                return (hda) ((qi3) this.c).invoke(obj);
            case 7:
                return (y8b) ((tb4) this.c).invoke(obj);
            case 9:
                return (CharSequence) ((tb4) this.c).invoke(obj);
            case 10:
                return (it80) ((tb4) this.c).invoke(obj);
            case 15:
                return (ArrayList) ((tb4) this.c).invoke(obj);
            case 16:
                return (j170) ((jm0) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((tcn) this.c).invoke(obj);
            case 19:
                return (List) ((izs) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((gky) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((tcn) this.c).invoke(obj);
            case 24:
                return (tt70) ((tcn) this.c).invoke(obj);
            case 25:
                return (jv60) ((gky) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((k170) this.c).invoke(obj);
            case 27:
                return (Integer) ((gky) this.c).invoke(obj);
        }
    }
}
