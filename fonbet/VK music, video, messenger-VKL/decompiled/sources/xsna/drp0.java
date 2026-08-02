package xsna;

import android.widget.Toast;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class drp0 implements Runnable {
    public final /* synthetic */ com.vk.attachpicker.screen.m b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;

    public /* synthetic */ drp0(com.vk.attachpicker.screen.m mVar, int i, boolean z, float f) {
        this.b = mVar;
        this.c = i;
        this.d = z;
        this.e = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        com.vk.attachpicker.screen.m mVar = this.b;
        int i = this.c;
        try {
            Toast toast = mVar.p;
            if (toast != null) {
                toast.cancel();
            }
            mVar.p = null;
            try {
                str = mVar.d().getResources().getString(i);
            } catch (Exception unused) {
                str = "";
            }
            boolean z = this.d;
            float f = this.e;
            Toast makeText = Toast.makeText(mVar.d(), z ? String.format(str, Long.valueOf(((long) f) / 1000)) : String.format(str, Float.valueOf(f / 1000.0f)), 0);
            mVar.p = makeText;
            makeText.show();
        } catch (Throwable unused2) {
        }
    }
}
