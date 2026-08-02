package xsna;

import android.graphics.Bitmap;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: StickerPipetteDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class w5l0 implements s5l0 {
    public final u76 a;
    public final StickersDrawingViewGroup b;
    public final l7s c;
    public Integer d;
    public Integer e;

    public w5l0(u76 u76Var, StickersDrawingViewGroup stickersDrawingViewGroup, l7s l7sVar) {
        this.a = u76Var;
        this.b = stickersDrawingViewGroup;
        this.c = l7sVar;
    }

    @Override // xsna.s5l0
    public final void a(Integer num, Integer num2) {
        this.d = num;
        this.e = num2;
    }

    @Override // xsna.s5l0
    public final Bitmap b(int i, int i2, Bitmap bitmap) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
            bitmap.recycle();
            bitmap = createScaledBitmap;
        }
        Bitmap h = kd7.h(this.c, bitmap, iz8.j);
        bitmap.recycle();
        return h;
    }

    @Override // xsna.s5l0
    public final void c(final int i, final boolean z, gzs<s3q0> gzsVar, izs<? super Bitmap, s3q0> izsVar) {
        final Integer num = this.d;
        final Integer num2 = this.e;
        final tam0 O2 = this.a.O2();
        if (O2 == null || num == null || num2 == null) {
            gzsVar.invoke();
            return;
        }
        grt0 j = this.b.getStickersState().j();
        if (j != null) {
            SimpleVideoView simpleVideoView = j.r;
            String str = kd7.a;
            Bitmap bitmap = null;
            if (simpleVideoView != null) {
                try {
                    bitmap = simpleVideoView.getBitmap();
                } catch (Throwable unused) {
                    lht.a.a();
                    try {
                        bitmap = simpleVideoView.getBitmap();
                    } catch (Throwable unused2) {
                    }
                }
            }
            j.p = bitmap;
        }
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.t5l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer num3 = num;
                int intValue = num3.intValue();
                Integer num4 = num2;
                MediaUtils.d dVar = new MediaUtils.d(intValue, num4.intValue());
                zg7 zg7Var = new zg7(dVar, 11);
                w5l0 w5l0Var = this;
                StickersDrawingViewGroup stickersDrawingViewGroup = w5l0Var.b;
                nov novVar = null;
                vpa0 vpa0Var = new vpa0(zg7Var, new u5l0(0, stickersDrawingViewGroup, StickersDrawingViewGroup.class, "getAnimationChoreographer", "getAnimationChoreographer()Lcom/vk/stickers/drawing/AnimationChoreographer;", 0), new v5l0(0, stickersDrawingViewGroup, StickersDrawingViewGroup.class, "isFullStateDefault", "isFullStateDefault()Z", 0), null);
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = stickersDrawingViewGroup.q.a;
                int i2 = 0;
                while (true) {
                    if (i2 == copyOnWriteArrayList.size()) {
                        break;
                    }
                    if (copyOnWriteArrayList.get(i2).z0()) {
                        novVar = copyOnWriteArrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                Triple d = mny.d(vpa0Var, O2, novVar != null, dVar, z, false, 16);
                Pair pair = new Pair((List) d.d(), (MediaUtils.d) d.g());
                List list = (List) pair.d();
                MediaUtils.d dVar2 = (MediaUtils.d) pair.g();
                com.vk.stories.b.a.getClass();
                return w5l0Var.b(num3.intValue(), num4.intValue(), com.vk.stories.b.c(list, dVar2, i, 1));
            }
        });
        asu0 asu0Var = asu0.a;
        ver0.c(this.c, s0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new t520(new p0(izsVar, 7), 19), new p350(new pre(1, gzsVar), 15)));
    }
}
