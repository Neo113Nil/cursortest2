package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.llo;

/* compiled from: StoryRenderingLayer.java */
/* loaded from: classes3.dex */
public final class lbm0 implements uq10 {
    public final llo.b a;
    public final llo b;
    public final vob c;
    public final wlo d;
    public final vlo e;
    public final zcl0 f;
    public final zcl0 g;
    public final fn2 h;
    public final zcl0 i;

    @Nullable
    public final yo9 j;
    public final boolean k;
    public final String l;
    public final boolean m;

    @Nullable
    public yo9 n;

    public lbm0(@NonNull zcl0 zcl0Var, @NonNull vlo vloVar, @NonNull fn2 fn2Var, @NonNull MediaUtils.d dVar, String str, boolean z) {
        this(zcl0Var, new wlo(), fn2Var, dVar, str, z);
        this.c = new vob();
        this.e = vloVar;
        this.j = this.k ? null : a(-1, -1);
    }

    public final yo9 a(int i, int i2) {
        llo.b bVar = this.a;
        bVar.b();
        Canvas canvas = bVar.d;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        try {
            if (!this.f.a.isEmpty()) {
                zcl0 zcl0Var = this.f;
                llo.b bVar2 = this.a;
                zcl0Var.n(bVar2.a, bVar2.b);
                zcl0 zcl0Var2 = this.f;
                zcl0Var2.b = i;
                zcl0Var2.d(canvas, i2, false);
            }
            wlo wloVar = this.d;
            llo.b bVar3 = this.a;
            wloVar.a(bVar3.a, bVar3.b);
            this.b.a(this.d);
            vob vobVar = this.c;
            if (vobVar != null) {
                pb7 pb7Var = (pb7) vobVar.b;
                pb7Var.a(canvas.getWidth(), canvas.getHeight());
                vlo vloVar = this.e;
                llo.b bVar4 = this.a;
                xlo.a(xlo.f(vloVar, bVar4.a, bVar4.b), vobVar);
                pb7Var.b();
                Bitmap bitmap = pb7Var.a;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                }
            }
            if (!this.g.a.isEmpty()) {
                zcl0 zcl0Var3 = this.g;
                llo.b bVar5 = this.a;
                zcl0Var3.n(bVar5.a, bVar5.b);
                zcl0 zcl0Var4 = this.g;
                zcl0Var4.b = i;
                zcl0Var4.d(canvas, -1, false);
            }
        } catch (Exception e) {
            L.i(e);
        }
        llo.b bVar6 = this.a;
        bVar6.b();
        Bitmap bitmap2 = bVar6.c;
        zcl0 zcl0Var5 = this.f;
        llo.b bVar7 = this.a;
        ClickableStickers g = zcl0Var5.g(bVar7.a, bVar7.b);
        zcl0 zcl0Var6 = this.g;
        llo.b bVar8 = this.a;
        ClickableStickers g2 = zcl0Var6.g(bVar8.a, bVar8.b);
        if (g == null) {
            g = g2;
        } else if (g2 != null) {
            g.d.addAll(g2.d);
        }
        if (this.n == null) {
            this.n = new yo9(null);
        }
        yo9 yo9Var = this.n;
        yo9Var.c = bitmap2;
        yo9Var.d = g;
        return yo9Var;
    }

    @Override // xsna.uq10
    public final void b() {
        this.i.v();
        this.f.v();
        this.g.v();
    }

    @Override // xsna.uq10
    public final boolean c() {
        return this.m;
    }

    @Override // xsna.uq10
    @NonNull
    public final uq10 copy() {
        llo.b bVar = this.a;
        vlo vloVar = this.e;
        if (vloVar == null) {
            return new lbm0(this.i, this.d, this.h, new MediaUtils.d(bVar.a, bVar.b), this.l, this.m);
        }
        kif0 kif0Var = vloVar.b;
        List<uap> list = vloVar.a;
        vloVar.getClass();
        return new lbm0(this.i, new vlo(list, kif0Var), this.h, new MediaUtils.d(bVar.a, bVar.b), this.l, this.m);
    }

    @Override // xsna.uq10
    public final Bitmap d(int i, int i2) {
        return (Bitmap) ((this.k || (i2 != -1)) ? a(i, i2) : this.j).c;
    }

    @Override // xsna.uq10
    public final void e() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.f.a;
        for (int i = 0; i != copyOnWriteArrayList.size(); i++) {
            copyOnWriteArrayList.get(i).stopEncoding();
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = this.g.a;
        for (int i2 = 0; i2 != copyOnWriteArrayList2.size(); i2++) {
            copyOnWriteArrayList2.get(i2).stopEncoding();
        }
    }

    @Override // xsna.uq10
    public final void f() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.f.a;
        for (int i = 0; i != copyOnWriteArrayList.size(); i++) {
            copyOnWriteArrayList.get(i).startEncoding();
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = this.g.a;
        for (int i2 = 0; i2 != copyOnWriteArrayList2.size(); i2++) {
            copyOnWriteArrayList2.get(i2).startEncoding();
        }
    }

    @Override // xsna.uq10
    public final boolean z0() {
        return this.k;
    }

    public lbm0(@NonNull zcl0 zcl0Var, @NonNull wlo wloVar, @NonNull fn2 fn2Var, @NonNull MediaUtils.d dVar, String str, boolean z) {
        this.i = zcl0Var;
        this.l = str;
        this.m = z;
        this.h = fn2Var;
        this.k = zcl0Var.o();
        this.a = new llo.b(dVar.a, dVar.b);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            Looper.prepare();
        }
        this.f = new zcl0();
        this.g = new zcl0();
        for (int i = 0; i != zcl0Var.a.size(); i++) {
            nov novVar = zcl0Var.a.get(i);
            if (novVar.getStickerLayerType() < 4) {
                this.f.a(novVar.C0());
            } else if (novVar.getStickerLayerType() > 4) {
                this.g.a(novVar.C0());
            }
        }
        if (myLooper != null && myLooper != Looper.getMainLooper()) {
            myLooper.quitSafely();
        }
        llo.b bVar = this.a;
        bVar.b();
        this.b = new llo(bVar.c);
        wloVar.getClass();
        wlo wloVar2 = new wlo();
        Iterator<slo> it = wloVar.d.iterator();
        while (it.hasNext()) {
            slo next = it.next();
            ArrayList<slo> arrayList = wloVar2.d;
            next.getClass();
            slo sloVar = new slo();
            ppo ppoVar = next.a;
            ppo ppoVar2 = sloVar.a;
            int i2 = ppoVar.b;
            float[] fArr = ppoVar2.a;
            int length = fArr.length;
            if (i2 > length) {
                int i3 = length * 2;
                ppoVar2.a = Arrays.copyOf(fArr, i3 >= i2 ? i3 : i2);
            }
            System.arraycopy(ppoVar.a, 0, ppoVar2.a, 0, ppoVar.b);
            ppoVar2.b = ppoVar.b;
            ppo ppoVar3 = next.b;
            ppo ppoVar4 = sloVar.b;
            int i4 = ppoVar3.b;
            float[] fArr2 = ppoVar4.a;
            int length2 = fArr2.length;
            if (i4 > length2) {
                int i5 = length2 * 2;
                ppoVar4.a = Arrays.copyOf(fArr2, i5 >= i4 ? i5 : i4);
            }
            System.arraycopy(ppoVar3.a, 0, ppoVar4.a, 0, ppoVar3.b);
            ppoVar4.b = ppoVar3.b;
            sloVar.c.set(next.c);
            sloVar.d = next.d;
            arrayList.add(sloVar);
        }
        Iterator<zk8> it2 = wloVar.e.iterator();
        while (it2.hasNext()) {
            wloVar2.e.add(it2.next().a());
        }
        wloVar2.g = wloVar.g;
        wloVar2.h = wloVar.h;
        Bitmap bitmap = wloVar.f;
        if (bitmap != null) {
            wloVar2.f = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        this.d = wloVar2;
        this.j = this.k ? null : a(-1, -1);
    }
}
