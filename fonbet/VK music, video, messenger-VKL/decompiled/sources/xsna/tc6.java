package xsna;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.g9m;
import xsna.g9m.a;
import xsna.xtt0;

/* compiled from: BaseDialog.kt */
/* loaded from: classes8.dex */
public abstract class tc6<ViewBindingType extends xtt0, ItemType extends g9m.a> extends com.google.android.material.bottomsheet.b {
    public static final int u = ((Number) x5r0.l.getValue()).intValue();
    public g9m<ViewBindingType, ItemType> t;

    @Override // com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        g9m<ViewBindingType, ItemType> g9mVar = new g9m<>(r());
        g9mVar.d = new com.vk.movika.sdk.base.observable.w(this, 7);
        this.t = g9mVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.one_video_dialog_view, (ViewGroup) null, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) inflate;
        recyclerView.setTag(Integer.valueOf(t()));
        setContentView(recyclerView);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutAnimation(null);
        g9m<ViewBindingType, ItemType> g9mVar2 = this.t;
        if (g9mVar2 == null) {
            g9mVar2 = null;
        }
        recyclerView.setAdapter(g9mVar2);
        recyclerView.setOverScrollMode(2);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToOutline(true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackground(null);
            BottomSheetBehavior.L(frameLayout).X(3);
        }
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.b, xsna.y8i, android.app.Dialog
    public void onStart() {
        super.onStart();
        q();
    }

    public final void q() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        Object systemService = getContext().getSystemService((Class<Object>) WindowManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        int width = rect.width();
        int i = u;
        if (width < i) {
            i = rect.width();
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -1);
        }
    }

    public abstract m37<ViewBindingType, ItemType> r();

    public abstract int t();

    public abstract void u(ItemType itemtype);
}
