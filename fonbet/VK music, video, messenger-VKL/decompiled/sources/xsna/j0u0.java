package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.HashSet;
import xsna.rl8;

/* compiled from: ViewRefs.java */
@Deprecated
/* loaded from: classes3.dex */
public final class j0u0 implements syf {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ j0u0(int i) {
        this.a = i;
    }

    public static boolean e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            ahq.m("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        ahq.m("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // xsna.syf
    public void a(UserId userId, boolean z) {
        ((com.vk.im.ui.components.msg_list.a) this.b).M1(com.vk.dto.common.a.a(userId));
    }

    @Override // xsna.syf
    public void b(UserId userId, w8 w8Var) {
        com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.b;
        o0r0 d = aVar.z.d();
        ClipVideoFile clipVideoFile = (ClipVideoFile) this.c;
        aVar.I0(o0r0.i(d, userId, true, clipVideoFile.W, false, "IM_CHAT", 104).a0(asu0.a.d()).subscribe(new b8v(new swe(aVar, clipVideoFile, userId, w8Var, 3), 8), new k130(new eiz(aVar, 10), 3)));
        aVar.A.d.x().a(new ldd(clipVideoFile.c, clipVideoFile.b.b, false));
    }

    @Override // xsna.syf
    public void c(UserId userId, e5 e5Var) {
        com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.b;
        o0r0 d = aVar.z.d();
        ClipVideoFile clipVideoFile = (ClipVideoFile) this.c;
        aVar.I0(o0r0.i(d, userId, false, clipVideoFile.W, false, "IM_CHAT", 104).a0(asu0.a.d()).subscribe(new f5y(new ztj(aVar, clipVideoFile, userId, e5Var, 1), 4), new nex(new o3w(aVar, 15), 5)));
        aVar.A.d.x().a(new ldd(clipVideoFile.c, clipVideoFile.b.b, true));
    }

    public Bitmap d(int i) {
        Object pollFirst;
        rl8 rl8Var = (rl8) this.c;
        synchronized (rl8Var) {
            rl8.a aVar = rl8Var.a.get(i);
            if (aVar == null) {
                pollFirst = null;
            } else {
                pollFirst = aVar.c.pollFirst();
                if (rl8Var.b != aVar) {
                    rl8Var.a(aVar);
                    rl8.a aVar2 = rl8Var.b;
                    if (aVar2 == null) {
                        rl8Var.b = aVar;
                        rl8Var.c = aVar;
                    } else {
                        aVar.d = aVar2;
                        aVar2.a = aVar;
                        rl8Var.b = aVar;
                    }
                }
            }
        }
        if (pollFirst != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(pollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) pollFirst;
        if (bitmap == null || !e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object f() {
        Object obj;
        rl8 rl8Var = (rl8) this.c;
        synchronized (rl8Var) {
            rl8.a<T> aVar = rl8Var.c;
            if (aVar == 0) {
                obj = null;
            } else {
                Object pollLast = aVar.c.pollLast();
                if (aVar.c.isEmpty()) {
                    rl8Var.a(aVar);
                    rl8Var.a.remove(aVar.b);
                }
                obj = pollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.b).remove(obj);
        }
        return obj;
    }

    public void g(Bundle bundle) {
        this.b = bundle.containsKey("startScreenTime") ? Long.valueOf(bundle.getLong("startScreenTime")) : null;
        this.c = bundle.containsKey("startScreenElapsedTime") ? Long.valueOf(bundle.getLong("startScreenElapsedTime")) : null;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "<" + ((String) this.b) + ">: " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j0u0(j8i j8iVar, Object obj, int i) {
        this.a = i;
        this.b = j8iVar;
        this.c = obj;
    }

    public j0u0(bmb bmbVar, String str, Object[] objArr) {
        this.a = 4;
        bmbVar.getClass();
        this.b = bmbVar.m();
        this.c = String.format(str, objArr);
    }

    public j0u0() {
        this.a = 1;
        this.b = new HashSet();
        this.c = new rl8();
    }
}
