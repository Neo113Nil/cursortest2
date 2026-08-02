package xsna;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: CroppedTrack.java */
/* loaded from: classes13.dex */
public final class rik extends ci {
    public uep0 e;
    public int f;
    public int g;

    @Override // xsna.uep0
    public final synchronized long[] B3() {
        try {
            if (this.e.B3() == null) {
                return null;
            }
            long[] B3 = this.e.B3();
            int length = B3.length;
            int i = 0;
            while (i < B3.length && B3[i] < this.f) {
                i++;
            }
            while (length > 0 && this.g < B3[length - 1]) {
                length--;
            }
            int i2 = length - i;
            long[] jArr = new long[i2];
            System.arraycopy(this.e.B3(), i, jArr, 0, i2);
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = jArr[i3] - this.f;
            }
            return jArr;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.uep0
    public final SubSampleInformationBox E3() {
        return this.e.E3();
    }

    @Override // xsna.uep0
    public final List<f0h0> K() {
        return this.e.K().subList(this.f, this.g);
    }

    @Override // xsna.uep0
    public final ArrayList M() {
        CompositionTimeToSample.a aVar;
        int i;
        long j;
        ArrayList M = this.e.M();
        long j2 = this.f;
        long j3 = this.g;
        if (M == null || M.isEmpty()) {
            return null;
        }
        ListIterator listIterator = M.listIterator();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        while (true) {
            aVar = (CompositionTimeToSample.a) listIterator.next();
            int i2 = aVar.a;
            i = aVar.b;
            j = i2 + j4;
            if (j > j2) {
                break;
            }
            j4 = j;
        }
        if (j >= j3) {
            arrayList.add(new CompositionTimeToSample.a((int) (j3 - j2), i));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.a((int) (j - j2), i));
        int i3 = aVar.a;
        while (true) {
            j4 += i3;
            if (!listIterator.hasNext()) {
                break;
            }
            aVar = (CompositionTimeToSample.a) listIterator.next();
            if (aVar.a + j4 >= j3) {
                break;
            }
            arrayList.add(aVar);
            i3 = aVar.a;
        }
        arrayList.add(new CompositionTimeToSample.a((int) (j3 - j4), aVar.b));
        return arrayList;
    }

    @Override // xsna.uep0
    public final synchronized long[] Q3() {
        long[] jArr;
        int i = this.g - this.f;
        jArr = new long[i];
        System.arraycopy(this.e.Q3(), this.f, jArr, 0, i);
        return jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // xsna.uep0
    public final String getHandler() {
        return this.e.getHandler();
    }

    @Override // xsna.uep0
    public final SampleDescriptionBox getSampleDescriptionBox() {
        return this.e.getSampleDescriptionBox();
    }

    @Override // xsna.uep0
    public final hgp0 i3() {
        return this.e.i3();
    }

    @Override // xsna.uep0
    public final List<SampleDependencyTypeBox.a> r2() {
        uep0 uep0Var = this.e;
        if (uep0Var.r2() == null || uep0Var.r2().isEmpty()) {
            return null;
        }
        return uep0Var.r2().subList(this.f, this.g);
    }
}
