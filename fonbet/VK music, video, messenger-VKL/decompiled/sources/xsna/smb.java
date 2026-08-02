package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChatAvatarHelper.kt */
/* loaded from: classes2.dex */
public final class smb {
    public final gzs<DialogExt> a;
    public final u90 b;
    public final j8i c;
    public final f1w d;
    public final lzv e;
    public final mxv f;
    public final int g;
    public final String j;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public final int h = 7754294;
    public final String i = "im_chat_settings";
    public final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ChatAvatarHelper.kt */
    public interface a {
        void I(AvatarAction avatarAction);

        void L(Throwable th);

        void X(List<? extends AvatarAction> list);

        void c0();

        void t();
    }

    /* compiled from: ChatAvatarHelper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.CHANGE_BY_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_MINI_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public smb(gzs gzsVar, u90 u90Var, a aVar, f1w f1wVar, lzv lzvVar, mxv mxvVar, int i, String str) {
        this.a = gzsVar;
        this.b = u90Var;
        this.c = (j8i) aVar;
        this.d = f1wVar;
        this.e = lzvVar;
        this.f = mxvVar;
        this.g = i;
        this.j = str;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void b(Intent intent) {
        String str;
        if (intent == null || (str = intent.getStringExtra(X3.i.b)) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            e(str);
            return;
        }
        Uri uri = intent != null ? (Uri) intent.getParcelableExtra("output") : null;
        if (uri != null) {
            e(uri.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [xsna.j8i, xsna.smb$a] */
    public final void c() {
        Dialog Cb = this.a.invoke().Cb();
        if (Cb == null) {
            return;
        }
        ArrayList w0 = rl3.w0(AvatarAction.values());
        AvatarAction avatarAction = AvatarAction.REMOVE;
        ChatSettings Hb = Cb.Hb();
        boolean z = false;
        if (Hb != null && Hb.c.Jb()) {
            z = true;
        }
        p4g.l(w0, avatarAction, !z);
        AvatarAction avatarAction2 = AvatarAction.CHANGE_BY_MINI_APP;
        Peer a2 = this.d.a();
        a2.getClass();
        p4g.l(w0, avatarAction2, a2.Ab(Peer.Type.GROUP));
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.X(w0);
        }
    }

    public final void d(AvatarAction avatarAction) {
        boolean z;
        Activity activity;
        boolean z2;
        int i = b.$EnumSwitchMapping$0[avatarAction.ordinal()];
        u90 u90Var = this.b;
        if (i == 1) {
            Object B = u90Var.B();
            while (true) {
                z = B instanceof FragmentActivity;
                if (z || !(B instanceof ContextWrapper)) {
                    break;
                } else {
                    B = ((ContextWrapper) B).getBaseContext();
                }
            }
            activity = z ? (Activity) B : null;
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, (FragmentActivity) activity, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new il1(this, 11), null, 96);
            return;
        }
        if (i == 2) {
            Object B2 = u90Var.B();
            while (true) {
                z2 = B2 instanceof FragmentActivity;
                if (z2 || !(B2 instanceof ContextWrapper)) {
                    break;
                } else {
                    B2 = ((ContextWrapper) B2).getBaseContext();
                }
            }
            activity = z2 ? (Activity) B2 : null;
            PermissionHelper permissionHelper2 = PermissionHelper.a;
            permissionHelper2.getClass();
            PermissionHelper.h(permissionHelper2, (FragmentActivity) activity, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new gy0(this, 15), null, 96);
            return;
        }
        gzs<DialogExt> gzsVar = this.a;
        if (i == 3) {
            Dialog Cb = gzsVar.invoke().Cb();
            if (Cb == null) {
                return;
            }
            iwv.f(this.f.k(), u90Var.B(), this.h, "peer_id=" + Cb.Sb().longValue(), this.i, null, null, 48);
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hg1.d(this.l) || hg1.d(this.m)) {
            return;
        }
        int i2 = 13;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.e.b(this, new zmm(gzsVar.invoke().f, this.j)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new io1(new ul1(this, 18), i2)), new zva(this, 1)).subscribe(new um0(new jy(this, 26), i2), new wf1(new x7(this, 21), 9));
        this.k.b(subscribe);
        this.m = subscribe;
    }

    public final void e(String str) {
        if (hg1.d(this.l) || hg1.d(this.m)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.e.b(this, new ymm(this.a.invoke().f, str, this.j)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new h60(new g60(this, 23), 11)), new vy3(this, 1)).subscribe(new pv2(new hb(this, 21), 6), new ho1(new go1(this, 18), 8));
        this.k.b(subscribe);
        this.l = subscribe;
    }
}
