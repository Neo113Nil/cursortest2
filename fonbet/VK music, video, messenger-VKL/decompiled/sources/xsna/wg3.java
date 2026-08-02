package xsna;

import android.graphics.Bitmap;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.fi3;
import xsna.gh3;
import xsna.hfr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wg3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wg3(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        long j;
        Object obj2;
        boolean z;
        switch (this.b) {
            case 0:
                zg3 zg3Var = (zg3) this.d;
                hh3 hh3Var = (hh3) obj;
                List<fi3> list = hh3Var.a;
                hfr.a aVar = new hfr.a(rli0.j(new i5g(list), yg3.b));
                while (true) {
                    boolean hasNext = aVar.hasNext();
                    j = this.c;
                    if (hasNext) {
                        obj2 = aVar.next();
                        if (((fi3.b) obj2).b == j) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                fi3.b bVar = (fi3.b) obj2;
                if (bVar == null) {
                    return hh3Var;
                }
                int indexOf = list.indexOf(bVar);
                boolean z2 = bVar.f;
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(indexOf, new fi3.b(bVar.b, bVar.c, bVar.d, bVar.e, !z2));
                Set R0 = j5g.R0(hh3Var.b);
                if (z2) {
                    R0.remove(Long.valueOf(j));
                } else {
                    R0.add(Long.valueOf(j));
                }
                zg3Var.n(!z2 ? new gh3.b() : new gh3.c());
                return new hh3(R0, arrayList);
            case 1:
                tr8 tr8Var = (tr8) this.d;
                int a = ((bwn) tr8Var.F.getValue()).a((Bitmap) obj);
                Integer valueOf = Integer.valueOf(a);
                if (a == -1) {
                    valueOf = null;
                }
                tr8Var.E.a(this.c, valueOf);
                return s3q0.a;
            case 2:
                lwo0 lwo0Var = (lwo0) this.d;
                AudioFragmentItem audioFragmentItem = (AudioFragmentItem) obj;
                long j2 = audioFragmentItem.c;
                long j3 = this.c;
                if (j2 > j3) {
                    f100 f100Var = (f100) lwo0Var.a;
                    if (f100Var != null) {
                        f100Var.e("TimelineBuilder", "audio item's offset within timeline is higher than timeline's end mcs=" + j3 + ", item=" + audioFragmentItem);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                oio.C1((oio) obj, this.c, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.d() >> 32)) * ((Number) ((mtk0) this.d).getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.d() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.d() & 4294967295L)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.d() & 4294967295L)) / 2.0f) & 4294967295L), null, 242);
                return s3q0.a;
        }
    }

    public /* synthetic */ wg3(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }
}
