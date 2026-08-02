package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import java.io.IOException;

/* compiled from: RawOverlayFilter.kt */
/* loaded from: classes12.dex */
public class oye0 extends iye0 {
    public final Context u;
    public final String v;
    public final m900<String, Bitmap> w;
    public int x;
    public int y;

    public oye0(Context context, String str, String str2, m900<String, Bitmap> m900Var) {
        super(str);
        this.u = context;
        this.v = str2;
        this.w = m900Var;
        this.x = -1;
        this.y = -1;
    }

    @Override // xsna.kax, xsna.e0u
    public final boolean equals(Object obj) {
        return super.equals(obj) && epx.f(this.v, ((oye0) obj).v);
    }

    @Override // xsna.kax, xsna.e0u
    public final int hashCode() {
        return this.v.hashCode() + (super.hashCode() * 31);
    }

    @Override // xsna.iye0, xsna.kax, xsna.e0u, xsna.umv
    public final void init() {
        super.init();
        int f = f("oTexture");
        this.y = f;
        if (f != -1) {
            Context context = this.u;
            m900<String, Bitmap> m900Var = this.w;
            String str = this.v;
            Bitmap bitmap = m900Var.get(str);
            if (bitmap == null) {
                bitmap = null;
                try {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open(str), null, j());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bitmap != null) {
                    m900Var.put(str, bitmap);
                }
            }
            if (bitmap != null) {
                this.x = nap.g(-1, bitmap);
            }
        }
    }

    public BitmapFactory.Options j() {
        return null;
    }

    @Override // xsna.iye0, xsna.kax, xsna.e0u, xsna.umv
    public final void onDraw() {
        super.onDraw();
        if (this.y != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.x);
            GLES20.glUniform1i(this.y, 3);
        }
    }

    @Override // xsna.iye0, xsna.kax, xsna.e0u, xsna.umv
    public final void release() {
        super.release();
        GLES20.glDeleteTextures(1, new int[]{this.x}, 0);
        this.x = -1;
    }
}
