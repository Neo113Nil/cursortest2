package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.preference.Preference;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.user.UserProfile;
import com.vk.permission.PermissionHelper;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.aa70;
import xsna.e6w0;
import xsna.est0;
import xsna.exy0;
import xsna.h1o0;
import xsna.ru50;
import xsna.u8r0;
import xsna.xn60;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu50 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.b, exy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qu50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((uni) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((ru50.c) this.c).invoke(obj);
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 15:
            default:
                return (z0x0.a.b) ((aiw0) this.c).invoke(obj);
            case 3:
                return (UserProfile) ((amp) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((w620) this.c).invoke(obj);
            case 5:
                return (Pair) ((f1s) this.c).invoke(obj);
            case 6:
                return (UserProfile) ((w620) this.c).invoke(obj);
            case 10:
                return (it80) ((f1s) this.c).invoke(obj);
            case 11:
                return (o7m0) ((rzl0) this.c).invoke(obj);
            case 12:
                return (GetStoriesResponse) ((hv7) this.c).invoke(obj);
            case 13:
                return (ffe0) ((w9l0) this.c).invoke(obj);
            case 14:
                return (h1o0.a) ((w9l0) this.c).invoke(obj);
            case 16:
                return (u8r0.a) ((w9l0) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((zo8) this.c).invoke(obj);
            case 18:
                return (UserProfile) ((w9l0) this.c).invoke(obj);
            case 19:
                return (hda) ((est0.b) this.c).invoke(obj);
        }
    }

    @Override // xsna.exy0.a
    public void b() {
        baz0 baz0Var = (baz0) this.c;
        m6z0 m6z0Var = baz0Var.k;
        if (m6z0Var != null) {
            hcy0 hcy0Var = baz0Var.l;
            tez0 tez0Var = m6z0Var.a;
            pdz0 pdz0Var = pdz0.this;
            Iterator it = pdz0Var.f.iterator();
            while (it.hasNext()) {
                ((m6z0) it.next()).f = true;
            }
            pdz0Var.g.a.e(tez0Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Collection) ((qci) this.c).invoke(obj, obj2, obj3);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        switch (this.b) {
            case 1:
                ((ar60) this.c).b.a(xn60.d.b.b);
                break;
            default:
                ((VmojiCharacterFragment.c) this.c).invoke(e6w0.m.b);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r4.element != false) goto L27;
     */
    @Override // io.reactivex.rxjava3.core.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        boolean hasCallbacks;
        aa70 aa70Var = (aa70) this.c;
        Handler handler = new Handler(Looper.getMainLooper());
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        tzz tzzVar = new tzz(2, ref$BooleanRef, bVar);
        handler.postDelayed(tzzVar, TimeUnit.SECONDS, 5L);
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            hasCallbacks = handler.hasCallbacks(tzzVar);
            if (hasCallbacks) {
                handler.removeCallbacks(tzzVar);
            }
            if (anj.a(b, "android.permission.POST_NOTIFICATIONS") == 0 || Preference.f("notification_gdpr_dialog").getBoolean("dialog_already_shown", false)) {
                bVar.onComplete();
            } else if (gz80.a(33)) {
                if (!aa70.b(b instanceof AppCompatActivity ? (AppCompatActivity) b : null)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    permissionHelper.d(b, PermissionHelper.b, R.string.vk_permissions_notifications, R.string.vk_permissions_notifications, new yq1(13, aa70Var, bVar), new defpackage.o(28, aa70Var, bVar));
                }
            } else {
                i0q0.f(new s2b(b, aa70Var, bVar, 7));
            }
        }
        aa70.a aVar = new aa70.a(handler, tzzVar, ref$BooleanRef, aa70Var, bVar);
        aa70Var.a = aVar;
        c63.a(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((f1s) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((f1s) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((rzl0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (iiw0) ((xa2) this.c).invoke(obj, obj2);
    }
}
