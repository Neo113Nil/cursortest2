package xsna;

import android.content.DialogInterface;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogPermission;
import java.util.HashSet;
import xsna.u0q0;

/* compiled from: VkDialogTracker.kt */
/* loaded from: classes17.dex */
public final class cqu0 implements amm {
    public static final a b = new a();
    public static final HashSet c = izi0.d("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
    public static final HashSet d = izi0.d("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    public final u0q0.a a;

    /* compiled from: VkDialogTracker.kt */
    public static final class a {
    }

    public cqu0(u0q0.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.r0q0] */
    @Override // xsna.amm
    public final r0q0 a(final DialogInterface.OnDismissListener onDismissListener) {
        final u0q0.a aVar = this.a;
        return new DialogInterface.OnDismissListener() { // from class: xsna.r0q0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss(dialogInterface);
                }
                u0q0 u0q0Var = aVar.c;
                if (u0q0Var != null) {
                    u0q0Var.a();
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.s0q0] */
    @Override // xsna.amm
    public final s0q0 b(final DialogInterface.OnShowListener onShowListener) {
        final u0q0.a aVar = this.a;
        return new DialogInterface.OnShowListener() { // from class: xsna.s0q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                DialogInterface.OnShowListener onShowListener2 = onShowListener;
                if (onShowListener2 != null) {
                    onShowListener2.onShow(dialogInterface);
                }
                u0q0 u0q0Var = aVar.c;
                if (u0q0Var != null) {
                    u0q0Var.c();
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.t0q0] */
    @Override // xsna.amm
    public final t0q0 c(final DialogInterface.OnClickListener onClickListener) {
        final u0q0.a aVar = this.a;
        return new DialogInterface.OnClickListener() { // from class: xsna.t0q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i);
                }
                u0q0 u0q0Var = aVar.c;
                if (u0q0Var != null) {
                    u0q0Var.b(SchemeStat$TypeDialogItem.DialogAction.CANCEL);
                }
            }
        };
    }

    @Override // xsna.amm
    public final void create() {
        u0q0.a aVar = this.a;
        SchemeStat$TypeDialogItem.DialogItem dialogItem = aVar.a;
        HashSet<SchemeStat$TypeDialogPermission> hashSet = aVar.b;
        u0q0 u0q0Var = new u0q0(dialogItem, hashSet != null ? j5g.O0(hashSet) : null);
        u0q0Var.h = false;
        aVar.c = u0q0Var;
    }

    @Override // xsna.amm
    public final qi10 d(DialogInterface.OnClickListener onClickListener) {
        return new qi10(1, onClickListener, this.a);
    }

    @Override // xsna.amm
    public final r7d e(qwd0 qwd0Var) {
        return new r7d(1, this.a, qwd0Var);
    }
}
