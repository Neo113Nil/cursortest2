package sg.bigo.ads.aq;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

@TargetApi(17)
/* loaded from: classes9.dex */
public final class b implements a {
    private final Context a;
    private RenderScript b;
    private ScriptIntrinsicBlur c;
    private Allocation d;
    private Allocation e;

    public b(Context context) {
        this.a = context;
    }

    private boolean b() {
        return (this.b == null || this.c == null) ? false : true;
    }

    @Override // sg.bigo.ads.aq.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.c = null;
        }
        RenderScript renderScript = this.b;
        if (renderScript != null) {
            renderScript.destroy();
            this.b = null;
        }
        Allocation allocation = this.d;
        if (allocation != null) {
            allocation.destroy();
            this.d = null;
        }
        Allocation allocation2 = this.e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.e = null;
        }
    }

    @Override // sg.bigo.ads.aq.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.d == null) {
                this.d = Allocation.createFromBitmap(this.b, bitmap);
            }
            if (this.e == null) {
                this.e = Allocation.createFromBitmap(this.b, bitmap2);
            }
            this.d.copyFrom(bitmap);
            this.c.setInput(this.d);
            this.c.forEach(this.e);
            this.e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f) {
        if (!b()) {
            try {
                RenderScript create = RenderScript.create(this.a);
                this.b = create;
                this.c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.c.setRadius(f);
        return true;
    }

    @Override // sg.bigo.ads.aq.a
    public final boolean a(Bitmap bitmap, float f) {
        if (!a(f)) {
            return false;
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.d = createFromBitmap;
        this.e = Allocation.createTyped(this.b, createFromBitmap.getType());
        return true;
    }
}
