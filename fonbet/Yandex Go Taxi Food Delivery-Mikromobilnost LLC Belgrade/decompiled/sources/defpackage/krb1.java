package defpackage;

import android.graphics.Outline;
import android.view.View;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.ybsdk.core.utils.ui.core.CoreOutlineProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes11.dex */
public abstract class krb1 {
    public static void a(InputStream inputStream, File file) {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        CommonUtils.c(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.c(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final String b(vsy0 vsy0Var, fid fidVar) {
        if (vsy0Var instanceof tsy0) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(-1555689730);
            String e = ohb1.e(btsVar, ((tsy0) vsy0Var).a);
            btsVar.t(false);
            return e;
        }
        if (!(vsy0Var instanceof usy0)) {
            throw unr0.y(-1555691538, (bts) fidVar, false);
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1555687574);
        btsVar2.t(false);
        return ((usy0) vsy0Var).a;
    }

    public static final String c(vsy0 vsy0Var, tls tlsVar) {
        if (vsy0Var instanceof tsy0) {
            return (String) tlsVar.invoke(Integer.valueOf(((tsy0) vsy0Var).a));
        }
        if (vsy0Var instanceof usy0) {
            return ((usy0) vsy0Var).a;
        }
        w511.b();
        return null;
    }

    public static void d(File file, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i450 i450Var = (i450) it.next();
            InputStream inputStream = null;
            try {
                inputStream = i450Var.getStream();
                if (inputStream != null) {
                    a(inputStream, new File(file, i450Var.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.c(null);
                throw th;
            }
            CommonUtils.c(inputStream);
        }
    }

    public static final void e(int i, final int i2, View view) {
        view.setBackgroundColor(i);
        float f = i2;
        final float[] fArr = {f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        view.setOutlineProvider(new CoreOutlineProvider(fArr) { // from class: com.ybsdk.core.design.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                int width = view2.getWidth();
                int height = view2.getHeight();
                int i3 = i2;
                outline.setRoundRect(0, 0, width, height + i3, i3);
            }
        });
        view.setClipToOutline(true);
    }
}
