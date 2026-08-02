package xsna;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: AudioGraph.java */
/* loaded from: classes12.dex */
public final class lp4 {
    public final ArrayList a = new ArrayList();
    public final androidx.media3.transformer.h b;
    public final androidx.media3.common.audio.b c;
    public AudioProcessor.a d;
    public boolean e;
    public boolean f;
    public ByteBuffer g;
    public int h;

    /* compiled from: AudioGraph.java */
    public static final class a {
        public final mp4 a;
        public int b = -1;

        public a(mp4 mp4Var) {
            this.a = mp4Var;
        }
    }

    public lp4(ar4 ar4Var, com.google.common.collect.g gVar) {
        ((h.a) ar4Var).getClass();
        this.b = new androidx.media3.transformer.h();
        this.d = AudioProcessor.a.e;
        this.g = AudioProcessor.a;
        this.c = new androidx.media3.common.audio.b(gVar);
    }

    public final ByteBuffer a() throws ExportException {
        boolean z;
        ByteBuffer byteBuffer;
        ArrayList arrayList = this.a;
        androidx.media3.transformer.h hVar = this.b;
        if (this.f) {
            z = true;
        } else {
            if (!this.e) {
                try {
                    hVar.d(this.d);
                    this.e = true;
                } catch (AudioProcessor.UnhandledAudioFormatException e) {
                    throw ExportException.b(e, "Error while configuring mixer");
                }
            }
            this.f = true;
            for (int i = 0; i < arrayList.size(); i++) {
                a aVar = (a) arrayList.get(i);
                if (aVar.b == -1) {
                    mp4 mp4Var = aVar.a;
                    try {
                        mp4Var.l();
                        long j = mp4Var.e.get();
                        if (j == C.TIME_UNSET) {
                            this.f = false;
                        } else if (j != Long.MIN_VALUE) {
                            aVar.b = hVar.a(mp4Var.a, j);
                        }
                    } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                        throw ExportException.b(e2, "Unhandled format while adding source " + aVar.b);
                    }
                }
            }
            z = this.f;
        }
        if (!z) {
            return AudioProcessor.a;
        }
        if (!this.b.e()) {
            ArrayList arrayList2 = this.a;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                a aVar2 = (a) arrayList2.get(i2);
                int i3 = aVar2.b;
                androidx.media3.transformer.h hVar2 = this.b;
                hVar2.c();
                if (y2r0.l(hVar2.a, i3)) {
                    mp4 mp4Var2 = aVar2.a;
                    if (!mp4Var2.m() && mp4Var2.d.isEmpty() && (mp4Var2.l == C.TIME_UNSET ? mp4Var2.j || mp4Var2.k : mp4Var2.o && (mp4Var2.j || mp4Var2.k))) {
                        hVar2.c();
                        long j2 = hVar2.j;
                        SparseArray<h.c> sparseArray = hVar2.a;
                        fxc0.A(y2r0.l(sparseArray, i3), "Source not found.");
                        hVar2.j = Math.max(j2, sparseArray.get(i3).a);
                        hVar2.a.delete(i3);
                        aVar2.b = -1;
                        this.h++;
                    } else {
                        try {
                            hVar2.f(i3, mp4Var2.l());
                        } catch (AudioProcessor.UnhandledAudioFormatException e3) {
                            throw ExportException.b(e3, "AudioGraphInput (sourceId=" + i3 + ") reconfiguration");
                        }
                    }
                }
            }
        }
        if (!this.g.hasRemaining()) {
            androidx.media3.transformer.h hVar3 = this.b;
            hVar3.c();
            if (hVar3.e()) {
                byteBuffer = AudioProcessor.a;
            } else {
                long j3 = hVar3.i;
                if (hVar3.a.size() == 0) {
                    j3 = Math.min(j3, hVar3.j);
                }
                for (int i4 = 0; i4 < hVar3.a.size(); i4++) {
                    j3 = Math.min(j3, hVar3.a.valueAt(i4).a);
                }
                if (j3 <= hVar3.h) {
                    byteBuffer = AudioProcessor.a;
                } else {
                    h.b bVar = hVar3.e[0];
                    long min = Math.min(j3, bVar.c);
                    ByteBuffer duplicate = bVar.a.duplicate();
                    duplicate.position(((int) (hVar3.h - bVar.b)) * hVar3.c.d).limit(((int) (min - bVar.b)) * hVar3.c.d);
                    ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
                    if (min == bVar.c) {
                        h.b[] bVarArr = hVar3.e;
                        h.b bVar2 = bVarArr[1];
                        bVarArr[0] = bVar2;
                        bVarArr[1] = hVar3.b(bVar2.c);
                    }
                    hVar3.h = min;
                    hVar3.g = Math.min(hVar3.i, min + hVar3.d);
                    order.remaining();
                    LinkedHashMap linkedHashMap = a7l.a;
                    synchronized (a7l.class) {
                    }
                    byteBuffer = order;
                }
            }
            this.g = byteBuffer;
        }
        if (!this.c.f()) {
            return this.g;
        }
        androidx.media3.common.audio.b bVar3 = this.c;
        if (b()) {
            bVar3.h();
        } else {
            bVar3.i(this.g);
        }
        return this.c.d();
    }

    public final boolean b() {
        return !this.g.hasRemaining() && this.h >= this.a.size() && this.b.e();
    }

    public final mp4 c(androidx.media3.transformer.m mVar, androidx.media3.common.a aVar) throws ExportException {
        fxc0.p(aVar.H != -1);
        try {
            mp4 mp4Var = new mp4(this.d, mVar, aVar);
            if (Objects.equals(this.d, AudioProcessor.a.e)) {
                AudioProcessor.a aVar2 = mp4Var.a;
                this.d = aVar2;
                this.c.a(aVar2);
                this.c.b(new AudioProcessor.b(0L));
            }
            this.a.add(new a(mp4Var));
            LinkedHashMap linkedHashMap = a7l.a;
            synchronized (a7l.class) {
            }
            return mp4Var;
        } catch (AudioProcessor.UnhandledAudioFormatException e) {
            throw ExportException.b(e, "Error while registering input " + this.a.size());
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                arrayList.clear();
                androidx.media3.transformer.h hVar = this.b;
                hVar.a.clear();
                hVar.b = 0;
                AudioProcessor.a aVar = AudioProcessor.a.e;
                hVar.c = aVar;
                hVar.d = -1;
                hVar.e = new h.b[0];
                hVar.f = C.TIME_UNSET;
                hVar.g = -1L;
                hVar.h = 0L;
                hVar.i = Long.MAX_VALUE;
                hVar.j = 0L;
                this.c.j();
                this.h = 0;
                this.g = AudioProcessor.a;
                this.d = aVar;
                return;
            }
            ((a) arrayList.get(i)).a.h.j();
            i++;
        }
    }
}
