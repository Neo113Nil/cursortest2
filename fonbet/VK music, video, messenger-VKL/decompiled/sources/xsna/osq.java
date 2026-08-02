package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Handler.kt */
/* loaded from: classes18.dex */
public final class osq implements Runnable {
    public final /* synthetic */ AppCompatActivity b;
    public final /* synthetic */ psq c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ncb e;
    public final /* synthetic */ sim f;

    public osq(AppCompatActivity appCompatActivity, nsq nsqVar, Context context, ncb ncbVar, sim simVar) {
        this.b = appCompatActivity;
        this.c = nsqVar;
        this.d = context;
        this.e = ncbVar;
        this.f = simVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.fragment.app.d dVar;
        Window window;
        int dimensionPixelSize;
        h4x i;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        Object obj;
        int i2 = 0;
        AppCompatActivity appCompatActivity = this.b;
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
            dVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : f) {
                if (obj2 instanceof androidx.fragment.app.d) {
                    arrayList.add(obj2);
                }
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) obj;
                Dialog dialog = dVar2.s;
                if ((dialog != null ? dialog.isShowing() : true) && dVar2.isAdded() && !dVar2.isHidden() && !dVar2.isRemoving()) {
                    break;
                }
            }
            dVar = (androidx.fragment.app.d) obj;
        }
        Dialog dialog2 = dVar != null ? dVar.s : null;
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            window = appCompatActivity != null ? appCompatActivity.getWindow() : null;
        }
        if (window == null) {
            this.f.invoke();
            return;
        }
        Resources resources = this.d.getResources();
        this.c.getClass();
        WindowManager.LayoutParams attributes = window.getAttributes();
        boolean z = attributes != null && (attributes.flags & 1024) == 1024;
        boolean z2 = dVar instanceof dw20;
        int i3 = R.dimen.fave_video_snackbar_small_bottom_margin;
        if (z) {
            WindowInsets rootWindowInsets = window.getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null && (i = bqx0.h(null, rootWindowInsets).a.i(2)) != null) {
                i2 = i.d;
            }
            if (resources.getConfiguration().orientation == 2) {
                i3 = R.dimen.fave_video_snackbar_large_bottom_margin;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i3) + i2;
        } else {
            if (!z2) {
                i3 = R.dimen.fave_video_snackbar_large_bottom_margin;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i3);
        }
        this.e.invoke(window, Integer.valueOf(dimensionPixelSize));
    }
}
