package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.ArrayList;
import yads.d43;
import yads.fs1;
import yads.gn0;

/* loaded from: classes7.dex */
public final class ks71 {
    public final Context a;
    public boolean c;
    public final es81 b = new es81();
    public final quz d = quz.w;

    public ks71(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gy61[] a(Handler handler, gn0 gn0Var, gn0 gn0Var2, gn0 gn0Var3, gn0 gn0Var4) {
        b981 b981Var;
        ArrayList arrayList = new ArrayList();
        boolean z = this.c;
        es81 es81Var = this.b;
        Context context = this.a;
        quz quzVar = this.d;
        arrayList.add(new yl81(context, es81Var, quzVar, z, handler, gn0Var));
        oo81 oo81Var = new oo81();
        b981 b981Var2 = b981.c;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context2 = this.a;
        Intent registerReceiver = context2.registerReceiver(null, intentFilter);
        int i = rf71.a;
        if (i >= 17) {
            byte[] decode = Base64.decode("QW1hem9u", 0);
            Charset charset = uza.a;
            String str = new String(decode, charset);
            String str2 = rf71.c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context2.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                b981Var = b981.d;
                b981Var.getClass();
                oo81Var.a = b981Var;
                if (oo81Var.b == null) {
                    oo81Var.b = new vi71(new lv81[0]);
                }
                n671 n671Var = new n671(oo81Var);
                boolean z2 = this.c;
                arrayList.add(new u191(this.a, this.b, quzVar, z2, handler, gn0Var2, n671Var));
                arrayList.add(new d43(gn0Var3, handler.getLooper()));
                arrayList.add(new fs1(gn0Var4, handler.getLooper()));
                arrayList.add(new id81());
                return (gy61[]) arrayList.toArray(new gy61[0]);
            }
        }
        if (i >= 29 && (rf71.y(context2) || (i >= 23 && context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            b981Var = new b981(8, p581.b());
        } else if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            b981Var = b981.c;
        } else {
            b981Var = new b981(registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"));
        }
        b981Var.getClass();
        oo81Var.a = b981Var;
        if (oo81Var.b == null) {
        }
        n671 n671Var2 = new n671(oo81Var);
        boolean z22 = this.c;
        arrayList.add(new u191(this.a, this.b, quzVar, z22, handler, gn0Var2, n671Var2));
        arrayList.add(new d43(gn0Var3, handler.getLooper()));
        arrayList.add(new fs1(gn0Var4, handler.getLooper()));
        arrayList.add(new id81());
        return (gy61[]) arrayList.toArray(new gy61[0]);
    }
}
