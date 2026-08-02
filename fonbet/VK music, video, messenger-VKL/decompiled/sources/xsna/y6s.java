package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FooterPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class y6s extends de {
    public static final int c = cn70.b(56);
    public static final int d = cn70.b(24);
    public static final int e = cn70.b(20);
    public static final int f = 3;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new pr1(21));

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b0(u1c0 u1c0Var) {
        int size;
        c6z Q = di60.Q(u1c0Var.a);
        if (Q != null) {
            o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
            if (o2f0Var != null) {
                ReactionSet s4 = o2f0Var.s4();
                if (s4 != null) {
                    ArrayList<ReactionMeta> arrayList = s4.c;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ReactionAsset d2 = ((ReactionMeta) it.next()).d();
                            String str = d2 != null ? d2.b : null;
                            if (str != null && str.length() != 0) {
                                break;
                            }
                        }
                    }
                }
                ReactionSet s42 = o2f0Var.s4();
                if (s42 != null) {
                    size = s42.c.size();
                    ArrayList<ReactionMeta> v8 = !((Boolean) this.b.getValue()).booleanValue() ? o2f0Var.v8() : o2f0Var.O8(f);
                    return (v8 != null ? v8.size() : 0) + 1 + size;
                }
                size = 0;
                if (!((Boolean) this.b.getValue()).booleanValue()) {
                }
                return (v8 != null ? v8.size() : 0) + 1 + size;
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ReactionMeta reactionMeta;
        ReactionAsset d2;
        Image image;
        ImageSize Ab;
        c6z Q = di60.Q(u1c0Var.a);
        if (Q != null) {
            o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
            if (o2f0Var != null) {
                ?? r1 = this.b;
                ArrayList<ReactionMeta> v8 = ((Boolean) r1.getValue()).booleanValue() ? o2f0Var.v8() : o2f0Var.O8(f);
                int size = v8 != null ? v8.size() : 0;
                if (i == 0) {
                    ReactionMeta p4 = ((Boolean) r1.getValue()).booleanValue() ? o2f0Var.p4() : o2f0Var.c8();
                    if (p4 != null) {
                        return p4.e(d);
                    }
                } else {
                    if (i > 0 && i < size + 1) {
                        if (v8 == null || (reactionMeta = (ReactionMeta) j5g.b0(i - 1, v8)) == null || (d2 = reactionMeta.d()) == null || (image = d2.c) == null || (Ab = image.Ab(e, false)) == null) {
                            return null;
                        }
                        return Ab.d.d;
                    }
                    ReactionSet s4 = o2f0Var.s4();
                    if (s4 != null) {
                        ReactionMeta reactionMeta2 = (ReactionMeta) j5g.b0(i - (size + 1), s4.c);
                        if (reactionMeta2 != null) {
                            return reactionMeta2.e(c);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // xsna.de
    public final String g0(u1c0 u1c0Var, int i) {
        ReactionSet s4;
        ReactionMeta reactionMeta;
        ReactionAsset d2;
        c6z Q = di60.Q(u1c0Var.a);
        if (Q != null) {
            o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
            if (o2f0Var != null && (s4 = o2f0Var.s4()) != null && (reactionMeta = (ReactionMeta) j5g.b0(i, s4.c)) != null && (d2 = reactionMeta.d()) != null) {
                return d2.b;
            }
        }
        return null;
    }

    @Override // xsna.de
    public final int h0(u1c0 u1c0Var) {
        ReactionSet s4;
        ArrayList<ReactionMeta> arrayList;
        c6z Q = di60.Q(u1c0Var.a);
        if (Q == null) {
            return 0;
        }
        o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
        if (o2f0Var == null || (s4 = o2f0Var.s4()) == null || (arrayList = s4.c) == null) {
            return 0;
        }
        return arrayList.size();
    }
}
