package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.reefton.literx.sbjects.ReplaySubject;
import com.vk.rlottie.RLottieDrawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: StreamEncoder.java */
/* loaded from: classes12.dex */
public final class som0 implements yip, iz20, nal0, ryr0 {
    public final Object b;

    public /* synthetic */ som0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.ryr0
    public void a() {
        hzr0 hzr0Var = (hzr0) this.b;
        hzr0Var.c.e();
        SharedPreferences.Editor edit = hzr0Var.f().edit();
        edit.putLong("pref_key_last_ad_free_button_show", System.currentTimeMillis());
        edit.apply();
    }

    @Override // xsna.nal0
    public void b(boolean z) {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        for (nov novVar : clipsStickersView.getCurrentStickers()) {
            clipsStickersView.e.getClass();
            ate0 ate0Var = novVar instanceof ate0 ? (ate0) novVar : null;
            if (ate0Var != null) {
                rj01 rj01Var = ate0Var.h;
                if (z) {
                    ((RLottieDrawable) rj01Var.b).o(true);
                } else {
                    ((RLottieDrawable) rj01Var.b).o(false);
                    RLottieDrawable rLottieDrawable = (RLottieDrawable) rj01Var.b;
                    wy3 wy3Var = rLottieDrawable.m;
                    wy3Var.c.E = rLottieDrawable.k.E;
                    wy3Var.c.l = false;
                    ez3 ez3Var = wy3Var.a;
                    int i = ez3Var.e.get();
                    int f = wy3Var.f();
                    if (f >= ez3Var.b[1]) {
                        wy3Var.g(f);
                    } else {
                        ez3Var.e.set(f);
                    }
                    if (i != f) {
                        wy3Var.e(i, f);
                        wy3Var.h(ez3Var.e.get());
                    }
                }
            }
        }
    }

    @Override // xsna.nal0
    public void c(yv6 yv6Var) {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (clipsStickersView.isLaidOut()) {
            yv6Var.run();
        } else {
            clipsStickersView.addOnLayoutChangeListener(new oal0(yv6Var));
        }
    }

    @Override // xsna.nal0
    public h5f d() {
        return ((ClipsStickersView) this.b).getStickersState();
    }

    @Override // xsna.nal0
    public void e(h5f h5fVar) {
        ((ClipsStickersView) this.b).setStickersState(h5fVar);
    }

    @Override // xsna.nal0
    public Bitmap f() {
        return kd7.i((ClipsStickersView) this.b, null);
    }

    @Override // xsna.nal0
    public void g(nov novVar) {
        ((ClipsStickersView) this.b).getStickersState().b.remove(novVar);
    }

    @Override // xsna.nal0
    public int getHeight() {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        return clipsStickersView.getHeight() > 0 ? clipsStickersView.getHeight() : clipsStickersView.getMeasuredHeight();
    }

    @Override // xsna.nal0
    public List getStickers() {
        return ((ClipsStickersView) this.b).getCurrentStickers();
    }

    @Override // xsna.nal0
    public int getWidth() {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        return clipsStickersView.getWidth() > 0 ? clipsStickersView.getWidth() : clipsStickersView.getMeasuredWidth();
    }

    @Override // xsna.yip
    public boolean h(@NonNull Object obj, @NonNull File file, @NonNull au80 au80Var) {
        InputStream inputStream = (InputStream) obj;
        cl3 cl3Var = (cl3) this.b;
        byte[] bArr = (byte[]) cl3Var.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    cl3Var.put(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    cl3Var.put(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            cl3Var.put(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // xsna.nal0
    public fn2 i() {
        return ((ClipsStickersView) this.b).getAnimationChoreographer();
    }

    @Override // xsna.nal0
    public void invalidate() {
        ((ClipsStickersView) this.b).invalidate();
    }

    @Override // xsna.nal0
    public void k() {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        for (nov novVar : clipsStickersView.getCurrentStickers()) {
            clipsStickersView.e.getClass();
            if (novVar instanceof ate0) {
                ((RLottieDrawable) ((ate0) novVar).h.b).i();
            }
        }
    }

    @Override // xsna.nal0
    public void l(ArrayList arrayList) {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nov novVar = (nov) it.next();
            if (novVar instanceof View) {
                lyd.a.c(new IllegalArgumentException("Passing view stickers in bucket not supported yet"));
                return;
            }
            novVar.setInvalidator(new i5f(clipsStickersView, 0));
        }
        h5f h5fVar = clipsStickersView.i;
        h5fVar.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            h5fVar.a((nov) it2.next());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            clipsStickersView.h((nov) it3.next());
        }
        clipsStickersView.invalidate();
    }

    @Override // xsna.nal0
    public void m() {
        ClipsStickersView clipsStickersView = (ClipsStickersView) this.b;
        for (nov novVar : clipsStickersView.getCurrentStickers()) {
            clipsStickersView.e.getClass();
            ate0 ate0Var = novVar instanceof ate0 ? (ate0) novVar : null;
            if (ate0Var != null) {
                ((RLottieDrawable) ate0Var.h.b).k.s = false;
            }
        }
    }

    @Override // xsna.iz20
    public void n(dw20 dw20Var) {
        ((com.vk.im.ui.components.contacts.a) this.b).V0();
    }

    public rt8 o() {
        return (rt8) this.b;
    }

    @Override // xsna.ryr0
    public void onClick() {
        hzr0 hzr0Var = (hzr0) this.b;
        syr0 syr0Var = hzr0Var.g;
        Context context = syr0Var != null ? syr0Var.getContext() : null;
        String str = hzr0Var.f;
        if (context != null && str != null) {
            hzr0Var.b.b(context, str);
        }
        hzr0Var.c.h();
        syr0 syr0Var2 = hzr0Var.g;
        if (syr0Var2 != null) {
            syr0Var2.setVisible(false);
        }
    }

    @Override // xsna.ryr0
    public void onClose() {
        hzr0 hzr0Var = (hzr0) this.b;
        hzr0Var.c.d();
        hzr0Var.e = false;
    }

    public boolean p(int i) {
        q850 q850Var = (q850) this.b;
        new PlaybackActionMeta(17, 0L, 2, null);
        return q850Var.d.f(i);
    }

    @Override // xsna.nal0
    public void r2(nov novVar) {
        ((ClipsStickersView) this.b).j(novVar);
    }

    public som0() {
        this.b = new ReplaySubject(new ReplaySubject.a());
    }

    public som0(Context context) {
        this.b = new q850(context);
    }
}
