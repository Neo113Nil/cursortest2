package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ScreenTopPlayStrategy.kt */
/* loaded from: classes2.dex */
public final class ddh0 implements db80 {
    public final float a;
    public final float b;
    public final vy80 c;

    public ddh0(int i) {
        vy80 vy80Var = tev.a;
        float f = (i & 1) != 0 ? 1.0f : 0.7f;
        float f2 = (i & 2) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.7f;
        vy80Var = (i & 4) != 0 ? uor0.a : vy80Var;
        this.a = f;
        this.b = f2;
        this.c = vy80Var;
    }

    @Override // xsna.db80
    public final int a(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2 + i;
        if (i <= i3) {
            int i4 = i;
            while (true) {
                Object findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i4) : null;
                ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                dnt0 q3 = ent0Var != null ? ent0Var.q3() : null;
                if (q3 != null && q3.getVideoFocused()) {
                    return i4;
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0032, code lost:
    
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f0, code lost:
    
        if (r11 < r15) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0032 A[EDGE_INSN: B:104:0x0032->B:105:0x0032 BREAK  A[LOOP:0: B:9:0x002b->B:36:0x0100], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    @Override // xsna.db80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xh5 b(ai5 ai5Var, int i, int i2) {
        RecyclerView recyclerView;
        int i3;
        VideoAutoPlay videoAutoPlay;
        yg5 yg5Var;
        yg5 yg5Var2;
        View view;
        Pair pair;
        RecyclerView.e0 d;
        ai5 ai5Var2 = ai5Var;
        if (ai5Var2 == null || (recyclerView = ai5Var2.getRecyclerView()) == null) {
            return null;
        }
        int i4 = i + i2;
        vy80 vy80Var = this.c;
        boolean c = vy80Var.c(recyclerView);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = c ? i4 : i;
        int i5 = 0;
        float f = 0.0f;
        Pair pair2 = null;
        int i6 = 0;
        while (true) {
            if (c) {
                if (ref$IntRef.element < i) {
                    break;
                }
                if (i >= 0) {
                    break;
                }
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(ref$IntRef.element - ai5Var2.getAdapterOffset());
                if (findViewHolderForAdapterPosition != 0) {
                    i5++;
                }
                boolean z = findViewHolderForAdapterPosition instanceof ent0;
                ent0 ent0Var = z ? (ent0) findViewHolderForAdapterPosition : null;
                xh5 b = ent0Var != null ? x5t0.b(ent0Var) : null;
                i3 = 1;
                y9t0 Eh = ai5Var2.Eh(ref$IntRef.element);
                if (b == null || (yg5Var = b.a) == null) {
                    if (Eh == null || (yg5Var2 = Eh.a) == null) {
                        yg5Var = null;
                    } else {
                        ni5 ni5Var = Eh.b;
                        yg5.o0(yg5Var2, ni5Var.a, ni5Var.b, ni5Var.c, false, 8);
                        yg5Var = yg5Var2;
                    }
                }
                ent0 ent0Var2 = z ? (ent0) findViewHolderForAdapterPosition : null;
                if ((ent0Var2 != null ? x5t0.c(ent0Var2) : null) != null || b != null) {
                    int b2 = vy80Var.b(recyclerView, findViewHolderForAdapterPosition.itemView);
                    if (b == null || (d = b.d()) == null || (view = d.itemView) == null) {
                        view = findViewHolderForAdapterPosition.itemView;
                    }
                    float a = vy80Var.a(view);
                    if (b2 >= 0) {
                        RecyclerView.e0 e0Var = findViewHolderForAdapterPosition;
                        RecyclerView.e0 e0Var2 = findViewHolderForAdapterPosition;
                        if (yg5Var instanceof VideoAutoPlay) {
                            if (b != null) {
                                RecyclerView.e0 d2 = b.d();
                                e0Var = findViewHolderForAdapterPosition;
                                if (d2 != null) {
                                    e0Var = d2;
                                }
                            }
                            pair = new Pair(yg5Var, e0Var);
                        } else {
                            if (b != null) {
                                RecyclerView.e0 d3 = b.d();
                                e0Var2 = findViewHolderForAdapterPosition;
                                if (d3 != null) {
                                    e0Var2 = d3;
                                }
                            }
                            pair = new Pair(null, e0Var2);
                        }
                        i6++;
                        if (pair2 == null) {
                            if (a >= this.a) {
                                pair2 = pair;
                                f = a;
                                break;
                            }
                        }
                        pair2 = pair;
                        f = a;
                    }
                }
                int i7 = ref$IntRef.element;
                ref$IntRef.element = c ? i7 - 1 : i7 + 1;
                ai5Var2 = ai5Var;
            } else {
                if (ref$IntRef.element > i4) {
                    break;
                }
                if (i >= 0) {
                }
            }
        }
        if (pair2 == null) {
            return null;
        }
        if (f < this.b && i6 != i5 && (videoAutoPlay = (VideoAutoPlay) pair2.i()) != null && i6 == i3 && !videoAutoPlay.isPlaying()) {
            return null;
        }
        VideoAutoPlay videoAutoPlay2 = (VideoAutoPlay) pair2.d();
        RecyclerView.e0 e0Var3 = (RecyclerView.e0) pair2.g();
        ent0 ent0Var3 = e0Var3 instanceof ent0 ? (ent0) e0Var3 : null;
        mnt0 c2 = ent0Var3 != null ? x5t0.c(ent0Var3) : null;
        if (c2 != null) {
            mnt0 mnt0Var = c2;
            return new xh5(videoAutoPlay2, mnt0Var.getVideoConfig(), mnt0Var.mo407getVideoView(), e0Var3, null);
        }
        if (ent0Var3 != null) {
            return x5t0.b(ent0Var3);
        }
        return null;
    }
}
