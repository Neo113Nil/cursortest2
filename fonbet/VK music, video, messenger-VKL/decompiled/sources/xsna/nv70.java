package xsna;

import android.opengl.Matrix;
import android.os.LocaleList;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import xsna.dz9;

/* compiled from: OffscreenBuffer.java */
/* loaded from: classes3.dex */
public final class nv70 implements ouf0 {
    public Object b;
    public Object c;
    public final Object d;

    public /* synthetic */ nv70(a401 a401Var, String str, lvf0 lvf0Var) {
        this.b = a401Var;
        this.c = str;
        this.d = lvf0Var;
    }

    @Nullable
    public static nv70 a(nv70 nv70Var, int i, int i2) {
        if (nv70Var != null) {
            FrameBuffer frameBuffer = (FrameBuffer) nv70Var.c;
            if (i != frameBuffer.getWidth() || i2 != frameBuffer.getHeight()) {
                frameBuffer.release();
                ((SimpleGLProgram) nv70Var.d).release();
                nv70Var = null;
            }
        }
        return (nv70Var != null || i <= 0 || i2 <= 0) ? nv70Var : new nv70(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        a401 a401Var = (a401) this.b;
        String str = (String) this.c;
        dz9.d dVar = (dz9.d) this.d;
        ms01 ms01Var = (ms01) obj;
        exc0.k("Not active connection", a401Var.v != 1);
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        Parcel zza2 = nwz0Var.zza();
        zza2.writeString(str);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(12, zza2);
        if (dVar != null) {
            nwz0 nwz0Var2 = (nwz0) ms01Var.getService();
            Parcel zza3 = nwz0Var2.zza();
            zza3.writeString(str);
            com.google.android.gms.internal.cast.zzc.zzc(zza3, zza);
            nwz0Var2.zzd(11, zza3);
        }
        taskCompletionSource.setResult(null);
    }

    public lwz b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((xa4) this.d)) {
            try {
                lwz lwzVar = (lwz) this.c;
                if (lwzVar != null && localeList == ((LocaleList) this.b)) {
                    return lwzVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new kwz(localeList.get(i)));
                }
                lwz lwzVar2 = new lwz(arrayList);
                this.b = localeList;
                this.c = lwzVar2;
                return lwzVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        float[] fArr = (float[]) this.b;
        SimpleGLProgram simpleGLProgram = (SimpleGLProgram) this.d;
        simpleGLProgram.setTextureId(((FrameBuffer) this.c).getTextureId());
        simpleGLProgram.setMVPMat(fArr);
        simpleGLProgram.setTexMat(fArr);
        simpleGLProgram.render();
    }

    public nv70(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        float[] fArr = new float[16];
        this.b = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.c = new FrameBuffer(i, i2);
        this.d = new SimpleGLProgram();
    }

    public nv70() {
        this.d = new xa4(25);
    }
}
