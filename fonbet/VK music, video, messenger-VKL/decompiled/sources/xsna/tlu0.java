package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.Editable;
import android.util.Size;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.WindowManager;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.log.L;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.f0e;

/* compiled from: VkClipsStickerSelectionProviderImpl.kt */
/* loaded from: classes16.dex */
public final class tlu0 implements w4f, w8i {
    public final Context b;
    public final f0e.b c;
    public final f0e.c d;
    public final bpn0 e = new bpn0(new tfu0(this, 3));
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new wqf0(12));

    /* compiled from: VkClipsStickerSelectionProviderImpl.kt */
    public static final class c implements amo0 {
        public final /* synthetic */ xlo0 b;
        public final /* synthetic */ tlu0 c;
        public final /* synthetic */ int d;

        public c(xlo0 xlo0Var, tlu0 tlu0Var, int i) {
            this.b = xlo0Var;
            this.c = tlu0Var;
            this.d = i;
        }

        @Override // xsna.amo0
        public final void a(Editable editable, imo0 imo0Var) {
            f0e.b bVar = this.c.c;
            xlo0 xlo0Var = this.b;
            if ((editable == null || editable.length() == 0) && xlo0Var != null) {
                bVar.d(xlo0Var);
                return;
            }
            if (myc0.f(editable) && xlo0Var == null && imo0Var != null) {
                bVar.a(new xlo0(this.d, editable, imo0Var));
            } else {
                if (xlo0Var == null || !myc0.f(editable) || imo0Var == null) {
                    return;
                }
                xlo0Var.q(imo0Var, editable);
            }
        }
    }

    public tlu0(Context context, f0e.b bVar, f0e.c cVar) {
        this.b = context;
        this.c = bVar;
        this.d = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.w4f
    public final void a(nov novVar) {
        final v4m0 v4m0Var = novVar instanceof v4m0 ? (v4m0) novVar : null;
        if (v4m0Var != null) {
            v4m0Var.setInEditMode(true);
            this.c.b();
        }
        w3l0 w3l0Var = (w3l0) this.e.getValue();
        t4m0 t4m0Var = v4m0Var != null ? v4m0Var.h : null;
        n4m0 c2 = w3l0Var.c(this.b, new a(v4m0Var, this), StoryCameraTarget.UNDEFINED, new s101(), t4m0Var, (y4f) this.f.getValue(), null);
        c2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.rlu0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.c.c(v4m0Var);
            }
        });
        c2.show();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.w4f
    public final void b(nov novVar) {
        final x6m0 x6m0Var = novVar instanceof x6m0 ? (x6m0) novVar : null;
        if (x6m0Var != null) {
            x6m0Var.setInEditMode(true);
            this.c.b();
        }
        w3l0 w3l0Var = (w3l0) this.e.getValue();
        v6m0 v6m0Var = x6m0Var != null ? x6m0Var.h : null;
        b bVar = new b(x6m0Var, this);
        StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
        y4f y4fVar = (y4f) this.f.getValue();
        q6m0 b2 = w3l0Var.b(this.b, bVar, storyCameraTarget, new s101(), v6m0Var, y4fVar, null);
        b2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.qlu0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.c.c(x6m0Var);
            }
        });
        b2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r2 = r2.getCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    @Override // xsna.w4f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(nov novVar, Size size, int i, int i2) {
        Integer num;
        Window window;
        Display display;
        DisplayCutout cutout;
        int width = size.getWidth() - xlo0.p;
        if (width > i) {
            width = i;
        }
        final xlo0 xlo0Var = novVar instanceof xlo0 ? (xlo0) novVar : null;
        if (xlo0Var != null) {
            xlo0Var.setInEditMode(true);
            this.c.b();
        }
        c cVar = new c(xlo0Var, this, width);
        Activity h = e3m.h(this.b);
        if (h != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                display = h.getDisplay();
                if (display != null && cutout != null) {
                    num = Integer.valueOf(cutout.getSafeInsetTop() - cutout.getSafeInsetBottom());
                }
            } else {
                num = Integer.valueOf(iah0.e(h));
            }
            w3l0 w3l0Var = (w3l0) this.e.getValue();
            boolean z = num != null;
            if (xlo0Var != null || (r3 = xlo0Var.l) == null) {
                CharSequence charSequence = "";
            }
            cmo0 a2 = w3l0Var.a(this.b, z, cVar, null, this.d, true, charSequence, xlo0Var == null ? xlo0Var.k : null, false);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window2 = a2.getWindow();
            layoutParams.copyFrom(window2 != null ? window2.getAttributes() : null);
            layoutParams.gravity = 48;
            layoutParams.y = i2 + (num != null ? num.intValue() : 0);
            layoutParams.width = size.getWidth();
            layoutParams.height = size.getHeight();
            window = a2.getWindow();
            if (window != null) {
                window.setAttributes(layoutParams);
            }
            a2.g = new DialogInterface.OnDismissListener() { // from class: xsna.slu0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    tlu0.this.c.c(xlo0Var);
                }
            };
            a2.show();
        }
        num = null;
        w3l0 w3l0Var2 = (w3l0) this.e.getValue();
        if (num != null) {
        }
        if (xlo0Var != null) {
        }
        CharSequence charSequence2 = "";
        cmo0 a22 = w3l0Var2.a(this.b, z, cVar, null, this.d, true, charSequence2, xlo0Var == null ? xlo0Var.k : null, false);
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        Window window22 = a22.getWindow();
        layoutParams2.copyFrom(window22 != null ? window22.getAttributes() : null);
        layoutParams2.gravity = 48;
        layoutParams2.y = i2 + (num != null ? num.intValue() : 0);
        layoutParams2.width = size.getWidth();
        layoutParams2.height = size.getHeight();
        window = a22.getWindow();
        if (window != null) {
        }
        a22.g = new DialogInterface.OnDismissListener() { // from class: xsna.slu0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                tlu0.this.c.c(xlo0Var);
            }
        };
        a22.show();
    }

    @Override // xsna.w4f
    public final k9l0 d(int i, int i2, List list) {
        return tci.i(i, i2, list);
    }

    /* compiled from: VkClipsStickerSelectionProviderImpl.kt */
    public static final class a implements l4m0 {
        public final /* synthetic */ v4m0 b;
        public final /* synthetic */ tlu0 c;

        public a(v4m0 v4m0Var, tlu0 tlu0Var) {
            this.b = v4m0Var;
            this.c = tlu0Var;
        }

        @Override // xsna.l4m0
        public final void a() {
            v4m0 v4m0Var = this.b;
            if (v4m0Var != null) {
                this.c.c.d(v4m0Var);
            } else {
                L.l("StickersDelegateImpl", "Can't removeCurrentHashtag without sticker");
            }
        }

        @Override // xsna.l4m0
        public final void b(v4m0 v4m0Var) {
            if (this.b == null) {
                this.c.c.a(v4m0Var);
            } else {
                L.l("StickersDelegateImpl", "Can't append hashtag sticker in editor mode");
            }
        }

        @Override // xsna.l4m0
        public final void c(t4m0 t4m0Var) {
            v4m0 v4m0Var = this.b;
            if (v4m0Var != null) {
                v4m0Var.r(t4m0Var);
            } else {
                L.l("StickersDelegateImpl", "You can't update sticker without sticker");
            }
        }

        @Override // xsna.l4m0
        public final void Y() {
        }
    }

    /* compiled from: VkClipsStickerSelectionProviderImpl.kt */
    public static final class b implements n6m0 {
        public final /* synthetic */ x6m0 b;
        public final /* synthetic */ tlu0 c;

        public b(x6m0 x6m0Var, tlu0 tlu0Var) {
            this.b = x6m0Var;
            this.c = tlu0Var;
        }

        @Override // xsna.n6m0
        public final void a() {
            x6m0 x6m0Var = this.b;
            if (x6m0Var != null) {
                this.c.c.d(x6m0Var);
            } else {
                L.l("Can't removeCurrentHashtag without sticker");
            }
        }

        @Override // xsna.n6m0
        public final void d(x6m0 x6m0Var) {
            if (this.b == null) {
                this.c.c.a(x6m0Var);
            } else {
                L.l("Can't append mention sticker in editor mode");
            }
        }

        @Override // xsna.n6m0
        public final void g(v6m0 v6m0Var) {
            x6m0 x6m0Var = this.b;
            if (x6m0Var != null) {
                x6m0Var.r(v6m0Var);
            } else {
                L.l("You can't update sticker without sticker");
            }
        }

        @Override // xsna.n6m0
        public final void Y() {
        }
    }
}
